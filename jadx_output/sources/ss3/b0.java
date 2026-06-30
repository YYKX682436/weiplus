package ss3;

/* loaded from: classes5.dex */
public class b0 implements java.lang.Runnable {
    public b0(ss3.d0 d0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            com.tencent.mm.sdk.platformtools.t8.i(g83.a.a(), "ReaderApp_", 604800000L);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|onAccountPostReset";
    }
}
