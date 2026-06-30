package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j3 f139649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u43.b f139652g;

    public g3(com.tencent.mm.plugin.game.luggage.jsapi.j3 j3Var, android.content.Context context, java.lang.String str, u43.b bVar) {
        this.f139649d = j3Var;
        this.f139650e = context;
        this.f139651f = str;
        this.f139652g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String pkgName = this.f139651f;
        kotlin.jvm.internal.o.f(pkgName, "$pkgName");
        u43.b bVar = this.f139652g;
        java.lang.String field_patchPath = bVar.field_patchPath;
        kotlin.jvm.internal.o.f(field_patchPath, "field_patchPath");
        com.tencent.mm.plugin.game.luggage.jsapi.j3.f(this.f139649d, this.f139650e, pkgName, field_patchPath, bVar);
    }
}
