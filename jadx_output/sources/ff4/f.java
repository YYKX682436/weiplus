package ff4;

/* loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff4.m f261684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f261685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ff4.k f261686f;

    public f(ff4.m mVar, r45.b50 b50Var, ff4.k kVar) {
        this.f261684d = mVar;
        this.f261685e = b50Var;
        this.f261686f = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.util.Iterator it;
        com.tencent.mm.protobuf.g gVar;
        r45.b50 item = this.f261685e;
        kotlin.jvm.internal.o.f(item, "$item");
        this.f261684d.getClass();
        ff4.k h17 = this.f261686f;
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
            ef4.d0 d0Var = ef4.e0.f252441a;
            kotlin.jvm.internal.o.d(str);
            nf4.j e17 = d0Var.e(str, j17, i17, hf6Var2.f376122f.f377007s, false);
            ef4.a0.f252435a.b(str, e17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processStoryPost username:");
            sb6.append(hf6Var2.f376122f.f376996e);
            sb6.append(" createTime:");
            sb6.append(hf6Var2.f376122f.f377002n);
            sb6.append(" id:");
            sb6.append(hf6Var2.f376120d);
            sb6.append(" scope:");
            sb6.append(e17 != null ? java.lang.Integer.valueOf(e17.y0().f379435n) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStorySync", sb6.toString());
            it = ff4.m.f261703h.iterator();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StoryCgi.NetSceneStorySync", "StorySyncMsg parse error!");
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
