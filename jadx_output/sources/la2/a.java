package la2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final la2.a f317500d;

    /* renamed from: e, reason: collision with root package name */
    public static final la2.a f317501e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ la2.a[] f317502f;

    static {
        la2.a aVar = new la2.a("None", 0);
        la2.a aVar2 = new la2.a("PoiDrawer", 1);
        f317500d = aVar2;
        la2.a aVar3 = new la2.a("HalfScreenDrawer", 2);
        f317501e = aVar3;
        la2.a[] aVarArr = {aVar, aVar2, aVar3};
        f317502f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static la2.a valueOf(java.lang.String str) {
        return (la2.a) java.lang.Enum.valueOf(la2.a.class, str);
    }

    public static la2.a[] values() {
        return (la2.a[]) f317502f.clone();
    }
}
