package yv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final yv0.o f465982d;

    /* renamed from: e, reason: collision with root package name */
    public static final yv0.o f465983e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yv0.o[] f465984f;

    static {
        yv0.o oVar = new yv0.o("FRAME_SIZE_UPDATED", 0);
        f465982d = oVar;
        yv0.o oVar2 = new yv0.o("FRAME_LOCATION_UPDATED", 1);
        f465983e = oVar2;
        yv0.o[] oVarArr = {oVar, oVar2};
        f465984f = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static yv0.o valueOf(java.lang.String str) {
        return (yv0.o) java.lang.Enum.valueOf(yv0.o.class, str);
    }

    public static yv0.o[] values() {
        return (yv0.o[]) f465984f.clone();
    }
}
