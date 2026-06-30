package hr3;

/* loaded from: classes4.dex */
public class ti extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f284034d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f284035e;

    public ti(android.view.LayoutInflater layoutInflater, java.util.List list) {
        this.f284035e = layoutInflater;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f284034d = linkedList;
        if (list != null) {
            linkedList.addAll(list);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f284034d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo) ((java.util.LinkedList) this.f284034d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        hr3.si siVar;
        android.view.View view2;
        if (view == null) {
            view2 = this.f284035e.inflate(com.tencent.mm.R.layout.f488077g8, viewGroup, false);
            siVar = new hr3.si(null);
            siVar.f283988a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.h5n);
            siVar.f283989b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.l5_);
            siVar.f283990c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.mgb);
            siVar.f283991d = view2.findViewById(com.tencent.mm.R.id.d0v);
            view2.setAccessibilityDelegate(siVar.f283992e);
            view2.setTag(siVar);
        } else {
            siVar = (hr3.si) view.getTag();
            view2 = view;
        }
        java.util.List list = this.f284034d;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo wxaAttributes$WxaEntryInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo) ((java.util.LinkedList) list).get(i17);
        l01.d0.f314761a.b(siVar.f283988a, wxaAttributes$WxaEntryInfo.f77432g, l01.a.h(), l01.q0.f314787d);
        java.lang.String str = wxaAttributes$WxaEntryInfo.f77430e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        siVar.f283989b.setText(str);
        java.lang.String str2 = wxaAttributes$WxaEntryInfo.f77431f;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            siVar.f283990c.setVisibility(8);
        } else {
            siVar.f283990c.setVisibility(0);
            siVar.f283990c.setText(str2);
            str = str + ", " + str2;
        }
        if (list != null) {
            android.view.View view3 = siVar.f283991d;
            int i18 = ((java.util.LinkedList) list).size() + (-1) != i17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$AdapterImpl", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/WxaBindBizInfoUI$AdapterImpl", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        siVar.f283992e.f283958a = str;
        return view2;
    }
}
