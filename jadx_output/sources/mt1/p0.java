package mt1;

/* loaded from: classes12.dex */
public final class p0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f331256d;

    public p0(long j17) {
        this.f331256d = j17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            mt1.q0.f331259b.f348849d.H("WxFileIndexLinkify", "DELETE FROM WxFileIndexLinkify WHERE id = ?", new java.lang.Object[]{java.lang.Long.valueOf(this.f331256d)});
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException("deleteLinkifyById failed : " + th6.getMessage());
        }
    }
}
