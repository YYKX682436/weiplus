package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class e3 implements rx5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j3 f139628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139630d;

    public e3(java.lang.String str, com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var, android.content.Context context, java.lang.String str2) {
        this.f139627a = str;
        this.f139628b = j3Var;
        this.f139629c = context;
        this.f139630d = str2;
    }

    @Override // rx5.b
    public void a(java.lang.String str, java.lang.String str2, boolean z17) {
        u43.b bVar = new u43.b();
        bVar.field_patchPath = str2;
        bVar.field_taskStatus = 1;
        bVar.field_isServerPatch = true;
        java.lang.String str3 = this.f139627a;
        bVar.field_pkgName = str3;
        com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var = this.f139628b;
        j3Var.j(j3Var.f139694e, bVar);
        bVar.field_startTime = java.lang.System.currentTimeMillis();
        ((u43.a) i95.n0.c(u43.a.class)).ya(bVar);
        android.content.Context context = this.f139629c;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.plugin.game.luggage.jsapi.j3.f(j3Var, context, str3, this.f139630d, bVar);
    }

    @Override // rx5.b
    public void b(java.lang.String str, int i17, boolean z17) {
        this.f139628b.i(this.f139627a, "download_patch_failed");
    }

    @Override // rx5.b
    public void c(java.lang.String str, long j17, long j18) {
    }
}
