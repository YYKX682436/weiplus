package kv2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312653d;

    /* renamed from: e, reason: collision with root package name */
    public int f312654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f312655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f312656g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f312657h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.ref.WeakReference weakReference, long j17, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312655f = weakReference;
        this.f312656g = j17;
        this.f312657h = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kv2.c(this.f312655f, this.f312656g, this.f312657h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kv2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f312654e;
        long j17 = this.f312656g;
        java.lang.ref.WeakReference weakReference = this.f312655f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.widget.dialog.u3 e17 = kv2.h.f312662a.e(weakReference);
            qk.j8 j8Var = (qk.j8) i95.n0.c(qk.j8.class);
            java.lang.String valueOf = java.lang.String.valueOf(j17);
            java.lang.String valueOf2 = java.lang.String.valueOf(j17);
            this.f312653d = e17;
            this.f312654e = 1;
            rk4.l4 l4Var = (rk4.l4) j8Var;
            l4Var.getClass();
            java.lang.Object c17 = kotlinx.coroutines.a4.c(5000L, new rk4.k4(l4Var, valueOf, valueOf2, null), this);
            if (c17 == aVar) {
                return aVar;
            }
            u3Var = e17;
            obj = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f312653d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bw5.lp0 lp0Var = (bw5.lp0) obj;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (lp0Var == null) {
            kv2.h.f312662a.f(weakReference, com.tencent.mm.R.string.lg7);
            com.tencent.mars.xlog.Log.w("MicroMsg.TingFinderMentionRouter", "tingItem is null");
            return f0Var;
        }
        bw5.v70 d17 = lp0Var.d();
        if (!kotlin.jvm.internal.o.b(d17 != null ? d17.getListenId() : null, java.lang.String.valueOf(j17))) {
            kv2.h.f312662a.f(weakReference, com.tencent.mm.R.string.lg7);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("listenId not equal, listenId:");
            sb6.append(j17);
            sb6.append(", tingItemId:");
            bw5.v70 d18 = lp0Var.d();
            sb6.append(d18 != null ? d18.getListenId() : null);
            com.tencent.mars.xlog.Log.w("MicroMsg.TingFinderMentionRouter", sb6.toString());
            return f0Var;
        }
        o40.e eVar = (o40.e) i95.n0.c(o40.e.class);
        eVar.getClass();
        bw5.x40 x40Var = new bw5.x40();
        x40Var.f34956f = lp0Var.d();
        x40Var.f34959i[3] = true;
        android.content.Context context = (android.app.Activity) weakReference.get();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        byte[] byteArray = x40Var.toByteArray();
        java.util.Map l17 = kz5.c1.l(new jz5.l("needLoadMore", java.lang.Boolean.FALSE));
        long j18 = this.f312657h;
        if (j18 != 0) {
            l17.put("refCommentId", new java.lang.Long(j18));
        }
        ((wy2.g) eVar).Bi(context, byteArray, l17);
        return f0Var;
    }
}
