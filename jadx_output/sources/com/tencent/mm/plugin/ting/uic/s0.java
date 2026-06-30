package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class s0 implements al4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f174793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sl4.a f174794b;

    public s0(kotlin.coroutines.Continuation continuation, sl4.a aVar) {
        this.f174793a = continuation;
        this.f174794b = aVar;
    }

    @Override // al4.b
    public void a() {
        com.tencent.mm.plugin.ting.uic.t0.a(this.f174793a, false);
    }

    @Override // al4.b
    public void onAnimationEnd() {
        com.tencent.mm.plugin.ting.uic.t0.a(this.f174793a, true);
        zl4.e eVar = (zl4.e) this.f174794b;
        eVar.f409264s = true;
        eVar.f93132d.f93058s = true;
    }

    @Override // al4.b
    public void onAnimationStart() {
    }
}
