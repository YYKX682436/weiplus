package sp;

/* loaded from: classes8.dex */
public class b extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f410939d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f410940e;

    public b(android.content.Context context, int i17) {
        super(context, i17);
        this.f410940e = new sp.a(this);
        if (android.os.Build.VERSION.SDK_INT > 28) {
            return;
        }
        try {
            java.lang.reflect.Field declaredField = android.app.Dialog.class.getDeclaredField("mDismissAction");
            declaredField.setAccessible(true);
            try {
                java.lang.reflect.Field declaredField2 = java.lang.reflect.Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (java.lang.Exception unused) {
            }
            this.f410939d = (java.lang.Runnable) declaredField.get(this);
            declaredField.set(this, this.f410940e);
        } catch (java.lang.IllegalAccessException unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SafeDismissDialog", "hijack fail IllegalAccessException");
        } catch (java.lang.NoSuchFieldException unused3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SafeDismissDialog", "hijack fail NoSuchFieldException");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SafeDismissDialog", e17, "", new java.lang.Object[0]);
        }
    }
}
