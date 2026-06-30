package oo4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final oo4.a f347190e;

    /* renamed from: f, reason: collision with root package name */
    public static final oo4.a f347191f;

    /* renamed from: g, reason: collision with root package name */
    public static final oo4.a f347192g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ oo4.a[] f347193h;

    /* renamed from: d, reason: collision with root package name */
    public final int f347194d;

    static {
        oo4.a aVar = new oo4.a("None", 0, 0);
        f347190e = aVar;
        oo4.a aVar2 = new oo4.a("Auto", 1, 1);
        f347191f = aVar2;
        oo4.a aVar3 = new oo4.a("Manual", 2, 2);
        f347192g = aVar3;
        oo4.a[] aVarArr = {aVar, aVar2, aVar3};
        f347193h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f347194d = i18;
    }

    public static oo4.a valueOf(java.lang.String str) {
        return (oo4.a) java.lang.Enum.valueOf(oo4.a.class, str);
    }

    public static oo4.a[] values() {
        return (oo4.a[]) f347193h.clone();
    }
}
