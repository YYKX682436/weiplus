package com.tencent.mm.ui.chatting.component;

/* loaded from: classes15.dex */
public final class sa implements xq.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ta f199932b;

    public sa(com.tencent.mm.ui.chatting.component.ta taVar) {
        this.f199932b = taVar;
    }

    public com.tencent.mm.ui.widget.MMNeat7extView a(android.view.View itemView, java.lang.String animKey) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(animKey, "animKey");
        if (!r26.n0.B(animKey, "_", false)) {
            return (com.tencent.mm.ui.widget.MMNeat7extView) itemView.findViewById(com.tencent.mm.R.id.bkl);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) itemView.findViewById(com.tencent.mm.R.id.kpw);
        int parseInt = java.lang.Integer.parseInt((java.lang.String) r26.n0.f0(animKey, new java.lang.String[]{"_"}, false, 0, 6, null).get(1));
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        android.view.View childAt = viewGroup.getChildAt(parseInt);
        if (childAt instanceof com.tencent.mm.ui.widget.MMNeat7extView) {
            return (com.tencent.mm.ui.widget.MMNeat7extView) childAt;
        }
        return null;
    }

    public android.view.View b(long j17) {
        return ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f199932b.f198580d.f460708c.a(sb5.z.class))).O0(j17);
    }
}
