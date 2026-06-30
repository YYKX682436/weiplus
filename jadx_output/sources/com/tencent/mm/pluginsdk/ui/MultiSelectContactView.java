package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public class MultiSelectContactView extends android.widget.LinearLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f189783x = 0;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f189784d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f189785e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f189786f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f189787g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.a2 f189788h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.b2 f189789i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.c2 f189790m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.LayoutInflater f189791n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Boolean f189792o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f189793p;

    /* renamed from: q, reason: collision with root package name */
    public int f189794q;

    /* renamed from: r, reason: collision with root package name */
    public final int f189795r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f189796s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f189797t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f189798u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f189799v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f189800w;

    public MultiSelectContactView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17;
        this.f189785e = new java.util.ArrayList();
        this.f189792o = java.lang.Boolean.FALSE;
        this.f189793p = new java.util.ArrayList();
        this.f189794q = 0;
        this.f189795r = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479611am);
        this.f189796s = false;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        this.f189791n = from;
        from.inflate(com.tencent.mm.R.layout.c5j, (android.view.ViewGroup) this, true);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447207y);
            i17 = obtainStyledAttributes.getInt(1, 0);
            this.f189792o = java.lang.Boolean.valueOf(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        } else {
            i17 = 0;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f486064k12);
        this.f189784d = recyclerView;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.Q(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new com.tencent.mm.pluginsdk.ui.t1(this));
        this.f189786f = new java.util.HashSet();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7g);
        this.f189787g = findViewById;
        setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478491c));
        if (i17 == 1) {
            findViewById.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.a9e));
            findViewById.setPadding(0, 0, 0, 0);
            recyclerView.setBackground(null);
        } else if (i17 == 2) {
            findViewById.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478492d));
            findViewById.setPadding(0, 0, 0, 0);
            recyclerView.setBackground(null);
        }
        setOnClickListener(new com.tencent.mm.pluginsdk.ui.s1(this));
    }

    public final void a(java.lang.String str, boolean z17) {
        this.f189786f.add(str);
        this.f189785e.add(str);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f189784d;
        int itemCount = recyclerView.getAdapter().getItemCount();
        int i17 = itemCount - 2;
        recyclerView.getAdapter().notifyItemInserted(i17);
        if (!this.f189792o.booleanValue()) {
            i17 = itemCount - 1;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f189784d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "addContact", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView2, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "addContact", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
        j();
        h();
        i();
        com.tencent.mm.pluginsdk.ui.a2 a2Var = this.f189788h;
        if (a2Var != null) {
            a2Var.M3(0, str);
        }
    }

    public final void b() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f189784d;
        if (recyclerView.getChildCount() == 1) {
            return;
        }
        android.view.View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 2);
        if (!this.f189796s || childAt == null) {
            return;
        }
        this.f189796s = false;
        android.view.View findViewById = childAt.findViewById(com.tencent.mm.R.id.jbx);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "clearDelStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "clearDelStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void c() {
        getInputText().setText("");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        try {
            getInputText().clearFocus();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiSeclectContactView", "clearFocus exception:%s", e17);
        }
        b();
    }

    public void d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        b();
        if (this.f189786f.contains(str)) {
            g(str, false, false);
        } else {
            a(str, true);
        }
    }

    public void e(java.util.List list) {
        java.util.ArrayList arrayList = this.f189785e;
        arrayList.clear();
        java.util.HashSet hashSet = this.f189786f;
        hashSet.clear();
        arrayList.addAll(list);
        hashSet.addAll(list);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f189784d;
        recyclerView.getAdapter().notifyDataSetChanged();
        int itemCount = recyclerView.getAdapter().getItemCount();
        int i17 = this.f189792o.booleanValue() ? itemCount - 2 : itemCount - 1;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f189784d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "multiSelectChanged", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView2, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "multiSelectChanged", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
        j();
        h();
        i();
    }

    public void f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f189785e);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g((java.lang.String) it.next(), false, false);
        }
    }

    public final void g(java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mm.pluginsdk.ui.a2 a2Var;
        if (this.f189793p.contains(str)) {
            return;
        }
        java.util.ArrayList arrayList = this.f189785e;
        int indexOf = arrayList.indexOf(str);
        if (indexOf >= 0 && indexOf < arrayList.size()) {
            this.f189786f.remove(arrayList.remove(indexOf));
            this.f189784d.getAdapter().notifyItemRemoved(indexOf);
        }
        j();
        h();
        i();
        if (!z17 || (a2Var = this.f189788h) == null) {
            return;
        }
        a2Var.M3(1, str);
    }

    public android.widget.EditText getInputText() {
        return this.f189797t;
    }

    public java.lang.String getSearchContent() {
        return getInputText() != null ? getInputText().getText().toString() : "";
    }

    public android.view.View getSearchIcon() {
        return this.f189800w;
    }

    public final void h() {
        int e17 = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479858h7);
        if (this.f189784d.getAdapter().getItemCount() > 1) {
            e17 = com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479688cn) + this.f189795r;
        }
        if (getInputText() == null || getInputText().getLayoutParams().height == e17) {
            return;
        }
        getInputText().getLayoutParams().height = e17;
        getInputText().setHeight(e17);
        getInputText().invalidate();
        android.widget.LinearLayout linearLayout = this.f189798u;
        if (linearLayout != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) linearLayout.getLayoutParams();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = e17;
            this.f189798u.setLayoutParams(layoutParams);
            this.f189798u.invalidate();
        }
    }

    public final void i() {
        boolean booleanValue = this.f189792o.booleanValue();
        java.util.ArrayList arrayList = this.f189785e;
        this.f189794q = booleanValue ? arrayList.size() : arrayList.size() + 1;
        int size = arrayList.size();
        int i17 = this.f189795r;
        int B = size == 0 ? i65.a.B(getContext()) - (i17 * 2) : java.lang.Math.max(i17 * 2, this.f189784d.getWidth() - (this.f189794q * i17));
        if (getInputText() == null || getInputText().getLayoutParams().width == B) {
            return;
        }
        getInputText().getLayoutParams().width = B;
        getInputText().setWidth(B);
        getInputText().invalidate();
    }

    public final void j() {
        if (getSearchIcon() != null) {
            android.view.View searchIcon = getSearchIcon();
            int i17 = this.f189784d.getAdapter().getItemCount() <= 1 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(searchIcon, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "updateSearchIconVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            searchIcon.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(searchIcon, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "updateSearchIconVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setDefaultHint(java.lang.String str) {
        this.f189799v = str;
    }

    public void setForBidDelContactList(java.util.ArrayList<java.lang.String> arrayList) {
        this.f189793p = arrayList;
    }

    public void setOnContactDeselectListener(com.tencent.mm.pluginsdk.ui.a2 a2Var) {
        this.f189788h = a2Var;
    }

    public void setOnSearchTextChangeListener(com.tencent.mm.pluginsdk.ui.b2 b2Var) {
        this.f189789i = b2Var;
    }

    public void setOnSearchTextFouceChangeListener(com.tencent.mm.pluginsdk.ui.c2 c2Var) {
        this.f189790m = c2Var;
    }
}
