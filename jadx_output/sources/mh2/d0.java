package mh2;

/* loaded from: classes10.dex */
public final class d0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f326313d;

    public d0(mh2.k0 k0Var) {
        this.f326313d = k0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mh2.a singingWidget;
        mh2.a finishSingingWidget;
        mh2.a prepareSingWidget;
        mh2.a noSingerWidget;
        om2.d0 d0Var = (om2.d0) obj;
        mh2.k0 k0Var = this.f326313d;
        com.tencent.mars.xlog.Log.i(k0Var.f326386g, "collect sing_state: " + d0Var);
        if (d0Var instanceof om2.v) {
            noSingerWidget = k0Var.getNoSingerWidget();
            mh2.k0.f(k0Var, noSingerWidget, d0Var);
            k0Var.f326391o = null;
        } else if (d0Var instanceof om2.x) {
            prepareSingWidget = k0Var.getPrepareSingWidget();
            mh2.k0.f(k0Var, prepareSingWidget, d0Var);
            k0Var.f326391o = ((om2.x) d0Var).f346388a.f346360a;
        } else if (d0Var instanceof om2.c0) {
            finishSingingWidget = k0Var.getFinishSingingWidget();
            mh2.k0.f(k0Var, finishSingingWidget, d0Var);
            k0Var.f326391o = null;
        } else if (d0Var instanceof om2.e0) {
            om2.e0 e0Var = (om2.e0) d0Var;
            mh2.k0.a(k0Var, e0Var.f346299a);
            singingWidget = k0Var.getSingingWidget();
            mh2.k0.f(k0Var, singingWidget, d0Var);
            k0Var.f326391o = e0Var.f346299a.f346360a;
        }
        return jz5.f0.f302826a;
    }
}
