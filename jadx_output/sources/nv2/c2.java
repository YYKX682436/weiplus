package nv2;

/* loaded from: classes10.dex */
public final class c2 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.e2 f340469a;

    public c2(nv2.e2 e2Var) {
        this.f340469a = e2Var;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        nv2.g2 task = (nv2.g2) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        nv2.e2 e2Var = nv2.e2.f340481d;
        com.tencent.mars.xlog.Log.i("Finder.ThankActionMgr", "task callback " + status);
        fp0.u uVar = fp0.u.f265290f;
        nv2.e2 e2Var2 = this.f340469a;
        if (status == uVar) {
            e2Var2.c();
            return;
        }
        if (task.f340502g) {
            e2Var2.f340483b.add(task.f340501f);
        }
        com.tencent.mm.sdk.platformtools.u3.l(e2Var2.f340484c);
        com.tencent.mm.sdk.platformtools.u3.i(e2Var2.f340484c, nv2.a.f340431a);
    }
}
