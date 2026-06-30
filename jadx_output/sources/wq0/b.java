package wq0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final wq0.b f448494d;

    /* renamed from: e, reason: collision with root package name */
    public static final wq0.b f448495e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ wq0.b[] f448496f;

    static {
        wq0.b bVar = new wq0.b("Active", 0);
        f448494d = bVar;
        wq0.b bVar2 = new wq0.b("DeActive", 1);
        f448495e = bVar2;
        wq0.b[] bVarArr = {bVar, bVar2};
        f448496f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static wq0.b valueOf(java.lang.String str) {
        return (wq0.b) java.lang.Enum.valueOf(wq0.b.class, str);
    }

    public static wq0.b[] values() {
        return (wq0.b[]) f448496f.clone();
    }
}
