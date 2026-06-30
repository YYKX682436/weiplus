package vu4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final vu4.g f440323e;

    /* renamed from: f, reason: collision with root package name */
    public static final vu4.g f440324f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vu4.g[] f440325g;

    /* renamed from: d, reason: collision with root package name */
    public final int f440326d;

    static {
        vu4.g gVar = new vu4.g("normal", 0, 0);
        f440323e = gVar;
        vu4.g gVar2 = new vu4.g("sayHi", 1, 1);
        f440324f = gVar2;
        vu4.g[] gVarArr = {gVar, gVar2};
        f440325g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17, int i18) {
        this.f440326d = i18;
    }

    public static vu4.g valueOf(java.lang.String str) {
        return (vu4.g) java.lang.Enum.valueOf(vu4.g.class, str);
    }

    public static vu4.g[] values() {
        return (vu4.g[]) f440325g.clone();
    }
}
