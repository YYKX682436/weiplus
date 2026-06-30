package pu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final pu.r f358366d;

    /* renamed from: e, reason: collision with root package name */
    public static final pu.r f358367e;

    /* renamed from: f, reason: collision with root package name */
    public static final pu.r f358368f;

    /* renamed from: g, reason: collision with root package name */
    public static final pu.r f358369g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pu.r[] f358370h;

    static {
        pu.r rVar = new pu.r("Success", 0);
        f358366d = rVar;
        pu.r rVar2 = new pu.r("Error", 1);
        pu.r rVar3 = new pu.r("PrepareError", 2);
        f358367e = rVar3;
        pu.r rVar4 = new pu.r("UploadError", 3);
        f358368f = rVar4;
        pu.r rVar5 = new pu.r("SendError", 4);
        f358369g = rVar5;
        pu.r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5};
        f358370h = rVarArr;
        rz5.b.a(rVarArr);
    }

    public r(java.lang.String str, int i17) {
    }

    public static pu.r valueOf(java.lang.String str) {
        return (pu.r) java.lang.Enum.valueOf(pu.r.class, str);
    }

    public static pu.r[] values() {
        return (pu.r[]) f358370h.clone();
    }
}
