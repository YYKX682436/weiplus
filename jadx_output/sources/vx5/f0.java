package vx5;

/* loaded from: classes8.dex */
public class f0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f441347a;

    public f0(vx5.i0 i0Var, android.webkit.ValueCallback valueCallback) {
        this.f441347a = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        by5.i0 i0Var;
        by5.i0 i0Var2;
        boolean z17;
        java.util.Objects.toString(obj);
        com.tencent.xweb.n2 n2Var = new com.tencent.xweb.n2();
        android.webkit.ValueCallback valueCallback = this.f441347a;
        if (obj == null) {
            n2Var.f220348a = -1;
            valueCallback.onReceiveValue(n2Var);
            return;
        }
        try {
            try {
                i0Var = new by5.i0(obj, "getCaptureStatus", new java.lang.Class[0]);
                i0Var2 = new by5.i0(obj, "getBitmap", new java.lang.Class[0]);
                z17 = true;
            } catch (java.lang.Exception e17) {
                n2Var.f220349b = null;
                n2Var.f220348a = -1;
                e17.getMessage();
            }
            if (!(i0Var2.f36487e == null)) {
                if (i0Var.f36487e != null) {
                    z17 = false;
                }
                if (!z17) {
                    int intValue = ((java.lang.Integer) i0Var.b(new java.lang.Object[0])).intValue();
                    n2Var.f220348a = intValue;
                    if (intValue == 0) {
                        n2Var.f220349b = (android.graphics.Bitmap) i0Var2.b(new java.lang.Object[0]);
                    }
                    n2Var.toString();
                    valueCallback.onReceiveValue(n2Var);
                }
            }
            n2Var.f220349b = null;
            n2Var.f220348a = -1;
            valueCallback.onReceiveValue(n2Var);
        } catch (java.lang.Throwable th6) {
            valueCallback.onReceiveValue(n2Var);
            throw th6;
        }
    }
}
