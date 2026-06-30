package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes12.dex */
public class y implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f143078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.c0 f143080g;

    public y(com.tencent.mm.plugin.ipcall.ui.c0 c0Var, java.lang.String str, android.widget.ImageView imageView, java.lang.String str2) {
        this.f143080g = c0Var;
        this.f143077d = str;
        this.f143078e = imageView;
        this.f143079f = str2;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        java.lang.String str = this.f143077d;
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str);
        if (a17 == null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            a17 = com.tencent.mm.modelavatar.z.h(com.tencent.mm.modelavatar.d1.Ai().j(str, false), str, false);
        }
        com.tencent.mm.plugin.ipcall.ui.c0.a(this.f143080g, this.f143078e, this.f143079f, a17);
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        return false;
    }
}
