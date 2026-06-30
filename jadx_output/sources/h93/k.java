package h93;

/* loaded from: classes11.dex */
public final class k extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.List f279707q = kz5.c0.i(h93.t.class, h93.q.class, h93.r.class, h93.o.class);

    /* renamed from: d, reason: collision with root package name */
    public java.util.HashMap f279708d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f279709e;

    /* renamed from: f, reason: collision with root package name */
    public final no.a f279710f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f279711g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f279712h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f279713i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f279714m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f279715n;

    /* renamed from: o, reason: collision with root package name */
    public int f279716o;

    /* renamed from: p, reason: collision with root package name */
    public int f279717p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f279708d = new java.util.HashMap();
        this.f279709e = new java.util.ArrayList();
        this.f279710f = new no.a();
        this.f279711g = new java.util.ArrayList();
        this.f279712h = h93.j.f279706d;
        this.f279713i = jz5.h.b(new h93.d(this));
    }

    public final java.util.ArrayList O6() {
        return new java.util.ArrayList(this.f279708d.keySet());
    }

    public final void P6(boolean z17) {
        java.lang.String obj;
        java.lang.String obj2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LabelStateUIC", "startCreateNewLabel");
        android.content.Intent intent = new android.content.Intent();
        java.lang.Object value = ((jz5.n) this.f279713i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.text.Editable text = ((com.tencent.mm.ui.widget.MMEditText) value).getText();
        if (text != null && (obj = text.toString()) != null && (obj2 = r26.n0.u0(obj).toString()) != null && (!r26.n0.N(obj2))) {
            intent.putExtra("create_label_from_search", obj2);
        }
        intent.putExtra("Contact_ReportSessionId", this.f279715n);
        intent.putExtra("label_username", this.f279714m);
        java.lang.String name = com.tencent.mm.plugin.label.ui.ContactLabelCreateUI.class.getName();
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        cVar.f20922a.f20924a = getContext();
        cVar.a(name);
        cVar.h(z17 ? 1001 : 1000);
    }

    public final void Q6() {
        java.util.ArrayList<java.lang.String> O6 = O6();
        for (java.lang.Class cls : f279707q) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            h93.c cVar = (h93.c) pf5.z.f353948a.a(activity).a(cls);
            cVar.getClass();
            java.lang.Object O62 = cVar.O6();
            if (O62 instanceof com.tencent.mm.plugin.label.ui.widget.MMLabelPanel) {
                ((com.tencent.mm.plugin.label.ui.widget.MMLabelPanel) O62).setTagsSelected(O6);
            }
        }
        this.f279712h.invoke();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.LabelStateUIC", "onActivityResult: requestCode=" + i17 + ", resultCode=" + i18);
        if (i17 == 1000 || i17 == 1001) {
            if (i18 == -1) {
                java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("create_label_by_half_screen_create", -1)) : null;
                if ((valueOf != null) && (valueOf == null || valueOf.intValue() != -1)) {
                    if (i17 == 1000) {
                        this.f279716o++;
                    } else if (i17 == 1001) {
                        this.f279717p++;
                    }
                    this.f279709e.add(valueOf);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LabelStateUIC", "onActivityResult: create new label: " + valueOf);
                }
            }
            java.lang.Object value = ((jz5.n) this.f279713i).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.text.Editable text = ((com.tencent.mm.ui.widget.MMEditText) value).getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f279714m = getIntent().getStringExtra("label_username");
        getIntent().getBooleanExtra("is_stranger", false);
        this.f279715n = getIntent().getStringExtra("Contact_ReportSessionId");
        java.lang.Object value = ((jz5.n) this.f279713i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.ui.widget.MMEditText) value).addTextChangedListener(new h93.i(this));
        kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new h93.h(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new h93.h(this, null), 3, null);
    }
}
