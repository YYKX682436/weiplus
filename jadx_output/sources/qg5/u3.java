package qg5;

/* loaded from: classes8.dex */
public final class u3 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f363210f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f363211g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f363212h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f363213i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f363214m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f363215n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f363210f = jz5.h.b(qg5.l3.f363062d);
        this.f363211g = jz5.h.b(qg5.i3.f363018d);
        this.f363212h = jz5.h.b(qg5.g3.f362991d);
        this.f363213i = jz5.h.b(qg5.t3.f363191d);
        this.f363214m = jz5.h.b(qg5.s3.f363176d);
        this.f363215n = jz5.h.b(qg5.h3.f363009d);
    }

    public static final ct.k3 T6(qg5.u3 u3Var) {
        return (ct.k3) ((jz5.n) u3Var.f363213i).getValue();
    }

    public final ct.q2 U6() {
        return (ct.q2) ((jz5.n) this.f363211g).getValue();
    }

    public final void V6(android.content.Context uiCtx, java.util.List msgList, com.tencent.mm.storage.z3 z3Var, xj.m mVar, boolean z17, boolean z18, yz5.a onDone) {
        kotlin.jvm.internal.o.g(uiCtx, "uiCtx");
        kotlin.jvm.internal.o.g(msgList, "msgList");
        kotlin.jvm.internal.o.g(onDone, "onDone");
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f363210f).getValue();
        boolean z19 = o4Var != null ? o4Var.getBoolean("yuanbao_copy_agreed", false) : false;
        qg5.n3 n3Var = new qg5.n3(this);
        if (z19) {
            W6(msgList, z3Var, uiCtx, mVar, z17, z18, onDone);
            return;
        }
        qg5.a4 a4Var = new qg5.a4(uiCtx, new qg5.m3(this, msgList, z3Var, uiCtx, mVar, z17, z18, onDone), n3Var);
        a4Var.f362910d.C();
        qg5.e3 e3Var = (qg5.e3) a4Var.a();
        ((cy1.a) e3Var.ij()).Hj("yuanbao_legal_popup", "view_exp", e3Var.nj("journey_copy"), 35480);
    }

    public final void W6(java.util.List list, com.tencent.mm.storage.z3 z3Var, android.content.Context context, xj.m mVar, boolean z17, boolean z18, yz5.a aVar) {
        gm0.b bVar;
        gm0.m b17 = gm0.j1.b();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = (b17 == null || (bVar = b17.f273245h) == null) ? null : bVar.f273145e;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        ((qg5.l0) U6()).oj(context, ac5.f.f3090a.b(context, z3Var == null ? new com.tencent.mm.storage.z3() : z3Var), z3Var, list, true);
        ct.q2 U6 = U6();
        kotlin.jvm.internal.o.f(U6, "<get-chatRecordsStagingService>(...)");
        ct.q2.k5(U6, false, 2, z17, z18, false, 16, null);
        ((qg5.l0) U6()).Zi(false);
        java.lang.String c17 = com.tencent.mm.app.provider.ShareableChatRecordsProvider.f53711e.c(uuid);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoCopyChatRecordsFSC", "getFilePathChatRecords failed");
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.ohx);
            e4Var.c();
            return;
        }
        if (lifecycleScope != null) {
            v65.i.c(lifecycleScope, null, new qg5.o3(context, uuid, null), 1, null);
        }
        if (lifecycleScope != null) {
            v65.i.c(lifecycleScope, null, new qg5.r3(lifecycleScope, context, this, mVar, aVar, c17, null), 1, null);
        }
    }
}
