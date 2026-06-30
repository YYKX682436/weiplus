package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes5.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.v4 f184527e;

    public m4(com.tencent.mm.plugin.webview.ui.tools.fts.v4 v4Var, android.view.View view) {
        this.f184527e = v4Var;
        this.f184526d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.v4 v4Var = this.f184527e;
        float[] fArr = v4Var.f184689o[0];
        android.view.View view = this.f184526d;
        fArr[0] = view.getY();
        float[][] fArr2 = v4Var.f184689o;
        fArr2[0][1] = 0.0f;
        fArr2[1][0] = view.getX();
        float[][] fArr3 = v4Var.f184689o;
        fArr3[1][1] = 0.0f;
        fArr3[2][0] = view.getMeasuredWidth();
        v4Var.f184689o[2][1] = view.getMeasuredWidth() + (v4Var.f184675a * 2);
        float[][] fArr4 = v4Var.f184689o;
        v4Var.getClass();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < fArr4.length; i17++) {
            for (int i18 = 0; i18 < fArr4[i17].length; i18++) {
                stringBuffer.append(java.lang.String.format("[%d,%d]: %.2f,", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(fArr4[i17][i18])));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosAnimatorBaseController", "printArray:" + stringBuffer.toString());
    }
}
