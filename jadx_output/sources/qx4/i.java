package qx4;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx4.d0 f367411e;

    public i(java.lang.String str, qx4.d0 d0Var) {
        this.f367410d = str;
        this.f367411e = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qx4.d0.h(this.f367410d, this.f367411e);
    }
}
