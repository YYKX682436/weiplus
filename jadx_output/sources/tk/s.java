package tk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ tk.s[] f419870d;

    static {
        tk.s[] sVarArr = {new tk.s("BizType_Unknown", 0, 0), new tk.s("BizType_Biz", 1, 1), new tk.s("BizType_Photo_Biz", 2, 2)};
        f419870d = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17, int i18) {
    }

    public static tk.s valueOf(java.lang.String str) {
        return (tk.s) java.lang.Enum.valueOf(tk.s.class, str);
    }

    public static tk.s[] values() {
        return (tk.s[]) f419870d.clone();
    }
}
