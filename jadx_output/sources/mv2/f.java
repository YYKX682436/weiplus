package mv2;

/* loaded from: classes10.dex */
public final class f implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mv2.l f331560a;

    public f(mv2.l lVar) {
        this.f331560a = lVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        mv2.b task = (mv2.b) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        mv2.l lVar = mv2.l.f331597d;
        com.tencent.mars.xlog.Log.i("Finder.FinderActionManager", "task callback " + status);
        fp0.u uVar = fp0.u.f265290f;
        mv2.l lVar2 = this.f331560a;
        if (status == uVar) {
            lVar2.e();
        } else {
            com.tencent.mm.sdk.platformtools.u3.l(lVar2.f331600c);
            com.tencent.mm.sdk.platformtools.u3.i(lVar2.f331600c, nv2.a.f340431a);
        }
    }
}
