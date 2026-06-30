package cx;

/* loaded from: classes7.dex */
public final class p0 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cx.w0 f224453a;

    public p0(cx.w0 w0Var) {
        this.f224453a = w0Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrandBaseBiz", "run pending exceptionListener");
        cx.w0 w0Var = this.f224453a;
        w0Var.getClass();
        ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandDisconnectWhenAttach", 1, w0Var.O0(), 1.0f);
        yz5.a aVar = w0Var.B;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.removeLifecycleCallback(this);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
    }
}
