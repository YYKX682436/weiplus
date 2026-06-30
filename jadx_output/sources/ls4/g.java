package ls4;

/* loaded from: classes8.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321056a;

    public g(ls4.u uVar) {
        this.f321056a = uVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ls4.u uVar = this.f321056a;
        uVar.e();
        kotlin.jvm.internal.o.d(fVar);
        if (os4.h.g(fVar)) {
            com.tencent.mars.xlog.Log.e("WeCoinConsumeLogic", "cgi fail: " + fVar);
            uVar.d(new pr4.a(pr4.j.f358012d));
        } else {
            long j17 = ((r45.fs3) fVar.f70618d).f374585d;
            os4.h.l(j17);
            if (j17 >= uVar.f321100a.f358029j) {
                ls4.u.b(uVar);
            } else {
                ls4.u.c(uVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
