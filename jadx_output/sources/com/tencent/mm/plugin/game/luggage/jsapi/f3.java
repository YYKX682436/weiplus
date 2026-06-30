package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j3 f139637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u43.b f139640g;

    public f3(com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var, android.content.Context context, java.lang.String str, u43.b bVar) {
        this.f139637d = j3Var;
        this.f139638e = context;
        this.f139639f = str;
        this.f139640g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String pkgName = this.f139639f;
        kotlin.jvm.internal.o.f(pkgName, "$pkgName");
        u43.b bVar = this.f139640g;
        java.lang.String field_patchPath = bVar.field_patchPath;
        kotlin.jvm.internal.o.f(field_patchPath, "field_patchPath");
        com.tencent.mm.plugin.game.luggage.jsapi.j3.f(this.f139637d, this.f139638e, pkgName, field_patchPath, bVar);
    }
}
