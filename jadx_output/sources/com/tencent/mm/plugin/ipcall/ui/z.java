package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes12.dex */
public class z implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f143089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.c0 f143091g;

    public z(com.tencent.mm.plugin.ipcall.ui.c0 c0Var, java.lang.String str, android.widget.ImageView imageView, java.lang.String str2) {
        this.f143091g = c0Var;
        this.f143088d = str;
        this.f143089e = imageView;
        this.f143090f = str2;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        com.tencent.mm.plugin.ipcall.ui.c0 c0Var = this.f143091g;
        com.tencent.mm.plugin.ipcall.ui.c0.a(c0Var, this.f143089e, this.f143090f, t83.c.d(c0Var.f142769d, this.f143088d, false));
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        return true;
    }
}
