package st3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final st3.q f412569d;

    /* renamed from: e, reason: collision with root package name */
    public static final st3.q f412570e;

    /* renamed from: f, reason: collision with root package name */
    public static final st3.q f412571f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ st3.q[] f412572g;

    static {
        st3.q qVar = new st3.q("CameraView_TOP", 0);
        f412569d = qVar;
        st3.q qVar2 = new st3.q("CameraView_Center", 1);
        f412570e = qVar2;
        st3.q qVar3 = new st3.q("CameraView_Bottom", 2);
        f412571f = qVar3;
        st3.q[] qVarArr = {qVar, qVar2, qVar3};
        f412572g = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17) {
    }

    public static st3.q valueOf(java.lang.String str) {
        return (st3.q) java.lang.Enum.valueOf(st3.q.class, str);
    }

    public static st3.q[] values() {
        return (st3.q[]) f412572g.clone();
    }
}
