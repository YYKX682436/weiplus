package nv2;

/* loaded from: classes2.dex */
public final class v1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.w1 f340606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f340607b;

    public v1(nv2.w1 w1Var, nv2.o1 o1Var) {
        this.f340606a = w1Var;
        this.f340607b = o1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("Finder.LikeActionTask", "LikeActionTask callback " + fVar.f70615a + ' ' + fVar.f70616b + ' ' + fVar.f70617c);
        nv2.w1 w1Var = this.f340606a;
        int a17 = nv2.r1.a(w1Var.f340616h);
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        nv2.i1 i1Var = w1Var.f340573a;
        nv2.o1 o1Var = this.f340607b;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = w1Var.f340615g;
            int likeCount = yj0Var.getLikeCount();
            boolean z17 = yj0Var.getLikeFlag() == 1;
            nv2.x1 x1Var = w1Var.f340616h;
            kotlin.jvm.internal.o.g(x1Var, "<this>");
            nv2.x1 x1Var2 = nv2.x1.f340626d;
            if (!(x1Var == x1Var2 || x1Var == nv2.x1.f340631i) || z17) {
                if ((x1Var == nv2.x1.f340627e || x1Var == nv2.x1.f340632m) && z17) {
                    yj0Var.u0().setLikeCount(yj0Var.getLikeCount() - 1);
                }
            } else {
                yj0Var.u0().setLikeCount(yj0Var.getLikeCount() + 1);
            }
            if (x1Var == nv2.x1.f340629g) {
                pm0.v.X(new nv2.s1(w1Var));
            } else if (x1Var == nv2.x1.f340630h) {
                pm0.v.X(new nv2.t1(w1Var));
            } else {
                if (x1Var == x1Var2 || x1Var == nv2.x1.f340631i) {
                    yj0Var.u0().setLikeFlag(1);
                } else {
                    if ((x1Var == nv2.x1.f340627e || x1Var == nv2.x1.f340632m) || x1Var == nv2.x1.f340628f || x1Var == nv2.x1.f340633n) {
                        yj0Var.u0().setLikeFlag(0);
                    }
                }
            }
            if (w1Var.f340619k && w1Var.f340617i == 1) {
                if (x1Var == x1Var2) {
                    yj0Var.l1(1 | yj0Var.z0());
                } else {
                    yj0Var.l1(yj0Var.z0() & (-2));
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.LikeCommentAction", "CgiFinderLikeFeed end likeFlag: " + yj0Var.getLikeFlag() + " likeCount " + yj0Var.getLikeCount() + ' ' + z17 + ' ' + likeCount);
            nv2.n1.f340551h.n(w1Var, a17);
            o1Var.a(fp0.u.f265290f, false);
            if (i1Var != null) {
                i1Var.a(yj0Var);
                return f0Var;
            }
        } else {
            if (i17 == 4) {
                pm0.v.X(new nv2.u1(w1Var, a17));
                o1Var.a(fp0.u.f265291g, false);
            } else {
                o1Var.a(fp0.u.f265291g, true);
            }
            if (i1Var != null) {
                int i18 = fVar.f70615a;
                int i19 = fVar.f70616b;
                java.lang.String str = fVar.f70617c;
                if (str == null) {
                    str = "";
                }
                i1Var.b(i18, i19, str);
                return f0Var;
            }
        }
        return null;
    }
}
