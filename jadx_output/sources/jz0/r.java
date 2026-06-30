package jz0;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final jz0.r f302616d = new jz0.r();

    public r() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = obj instanceof android.app.Activity ? (android.app.Activity) obj : null;
        if (activity != null) {
            activity.finish();
        }
        return jz5.f0.f302826a;
    }
}
