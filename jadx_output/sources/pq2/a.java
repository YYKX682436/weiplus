package pq2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final pq2.a f357570d;

    /* renamed from: e, reason: collision with root package name */
    public static final pq2.a f357571e;

    /* renamed from: f, reason: collision with root package name */
    public static final pq2.a f357572f;

    /* renamed from: g, reason: collision with root package name */
    public static final pq2.a f357573g;

    /* renamed from: h, reason: collision with root package name */
    public static final pq2.a f357574h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ pq2.a[] f357575i;

    static {
        pq2.a aVar = new pq2.a("IDLE", 0);
        f357570d = aVar;
        pq2.a aVar2 = new pq2.a("LOADING", 1);
        f357571e = aVar2;
        pq2.a aVar3 = new pq2.a("DISABLE", 2);
        pq2.a aVar4 = new pq2.a("EXPIRED", 3);
        f357572f = aVar4;
        pq2.a aVar5 = new pq2.a("FAILED", 4);
        f357573g = aVar5;
        pq2.a aVar6 = new pq2.a("OK", 5);
        f357574h = aVar6;
        pq2.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        f357575i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static pq2.a valueOf(java.lang.String str) {
        return (pq2.a) java.lang.Enum.valueOf(pq2.a.class, str);
    }

    public static pq2.a[] values() {
        return (pq2.a[]) f357575i.clone();
    }
}
