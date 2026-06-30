package dq0;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dq0.a0 f242341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f242342e;

    public x(dq0.a0 a0Var, byte[] bArr) {
        this.f242341d = a0Var;
        this.f242342e = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f242341d.n("onRemoveCover", this.f242342e, null);
    }
}
