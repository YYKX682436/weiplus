package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes5.dex */
public final class k0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f151233d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f151234e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f151235f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f151236g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f151237h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f151238i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f151239m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.uic.m8 f151240n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f151241o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151233d = "MicroMsg.MusicMvCommentUIC";
        this.f151234e = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.h0(activity));
        this.f151235f = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.i0(activity));
        this.f151236g = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.j0(activity));
        this.f151240n = new com.tencent.mm.plugin.mv.ui.uic.m8();
    }

    public static final void O6(com.tencent.mm.plugin.mv.ui.uic.k0 k0Var) {
        android.view.ViewGroup viewGroup;
        k0Var.f151241o = false;
        com.tencent.mm.plugin.mv.ui.uic.m8 m8Var = k0Var.f151240n;
        java.util.HashMap hashMap = m8Var.f151303b;
        java.util.Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.mv.ui.uic.j8 j8Var = (com.tencent.mm.plugin.mv.ui.uic.j8) it.next();
            if (j8Var.f151230e) {
                android.view.View view = m8Var.f151302a;
                android.view.View findViewById = view != null ? view.findViewById(j8Var.f151226a) : null;
                if (findViewById != null) {
                    findViewById.animate().cancel();
                    float f17 = j8Var.f151228c;
                    int i17 = j8Var.f151227b;
                    if (i17 == 0) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(i17));
                        java.util.Collections.reverse(arrayList);
                        android.view.View view2 = findViewById;
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord", "restore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord", "restore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.animate().alpha(f17).setDuration(150L).start();
                    } else {
                        findViewById.animate().alpha(f17).setDuration(150L).withEndAction(new com.tencent.mm.plugin.mv.ui.uic.l8(findViewById, j8Var)).start();
                    }
                }
            }
        }
        hashMap.clear();
        k0Var.Q6().setVisibility(8);
        ((com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter) ((jz5.n) k0Var.f151235f).getValue()).setVisibility(8);
        android.view.View view3 = k0Var.f151239m;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) (view3 != null ? view3.getParent() : null);
        if (viewGroup2 != null) {
            viewGroup2.removeView(k0Var.f151239m);
        }
        android.view.View view4 = k0Var.f151237h;
        if (view4 == null || (viewGroup = (android.view.ViewGroup) view4.findViewById(com.tencent.mm.R.id.jk8)) == null) {
            return;
        }
        viewGroup.addView(k0Var.f151239m);
    }

    public final void P6(android.view.View view, lm3.e item) {
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i(this.f151233d, "bindView: ");
        android.view.View view2 = this.f151238i;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        if (this.f151241o) {
            android.view.View view3 = this.f151237h;
            if (view3 != null && !kotlin.jvm.internal.o.b(view3, view)) {
                android.view.View view4 = this.f151239m;
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) (view4 != null ? view4.getParent() : null);
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f151239m);
                }
                android.view.View view5 = this.f151237h;
                if (view5 != null && (viewGroup = (android.view.ViewGroup) view5.findViewById(com.tencent.mm.R.id.jk8)) != null) {
                    viewGroup.addView(this.f151239m);
                }
                android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.c6o) : null;
                this.f151239m = findViewById;
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) (findViewById != null ? findViewById.getParent() : null);
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f151239m);
                }
                ((android.view.ViewGroup) ((jz5.n) this.f151236g).getValue()).addView(this.f151239m);
            }
        } else {
            this.f151239m = view != null ? view.findViewById(com.tencent.mm.R.id.c6o) : null;
        }
        this.f151237h = view;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c7a) : null;
        this.f151238i = textView;
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.mv.ui.uic.e0(this));
        }
        Q6().setOnClickListener(new com.tencent.mm.plugin.mv.ui.uic.f0(this));
        ((com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter) ((jz5.n) this.f151235f).getValue()).setOnCommentSendImp(new com.tencent.mm.plugin.mv.ui.uic.g0(this, item));
    }

    public final android.view.ViewGroup Q6() {
        return (android.view.ViewGroup) ((jz5.n) this.f151234e).getValue();
    }
}
