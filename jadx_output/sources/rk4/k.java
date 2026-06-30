package rk4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final rk4.k f396771d;

    /* renamed from: e, reason: collision with root package name */
    public static final rk4.k f396772e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rk4.k[] f396773f;

    static {
        rk4.k kVar = new rk4.k("LIKE", 0, 1);
        f396771d = kVar;
        rk4.k kVar2 = new rk4.k("UNLIKE", 1, 2);
        f396772e = kVar2;
        rk4.k[] kVarArr = {kVar, kVar2};
        f396773f = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17, int i18) {
    }

    public static rk4.k valueOf(java.lang.String str) {
        return (rk4.k) java.lang.Enum.valueOf(rk4.k.class, str);
    }

    public static rk4.k[] values() {
        return (rk4.k[]) f396773f.clone();
    }
}
