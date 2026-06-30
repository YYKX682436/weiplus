package yx3;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f467925d;

    /* renamed from: e, reason: collision with root package name */
    public int f467926e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467927f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx3.v f467928g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467929h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f467930i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yx3.v vVar, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467928g = vVar;
        this.f467929h = str;
        this.f467930i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        yx3.s sVar = new yx3.s(this.f467928g, this.f467929h, this.f467930i, continuation);
        sVar.f467927f = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx3.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467926e;
        java.lang.String str = this.f467929h;
        yx3.v vVar = this.f467928g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f467927f;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long a17 = yx3.v.a(vVar);
            yx3.r rVar = new yx3.r(str, vVar, this.f467930i, null);
            this.f467927f = y0Var2;
            this.f467925d = elapsedRealtime;
            this.f467926e = 1;
            java.lang.Object c17 = kotlinx.coroutines.a4.c(a17, rVar, this);
            if (c17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = c17;
            j17 = elapsedRealtime;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f467925d;
            y0Var = (kotlinx.coroutines.y0) this.f467927f;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        vx3.i iVar = (vx3.i) obj;
        if (iVar == null) {
            iVar = vx3.l.E.b();
            com.tencent.mars.xlog.Log.w("MicroMsg.RingtoneServiceHelper", "getRingBackMediaInfo timeout with " + yx3.v.a(vVar) + ", use default ringtone");
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        vVar.f467964x = android.os.SystemClock.elapsedRealtime() - j17;
        vVar.f467944d = iVar.f441284a;
        vVar.f467942b = iVar;
        if (kotlinx.coroutines.z0.h(y0Var)) {
            vVar.d(vx3.b.f441268h);
        }
        vx3.c cVar = vVar.f467945e;
        if ((cVar != null ? cVar.f441270a : null) == vx3.d.f441273d) {
            if (str != null) {
                vVar.D = str;
            }
            vVar.f467959s = java.lang.System.currentTimeMillis();
            vVar.f467965y = iVar.f441296m;
            java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(iVar.f441298o);
            kotlin.jvm.internal.o.f(r07, "getUnsignedLongString(...)");
            vVar.f467966z = r07;
            vVar.B = iVar.f441300q;
            vVar.E = mx3.i0.f332577a.b(iVar);
            vVar.f467960t = iVar.f441290g;
            java.lang.String toUser = vVar.D;
            kotlin.jvm.internal.o.g(toUser, "toUser");
            mx3.i0.f332582f.putString(toUser, iVar.n());
        }
        return jz5.f0.f302826a;
    }
}
