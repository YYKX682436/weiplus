package th5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final th5.a f419333e;

    /* renamed from: f, reason: collision with root package name */
    public static final th5.a f419334f;

    /* renamed from: g, reason: collision with root package name */
    public static final th5.a f419335g;

    /* renamed from: h, reason: collision with root package name */
    public static final th5.a f419336h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ th5.a[] f419337i;

    /* renamed from: d, reason: collision with root package name */
    public final int f419338d;

    static {
        th5.a aVar = new th5.a("Origin", 0, 1);
        f419333e = aVar;
        th5.a aVar2 = new th5.a("Live", 1, 2);
        f419334f = aVar2;
        th5.a aVar3 = new th5.a("Send", 2, 3);
        f419335g = aVar3;
        th5.a aVar4 = new th5.a("Save", 3, 4);
        f419336h = aVar4;
        th5.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f419337i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f419338d = i18;
    }

    public static th5.a valueOf(java.lang.String str) {
        return (th5.a) java.lang.Enum.valueOf(th5.a.class, str);
    }

    public static th5.a[] values() {
        return (th5.a[]) f419337i.clone();
    }
}
