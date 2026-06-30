package pn4;

/* loaded from: classes14.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357131d;

    /* renamed from: e, reason: collision with root package name */
    public int f357132e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pn4.q0 f357134g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f357135h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.hy3 f357136i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ byte[] f357137m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(pn4.q0 q0Var, int i17, r45.hy3 hy3Var, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357134g = q0Var;
        this.f357135h = i17;
        this.f357136i = hy3Var;
        this.f357137m = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pn4.k0 k0Var = new pn4.k0(this.f357134g, this.f357135h, this.f357136i, this.f357137m, continuation);
        k0Var.f357133f = obj;
        return k0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pn4.q0 q0Var;
        int i17;
        byte[] bArr = this.f357137m;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f357132e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pn4.q0 q0Var2 = this.f357134g;
            java.lang.String str = q0Var2.f357190e;
            r45.hy3 hy3Var = this.f357136i;
            hy3Var.getInteger(5);
            hy3Var.getBoolean(1);
            com.tencent.mm.vfs.r6 s17 = new com.tencent.mm.vfs.r6(q0Var2.g()).s();
            if (s17 != null) {
                s17.J();
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.tencent.mm.vfs.w6.a(q0Var2.g(), bArr);
                java.util.List list = q0Var2.f357192g;
                java.util.LinkedList list2 = hy3Var.getList(4);
                kotlin.jvm.internal.o.f(list2, "getAudioExtInfo(...)");
                ((java.util.ArrayList) list).addAll(list2);
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (arrayList.size() > 1) {
                    kz5.g0.t(arrayList, new pn4.j0());
                }
                m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e(q0Var2.f357190e, "write tmp file error " + m524exceptionOrNullimpl);
            }
            q0Var2.getClass();
            int i19 = q0Var2.f357195j;
            pn4.e0 e0Var = q0Var2.f357193h;
            int length = bArr.length;
            this.f357133f = q0Var2;
            this.f357131d = i19;
            this.f357132e = 1;
            java.lang.Object c17 = e0Var.c(bArr, i19, length, this);
            if (c17 == aVar) {
                return aVar;
            }
            q0Var = q0Var2;
            obj = c17;
            i17 = i19;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f357131d;
            q0Var = (pn4.q0) this.f357133f;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        q0Var.f357195j = i17 + ((java.lang.Number) obj).intValue();
        return f0Var;
    }
}
