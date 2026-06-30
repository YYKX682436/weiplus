package pr4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final pr4.k f358016d;

    /* renamed from: e, reason: collision with root package name */
    public static final pr4.k f358017e;

    /* renamed from: f, reason: collision with root package name */
    public static final pr4.k f358018f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pr4.k[] f358019g;

    static {
        pr4.k kVar = new pr4.k("Direct", 0);
        f358016d = kVar;
        pr4.k kVar2 = new pr4.k("ShowPanel", 1);
        f358017e = kVar2;
        pr4.k kVar3 = new pr4.k("DirectIfEnoughCoin", 2);
        f358018f = kVar3;
        pr4.k[] kVarArr = {kVar, kVar2, kVar3};
        f358019g = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static pr4.k valueOf(java.lang.String str) {
        return (pr4.k) java.lang.Enum.valueOf(pr4.k.class, str);
    }

    public static pr4.k[] values() {
        return (pr4.k[]) f358019g.clone();
    }
}
