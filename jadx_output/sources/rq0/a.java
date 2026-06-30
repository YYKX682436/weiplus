package rq0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final rq0.a f398715e;

    /* renamed from: f, reason: collision with root package name */
    public static final rq0.a f398716f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rq0.a[] f398717g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f398718h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f398719d;

    static {
        rq0.a aVar = new rq0.a("OneWeek", 0, "");
        f398715e = aVar;
        rq0.a aVar2 = new rq0.a("OneMonth", 1, "-OneMonth");
        f398716f = aVar2;
        rq0.a[] aVarArr = {aVar, aVar2};
        f398717g = aVarArr;
        f398718h = rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
        this.f398719d = str2;
    }

    public static rq0.a valueOf(java.lang.String str) {
        return (rq0.a) java.lang.Enum.valueOf(rq0.a.class, str);
    }

    public static rq0.a[] values() {
        return (rq0.a[]) f398717g.clone();
    }
}
