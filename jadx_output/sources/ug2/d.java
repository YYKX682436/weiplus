package ug2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final ug2.d f427519d;

    /* renamed from: e, reason: collision with root package name */
    public static final ug2.d f427520e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ug2.d[] f427521f;

    static {
        ug2.d dVar = new ug2.d("MORE_THAN_GIFT", 0);
        f427519d = dVar;
        ug2.d dVar2 = new ug2.d("LESS_THAN_GIFT", 1);
        ug2.d dVar3 = new ug2.d("EQUAL_GIFT", 2);
        f427520e = dVar3;
        ug2.d[] dVarArr = {dVar, dVar2, dVar3};
        f427521f = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static ug2.d valueOf(java.lang.String str) {
        return (ug2.d) java.lang.Enum.valueOf(ug2.d.class, str);
    }

    public static ug2.d[] values() {
        return (ug2.d[]) f427521f.clone();
    }
}
