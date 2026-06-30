package kotlinx.coroutines.sync;

/* loaded from: classes14.dex */
public final class h extends kotlinx.coroutines.internal.m {
    public volatile java.lang.Object owner;

    public h(java.lang.Object obj) {
        this.owner = obj;
    }

    @Override // kotlinx.coroutines.internal.t
    public java.lang.String toString() {
        return "LockedQueue[" + this.owner + ']';
    }
}
