package nq4;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final nq4.f f339014a = new nq4.f();

    /* renamed from: b, reason: collision with root package name */
    public static int f339015b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f339016c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f339017d;

    /* renamed from: e, reason: collision with root package name */
    public static int f339018e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f339019f;

    static {
        f339016c = android.provider.Settings.Global.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "bluetooth_voip_state", 0) == 1;
        f339017d = true;
        f339018e = Integer.MAX_VALUE;
        nq4.g[] gVarArr = nq4.g.f339020d;
    }

    public final boolean a() {
        f339016c = android.provider.Settings.Global.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "bluetooth_voip_state", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "checkCanUseShortcutAnswer headSetSupported: " + f339016c + ", deviceSupported: " + f339017d + ", checkVoIPShortcutAnswer: " + vq4.b0.f() + ", checkVoIPShortcutSupportForManufacture: " + vq4.b0.h());
        return f339016c && f339017d && vq4.b0.f() && vq4.b0.h();
    }

    public final boolean b() {
        f339016c = android.provider.Settings.Global.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "bluetooth_voip_state", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "checkCanUseShortcutAnswerILink headSetSupported: " + f339016c + ", deviceSupported: " + f339017d + ", checkVoIPShortcutAnswer: " + vq4.b0.f() + ", checkVoIPShortcutSupportForManufacture: " + vq4.b0.h());
        return f339016c && f339017d && vq4.b0.f() && vq4.b0.h();
    }

    public final void c() {
        if (!vq4.b0.g()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called this device not support");
            return;
        }
        android.bluetooth.BluetoothHeadset Ni = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ni(1);
        if (f339018e < 0 && Ni == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called accept and set\u3000bl call state active cause not allow");
            return;
        }
        if (Ni != null) {
            try {
                java.lang.reflect.Method declaredMethod = Ni.getClass().getDeclaredMethod("voipCallStateChange", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class);
                if (declaredMethod != null) {
                    declaredMethod.invoke(Ni, 0, com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName(), "");
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called accept and set\u3000bl call state active");
                return;
            }
        }
        f339018e = 0;
        nq4.g[] gVarArr = nq4.g.f339020d;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "voip called accept come and set\u3000bl call state active");
    }

    public final void d() {
        if (!vq4.b0.g()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called this device not support");
            return;
        }
        android.bluetooth.BluetoothHeadset Ni = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ni(1);
        if (Ni == null) {
            return;
        }
        try {
            Ni.getClass().getDeclaredMethod("voipCallStateChange", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class).invoke(Ni, 7, com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName(), "");
            f339018e = 7;
            nq4.g[] gVarArr = nq4.g.f339020d;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "happened in voip called cancel and set\u3000bl call state disconnected");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called cancel and set\u3000bl call state disconnected");
        }
        f339019f = false;
    }

    public final boolean e() {
        if (!vq4.b0.g()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called this device not support");
            return false;
        }
        android.bluetooth.BluetoothHeadset Ni = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ni(1);
        if (f339018e < 4 && Ni == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in on voip calling come call cause not allow");
            return false;
        }
        if (Ni != null) {
            try {
                java.lang.reflect.Method declaredMethod = Ni.getClass().getDeclaredMethod("voipCallStateChange", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class);
                if (declaredMethod != null) {
                    declaredMethod.invoke(Ni, 4, com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName(), "");
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in on voip calling come call");
                f339017d = false;
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "voip calling come and set\u3000bl call state incoming");
        f339018e = 4;
        nq4.g[] gVarArr = nq4.g.f339020d;
        f339017d = true;
        return true;
    }

    public final boolean f() {
        if (!vq4.b0.g()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called this device not support");
            return false;
        }
        android.bluetooth.BluetoothHeadset Ni = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ni(1);
        if (f339018e < 2 && Ni == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in on voip dialing cause not allow");
            return false;
        }
        if (Ni != null) {
            try {
                java.lang.reflect.Method declaredMethod = Ni.getClass().getDeclaredMethod("voipCallStateChange", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class);
                if (declaredMethod != null) {
                    declaredMethod.invoke(Ni, 0, com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName(), "");
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in on voip dialing come call");
                f339017d = false;
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPShortCutAnswerHelper", "voip dialing come and set\u3000bl call state incoming");
        f339018e = 0;
        nq4.g[] gVarArr = nq4.g.f339020d;
        f339017d = true;
        return true;
    }

    public final void g(boolean z17) {
        if (!vq4.b0.f()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPShortCutAnswerHelper", "error happened in voip called this device not support");
        } else {
            if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ni(1) == null) {
                return;
            }
            if (z17) {
                f();
            } else {
                e();
            }
        }
    }
}
