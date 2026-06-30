package ur1;

/* loaded from: classes11.dex */
public final class c implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur1.e f430342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz.BizCallbackApi f430343e;

    public c(ur1.e eVar, com.tencent.pigeon.biz.BizCallbackApi bizCallbackApi) {
        this.f430342d = eVar;
        this.f430343e = bizCallbackApi;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == this.f430342d.f430349c && i18 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("personalizedOperation", 0);
            com.tencent.pigeon.biz.BizCallbackApi bizCallbackApi = this.f430343e;
            if (bizCallbackApi != null) {
                bizCallbackApi.markPersonalizedChanged(intExtra, ur1.b.f430341d);
            }
        }
    }
}
