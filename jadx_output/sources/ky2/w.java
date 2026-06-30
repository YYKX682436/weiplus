package ky2;

/* loaded from: classes.dex */
public final class w extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f313584d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f313585e;

    /* renamed from: f, reason: collision with root package name */
    public final int f313586f;

    /* renamed from: g, reason: collision with root package name */
    public final int f313587g;

    /* renamed from: h, reason: collision with root package name */
    public final int f313588h;

    /* renamed from: i, reason: collision with root package name */
    public final int f313589i;

    /* renamed from: m, reason: collision with root package name */
    public final int f313590m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f313591n;

    /* renamed from: o, reason: collision with root package name */
    public int f313592o;

    /* renamed from: p, reason: collision with root package name */
    public int f313593p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f313594q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f313595r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f313596s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f313597t;

    /* renamed from: u, reason: collision with root package name */
    public final ky2.v f313598u;

    public w(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f313584d = context;
        this.f313585e = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f313586f = 50;
        this.f313587g = 24;
        this.f313588h = 60;
        this.f313589i = 1;
        this.f313590m = 2;
        this.f313592o = 2;
        this.f313593p = -1;
        this.f313596s = new java.util.HashMap();
        this.f313598u = new ky2.v(this);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f313585e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((ky2.r) this.f313585e.get(i17)).f313577c;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        android.view.View view;
        android.widget.EditText editText;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        java.lang.Object Z = kz5.n0.Z(payloads);
        if ((Z instanceof java.lang.Integer) && kotlin.jvm.internal.o.b(Z, java.lang.Integer.valueOf(i17))) {
            ky2.q qVar = holder instanceof ky2.q ? (ky2.q) holder : null;
            if (qVar == null || (view = qVar.itemView) == null || (editText = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.p9w)) == null) {
                return;
            }
            editText.requestFocus();
            return;
        }
        onBindViewHolder(holder, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b1r, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new ky2.h(this, inflate);
        }
        if (i17 == 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b1k, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new ky2.j(this, inflate2);
        }
        if (i17 != 2) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b1o, parent, false);
            kotlin.jvm.internal.o.d(inflate3);
            return new ky2.q(this, inflate3);
        }
        android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b1o, parent, false);
        kotlin.jvm.internal.o.d(inflate4);
        return new ky2.q(this, inflate4);
    }

    public final void x() {
        java.util.List dataList = this.f313585e;
        kotlin.jvm.internal.o.f(dataList, "dataList");
        java.util.Iterator it = dataList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!(((ky2.r) it.next()).f313575a.length() == 0)) {
                i17++;
            }
        }
        yz5.l lVar = this.f313595r;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(i17 >= 2));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        int itemViewType = holder.getItemViewType();
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        if (itemViewType == 0) {
            ky2.h hVar = holder instanceof ky2.h ? (ky2.h) holder : null;
            if (hVar != null) {
                android.view.View itemView = holder.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) itemView.findViewById(com.tencent.mm.R.id.p_7);
                android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.p_8);
                android.widget.EditText editText = (android.widget.EditText) itemView.findViewById(com.tencent.mm.R.id.p_a);
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) itemView.findViewById(com.tencent.mm.R.id.p_9);
                android.widget.TextView textView2 = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.p__);
                kotlin.jvm.internal.o.d(textView);
                com.tencent.mm.ui.fk.a(textView);
                ky2.w wVar = hVar.f313549d;
                linearLayout.setOnClickListener(new ky2.d(itemView, wVar, i17, textView));
                android.text.InputFilter[] inputFilterArr = {new ky2.t(wVar), new ky2.u(wVar.f313588h, t4Var)};
                if (editText != null) {
                    editText.setFilters(inputFilterArr);
                }
                editText.setOnFocusChangeListener(new ky2.e(itemView, wVar));
                ky2.v vVar = wVar.f313598u;
                editText.removeTextChangedListener(vVar);
                editText.addTextChangedListener(vVar);
                frameLayout.setOnClickListener(new ky2.g(wVar, itemView, textView2, i17));
                return;
            }
            return;
        }
        if (itemViewType == 1) {
            ky2.j jVar = holder instanceof ky2.j ? (ky2.j) holder : null;
            if (jVar != null) {
                android.view.View itemView2 = holder.itemView;
                kotlin.jvm.internal.o.f(itemView2, "itemView");
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) itemView2.findViewById(com.tencent.mm.R.id.p9u);
                constraintLayout.setOnClickListener(new ky2.i(i17, jVar.f313554d, constraintLayout, (android.widget.TextView) itemView2.findViewById(com.tencent.mm.R.id.p9z)));
                return;
            }
            return;
        }
        if (itemViewType != 2) {
            return;
        }
        ky2.q qVar = holder instanceof ky2.q ? (ky2.q) holder : null;
        if (qVar != null) {
            android.view.View itemView3 = holder.itemView;
            kotlin.jvm.internal.o.f(itemView3, "itemView");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView3.findViewById(com.tencent.mm.R.id.p9v);
            android.widget.EditText editText2 = (android.widget.EditText) itemView3.findViewById(com.tencent.mm.R.id.p9w);
            ky2.w wVar2 = qVar.f313574d;
            editText2.removeTextChangedListener((android.text.TextWatcher) ((java.util.HashMap) wVar2.f313596s).get(java.lang.Integer.valueOf(itemView3.hashCode())));
            ky2.a aVar = new ky2.a(wVar2);
            aVar.f313505d = i17;
            ((java.util.HashMap) wVar2.f313596s).put(java.lang.Integer.valueOf(itemView3.hashCode()), aVar);
            editText2.addTextChangedListener(aVar);
            java.util.List list = wVar2.f313585e;
            editText2.setText(((ky2.r) list.get(i17)).f313575a);
            weImageView.setOnClickListener(new ky2.k(wVar2, i17, editText2, itemView3));
            editText2.setFocusable(true);
            editText2.setFocusableInTouchMode(true);
            editText2.setCursorVisible(true);
            editText2.setFilters(new android.text.InputFilter[]{new ky2.t(wVar2), new ky2.u(wVar2.f313587g, t4Var)});
            editText2.setOnEditorActionListener(new ky2.l(wVar2, i17, editText2));
            editText2.setOnFocusChangeListener(new ky2.o(itemView3, wVar2, editText2, i17));
            if (wVar2.f313593p == i17 && i17 == list.size() - 2) {
                editText2.requestFocus();
                wVar2.f313593p = -1;
            } else if (i17 == 1 && ((ky2.r) list.get(i17)).f313577c == 2 && wVar2.f313591n) {
                itemView3.postDelayed(new ky2.p(editText2, wVar2), 300L);
            }
        }
    }
}
