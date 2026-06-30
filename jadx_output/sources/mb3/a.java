package mb3;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f325351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f325352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mb3.d f325353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI f325354g;

    public a(com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI wxaLuckyMoneyBaseUI, java.lang.Class cls, android.content.Intent intent, mb3.d dVar) {
        this.f325354g = wxaLuckyMoneyBaseUI;
        this.f325351d = cls;
        this.f325352e = intent;
        this.f325353f = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f325354g.T6(this.f325351d, this.f325352e, this.f325353f);
    }
}
