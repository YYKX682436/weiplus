package qg5;

/* loaded from: classes8.dex */
public final class n5 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f363097f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f363098g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f363099h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f363100i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f363101m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f363102n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f363097f = jz5.h.b(qg5.z4.f363280d);
        this.f363098g = jz5.h.b(qg5.x4.f363255d);
        this.f363099h = jz5.h.b(qg5.m5.f363084d);
        this.f363100i = jz5.h.b(qg5.l5.f363065d);
        this.f363101m = jz5.h.b(qg5.y4.f363269d);
        this.f363102n = jz5.h.b(qg5.c5.f362942d);
    }

    public static final ct.q2 T6(qg5.n5 n5Var) {
        return (ct.q2) ((jz5.n) n5Var.f363097f).getValue();
    }

    public static final ct.k3 U6(qg5.n5 n5Var) {
        return (ct.k3) ((jz5.n) n5Var.f363099h).getValue();
    }

    public static final void V6(qg5.n5 n5Var, android.content.Context context, java.lang.String str, java.lang.String str2) {
        kotlinx.coroutines.y0 b17;
        gm0.b bVar;
        n5Var.getClass();
        gm0.m b18 = gm0.j1.b();
        if (b18 == null || (bVar = b18.f273245h) == null || (b17 = bVar.f273145e) == null) {
            b17 = kotlinx.coroutines.z0.b();
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        java.lang.String c17 = com.tencent.mm.app.provider.ShareableChatRecordsProvider.f53711e.c(uuid);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoSummarizeFSC", "getFilePathChatRecords failed");
            return;
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        kotlinx.coroutines.l.d(b17, ((t26.a) g3Var).f415347h, null, new qg5.f5(context, uuid, null), 2, null);
        kotlinx.coroutines.l.d(b17, g3Var, null, new qg5.k5(n5Var, context, str2, c17, str, uuid, null), 2, null);
    }

    public final void W6(android.content.Context context, yz5.a aVar) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f363102n).getValue();
        if (!(o4Var != null ? o4Var.getBoolean("yuanbao_summarize_agreed", false) : false)) {
            new qg5.v5(context, new qg5.a5(aVar, this), new qg5.b5(this)).f363229d.C();
        } else if (aVar != null) {
            aVar.invoke();
        }
    }
}
