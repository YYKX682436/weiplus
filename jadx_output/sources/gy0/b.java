package gy0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final gy0.b f277498d;

    /* renamed from: e, reason: collision with root package name */
    public static final gy0.b f277499e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ gy0.b[] f277500f;

    static {
        gy0.b bVar = new gy0.b("ForWard", 0);
        f277498d = bVar;
        gy0.b bVar2 = new gy0.b("BackWard", 1);
        f277499e = bVar2;
        gy0.b[] bVarArr = {bVar, bVar2};
        f277500f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static gy0.b valueOf(java.lang.String str) {
        return (gy0.b) java.lang.Enum.valueOf(gy0.b.class, str);
    }

    public static gy0.b[] values() {
        return (gy0.b[]) f277500f.clone();
    }
}
