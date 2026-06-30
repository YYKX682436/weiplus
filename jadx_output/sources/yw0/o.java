package yw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final yw0.o f466576d;

    /* renamed from: e, reason: collision with root package name */
    public static final yw0.o f466577e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yw0.o[] f466578f;

    static {
        yw0.o oVar = new yw0.o("Idle", 0);
        f466576d = oVar;
        yw0.o oVar2 = new yw0.o("Covering", 1);
        f466577e = oVar2;
        yw0.o[] oVarArr = {oVar, oVar2};
        f466578f = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static yw0.o valueOf(java.lang.String str) {
        return (yw0.o) java.lang.Enum.valueOf(yw0.o.class, str);
    }

    public static yw0.o[] values() {
        return (yw0.o[]) f466578f.clone();
    }
}
