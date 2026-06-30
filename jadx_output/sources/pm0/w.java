package pm0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final pm0.w f356804e;

    /* renamed from: f, reason: collision with root package name */
    public static final pm0.w f356805f;

    /* renamed from: g, reason: collision with root package name */
    public static final pm0.w f356806g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pm0.w[] f356807h;

    /* renamed from: d, reason: collision with root package name */
    public final int f356808d;

    static {
        pm0.w wVar = new pm0.w("TRICK", 0, 0);
        f356804e = wVar;
        pm0.w wVar2 = new pm0.w("WARNING", 1, 1);
        f356805f = wVar2;
        pm0.w wVar3 = new pm0.w("ERROR", 2, 110);
        f356806g = wVar3;
        pm0.w[] wVarArr = {wVar, wVar2, wVar3};
        f356807h = wVarArr;
        rz5.b.a(wVarArr);
    }

    public w(java.lang.String str, int i17, int i18) {
        this.f356808d = i18;
    }

    public static pm0.w valueOf(java.lang.String str) {
        return (pm0.w) java.lang.Enum.valueOf(pm0.w.class, str);
    }

    public static pm0.w[] values() {
        return (pm0.w[]) f356807h.clone();
    }
}
