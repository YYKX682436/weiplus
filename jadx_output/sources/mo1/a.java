package mo1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final mo1.a f330262d;

    /* renamed from: e, reason: collision with root package name */
    public static final mo1.a f330263e;

    /* renamed from: f, reason: collision with root package name */
    public static final mo1.a f330264f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mo1.a[] f330265g;

    static {
        mo1.a aVar = new mo1.a("None", 0);
        f330262d = aVar;
        mo1.a aVar2 = new mo1.a("Back", 1);
        f330263e = aVar2;
        mo1.a aVar3 = new mo1.a("Collapse", 2);
        f330264f = aVar3;
        mo1.a[] aVarArr = {aVar, aVar2, aVar3};
        f330265g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static mo1.a valueOf(java.lang.String str) {
        return (mo1.a) java.lang.Enum.valueOf(mo1.a.class, str);
    }

    public static mo1.a[] values() {
        return (mo1.a[]) f330265g.clone();
    }
}
