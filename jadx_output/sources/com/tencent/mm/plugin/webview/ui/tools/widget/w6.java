package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes7.dex */
public class w6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f187591d;

    public w6(com.tencent.mm.plugin.webview.ui.tools.widget.x6 x6Var, java.util.LinkedList linkedList) {
        this.f187591d = linkedList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f187591d;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.jv5) this.f187591d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.webview.ui.tools.widget.v6 v6Var;
        java.util.LinkedList linkedList = this.f187591d;
        if (linkedList == null || linkedList.size() <= 0) {
            return null;
        }
        r45.jv5 jv5Var = (r45.jv5) linkedList.get(i17);
        if (view == null) {
            v6Var = new com.tencent.mm.plugin.webview.ui.tools.widget.v6(this, null);
            view2 = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.f488162iv, null);
            v6Var.f187584a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f483081w2);
            v6Var.f187585b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483079w0);
            view2.setTag(v6Var);
        } else {
            view2 = view;
            v6Var = (com.tencent.mm.plugin.webview.ui.tools.widget.v6) view.getTag();
        }
        int i18 = jv5Var.f378133f;
        if (i18 == 1) {
            v6Var.f187584a.setImageResource(com.tencent.mm.R.raw.login_auth_state_not_selected);
        } else if (i18 == 3) {
            v6Var.f187584a.setImageResource(com.tencent.mm.R.raw.login_auth_state_must_select);
        } else {
            v6Var.f187584a.setImageResource(com.tencent.mm.R.raw.login_auth_state_default_select);
        }
        v6Var.f187585b.setText(jv5Var.f378132e);
        android.widget.ImageView imageView = v6Var.f187584a;
        imageView.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.u6(this, jv5Var, imageView));
        return view2;
    }
}
