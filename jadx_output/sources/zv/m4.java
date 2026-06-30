package zv;

/* loaded from: classes9.dex */
public final class m4 extends com.tencent.pigeon.brand_service.AutoSetupBrandServiceResidentApi {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f476055a = "MicroMsg.FlutterBrandEcsResidentPlugin";

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f476056b = jz5.h.b(zv.l4.f476027d);

    public final e31.k a() {
        return (e31.k) ((jz5.n) this.f476056b).getValue();
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceResidentApi
    public boolean checkAndShowPushPermissionTipsDialog() {
        android.content.Context context;
        java.lang.ref.WeakReference i17 = com.tencent.mm.app.w.INSTANCE.i();
        if (i17 == null || (context = (android.app.Activity) i17.get()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        uw.p pVar = uw.p.f431501a;
        kotlin.jvm.internal.o.d(context);
        return pVar.c(context);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceResidentApi
    public void getContactInfo(java.lang.String userName, yz5.l callback) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.pigeon.biz_base.ContactInfo d17 = zv.q.f476079a.d(userName);
        com.tencent.mars.xlog.Log.i(this.f476055a, "ContactInfo(userName='" + d17.getUserName() + "', nickName='" + d17.getNickName() + "', isContact=" + d17.isContact() + ", isPlaceTop=" + d17.isPlaceTop() + ')');
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.brand_service.BSContactInfo(d17.getUserName(), d17.getNickName(), d17.isContact(), d17.isPlaceTop(), d17.isMute()))));
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceResidentApi
    public com.tencent.pigeon.brand_service.BrsResidentStrategyConfig getStrategyConfig() {
        x20.a aVar = x20.a.f451484a;
        aVar.getClass();
        f06.v[] vVarArr = x20.a.f451485b;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(1 == ((java.lang.Number) x20.a.f451505v.b(aVar, vVarArr[18])).intValue());
        e31.k a17 = a();
        return new com.tencent.pigeon.brand_service.BrsResidentStrategyConfig(valueOf, null, java.lang.Boolean.valueOf(a17 != null ? ((g31.l) a17).f268094g : false), java.lang.Boolean.valueOf(((java.lang.Number) x20.a.f451488e.b(aVar, vVarArr[2])).intValue() == 1), java.lang.Boolean.valueOf(((java.lang.Boolean) x20.a.B.b(aVar, vVarArr[24])).booleanValue()), 2, null);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceResidentApi
    public com.tencent.pigeon.brand_service.BrsResidentTemplateMsgScope getTemplateMsgScope(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        e31.k a17 = a();
        boolean n17 = a17 != null ? ((g31.l) a17).n(username) : false;
        if (!n17) {
            e31.k a18 = a();
            if (a18 != null) {
                ((g31.l) a18).m(username, null);
            }
            e31.k a19 = a();
            n17 = a19 != null ? ((g31.l) a19).n(username) : false;
        }
        return new com.tencent.pigeon.brand_service.BrsResidentTemplateMsgScope(username, java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(n17), null, 8, null);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceResidentApi
    public com.tencent.pigeon.brand_service.BrsResidentTemplateMsgScopeItem getTemplateMsgScopeItem(java.lang.String username, java.lang.String scopeId) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(scopeId, "scopeId");
        java.lang.String str = this.f476055a;
        com.tencent.mars.xlog.Log.i(str, "[BRS] getTemplateMsgScopeItem username=" + username + ", scopeId=" + scopeId);
        e31.k a17 = a();
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem o17 = a17 != null ? ((g31.l) a17).o(username, scopeId) : null;
        if (o17 != null) {
            return new com.tencent.pigeon.brand_service.BrsResidentTemplateMsgScopeItem(o17.f71803f, java.lang.Long.valueOf(o17.f71819y), java.lang.Boolean.valueOf(o17.f71807m == 1), java.lang.Boolean.valueOf(o17.B), java.lang.Boolean.valueOf(o17.C));
        }
        com.tencent.mars.xlog.Log.e(str, "[BRS] getTemplateMsgScopeItem: templateItem not found for scopeId=".concat(scopeId));
        return null;
    }
}
