package com.tencent.tav.decoder.decodecache;

/* loaded from: classes16.dex */
class RequestStatus {
    private volatile java.util.concurrent.atomic.AtomicBoolean finish = new java.util.concurrent.atomic.AtomicBoolean(false);

    public boolean getFinish() {
        return this.finish.get();
    }

    public void setFinish(boolean z17) {
        this.finish.set(z17);
    }
}
