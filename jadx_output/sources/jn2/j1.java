package jn2;

/* loaded from: classes10.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f300634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(jn2.r1 r1Var, jn2.z1 z1Var) {
        super(3);
        this.f300634d = r1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i17;
        int i18;
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        r45.z22 songInfo = (r45.z22) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        jn2.r1 r1Var = this.f300634d;
        int[] iArr = r1Var.f300687x1;
        int i19 = iArr[0];
        if (i19 != 0) {
            i17 = i19;
        } else {
            view.getLocationOnScreen(iArr);
            i17 = iArr[0];
        }
        int i27 = iArr[1];
        if (i27 != 0) {
            i18 = i27;
        } else {
            view.getLocationOnScreen(iArr);
            i18 = iArr[1];
        }
        rl5.r rVar = r1Var.f300685p1;
        rVar.a();
        rVar.h(view, new jn2.p1(r1Var), new jn2.q1(r1Var, songInfo, intValue), i17, i18);
        rVar.k(com.tencent.mm.R.drawable.c5k);
        rVar.U = true;
        rVar.T = com.tencent.mm.R.color.BW_100_Alpha_0_8;
        return jz5.f0.f302826a;
    }
}
