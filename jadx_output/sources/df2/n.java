package df2;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230818d;

    /* renamed from: e, reason: collision with root package name */
    public int f230819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.o f230820f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(df2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230820f = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.n(this.f230820f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        kotlin.jvm.internal.f0 f0Var;
        java.util.LinkedList list;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230819e;
        df2.o oVar = this.f230820f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            r45.hx0 f17 = ek2.r1.f253524u.f(true);
            f0Var2.f310116d = f17.getInteger(0);
            this.f230818d = f0Var2;
            this.f230819e = 1;
            oVar.getClass();
            ek2.r1 r1Var = new ek2.r1(((mm2.e1) oVar.getStore().business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) oVar.getStore().business(mm2.e1.class)).f328983m, 23, f17);
            az2.j.u(r1Var, oVar.O6(), null, 0L, 6, null);
            b17 = rm0.h.b(r1Var, this);
            if (b17 == aVar) {
                return aVar;
            }
            f0Var = f0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = (kotlin.jvm.internal.f0) this.f230818d;
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) b17;
        r45.m02 m02Var = (r45.m02) fVar.f70618d;
        java.lang.Integer num = null;
        if (m02Var != null && (list = m02Var.getList(1)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((r45.ix0) obj2).getInteger(0) == f0Var.f310116d) {
                    break;
                }
            }
            r45.ix0 ix0Var = (r45.ix0) obj2;
            if (ix0Var != null) {
                num = new java.lang.Integer(ix0Var.getInteger(1));
            }
        }
        if (fVar.b() && num != null && num.intValue() == 0) {
            com.tencent.mars.xlog.Log.i(oVar.f230899p, "do cgi success, retCmdId = " + f0Var.f310116d);
            oVar.o7();
        } else {
            com.tencent.mars.xlog.Log.i(oVar.f230899p, "do cgi failed, errCode =" + fVar.f70616b + ", errMsg =" + fVar.f70617c + ", retCmdId = " + f0Var.f310116d);
            android.content.Context O6 = oVar.O6();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
            e4Var.f211776c = oVar.O6().getString(com.tencent.mm.R.string.nwg);
            e4Var.b(com.tencent.mm.R.raw.icons_outlined_error);
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
