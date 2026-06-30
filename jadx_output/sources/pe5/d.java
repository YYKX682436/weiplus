package pe5;

/* loaded from: classes12.dex */
public final class d implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pe5.f f353733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o70.k f353734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f353735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f353737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f353738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t15.a f353739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pe5.h f353740h;

    public d(pe5.f fVar, o70.k kVar, int i17, java.lang.String str, int i18, long j17, t15.a aVar, pe5.h hVar) {
        this.f353733a = fVar;
        this.f353734b = kVar;
        this.f353735c = i17;
        this.f353736d = str;
        this.f353737e = i18;
        this.f353738f = j17;
        this.f353739g = aVar;
        this.f353740h = hVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        pe5.h hVar = this.f353740h;
        if (z17) {
            pe5.f.a(this.f353733a, this.f353734b, this.f353735c, this.f353736d, this.f353737e, this.f353738f, this.f353739g);
            ((com.tencent.mm.ui.chatting.sc) hVar).a();
            return;
        }
        com.tencent.mm.ui.chatting.SendImgProxyUI sendImgProxyUI = ((com.tencent.mm.ui.chatting.sc) hVar).f202671a;
        if (!sendImgProxyUI.isFinishing()) {
            sendImgProxyUI.f198316e.dismiss();
        }
        com.tencent.mm.ui.chatting.SendImgProxyUI.f198315g = false;
        sendImgProxyUI.setResult(0, sendImgProxyUI.getIntent());
        if (sendImgProxyUI.isFinishing()) {
            return;
        }
        sendImgProxyUI.finish();
    }
}
