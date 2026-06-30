package wv3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final wv3.d f450054e;

    /* renamed from: f, reason: collision with root package name */
    public static final wv3.d f450055f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wv3.d[] f450056g;

    /* renamed from: d, reason: collision with root package name */
    public final int f450057d;

    static {
        wv3.d dVar = new wv3.d("SINGLE_VIDEO", 0, 1);
        f450054e = dVar;
        wv3.d dVar2 = new wv3.d("TEMPLATE", 1, 2);
        f450055f = dVar2;
        wv3.d[] dVarArr = {dVar, dVar2};
        f450056g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f450057d = i18;
    }

    public static wv3.d valueOf(java.lang.String str) {
        return (wv3.d) java.lang.Enum.valueOf(wv3.d.class, str);
    }

    public static wv3.d[] values() {
        return (wv3.d[]) f450056g.clone();
    }
}
