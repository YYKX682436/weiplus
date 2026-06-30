package v11;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final v11.c f432349e;

    /* renamed from: f, reason: collision with root package name */
    public static final v11.d f432350f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v11.d[] f432351g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f432352h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f432353d;

    static {
        v11.d dVar = new v11.d("CALLBACK", 0, "callback");
        v11.d dVar2 = new v11.d("URL", 1, "url");
        f432350f = dVar2;
        v11.d[] dVarArr = {dVar, dVar2};
        f432351g = dVarArr;
        f432352h = rz5.b.a(dVarArr);
        f432349e = new v11.c(null);
    }

    public d(java.lang.String str, int i17, java.lang.String str2) {
        this.f432353d = str2;
    }

    public static v11.d valueOf(java.lang.String str) {
        return (v11.d) java.lang.Enum.valueOf(v11.d.class, str);
    }

    public static v11.d[] values() {
        return (v11.d[]) f432351g.clone();
    }
}
