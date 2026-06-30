package zv;

/* loaded from: classes11.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476066e;

    public o2(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, java.lang.String str) {
        this.f476065d = flutterBrandEcsPlugin;
        this.f476066e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f476065d.f65190e;
        if (bizBaseCallbackApi != null) {
            java.lang.String cardId = this.f476066e;
            kotlin.jvm.internal.o.f(cardId, "$cardId");
            bizBaseCallbackApi.deleteRecCard(cardId, zv.n2.f476060d);
        }
    }
}
