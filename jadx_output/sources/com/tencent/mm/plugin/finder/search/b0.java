package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class b0 implements com.tencent.mm.plugin.finder.storage.tj0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderContactSearchUI f125623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f125624b;

    public b0(com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI, int i17) {
        this.f125623a = finderContactSearchUI;
        this.f125624b = i17;
    }

    @Override // com.tencent.mm.plugin.finder.storage.tj0
    public void a(boolean z17) {
        com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI = this.f125623a;
        if (!z17) {
            db5.t7.makeText(finderContactSearchUI.getContext(), com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, 0).show();
            return;
        }
        java.util.ArrayList arrayList = finderContactSearchUI.f125534z;
        int i17 = this.f125624b;
        arrayList.remove(i17);
        androidx.recyclerview.widget.RecyclerView recyclerView = finderContactSearchUI.I;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyItemRemoved(i17);
        }
    }
}
