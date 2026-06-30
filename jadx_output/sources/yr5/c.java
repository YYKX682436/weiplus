package yr5;

/* loaded from: classes3.dex */
public final class c extends bs5.d {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f465113c = "http://%s/d?%s&alg=aes" + bs5.d.f24016b;

    @Override // bs5.d
    public int a() {
        return 80;
    }

    @Override // bs5.d
    public java.lang.String c(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty(str2) ? "" : java.lang.String.format(java.util.Locale.US, f465113c, str, str2);
    }
}
