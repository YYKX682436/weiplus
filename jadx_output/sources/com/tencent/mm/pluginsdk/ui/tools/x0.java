package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public final class x0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f191973d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f191974e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f191975f;

    public x0(android.content.Context mContext) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f191973d = mContext;
        this.f191975f = "";
        this.f191974e = new java.util.ArrayList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f191974e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.pluginsdk.ui.tools.y0) this.f191974e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        com.tencent.mm.pluginsdk.ui.tools.w0 w0Var;
        android.view.View view2;
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mars.xlog.Log.i("MicroMsg.DropdownListAdapter", "duanyi test getView:" + i17);
        com.tencent.mm.pluginsdk.ui.tools.y0 y0Var = (com.tencent.mm.pluginsdk.ui.tools.y0) this.f191974e.get(i17);
        android.content.Context context = this.f191973d;
        if (view == null) {
            view2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a4s, parent, false);
            w0Var = new com.tencent.mm.pluginsdk.ui.tools.w0();
            w0Var.f191961a = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.hhr);
            w0Var.f191962b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.hiq);
            w0Var.f191963c = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.mkk);
            w0Var.f191964d = view2.findViewById(com.tencent.mm.R.id.hi_);
            view2.setTag(w0Var);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.tools.DropdownListView.DropdownListAdapter.ViewHolder");
            w0Var = (com.tencent.mm.pluginsdk.ui.tools.w0) tag;
            view2 = view;
        }
        if (kotlin.jvm.internal.o.b(this.f191975f, y0Var.f192004a)) {
            android.widget.ImageView imageView = w0Var.f191963c;
            kotlin.jvm.internal.o.d(imageView);
            imageView.setVisibility(0);
        } else {
            android.widget.ImageView imageView2 = w0Var.f191963c;
            kotlin.jvm.internal.o.d(imageView2);
            imageView2.setVisibility(4);
        }
        if (i17 < getCount() - 1) {
            android.view.View view3 = w0Var.f191964d;
            kotlin.jvm.internal.o.d(view3);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = w0Var.f191964d;
            kotlin.jvm.internal.o.d(view4);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = w0Var.f191961a;
        kotlin.jvm.internal.o.d(weImageView);
        weImageView.setImageDrawable(context.getResources().getDrawable(y0Var.f192005b));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = w0Var.f191961a;
        kotlin.jvm.internal.o.d(weImageView2);
        weImageView2.setIconColor(context.getResources().getColor(y0Var.f192006c));
        android.widget.TextView textView = w0Var.f191962b;
        kotlin.jvm.internal.o.d(textView);
        textView.setVisibility(0);
        android.widget.TextView textView2 = w0Var.f191962b;
        kotlin.jvm.internal.o.d(textView2);
        textView2.setText(y0Var.f192004a);
        return view2;
    }
}
