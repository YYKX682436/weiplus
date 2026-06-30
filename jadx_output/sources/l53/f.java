package l53;

/* loaded from: classes8.dex */
public final class f implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l53.i f316651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f316653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316654g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f316655h;

    public f(l53.i iVar, java.lang.String str, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, java.lang.String str2, java.util.HashMap hashMap) {
        this.f316651d = iVar;
        this.f316652e = str;
        this.f316653f = mMFragmentActivity;
        this.f316654g = str2;
        this.f316655h = hashMap;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1001) {
            l53.i iVar = this.f316651d;
            if (i18 != -1) {
                l53.a aVar = iVar.f316662c;
                if (aVar != null) {
                    aVar.onCancel();
                }
                com.tencent.mars.xlog.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video ,shareToFriend cancel");
                return;
            }
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                l53.a aVar2 = iVar.f316662c;
                if (aVar2 != null) {
                    aVar2.a("toUser is null");
                }
                com.tencent.mars.xlog.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , toUser is null");
            }
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            k70.v vVar = (k70.v) i95.n0.c(k70.v.class);
            java.lang.String str = this.f316652e;
            ((j70.e) vVar).Ai(str, new l53.e(this.f316651d, this.f316653f, this.f316654g, str, stringExtra, this.f316655h, stringExtra2));
        }
    }
}
