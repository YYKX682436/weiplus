package ii2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ii2.b f291621d;

    /* renamed from: e, reason: collision with root package name */
    public static final ii2.b f291622e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ii2.b[] f291623f;

    static {
        ii2.b bVar = new ii2.b("Top", 0);
        f291621d = bVar;
        ii2.b bVar2 = new ii2.b("Bottom", 1);
        f291622e = bVar2;
        ii2.b[] bVarArr = {bVar, bVar2};
        f291623f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static ii2.b valueOf(java.lang.String str) {
        return (ii2.b) java.lang.Enum.valueOf(ii2.b.class, str);
    }

    public static ii2.b[] values() {
        return (ii2.b[]) f291623f.clone();
    }
}
