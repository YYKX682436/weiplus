package kn1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final kn1.o f309649e;

    /* renamed from: f, reason: collision with root package name */
    public static final kn1.o f309650f;

    /* renamed from: g, reason: collision with root package name */
    public static final kn1.o f309651g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kn1.o[] f309652h;

    /* renamed from: d, reason: collision with root package name */
    public final int f309653d;

    static {
        kn1.o oVar = new kn1.o("kStatus_Default", 0, 0);
        f309649e = oVar;
        kn1.o oVar2 = new kn1.o("kStatus_Success", 1, 1);
        f309650f = oVar2;
        kn1.o oVar3 = new kn1.o("kStatus_Failed", 2, 2);
        f309651g = oVar3;
        kn1.o[] oVarArr = {oVar, oVar2, oVar3};
        f309652h = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17, int i18) {
        this.f309653d = i18;
    }

    public static kn1.o valueOf(java.lang.String str) {
        return (kn1.o) java.lang.Enum.valueOf(kn1.o.class, str);
    }

    public static kn1.o[] values() {
        return (kn1.o[]) f309652h.clone();
    }
}
