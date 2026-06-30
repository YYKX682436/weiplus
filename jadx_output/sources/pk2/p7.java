package pk2;

/* loaded from: classes3.dex */
public final class p7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f356160a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f356161b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f356162c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f356163d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f356164e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f356165f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f356166g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f356167h;

    public p7(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f356160a = context;
        this.f356161b = z17;
        this.f356162c = jz5.h.b(new pk2.o7(this));
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.eek, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f356163d = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.tv8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f356164e = (android.widget.LinearLayout) findViewById;
        this.f356165f = new java.util.LinkedHashMap();
        this.f356166g = new java.util.LinkedHashMap();
        this.f356167h = new java.util.LinkedHashMap();
    }

    public final pk2.g7 a(java.lang.String levelId, java.lang.String str, db5.o4 o4Var) {
        kotlin.jvm.internal.o.g(levelId, "levelId");
        java.util.Map map = this.f356167h;
        pk2.g7 g7Var = (pk2.g7) ((java.util.LinkedHashMap) map).get(levelId);
        if (g7Var == null) {
            pk2.g7 g7Var2 = new pk2.g7(levelId, null, new db5.g4(this.f356160a), null, null, false, null, null, 250, null);
            map.put(levelId, g7Var2);
            g7Var = g7Var2;
        }
        if (str != null) {
            g7Var.f355780b = str;
        }
        if (o4Var != null) {
            g7Var.f355782d = o4Var;
        }
        return g7Var;
    }

    public final void b(java.lang.String levelId, android.view.View widget) {
        kotlin.jvm.internal.o.g(levelId, "levelId");
        kotlin.jvm.internal.o.g(widget, "widget");
        java.util.Map map = this.f356167h;
        pk2.g7 g7Var = (pk2.g7) ((java.util.LinkedHashMap) map).get(levelId);
        if (g7Var == null) {
            g7Var = new pk2.g7(levelId, null, new db5.g4(this.f356160a), null, null, false, null, null, 250, null);
            map.put(levelId, g7Var);
        }
        android.view.View view = g7Var.f355785g;
        if (view != null && view != widget && view.getParent() != null) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        g7Var.f355785g = widget;
        g7Var.f355784f = true;
    }

    public final com.tencent.mm.plugin.finder.view.e3 c() {
        return (com.tencent.mm.plugin.finder.view.e3) ((jz5.n) this.f356162c).getValue();
    }

    public final void d(java.lang.String levelId, db5.t4 t4Var) {
        kotlin.jvm.internal.o.g(levelId, "levelId");
        pk2.g7 g7Var = (pk2.g7) ((java.util.LinkedHashMap) this.f356167h).get(levelId);
        if (g7Var != null) {
            g7Var.f355783e = t4Var;
        }
        pk2.l7 l7Var = (pk2.l7) ((java.util.LinkedHashMap) this.f356165f).get(levelId);
        if (l7Var != null) {
            l7Var.f355959e = t4Var;
        }
    }

    public final void e(java.lang.String levelId, boolean z17) {
        kotlin.jvm.internal.o.g(levelId, "levelId");
        pk2.g7 g7Var = (pk2.g7) ((java.util.LinkedHashMap) this.f356167h).get(levelId);
        if (g7Var != null) {
            g7Var.f355784f = z17;
        }
        jz5.l lVar = (jz5.l) ((java.util.LinkedHashMap) this.f356166g).get(levelId);
        if (lVar != null) {
            android.widget.TextView textView = (android.widget.TextView) lVar.f302833d;
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) lVar.f302834e;
            if (textView != null) {
                textView.setVisibility(z17 ? 0 : 8);
            }
            recyclerView.setVisibility(z17 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        if ((r10.length() > 0) == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.p7.f():void");
    }
}
