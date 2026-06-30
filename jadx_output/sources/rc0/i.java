package rc0;

@j95.b
/* loaded from: classes12.dex */
public class i extends i95.w implements sc0.g {
    public void wi(android.content.Context context) {
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "setLaunchRecovery, dump recovery status:");
        d55.j b17 = d55.j.b(context);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash count   = " + b17.f226591d.f226597a);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash time    = " + b17.f226588a);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash version = " + b17.f226589b);
        android.os.Bundle bundle = new android.os.Bundle();
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("recovery_enable", 4);
        if (sharedPreferences == null) {
            throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting enable       = " + (bundle.containsKey("enable") ? bundle.getBoolean("enable") : sharedPreferences.getBoolean("enable", true)));
        d55.a0 a0Var = new d55.a0(context);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting threshold 1  = " + a0Var.f226555a);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting threshold 2  = " + a0Var.f226556b);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting interval     = " + a0Var.f226557c);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting min interval = " + a0Var.f226559e);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting auto reset   = " + a0Var.f226560f);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "setLaunchRecovery, main process will crash immediately");
        d55.j b18 = d55.j.b(context);
        b18.f226591d.f226597a = a0Var.f226555a;
        b18.f226588a = java.lang.System.currentTimeMillis();
        b18.e();
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "setting new recovery status:");
        d55.j b19 = d55.j.b(context);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash count   = " + b19.f226591d.f226597a);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash time    = " + b19.f226588a);
        com.tencent.mars.xlog.Log.w("MicroMsg.Recovery.RecoveryHelper", "crash version = " + b19.f226589b);
        throw new java.lang.RuntimeException("setLaunchRecovery");
    }
}
