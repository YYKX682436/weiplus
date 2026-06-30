package nb3;

/* loaded from: classes9.dex */
public class i implements nb3.a {

    /* renamed from: a, reason: collision with root package name */
    public nb3.b f336053a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f336054b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f336055c;

    /* renamed from: d, reason: collision with root package name */
    public int f336056d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f336057e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f336058f = new java.util.LinkedList();

    public static void a(nb3.i iVar, java.lang.String str, android.content.Intent intent) {
        nb3.b bVar = iVar.f336053a;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaLuckyMoneyLogicDetail", "fail ui == null");
            return;
        }
        ((com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI) bVar).V6();
        com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI wxaLuckyMoneyDetailUI = (com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI) iVar.f336053a;
        wxaLuckyMoneyDetailUI.getClass();
        db5.e1.T(wxaLuckyMoneyDetailUI, str);
        ((com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI) iVar.f336053a).f145016m = intent;
    }

    public final void b(int i17) {
        new lb3.d(this.f336055c, this.f336054b, i17).a(new nb3.h(this, i17));
    }
}
