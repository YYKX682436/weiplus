package com.tencent.mm.sdk.event;

/* loaded from: classes12.dex */
public abstract class n implements fs.p {
    private final int priority;

    public n(int i17) {
        this.priority = i17;
    }

    public abstract boolean callback(com.tencent.mm.sdk.event.IEvent iEvent);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPriority() {
        return this.priority;
    }
}
