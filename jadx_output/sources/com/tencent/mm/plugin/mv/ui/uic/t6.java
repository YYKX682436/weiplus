package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class t6 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.mv.ui.uic.f8 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ss4 f151459d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f151460e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f151461f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f151462g;

    /* renamed from: h, reason: collision with root package name */
    public int f151463h;

    /* renamed from: i, reason: collision with root package name */
    public final int f151464i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f151465m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f151466n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.uic.f8 f151467o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151460e = new java.util.ArrayList();
        this.f151462g = new java.util.LinkedList();
        this.f151463h = -1;
        this.f151464i = i65.a.f(activity, com.tencent.mm.R.dimen.f479723df);
        this.f151465m = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.o6(this));
        this.f151466n = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.r6(activity));
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter O6() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) this.f151465m).getValue();
    }

    public final void P6(int i17) {
        java.util.ArrayList arrayList = this.f151460e;
        com.tencent.mm.plugin.mv.ui.uic.l6 l6Var = (com.tencent.mm.plugin.mv.ui.uic.l6) kz5.n0.a0(arrayList, this.f151463h);
        if (l6Var != null) {
            l6Var.f151278g = false;
            O6().notifyItemChanged(this.f151463h + O6().a0(), 1);
        }
        com.tencent.mm.plugin.mv.ui.uic.l6 l6Var2 = (com.tencent.mm.plugin.mv.ui.uic.l6) kz5.n0.a0(arrayList, i17);
        if (l6Var2 != null) {
            l6Var2.f151279h = 0.0f;
            l6Var2.f151278g = true;
            O6().notifyItemChanged(O6().a0() + i17, 1);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f151461f;
        if (wxRecyclerView != null) {
            int a07 = O6().a0() + i17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(a07));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(wxRecyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC", "selectMedia", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            wxRecyclerView.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC", "selectMedia", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        this.f151463h = i17;
    }

    @Override // com.tencent.mm.plugin.mv.ui.uic.f8
    public void select(int i17) {
        P6(i17);
        com.tencent.mm.plugin.mv.ui.uic.f8 f8Var = this.f151467o;
        if (f8Var != null) {
            f8Var.select(i17);
        }
    }
}
