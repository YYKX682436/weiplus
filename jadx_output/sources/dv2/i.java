package dv2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final dv2.i f243865e;

    /* renamed from: f, reason: collision with root package name */
    public static final dv2.i f243866f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ dv2.i[] f243867g;

    /* renamed from: d, reason: collision with root package name */
    public final int f243868d;

    static {
        dv2.i iVar = new dv2.i("FOLLOW", 0, 0, 1);
        f243865e = iVar;
        dv2.i iVar2 = new dv2.i("RECENT", 1, 1, 2);
        f243866f = iVar2;
        dv2.i[] iVarArr = {iVar, iVar2};
        f243867g = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17, int i18, int i19) {
        this.f243868d = i19;
    }

    public static dv2.i valueOf(java.lang.String str) {
        return (dv2.i) java.lang.Enum.valueOf(dv2.i.class, str);
    }

    public static dv2.i[] values() {
        return (dv2.i[]) f243867g.clone();
    }
}
