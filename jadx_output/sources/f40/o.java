package f40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final f40.o f259441d;

    /* renamed from: e, reason: collision with root package name */
    public static final f40.o f259442e;

    /* renamed from: f, reason: collision with root package name */
    public static final f40.o f259443f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f40.o[] f259444g;

    static {
        f40.o oVar = new f40.o("SUCCESS", 0);
        f259441d = oVar;
        f40.o oVar2 = new f40.o("CANCEL", 1);
        f259442e = oVar2;
        f40.o oVar3 = new f40.o("ERROR", 2);
        f259443f = oVar3;
        f40.o[] oVarArr = {oVar, oVar2, oVar3};
        f259444g = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static f40.o valueOf(java.lang.String str) {
        return (f40.o) java.lang.Enum.valueOf(f40.o.class, str);
    }

    public static f40.o[] values() {
        return (f40.o[]) f259444g.clone();
    }
}
