package lx;

/* loaded from: classes11.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321712e;

    public c3(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, java.lang.String str) {
        this.f321711d = flutterBizPlugin;
        this.f321712e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f321711d.f65254e;
        if (bizBaseCallbackApi != null) {
            java.lang.String cardId = this.f321712e;
            kotlin.jvm.internal.o.f(cardId, "$cardId");
            bizBaseCallbackApi.deleteRecCard(cardId, lx.b3.f321699d);
        }
    }
}
