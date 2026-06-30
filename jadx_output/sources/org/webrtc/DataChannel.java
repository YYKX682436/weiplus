package org.webrtc;

/* loaded from: classes14.dex */
public class DataChannel {
    private long nativeDataChannel;
    private long nativeObserver;

    /* loaded from: classes6.dex */
    public static class Buffer {
        public final boolean binary;
        public final java.nio.ByteBuffer data;

        public Buffer(java.nio.ByteBuffer byteBuffer, boolean z17) {
            this.data = byteBuffer;
            this.binary = z17;
        }
    }

    /* loaded from: classes6.dex */
    public static class Init {
        public boolean negotiated;
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public java.lang.String protocol = "";

        /* renamed from: id, reason: collision with root package name */
        public int f347887id = -1;

        public int getId() {
            return this.f347887id;
        }

        public int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        public int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        public boolean getNegotiated() {
            return this.negotiated;
        }

        public boolean getOrdered() {
            return this.ordered;
        }

        public java.lang.String getProtocol() {
            return this.protocol;
        }
    }

    /* loaded from: classes6.dex */
    public interface Observer {
        void onBufferedAmountChange(long j17);

        void onMessage(org.webrtc.DataChannel.Buffer buffer);

        void onStateChange();
    }

    /* loaded from: classes6.dex */
    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        public static org.webrtc.DataChannel.State fromNativeIndex(int i17) {
            return values()[i17];
        }
    }

    public DataChannel(long j17) {
        this.nativeDataChannel = j17;
    }

    private void checkDataChannelExists() {
        if (this.nativeDataChannel == 0) {
            throw new java.lang.IllegalStateException("DataChannel has been disposed.");
        }
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native java.lang.String nativeLabel();

    private native long nativeRegisterObserver(org.webrtc.DataChannel.Observer observer);

    private native boolean nativeSend(byte[] bArr, boolean z17);

    private native org.webrtc.DataChannel.State nativeState();

    private native void nativeUnregisterObserver(long j17);

    public long bufferedAmount() {
        checkDataChannelExists();
        return nativeBufferedAmount();
    }

    public void close() {
        checkDataChannelExists();
        nativeClose();
    }

    public void dispose() {
        checkDataChannelExists();
        org.webrtc.JniCommon.nativeReleaseRef(this.nativeDataChannel);
        this.nativeDataChannel = 0L;
    }

    public long getNativeDataChannel() {
        return this.nativeDataChannel;
    }

    public int id() {
        checkDataChannelExists();
        return nativeId();
    }

    public java.lang.String label() {
        checkDataChannelExists();
        return nativeLabel();
    }

    public void registerObserver(org.webrtc.DataChannel.Observer observer) {
        checkDataChannelExists();
        long j17 = this.nativeObserver;
        if (j17 != 0) {
            nativeUnregisterObserver(j17);
        }
        this.nativeObserver = nativeRegisterObserver(observer);
    }

    public boolean send(org.webrtc.DataChannel.Buffer buffer) {
        checkDataChannelExists();
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return nativeSend(bArr, buffer.binary);
    }

    public org.webrtc.DataChannel.State state() {
        checkDataChannelExists();
        return nativeState();
    }

    public void unregisterObserver() {
        checkDataChannelExists();
        nativeUnregisterObserver(this.nativeObserver);
        this.nativeObserver = 0L;
    }
}
