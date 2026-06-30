package hw;

/* loaded from: classes7.dex */
public final class x extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hw.c0 f285446a;

    public x(hw.c0 c0Var) {
        this.f285446a = c0Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsTLBaseBiz", "run pending exceptionListener");
        hw.c0 c0Var = this.f285446a;
        c0Var.getClass();
        yz5.a aVar = c0Var.B;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.removeLifecycleCallback(this);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
    }
}
