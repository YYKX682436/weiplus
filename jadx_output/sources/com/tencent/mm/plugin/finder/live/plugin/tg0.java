package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tg0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114399e;

    public tg0(java.lang.String str, java.lang.String str2) {
        this.f114398d = str;
        this.f114399e = str2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        ((db5.h4) g4Var.f(1, this.f114398d)).f228373q = this.f114399e;
    }
}
