package gp1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ gp1.j[] f274185d;

    static {
        gp1.j[] jVarArr = {new gp1.j("NONE", 0, -1), new gp1.j("EXPAND", 1, 0), new gp1.j("COLLAPSED_LEFT", 2, 1), new gp1.j("COLLAPSED_RIGHT", 3, 2), new gp1.j("DRAGGING", 4, 3)};
        f274185d = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17, int i18) {
    }

    public static gp1.j valueOf(java.lang.String str) {
        return (gp1.j) java.lang.Enum.valueOf(gp1.j.class, str);
    }

    public static gp1.j[] values() {
        return (gp1.j[]) f274185d.clone();
    }
}
