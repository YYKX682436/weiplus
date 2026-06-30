package wd0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ wd0.d1[] f444702d;

    static {
        wd0.d1[] d1VarArr = {new wd0.d1("SUCCESS", 0, 0), new wd0.d1("INIT_FAILED", 1, 1), new wd0.d1("FINGERPRINT_NOT_SUPPORT", 2, 2), new wd0.d1("GET_ALL_PARAM_FAILED", 3, 3), new wd0.d1("GET_TICKET_FAILED", 4, 4), new wd0.d1("VERIFY_FINGERPRINT_ERROR", 5, 5), new wd0.d1("VERIFY_FINGERPRINT_TIMEOUT", 6, 6), new wd0.d1("VERIFY_FINGERPRINT_NOT_THE_SAME", 7, 7), new wd0.d1("VERIFY_CGI_ERROR", 8, 8), new wd0.d1("USER_CANCEL", 9, 9), new wd0.d1("UNDEFINED_ERROR", 10, 10), new wd0.d1("VERIFY_FINGERPRINT_RETRY", 11, 11), new wd0.d1("VERIFY_FINGERPRINT_IDC_FAILED", 12, 12)};
        f444702d = d1VarArr;
        rz5.b.a(d1VarArr);
    }

    public d1(java.lang.String str, int i17, int i18) {
    }

    public static wd0.d1 valueOf(java.lang.String str) {
        return (wd0.d1) java.lang.Enum.valueOf(wd0.d1.class, str);
    }

    public static wd0.d1[] values() {
        return (wd0.d1[]) f444702d.clone();
    }
}
