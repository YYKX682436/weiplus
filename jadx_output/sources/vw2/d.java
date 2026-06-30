package vw2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final vw2.d f440835d;

    /* renamed from: e, reason: collision with root package name */
    public static final vw2.d f440836e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ vw2.d[] f440837f;

    static {
        vw2.d dVar = new vw2.d("IgnoreNew", 0);
        f440835d = dVar;
        vw2.d dVar2 = new vw2.d("CancelOld", 1);
        f440836e = dVar2;
        vw2.d[] dVarArr = {dVar, dVar2};
        f440837f = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static vw2.d valueOf(java.lang.String str) {
        return (vw2.d) java.lang.Enum.valueOf(vw2.d.class, str);
    }

    public static vw2.d[] values() {
        return (vw2.d[]) f440837f.clone();
    }
}
