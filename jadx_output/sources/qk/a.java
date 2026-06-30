package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final qk.a f364000d;

    /* renamed from: e, reason: collision with root package name */
    public static final qk.a f364001e;

    /* renamed from: f, reason: collision with root package name */
    public static final qk.a f364002f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qk.a[] f364003g;

    static {
        qk.a aVar = new qk.a("Unknown", 0);
        f364000d = aVar;
        qk.a aVar2 = new qk.a("Main", 1);
        f364001e = aVar2;
        qk.a aVar3 = new qk.a("PlayList", 2);
        f364002f = aVar3;
        qk.a[] aVarArr = {aVar, aVar2, aVar3};
        f364003g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static qk.a valueOf(java.lang.String str) {
        return (qk.a) java.lang.Enum.valueOf(qk.a.class, str);
    }

    public static qk.a[] values() {
        return (qk.a[]) f364003g.clone();
    }
}
