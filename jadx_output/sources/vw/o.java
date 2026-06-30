package vw;

@j95.b
/* loaded from: classes11.dex */
public class o extends i95.w implements rv.a3 {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        gm0.j1.q(zq1.a0.class, new yq1.z());
        gm0.j1.q(zq1.m0.class, new yq1.x0());
        gm0.j1.q(zq1.f0.class, new js1.m());
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            gm0.j1.q(qk.s6.class, new c01.e1());
            return;
        }
        zs1.c cVar = zs1.c.f475233a;
        ku4.z.f312542d.add(new zs1.a());
        gm0.j1.q(qk.s6.class, c01.d1.f37097d);
    }

    public androidx.fragment.app.DialogFragment wi(android.content.Context activityContext, android.content.Intent intent, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar, int i17, boolean z17) {
        int i18 = com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment.f94067s;
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(intent, "intent");
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment bizContactInfoDialogFragment = new com.tencent.mm.plugin.brandservice.ui.profile.BizContactInfoDialogFragment(activityContext, intent);
        bizContactInfoDialogFragment.setArguments(bundle);
        bizContactInfoDialogFragment.f94076o = aVar;
        bizContactInfoDialogFragment.f94077p = i17;
        bizContactInfoDialogFragment.f94078q = z17;
        return bizContactInfoDialogFragment;
    }
}
