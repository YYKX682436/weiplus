package rk4;

/* loaded from: classes3.dex */
public final class i5 extends com.tencent.unit_rc.BaseObject implements jm4.i1 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f396721e;

    /* renamed from: d, reason: collision with root package name */
    public static final rk4.i5 f396720d = new rk4.i5();

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f396722f = true;

    @Override // jm4.i1
    public void Dd(long j17, yz5.a aVar) {
        rk4.k5.c("waitForPluginAttached: " + j17, "TingFlutterPluginHelperImpl");
        if (f396722f) {
            rk4.k5.c("waitForPluginAttached: attached", "TingFlutterPluginHelperImpl");
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        try {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new rk4.h5(j17, aVar, null), 3, null);
        } catch (kotlinx.coroutines.x3 unused) {
            rk4.k5.c("waitForPluginAttached: timeout", "TingFlutterPluginHelperImpl");
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // jm4.i1
    public void o2(boolean z17) {
        rk4.k5.c("setPluginAttached: " + z17, "TingFlutterPluginHelperImpl");
        f396722f = z17;
    }

    @Override // jm4.i1
    public boolean yd() {
        rk4.k5.c("getPluginAttached: " + f396722f, "TingFlutterPluginHelperImpl");
        return f396722f;
    }
}
