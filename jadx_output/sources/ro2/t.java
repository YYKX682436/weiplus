package ro2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final ro2.t f398094e;

    /* renamed from: f, reason: collision with root package name */
    public static final ro2.t f398095f;

    /* renamed from: g, reason: collision with root package name */
    public static final ro2.t f398096g;

    /* renamed from: h, reason: collision with root package name */
    public static final ro2.t f398097h;

    /* renamed from: i, reason: collision with root package name */
    public static final ro2.t f398098i;

    /* renamed from: m, reason: collision with root package name */
    public static final ro2.t f398099m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ro2.t[] f398100n;

    /* renamed from: d, reason: collision with root package name */
    public final int f398101d;

    static {
        ro2.t tVar = new ro2.t("UNKNOW", 0, 0);
        ro2.t tVar2 = new ro2.t("CANCEL", 1, 1);
        f398094e = tVar2;
        ro2.t tVar3 = new ro2.t("SAVE", 2, 2);
        f398095f = tVar3;
        ro2.t tVar4 = new ro2.t("SCROLL", 3, 3);
        f398096g = tVar4;
        ro2.t tVar5 = new ro2.t("SIDESLIP", 4, 4);
        f398097h = tVar5;
        ro2.t tVar6 = new ro2.t("APP_BACKGROUND", 5, 5);
        f398098i = tVar6;
        ro2.t tVar7 = new ro2.t("BACK_PRESS", 6, 6);
        f398099m = tVar7;
        ro2.t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7};
        f398100n = tVarArr;
        rz5.b.a(tVarArr);
    }

    public t(java.lang.String str, int i17, int i18) {
        this.f398101d = i18;
    }

    public static ro2.t valueOf(java.lang.String str) {
        return (ro2.t) java.lang.Enum.valueOf(ro2.t.class, str);
    }

    public static ro2.t[] values() {
        return (ro2.t[]) f398100n.clone();
    }
}
