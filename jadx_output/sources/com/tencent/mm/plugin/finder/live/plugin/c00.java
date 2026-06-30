package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c00 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f112092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c00(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var) {
        super(1);
        this.f112092d = w00Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f112092d;
        w00Var.getClass();
        if (!(str == null || str.length() == 0)) {
            boolean x07 = w00Var.x0();
            com.tencent.mars.xlog.Log.i(w00Var.f114843q, "goToFinderProfile finderUsername:" + str + ",isLandscape:" + x07);
            if (!x07 || ((mm2.c1) w00Var.P0(mm2.c1.class)).O7()) {
                dk2.q4 q4Var = dk2.q4.f233938a;
                android.view.ViewGroup viewGroup = w00Var.f365323d;
                android.content.Context context = viewGroup.getContext();
                gk2.e S0 = w00Var.S0();
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                dk2.q4.j(q4Var, context, S0, false, str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.ra.class))).V6(), false, null, 96, null);
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("PORTRAIT_ACTION_KEY_FINDER_USERNAME", str);
                com.tencent.mm.plugin.finder.live.plugin.l.s1(w00Var, "PORTRAIT_ACTION_GOTO_PROFILE_NEW_MEMBER_PROFILE", bundle, 0, 4, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
