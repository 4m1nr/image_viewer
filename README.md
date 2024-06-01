***this file is AI Genereted***

---

# Image Viewer

## Description
Image Viewer is a Java-based application designed to provide a simple and efficient way to view and manage image files. This project aims to offer an intuitive user interface for browsing, viewing, and organizing images.

## How It Works
### 1. User Interface
The application uses Java Swing to create a graphical user interface (GUI). The main window is divided into two primary sections:
- **Directory Tree**: Allows users to navigate the file system and select directories containing images.
- **Preview Panel**: Displays thumbnails of images within the selected directory.

### 2. Loading Images
When a directory is selected in the directory tree:
- The application scans the directory for image files.
- Supported image formats (JPEG, PNG, BMP, GIF) are identified using the `javax.imageio` package.
- Thumbnails of these images are generated and displayed in the preview panel.

### 3. Viewing Images
Users can click on a thumbnail to view the image in full size:
- The selected image is loaded into a new window or panel.
- The application uses Java's image processing libraries to efficiently render the image.
- Users can navigate through images using previous and next buttons.

### 4. Image Formats
The Image Viewer supports multiple image formats:
- **JPEG**: Common format with lossy compression.
- **PNG**: Format with lossless compression.
- **BMP**: Uncompressed raster image format.
- **GIF**: Format supporting both static and animated images.

### 5. Error Handling
The application includes robust error handling:
- **Unsupported Formats**: Displays an alert when encountering unsupported image formats.
- **File Access Issues**: Handles file access permissions and missing files gracefully by notifying the user.

### 6. Additional Features (Future Enhancements)
- **Image Editing**: Basic image editing features like rotate,resize.

## Features
- Browse images in a directory using a directory tree.
- View images in full size by clicking on thumbnails.
- Supports multiple image formats (JPEG, PNG, BMP, GIF).
- User-friendly GUI with easy navigation.

## Installation
1. **Clone the Repository**:
    ```bash
    git clone https://github.com/4m1nr/image_viewer.git
    ```
2. **Navigate to the Project Directory**:
    ```bash
    cd image_viewer
    ```
3. **Compile the Java Files**:
    ```bash
    javac -d bin src/*.java
    ```
4. **Run the Application**:
    ```bash
    java -cp bin Main
    ```

## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.
