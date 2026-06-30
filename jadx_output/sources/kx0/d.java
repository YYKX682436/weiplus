package kx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final kx0.d f313243d;

    /* renamed from: e, reason: collision with root package name */
    public static final kx0.d f313244e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kx0.d[] f313245f;

    static {
        kx0.d dVar = new kx0.d("IDLE", 0);
        f313243d = dVar;
        kx0.d dVar2 = new kx0.d("RUNNING", 1);
        f313244e = dVar2;
        kx0.d[] dVarArr = {dVar, dVar2};
        f313245f = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static kx0.d valueOf(java.lang.String str) {
        return (kx0.d) java.lang.Enum.valueOf(kx0.d.class, str);
    }

    public static kx0.d[] values() {
        return (kx0.d[]) f313245f.clone();
    }
}
