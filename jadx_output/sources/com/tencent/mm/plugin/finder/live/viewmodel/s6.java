package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class s6 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f117395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117397c;

    public s6(kotlinx.coroutines.q qVar, java.lang.String str, com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        this.f117395a = qVar;
        this.f117396b = str;
        this.f117397c = b8Var;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        mv2.n0 n0Var = (mv2.n0) task;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "[dealWithCoverUrl] upload end, resultUrl:" + n0Var.f331609h + ", task.resultThumbUrl:" + n0Var.f331610i);
        fp0.u uVar = fp0.u.f265290f;
        kotlinx.coroutines.q qVar = this.f117395a;
        if (status == uVar && !com.tencent.mm.sdk.platformtools.t8.K0(n0Var.f331609h)) {
            java.lang.String str = n0Var.f331609h;
            java.lang.String str2 = n0Var.f331610i;
            dn.h hVar = n0Var.f331611m;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.finder.live.viewmodel.b6(str, str2, this.f117396b, hVar != null ? hVar.field_filemd5 : null)));
            return;
        }
        qo0.c cVar = this.f117397c.f116936d;
        boolean z17 = false;
        if (cVar != null && cVar.getLiveRole() == 1) {
            z17 = true;
        }
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            ml2.z3[] z3VarArr = ml2.z3.f328342d;
            zy2.zb.j5(zbVar, 4L, java.lang.String.valueOf(1), null, 4, null);
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            fp0.u uVar2 = fp0.u.f265288d;
            j0Var.getClass();
            ml2.j0.f327583i.N = 3;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Yj(ml2.w1.f328176f);
        }
        qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
    }
}
