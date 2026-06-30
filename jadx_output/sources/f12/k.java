package f12;

/* loaded from: classes4.dex */
public final class k implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258631d;

    public k(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258631d = springLuckyEggActivity;
    }

    @Override // androidx.lifecycle.k0
    public final void onChanged(java.lang.Object obj) {
        d12.a aVar = (d12.a) obj;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258631d;
            if (ordinal == 0) {
                db5.t7.h(springLuckyEggActivity.getContext(), springLuckyEggActivity.getContext().getResources().getString(com.tencent.mm.R.string.jjs));
            } else if (ordinal == 1) {
                db5.t7.g(springLuckyEggActivity.getContext(), springLuckyEggActivity.getContext().getResources().getString(com.tencent.mm.R.string.jjr));
            } else if (ordinal == 2) {
                db5.t7.g(springLuckyEggActivity.getContext(), springLuckyEggActivity.getContext().getResources().getString(com.tencent.mm.R.string.jjq));
            } else if (ordinal != 3) {
                b12.k kVar = b12.k.f17060a;
                if (ordinal == 4) {
                    db5.t7.g(springLuckyEggActivity.getContext(), springLuckyEggActivity.getContext().getResources().getString(com.tencent.mm.R.string.jjr));
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    kVar.a(java.lang.System.currentTimeMillis() - springLuckyEggActivity.f97442h, 2);
                    f12.p pVar = new f12.p(springLuckyEggActivity);
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    com.tencent.mm.sdk.platformtools.u3.i(pVar, 3000L);
                } else if (ordinal == 5) {
                    db5.t7.g(springLuckyEggActivity.getContext(), springLuckyEggActivity.getContext().getResources().getString(com.tencent.mm.R.string.jjq));
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    kVar.a(java.lang.System.currentTimeMillis() - springLuckyEggActivity.f97442h, 1);
                    f12.q qVar = new f12.q(springLuckyEggActivity);
                    java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                    com.tencent.mm.sdk.platformtools.u3.i(qVar, 3000L);
                }
            } else {
                db5.t7.g(springLuckyEggActivity.getContext(), springLuckyEggActivity.getContext().getResources().getString(com.tencent.mm.R.string.jjr));
            }
            int i17 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.f97437o;
            springLuckyEggActivity.X6().f258623m.setValue(null);
        }
    }
}
