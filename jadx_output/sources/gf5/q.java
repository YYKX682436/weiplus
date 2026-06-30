package gf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final gf5.q f271434d;

    /* renamed from: e, reason: collision with root package name */
    public static final gf5.q f271435e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ gf5.q[] f271436f;

    static {
        gf5.q qVar = new gf5.q("LINE_START_ONLY", 0);
        f271434d = qVar;
        gf5.q qVar2 = new gf5.q("INLINE_ALLOWED", 1);
        f271435e = qVar2;
        gf5.q[] qVarArr = {qVar, qVar2};
        f271436f = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    public static gf5.q valueOf(java.lang.String str) {
        return (gf5.q) java.lang.Enum.valueOf(gf5.q.class, str);
    }

    public static gf5.q[] values() {
        return (gf5.q[]) f271436f.clone();
    }
}
