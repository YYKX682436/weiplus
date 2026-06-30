package xf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final xf0.k f454194d;

    /* renamed from: e, reason: collision with root package name */
    public static final xf0.k f454195e;

    /* renamed from: f, reason: collision with root package name */
    public static final xf0.k f454196f;

    /* renamed from: g, reason: collision with root package name */
    public static final xf0.k f454197g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xf0.k[] f454198h;

    static {
        xf0.k kVar = new xf0.k("Success", 0);
        f454194d = kVar;
        xf0.k kVar2 = new xf0.k("Cancel", 1);
        f454195e = kVar2;
        xf0.k kVar3 = new xf0.k("DownloadError", 2);
        f454196f = kVar3;
        xf0.k kVar4 = new xf0.k("MoveFileError", 3);
        f454197g = kVar4;
        xf0.k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f454198h = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static xf0.k valueOf(java.lang.String str) {
        return (xf0.k) java.lang.Enum.valueOf(xf0.k.class, str);
    }

    public static xf0.k[] values() {
        return (xf0.k[]) f454198h.clone();
    }
}
