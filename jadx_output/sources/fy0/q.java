package fy0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final fy0.q f267220d;

    /* renamed from: e, reason: collision with root package name */
    public static final fy0.q f267221e;

    /* renamed from: f, reason: collision with root package name */
    public static final fy0.q f267222f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fy0.q[] f267223g;

    static {
        fy0.q qVar = new fy0.q("PLAYER_TIME_CHANGED", 0);
        f267220d = qVar;
        fy0.q qVar2 = new fy0.q("DRAGGING_AUTO_SCROLLING", 1);
        fy0.q qVar3 = new fy0.q("DRAGGING", 2);
        f267221e = qVar3;
        fy0.q qVar4 = new fy0.q("UP", 3);
        f267222f = qVar4;
        fy0.q[] qVarArr = {qVar, qVar2, qVar3, qVar4};
        f267223g = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    public static fy0.q valueOf(java.lang.String str) {
        return (fy0.q) java.lang.Enum.valueOf(fy0.q.class, str);
    }

    public static fy0.q[] values() {
        return (fy0.q[]) f267223g.clone();
    }
}
