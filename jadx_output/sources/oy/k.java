package oy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final oy.k f349823d;

    /* renamed from: e, reason: collision with root package name */
    public static final oy.k f349824e;

    /* renamed from: f, reason: collision with root package name */
    public static final oy.k f349825f;

    /* renamed from: g, reason: collision with root package name */
    public static final oy.k f349826g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ oy.k[] f349827h;

    static {
        oy.k kVar = new oy.k("IDLE", 0);
        f349823d = kVar;
        oy.k kVar2 = new oy.k("PREPARING", 1);
        f349824e = kVar2;
        oy.k kVar3 = new oy.k("PLAYING", 2);
        f349825f = kVar3;
        oy.k kVar4 = new oy.k("PAUSED", 3);
        f349826g = kVar4;
        oy.k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f349827h = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static oy.k valueOf(java.lang.String str) {
        return (oy.k) java.lang.Enum.valueOf(oy.k.class, str);
    }

    public static oy.k[] values() {
        return (oy.k[]) f349827h.clone();
    }
}
