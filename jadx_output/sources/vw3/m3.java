package vw3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ vw3.m3[] f441031d;

    static {
        vw3.m3[] m3VarArr = {new vw3.m3("RANDOM_SVR_ID", 0), new vw3.m3("REFRESH_TIME", 1), new vw3.m3("PUSH", 2), new vw3.m3("VIDEO_EXPIRED", 3)};
        f441031d = m3VarArr;
        rz5.b.a(m3VarArr);
    }

    public m3(java.lang.String str, int i17) {
    }

    public static vw3.m3 valueOf(java.lang.String str) {
        return (vw3.m3) java.lang.Enum.valueOf(vw3.m3.class, str);
    }

    public static vw3.m3[] values() {
        return (vw3.m3[]) f441031d.clone();
    }
}
