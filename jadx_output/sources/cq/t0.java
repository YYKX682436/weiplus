package cq;

/* loaded from: classes2.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f221285g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f221286h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.q f221287i;

    public t0(java.lang.String str, int i17, yz5.l lVar, androidx.lifecycle.y yVar, kotlin.jvm.internal.f0 f0Var, yz5.q qVar) {
        this.f221282d = str;
        this.f221283e = i17;
        this.f221284f = lVar;
        this.f221285g = yVar;
        this.f221286h = f0Var;
        this.f221287i = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(this.f221282d);
        int k17 = (int) com.tencent.mm.vfs.w6.k(this.f221282d);
        ((ku5.t0) ku5.t0.f312615d).B(new cq.s0(p17, k17, this.f221282d, this.f221283e, this.f221284f, this.f221285g, this.f221286h, this.f221287i));
    }
}
