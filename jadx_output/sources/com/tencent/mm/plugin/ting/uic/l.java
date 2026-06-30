package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class l implements al4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f174773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sl4.a f174774b;

    public l(kotlin.coroutines.Continuation continuation, sl4.a aVar) {
        this.f174773a = continuation;
        this.f174774b = aVar;
    }

    @Override // al4.b
    public void a() {
        com.tencent.mm.plugin.ting.uic.m.a(this.f174773a, false);
    }

    @Override // al4.b
    public void onAnimationEnd() {
        com.tencent.mm.plugin.ting.uic.m.a(this.f174773a, true);
        vl4.l lVar = (vl4.l) this.f174774b;
        lVar.f409264s = true;
        lVar.f93132d.f93058s = true;
    }

    @Override // al4.b
    public void onAnimationStart() {
    }
}
