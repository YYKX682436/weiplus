package te2;

/* loaded from: classes3.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(te2.p1 p1Var) {
        super(3);
        this.f418421d = p1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int[] iArr;
        com.tencent.mm.plugin.finder.live.widget.d7 d7Var;
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        dk2.vg musicItem = (dk2.vg) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        te2.p1 p1Var = this.f418421d;
        te2.k0 k0Var = p1Var.f418290h;
        if (k0Var == null || (d7Var = ((te2.q1) k0Var).f418350i) == null || (iArr = d7Var.f118082p1) == null) {
            iArr = new int[2];
        }
        if (iArr[0] == 0 || iArr[1] == 0) {
            view.getLocationOnScreen(iArr);
        }
        te2.k0 k0Var2 = p1Var.f418290h;
        if (k0Var2 != null) {
            int i17 = iArr[0];
            int i18 = iArr[1];
            com.tencent.mm.plugin.finder.live.widget.d7 d7Var2 = ((te2.q1) k0Var2).f418350i;
            if (d7Var2 != null) {
                rl5.r rVar = d7Var2.f118080l1;
                rVar.a();
                rVar.h(view, new com.tencent.mm.plugin.finder.live.widget.b7(d7Var2), new com.tencent.mm.plugin.finder.live.widget.c7(d7Var2, musicItem, intValue), i17, i18);
                rVar.k(com.tencent.mm.R.drawable.c5k);
                rVar.U = true;
                rVar.T = com.tencent.mm.R.color.BW_100_Alpha_0_8;
            }
        }
        return jz5.f0.f302826a;
    }
}
