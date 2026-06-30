package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes7.dex */
public final class c2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f184026d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f184027e;

    public c2(android.content.Context context, java.util.LinkedList linkedList) {
        this.f184027e = android.view.LayoutInflater.from(context);
        this.f184026d = linkedList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f184026d;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (i17 >= 0) {
            java.util.LinkedList linkedList = this.f184026d;
            if (i17 < linkedList.size()) {
                return (r45.px4) linkedList.get(i17);
            }
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.webview.ui.tools.b2 b2Var;
        android.view.View view2 = null;
        java.util.LinkedList linkedList = this.f184026d;
        if (linkedList != null && linkedList.size() > 0) {
            r45.px4 px4Var = (i17 < 0 || i17 >= linkedList.size()) ? null : (r45.px4) linkedList.get(i17);
            if (px4Var == null) {
                return view;
            }
            if (view == null) {
                b2Var = new com.tencent.mm.plugin.webview.ui.tools.b2(null);
                view2 = this.f184027e.inflate(com.tencent.mm.R.layout.cik, (android.view.ViewGroup) null, false);
                b2Var.f183921a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f483081w2);
                b2Var.f183922b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483079w0);
                view2.setTag(b2Var);
            } else {
                view2 = view;
                b2Var = (com.tencent.mm.plugin.webview.ui.tools.b2) view.getTag();
            }
            int i18 = px4Var.f383460f;
            if (i18 == 1) {
                b2Var.f183921a.setImageResource(com.tencent.mm.R.drawable.f481259or);
            } else if (i18 == 3) {
                b2Var.f183921a.setImageResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.checkbox_selected_grey_dark_small : com.tencent.mm.R.raw.checkbox_selected_grey_small);
            } else {
                b2Var.f183921a.setImageResource(com.tencent.mm.R.raw.checkbox_selected_small);
            }
            b2Var.f183922b.setText(px4Var.f383459e);
            android.widget.ImageView imageView = b2Var.f183921a;
            imageView.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.a2(this, px4Var, imageView));
        }
        return view2;
    }
}
