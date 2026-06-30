package ff4;

/* loaded from: classes4.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff4.m f261693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f261694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ff4.k f261695f;

    public i(ff4.m mVar, r45.b50 b50Var, ff4.k kVar) {
        this.f261693d = mVar;
        this.f261694e = b50Var;
        this.f261695f = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.util.Iterator it;
        com.tencent.mm.protobuf.g gVar;
        r45.b50 item = this.f261694e;
        kotlin.jvm.internal.o.f(item, "$item");
        this.f261693d.getClass();
        ff4.k h17 = this.f261695f;
        kotlin.jvm.internal.o.g(h17, "h");
        try {
            r45.hf6 hf6Var = new r45.hf6();
            r45.cu5 cu5Var = item.f370531e;
            com.tencent.mm.protobuf.f parseFrom = hf6Var.parseFrom((cu5Var == null || (gVar = cu5Var.f371841f) == null) ? null : gVar.g());
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg");
            r45.hf6 hf6Var2 = (r45.hf6) parseFrom;
            r45.if6 if6Var = hf6Var2.f376122f;
            java.lang.String str = if6Var.f376996e;
            int i17 = if6Var.f377002n;
            long j17 = hf6Var2.f376120d;
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStorySync", "processStoryVisit username:" + str + " createTime:" + i17 + " id:" + j17 + " ulonglong " + pm0.v.u(j17));
            gf4.l.f271354d.c(hf6Var2);
            it = ff4.m.f261703h.iterator();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StoryCgi.NetSceneStorySync", "StorySyncMsg parse error:  " + e17.getMessage());
            z17 = false;
        }
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        h17.sendEmptyMessage(0);
        z17 = true;
        if (z17) {
            return;
        }
        h17.sendEmptyMessage(0);
    }
}
