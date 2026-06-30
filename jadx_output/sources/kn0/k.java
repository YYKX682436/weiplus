package kn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final kn0.k f309566d;

    /* renamed from: e, reason: collision with root package name */
    public static final kn0.k f309567e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn0.k[] f309568f;

    static {
        kn0.k kVar = new kn0.k("NORMAL_MODE", 0);
        f309566d = kVar;
        kn0.k kVar2 = new kn0.k("AUDIO_MODE", 1);
        f309567e = kVar2;
        kn0.k[] kVarArr = {kVar, kVar2};
        f309568f = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static kn0.k valueOf(java.lang.String str) {
        return (kn0.k) java.lang.Enum.valueOf(kn0.k.class, str);
    }

    public static kn0.k[] values() {
        return (kn0.k[]) f309568f.clone();
    }
}
