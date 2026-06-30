package ke5;

/* loaded from: classes9.dex */
public final class o implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final he5.f f307110a;

    /* renamed from: b, reason: collision with root package name */
    public final hd5.n f307111b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f307112c;

    /* renamed from: d, reason: collision with root package name */
    public final hd5.q f307113d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f307114e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f307115f;

    public o(yb5.d chattingContext, he5.f coreDataSource, hd5.n action, android.os.Bundle bundle, hd5.q qVar, boolean z17) {
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(coreDataSource, "coreDataSource");
        kotlin.jvm.internal.o.g(action, "action");
        this.f307110a = coreDataSource;
        this.f307111b = action;
        this.f307112c = bundle;
        this.f307113d = qVar;
        this.f307114e = z17;
        chattingContext.x();
    }

    @Override // he5.t
    public int a() {
        he5.f fVar = this.f307110a;
        long a17 = fVar.a();
        fVar.f280927e.getClass();
        java.lang.String talker = fVar.f280923a;
        kotlin.jvm.internal.o.g(talker, "talker");
        yb5.d chattingContext = fVar.f280925c;
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        if (!c01.s0.c()) {
            return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(talker);
        }
        int j76 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(talker);
        com.tencent.mm.ui.chatting.manager.c cVar = chattingContext.f460708c;
        ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).getClass();
        int b17 = yq1.u0.Ai().b1(talker, a17);
        ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).getClass();
        er1.b Ai = yq1.u0.Ai();
        Ai.getClass();
        java.lang.String y07 = Ai.y0(true);
        if (y07 == null) {
            y07 = "talker = ?";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.sdk.platformtools.t8.n(talker);
        arrayList.add(talker);
        if (a17 > 0) {
            y07 = y07.concat(" AND createTime > ?");
            arrayList.add(java.lang.String.valueOf(a17));
        }
        int i17 = 0;
        try {
            android.database.Cursor B = Ai.f256007d.B("SELECT COUNT(*) FROM BizContactConversationMassSend WHERE " + y07, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
            if (B != null) {
                try {
                    int i18 = B.moveToFirst() ? B.getInt(0) : 0;
                    vz5.b.a(B, null);
                    i17 = i18;
                } finally {
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizContactConversationMassSendStorage", "getFilteredMessageCount error: " + e17.getMessage());
        }
        int i19 = (j76 - b17) + i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizContactMsgDataRepo", "getTotalCount: oldTableTotalCount=" + j76 + ", newTableTotalCount=" + b17 + ", newTableFilteredCount=" + i17 + ", totalCount=" + i19);
        return i19;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s success) {
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(success, "success");
        sd5.p.a("fillItem", new ke5.n(this, list));
        ((hd5.f) success).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        if (oVar != null) {
            oVar.next();
        }
    }

    @Override // he5.t
    public void close() {
    }

    @Override // he5.t
    public long d() {
        return this.f307110a.a();
    }
}
