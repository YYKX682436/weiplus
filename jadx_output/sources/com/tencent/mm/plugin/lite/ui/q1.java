package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes13.dex */
public class q1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f144463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI f144464e;

    public q1(com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI wxaLiteAppListUI, android.content.Context context) {
        android.os.Bundle bundle;
        this.f144464e = wxaLiteAppListUI;
        com.tencent.mm.plugin.lite.logic.g1.s().getClass();
        java.util.ArrayList arrayList = null;
        try {
            bundle = com.tencent.mm.plugin.lite.storage.q.a("getLiteAppBaselibList", null, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteApp.LiteAppLogic", e17, "", new java.lang.Object[0]);
            bundle = null;
        }
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "getLiteAppBaselibList bundle is null.");
        } else {
            bundle.setClassLoader(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.class.getClassLoader());
            if (bundle.containsKey(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_LITE_APP_BASE_LIB_LIST)) {
                arrayList = bundle.getParcelableArrayList(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.KEY_LITE_APP_BASE_LIB_LIST);
            }
        }
        this.f144463d = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f144463d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f144463d;
        if (list == null || list.size() <= i17) {
            return null;
        }
        return (com.tencent.liteapp.storage.WxaLiteAppBaselibInfo) list.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.lite.ui.r1 r1Var;
        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = (com.tencent.liteapp.storage.WxaLiteAppBaselibInfo) this.f144463d.get(i17);
        if (view == null || view.getTag() == null) {
            com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI wxaLiteAppListUI = this.f144464e;
            android.view.View inflate = android.view.LayoutInflater.from(wxaLiteAppListUI.getContext()).inflate(com.tencent.mm.R.layout.bpy, (android.view.ViewGroup) null, false);
            com.tencent.mm.plugin.lite.ui.r1 r1Var2 = new com.tencent.mm.plugin.lite.ui.r1(wxaLiteAppListUI, inflate);
            inflate.setTag(r1Var2);
            view = inflate;
            r1Var = r1Var2;
        } else {
            r1Var = (com.tencent.mm.plugin.lite.ui.r1) view.getTag();
        }
        r1Var.f144471a.setText("基础库 大版本号：" + wxaLiteAppBaselibInfo.majorVersion);
        r1Var.f144472b.setText("");
        return view;
    }
}
