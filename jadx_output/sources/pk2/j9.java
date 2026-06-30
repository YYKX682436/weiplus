package pk2;

/* loaded from: classes3.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f355885a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.e5 f355886b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.gj f355887c;

    /* renamed from: d, reason: collision with root package name */
    public pk2.p7 f355888d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f355889e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f355890f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f355891g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f355892h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355893i;

    public j9(pk2.o9 o9Var, pk2.f9 postDep, kotlinx.coroutines.y0 mainScope) {
        kotlin.jvm.internal.o.g(postDep, "postDep");
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        this.f355893i = o9Var;
        this.f355885a = mainScope;
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f355891g = new java.util.ArrayList();
        this.f355892h = jz5.h.b(new pk2.h9(o9Var));
    }

    public final void a(java.lang.Integer num, boolean z17) {
        this.f355889e = num;
        this.f355890f = z17;
        if (this.f355888d == null) {
            pk2.o9 o9Var = this.f355893i;
            pk2.p7 p7Var = new pk2.p7(o9Var.f356078d, o9Var.h());
            this.f355888d = p7Var;
            p7Var.c().f131968r = new pk2.g9(o9Var, this);
        }
        c(num);
    }

    public final ya2.b2 b() {
        return ((mm2.c1) this.f355893i.f356074b.a(mm2.c1.class)).J4;
    }

    public final void c(java.lang.Integer num) {
        pk2.p7 p7Var = this.f355888d;
        if (p7Var != null) {
            int color = this.f355893i.f356078d.getResources().getColor(com.tencent.mm.R.color.Link_100);
            android.widget.TextView textView = p7Var.c().f131971u;
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
        pk2.p7 p7Var2 = this.f355888d;
        java.util.List menuConfigs = this.f355891g;
        pk2.i9 i9Var = new pk2.i9(this);
        kotlin.jvm.internal.o.g(menuConfigs, "menuConfigs");
        java.util.ArrayList arrayList = (java.util.ArrayList) menuConfigs;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            pk2.e9 e9Var = (pk2.e9) arrayList.get(i17);
            java.lang.String levelId = "level_" + i17;
            if (p7Var2 != null) {
                p7Var2.a(levelId, e9Var.f355713b, new pk2.p9(e9Var));
            }
            if (num != null) {
                int intValue = num.intValue();
                if (p7Var2 != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
                    kotlin.jvm.internal.o.g(levelId, "levelId");
                    pk2.g7 g7Var = (pk2.g7) ((java.util.LinkedHashMap) p7Var2.f356167h).get(levelId);
                    if (g7Var != null) {
                        g7Var.f355786h = valueOf;
                    }
                    pk2.l7 l7Var = (pk2.l7) ((java.util.LinkedHashMap) p7Var2.f356165f).get(levelId);
                    if (l7Var != null) {
                        l7Var.notifyDataSetChanged();
                    }
                }
            }
            if (p7Var2 != null) {
                p7Var2.d(levelId, new pk2.q9(e9Var, i9Var, p7Var2));
            }
            if (p7Var2 != null) {
                p7Var2.e(levelId, !e9Var.f355712a.isEmpty());
            }
            android.view.View view = e9Var.f355714c;
            if (view != null && p7Var2 != null) {
                p7Var2.b(levelId, view);
            }
        }
        pk2.p7 p7Var3 = this.f355888d;
        if (p7Var3 != null) {
            p7Var3.f();
        }
    }
}
