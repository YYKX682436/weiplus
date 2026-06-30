package u56;

/* loaded from: classes11.dex */
public final class m implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        throw new java.lang.AssertionError("No threads allowed.");
    }
}
