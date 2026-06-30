package vu0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final vu0.t f440159d;

    /* renamed from: e, reason: collision with root package name */
    public static final vu0.u f440160e;

    /* renamed from: f, reason: collision with root package name */
    public static final vu0.u f440161f;

    /* renamed from: g, reason: collision with root package name */
    public static final vu0.u f440162g;

    /* renamed from: h, reason: collision with root package name */
    public static final vu0.u f440163h;

    /* renamed from: i, reason: collision with root package name */
    public static final vu0.u f440164i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ vu0.u[] f440165m;

    static {
        vu0.u uVar = new vu0.u("RECOGNIZING_START", 0);
        f440160e = uVar;
        vu0.u uVar2 = new vu0.u("RECOGNIZING", 1);
        f440161f = uVar2;
        vu0.u uVar3 = new vu0.u("RECOGNIZING_PRE_STOP", 2);
        f440162g = uVar3;
        vu0.u uVar4 = new vu0.u("RECOGNIZED", 3);
        f440163h = uVar4;
        vu0.u uVar5 = new vu0.u("RECOGNITION_FAILED", 4);
        f440164i = uVar5;
        vu0.u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5};
        f440165m = uVarArr;
        rz5.b.a(uVarArr);
        f440159d = new vu0.t(null);
    }

    public u(java.lang.String str, int i17) {
    }

    public static vu0.u valueOf(java.lang.String str) {
        return (vu0.u) java.lang.Enum.valueOf(vu0.u.class, str);
    }

    public static vu0.u[] values() {
        return (vu0.u[]) f440165m.clone();
    }
}
