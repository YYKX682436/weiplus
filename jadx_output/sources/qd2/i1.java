package qd2;

/* loaded from: classes8.dex */
public final class i1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.m8 f361777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.g9 f361778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f361779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361781e;

    public i1(com.tencent.mm.plugin.finder.assist.m8 m8Var, com.tencent.mm.plugin.finder.assist.g9 g9Var, android.app.Activity activity, int i17, int i18) {
        this.f361777a = m8Var;
        this.f361778b = g9Var;
        this.f361779c = activity;
        this.f361780d = i17;
        this.f361781e = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doPreCheck] errType:");
        sb6.append(fVar.f70615a);
        sb6.append(" errCode:");
        sb6.append(fVar.f70616b);
        sb6.append(" errMsg:");
        sb6.append(fVar.f70617c);
        sb6.append(" finder_secret_data:");
        com.tencent.mm.protobuf.g byteString = ((r45.l23) fVar.f70618d).getByteString(4);
        sb6.append(byteString != null ? byteString.i() : null);
        com.tencent.mars.xlog.Log.i("FinderSafePreCheckHelper", sb6.toString());
        com.tencent.mm.plugin.finder.assist.m8 m8Var = this.f361777a;
        if (m8Var != null) {
            m8Var.a(fVar);
        }
        qd2.h1 h1Var = new qd2.h1(m8Var, ((r45.l23) fVar.f70618d).getByteString(4));
        if (fVar.f70616b == -5002) {
            com.tencent.mm.plugin.finder.assist.g9 g9Var = this.f361778b;
            if (!g9Var.f102209e) {
                if (g9Var.f102208d) {
                    h1Var.d(this.f361779c, this.f361780d, fVar.f70617c, this.f361781e);
                } else {
                    h1Var.f(7, false, false);
                }
                return jz5.f0.f302826a;
            }
        }
        h1Var.f(1, true, false);
        return jz5.f0.f302826a;
    }
}
