package qg5;

/* loaded from: classes8.dex */
public final class n4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363088d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f363089e;

    /* renamed from: f, reason: collision with root package name */
    public int f363090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f363091g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363092h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f363093i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xj.m f363094m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f363095n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f363096o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, android.content.Context context, qg5.q4 q4Var, xj.m mVar, yz5.a aVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363091g = lifecycleScope;
        this.f363092h = context;
        this.f363093i = q4Var;
        this.f363094m = mVar;
        this.f363095n = aVar;
        this.f363096o = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qg5.n4(this.f363091g, this.f363092h, this.f363093i, this.f363094m, this.f363095n, this.f363096o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.n4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.f fVar;
        kotlin.jvm.internal.c0 c0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363090f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fVar = new com.tencent.mm.ui.widget.dialog.f(0L, 1, null);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            kotlinx.coroutines.r2 b17 = v65.i.b(this.f363091g, null, new qg5.m4(this.f363096o, null), 1, null);
            android.content.Context context = this.f363092h;
            fVar.b(context, context.getString(com.tencent.mm.R.string.pag), true, 0, new qg5.l4(c0Var2, b17));
            this.f363088d = fVar;
            this.f363089e = c0Var2;
            this.f363090f = 1;
            if (b17.C(this) == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (kotlin.jvm.internal.c0) this.f363089e;
            fVar = (com.tencent.mm.ui.widget.dialog.f) this.f363088d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        fVar.a();
        boolean z17 = c0Var.f310112d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "user cancelled loading");
            return f0Var;
        }
        qg5.q4 q4Var = this.f363093i;
        ((ht.w) ((jt.c0) ((jz5.n) q4Var.f363145g).getValue())).getClass();
        com.tencent.mm.pluginsdk.model.h4 h4Var = com.tencent.mm.pluginsdk.model.h4.f189337a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("content://");
        android.content.Context context2 = this.f363092h;
        sb6.append(context2.getPackageName());
        sb6.append(".app.provider.ShareableChatRecords/");
        android.net.Uri parse = android.net.Uri.parse(sb6.toString());
        if (parse == null) {
            parse = android.net.Uri.EMPTY;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.tencent.hunyuan.app.chat");
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.setType("*/*");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new java.util.ArrayList<>(kz5.b0.c(parse)));
        intent.addFlags(268435456);
        intent.addFlags(1);
        intent.addFlags(128);
        intent.addFlags(64);
        intent.putExtra("com.tencent.mm.intent.extra.FORWARD_PANEL", true);
        java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.yuanbao.version.RepairerConfigYuanBaoAppMinVerCopyChatRecords());
        if (f17 == null) {
            f17 = "";
        }
        intent.putExtra("gVer", f17);
        java.lang.String string = context2.getString(com.tencent.mm.R.string.n4l);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context2.getString(com.tencent.mm.R.string.f490358sq);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "launch yuanbao app for forward");
        xj.m mVar = this.f363094m;
        yz5.a aVar2 = this.f363095n;
        if (mVar != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("launch app via ad, aid=");
            java.lang.String str = mVar.f454753a;
            sb7.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", sb7.toString());
            ((wj.j0) ((xj.i) ((jz5.n) q4Var.f363147i).getValue())).bj(str, new xj.n(wj.r0.f446499e, intent, context2, null, 8, null), new qg5.e4(q4Var, aVar2));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "launch app fallback (no ad info)");
            q4Var.Y6();
            ((kt.c) ((lt.i0) ((jz5.n) q4Var.f363146h).getValue())).hj(context2, intent, string, 0, string2, new qg5.f4(q4Var, aVar2), null);
        }
        return f0Var;
    }
}
