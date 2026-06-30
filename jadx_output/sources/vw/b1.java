package vw;

/* loaded from: classes11.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv.j3 f440591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(rv.j3 j3Var) {
        super(1);
        this.f440591d = j3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.r rVar;
        com.tencent.pigeon.biz.BizPoiSelectResult ret = (com.tencent.pigeon.biz.BizPoiSelectResult) obj;
        kotlin.jvm.internal.o.g(ret, "ret");
        rv.j3 j3Var = this.f440591d;
        if (j3Var != null && (rVar = ((com.tencent.mm.plugin.appbrand.jsapi.biz.g) j3Var).f79961a) != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse(2, null, new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse(java.lang.Boolean.valueOf(ret.getType() == com.tencent.pigeon.biz.BizPoiSelectCallbackType.CANCEL), ret.getIgnorePoi(), ret.getPoiId(), ret.getName(), ret.getAddress(), ret.getLatitude(), ret.getLongitude(), ret.getDistrictId(), ret.getContent())));
        }
        return jz5.f0.f302826a;
    }
}
