package kd0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final kd0.a f306595e;

    /* renamed from: f, reason: collision with root package name */
    public static final kd0.a f306596f;

    /* renamed from: g, reason: collision with root package name */
    public static final kd0.a f306597g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kd0.a[] f306598h;

    /* renamed from: d, reason: collision with root package name */
    public final int f306599d;

    static {
        kd0.a aVar = new kd0.a("LONG_PRESS_IMAGE_SCAN_CODE", 0, 1);
        f306595e = aVar;
        kd0.a aVar2 = new kd0.a("OCR_REPORT_FOR_SCAN_CODE", 1, 2);
        f306596f = aVar2;
        kd0.a aVar3 = new kd0.a("OCR_FOR_WORD_DETECT", 2, 2);
        f306597g = aVar3;
        kd0.a[] aVarArr = {aVar, aVar2, aVar3};
        f306598h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f306599d = i18;
    }

    public static kd0.a valueOf(java.lang.String str) {
        return (kd0.a) java.lang.Enum.valueOf(kd0.a.class, str);
    }

    public static kd0.a[] values() {
        return (kd0.a[]) f306598h.clone();
    }
}
