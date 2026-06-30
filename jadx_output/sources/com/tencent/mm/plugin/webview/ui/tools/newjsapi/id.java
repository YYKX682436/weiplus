package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class id implements com.tencent.mm.ui.widget.picker.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f186261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186263c;

    public id(com.tencent.mm.ui.widget.picker.c0 c0Var, nw4.k kVar, nw4.y2 y2Var) {
        this.f186261a = c0Var;
        this.f186262b = kVar;
        this.f186263c = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.z
    public final void a(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f186261a;
        c0Var.d();
        nw4.k kVar = this.f186262b;
        nw4.y2 y2Var = this.f186263c;
        if (!z17) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail, cancel", null);
            return;
        }
        boolean z18 = obj instanceof java.lang.String;
        if ((!z18 && !(obj2 instanceof java.lang.String) && !c0Var.f()) || (!z18 && !(obj2 instanceof java.lang.String) && !(obj3 instanceof java.lang.String) && c0Var.f())) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail, result unknown error", null);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        jSONArray.put((java.lang.String) obj);
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        jSONArray.put((java.lang.String) obj2);
        if (c0Var.f()) {
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            jSONArray.put((java.lang.String) obj3);
        }
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put(c0Var.b());
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = c0Var.f212257r;
        jSONArray2.put(customOptionPickNew != null ? customOptionPickNew.getValue() : 0);
        if (c0Var.f()) {
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew2 = c0Var.f212258s;
            jSONArray2.put(customOptionPickNew2 != null ? customOptionPickNew2.getValue() : 0);
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("current", jSONArray);
        hashMap.put("currentIndex", jSONArray2);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
    }
}
