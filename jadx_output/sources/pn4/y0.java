package pn4;

/* loaded from: classes14.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357250d;

    /* renamed from: e, reason: collision with root package name */
    public int f357251e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f357253g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f357254h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.dh5 f357255i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ byte[] f357256m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(pn4.e1 e1Var, int i17, r45.dh5 dh5Var, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357253g = e1Var;
        this.f357254h = i17;
        this.f357255i = dh5Var;
        this.f357256m = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pn4.y0 y0Var = new pn4.y0(this.f357253g, this.f357254h, this.f357255i, this.f357256m, continuation);
        y0Var.f357252f = obj;
        return y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pn4.e1 e1Var;
        int i17;
        byte[] bArr = this.f357256m;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f357251e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pn4.e1 e1Var2 = this.f357253g;
            java.lang.String str = e1Var2.f357086e;
            r45.dh5 dh5Var = this.f357255i;
            dh5Var.getInteger(5);
            dh5Var.getBoolean(1);
            com.tencent.mm.vfs.r6 s17 = new com.tencent.mm.vfs.r6(e1Var2.g()).s();
            if (s17 != null) {
                s17.J();
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.tencent.mm.vfs.w6.a(e1Var2.g(), bArr);
                java.util.List list = e1Var2.f357088g;
                java.util.LinkedList list2 = dh5Var.getList(4);
                kotlin.jvm.internal.o.f(list2, "getAudioExtInfo(...)");
                ((java.util.ArrayList) list).addAll(list2);
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (arrayList.size() > 1) {
                    kz5.g0.t(arrayList, new pn4.x0());
                }
                m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e(e1Var2.f357086e, "write tmp file error " + m524exceptionOrNullimpl);
            }
            e1Var2.getClass();
            int i19 = e1Var2.f357092k;
            pn4.t0 t0Var = e1Var2.f357090i;
            int length = bArr.length;
            this.f357252f = e1Var2;
            this.f357250d = i19;
            this.f357251e = 1;
            java.lang.Object c17 = t0Var.c(bArr, i19, length, this);
            if (c17 == aVar) {
                return aVar;
            }
            e1Var = e1Var2;
            obj = c17;
            i17 = i19;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f357250d;
            e1Var = (pn4.e1) this.f357252f;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        e1Var.f357092k = i17 + ((java.lang.Number) obj).intValue();
        return f0Var;
    }
}
