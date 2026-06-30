package qn2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f365035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f365037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String str, qn2.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f365036e = str;
        this.f365037f = l1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qn2.a1(this.f365036e, this.f365037f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f365035d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            db2.b1 b1Var = new db2.b1(this.f365036e, null, null, 0, null, null, null, null, 0, null, null, 2046, null);
            this.f365035d = 1;
            b17 = rm0.h.b(b1Var, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) b17;
        r45.h32 h32Var = (r45.h32) ((r45.v71) fVar.f70618d).getCustom(1);
        boolean b18 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        qn2.l1 l1Var = this.f365037f;
        if (b18) {
            if (!(h32Var == null)) {
                if (zl2.t.e(h32Var)) {
                    qo0.c.a(l1Var.f365091a.A, qo0.b.f365412s3, null, 2, null);
                } else {
                    java.lang.String str = ((mm2.c1) l1Var.f365091a.P0(mm2.c1.class)).f328852o;
                    android.content.Context context = l1Var.f365092b.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    tx2.i0 i0Var = new tx2.i0(context, zl2.u4.f473990f, 0, 4, null);
                    qn2.l1 l1Var2 = this.f365037f;
                    java.lang.String str2 = this.f365036e;
                    i0Var.z(str, h32Var, null);
                    i0Var.A(new qn2.z0(l1Var2, str, str2, h32Var, i0Var));
                    i0Var.w();
                }
                return f0Var;
            }
        }
        com.tencent.mars.xlog.Log.w(l1Var.f365095e, "get notice fail " + this.f365036e + ' ' + fVar.f70615a + ' ' + fVar.f70616b);
        return f0Var;
    }
}
