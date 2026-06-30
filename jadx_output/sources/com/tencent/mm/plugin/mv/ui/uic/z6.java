package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class z6 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f151588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151589b;

    public z6(kotlin.jvm.internal.h0 h0Var, java.lang.String str) {
        this.f151588a = h0Var;
        this.f151589b = str;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        this.f151588a.f310123d = com.tencent.mm.sdk.platformtools.x.i0(this.f151589b);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvShareUIC", "downloadImage");
    }
}
