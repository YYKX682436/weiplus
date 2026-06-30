package jd3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final jd3.a f299159e;

    /* renamed from: f, reason: collision with root package name */
    public static final jd3.a f299160f;

    /* renamed from: g, reason: collision with root package name */
    public static final jd3.a f299161g;

    /* renamed from: h, reason: collision with root package name */
    public static final jd3.a f299162h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ jd3.a[] f299163i;

    /* renamed from: d, reason: collision with root package name */
    public final int f299164d;

    static {
        jd3.a aVar = new jd3.a("Success", 0, 0);
        f299159e = aVar;
        jd3.a aVar2 = new jd3.a("PhysicalPathEmpty", 1, 1);
        f299160f = aVar2;
        jd3.a aVar3 = new jd3.a("ScriptEmpty", 2, 2);
        f299161g = aVar3;
        jd3.a aVar4 = new jd3.a("InjectError", 3, 3);
        jd3.a aVar5 = new jd3.a("FsError", 4, 4);
        f299162h = aVar5;
        jd3.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f299163i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f299164d = i18;
    }

    public static jd3.a valueOf(java.lang.String str) {
        return (jd3.a) java.lang.Enum.valueOf(jd3.a.class, str);
    }

    public static jd3.a[] values() {
        return (jd3.a[]) f299163i.clone();
    }
}
