package p60;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final p60.r f352192e;

    /* renamed from: f, reason: collision with root package name */
    public static final p60.s f352193f;

    /* renamed from: g, reason: collision with root package name */
    public static final p60.s f352194g;

    /* renamed from: h, reason: collision with root package name */
    public static final p60.s f352195h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p60.s[] f352196i;

    /* renamed from: d, reason: collision with root package name */
    public final int f352197d;

    static {
        p60.s sVar = new p60.s("PrePareScene_Origin", 0, 0);
        f352193f = sVar;
        p60.s sVar2 = new p60.s("PrePareScene_GameStart", 1, 1);
        f352194g = sVar2;
        p60.s sVar3 = new p60.s("PrePareScene_FinderStart", 2, 2);
        f352195h = sVar3;
        p60.s[] sVarArr = {sVar, sVar2, sVar3};
        f352196i = sVarArr;
        rz5.b.a(sVarArr);
        f352192e = new p60.r(null);
    }

    public s(java.lang.String str, int i17, int i18) {
        this.f352197d = i18;
    }

    public static p60.s valueOf(java.lang.String str) {
        return (p60.s) java.lang.Enum.valueOf(p60.s.class, str);
    }

    public static p60.s[] values() {
        return (p60.s[]) f352196i.clone();
    }
}
