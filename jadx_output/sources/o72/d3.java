package o72;

/* loaded from: classes9.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final o72.d3 f343321a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f343322b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f343323c = true;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.repairer.config.fav.RepairerConfigFavCheckXmlValidSwitch f343324d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f343325e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f343326f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f343327g;

    static {
        boolean z17;
        o72.d3 d3Var = new o72.d3();
        f343321a = d3Var;
        f343324d = new com.tencent.mm.repairer.config.fav.RepairerConfigFavCheckXmlValidSwitch();
        boolean z18 = true;
        f343325e = true;
        d3Var.e();
        d3Var.d();
        f343325e = new com.tencent.mm.repairer.config.fav.RepairerConfigFavLogicOpSwitch().p();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSwitchManager", "[pullFavLogicOpSwitch] logicOpSwitch = " + f343325e);
        com.tencent.mm.plugin.fav.api.RepairerConfigMarkdownNote repairerConfigMarkdownNote = new com.tencent.mm.plugin.fav.api.RepairerConfigMarkdownNote();
        bm5.o1 o1Var = bm5.o1.f22719a;
        if (o1Var.m(repairerConfigMarkdownNote) == 0) {
            ((com.tencent.mm.pluginsdk.model.q1) ((o72.v3) i95.n0.c(o72.v3.class))).getClass();
            z17 = com.tencent.wechat.aff.wenote.k.f217694b.e(c01.z1.r());
        } else {
            z17 = o1Var.h(repairerConfigMarkdownNote) == 1;
        }
        f343326f = z17;
        com.tencent.mm.plugin.fav.api.RepairerConfigMarkdownNotePublish repairerConfigMarkdownNotePublish = new com.tencent.mm.plugin.fav.api.RepairerConfigMarkdownNotePublish();
        if (o1Var.m(repairerConfigMarkdownNotePublish) == 0) {
            ((com.tencent.mm.pluginsdk.model.q1) ((o72.v3) i95.n0.c(o72.v3.class))).getClass();
            z18 = com.tencent.wechat.aff.wenote.k.f217694b.d(c01.z1.r());
        } else if (o1Var.h(repairerConfigMarkdownNotePublish) != 1) {
            z18 = false;
        }
        f343327g = z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSwitchManager", "[pullMarkdownNoteSwitch] markdownNoteSwitch = " + f343326f + ", markdownNotePublishSwitch = " + f343327g);
    }

    public final boolean a() {
        return f343325e;
    }

    public final boolean b() {
        if (((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi()) {
            return f343326f;
        }
        return false;
    }

    public final boolean c() {
        if (((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi()) {
            return f343327g;
        }
        return false;
    }

    public final void d() {
        f343323c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_new_tag_open, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSwitchManager", "[pullFavNewTagSwitch] newTagSwitch = " + f343323c);
    }

    public final void e() {
        f343322b = new com.tencent.mm.repairer.config.fav.RepairerConfigFavXmlNewSerial().p();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSwitchManager", "[pullFavXmlSerialSwitch] xmlSerial = " + f343322b);
    }
}
