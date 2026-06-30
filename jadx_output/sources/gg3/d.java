package gg3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final gg3.d f271732d;

    /* renamed from: e, reason: collision with root package name */
    public static final gg3.d f271733e;

    /* renamed from: f, reason: collision with root package name */
    public static final gg3.d f271734f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gg3.d[] f271735g;

    static {
        gg3.d dVar = new gg3.d("DOWNLOAD_ING", 0);
        f271732d = dVar;
        gg3.d dVar2 = new gg3.d("DOWNLOAD_SUCCESS", 1);
        f271733e = dVar2;
        gg3.d dVar3 = new gg3.d("DOWNLOAD_FAILED", 2);
        f271734f = dVar3;
        gg3.d[] dVarArr = {dVar, dVar2, dVar3};
        f271735g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static gg3.d valueOf(java.lang.String str) {
        return (gg3.d) java.lang.Enum.valueOf(gg3.d.class, str);
    }

    public static gg3.d[] values() {
        return (gg3.d[]) f271735g.clone();
    }
}
