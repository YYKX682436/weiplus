package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149436e;

    public v2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI, java.lang.String str) {
        this.f149436e = sightCaptureUI;
        this.f149435d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f149435d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "DEBUG showCameraInfoImpl: %s", str);
        if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
            android.widget.TextView textView = (android.widget.TextView) this.f149436e.findViewById(com.tencent.mm.R.id.oyh);
            textView.setVisibility(0);
            textView.setText(str);
        }
    }
}
