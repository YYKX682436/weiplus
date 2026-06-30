package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class t9 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.u9 f209891d;

    public t9(com.tencent.mm.ui.u9 u9Var) {
        this.f209891d = u9Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f209891d.f211075b;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.LinkedList linkedList = this.f209891d.f211075b;
        if (linkedList == null) {
            return null;
        }
        return (oo0.a) linkedList.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return -1L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.u9 u9Var = this.f209891d;
        if (view == null) {
            u9Var.getClass();
            throw null;
        }
        android.support.v4.media.f.a(view.getTag());
        java.util.LinkedList linkedList = u9Var.f211075b;
        (linkedList == null ? null : (oo0.a) linkedList.get(i17)).getClass();
        throw null;
    }
}
