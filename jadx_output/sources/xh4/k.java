package xh4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final xh4.k f454608d;

    /* renamed from: e, reason: collision with root package name */
    public static final xh4.k f454609e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xh4.k[] f454610f;

    static {
        xh4.k kVar = new xh4.k("Succeeded", 0, 100);
        f454608d = kVar;
        xh4.k kVar2 = new xh4.k("Failed", 1, 101);
        f454609e = kVar2;
        xh4.k[] kVarArr = {kVar, kVar2, new xh4.k("Error", 2, 102), new xh4.k("Help", 3, 103)};
        f454610f = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17, int i18) {
    }

    public static xh4.k valueOf(java.lang.String str) {
        return (xh4.k) java.lang.Enum.valueOf(xh4.k.class, str);
    }

    public static xh4.k[] values() {
        return (xh4.k[]) f454610f.clone();
    }
}
