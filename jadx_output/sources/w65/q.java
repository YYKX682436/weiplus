package w65;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final w65.q f443366d;

    /* renamed from: e, reason: collision with root package name */
    public static final w65.q f443367e;

    /* renamed from: f, reason: collision with root package name */
    public static final w65.q f443368f;

    /* renamed from: g, reason: collision with root package name */
    public static final w65.q f443369g;

    /* renamed from: h, reason: collision with root package name */
    public static final w65.q f443370h;

    /* renamed from: i, reason: collision with root package name */
    public static final w65.q f443371i;

    /* renamed from: m, reason: collision with root package name */
    public static final w65.q f443372m;

    /* renamed from: n, reason: collision with root package name */
    public static final w65.q f443373n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w65.q[] f443374o;

    static {
        w65.q qVar = new w65.q("Init", 0);
        f443366d = qVar;
        w65.q qVar2 = new w65.q("BeforeRun", 1);
        f443367e = qVar2;
        w65.q qVar3 = new w65.q("Run", 2);
        f443368f = qVar3;
        w65.q qVar4 = new w65.q("AfterRun", 3);
        f443369g = qVar4;
        w65.q qVar5 = new w65.q("Finish", 4);
        f443370h = qVar5;
        w65.q qVar6 = new w65.q("Cancel", 5);
        f443371i = qVar6;
        w65.q qVar7 = new w65.q("Interrupt", 6);
        f443372m = qVar7;
        w65.q qVar8 = new w65.q("Duplicated", 7);
        f443373n = qVar8;
        w65.q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8};
        f443374o = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    public static w65.q valueOf(java.lang.String str) {
        return (w65.q) java.lang.Enum.valueOf(w65.q.class, str);
    }

    public static w65.q[] values() {
        return (w65.q[]) f443374o.clone();
    }
}
