package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class s implements al4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f174792a;

    public s(kotlin.coroutines.Continuation continuation) {
        this.f174792a = continuation;
    }

    @Override // al4.b
    public void a() {
        com.tencent.mm.plugin.ting.uic.z.Q6(this.f174792a, false);
    }

    @Override // al4.b
    public void onAnimationEnd() {
        com.tencent.mm.plugin.ting.uic.z.Q6(this.f174792a, true);
    }

    @Override // al4.b
    public void onAnimationStart() {
    }
}
