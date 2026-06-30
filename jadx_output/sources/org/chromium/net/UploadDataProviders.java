package org.chromium.net;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static org.chromium.net.UploadDataProvider create(java.io.File file) {
        return org.chromium.net.apihelpers.UploadDataProviders.create(file);
    }

    public static org.chromium.net.UploadDataProvider create(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return org.chromium.net.apihelpers.UploadDataProviders.create(parcelFileDescriptor);
    }

    public static org.chromium.net.UploadDataProvider create(java.nio.ByteBuffer byteBuffer) {
        return org.chromium.net.apihelpers.UploadDataProviders.create(byteBuffer);
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr, int i17, int i18) {
        return org.chromium.net.apihelpers.UploadDataProviders.create(bArr, i17, i18);
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr) {
        return org.chromium.net.apihelpers.UploadDataProviders.create(bArr);
    }
}
