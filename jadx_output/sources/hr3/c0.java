package hr3;

/* loaded from: classes4.dex */
public class c0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f283435d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f283436e;

    public c0(android.view.LayoutInflater layoutInflater, java.util.List list) {
        this.f283436e = layoutInflater;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f283435d = linkedList;
        if (list != null) {
            linkedList.addAll(list);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f283435d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo) ((java.util.LinkedList) this.f283435d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        hr3.b0 b0Var;
        if (view == null) {
            view = this.f283436e.inflate(com.tencent.mm.R.layout.f488049fg, viewGroup, false);
            b0Var = new hr3.b0(null);
            b0Var.f283412a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h5n);
            b0Var.f283413b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.l5_);
            b0Var.f283414c = view.findViewById(com.tencent.mm.R.id.d0v);
            view.setTag(b0Var);
        } else {
            b0Var = (hr3.b0) view.getTag();
        }
        java.util.List list = this.f283435d;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo wxaAttributes$WxaEntryInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo) ((java.util.LinkedList) list).get(i17);
        l01.d0.f314761a.b(b0Var.f283412a, wxaAttributes$WxaEntryInfo.f77432g, l01.a.h(), l01.q0.f314787d);
        android.widget.TextView textView = b0Var.f283413b;
        java.lang.String str = wxaAttributes$WxaEntryInfo.f77430e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        if (list != null) {
            android.view.View view2 = b0Var.f283414c;
            int i18 = ((java.util.LinkedList) list).size() + (-1) == i17 ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$AdapterImpl", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$AdapterImpl", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view;
    }
}
