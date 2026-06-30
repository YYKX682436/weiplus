package x51;

/* loaded from: classes12.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Vector f452103a = new java.util.Vector();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f452104b = new java.util.LinkedList();

    public static boolean a(y60.e eVar) {
        java.util.LinkedList linkedList = f452104b;
        linkedList.remove(eVar);
        return linkedList.add(eVar);
    }

    public static boolean b(x51.o0 o0Var) {
        return (o0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(o0Var.g())) ? false : true;
    }

    public static android.graphics.Bitmap c(java.lang.String str) {
        x51.v0 v0Var = x51.v0.INSTANCE;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return com.tencent.mm.sdk.platformtools.x.j0(str, 0, 0, 0.0f);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MMPictureLogic", "error input, path is null");
        return null;
    }

    public static android.graphics.Bitmap d(x51.o0 o0Var) {
        android.graphics.Bitmap bitmap;
        if (!b(o0Var)) {
            return null;
        }
        gm0.b0 u17 = gm0.j1.u();
        if (u17.f273164q == null) {
            u17.f273164q = java.lang.Boolean.valueOf(u17.l());
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - u17.f273166s;
            if (currentTimeMillis <= 0 || currentTimeMillis >= 1000) {
                gm0.k0 k0Var = u17.f273165r;
                java.util.concurrent.Future future = k0Var.f273225d;
                if (future != null && !future.isDone()) {
                    k0Var.f273225d.cancel(false);
                }
                ((ku5.t0) ku5.t0.f312615d).k(u17.f273165r, 1000L);
                u17.f273166s = java.lang.System.currentTimeMillis();
            }
        }
        if (!u17.f273164q.booleanValue()) {
            return o0Var.e();
        }
        if (!o0Var.i()) {
            x51.v0 v0Var = x51.v0.INSTANCE;
            v0Var.getClass();
            iz5.a.g("picture strategy here must be validity", b(o0Var));
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) v0Var.f452100e).get(o0Var.d());
            if (weakReference == null) {
                return v0Var.e(o0Var);
            }
            android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) weakReference.get();
            return (bitmap2 == null || bitmap2.isRecycled()) ? v0Var.e(o0Var) : bitmap2;
        }
        x51.v0 v0Var2 = x51.v0.INSTANCE;
        v0Var2.getClass();
        iz5.a.g("picture strategy here must be validity", b(o0Var));
        java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.HashMap) v0Var2.f452100e).get(o0Var.d());
        if (weakReference2 == null || (bitmap = (android.graphics.Bitmap) weakReference2.get()) == null || bitmap.isRecycled()) {
            return null;
        }
        return bitmap;
    }

    public static boolean e(y60.e eVar) {
        return f452104b.remove(eVar);
    }
}
