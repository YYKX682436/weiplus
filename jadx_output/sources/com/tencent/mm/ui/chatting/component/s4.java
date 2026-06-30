package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class s4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f199904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.v4 f199905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb5.z f199906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f199907g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f199908h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f199909i;

    public s4(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.ui.chatting.component.v4 v4Var, sb5.z zVar, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, int i17, long j17) {
        this.f199904d = recyclerView;
        this.f199905e = v4Var;
        this.f199906f = zVar;
        this.f199907g = linearLayoutManager;
        this.f199908h = i17;
        this.f199909i = j17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f199904d;
        if (!recyclerView.getViewTreeObserver().isAlive()) {
            return true;
        }
        recyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
        int headerViewsCount = this.f199905e.f198580d.p().getHeaderViewsCount();
        java.util.ArrayList arrayList = ((com.tencent.mm.ui.chatting.adapter.k) this.f199906f).I.f152065o;
        kotlin.jvm.internal.o.f(arrayList, "getDataMap(...)");
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((rd5.d) it.next()).f394254d.f445300b.getMsgId() == this.f199909i) {
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return true;
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f199907g;
        int i18 = i17 + headerViewsCount;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(this.f199908h));
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(linearLayoutManager, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupExpandComponent$onEnterEditMode$listener$1", "onPreDraw", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupExpandComponent$onEnterEditMode$listener$1", "onPreDraw", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
        return false;
    }
}
