package re2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final re2.g f394411d;

    /* renamed from: e, reason: collision with root package name */
    public static final re2.g f394412e;

    /* renamed from: f, reason: collision with root package name */
    public static final re2.g f394413f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ re2.g[] f394414g;

    static {
        re2.g gVar = new re2.g("MERGE", 0);
        f394411d = gVar;
        re2.g gVar2 = new re2.g("UPLOAD", 1);
        f394412e = gVar2;
        re2.g gVar3 = new re2.g("REPORT", 2);
        f394413f = gVar3;
        re2.g[] gVarArr = {gVar, gVar2, gVar3};
        f394414g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static re2.g valueOf(java.lang.String str) {
        return (re2.g) java.lang.Enum.valueOf(re2.g.class, str);
    }

    public static re2.g[] values() {
        return (re2.g[]) f394414g.clone();
    }
}
