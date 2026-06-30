package f55;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f55.f[] f259775d;

    static {
        f55.f[] fVarArr = {new f55.f("Default", 0, 0), new f55.f("Finder_MentionEntrance", 1, 1), new f55.f("Finder_Entrance", 2, 2), new f55.f("Other_Left", 3, 3), new f55.f("Other_Right", 4, 4)};
        f259775d = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
    }

    public static f55.f valueOf(java.lang.String str) {
        return (f55.f) java.lang.Enum.valueOf(f55.f.class, str);
    }

    public static f55.f[] values() {
        return (f55.f[]) f259775d.clone();
    }
}
