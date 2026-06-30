package dk2;

/* loaded from: classes3.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.t5 f234013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(dk2.t5 t5Var) {
        super(0);
        this.f234013d = t5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCommentStickyHelper", "checkSticky undo sticky");
        dk2.t5 t5Var = this.f234013d;
        t5Var.f234106e = false;
        yz5.p pVar = t5Var.f234109h;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(t5Var.f234104c), java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
