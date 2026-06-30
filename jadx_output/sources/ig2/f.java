package ig2;

/* loaded from: classes10.dex */
public final class f implements ig2.r {

    /* renamed from: d, reason: collision with root package name */
    public final mg2.e f291373d;

    /* renamed from: e, reason: collision with root package name */
    public final mg2.a f291374e;

    public f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f291373d = new mg2.e(context);
        this.f291374e = new mg2.a(context);
    }

    @Override // kg2.a
    public void a() {
    }

    @Override // kg2.a
    public void b(yz5.a onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        mg2.a aVar = this.f291374e;
        aVar.getClass();
        aVar.u(onAnimationEndCallback);
    }

    @Override // ig2.r
    public ig2.n c() {
        return this.f291373d.b();
    }

    @Override // kg2.a
    public void d(og2.a switchParams) {
        kotlin.jvm.internal.o.g(switchParams, "switchParams");
        this.f291374e.d(switchParams);
    }

    @Override // kg2.b
    public void e(ig2.n switchParams) {
        kotlin.jvm.internal.o.g(switchParams, "switchParams");
        this.f291373d.e(switchParams);
        mg2.a aVar = this.f291374e;
        aVar.getClass();
        aVar.f318565p = switchParams;
    }

    @Override // kg2.b
    public void f(com.tencent.mm.live.core.view.LiveVideoView renderView, yz5.l onFirstFrameRenderCallback, yz5.a isDetachInvokeFun) {
        kotlin.jvm.internal.o.g(renderView, "renderView");
        kotlin.jvm.internal.o.g(onFirstFrameRenderCallback, "onFirstFrameRenderCallback");
        kotlin.jvm.internal.o.g(isDetachInvokeFun, "isDetachInvokeFun");
        this.f291373d.f(renderView, onFirstFrameRenderCallback, isDetachInvokeFun);
    }

    @Override // ez2.b
    public void g(yz5.a onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        this.f291373d.g(onAnimationEndCallback);
    }

    @Override // ez2.b
    public void h() {
        this.f291373d.h();
    }

    @Override // kg2.b
    public boolean i() {
        return this.f291373d.f318571r;
    }
}
