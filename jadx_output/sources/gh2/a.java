package gh2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ gh2.a[] f271854d;

    static {
        gh2.a[] aVarArr = {new gh2.a("LoadSoFail", 0, "loadSoFail"), new gh2.a("ResourceEmpty", 1, "ResourceEmpty"), new gh2.a("ParseResourceEmpty", 2, "ParseResourceEmpty"), new gh2.a("TimeOut", 3, "TimeOut")};
        f271854d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
    }

    public static gh2.a valueOf(java.lang.String str) {
        return (gh2.a) java.lang.Enum.valueOf(gh2.a.class, str);
    }

    public static gh2.a[] values() {
        return (gh2.a[]) f271854d.clone();
    }
}
