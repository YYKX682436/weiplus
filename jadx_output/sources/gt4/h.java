package gt4;

/* loaded from: classes8.dex */
public class h implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f275437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gt4.k f275438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f275439c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f275440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f275443g;

    public h(android.content.Context context, gt4.k kVar, android.widget.TextView textView, android.widget.EditText editText, java.lang.String str, java.lang.String str2, android.widget.TextView textView2) {
        this.f275437a = context;
        this.f275438b = kVar;
        this.f275439c = textView;
        this.f275440d = editText;
        this.f275441e = str;
        this.f275442f = str2;
        this.f275443g = textView2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        android.content.Context context = this.f275437a;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            gt4.k kVar = this.f275438b;
            if (kVar != null) {
                ((com.tencent.mm.plugin.remittance.ui.w0) kVar).a(com.tencent.mm.sdk.platformtools.t8.K0(this.f275439c.getText().toString().trim()), this.f275440d.getText().toString().trim(), this.f275441e, this.f275442f, this.f275443g.getText().toString().trim());
            }
            if (context instanceof com.tencent.mm.ui.MMActivity) {
                com.tencent.mm.sdk.platformtools.u3.h(new gt4.g(this));
            }
        }
    }
}
