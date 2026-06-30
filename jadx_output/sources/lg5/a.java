package lg5;

/* loaded from: classes15.dex */
public final class a extends android.text.Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f318579a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile android.text.Editable.Factory f318580b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Class f318581c;

    public a() {
        try {
            f318581c = lg5.a.class.getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public android.text.Editable newEditable(java.lang.CharSequence charSequence) {
        java.lang.Class cls = f318581c;
        return cls != null ? new lg5.d(cls, charSequence) : super.newEditable(charSequence);
    }
}
