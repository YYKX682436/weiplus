package zv;

/* loaded from: classes11.dex */
public final class a4 implements rv.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f475905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f475906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.PersonalCenterJumpInfo f475907c;

    public a4(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, boolean z17, com.tencent.pigeon.biz_base.PersonalCenterJumpInfo personalCenterJumpInfo) {
        this.f475905a = flutterBrandEcsPlugin;
        this.f475906b = z17;
        this.f475907c = personalCenterJumpInfo;
    }

    @Override // rv.e3
    public final void a(com.tencent.pigeon.biz.BizPublishResultPiegonInfo bizPublishResultPiegonInfo, org.json.JSONObject jSONObject) {
        int i17;
        com.tencent.mars.xlog.Log.i(this.f475905a.f65189d, "openPersonalCenterMiniAppPage receive publishCallback");
        if (this.f475906b) {
            ur1.e eVar = ur1.e.f430346d;
            ur1.e eVar2 = ur1.e.f430346d;
            java.lang.Long serviceType = this.f475907c.getServiceType();
            if (serviceType != null) {
                i17 = (int) serviceType.longValue();
            } else {
                tk.s[] sVarArr = tk.s.f419870d;
                i17 = 2;
            }
            eVar2.a(true, i17);
        }
    }
}
