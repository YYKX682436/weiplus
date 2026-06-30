package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f188419f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.i f188420g;

    public f(com.tencent.mm.plugin.wepkg.model.i iVar, java.lang.String str, int i17, int i18) {
        this.f188420g = iVar;
        this.f188417d = str;
        this.f188418e = i17;
        this.f188419f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f188420g.g(this.f188417d, this.f188418e, this.f188419f);
    }
}
