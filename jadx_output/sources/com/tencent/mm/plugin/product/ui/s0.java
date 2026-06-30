package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class s0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f153346d;

    /* renamed from: e, reason: collision with root package name */
    public xq3.m f153347e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f153348f;

    public s0(android.content.Context context) {
        this.f153346d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f153347e.f456104f;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (xq3.h) this.f153347e.f456104f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        xq3.h hVar = (xq3.h) this.f153347e.f456104f.get(i17);
        if (view == null || view.getTag() == null) {
            view = android.view.View.inflate(this.f153346d, com.tencent.mm.R.layout.cah, null);
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view;
        checkBox.setText(hVar.f456088e);
        checkBox.setEnabled(hVar.f456089f);
        checkBox.setChecked(hVar.f456087d.equals(this.f153348f));
        if (!hVar.f456089f) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.cd6);
        } else if (hVar.f456087d.equals(this.f153348f)) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.cd8);
        } else {
            view.setBackgroundResource(com.tencent.mm.R.drawable.cd7);
        }
        view.setTag(new android.util.Pair(this.f153347e.f456102d, hVar.f456087d));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        return ((xq3.h) this.f153347e.f456104f.get(i17)).f456089f;
    }
}
