package rx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final rx0.b f400906d;

    /* renamed from: e, reason: collision with root package name */
    public static final rx0.b f400907e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rx0.b[] f400908f;

    static {
        rx0.b bVar = new rx0.b("TASK_TYPE_CREATE", 0);
        f400906d = bVar;
        rx0.b bVar2 = new rx0.b("TASK_TYPE_QUERY", 1);
        f400907e = bVar2;
        rx0.b[] bVarArr = {bVar, bVar2};
        f400908f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static rx0.b valueOf(java.lang.String str) {
        return (rx0.b) java.lang.Enum.valueOf(rx0.b.class, str);
    }

    public static rx0.b[] values() {
        return (rx0.b[]) f400908f.clone();
    }
}
