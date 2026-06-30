package fh1;

/* loaded from: classes7.dex */
public final class u0 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fh1.x0 f262606a;

    public u0(fh1.x0 x0Var) {
        this.f262606a = x0Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        fh1.x0 x0Var = this.f262606a;
        com.tencent.mars.xlog.Log.i(x0Var.A, "run pending exceptionListener");
        yz5.a aVar = x0Var.F;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
    }
}
