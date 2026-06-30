package org.chromium.net;

/* loaded from: classes7.dex */
public class MimeTypeFilter implements java.io.FileFilter {
    private boolean mAcceptAllMimeTypes;
    private boolean mAcceptDirectory;
    private android.webkit.MimeTypeMap mMimeTypeMap;
    private java.util.HashSet<java.lang.String> mExtensions = new java.util.HashSet<>();
    private java.util.HashSet<java.lang.String> mMimeTypes = new java.util.HashSet<>();
    private java.util.HashSet<java.lang.String> mMimeSupertypes = new java.util.HashSet<>();

    public MimeTypeFilter(java.util.List<java.lang.String> list, boolean z17) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String lowerCase = it.next().trim().toLowerCase(java.util.Locale.US);
            if (lowerCase.startsWith(".")) {
                this.mExtensions.add(lowerCase.substring(1));
            } else if (lowerCase.equals("*/*")) {
                this.mAcceptAllMimeTypes = true;
            } else if (lowerCase.endsWith("/*")) {
                this.mMimeSupertypes.add(lowerCase.substring(0, lowerCase.length() - 2));
            } else if (lowerCase.contains("/")) {
                this.mMimeTypes.add(lowerCase);
            }
        }
        this.mMimeTypeMap = android.webkit.MimeTypeMap.getSingleton();
        this.mAcceptDirectory = z17;
    }

    private static java.lang.String getMimeSupertype(java.lang.String str) {
        return str.split("/", 2)[0];
    }

    private java.lang.String getMimeTypeFromExtension(java.lang.String str) {
        java.lang.String mimeTypeFromExtension = this.mMimeTypeMap.getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension != null) {
            return mimeTypeFromExtension.toLowerCase(java.util.Locale.US);
        }
        return null;
    }

    public boolean accept(android.net.Uri uri, java.lang.String str) {
        if (uri != null) {
            java.lang.String lowerCase = android.webkit.MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase(java.util.Locale.US);
            if (this.mExtensions.contains(lowerCase)) {
                return true;
            }
            if (str == null) {
                str = getMimeTypeFromExtension(lowerCase);
            }
        }
        if (str != null) {
            return this.mAcceptAllMimeTypes || this.mMimeTypes.contains(str) || this.mMimeSupertypes.contains(getMimeSupertype(str));
        }
        return false;
    }

    @Override // java.io.FileFilter
    public boolean accept(java.io.File file) {
        if (file.isDirectory()) {
            return this.mAcceptDirectory;
        }
        return accept(android.net.Uri.fromFile(file), null);
    }
}
