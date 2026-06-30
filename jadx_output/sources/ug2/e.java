package ug2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final ug2.e f427522d;

    /* renamed from: e, reason: collision with root package name */
    public static final ug2.e f427523e;

    /* renamed from: f, reason: collision with root package name */
    public static final ug2.e f427524f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ug2.e[] f427525g;

    static {
        ug2.e eVar = new ug2.e("ANCHOR_SLOT", 0);
        f427522d = eVar;
        ug2.e eVar2 = new ug2.e("ONLY_LIVE_SLOT", 1);
        f427523e = eVar2;
        ug2.e eVar3 = new ug2.e("ONLY_FULL_ANIM_SLOT", 2);
        f427524f = eVar3;
        ug2.e[] eVarArr = {eVar, eVar2, eVar3};
        f427525g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static ug2.e valueOf(java.lang.String str) {
        return (ug2.e) java.lang.Enum.valueOf(ug2.e.class, str);
    }

    public static ug2.e[] values() {
        return (ug2.e[]) f427525g.clone();
    }
}
