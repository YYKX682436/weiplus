package or1;

/* loaded from: classes9.dex */
public class a1 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI f347455b;

    public a1(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI, java.lang.String str) {
        this.f347455b = enterpriseBizContactPlainListUI;
        this.f347454a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI = this.f347455b;
            if (enterpriseBizContactPlainListUI.f94024f == 3) {
                android.content.Intent intent = enterpriseBizContactPlainListUI.getIntent();
                intent.putExtra("enterprise_biz_name", this.f347454a);
                enterpriseBizContactPlainListUI.setResult(-1, intent);
                enterpriseBizContactPlainListUI.finish();
            }
        }
    }
}
