package nr2;

/* loaded from: classes8.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.u0 f339274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f339275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f339276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f339277h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339278i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f339279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f339280n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339281o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(nr2.u0 u0Var, android.view.View view, int i17, long j17, java.lang.String str, boolean z17, boolean z18, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339274e = u0Var;
        this.f339275f = view;
        this.f339276g = i17;
        this.f339277h = j17;
        this.f339278i = str;
        this.f339279m = z17;
        this.f339280n = z18;
        this.f339281o = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr2.o0(this.f339274e, this.f339275f, this.f339276g, this.f339277h, this.f339278i, this.f339279m, this.f339280n, this.f339281o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr2.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Q6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339273d;
        android.view.View view = this.f339275f;
        nr2.u0 u0Var = this.f339274e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPayUIC", "doPay");
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int i18 = this.f339276g;
            long j17 = this.f339277h;
            java.lang.String str = this.f339278i;
            java.lang.String str2 = this.f339281o;
            if (str2 == null) {
                str2 = u0Var.f339313d;
            }
            java.lang.String str3 = str2;
            this.f339273d = 1;
            u0Var.getClass();
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
            com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPayUIC", "#orderAndPay authorFinderUsername: " + str + " price: " + i18 + " requestId:" + uuid + " commentScene:" + V6.getInteger(5) + " sourceFeedId:" + str3);
            Q6 = this.f339279m ? u0Var.Q6(V6, i18, j17, str, uuid, str3, this) : this.f339280n ? u0Var.R6(V6, i18, j17, str, uuid, str3, this) : new nr2.k0(false, "unknown paidCollection type", "", -1);
            if (Q6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            Q6 = obj;
        }
        nr2.k0 k0Var = (nr2.k0) Q6;
        if (k0Var.f339246a) {
            u0Var.f339315f = true;
            android.app.Activity context2 = u0Var.getContext();
            nr2.n0 n0Var = nr2.n0.f339271d;
            kotlin.jvm.internal.o.g(context2, "context");
            az2.f fVar = new az2.f();
            fVar.f16128c = 0L;
            new java.lang.ref.WeakReference(context2);
            az2.q qVar = new az2.q();
            qVar.f16150d = n0Var;
            qVar.f16152a = new java.lang.ref.WeakReference(context2);
            fVar.f16127b = qVar;
            u0Var.f339314e = fVar;
            az2.f fVar2 = u0Var.f339314e;
            if (fVar2 != null) {
                fVar2.a();
            }
            cu2.g0 g0Var = cu2.g0.f222404a;
            cu2.g0.f222405b.put(java.lang.Long.valueOf(this.f339277h), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        } else {
            u0Var.f339315f = false;
            if (view.getContext() != null && k0Var.f339249d != 0) {
                android.content.Context context3 = view.getContext();
                int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context3);
                e4Var.f211776c = view.getContext().getString(com.tencent.mm.R.string.lq7);
                e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                e4Var.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
