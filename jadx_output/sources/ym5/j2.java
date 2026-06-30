package ym5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ym5.j2[] f463392d;

    static {
        ym5.j2[] j2VarArr = {new ym5.j2("UNKNOWN", 0, 0), new ym5.j2("SCENE_LIVE", 1, 1), new ym5.j2("SCENE_FINDER", 2, 2)};
        f463392d = j2VarArr;
        rz5.b.a(j2VarArr);
    }

    public j2(java.lang.String str, int i17, int i18) {
    }

    public static ym5.j2 valueOf(java.lang.String str) {
        return (ym5.j2) java.lang.Enum.valueOf(ym5.j2.class, str);
    }

    public static ym5.j2[] values() {
        return (ym5.j2[]) f463392d.clone();
    }
}
