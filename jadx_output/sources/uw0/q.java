package uw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final uw0.q f431593d;

    /* renamed from: e, reason: collision with root package name */
    public static final uw0.q f431594e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ uw0.q[] f431595f;

    static {
        uw0.q qVar = new uw0.q("APPEAR", 0);
        f431593d = qVar;
        uw0.q qVar2 = new uw0.q("DISAPPEAR", 1);
        f431594e = qVar2;
        uw0.q[] qVarArr = {qVar, qVar2};
        f431595f = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    public static uw0.q valueOf(java.lang.String str) {
        return (uw0.q) java.lang.Enum.valueOf(uw0.q.class, str);
    }

    public static uw0.q[] values() {
        return (uw0.q[]) f431595f.clone();
    }
}
