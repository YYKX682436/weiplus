package mm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class h0 {

    /* renamed from: h, reason: collision with root package name */
    public static final mm.h0 f328487h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ mm.h0[] f328488i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f328489d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f328490e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f328491f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f328492g;

    static {
        mm.h0 h0Var = new mm.h0("Control", 0, "0", "-1", "0", "2000", "0", "1", "0");
        f328487h = h0Var;
        mm.h0[] h0VarArr = {h0Var, new mm.h0("Experiment", 1, "0", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "0", "0", "1", "1", "1")};
        f328488i = h0VarArr;
        rz5.b.a(h0VarArr);
    }

    public h0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.f328489d = str3;
        this.f328490e = str5;
        this.f328491f = str6;
        this.f328492g = str8;
    }

    public static mm.h0 valueOf(java.lang.String str) {
        return (mm.h0) java.lang.Enum.valueOf(mm.h0.class, str);
    }

    public static mm.h0[] values() {
        return (mm.h0[]) f328488i.clone();
    }
}
