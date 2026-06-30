package pk1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final pk1.s f355517e;

    /* renamed from: f, reason: collision with root package name */
    public static final pk1.t f355518f;

    /* renamed from: g, reason: collision with root package name */
    public static final pk1.t f355519g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pk1.t[] f355520h;

    /* renamed from: d, reason: collision with root package name */
    public final int f355521d;

    static {
        pk1.t tVar = new pk1.t("NOT_PROXY", 0, 0);
        f355518f = tVar;
        pk1.t tVar2 = new pk1.t("PROXY_DEFAULT", 1, 1);
        pk1.t tVar3 = new pk1.t("PROXY_CDN", 2, 2);
        f355519g = tVar3;
        pk1.t[] tVarArr = {tVar, tVar2, tVar3};
        f355520h = tVarArr;
        rz5.b.a(tVarArr);
        f355517e = new pk1.s(null);
    }

    public t(java.lang.String str, int i17, int i18) {
        this.f355521d = i18;
    }

    public static pk1.t valueOf(java.lang.String str) {
        return (pk1.t) java.lang.Enum.valueOf(pk1.t.class, str);
    }

    public static pk1.t[] values() {
        return (pk1.t[]) f355520h.clone();
    }
}
