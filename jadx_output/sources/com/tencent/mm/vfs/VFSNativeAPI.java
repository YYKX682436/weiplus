package com.tencent.mm.vfs;

/* loaded from: classes7.dex */
final class VFSNativeAPI {
    private VFSNativeAPI() {
    }

    public static int openFd(java.lang.String str, int i17) {
        java.lang.String str2;
        if ((i17 & (-1604)) != 0) {
            throw new java.lang.IllegalArgumentException("Flags unsupported: " + i17);
        }
        int i18 = i17 & 3;
        if (i18 == 0) {
            str2 = "r";
        } else if (i18 == 1) {
            str2 = "w";
        } else {
            if (i18 != 2) {
                throw new java.lang.IllegalArgumentException("Invalid access mode: " + i17);
            }
            str2 = "rw";
        }
        if ((i17 & 512) != 0) {
            str2 = str2.concat("t");
        }
        if ((i17 & 1024) != 0) {
            str2 = str2 + "a";
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                parcelFileDescriptor = com.tencent.mm.vfs.w6.z(com.tencent.mm.vfs.z7.a(str), null, str2);
                if (parcelFileDescriptor != null) {
                    return parcelFileDescriptor.detachFd();
                }
            } catch (java.io.IOException e17) {
                com.tencent.stubs.logger.Log.e("VFS.VFSNativeAPI", e17, "Failed to open file descriptor for file: " + str);
            }
            return -1;
        } finally {
            com.tencent.mm.vfs.e8.d(parcelFileDescriptor);
        }
    }
}
