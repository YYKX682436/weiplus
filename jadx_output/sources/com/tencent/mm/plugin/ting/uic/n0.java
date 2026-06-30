package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class n0 implements al4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f174780a;

    public n0(kotlin.coroutines.Continuation continuation) {
        this.f174780a = continuation;
    }

    @Override // al4.b
    public void a() {
        com.tencent.mm.plugin.ting.uic.o0.a(this.f174780a, false);
    }

    @Override // al4.b
    public void onAnimationEnd() {
        b66.g b17 = b66.i.f18167d.b(bw5.eq0.TingMusic);
        if (b17 != null) {
            ((b66.i) b17).d();
        }
        com.tencent.mm.plugin.ting.uic.o0.a(this.f174780a, true);
    }

    @Override // al4.b
    public void onAnimationStart() {
    }
}
