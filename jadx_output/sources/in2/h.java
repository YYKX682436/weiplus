package in2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(in2.s sVar) {
        super(3);
        this.f292842d = sVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        dk2.yg musicItem = (dk2.yg) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        in2.s sVar = this.f292842d;
        int[] iArr = sVar.C1;
        if (iArr[0] == 0 || iArr[1] == 0) {
            view.getLocationOnScreen(iArr);
        }
        int i17 = iArr[0];
        int i18 = iArr[1];
        rl5.r rVar = sVar.B1;
        rVar.a();
        rVar.h(view, new in2.q(sVar), new in2.r(sVar, musicItem, intValue), i17, i18);
        rVar.k(com.tencent.mm.R.drawable.c5k);
        rVar.U = true;
        rVar.T = com.tencent.mm.R.color.BW_100_Alpha_0_8;
        return jz5.f0.f302826a;
    }
}
