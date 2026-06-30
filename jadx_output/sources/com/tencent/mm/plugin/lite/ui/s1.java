package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes13.dex */
public class s1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f144477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI f144478e;

    public s1(com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI wxaLiteAppListUI, android.content.Context context) {
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo;
        this.f144478e = wxaLiteAppListUI;
        java.util.List A = com.tencent.mm.plugin.lite.logic.g1.s().A();
        this.f144477d = A;
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo2 = new com.tencent.liteapp.storage.WxaLiteAppInfo();
        wxaLiteAppInfo2.appId = "TestFragment";
        if (A != null) {
            A.add(wxaLiteAppInfo2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo3 = new com.tencent.liteapp.storage.WxaLiteAppInfo();
            wxaLiteAppInfo3.appId = "wxalite6249b65249893bb23a2d4347a17db5b9@pay";
            arrayList.add(wxaLiteAppInfo3);
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo4 = new com.tencent.liteapp.storage.WxaLiteAppInfo();
            wxaLiteAppInfo4.appId = "1689826158-test-encrypt-upload-project@pay";
            arrayList.add(wxaLiteAppInfo4);
            A.addAll(arrayList);
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo5 = new com.tencent.liteapp.storage.WxaLiteAppInfo();
        wxaLiteAppInfo5.appId = "widget测试";
        A.add(wxaLiteAppInfo5);
        java.util.Iterator it = A.iterator();
        while (true) {
            if (!it.hasNext()) {
                wxaLiteAppInfo = null;
                break;
            } else {
                wxaLiteAppInfo = (com.tencent.liteapp.storage.WxaLiteAppInfo) it.next();
                if ("wxalite5d4c22060bc77f6a6d1bb7b1b59ed416".equals(wxaLiteAppInfo.appId)) {
                    break;
                }
            }
        }
        if (wxaLiteAppInfo != null) {
            this.f144477d.remove(wxaLiteAppInfo);
            this.f144477d.add(0, wxaLiteAppInfo);
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.liteapp.storage.WxaLiteAppInfo getItem(int i17) {
        java.util.List list = this.f144477d;
        if (list == null || list.size() <= i17) {
            return null;
        }
        return (com.tencent.liteapp.storage.WxaLiteAppInfo) list.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f144477d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.lite.ui.r1 r1Var;
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = (com.tencent.liteapp.storage.WxaLiteAppInfo) this.f144477d.get(i17);
        if (view == null || view.getTag() == null) {
            com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI wxaLiteAppListUI = this.f144478e;
            android.view.View inflate = android.view.LayoutInflater.from(wxaLiteAppListUI.getContext()).inflate(com.tencent.mm.R.layout.bpy, (android.view.ViewGroup) null, false);
            com.tencent.mm.plugin.lite.ui.r1 r1Var2 = new com.tencent.mm.plugin.lite.ui.r1(wxaLiteAppListUI, inflate);
            inflate.setTag(r1Var2);
            view = inflate;
            r1Var = r1Var2;
        } else {
            r1Var = (com.tencent.mm.plugin.lite.ui.r1) view.getTag();
        }
        java.lang.String str = wxaLiteAppInfo.appId;
        java.lang.String str2 = wxaLiteAppInfo.path;
        java.lang.String str3 = wxaLiteAppInfo.signatureKey;
        com.tencent.mm.plugin.lite.w.initLib();
        java.lang.String liteAppMinBaseLibMajorVersion = com.tencent.mm.plugin.lite.LiteAppCenter.getLiteAppMinBaseLibMajorVersion(str, str2, str3);
        if (liteAppMinBaseLibMajorVersion == null || liteAppMinBaseLibMajorVersion.length() == 0) {
            liteAppMinBaseLibMajorVersion = "undefined";
        }
        java.util.Map map = com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI.f144339m;
        if (((java.util.HashMap) map).containsKey(wxaLiteAppInfo.appId)) {
            str = (java.lang.String) ((java.util.HashMap) map).get(wxaLiteAppInfo.appId);
        }
        r1Var.f144471a.setText(str);
        r1Var.f144472b.setText("minBaselibMajorVersion: ".concat(liteAppMinBaseLibMajorVersion));
        return view;
    }
}
