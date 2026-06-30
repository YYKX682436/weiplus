package vd2;

/* loaded from: classes3.dex */
public final class n3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f435824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f435825d;

    public n3(java.lang.String str, java.lang.String str2, vd2.g5 g5Var, vd2.g5 g5Var2) {
        this.f435822a = str;
        this.f435823b = str2;
        this.f435824c = g5Var;
        this.f435825d = g5Var2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r45.h32 h32Var = (r45.h32) ((r45.st0) fVar.f70618d).getCustom(1);
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0 && fVar.f70616b == 0 && h32Var != null) {
            vd2.j1 j1Var = (vd2.j1) ((zy2.x7) i95.n0.c(zy2.x7.class));
            j1Var.getClass();
            java.lang.String username = this.f435822a;
            kotlin.jvm.internal.o.g(username, "username");
            java.lang.String noticeId = this.f435823b;
            kotlin.jvm.internal.o.g(noticeId, "noticeId");
            j1Var.f435771e.put(new vd2.h1(username, noticeId), new vd2.i1(h32Var, c01.id.e()));
            vd2.g5 g5Var = this.f435824c;
            if (g5Var != null) {
                g5Var.a(java.lang.Boolean.valueOf(h32Var.getInteger(1) == 0));
                return f0Var;
            }
        } else {
            vd2.g5 g5Var2 = this.f435825d;
            if (g5Var2 != null) {
                g5Var2.a(java.lang.Integer.valueOf(fVar.f70616b));
                return f0Var;
            }
        }
        return null;
    }
}
