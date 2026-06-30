package gt4;

/* loaded from: classes8.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.k f275417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f275418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275419f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275420g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f275421h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f275422i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f275423m;

    public e(gt4.k kVar, android.widget.EditText editText, java.lang.String str, java.lang.String str2, android.widget.TextView textView, android.content.Context context, com.tencent.mm.ui.widget.dialog.u1 u1Var) {
        this.f275417d = kVar;
        this.f275418e = editText;
        this.f275419f = str;
        this.f275420g = str2;
        this.f275421h = textView;
        this.f275422i = context;
        this.f275423m = u1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gt4.k kVar = this.f275417d;
        if (kVar != null) {
            ((com.tencent.mm.plugin.remittance.ui.w0) kVar).a(false, this.f275418e.getText().toString().trim(), this.f275419f, this.f275420g, this.f275421h.getText().toString().trim());
        }
        gt4.l.a(this.f275422i, this.f275423m.f211998c);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
