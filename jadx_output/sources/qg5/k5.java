package qg5;

/* loaded from: classes8.dex */
public final class k5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363042d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f363044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363045g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363046h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363047i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363048m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363049n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(qg5.n5 n5Var, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363044f = n5Var;
        this.f363045g = context;
        this.f363046h = str;
        this.f363047i = str2;
        this.f363048m = str3;
        this.f363049n = str4;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qg5.k5 k5Var = new qg5.k5(this.f363044f, this.f363045g, this.f363046h, this.f363047i, this.f363048m, this.f363049n, continuation);
        k5Var.f363043e = obj;
        return k5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.k5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363042d;
        qg5.n5 n5Var = this.f363044f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f363043e;
            kotlinx.coroutines.z a17 = kotlinx.coroutines.b0.a(null, 1, null);
            kotlinx.coroutines.l.d(y0Var, null, null, new qg5.g5(a17, n5Var, this.f363047i, null), 3, null);
            qg5.j5 j5Var = new qg5.j5(a17, null);
            this.f363043e = y0Var;
            this.f363042d = 1;
            obj = kotlinx.coroutines.a4.c(600L, j5Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        ((qg5.l0) qg5.n5.T6(n5Var)).ij();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoSummarizeFSC", "saveStagedDataToFile failed");
            return f0Var;
        }
        jz5.g gVar = n5Var.f363100i;
        ((ht.w) ((jt.c0) ((jz5.n) gVar).getValue())).getClass();
        com.tencent.mm.pluginsdk.model.h4 h4Var = com.tencent.mm.pluginsdk.model.h4.f189337a;
        zk.a aVar2 = com.tencent.mm.app.provider.ShareableChatRecordsProvider.f53711e;
        android.content.Context context = this.f363045g;
        android.net.Uri d17 = aVar2.d(context);
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.tencent.hunyuan.app.chat");
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.setType("*/*");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new java.util.ArrayList<>(kz5.b0.c(d17)));
        intent.addFlags(268435456);
        intent.addFlags(1);
        intent.addFlags(128);
        intent.addFlags(64);
        intent.putExtra(this.f363048m, true);
        intent.putExtra("com.tencent.mm.intent.extra.WECHAT_CHAT_RECORDS_PROVIDER_SESSION_ID", this.f363049n);
        java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.yuanbao.version.RepairerConfigYuanBaoAppMinVerSummarizeMsg());
        if (f17 == null) {
            f17 = "";
        }
        intent.putExtra("gVer", f17);
        java.lang.String str = this.f363046h;
        if (str != null) {
            ((wj.j0) ((xj.i) ((jz5.n) n5Var.f363098g).getValue())).bj(str, new xj.n(wj.r0.f446499e, intent, this.f363045g, null, 8, null), new qg5.h5(n5Var));
        } else {
            java.lang.String wi6 = ((ht.w) ((jt.c0) ((jz5.n) gVar).getValue())).wi(context);
            java.lang.String string = context.getString(com.tencent.mm.R.string.f490358sq);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            ((kt.c) ((lt.i0) ((jz5.n) n5Var.f363101m).getValue())).hj(context.getApplicationContext(), intent, wi6, 0, string, new qg5.i5(n5Var), null);
        }
        return f0Var;
    }
}
