package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class t4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f199961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.v4 f199962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb5.z f199963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f199964g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f199965h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f199966i;

    public t4(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.ui.chatting.component.v4 v4Var, sb5.z zVar, long j17, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, int i17) {
        this.f199961d = recyclerView;
        this.f199962e = v4Var;
        this.f199963f = zVar;
        this.f199964g = j17;
        this.f199965h = linearLayoutManager;
        this.f199966i = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f199961d;
        if (!recyclerView.getViewTreeObserver().isAlive()) {
            return true;
        }
        recyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
        int headerViewsCount = this.f199962e.f198580d.p().getHeaderViewsCount();
        int H0 = ((com.tencent.mm.ui.chatting.adapter.k) this.f199963f).H0(this.f199964g);
        if (H0 < 0) {
            return true;
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f199965h;
        int i17 = H0 + headerViewsCount;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f199966i));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupExpandComponent$onExitEditMode$listener$1", "onPreDraw", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupExpandComponent$onExitEditMode$listener$1", "onPreDraw", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
        return false;
    }
}
