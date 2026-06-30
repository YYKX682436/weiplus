package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes12.dex */
public class x implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f143061d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f143064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.c0 f143066i;

    public x(com.tencent.mm.plugin.ipcall.ui.c0 c0Var, java.lang.String str, java.lang.String str2, android.widget.ImageView imageView, java.lang.String str3) {
        this.f143066i = c0Var;
        this.f143062e = str;
        this.f143063f = str2;
        this.f143064g = imageView;
        this.f143065h = str3;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        com.tencent.mm.plugin.ipcall.ui.c0 c0Var = this.f143066i;
        android.graphics.Bitmap d17 = t83.c.d(c0Var.f142769d, this.f143062e, false);
        if (d17 != null) {
            com.tencent.mm.sdk.platformtools.r2 r2Var = c0Var.f142767b;
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(d17);
            java.lang.String str = this.f143063f;
            r2Var.put(str, weakReference);
            this.f143061d = true;
            com.tencent.mm.plugin.ipcall.ui.c0.a(c0Var, this.f143064g, str, d17);
        }
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        if (this.f143061d) {
            return true;
        }
        com.tencent.mm.plugin.ipcall.ui.c0 c0Var = this.f143066i;
        c0Var.getClass();
        java.lang.String str = this.f143062e;
        java.lang.String str2 = this.f143065h;
        c0Var.f142766a.a(new com.tencent.mm.plugin.ipcall.ui.y(c0Var, str2, this.f143064g, com.tencent.mm.plugin.ipcall.ui.c0.b(str, str2)));
        return true;
    }
}
