package eu2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final eu2.k f256794d;

    /* renamed from: e, reason: collision with root package name */
    public static final eu2.k f256795e;

    /* renamed from: f, reason: collision with root package name */
    public static final eu2.k f256796f;

    /* renamed from: g, reason: collision with root package name */
    public static final eu2.k f256797g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ eu2.k[] f256798h;

    static {
        eu2.k kVar = new eu2.k("KEY_GUARD", 0);
        f256794d = kVar;
        eu2.k kVar2 = new eu2.k("MINI_VIEW", 1);
        f256795e = kVar2;
        eu2.k kVar3 = new eu2.k("FEED_STREAM", 2);
        f256796f = kVar3;
        eu2.k kVar4 = new eu2.k("NONE", 3);
        f256797g = kVar4;
        eu2.k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f256798h = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static eu2.k valueOf(java.lang.String str) {
        return (eu2.k) java.lang.Enum.valueOf(eu2.k.class, str);
    }

    public static eu2.k[] values() {
        return (eu2.k[]) f256798h.clone();
    }
}
