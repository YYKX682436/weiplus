package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class n0 extends kr3.t {

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f154100r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f154101s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f154102t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f154103u;

    /* renamed from: v, reason: collision with root package name */
    public int f154104v;

    /* renamed from: w, reason: collision with root package name */
    public int f154105w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f154106x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f154107y;

    /* renamed from: z, reason: collision with root package name */
    public int f154108z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f154100r = p0Var;
        this.f154101s = p0Var;
        this.f154102t = jz5.h.b(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.k0(activity));
        this.f154106x = new java.util.ArrayList();
        this.f154107y = new java.util.ArrayList();
    }

    @Override // kr3.t
    public java.lang.Object R6(kotlin.coroutines.Continuation continuation) {
        return ((j93.n) ((jz5.n) this.f154102t).getValue()).P6(continuation);
    }

    @Override // kr3.t
    public java.lang.String V6() {
        return "ModLabelUIC";
    }

    @Override // kr3.t
    public lr3.a Y6() {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j0(this);
    }

    @Override // kr3.t
    public boolean Z6() {
        if (this.f154100r.size() != this.f154101s.size()) {
            return true;
        }
        return !this.f154101s.containsAll(this.f154100r);
    }

    @Override // kr3.t
    public android.view.View b7(java.lang.String username, com.tencent.mm.contact.o contact) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(contact, "contact");
        j93.n nVar = (j93.n) ((jz5.n) this.f154102t).getValue();
        jz5.g gVar = this.f311485p;
        nVar.S6(username, ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue(), this.f311477e, new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.l0(this));
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView sayHiItemView = new com.tencent.mm.plugin.profile.ui.widget.SayHiItemView(getActivity());
        sayHiItemView.getUi().a().setPadding(0, 0, 0, 0);
        sayHiItemView.setHint(getString(com.tencent.mm.R.string.gxs));
        java.util.List h17 = com.tencent.mm.plugin.profile.n2.f153540a.h(contact);
        this.f154100r = h17;
        this.f154101s = h17;
        if (!h17.isEmpty()) {
            sayHiItemView.setContent(kz5.n0.g0(this.f154100r, getString(com.tencent.mm.R.string.f490924ba0), null, null, 0, null, null, 62, null));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_stranger", ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
        intent.putExtra("selected_labels", this.f154106x);
        intent.putExtra("selected_source", this.f154107y);
        sayHiItemView.setOnClickListener(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.m0(this, intent));
        return sayHiItemView;
    }

    @Override // kr3.t
    public void d7() {
        java.util.List W6 = ((j93.n) ((jz5.n) this.f154102t).getValue()).W6(this.f154100r);
        this.f154100r = W6;
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView sayHiItemView = (com.tencent.mm.plugin.profile.ui.widget.SayHiItemView) this.f311480h;
        if (sayHiItemView != null) {
            sayHiItemView.setContent(kz5.n0.g0(W6, getString(com.tencent.mm.R.string.f490924ba0), null, null, 0, null, null, 62, null));
        }
        super.d7();
    }

    @Override // kr3.t
    public void f7(com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct struct) {
        kotlin.jvm.internal.o.g(struct, "struct");
        long j17 = 0;
        struct.f59966e = this.f154103u ? 1L : 0L;
        struct.f59971j = this.f154101s.size();
        struct.f59975n = ((java.util.ArrayList) ((b93.b) c93.a.a()).c()).size();
        int size = this.f154101s.size();
        java.util.Iterator it = this.f154107y.iterator();
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
        struct.f59973l = j17 + j18 + this.f154108z;
        struct.f59972k = size;
        struct.f59969h = j17;
        struct.f59970i = j18;
        struct.f59968g = this.f154104v;
        struct.f59967f = this.f154105w;
    }

    @Override // kr3.t
    public int i7() {
        return 39;
    }

    @Override // kr3.t
    public int k7() {
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
            this.f154106x = stringArrayListExtra2;
        }
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("selected_source");
        if (integerArrayListExtra != null) {
            this.f154107y = integerArrayListExtra;
        }
        this.f154104v += intent.getIntExtra("search_add_new_label_cnt", 0);
        this.f154105w += intent.getIntExtra("button_add_new_label_cnt", 0);
        d7();
    }
}
