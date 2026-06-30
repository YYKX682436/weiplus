package ni2;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f337446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView f337447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ni2.v2 f337448f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.live.plugin.l lVar, com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView finderLiveMicGiftMemberPanelTabView, ni2.v2 v2Var) {
        super(1);
        this.f337446d = lVar;
        this.f337447e = finderLiveMicGiftMemberPanelTabView;
        this.f337448f = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        java.lang.String username;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        r45.xn1 xn1Var = (r45.xn1) obj;
        boolean z17 = true;
        int integer = xn1Var != null ? xn1Var.getInteger(7) : 1;
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.Object obj2 = null;
        if (!r4Var.w1() && ((mm2.c1) this.f337446d.P0(mm2.c1.class)).R6()) {
            if (!kotlin.jvm.internal.o.b(((mm2.c1) this.f337446d.P0(mm2.c1.class)).f328852o, (xn1Var == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact5.getUsername())) {
                com.tencent.mars.xlog.Log.i("FinderLiveMicGiftMemberPanelTabView", "ur visitor and anonymous mode now. don't check others.");
                db5.t7.g(this.f337447e.getContext(), this.f337447e.getContext().getResources().getString(com.tencent.mm.R.string.d5x));
                return jz5.f0.f302826a;
            }
        }
        if (!r4Var.k2((xn1Var == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact4.getUsername())) {
            if (xn1Var != null && xn1Var.getInteger(7) == 3) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                if (finderContact6 != null && (username = finderContact6.getUsername()) != null) {
                    com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView finderLiveMicGiftMemberPanelTabView = this.f337447e;
                    com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f337446d;
                    dk2.q4 q4Var = dk2.q4.f233938a;
                    android.content.Context context = finderLiveMicGiftMemberPanelTabView.getContext();
                    gk2.e S0 = lVar.S0();
                    android.content.Context context2 = finderLiveMicGiftMemberPanelTabView.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    dk2.q4.j(q4Var, context, S0, false, username, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.ra.class))).V6(), false, null, 96, null);
                }
            } else {
                java.lang.String username2 = (xn1Var == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact3.getUsername();
                if (username2 != null && username2.length() != 0) {
                    z17 = false;
                }
                if (!z17 && integer != 4) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putByteArray("PARAM_MEMBERS_PROFILE_CONTACT", xn1Var != null ? xn1Var.toByteArray() : null);
                    bundle.putBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE", false);
                    if (xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (str = finderContact2.getUsername()) == null) {
                        str = "";
                    }
                    bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", str);
                    bundle.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 7);
                    java.util.List list = ((mm2.o4) this.f337446d.P0(mm2.o4.class)).f329327v;
                    if (list != null) {
                        synchronized (list) {
                            java.util.Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it.next();
                                if (kotlin.jvm.internal.o.b(((km2.q) next).f309172c, (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername())) {
                                    obj2 = next;
                                    break;
                                }
                            }
                        }
                        km2.q qVar = (km2.q) obj2;
                        if (qVar != null) {
                            java.lang.String str2 = qVar.f309170a;
                            if (str2 == null) {
                                str2 = "";
                            }
                            bundle.putString("PARAM_MEMBERS_PROFILE_USER_MIC_ID", str2);
                        }
                    }
                    this.f337446d.f113325g.statusChange(qo0.b.f365376l1, bundle);
                    ((ni2.w) this.f337448f).a();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
