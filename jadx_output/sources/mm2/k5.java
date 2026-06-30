package mm2;

/* loaded from: classes10.dex */
public final class k5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f329197f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329198g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329197f = kotlinx.coroutines.flow.r2.b(0, 1, null, 5, null);
        this.f329198g = kotlinx.coroutines.flow.i3.a(null);
    }

    public final java.lang.Object N6(r45.yx1 yx1Var, kotlin.coroutines.Continuation continuation) {
        r45.cy1 cy1Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        com.tencent.mm.protobuf.g gVar;
        r45.zr5 zr5Var = r45.zr5.ResourceInfoType_AccPlayURL;
        zy.w wi6 = ((bz.f) ((zy.u) i95.n0.c(zy.u.class))).wi(zy.x.f477304f);
        java.lang.String c17 = mm2.o5.c(wi6, yx1Var, zr5Var);
        if (c17 == null) {
            return mm2.o5.a(wi6, yx1Var, zr5Var, mm2.m5.f329238d, continuation);
        }
        r45.by1 by1Var = yx1Var.f391466o;
        java.lang.String str = null;
        if (by1Var != null && (cy1Var = by1Var.f371144e) != null && (linkedList = cy1Var.f371920d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.ec6) obj).f373272d == 4) {
                    break;
                }
            }
            r45.ec6 ec6Var = (r45.ec6) obj;
            if (ec6Var != null && (gVar = ec6Var.f373273e) != null) {
                str = gVar.i();
            }
        }
        if (str == null) {
            str = "";
        }
        return new zy.a(true, c17, "", "", null, str);
    }

    public final java.lang.Object O6(r45.yx1 yx1Var, kotlin.coroutines.Continuation continuation) {
        r45.cy1 cy1Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        com.tencent.mm.protobuf.g gVar;
        r45.zr5 zr5Var = r45.zr5.ResourceInfoType_SongPlayURL;
        zy.w wi6 = ((bz.f) ((zy.u) i95.n0.c(zy.u.class))).wi(zy.x.f477304f);
        java.lang.String c17 = mm2.o5.c(wi6, yx1Var, zr5Var);
        if (c17 == null) {
            return mm2.o5.a(wi6, yx1Var, zr5Var, mm2.m5.f329238d, continuation);
        }
        r45.by1 by1Var = yx1Var.f391466o;
        java.lang.String str = null;
        if (by1Var != null && (cy1Var = by1Var.f371144e) != null && (linkedList = cy1Var.f371920d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.ec6) obj).f373272d == 3) {
                    break;
                }
            }
            r45.ec6 ec6Var = (r45.ec6) obj;
            if (ec6Var != null && (gVar = ec6Var.f373273e) != null) {
                str = gVar.i();
            }
        }
        if (str == null) {
            str = "";
        }
        return new zy.a(true, c17, "", "", null, str);
    }
}
