package ze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ze.b f471716d;

    /* renamed from: e, reason: collision with root package name */
    public static final ze.b f471717e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ze.b[] f471718f;

    static {
        ze.b bVar = new ze.b("LANDSCAPE", 0);
        f471716d = bVar;
        ze.b bVar2 = new ze.b("PORTRAIT", 1);
        f471717e = bVar2;
        ze.b[] bVarArr = {bVar, bVar2};
        f471718f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static ze.b valueOf(java.lang.String str) {
        return (ze.b) java.lang.Enum.valueOf(ze.b.class, str);
    }

    public static ze.b[] values() {
        return (ze.b[]) f471718f.clone();
    }
}
