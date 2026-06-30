package vf2;

/* loaded from: classes3.dex */
public final class q extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public r45.n73 f436354m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public static final void Z6(vf2.q qVar) {
        r45.z53 z53Var;
        java.lang.String string;
        r45.z53 z53Var2;
        java.lang.String string2;
        r45.z53 z53Var3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#launchGameLayout click. game:");
        r45.xq1 xq1Var = ((mm2.c1) qVar.business(mm2.c1.class)).C2;
        java.lang.String str = null;
        sb6.append(xq1Var != null ? xq1Var.getString(6) : null);
        sb6.append(", gameUserInfo:");
        r45.n73 n73Var = qVar.f436354m;
        sb6.append(n73Var != null ? pm0.b0.g(n73Var) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorScreenCastLivingStatusController", sb6.toString());
        r45.xq1 xq1Var2 = ((mm2.c1) qVar.business(mm2.c1.class)).C2;
        if (xq1Var2 != null) {
            java.lang.String string3 = xq1Var2.getString(6);
            if (string3 == null) {
                string3 = "";
            }
            android.content.Intent launchIntentForPackage = qVar.O6().getPackageManager().getLaunchIntentForPackage(string3);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268435456);
            }
            r45.n73 n73Var2 = qVar.f436354m;
            if (n73Var2 != null && (z53Var3 = (r45.z53) n73Var2.getCustom(1)) != null) {
                str = z53Var3.getString(21);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorScreenCastLivingStatusController", "[launchInternal] launchParams = " + str);
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
            wXAppExtendObject.extInfo = str;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
            wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
            wXMediaMessage.messageExt = str;
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context O6 = qVar.O6();
            r45.n73 n73Var3 = qVar.f436354m;
            java.lang.String str2 = (n73Var3 == null || (z53Var2 = (r45.z53) n73Var3.getCustom(1)) == null || (string2 = z53Var2.getString(4)) == null) ? "" : string2;
            r45.n73 n73Var4 = qVar.f436354m;
            java.lang.String str3 = (n73Var4 == null || (z53Var = (r45.z53) n73Var4.getCustom(1)) == null || (string = z53Var.getString(0)) == null) ? "" : string;
            android.os.Bundle bundle = new android.os.Bundle();
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.w.w(O6, str2, wXMediaMessage, str3, "", 2, null, bundle);
        }
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Gj(5);
    }

    public static final java.lang.Object a7(vf2.q qVar, r45.n73 n73Var, kotlin.coroutines.Continuation continuation) {
        boolean z17;
        qVar.getClass();
        r45.z53 z53Var = (r45.z53) n73Var.getCustom(1);
        boolean z18 = false;
        if (z53Var == null) {
            z17 = true;
        } else {
            java.lang.String string = z53Var.getString(1);
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = z53Var.getString(4);
            java.lang.String str = string2 != null ? string2 : "";
            boolean z19 = (str.length() > 0) && !com.tencent.mm.plugin.finder.assist.b3.f102022a.b(qVar.O6(), str);
            if (z19) {
                db5.e1.A(qVar.O6(), qVar.O6().getString(com.tencent.mm.R.string.f3_, string), "", qVar.O6().getString(com.tencent.mm.R.string.f490507x1), qVar.O6().getString(com.tencent.mm.R.string.f490347sg), new vf2.a(qVar, z53Var), vf2.b.f436325d);
                ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Gj(8);
            }
            z17 = !z19;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorScreenCastLivingStatusController", "#startScreenCastPreview installCheck failed");
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorScreenCastLivingStatusController", "#startScreenCastPreview installCheck success");
        in0.q qVar2 = in0.q.f292769b2;
        if (!(qVar2 != null)) {
            return f0Var;
        }
        if (qVar2 == null) {
            in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
        }
        in0.q qVar3 = in0.q.f292769b2;
        kotlin.jvm.internal.o.d(qVar3);
        r45.z53 z53Var2 = (r45.z53) n73Var.getCustom(1);
        if (z53Var2 != null && z53Var2.getInteger(18) == 1) {
            z18 = true;
        }
        java.lang.Object E0 = qVar3.E0(!z18, qVar.N6(), continuation);
        return E0 == pz5.a.f359186d ? E0 : f0Var;
    }

    public final android.view.ViewGroup b7() {
        return (android.view.ViewGroup) T6(com.tencent.mm.R.id.rn9, com.tencent.mm.R.id.rn8);
    }

    public final com.tencent.mm.view.MMPAGView c7() {
        com.tencent.mm.view.MMPAGView mMPAGView;
        android.view.ViewGroup b76 = b7();
        if (b76 == null || (mMPAGView = (com.tencent.mm.view.MMPAGView) b76.findViewById(com.tencent.mm.R.id.roh)) == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.M1));
        return mMPAGView;
    }

    public final android.view.View d7() {
        android.view.ViewGroup b76 = b7();
        if (b76 != null) {
            return b76.findViewById(com.tencent.mm.R.id.rel);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new vf2.c(this, h0Var, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new vf2.e(this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.ViewGroup b76 = b7();
        if (b76 != null) {
            b76.setVisibility(8);
        }
        com.tencent.mm.view.MMPAGView c76 = c7();
        if (c76 != null) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new vf2.f(c76, null), 3, null);
        }
        android.view.ViewGroup b77 = b7();
        android.view.View findViewById = b77 != null ? b77.findViewById(com.tencent.mm.R.id.reg) : null;
        if (findViewById != null) {
            findViewById.setOnClickListener(new vf2.m(this));
        }
        android.view.View d76 = d7();
        if (d76 != null) {
            d76.setOnClickListener(new vf2.o(this));
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mm.view.MMPAGView c76 = c7();
        if (c76 != null) {
            c76.n();
        }
        com.tencent.mm.view.MMPAGView c77 = c7();
        if (c77 != null) {
            c77.h();
        }
    }
}
