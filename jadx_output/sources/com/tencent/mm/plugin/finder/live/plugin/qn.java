package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tn f114028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(com.tencent.mm.plugin.finder.live.plugin.tn tnVar) {
        super(0);
        this.f114028d = tnVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = this.f114028d;
        tnVar.f114457x.cancel();
        com.tencent.mm.plugin.finder.live.plugin.un unVar = tnVar.f114447n;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = unVar.f114597g;
        if (finderLiveGiftTextView != null) {
            finderLiveGiftTextView.setTag(0);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = unVar.f114596f;
        if (mMPAGView != null) {
            mMPAGView.n();
        }
        com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView finderRandomAnimTextView = unVar.f114598h;
        if (finderRandomAnimTextView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderRandomAnimTextView.getLayoutManager();
            if (layoutManager != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/FinderRandomAnimTextView", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
                layoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(layoutManager, "com/tencent/mm/plugin/finder/live/gift/widget/FinderRandomAnimTextView", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
            finderRandomAnimTextView.f111653b2.clear();
            finderRandomAnimTextView.f111654c2.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
