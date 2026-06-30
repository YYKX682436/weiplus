package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.u2 f149423e;

    public t2(com.tencent.mm.plugin.mmsight.ui.u2 u2Var, java.lang.String str) {
        this.f149423e = u2Var;
        this.f149422d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f149422d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "DEBUG showDebugInfo %s", str);
        if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
            android.widget.TextView textView = (android.widget.TextView) this.f149423e.f149431d.findViewById(com.tencent.mm.R.id.oyh);
            textView.setVisibility(0);
            textView.setText(str);
        }
    }
}
