package tz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final tz0.k f423192d;

    /* renamed from: e, reason: collision with root package name */
    public static final tz0.k f423193e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ tz0.k[] f423194f;

    static {
        tz0.k kVar = new tz0.k("Black", 0);
        f423192d = kVar;
        tz0.k kVar2 = new tz0.k("White", 1);
        f423193e = kVar2;
        tz0.k[] kVarArr = {kVar, kVar2};
        f423194f = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static tz0.k valueOf(java.lang.String str) {
        return (tz0.k) java.lang.Enum.valueOf(tz0.k.class, str);
    }

    public static tz0.k[] values() {
        return (tz0.k[]) f423194f.clone();
    }
}
