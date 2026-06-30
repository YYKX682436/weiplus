package te2;

/* loaded from: classes10.dex */
public final class i9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.m9 f418118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(te2.m9 m9Var) {
        super(1);
        this.f418118d = m9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ay1 ay1Var;
        r45.z22 songInfo = (r45.z22) obj;
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        te2.m9 m9Var = this.f418118d;
        m9Var.getClass();
        java.lang.String str = null;
        qo0.c.a(m9Var.f418151f, qo0.b.f365411s2, null, 2, null);
        r45.by1 by1Var = songInfo.f391631h;
        if (by1Var != null && (ay1Var = by1Var.f371143d) != null) {
            str = ay1Var.f370351e;
        }
        if (str == null) {
            str = "";
        }
        m9Var.i(str, new te2.h9(songInfo));
        return jz5.f0.f302826a;
    }
}
