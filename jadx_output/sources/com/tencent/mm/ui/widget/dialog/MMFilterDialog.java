package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes12.dex */
public class MMFilterDialog extends android.widget.LinearLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f211690t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f211691d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f211692e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f211693f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f211694g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.q2 f211695h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f211696i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.s2 f211697m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.x2 f211698n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y2 f211699o;

    /* renamed from: p, reason: collision with root package name */
    public int f211700p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f211701q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.animation.Animation f211702r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.animation.Animation f211703s;

    public MMFilterDialog(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211698n = com.tencent.mm.ui.widget.dialog.x2.DivideEqual;
        this.f211699o = com.tencent.mm.ui.widget.dialog.y2.Grey;
        this.f211700p = -1;
        this.f211701q = new java.util.ArrayList();
        b(context, attributeSet);
    }

    public final void a() {
        int i17 = this.f211700p;
        if (i17 >= 0) {
            this.f211697m.notifyItemChanged(i17, new android.util.Pair(com.tencent.mm.ui.widget.dialog.t2.IsExpand, java.lang.Boolean.FALSE));
        }
        this.f211700p = -1;
        if (this.f211692e.getVisibility() == 0) {
            android.view.View view = this.f211691d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "collapseDropdown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "collapseDropdown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f211703s.setAnimationListener(new com.tencent.mm.ui.widget.dialog.m2(this));
            this.f211692e.startAnimation(this.f211703s);
        }
    }

    public final void b(android.content.Context context, android.util.AttributeSet attributeSet) {
        int dimensionPixelSize;
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bye, this);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.tas);
        this.f211696i = recyclerView;
        recyclerView.getClass();
        com.tencent.mm.ui.widget.dialog.s2 s2Var = new com.tencent.mm.ui.widget.dialog.s2(this.f211701q, this.f211699o);
        this.f211697m = s2Var;
        s2Var.f211968d = new com.tencent.mm.ui.widget.dialog.v2() { // from class: com.tencent.mm.ui.widget.dialog.MMFilterDialog$$a
            @Override // com.tencent.mm.ui.widget.dialog.v2
            public final void a(int i17, java.lang.Object obj) {
                com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog = com.tencent.mm.ui.widget.dialog.MMFilterDialog.this;
                int i18 = mMFilterDialog.f211700p;
                if (i18 == i17) {
                    mMFilterDialog.a();
                    return;
                }
                com.tencent.mm.ui.widget.dialog.t2 t2Var = com.tencent.mm.ui.widget.dialog.t2.IsExpand;
                if (i18 >= 0) {
                    mMFilterDialog.f211697m.notifyItemChanged(i18, new android.util.Pair(t2Var, java.lang.Boolean.FALSE));
                }
                mMFilterDialog.f211697m.notifyItemChanged(i17, new android.util.Pair(t2Var, java.lang.Boolean.TRUE));
                mMFilterDialog.f211700p = i17;
                com.tencent.mm.ui.widget.dialog.q2 q2Var = mMFilterDialog.f211695h;
                q2Var.f211953d = (com.tencent.mm.ui.widget.dialog.p2) obj;
                q2Var.notifyDataSetChanged();
                if (mMFilterDialog.f211692e.getVisibility() != 0) {
                    mMFilterDialog.f211692e.setVisibility(0);
                    mMFilterDialog.f211692e.startAnimation(mMFilterDialog.f211702r);
                    if (mMFilterDialog.f211691d.getVisibility() != 0) {
                        android.view.View view = mMFilterDialog.f211691d;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "toggleDropdown", "(ILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "toggleDropdown", "(ILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        mMFilterDialog.f211691d.startAnimation(android.view.animation.AnimationUtils.loadAnimation(mMFilterDialog.getContext(), com.tencent.mm.R.anim.f477783bc));
                    }
                }
            }
        };
        this.f211696i.setAdapter(s2Var);
        if (this.f211698n == com.tencent.mm.ui.widget.dialog.x2.AlignLeft) {
            this.f211696i.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
        } else {
            this.f211696i.setLayoutManager(new com.tencent.mm.ui.widget.dialog.o2(null));
        }
        this.f211696i.N(new com.tencent.mm.ui.widget.dialog.l2(this, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)));
        this.f211691d = findViewById(com.tencent.mm.R.id.aai);
        this.f211693f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.af9);
        this.f211692e = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.czs);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.koq);
        this.f211694g = recyclerView2;
        recyclerView2.setHasFixedSize(true);
        this.f211694g.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        com.tencent.mm.ui.widget.dialog.q2 q2Var = new com.tencent.mm.ui.widget.dialog.q2(null);
        this.f211695h = q2Var;
        q2Var.f211954e = new com.tencent.mm.ui.widget.dialog.v2() { // from class: com.tencent.mm.ui.widget.dialog.MMFilterDialog$$b
            @Override // com.tencent.mm.ui.widget.dialog.v2
            public final void a(int i17, java.lang.Object obj) {
                int i18 = com.tencent.mm.ui.widget.dialog.MMFilterDialog.f211690t;
                com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog = com.tencent.mm.ui.widget.dialog.MMFilterDialog.this;
                mMFilterDialog.getClass();
                if (((com.tencent.mm.ui.widget.dialog.p2) obj).d(i17)) {
                    mMFilterDialog.a();
                }
            }
        };
        this.f211694g.setAdapter(q2Var);
        this.f211695h.notifyDataSetChanged();
        this.f211702r = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477854dc);
        this.f211703s = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477858dg);
        this.f211691d.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.widget.dialog.MMFilterDialog$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.ui.widget.dialog.MMFilterDialog.f211690t;
                com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog = com.tencent.mm.ui.widget.dialog.MMFilterDialog.this;
                mMFilterDialog.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/widget/dialog/MMFilterDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", mMFilterDialog, array);
                mMFilterDialog.a();
                yj0.a.h(mMFilterDialog, "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (attributeSet == null || (dimensionPixelSize = context.obtainStyledAttributes(attributeSet, yl5.a.f463104k).getDimensionPixelSize(0, -1)) <= 0) {
            return;
        }
        this.f211696i.getLayoutParams().height = dimensionPixelSize;
        android.view.ViewGroup.LayoutParams layoutParams = this.f211694g.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        this.f211693f.setBackgroundColor(i17);
        ((android.graphics.drawable.GradientDrawable) this.f211692e.getBackground()).setColor(i17);
    }

    public void setFilterItemList(java.util.List<com.tencent.mm.ui.widget.dialog.p2> list) {
        java.util.List list2 = this.f211701q;
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.widget.dialog.p2) it.next()).f211945a = null;
        }
        list2.clear();
        list2.addAll(list);
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.ui.widget.dialog.p2) it6.next()).f211945a = new com.tencent.mm.ui.widget.dialog.MMFilterDialog$$d(this);
        }
        this.f211697m.notifyDataSetChanged();
    }

    public void setLayoutStyle(com.tencent.mm.ui.widget.dialog.x2 x2Var) {
        if (this.f211698n == x2Var) {
            return;
        }
        this.f211698n = x2Var;
        if (x2Var == com.tencent.mm.ui.widget.dialog.x2.AlignLeft) {
            this.f211696i.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
        } else {
            this.f211696i.setLayoutManager(new com.tencent.mm.ui.widget.dialog.o2(null));
        }
    }

    public void setSheetType(com.tencent.mm.ui.widget.dialog.y2 y2Var) {
        if (this.f211699o == y2Var) {
            return;
        }
        this.f211699o = y2Var;
        com.tencent.mm.ui.widget.dialog.s2 s2Var = this.f211697m;
        s2Var.f211971g = y2Var;
        s2Var.notifyDataSetChanged();
    }

    public MMFilterDialog(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211698n = com.tencent.mm.ui.widget.dialog.x2.DivideEqual;
        this.f211699o = com.tencent.mm.ui.widget.dialog.y2.Grey;
        this.f211700p = -1;
        this.f211701q = new java.util.ArrayList();
        b(context, attributeSet);
    }
}
