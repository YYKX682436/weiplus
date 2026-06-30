package z2;

/* loaded from: classes13.dex */
public abstract class o1 {
    public static z2.r1 a(android.os.PersistableBundle persistableBundle) {
        z2.q1 q1Var = new z2.q1();
        q1Var.f469507a = persistableBundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        q1Var.f469509c = persistableBundle.getString("uri");
        q1Var.f469510d = persistableBundle.getString("key");
        q1Var.f469511e = persistableBundle.getBoolean("isBot");
        q1Var.f469512f = persistableBundle.getBoolean("isImportant");
        return new z2.r1(q1Var);
    }

    public static android.os.PersistableBundle b(z2.r1 r1Var) {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        java.lang.CharSequence charSequence = r1Var.f469513a;
        persistableBundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", r1Var.f469515c);
        persistableBundle.putString("key", r1Var.f469516d);
        persistableBundle.putBoolean("isBot", r1Var.f469517e);
        persistableBundle.putBoolean("isImportant", r1Var.f469518f);
        return persistableBundle;
    }
}
