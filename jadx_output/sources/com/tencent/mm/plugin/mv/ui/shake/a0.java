package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f150923a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f150924b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150925c;

    /* renamed from: d, reason: collision with root package name */
    public final int f150926d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f150927e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f150928f;

    /* renamed from: g, reason: collision with root package name */
    public ll3.h1 f150929g;

    /* renamed from: h, reason: collision with root package name */
    public int f150930h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.shake.v f150931i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.shake.z f150932j;

    public a0(android.content.Context context, android.view.View rootView, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f150923a = context;
        this.f150924b = rootView;
        this.f150925c = i17;
        this.f150926d = i18;
        this.f150927e = jz5.h.b(new com.tencent.mm.plugin.mv.ui.shake.w(this));
        this.f150928f = new java.util.ArrayList();
        this.f150930h = -1;
        this.f150931i = new com.tencent.mm.plugin.mv.ui.shake.v();
        this.f150932j = new com.tencent.mm.plugin.mv.ui.shake.z(this);
    }

    public static final void a(com.tencent.mm.plugin.mv.ui.shake.a0 a0Var, int i17) {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        int i18 = a0Var.f150930h;
        ll3.h1 h1Var = a0Var.f150929g;
        if (h1Var != null) {
            i18 = h1Var.a(i17);
        }
        if (i18 != a0Var.f150930h && i18 >= 0 && (linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) a0Var.b().getLayoutManager()) != null) {
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            a0Var.b().f1();
            if (a0Var.b().getLayoutManager() instanceof com.tencent.mm.plugin.mv.ui.shake.MusicBlackLyricLayoutManager) {
                androidx.recyclerview.widget.f2 adapter = a0Var.b().getAdapter();
                com.tencent.mm.plugin.mv.ui.shake.t tVar = adapter instanceof com.tencent.mm.plugin.mv.ui.shake.t ? (com.tencent.mm.plugin.mv.ui.shake.t) adapter : null;
                if (tVar != null && tVar.f150963e == 1) {
                    tVar.f150965g = i18;
                    tVar.notifyItemChanged(i18);
                    tVar.notifyItemChanged(i18 - 1);
                }
            }
            if (i18 <= y17 + 1 && w17 - 1 <= i18) {
                androidx.recyclerview.widget.RecyclerView b17 = a0Var.b();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                b17.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(b17, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else {
                androidx.recyclerview.widget.RecyclerView b18 = a0Var.b();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                b18.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(b18, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        a0Var.f150930h = i18;
    }

    public final androidx.recyclerview.widget.RecyclerView b() {
        return (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f150927e).getValue();
    }
}
