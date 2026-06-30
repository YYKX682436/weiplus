package x65;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452362d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f452363e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f452364f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f452365g;

    /* renamed from: h, reason: collision with root package name */
    public int f452366h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x65.l f452367i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w65.m f452368m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f452369n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(x65.l lVar, w65.m mVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f452367i = lVar;
        this.f452368m = mVar;
        this.f452369n = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new x65.h(this.f452367i, this.f452368m, this.f452369n, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((x65.h) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        w65.m mVar;
        kotlin.jvm.internal.h0 h0Var;
        x65.l lVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f452366h;
        x65.l lVar2 = this.f452367i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.sync.d dVar = lVar2.f452375e;
            this.f452362d = dVar;
            this.f452363e = lVar2;
            mVar = this.f452368m;
            this.f452364f = mVar;
            kotlin.jvm.internal.h0 h0Var2 = this.f452369n;
            this.f452365g = h0Var2;
            this.f452366h = 1;
            kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
            lVar = lVar2;
            obj2 = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f452365g;
            mVar = (w65.m) this.f452364f;
            lVar = (x65.l) this.f452363e;
            java.lang.Object obj4 = (kotlinx.coroutines.sync.d) this.f452362d;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj4;
        }
        try {
            y65.c f17 = lVar.f();
            java.lang.String id6 = mVar.id();
            f17.getClass();
            kotlin.jvm.internal.o.g(id6, "id");
            java.util.Iterator it = f17.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (kotlin.jvm.internal.o.b(((w65.m) obj3).id(), id6)) {
                    break;
                }
            }
            boolean z17 = obj3 != null;
            jz5.f0 f0Var = jz5.f0.f302826a;
            if (z17) {
                ((w65.g) mVar).k();
                h0Var.f310123d = lVar.f().b(mVar.id());
                return f0Var;
            }
            ((w65.g) mVar).f443357f = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
            h0Var.f310123d = mVar;
            y65.c g17 = lVar.g();
            g17.getClass();
            g17.a().add(mVar);
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            com.tencent.mars.xlog.Log.i(lVar2.e(), "waitRunQueue:" + lVar2.g().a().size() + " runningQueue:" + lVar2.f().a().size());
            return f0Var;
        } finally {
            ((kotlinx.coroutines.sync.k) obj2).d(null);
        }
    }
}
