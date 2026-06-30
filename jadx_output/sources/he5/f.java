package he5;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f280923a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f280924b;

    /* renamed from: c, reason: collision with root package name */
    public final yb5.d f280925c;

    /* renamed from: d, reason: collision with root package name */
    public final he5.u f280926d;

    /* renamed from: e, reason: collision with root package name */
    public final je5.b f280927e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f280928f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f280929g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f280930h;

    public f(java.lang.String talkUsername, yz5.a deleteCreateTimeGetter, yb5.d chattingContext, yz5.l lVar) {
        kotlin.jvm.internal.o.g(talkUsername, "talkUsername");
        kotlin.jvm.internal.o.g(deleteCreateTimeGetter, "deleteCreateTimeGetter");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        he5.u uVar = he5.u.f280982c;
        he5.u uVar2 = he5.u.f280982c;
        this.f280923a = talkUsername;
        this.f280924b = deleteCreateTimeGetter;
        this.f280925c = chattingContext;
        this.f280926d = uVar2;
        je5.b bVar = new je5.b();
        this.f280927e = bVar;
        if (lVar != null) {
            synchronized (bVar) {
                if (bVar.f299322b) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizContactMsgDataRepo", "MassSend listener already registered");
                } else {
                    bVar.f299322b = true;
                    bVar.f299321a = new je5.a(lVar);
                    sb5.f fVar = (sb5.f) chattingContext.f460708c.a(sb5.f.class);
                    yq1.t0 t0Var = bVar.f299321a;
                    ((com.tencent.mm.ui.chatting.component.biz.a) fVar).getClass();
                    java.util.List list = yq1.u0.f464473r;
                    if (list != null && t0Var != null && !((java.util.ArrayList) list).contains(t0Var)) {
                        ((java.util.ArrayList) yq1.u0.f464473r).add(t0Var);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizContactMsgDataRepo", "MassSend listener registered successfully");
                }
            }
        }
        lr1.e.f320652b = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(talkUsername);
        this.f280928f = new java.util.ArrayList();
    }

    public final long a() {
        return ((java.lang.Number) this.f280924b.invoke()).longValue();
    }

    public final long b() {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.util.List list = this.f280928f;
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) kz5.n0.a0(list, kz5.c0.h(list));
            m521constructorimpl = kotlin.Result.m521constructorimpl(f9Var != null ? java.lang.Long.valueOf(f9Var.T1()) : null);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Long l17 = (java.lang.Long) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
        return l17 != null ? l17.longValue() : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
    }

    public final java.util.List c() {
        com.tencent.mm.storage.f9 D5;
        this.f280926d.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f280928f;
        arrayList.clear();
        this.f280930h = false;
        long a17 = a();
        je5.b bVar = this.f280927e;
        bVar.getClass();
        java.lang.String talker = this.f280923a;
        kotlin.jvm.internal.o.g(talker, "talker");
        yb5.d chattingContext = this.f280925c;
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) chattingContext.f460708c.a(sb5.f.class))).getClass();
        long j17 = 0;
        if (yq1.u0.Ai().b1(talker, a17) == 0 && lr1.e.f320653c > 0 && (D5 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D5(talker, lr1.e.f320653c - 1)) != null) {
            j17 = D5.T1();
        }
        arrayList.addAll(bVar.e(talker, 16, a17, j17, chattingContext));
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new he5.a());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmMsgDataSource", "initData1: " + arrayList.size());
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:9|(2:11|(12:15|16|17|18|(1:20)(1:33)|21|22|(1:24)|25|(1:27)(1:31)|28|(1:30)))|36|16|17|18|(0)(0)|21|22|(0)|25|(0)(0)|28|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        r3 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:18:0x0088, B:20:0x0092, B:21:0x009c), top: B:17:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: he5.f.d(boolean, boolean):java.util.List");
    }
}
