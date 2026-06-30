package ws2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f448999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f449000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f449001g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.content.Context context, ws2.k1 k1Var, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448999e = context;
        this.f449000f = k1Var;
        this.f449001g = intent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ws2.a1(this.f448999e, this.f449000f, this.f449001g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ws2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f448998d;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                zl2.f fVar = zl2.f.f473753a;
                android.content.Context context = this.f448999e;
                java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.eat);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String a17 = n25.a.a();
                kotlin.jvm.internal.o.f(a17, "getMessageChannelIdUse(...)");
                this.f448998d = 1;
                b17 = fVar.b(context, 21, string, false, true, a17, 20000L, "finderreplayfloatpermission", this);
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
            com.tencent.mm.plugin.finder.assist.v0 v0Var = (com.tencent.mm.plugin.finder.assist.v0) b17;
            boolean z18 = v0Var instanceof com.tencent.mm.plugin.finder.assist.t0;
            ws2.k1 k1Var = this.f449000f;
            if (z18) {
                com.tencent.mars.xlog.Log.i("FinderLiveReplayService", "requestPermissionToStartMiniUI ShowWarningAlert positive");
                android.content.Intent intent = this.f449001g;
                ws2.u0 u0Var = ws2.k1.f449066r;
                k1Var.r(intent);
            } else {
                if (!(v0Var instanceof com.tencent.mm.plugin.finder.assist.s0)) {
                    z17 = v0Var instanceof com.tencent.mm.plugin.finder.assist.r0;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("FinderLiveReplayService", "requestPermissionToStartMiniUI result:" + v0Var + ",release replay!");
                    pm0.v.X(new ws2.y0(k1Var));
                } else if (v0Var instanceof com.tencent.mm.plugin.finder.assist.u0) {
                    com.tencent.mars.xlog.Log.i("FinderLiveReplayService", "requestPermissionToStartMiniUI time out");
                    pm0.v.X(new ws2.z0(k1Var));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderLiveReplayService", "requestPermissionToStartMiniUI " + th6.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
