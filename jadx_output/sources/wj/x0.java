package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ wj.x0[] f446546d;

    static {
        wj.x0[] x0VarArr = {new wj.x0("SaveSuccess", 0, 0), new wj.x0("AidNotFound", 1, 1), new wj.x0("AdInfoNotFound", 2, 2), new wj.x0("PosIdNotMatch", 3, 3)};
        f446546d = x0VarArr;
        rz5.b.a(x0VarArr);
    }

    public x0(java.lang.String str, int i17, int i18) {
    }

    public static wj.x0 valueOf(java.lang.String str) {
        return (wj.x0) java.lang.Enum.valueOf(wj.x0.class, str);
    }

    public static wj.x0[] values() {
        return (wj.x0[]) f446546d.clone();
    }
}
