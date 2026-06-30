package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes3.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144914d;

    public w0(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144914d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144914d;
        int i17 = x1Var.A1;
        x1Var.A1 = x1Var.f144943z1.getHeight();
        android.view.View view = x1Var.f144943z1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$14", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$14", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
