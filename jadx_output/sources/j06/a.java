package j06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final j06.a f297036d;

    /* renamed from: e, reason: collision with root package name */
    public static final j06.a f297037e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j06.a[] f297038f;

    static {
        j06.a aVar = new j06.a("CALL_BY_NAME", 0);
        f297036d = aVar;
        j06.a aVar2 = new j06.a("POSITIONAL_CALL", 1);
        f297037e = aVar2;
        j06.a[] aVarArr = {aVar, aVar2};
        f297038f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static j06.a valueOf(java.lang.String str) {
        return (j06.a) java.lang.Enum.valueOf(j06.a.class, str);
    }

    public static j06.a[] values() {
        return (j06.a[]) f297038f.clone();
    }
}
