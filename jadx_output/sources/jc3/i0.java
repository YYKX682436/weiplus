package jc3;

/* loaded from: classes7.dex */
public interface i0 {
    static /* synthetic */ void p0(jc3.i0 i0Var, android.app.Activity activity, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activate");
        }
        if ((i17 & 1) != 0) {
            activity = null;
        }
        i0Var.V(activity);
    }

    void S(jc3.l0 l0Var);

    void V(android.app.Activity activity);

    void deactivate();

    void l(com.tencent.mm.plugin.magicbrush.base.MBJsEventBase mBJsEventBase);

    void pause();

    void resume();

    void t0(java.lang.String str, yz5.l lVar);
}
