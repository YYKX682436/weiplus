package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class pa implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186436e;

    public pa(nw4.k kVar, nw4.y2 y2Var) {
        this.f186435d = kVar;
        this.f186436e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("KEY_RESULT_CODE");
        android.os.Bundle bundle2 = (android.os.Bundle) bundle.getParcelable("KEY_RESULT_DATA");
        nw4.k kVar = this.f186435d;
        nw4.y2 y2Var = this.f186436e;
        if (i17 != -1) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail_cancel", null);
            return;
        }
        pj4.w wVar = new pj4.w();
        byte[] byteArray = bundle2 != null ? bundle2.getByteArray("select_status_info") : null;
        if (byteArray != null) {
            wVar.parseFrom(byteArray);
        }
        java.lang.String str = wVar.f355311d;
        if (str == null) {
            str = "";
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("icon_id", str);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", linkedHashMap);
    }
}
