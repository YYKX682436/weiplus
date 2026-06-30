package qg5;

/* loaded from: classes8.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363155d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f363156e;

    /* renamed from: f, reason: collision with root package name */
    public int f363157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f363158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363159h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qg5.u3 f363160i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xj.m f363161m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f363162n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363163o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, android.content.Context context, qg5.u3 u3Var, xj.m mVar, yz5.a aVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363158g = lifecycleScope;
        this.f363159h = context;
        this.f363160i = u3Var;
        this.f363161m = mVar;
        this.f363162n = aVar;
        this.f363163o = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qg5.r3(this.f363158g, this.f363159h, this.f363160i, this.f363161m, this.f363162n, this.f363163o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.r3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.f fVar;
        kotlin.jvm.internal.c0 c0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363157f;
        android.content.Context context = this.f363159h;
        qg5.u3 u3Var = this.f363160i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fVar = new com.tencent.mm.ui.widget.dialog.f(0L, 1, null);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            kotlinx.coroutines.r2 b17 = v65.i.b(this.f363158g, null, new qg5.q3(u3Var, this.f363163o, null), 1, null);
            fVar.b(context, context.getString(com.tencent.mm.R.string.pag), true, 0, new qg5.p3(c0Var2, b17));
            this.f363155d = fVar;
            this.f363156e = c0Var2;
            this.f363157f = 1;
            if (b17.C(this) == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (kotlin.jvm.internal.c0) this.f363156e;
            fVar = (com.tencent.mm.ui.widget.dialog.f) this.f363155d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        fVar.a();
        boolean z17 = c0Var.f310112d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyChatRecordsFSC", "user cancelled loading");
            return f0Var;
        }
        boolean z18 = j62.e.g().c(new com.tencent.mm.repairer.config.yuanbao.RepairerConfigYuanBaoCopyChatRecordsSkipDialog()) == 1;
        xj.m mVar = this.f363161m;
        yz5.a callback = this.f363162n;
        if (!z18) {
            kotlin.jvm.internal.o.g(callback, "callback");
            kk5.i1.f308651m = callback;
            kk5.i1.f308652n = mVar;
            android.content.Intent intent = new android.content.Intent();
            pf5.j0.a(intent, kk5.i1.class);
            bh5.c cVar = new bh5.c();
            cVar.d(intent);
            cVar.f20922a.f20924a = context;
            cVar.c(false);
            cVar.f(false);
            cVar.a(com.tencent.mm.ui.container.MMCommonActivity.class.getName());
            cVar.b(com.tencent.mm.ui.halfscreen.MMHalfScreenMaxHeightDialogFragment.class);
            cVar.g();
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyChatRecordsFSC", "skip dialog");
        ((ht.w) ((jt.c0) ((jz5.n) u3Var.f363214m).getValue())).getClass();
        com.tencent.mm.pluginsdk.model.h4 h4Var = com.tencent.mm.pluginsdk.model.h4.f189337a;
        android.net.Uri parse = android.net.Uri.parse("content://" + context.getPackageName() + ".app.provider.ShareableChatRecords/");
        if (parse == null) {
            parse = android.net.Uri.EMPTY;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setPackage("com.tencent.hunyuan.app.chat");
        intent2.setAction("android.intent.action.SEND_MULTIPLE");
        intent2.setType("*/*");
        intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", new java.util.ArrayList<>(kz5.b0.c(parse)));
        intent2.addFlags(268435456);
        intent2.addFlags(1);
        intent2.addFlags(128);
        intent2.addFlags(64);
        intent2.putExtra("com.tencent.mm.intent.extra.FROM_CHAT_RECORDS_COPY", true);
        java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.yuanbao.version.RepairerConfigYuanBaoAppMinVerCopyChatRecords());
        if (f17 == null) {
            f17 = "";
        }
        intent2.putExtra("gVer", f17);
        java.lang.String wi6 = ((ht.w) ((jt.c0) ((jz5.n) u3Var.f363214m).getValue())).wi(context);
        java.lang.String string = context.getString(com.tencent.mm.R.string.f490358sq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Context applicationContext = context.getApplicationContext();
        if (mVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyChatRecordsFSC", "launch app via ad");
            ((wj.j0) ((xj.i) ((jz5.n) u3Var.f363212h).getValue())).bj(mVar.f454753a, new xj.n(wj.r0.f446499e, intent2, applicationContext, null, 8, null), new qg5.j3(u3Var, callback));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyChatRecordsFSC", "launch app fallback");
            ((kt.c) ((lt.i0) ((jz5.n) u3Var.f363215n).getValue())).hj(applicationContext, intent2, wi6, 0, string, new qg5.k3(u3Var, callback), null);
        }
        return f0Var;
    }
}
