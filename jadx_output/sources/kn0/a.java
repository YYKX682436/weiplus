package kn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final kn0.a f309493d;

    /* renamed from: e, reason: collision with root package name */
    public static final kn0.a f309494e;

    /* renamed from: f, reason: collision with root package name */
    public static final kn0.a f309495f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kn0.a[] f309496g;

    static {
        kn0.a aVar = new kn0.a("MMLiveStreamSwitchMode_Fixed", 0);
        f309493d = aVar;
        kn0.a aVar2 = new kn0.a("MMLiveStreamSwitchMode_Auto", 1);
        f309494e = aVar2;
        kn0.a aVar3 = new kn0.a("MMLiveStreamSwitchMode_ML", 2);
        f309495f = aVar3;
        kn0.a[] aVarArr = {aVar, aVar2, aVar3};
        f309496g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static kn0.a valueOf(java.lang.String str) {
        return (kn0.a) java.lang.Enum.valueOf(kn0.a.class, str);
    }

    public static kn0.a[] values() {
        return (kn0.a[]) f309496g.clone();
    }
}
