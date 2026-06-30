package defpackage;

/* loaded from: classes10.dex */
public final class y extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final defpackage.x f458297f = new defpackage.x(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f458298g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f458299h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f458300i;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f458301d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f458302e;

    static {
        l75.e0 e0Var = jv2.b.L;
        f458298g = new java.lang.String[]{l75.n0.getCreateSQLs(jv2.b.L, "UniAction")};
        f458299h = "UniAction";
        java.lang.String[] INDEX_CREATE = dm.mb.f238571u;
        kotlin.jvm.internal.o.f(INDEX_CREATE, "INDEX_CREATE");
        java.util.List C0 = kz5.z.C0(INDEX_CREATE);
        java.util.ArrayList arrayList = (java.util.ArrayList) C0;
        arrayList.add("CREATE INDEX IF NOT EXISTS " + jv2.b.M + " ON UniAction ( actionType,state,postTime )");
        arrayList.add("CREATE INDEX IF NOT EXISTS " + jv2.b.N + " ON UniAction (actionType,feedId, postTime)");
        f458300i = (java.lang.String[]) C0.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(l75.k0 db6) {
        super(db6, jv2.b.L, "UniAction", f458300i);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = jv2.b.L;
        this.f458301d = db6;
        this.f458302e = "SELECT * FROM UniAction";
    }

    public final boolean D0(long j17, jv2.a comment, boolean z17) {
        kotlin.jvm.internal.o.g(comment, "comment");
        android.content.ContentValues convertTo = comment.convertTo();
        convertTo.remove("rowid");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z18 = this.f458301d.p("UniAction", convertTo, "localCommentId=?", new java.lang.String[]{sb6.toString()}) > 0;
        if (z17) {
            y0(comment.field_feedId, comment.t0(), comment.field_localCommentId, 3, comment);
        }
        return z18;
    }

    public final void y0(long j17, long j18, long j19, int i17, jv2.a aVar) {
        com.tencent.mm.autogen.events.UniCommentChangeEvent uniCommentChangeEvent = new com.tencent.mm.autogen.events.UniCommentChangeEvent();
        am.oz ozVar = uniCommentChangeEvent.f54909g;
        ozVar.f7585a = j17;
        ozVar.getClass();
        ozVar.getClass();
        ozVar.f7586b = i17;
        ozVar.f7587c = aVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusActionStorage", "postEvent, feedId:" + j17 + ", commentId:" + j18 + ", localId:" + j19 + ", opType:" + i17);
        uniCommentChangeEvent.e();
    }

    public final boolean z0(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z17 = this.f458301d.delete("UniAction", "localCommentId=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusActionStorage", "removeUnsentComment " + j17 + " ret:" + z17);
        return z17;
    }
}
