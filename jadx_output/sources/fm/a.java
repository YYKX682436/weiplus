package fm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ fm.a[] f263961d;

    static {
        fm.a[] aVarArr = {new fm.a("Default", 0), new fm.a("LoginTick", 1), new fm.a("LoadStep", 2), new fm.a("ResourceCheck", 3), new fm.a("AutoDownload", 4), new fm.a("RESOURCE_LOAD_AVG", 5)};
        f263961d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static fm.a valueOf(java.lang.String str) {
        return (fm.a) java.lang.Enum.valueOf(fm.a.class, str);
    }

    public static fm.a[] values() {
        return (fm.a[]) f263961d.clone();
    }
}
