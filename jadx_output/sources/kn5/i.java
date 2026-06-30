package kn5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final kn5.i f309809d;

    /* renamed from: e, reason: collision with root package name */
    public static final kn5.i f309810e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn5.i[] f309811f;

    static {
        kn5.i iVar = new kn5.i("RANGE", 0);
        f309809d = iVar;
        kn5.i iVar2 = new kn5.i("PATH", 1);
        f309810e = iVar2;
        kn5.i[] iVarArr = {iVar, iVar2};
        f309811f = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static kn5.i valueOf(java.lang.String str) {
        return (kn5.i) java.lang.Enum.valueOf(kn5.i.class, str);
    }

    public static kn5.i[] values() {
        return (kn5.i[]) f309811f.clone();
    }
}
