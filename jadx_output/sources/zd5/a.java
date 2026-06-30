package zd5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final zd5.a f471651e;

    /* renamed from: f, reason: collision with root package name */
    public static final zd5.a f471652f;

    /* renamed from: g, reason: collision with root package name */
    public static final zd5.a f471653g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zd5.a[] f471654h;

    /* renamed from: d, reason: collision with root package name */
    public final int f471655d;

    static {
        zd5.a aVar = new zd5.a("NORMAL", 0, 1);
        f471651e = aVar;
        zd5.a aVar2 = new zd5.a("IMAGE_PIC", 1, 2);
        f471652f = aVar2;
        zd5.a aVar3 = new zd5.a("IMAGE_OCR", 2, 3);
        f471653g = aVar3;
        zd5.a[] aVarArr = {aVar, aVar2, aVar3, new zd5.a("MORE", 3, 4)};
        f471654h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f471655d = i18;
    }

    public static zd5.a valueOf(java.lang.String str) {
        return (zd5.a) java.lang.Enum.valueOf(zd5.a.class, str);
    }

    public static zd5.a[] values() {
        return (zd5.a[]) f471654h.clone();
    }
}
