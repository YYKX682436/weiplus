package gf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ gf.f2[] f271061d;

    static {
        gf.f2[] f2VarArr = {new gf.f2("ANDROID", 0, 2), new gf.f2("IOS", 1, 1)};
        f271061d = f2VarArr;
        rz5.b.a(f2VarArr);
    }

    public f2(java.lang.String str, int i17, int i18) {
    }

    public static gf.f2 valueOf(java.lang.String str) {
        return (gf.f2) java.lang.Enum.valueOf(gf.f2.class, str);
    }

    public static gf.f2[] values() {
        return (gf.f2[]) f271061d.clone();
    }
}
