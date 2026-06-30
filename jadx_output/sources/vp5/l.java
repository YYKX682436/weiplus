package vp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final vp5.k f439125e;

    /* renamed from: f, reason: collision with root package name */
    public static final vp5.l f439126f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vp5.l[] f439127g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f439128h;

    /* renamed from: d, reason: collision with root package name */
    public final int f439129d;

    static {
        vp5.l lVar = new vp5.l("OK", 0, 0);
        f439126f = lVar;
        vp5.l[] lVarArr = {lVar, new vp5.l("FAIL_DECOMPRESS", 1, -1), new vp5.l("FAIL_CHECKSUM_MISMATCH", 2, -2)};
        f439127g = lVarArr;
        f439128h = rz5.b.a(lVarArr);
        f439125e = new vp5.k(null);
    }

    public l(java.lang.String str, int i17, int i18) {
        this.f439129d = i18;
    }

    public static vp5.l valueOf(java.lang.String str) {
        return (vp5.l) java.lang.Enum.valueOf(vp5.l.class, str);
    }

    public static vp5.l[] values() {
        return (vp5.l[]) f439127g.clone();
    }
}
