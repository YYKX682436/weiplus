package fk2;

/* loaded from: classes3.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.n2 f263435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(fk2.n2 n2Var) {
        super(1);
        this.f263435d = n2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        fk2.n2 n2Var = this.f263435d;
        n2Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "handleRecvLuckyMoneyErr errCode:" + intValue);
        we2.a aVar = n2Var.f445240a;
        if (intValue == 1) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 1);
            com.tencent.mm.plugin.finder.live.view.k0 p17 = aVar.p();
            if (p17 != null) {
                p17.statusChange(qo0.b.f365332b4, bundle);
            }
        } else if (intValue == 2) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 2);
            com.tencent.mm.plugin.finder.live.view.k0 p18 = aVar.p();
            if (p18 != null) {
                p18.statusChange(qo0.b.f365332b4, bundle2);
            }
        }
        return jz5.f0.f302826a;
    }
}
