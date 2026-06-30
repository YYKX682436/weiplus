package u71;

@j95.b(dependencies = {e70.z.class})
/* loaded from: classes15.dex */
public final class f extends i95.w implements e70.q {

    /* renamed from: e, reason: collision with root package name */
    public boolean f425095e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f425094d = "MicroMsg.AffBizFeatureService:" + hashCode();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f425096f = jz5.h.b(u71.b.f425090d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f425097g = jz5.h.b(u71.e.f425093d);

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i(this.f425094d, "onAccountInitialized " + ((java.lang.Object) jz5.u.a(gm0.j1.b().h())));
        com.tencent.unit_rc.ur.ProfileConfigCpp.Companion companion = com.tencent.unit_rc.ur.ProfileConfigCpp.INSTANCE;
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_ur_profile_record_count", null);
        com.tencent.unit_rc.ur.ProfileConfigCpp.Companion.setReportConfig$default(companion, aj6 == null ? 0 : java.lang.Integer.parseInt(aj6), 0, 0, 0, 0, 30, null);
        companion.setReportFunc(u71.t.f425112d);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i(this.f425094d, "onAccountReleased " + ((java.lang.Object) jz5.u.a(gm0.j1.b().h())));
        com.tencent.unit_rc.ur.ProfileConfigCpp.INSTANCE.report();
        int i17 = w71.c.f443389d;
        com.tencent.unit_rc.BaseObjectDef UR_FC0E = urgen.ur_C563.UR_3275.UR_FC0E();
        kotlin.jvm.internal.o.e(UR_FC0E, "null cannot be cast to non-null type com.tencent.mm.plugin.aff_biz.ur.AffContextManager");
        urgen.ur_C563.UR_3275.UR_7942(((w71.c) ((w71.a) UR_FC0E)).getCppPointer(), gm0.j1.b().h());
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i(this.f425094d, "onCreate");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("mmskia");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("zidl2");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("aff_biz");
        com.tencent.mars.WeChatMars.loadDependentLibrariesAll();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("ilink_network");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("ilink2");
        u71.z.f425116a.a();
        ((d83.u) i95.n0.c(d83.u.class)).Di();
        wi();
    }

    public synchronized void wi() {
        if (this.f425095e) {
            return;
        }
        this.f425095e = true;
        ((d83.u) ((e70.z) i95.n0.c(e70.z.class))).Di();
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) this.f425097g).getValue()).booleanValue();
        ((u71.a) ((jz5.n) this.f425096f).getValue()).getClass();
        urgen.ur_C563.UR_FD5D.UR_5191(booleanValue);
        if (((java.lang.Boolean) ((jz5.n) this.f425097g).getValue()).booleanValue()) {
            com.tencent.wechat.aff.IlinkAuthKeeper.getInstance().initialize("wechat", 0, 0);
        } else {
            com.tencent.wechat.aff.IlinkAuthKeeper.getInstance().initialize("wechat", 2, 0);
        }
        com.tencent.wechat.aff.IlinkAuthKeeper.getInstance().subscribeRequireAuthCodeEvent("AffBizFeatureService-RACE", u71.d.f425092a);
        com.tencent.wechat.aff.AffBizGlobalOnLoader.getInstance().onLoader();
    }
}
