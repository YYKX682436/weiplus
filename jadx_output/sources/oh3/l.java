package oh3;

/* loaded from: classes5.dex */
public final class l extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oh3.q f345438a;

    public l(oh3.q qVar) {
        this.f345438a = qVar;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        oh3.q qVar = this.f345438a;
        qVar.f345451d.post(new oh3.o(true, qVar, "onEnterForeground"));
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
    }
}
