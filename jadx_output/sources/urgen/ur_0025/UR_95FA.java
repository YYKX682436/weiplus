package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u0011"}, d2 = {"Lurgen/ur_0025/UR_95FA;", "", "<init>", "()V", "URB_94AE", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "active", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, "", "URB_ABD8", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "URB_C36B", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UR_95FA {
    public static final urgen.ur_0025.UR_95FA INSTANCE = new urgen.ur_0025.UR_95FA();

    private UR_95FA() {
    }

    public static final void URB_94AE(com.tencent.unit_rc.BaseObjectDef obj, boolean active, int scene, byte[] extraData) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        sk4.b bVar = (sk4.b) ((jm4.i0) obj);
        if (active) {
            f25.f0 f0Var = new f25.f0(java.lang.String.valueOf(scene));
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f0Var, new sk4.a(f0Var, bVar, scene, extraData));
            boolean z17 = ((g25.e) m96).f267980c;
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioModuleImpl", "scene: " + f0Var + ", gainFocus");
            bVar.f408966d = m96;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioModuleImpl", "session: " + bVar.f408966d + ", loseFocus");
        f25.m0 m0Var = bVar.f408966d;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            bVar.f408966d = null;
        }
    }

    public static final void URB_ABD8(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef listener) {
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.j0 j0Var = (jm4.j0) listener;
        sk4.b bVar = (sk4.b) ((jm4.i0) obj);
        java.util.concurrent.locks.ReentrantLock reentrantLock = bVar.f408968f;
        reentrantLock.lock();
        try {
            bVar.f408967e.add(j0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void URB_C36B(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef listener) {
        kotlin.jvm.internal.o.g(obj, "obj");
        jm4.j0 j0Var = (jm4.j0) listener;
        sk4.b bVar = (sk4.b) ((jm4.i0) obj);
        java.util.concurrent.locks.ReentrantLock reentrantLock = bVar.f408968f;
        reentrantLock.lock();
        try {
            bVar.f408967e.remove(j0Var);
        } finally {
            reentrantLock.unlock();
        }
    }
}
