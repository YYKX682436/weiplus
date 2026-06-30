package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class j1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f191728d;

    public j1(android.content.Context context) {
        this.f191728d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 2;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return java.lang.Integer.valueOf(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.pluginsdk.ui.tools.k1 k1Var;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(this.f191728d).inflate(com.tencent.mm.R.layout.bav, (android.view.ViewGroup) null);
            k1Var = new com.tencent.mm.pluginsdk.ui.tools.k1(view);
            view.setTag(k1Var);
        } else {
            k1Var = (com.tencent.mm.pluginsdk.ui.tools.k1) view.getTag();
        }
        if (i17 == 0) {
            k1Var.f191742a.setText(com.tencent.mm.R.string.ceq);
        } else if (i17 != 1) {
            k1Var.f191742a.setText(com.tencent.mm.R.string.f490386tj);
        } else {
            k1Var.f191742a.setText(com.tencent.mm.R.string.cer);
        }
        return view;
    }
}
