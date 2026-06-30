package com.tencent.mm.plugin.ipcall.model;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.plugin.ipcall.model.g f142465d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f142466a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f142467b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f142468c = new com.tencent.mm.plugin.ipcall.model.e(this, android.os.Looper.getMainLooper());

    public void a(com.tencent.mm.plugin.ipcall.model.f fVar, boolean z17) {
        if (fVar != null) {
            this.f142467b.add(fVar);
        }
        if (this.f142466a) {
            return;
        }
        java.lang.System.currentTimeMillis();
        if (s83.b.f404867b.size() == 0 || !z17) {
            java.lang.System.currentTimeMillis();
            java.util.ArrayList b17 = s83.b.b();
            java.lang.System.currentTimeMillis();
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f142468c;
            android.os.Message obtainMessage = n3Var.obtainMessage();
            obtainMessage.obj = b17;
            n3Var.sendMessage(obtainMessage);
            this.f142466a = true;
        }
    }
}
