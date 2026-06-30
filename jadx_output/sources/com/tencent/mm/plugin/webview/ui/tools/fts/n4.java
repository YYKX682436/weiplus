package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes5.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.v4 f184540f;

    public n4(com.tencent.mm.plugin.webview.ui.tools.fts.v4 v4Var, android.view.View view, android.view.View view2) {
        this.f184540f = v4Var;
        this.f184538d = view;
        this.f184539e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.v4 v4Var = this.f184540f;
        float[] fArr = v4Var.f184690p;
        android.view.View view = this.f184538d;
        fArr[0] = view.getY();
        v4Var.f184690p[1] = view.getY() - this.f184539e.getY();
        float[] fArr2 = v4Var.f184690p;
        v4Var.getClass();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < fArr2.length; i17++) {
            stringBuffer.append(java.lang.String.format("[%d]: %.2f,", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(fArr2[i17])));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosAnimatorBaseController", "printArray:" + stringBuffer.toString());
    }
}
