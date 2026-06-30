package hn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ hn0.t[] f282436d;

    static {
        hn0.t[] tVarArr = {new hn0.t("Strategy_Unknown", 0, 0), new hn0.t("Strategy_SurfaceDestroyed_Check", 1, 1), new hn0.t("Strategy_SurfaceChanged_Check", 2, 2)};
        f282436d = tVarArr;
        rz5.b.a(tVarArr);
    }

    public t(java.lang.String str, int i17, int i18) {
    }

    public static hn0.t valueOf(java.lang.String str) {
        return (hn0.t) java.lang.Enum.valueOf(hn0.t.class, str);
    }

    public static hn0.t[] values() {
        return (hn0.t[]) f282436d.clone();
    }
}
