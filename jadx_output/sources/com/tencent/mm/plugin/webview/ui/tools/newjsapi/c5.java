package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class c5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f186005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186007f;

    public c5(java.util.ArrayList arrayList, nw4.k kVar, nw4.y2 y2Var) {
        this.f186005d = arrayList;
        this.f186006e = kVar;
        this.f186007f = y2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.util.ArrayList arrayList = this.f186005d;
        int size = arrayList.size();
        nw4.k kVar = this.f186006e;
        nw4.y2 y2Var = this.f186007f;
        if (i17 >= size) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return;
        }
        java.lang.String str = (java.lang.String) ((android.util.Pair) arrayList.get(i17)).first;
        java.util.HashMap hashMap = new java.util.HashMap();
        kotlin.jvm.internal.o.d(str);
        hashMap.put(dm.i4.COL_ID, str);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
    }
}
