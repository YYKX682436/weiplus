package d26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final d26.y f226069d;

    /* renamed from: e, reason: collision with root package name */
    public static final d26.y f226070e;

    /* renamed from: f, reason: collision with root package name */
    public static final d26.y f226071f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d26.y[] f226072g;

    static {
        d26.y yVar = new d26.y("STABLE", 0);
        f226069d = yVar;
        d26.y yVar2 = new d26.y("FIR_UNSTABLE", 1);
        f226070e = yVar2;
        d26.y yVar3 = new d26.y("IR_UNSTABLE", 2);
        f226071f = yVar3;
        d26.y[] yVarArr = {yVar, yVar2, yVar3};
        f226072g = yVarArr;
        rz5.b.a(yVarArr);
    }

    public y(java.lang.String str, int i17) {
    }

    public static d26.y valueOf(java.lang.String str) {
        return (d26.y) java.lang.Enum.valueOf(d26.y.class, str);
    }

    public static d26.y[] values() {
        return (d26.y[]) f226072g.clone();
    }
}
