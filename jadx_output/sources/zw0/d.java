package zw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final zw0.c f476560e;

    /* renamed from: f, reason: collision with root package name */
    public static final zw0.d f476561f;

    /* renamed from: g, reason: collision with root package name */
    public static final zw0.d f476562g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zw0.d[] f476563h;

    /* renamed from: d, reason: collision with root package name */
    public final int f476564d;

    static {
        zw0.d dVar = new zw0.d("NONE", 0, 0);
        f476561f = dVar;
        zw0.d dVar2 = new zw0.d("FIRST", 1, 1);
        f476562g = dVar2;
        zw0.d[] dVarArr = {dVar, dVar2, new zw0.d("SECOND", 2, 2)};
        f476563h = dVarArr;
        rz5.b.a(dVarArr);
        f476560e = new zw0.c(null);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f476564d = i18;
    }

    public static zw0.d valueOf(java.lang.String str) {
        return (zw0.d) java.lang.Enum.valueOf(zw0.d.class, str);
    }

    public static zw0.d[] values() {
        return (zw0.d[]) f476563h.clone();
    }
}
