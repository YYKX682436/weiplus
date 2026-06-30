package xc2;

/* loaded from: classes2.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f453200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f453201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(boolean z17, android.content.Context context) {
        super(4);
        this.f453200d = z17;
        this.f453201e = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) obj4;
        if (intValue == 0 && intValue2 == 0) {
            if (m1Var != 0 && m1Var.getType() == 372) {
                ab0.v vVar = m1Var instanceof ab0.v ? (ab0.v) m1Var : null;
                r45.cx5 cx5Var = vVar != null ? ((l41.e0) vVar).f315803g : null;
                java.lang.String str = cx5Var != null ? cx5Var.f371900d : null;
                if (str == null) {
                    str = "";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToWeComProfile username=");
                sb6.append(str);
                sb6.append(" nickname=");
                sb6.append(cx5Var != null ? cx5Var.f371901e : null);
                com.tencent.mars.xlog.Log.i("Finder.JumperUtils", sb6.toString());
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
                android.content.Context context = this.f453201e;
                if (K0) {
                    dp.a.makeText(context, com.tencent.mm.R.string.icr, 0).show();
                } else {
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                    android.content.Intent intent = new android.content.Intent();
                    qk.p.b(intent, cx5Var, 30);
                    if (n17 != null && !n17.r2()) {
                        intent.putExtra("Contact_IsLBSFriend", true);
                    }
                    boolean z17 = this.f453200d;
                    intent.putExtra("Contact_IsHalfScreen", z17);
                    if (z17) {
                        pf5.j0.a(intent, wm3.j.class);
                        pf5.j0.a(intent, wm3.l.class);
                        androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) context;
                        kotlin.jvm.internal.o.g(activity, "activity");
                        pf5.z zVar = pf5.z.f353948a;
                        androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ai.class);
                        kotlin.jvm.internal.o.f(a17, "get(...)");
                        com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar = (com.tencent.mm.plugin.finder.viewmodel.component.ai) a17;
                        com.tencent.mm.ui.vas.VASCommonFragment b17 = lk5.q0.b("com.tencent.mm.plugin.profile.ui.ContactInfoUI", intent, false, 4, null);
                        gx2.q R6 = com.tencent.mm.plugin.finder.viewmodel.component.ai.R6(aiVar, b17, null, null, 6, null);
                        if (R6 != null) {
                            R6.setContentReachTop(new xc2.j2(R6));
                        }
                        xc2.k2 k2Var = new xc2.k2(b17, aiVar);
                        kotlin.jvm.internal.o.g(activity, "activity");
                        androidx.lifecycle.c1 a18 = zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
                        kotlin.jvm.internal.o.f(a18, "get(...)");
                        aiVar.O6(com.tencent.mm.plugin.finder.viewmodel.component.ha.P6((com.tencent.mm.plugin.finder.viewmodel.component.ha) a18, 10, k2Var, null, 4, null));
                    } else {
                        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
