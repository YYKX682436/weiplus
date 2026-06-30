package s56;

/* loaded from: classes16.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final s56.j f403215a = new s56.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f403216b = new s56.g();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f403217c = new s56.h();

    public boolean a(p56.m mVar, java.lang.Object obj) {
        if (obj == f403216b) {
            mVar.onCompleted();
            return true;
        }
        if (obj == f403217c) {
            mVar.a(null);
            return false;
        }
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("The lite notification can not be null");
        }
        if (obj.getClass() == s56.i.class) {
            mVar.onError(((s56.i) obj).f403214d);
            return true;
        }
        mVar.a(obj);
        return false;
    }
}
