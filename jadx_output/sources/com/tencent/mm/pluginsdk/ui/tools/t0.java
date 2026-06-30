package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes9.dex */
public final class t0 implements com.tencent.mm.pluginsdk.ui.tools.u3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.Adapter f191902d;

    public t0(android.widget.Adapter mAdapter) {
        kotlin.jvm.internal.o.g(mAdapter, "mAdapter");
        this.f191902d = mAdapter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u3
    public int getCount() {
        return this.f191902d.getCount();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u3
    public java.lang.Object getItem(int i17) {
        return this.f191902d.getItem(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u3
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return this.f191902d.getView(i17, view, viewGroup);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u3
    public void h(java.lang.Object obj) {
        android.widget.Adapter adapter = this.f191902d;
        if (adapter instanceof android.widget.BaseAdapter) {
            ((android.widget.BaseAdapter) adapter).notifyDataSetChanged();
        }
    }
}
