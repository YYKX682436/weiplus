package fo5;

/* loaded from: classes11.dex */
public final class z0 implements fo5.u0 {
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "unRegisterFlutterTextureRegister");
        fo5.r0 f17 = fo5.q2.f265071d.f();
        f17.f265100s = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "detach engine");
        ro5.b bVar = f17.f265097p;
        if (bVar != null) {
            bVar.w();
        } else {
            kotlin.jvm.internal.o.o("renderController");
            throw null;
        }
    }
}
