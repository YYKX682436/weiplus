package ig2;

/* loaded from: classes10.dex */
public final class i implements ig2.r {

    /* renamed from: d, reason: collision with root package name */
    public final ng2.s f291383d;

    /* renamed from: e, reason: collision with root package name */
    public final ng2.c f291384e;

    public i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f291383d = new ng2.s(context);
        this.f291384e = new ng2.c(context);
    }

    @Override // kg2.a
    public void a() {
        this.f291384e.getClass();
        ig2.m.f291393a.d();
    }

    @Override // kg2.a
    public void b(yz5.a onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        ng2.c cVar = this.f291384e;
        cVar.getClass();
        cVar.u(onAnimationEndCallback);
    }

    @Override // kg2.a
    public void d(og2.a switchParams) {
        kotlin.jvm.internal.o.g(switchParams, "switchParams");
        this.f291384e.d(switchParams);
    }

    @Override // kg2.b
    public void e(ig2.n switchParams) {
        kotlin.jvm.internal.o.g(switchParams, "switchParams");
        this.f291383d.e(switchParams);
        ng2.c cVar = this.f291384e;
        cVar.getClass();
        cVar.f318565p = switchParams;
    }

    @Override // kg2.b
    public void f(com.tencent.mm.live.core.view.LiveVideoView renderView, yz5.l onFirstFrameRenderCallback, yz5.a isDetachInvokeFun) {
        kotlin.jvm.internal.o.g(renderView, "renderView");
        kotlin.jvm.internal.o.g(onFirstFrameRenderCallback, "onFirstFrameRenderCallback");
        kotlin.jvm.internal.o.g(isDetachInvokeFun, "isDetachInvokeFun");
        this.f291383d.f(renderView, onFirstFrameRenderCallback, isDetachInvokeFun);
    }

    @Override // ez2.b
    public void g(yz5.a onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        ng2.s sVar = this.f291383d;
        sVar.getClass();
        sVar.u(onAnimationEndCallback);
    }

    @Override // ez2.b
    public void h() {
        this.f291383d.h();
    }

    @Override // kg2.b
    public boolean i() {
        return this.f291383d.f318571r;
    }

    @Override // ig2.r
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ig2.j c() {
        return this.f291383d.d();
    }
}
