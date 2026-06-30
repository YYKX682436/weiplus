package gt4;

/* loaded from: classes8.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.k f275409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f275410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f275411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f275412g;

    public d(gt4.k kVar, android.widget.EditText editText, android.content.Context context, com.tencent.mm.ui.widget.dialog.u1 u1Var) {
        this.f275409d = kVar;
        this.f275410e = editText;
        this.f275411f = context;
        this.f275412g = u1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gt4.k kVar = this.f275409d;
        if (kVar != null) {
            ((com.tencent.mm.plugin.remittance.ui.w0) kVar).a(true, this.f275410e.getText().toString().trim(), null, null, null);
        }
        gt4.l.a(this.f275411f, this.f275412g.f211998c);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
