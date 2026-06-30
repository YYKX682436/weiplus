package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class o0 extends kr3.j {

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f153959r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f153960s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f153961t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f153962u;

    /* renamed from: v, reason: collision with root package name */
    public int f153963v;

    /* renamed from: w, reason: collision with root package name */
    public int f153964w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f153965x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f153966y;

    /* renamed from: z, reason: collision with root package name */
    public int f153967z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f153959r = p0Var;
        this.f153960s = p0Var;
        this.f153961t = jz5.h.b(new com.tencent.mm.plugin.profile.ui.mod.components.l0(activity));
        this.f153965x = new java.util.ArrayList();
        this.f153966y = new java.util.ArrayList();
    }

    @Override // kr3.j
    public java.lang.Object R6(kotlin.coroutines.Continuation continuation) {
        return ((j93.n) ((jz5.n) this.f153961t).getValue()).P6(continuation);
    }

    @Override // kr3.j
    public java.lang.String V6() {
        return "ModLabelUIC";
    }

    @Override // kr3.j
    public lr3.a Z6() {
        return new com.tencent.mm.plugin.profile.ui.mod.components.k0(this);
    }

    @Override // kr3.j
    public boolean a7() {
        if (this.f153959r.size() != this.f153960s.size()) {
            return true;
        }
        return !this.f153960s.containsAll(this.f153959r);
    }

    @Override // kr3.j
    public android.view.View c7(java.lang.String username, com.tencent.mm.storage.z3 contact) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(contact, "contact");
        j93.n nVar = (j93.n) ((jz5.n) this.f153961t).getValue();
        jz5.g gVar = this.f311398p;
        nVar.S6(username, ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue(), this.f311390e, new com.tencent.mm.plugin.profile.ui.mod.components.m0(this));
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView sayHiItemView = new com.tencent.mm.plugin.profile.ui.widget.SayHiItemView(getActivity());
        sayHiItemView.getUi().a().setPadding(0, 0, 0, 0);
        sayHiItemView.setHint(getString(com.tencent.mm.R.string.gxs));
        java.util.List i17 = com.tencent.mm.plugin.profile.n2.f153540a.i(contact);
        this.f153959r = i17;
        this.f153960s = i17;
        if (!i17.isEmpty()) {
            sayHiItemView.setContent(kz5.n0.g0(this.f153959r, getString(com.tencent.mm.R.string.f490924ba0), null, null, 0, null, null, 62, null));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_stranger", ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
        intent.putExtra("selected_labels", this.f153965x);
        intent.putExtra("selected_source", this.f153966y);
        sayHiItemView.setOnClickListener(new com.tencent.mm.plugin.profile.ui.mod.components.n0(this, intent));
        return sayHiItemView;
    }

    @Override // kr3.j
    public void e7() {
        java.util.List W6 = ((j93.n) ((jz5.n) this.f153961t).getValue()).W6(this.f153959r);
        this.f153959r = W6;
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView sayHiItemView = (com.tencent.mm.plugin.profile.ui.widget.SayHiItemView) this.f311393h;
        if (sayHiItemView != null) {
            sayHiItemView.setContent(kz5.n0.g0(W6, getString(com.tencent.mm.R.string.f490924ba0), null, null, 0, null, null, 62, null));
        }
        super.e7();
    }

    @Override // kr3.j
    public void g7(com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct struct) {
        kotlin.jvm.internal.o.g(struct, "struct");
        long j17 = 0;
        struct.f59966e = this.f153962u ? 1L : 0L;
        struct.f59971j = this.f153960s.size();
        struct.f59975n = ((java.util.ArrayList) ((b93.b) c93.a.a()).c()).size();
        int size = this.f153960s.size();
        java.util.Iterator it = this.f153966y.iterator();
        long j18 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (intValue == 0) {
                size--;
            } else if (intValue == 1) {
                j17++;
            } else if (intValue == 2) {
                j18++;
            }
        }
        struct.f59973l = j17 + j18 + this.f153967z;
        struct.f59972k = size;
        struct.f59969h = j17;
        struct.f59970i = j18;
        struct.f59968g = this.f153963v;
        struct.f59967f = this.f153964w;
    }

    @Override // kr3.j
    public int k7() {
        return 39;
    }

    @Override // kr3.j
    public int l7() {
        return com.tencent.mm.R.string.gxu;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 != 600 || intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("result_label_id_list")) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.n0.V(stringArrayListExtra));
        int intExtra = intent.getIntExtra("recommend_label_adopt_count", 0);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((j93.n) pf5.z.f353948a.a(activity).a(j93.n.class)).O6(arrayList, intExtra);
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("selected_labels");
        if (stringArrayListExtra2 != null) {
            this.f153965x = stringArrayListExtra2;
        }
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("selected_source");
        if (integerArrayListExtra != null) {
            this.f153966y = integerArrayListExtra;
        }
        this.f153963v += intent.getIntExtra("search_add_new_label_cnt", 0);
        this.f153964w += intent.getIntExtra("button_add_new_label_cnt", 0);
        e7();
    }
}
