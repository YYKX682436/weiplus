package my2;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.u f332760d;

    public r(my2.u uVar) {
        this.f332760d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        my2.u uVar = this.f332760d;
        qo0.c.a(uVar.f332764e, qo0.b.f365419u2, null, 2, null);
        mm2.c1 c1Var = (mm2.c1) uVar.f332763d.a(mm2.c1.class);
        c1Var.f328784b6 = null;
        c1Var.f328789c6 = false;
        c1Var.f328794d6 = false;
    }
}
