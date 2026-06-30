package qd2;

/* loaded from: classes8.dex */
public final class h1 extends qd2.q {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.assist.m8 f361774a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f361775b;

    public h1(com.tencent.mm.plugin.finder.assist.m8 m8Var, com.tencent.mm.protobuf.g gVar) {
        this.f361774a = m8Var;
        this.f361775b = gVar;
    }

    @Override // qd2.q
    public void f(int i17, boolean z17, boolean z18) {
        super.f(i17, z17, z18);
        com.tencent.mm.plugin.finder.assist.h9 h9Var = new com.tencent.mm.plugin.finder.assist.h9(z17, z18, this.f361775b);
        com.tencent.mm.plugin.finder.assist.m8 m8Var = this.f361774a;
        if (m8Var != null) {
            m8Var.c(h9Var);
        }
    }

    @Override // qd2.q
    public void j() {
        com.tencent.mm.plugin.finder.assist.m8 m8Var = this.f361774a;
        if (m8Var != null) {
            m8Var.b();
        }
    }
}
