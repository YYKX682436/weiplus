package jk2;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final jk2.a f300069a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.zd2 f300070b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f300071c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f300072d;

    public j(jk2.a plugin, r45.zd2 guideData) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(guideData, "guideData");
        this.f300069a = plugin;
        this.f300070b = guideData;
        this.f300071c = jz5.h.b(new jk2.i(this));
        com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject visitorGuideLogic$MMKVObject = (com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject) d().r(b(), com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject.class);
        if (visitorGuideLogic$MMKVObject != null) {
            long c17 = (c01.id.c() - visitorGuideLogic$MMKVObject.f111741d) / 1000;
            com.tencent.mars.xlog.Log.i(this.f300072d, "checkClear, saveTime: " + java.lang.Long.valueOf(visitorGuideLogic$MMKVObject.f111741d) + " value: " + java.lang.Integer.valueOf(visitorGuideLogic$MMKVObject.f111742e) + " offest: " + c17);
            if (c17 > 86400) {
                d().d();
            }
        }
        this.f300072d = "VisitorCloseGuide_" + e();
    }

    public abstract boolean a();

    public final java.lang.String b() {
        return "LiveGuide_" + this.f300070b.getInteger(0);
    }

    public final java.lang.String c() {
        return "LiveGuide_" + this.f300070b.getInteger(0) + '_' + ((mm2.e1) ((df2.wv) this.f300069a).b().a(mm2.e1.class)).f328988r.getLong(0);
    }

    public final com.tencent.mm.sdk.platformtools.o4 d() {
        return (com.tencent.mm.sdk.platformtools.o4) this.f300071c.getValue();
    }

    public abstract java.lang.String e();

    public boolean f() {
        return true;
    }

    public final boolean g() {
        boolean z17 = false;
        int i17 = d().getInt(c(), 0);
        java.lang.String str = "isCurrentLiveHadGuide key: " + c() + " hadGuide: " + i17;
        java.lang.String str2 = this.f300072d;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (!(i17 != 0) && a()) {
            com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject visitorGuideLogic$MMKVObject = (com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject) d().r(b(), com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isGuideCountOver key: ");
            sb6.append(b());
            sb6.append(" count: ");
            sb6.append(visitorGuideLogic$MMKVObject != null ? java.lang.Integer.valueOf(visitorGuideLogic$MMKVObject.f111742e) : null);
            sb6.append(" dayTimes: ");
            r45.zd2 zd2Var = this.f300070b;
            sb6.append(zd2Var.getInteger(3));
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            if (!((visitorGuideLogic$MMKVObject != null ? visitorGuideLogic$MMKVObject.f111742e : 0) >= zd2Var.getInteger(3))) {
                z17 = true;
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "isEnableShow: ret=" + z17);
        return z17;
    }

    public void h() {
    }

    public abstract void i();

    public void j(r45.r71 r71Var) {
    }

    public void k() {
        com.tencent.mars.xlog.Log.i(this.f300072d, "start preload");
    }

    public void l() {
    }
}
