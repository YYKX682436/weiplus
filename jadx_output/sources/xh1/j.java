package xh1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final xh1.i f454515e;

    /* renamed from: f, reason: collision with root package name */
    public static final xh1.j f454516f;

    /* renamed from: g, reason: collision with root package name */
    public static final xh1.j f454517g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xh1.j[] f454518h;

    /* renamed from: d, reason: collision with root package name */
    public final int f454519d;

    static {
        xh1.j jVar = new xh1.j("Offline", 0, 0);
        f454516f = jVar;
        xh1.j jVar2 = new xh1.j("Guest", 1, 1);
        f454517g = jVar2;
        xh1.j[] jVarArr = {jVar, jVar2};
        f454518h = jVarArr;
        rz5.b.a(jVarArr);
        f454515e = new xh1.i(null);
    }

    public j(java.lang.String str, int i17, int i18) {
        this.f454519d = i18;
    }

    public static xh1.j valueOf(java.lang.String str) {
        return (xh1.j) java.lang.Enum.valueOf(xh1.j.class, str);
    }

    public static xh1.j[] values() {
        return (xh1.j[]) f454518h.clone();
    }
}
