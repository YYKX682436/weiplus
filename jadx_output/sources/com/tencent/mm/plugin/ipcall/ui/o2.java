package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class o2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI f142972d;

    public o2(com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI) {
        this.f142972d = iPCallMsgUI;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.ipcall.ui.n2(this));
    }
}
