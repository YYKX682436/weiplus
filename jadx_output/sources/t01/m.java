package t01;

@j95.b
/* loaded from: classes11.dex */
public final class m extends i95.w implements rm.c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final t01.i f414399d = new t01.i(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f414400e = jz5.h.b(t01.e.f414392d);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f414401f = "BizPersonalFinderRedDot_REGISTER_NOTICE_RED_POINT";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f414402g = "BizPersonalFinderRedDot_TIPS_ID_KV";

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.iam.biz.l0 f414403h = com.tencent.wechat.iam.biz.l0.f217758c;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f414404i = jz5.h.b(t01.g.f414394d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f414405m = jz5.h.b(t01.h.f414395d);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f414406n = jz5.h.b(t01.f.f414393d);

    public m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "init subscribeNotifyFetchMeTabRedPointEvent");
        t01.a aVar = new t01.a(this);
        com.tencent.wechat.iam.biz.l0 l0Var = f414403h;
        l0Var.k("BizPersonalCenterPluginAppHelper_METabRegisKey", aVar);
        l0Var.m("BizPersonalCenterPluginAppHelper_METabWorksEntryRedDotKey", new t01.b(this));
        l0Var.l("BizPersonalCenterPluginAppHelper_METabWorksEntryRedDotKey", new t01.c(this));
        com.tencent.wechat.iam.biz.t1.f217792c.g("BizPersonalCenterPluginAppHelper_METabPhotoCreateSwitchKey", t01.d.f414391a);
    }

    public void Ai(int i17) {
        r45.vs2 vs2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "clearMeTabBizRedDot, scene: " + i17);
        t01.i iVar = f414399d;
        if (i17 == 0) {
            t01.i.c(iVar).N("MyTabPhotoProfile");
        } else if (i17 != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizPersonalFinderRedDot", "clearMeTabBizRedDot, scene not support: " + i17);
            return;
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = t01.i.c(iVar).L0("MyTabPhotoProfile");
        f414403h.b(java.util.Optional.ofNullable((L0 == null || (vs2Var = L0.field_ctrInfo) == null) ? null : vs2Var.toByteArrayOrNull()), i17, java.util.Optional.empty(), t01.k.f414397a);
    }

    public final void Bi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "disposeWorksEntryRedDot");
        t01.i iVar = f414399d;
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = t01.i.c(iVar).L0("MyTab");
        if (L0 != null) {
            r45.vs2 vs2Var = L0.field_ctrInfo;
            if (vs2Var != null && vs2Var.f388487e == 1026) {
                zy2.fa.J0(t01.i.c(iVar), L0, "MyTab", true, null, 8, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "dispose tabBar red dot");
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L02 = t01.i.c(iVar).L0("FinderMentionMyTab");
        if (L02 != null) {
            r45.vs2 vs2Var2 = L02.field_ctrInfo;
            if (vs2Var2 != null && vs2Var2.f388487e == 1026) {
                zy2.fa.J0(t01.i.c(iVar), L02, "FinderMentionMyTab", true, null, 8, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "dispose left count red dot");
            }
        }
    }

    public final boolean Di() {
        return ((ox.g) t01.i.b(f414399d)).qj();
    }

    public final boolean Ni() {
        java.lang.Object value = ((jz5.n) f414404i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return ((c61.l7) ((zy2.b6) value)).vk();
    }

    public final boolean Ri() {
        boolean z17;
        java.lang.String str;
        t01.i.b(f414399d);
        com.tencent.wechat.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f368148m.f368154b;
        if (bVar != null && (str = bVar.f217889e) != null) {
            if (str.length() > 0) {
                z17 = true;
                return !z17 && bVar.f217894m;
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public final int Ui() {
        return (Ni() && Di()) ? com.tencent.mm.R.string.o1n : Ni() ? com.tencent.mm.R.string.o1l : Di() ? com.tencent.mm.R.string.o1k : com.tencent.mm.R.string.ngx;
    }

    public final void wi() {
        t01.i iVar = f414399d;
        if (!((ox.g) t01.i.b(iVar)).vj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "shouldShowPhotoWorks is false, skip add edu red dot");
            return;
        }
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f388487e = 1026;
        vs2Var.f388486d = 100000;
        java.lang.String str = "BizPhotoLocal_" + (java.lang.System.currentTimeMillis() / 1000.0d);
        vs2Var.f388490h = str;
        vs2Var.f388503x = str;
        r45.f03 f03Var = new r45.f03();
        f03Var.f373891h = 1;
        f03Var.f373887d = 3;
        f03Var.f373892i = "FinderMyTab";
        f03Var.f373889f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(Ui());
        vs2Var.f388489g.add(f03Var);
        zy2.fa.D(t01.i.c(iVar), vs2Var, "bizMeTab", null, false, null, 28, null);
        t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "add edu red dot success, tipsUuid: " + vs2Var.f388503x);
    }
}
