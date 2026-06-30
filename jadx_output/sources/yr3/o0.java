package yr3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ yr3.o0[] f464965d;

    static {
        yr3.o0[] o0VarArr = {new yr3.o0("NoFeature", 0, 0), new yr3.o0("FeatureCollapse", 1, 1), new yr3.o0("FeatureExpand", 2, 2)};
        f464965d = o0VarArr;
        rz5.b.a(o0VarArr);
    }

    public o0(java.lang.String str, int i17, int i18) {
    }

    public static yr3.o0 valueOf(java.lang.String str) {
        return (yr3.o0) java.lang.Enum.valueOf(yr3.o0.class, str);
    }

    public static yr3.o0[] values() {
        return (yr3.o0[]) f464965d.clone();
    }
}
