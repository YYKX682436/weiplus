package df2;

/* loaded from: classes3.dex */
public final class od extends if2.b {

    /* renamed from: w, reason: collision with root package name */
    public static final df2.dd f230952w = new df2.dd(null);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230953m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.rx f230954n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew f230955o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ug1 f230956p;

    /* renamed from: q, reason: collision with root package name */
    public r45.d62 f230957q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f230958r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f230959s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f230960t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f230961u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f230962v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230953m = "LiveAnchorTaskBannerController";
        this.f230959s = jz5.h.b(new df2.ed(this));
        this.f230960t = jz5.h.b(df2.cd.f229878d);
        this.f230961u = "wxaliteb97bae038c43fd5cb3f1259a0690f499";
        this.f230962v = "pages/home";
    }

    public static final com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew Z6(df2.od odVar) {
        if (odVar.f230955o == null) {
            android.view.View inflate = com.tencent.mm.ui.id.b(odVar.O6()).inflate(com.tencent.mm.R.layout.dt8, (android.view.ViewGroup) null);
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew finderLiveTaskBannerViewNew = inflate instanceof com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew ? (com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew) inflate : null;
            odVar.f230955o = finderLiveTaskBannerViewNew;
            if (finderLiveTaskBannerViewNew != null) {
                finderLiveTaskBannerViewNew.setOnClickListener(new df2.fd(odVar));
            }
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew finderLiveTaskBannerViewNew2 = odVar.f230955o;
            if (finderLiveTaskBannerViewNew2 != null) {
                finderLiveTaskBannerViewNew2.setOnSelectedListener(new df2.gd(odVar));
            }
        }
        return odVar.f230955o;
    }

    public static final java.lang.String a7(df2.od odVar, r45.ug1 ug1Var) {
        if (odVar.b7(ug1Var)) {
            java.lang.String string = ug1Var != null ? ug1Var.getString(1) : null;
            if (string != null) {
                return string;
            }
        }
        return "";
    }

    public static void d7(df2.od odVar, r45.f62 f62Var, int i17, java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        jz5.f0 f0Var = null;
        if ((i17 & 1) != 0) {
            f62Var = null;
        }
        java.lang.String str = odVar.f230953m;
        if (f62Var != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) f62Var.getCustom(17)) != null) {
            com.tencent.mars.xlog.Log.i(str, "[openRewardLiteApp] info = " + pm0.b0.g(finderJumpInfo));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context O6 = odVar.O6();
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, O6, p0Var, 0, null, 8, null);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "[openRewardLiteApp] open default}");
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            android.content.Context O62 = odVar.O6();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", odVar.f230961u);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, odVar.f230962v);
            ((com.tencent.mm.feature.lite.i) g0Var).kk(O62, bundle, true, false, new df2.id(odVar));
        }
    }

    public final boolean b7(r45.ug1 ug1Var) {
        if (ug1Var != null && ug1Var.getBoolean(0)) {
            java.lang.String string = ug1Var.getString(1);
            if (!(string == null || string.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c7(r45.d62 targetType) {
        kotlin.jvm.internal.o.g(targetType, "targetType");
        return this.f230957q == targetType;
    }

    public final void e7(r45.n72 action) {
        kotlin.jvm.internal.o.g(action, "action");
        r45.ug1 ug1Var = ((mm2.c1) business(mm2.c1.class)).W5;
        if (ug1Var == null) {
            ug1Var = this.f230956p;
        }
        if (b7(ug1Var)) {
            com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new df2.jd(this, action, null), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        super.onLiveActivate();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew finderLiveTaskBannerViewNew;
        java.util.LinkedList list;
        super.onLiveMsg(r71Var);
        java.lang.Object obj = null;
        if (r71Var != null && (list = r71Var.getList(14)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.ch1) next).getInteger(1) == 20120) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.ch1) obj;
        }
        if (obj == null || (finderLiveTaskBannerViewNew = this.f230955o) == null) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.xw(true, finderLiveTaskBannerViewNew));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        dk2.tb tbVar = dk2.ef.f233392k;
        tbVar.f(39);
        tbVar.e(39, new r45.ob2(), new df2.nd(this, r45.pb2.class), false);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        this.f230954n = new com.tencent.mm.plugin.finder.live.widget.rx(O6(), getStore());
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = (com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData) ((jz5.n) this.f230959s).getValue();
        if (liveMutableData != null) {
            liveMutableData.f111660d = true;
            liveMutableData.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.hd(this));
        }
        if (((mm2.c1) getStore().getLiveRoomData().a(mm2.c1.class)).a8()) {
            dk2.tb tbVar = dk2.ef.f233392k;
            tbVar.f(39);
            tbVar.e(39, new r45.ob2(), new df2.nd(this, r45.pb2.class), false);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        dk2.ef.f233392k.f(39);
        this.f230955o = null;
        this.f230957q = null;
        this.f230958r = null;
        this.f230954n = null;
    }
}
