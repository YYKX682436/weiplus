package r00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final r00.b f367997d;

    /* renamed from: e, reason: collision with root package name */
    public static final r00.b f367998e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r00.b[] f367999f;

    static {
        r00.b bVar = new r00.b("GET_COLOR_TYPE_DEFAULT", 0);
        f367997d = bVar;
        r00.b bVar2 = new r00.b("GET_COLOR_TYPE_TOP_10PERC", 1);
        f367998e = bVar2;
        r00.b[] bVarArr = {bVar, bVar2};
        f367999f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static r00.b valueOf(java.lang.String str) {
        return (r00.b) java.lang.Enum.valueOf(r00.b.class, str);
    }

    public static r00.b[] values() {
        return (r00.b[]) f367999f.clone();
    }
}
