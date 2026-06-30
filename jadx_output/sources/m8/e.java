package m8;

/* loaded from: classes15.dex */
public final class e extends java.lang.Exception {

    /* renamed from: d, reason: collision with root package name */
    public final int f324555d;

    public e(int i17, java.lang.String str, java.lang.Throwable th6, int i18) {
        super(str, th6);
        this.f324555d = i17;
    }

    public static m8.e a(java.lang.Exception exc, int i17) {
        return new m8.e(1, null, exc, i17);
    }
}
