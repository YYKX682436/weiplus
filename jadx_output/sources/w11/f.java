package w11;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final w11.f f442015d;

    /* renamed from: e, reason: collision with root package name */
    public static final w11.f f442016e;

    /* renamed from: f, reason: collision with root package name */
    public static final w11.f f442017f;

    /* renamed from: g, reason: collision with root package name */
    public static final w11.f f442018g;

    /* renamed from: h, reason: collision with root package name */
    public static final w11.f f442019h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w11.f[] f442020i;

    static {
        w11.f fVar = new w11.f("DoCmdAccNotReady", 0);
        f442015d = fVar;
        w11.f fVar2 = new w11.f("DoCmdEmptyResp", 1);
        f442016e = fVar2;
        w11.f fVar3 = new w11.f("DoCmdEmptyCmdList", 2);
        f442017f = fVar3;
        w11.f fVar4 = new w11.f("DoCmdProcessEnd", 3);
        f442018g = fVar4;
        w11.f fVar5 = new w11.f("AsyncProcessEnd", 4);
        f442019h = fVar5;
        w11.f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f442020i = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static w11.f valueOf(java.lang.String str) {
        return (w11.f) java.lang.Enum.valueOf(w11.f.class, str);
    }

    public static w11.f[] values() {
        return (w11.f[]) f442020i.clone();
    }
}
