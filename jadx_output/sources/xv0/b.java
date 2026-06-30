package xv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xv0.b[] f457374f;

    /* renamed from: d, reason: collision with root package name */
    public final int f457375d;

    /* renamed from: e, reason: collision with root package name */
    public final int f457376e;

    static {
        xv0.b[] bVarArr = {new xv0.b("BRIGHTNESS", 0, com.tencent.mm.R.string.f492489ll2, com.tencent.mm.R.drawable.cn_), new xv0.b("CONTRAST", 1, com.tencent.mm.R.string.f492490ll3, com.tencent.mm.R.drawable.cna), new xv0.b("SATURATION", 2, com.tencent.mm.R.string.f492491ll4, com.tencent.mm.R.drawable.f481882cm3), new xv0.b("TEMPERATURE", 3, com.tencent.mm.R.string.ll6, com.tencent.mm.R.drawable.cnb), new xv0.b("VIGNETTE", 4, com.tencent.mm.R.string.ll7, com.tencent.mm.R.drawable.f481884cm5), new xv0.b("SHARPNESS", 5, com.tencent.mm.R.string.f492492ll5, com.tencent.mm.R.drawable.f481883cm4)};
        f457374f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18, int i19) {
        this.f457375d = i18;
        this.f457376e = i19;
    }

    public static xv0.b valueOf(java.lang.String str) {
        return (xv0.b) java.lang.Enum.valueOf(xv0.b.class, str);
    }

    public static xv0.b[] values() {
        return (xv0.b[]) f457374f.clone();
    }
}
