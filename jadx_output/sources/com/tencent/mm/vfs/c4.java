package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class c4 {
    public static java.nio.file.Path a(java.lang.String str) {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get(str, new java.lang.String[0]);
            if (java.nio.file.Files.isDirectory(path, new java.nio.file.LinkOption[0])) {
                return path;
            }
            return null;
        } catch (java.nio.file.InvalidPathException unused) {
            com.tencent.stubs.logger.Log.w("VFS.NativeFileSystem", "Invalid path for list: " + str);
            return null;
        }
    }
}
