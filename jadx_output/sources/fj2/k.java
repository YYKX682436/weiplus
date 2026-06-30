package fj2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final fj2.k f263175d;

    /* renamed from: e, reason: collision with root package name */
    public static final fj2.k f263176e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ fj2.k[] f263177f;

    static {
        fj2.k kVar = new fj2.k("RED_TEAM", 0, 1);
        f263175d = kVar;
        fj2.k kVar2 = new fj2.k("BLUE_TEAM", 1, 2);
        f263176e = kVar2;
        fj2.k[] kVarArr = {kVar, kVar2};
        f263177f = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17, int i18) {
    }

    public static fj2.k valueOf(java.lang.String str) {
        return (fj2.k) java.lang.Enum.valueOf(fj2.k.class, str);
    }

    public static fj2.k[] values() {
        return (fj2.k[]) f263177f.clone();
    }
}
