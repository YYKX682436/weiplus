package gh;

/* loaded from: classes7.dex */
public final class l0 extends gh.c implements java.lang.Runnable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.magicbrush.MBRuntime runtime, ch.g jsThreadHandler) {
        super(runtime, jsThreadHandler);
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(jsThreadHandler, "jsThreadHandler");
    }

    @Override // gh.c
    public gh.b b() {
        return gh.b.NativeLocker;
    }

    @Override // gh.c
    public void d() {
    }

    @Override // gh.c
    public void e() {
    }

    @Override // gh.c
    public void f() {
        this.f271802e.k(new java.lang.Runnable() { // from class: gh.l0$$a
            @Override // java.lang.Runnable
            public final void run() {
                gh.l0 this$0 = gh.l0.this;
                kotlin.jvm.internal.o.g(this$0, "this$0");
                com.tencent.magicbrush.MBRuntime mBRuntime = this$0.f271801d;
                if (mBRuntime.f48577a == 0) {
                    return;
                }
                mBRuntime.nativeStopAnimationFrameLooper(mBRuntime.f48577a);
            }
        }, false);
    }

    @Override // gh.c
    public void g() {
        this.f271802e.k(this, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        ah.i.b("AnimationFrameHandler", "hy: start native raf looper", new java.lang.Object[0]);
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f271801d;
        if (mBRuntime.f48577a == 0) {
            return;
        }
        mBRuntime.nativeNotifyAnimationFrameLooper(mBRuntime.f48577a);
    }
}
