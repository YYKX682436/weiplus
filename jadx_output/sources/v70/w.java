package v70;

@j95.b
/* loaded from: classes12.dex */
public final class w extends jm0.o implements xs.d1 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f433625m = jz5.h.b(v70.s.f433619d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f433626n = jz5.h.b(v70.u.f433623d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f433627o = jz5.h.b(v70.v.f433624d);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f433628p = jz5.h.b(v70.p.f433616d);

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f433629q = jz5.h.b(v70.q.f433617d);

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f433630r = jz5.h.b(v70.r.f433618d);

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(g80.o.class);
        set.add(e80.r.class);
        set.add(e80.f.class);
        set.add(d80.a.class);
        set.add(c80.e.class);
        set.add(x70.g.class);
        set.add(w70.b.class);
        set.add(w70.d.class);
        set.add(d80.c.class);
        set.add(z70.b.class);
        set.add(w70.f.class);
    }

    public void Zi(r70.b taskListener) {
        kotlin.jvm.internal.o.g(taskListener, "taskListener");
        ((java.util.HashSet) ((jz5.n) this.f433625m).getValue()).add(taskListener);
    }

    public final void aj(int i17, java.lang.String str) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgFeatureService", "computePHash fileNotExist:" + str);
        } else {
            if (((java.util.HashMap) ((jz5.n) this.f433630r).getValue()).containsKey(java.lang.Integer.valueOf(i17))) {
                return;
            }
            ea0.f fVar = (ea0.f) i95.n0.c(ea0.f.class);
            v70.o oVar = new v70.o(i17, this);
            ((da0.e) fVar).getClass();
            wi3.l lVar = wi3.l.f446226a;
            kotlinx.coroutines.l.f(null, new wi3.h(str, oVar, null), 1, null);
        }
    }

    public java.lang.Object bj(l70.d dVar, kotlin.coroutines.Continuation continuation) {
        return x70.g.f452415f.a().T6(dVar, continuation);
    }

    public l70.d cj(com.tencent.mm.storage.f9 f9Var, s70.c type, boolean z17) {
        kotlin.jvm.internal.o.g(type, "type");
        return x70.g.f452415f.a().U6(f9Var, type, z17);
    }

    public int fj(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String j17;
        l15.f l17;
        if (f9Var == null || (j17 = f9Var.j()) == null) {
            return 0;
        }
        j15.d dVar = new j15.d();
        dVar.fromXml(j17);
        l15.d r17 = dVar.r();
        return (r17 == null || (l17 = r17.l()) == null) ? f9Var.R : l17.j();
    }

    public s70.a hj(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        return new g80.p(talker, j17);
    }

    public final java.util.HashMap ij() {
        return (java.util.HashMap) ((jz5.n) this.f433627o).getValue();
    }

    public void mj(r70.b taskListener) {
        kotlin.jvm.internal.o.g(taskListener, "taskListener");
        ((java.util.HashSet) ((jz5.n) this.f433625m).getValue()).remove(taskListener);
    }

    public kotlinx.coroutines.flow.j nj(r70.g params) {
        kotlin.jvm.internal.o.g(params, "params");
        v70.w wVar = (v70.w) i95.n0.c(v70.w.class);
        jm0.f fVar = jm0.g.f300266e;
        kotlin.jvm.internal.o.d(wVar);
        e80.f fVar2 = (e80.f) fVar.a(wVar, e80.f.class);
        fVar2.getClass();
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(1, 0, null, 6, null);
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) fVar2.f250019g).getValue(), null, new e80.e(params, fVar2, b17, null), 1, null);
        return b17;
    }

    public kotlinx.coroutines.flow.j oj(r70.g params, o70.l preBuildResultItem) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(preBuildResultItem, "preBuildResultItem");
        v70.w wVar = (v70.w) i95.n0.c(v70.w.class);
        kotlin.jvm.internal.o.d(wVar);
        if (!jm0.g.class.isAssignableFrom(e80.f.class)) {
            throw new java.lang.IllegalArgumentException(wVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(wVar.getViewModel(), new jm0.e(wVar)).a(e80.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        qi3.x.f363761a.a(new com.tencent.mm.plugin.msg.MsgIdTalker(preBuildResultItem.f343265a, preBuildResultItem.f343268d));
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(1, 0, null, 6, null);
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) ((e80.f) ((jm0.g) a17)).f250018f).getValue(), null, new e80.c(params, preBuildResultItem, b17, null), 1, null);
        return b17;
    }

    public void pj(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (!pt0.f0.f358209b1.h() && f9Var != null) {
            f9Var.R = i17;
            f9Var.f236178r = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        sb6.append(", downloadControlType: ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgFeatureService", sb6.toString());
    }

    public void qj(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (!pt0.f0.f358209b1.h() && f9Var != null) {
            f9Var.Q = str;
            f9Var.f236178r = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        sb6.append(", expIdStr: ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgFeatureService", sb6.toString());
    }
}
