package org.chromium.net.apihelpers;

/* loaded from: classes13.dex */
public final class UploadDataProviders {

    /* loaded from: classes13.dex */
    public static final class ByteBufferUploadProvider extends org.chromium.net.UploadDataProvider {
        private final java.nio.ByteBuffer mUploadBuffer;

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.mUploadBuffer.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new java.lang.IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.mUploadBuffer.remaining()) {
                byteBuffer.put(this.mUploadBuffer);
            } else {
                int limit = this.mUploadBuffer.limit();
                java.nio.ByteBuffer byteBuffer2 = this.mUploadBuffer;
                byteBuffer.put(this.mUploadBuffer);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
            uploadDataSink.onRewindSucceeded();
        }

        private ByteBufferUploadProvider(java.nio.ByteBuffer byteBuffer) {
            this.mUploadBuffer = byteBuffer;
        }
    }

    /* loaded from: classes13.dex */
    public interface FileChannelProvider {
        java.nio.channels.FileChannel getChannel();
    }

    /* loaded from: classes13.dex */
    public static final class FileUploadProvider extends org.chromium.net.UploadDataProvider {
        private volatile java.nio.channels.FileChannel mChannel;
        private final java.lang.Object mLock;
        private final org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider mProvider;

        private java.nio.channels.FileChannel getChannel() {
            if (this.mChannel == null) {
                synchronized (this.mLock) {
                    if (this.mChannel == null) {
                        this.mChannel = this.mProvider.getChannel();
                    }
                }
            }
            return this.mChannel;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            java.nio.channels.FileChannel fileChannel = this.mChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return getChannel().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new java.lang.IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            java.nio.channels.FileChannel channel = getChannel();
            int i17 = 0;
            while (i17 == 0) {
                int read = channel.read(byteBuffer);
                if (read == -1) {
                    break;
                } else {
                    i17 += read;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
            getChannel().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        private FileUploadProvider(org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider fileChannelProvider) {
            this.mLock = new java.lang.Object();
            this.mProvider = fileChannelProvider;
        }
    }

    private UploadDataProviders() {
    }

    public static org.chromium.net.UploadDataProvider create(final java.io.File file) {
        return new org.chromium.net.apihelpers.UploadDataProviders.FileUploadProvider(new org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider() { // from class: org.chromium.net.apihelpers.UploadDataProviders.1
            @Override // org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider
            public java.nio.channels.FileChannel getChannel() {
                return new java.io.FileInputStream(file).getChannel();
            }
        });
    }

    public static org.chromium.net.UploadDataProvider create(final android.os.ParcelFileDescriptor parcelFileDescriptor) {
        return new org.chromium.net.apihelpers.UploadDataProviders.FileUploadProvider(new org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider() { // from class: org.chromium.net.apihelpers.UploadDataProviders.2
            @Override // org.chromium.net.apihelpers.UploadDataProviders.FileChannelProvider
            public java.nio.channels.FileChannel getChannel() {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                throw new java.lang.IllegalArgumentException("Not a file: " + parcelFileDescriptor);
            }
        });
    }

    public static org.chromium.net.UploadDataProvider create(java.nio.ByteBuffer byteBuffer) {
        return new org.chromium.net.apihelpers.UploadDataProviders.ByteBufferUploadProvider(byteBuffer.slice());
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr, int i17, int i18) {
        return new org.chromium.net.apihelpers.UploadDataProviders.ByteBufferUploadProvider(java.nio.ByteBuffer.wrap(bArr, i17, i18).slice());
    }

    public static org.chromium.net.UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
