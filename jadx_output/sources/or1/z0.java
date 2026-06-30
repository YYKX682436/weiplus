package or1;

/* loaded from: classes9.dex */
public class z0 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.co f347604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI f347605b;

    public z0(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI, r45.co coVar) {
        this.f347605b = enterpriseBizContactPlainListUI;
        this.f347604a = coVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI = this.f347605b;
            android.content.Intent intent = enterpriseBizContactPlainListUI.getIntent();
            intent.putExtra("enterprise_biz_name", this.f347604a.f371676d);
            enterpriseBizContactPlainListUI.setResult(-1, intent);
            enterpriseBizContactPlainListUI.finish();
        }
    }
}
