package ff4;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff4.m f261687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f261688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ff4.k f261689f;

    public g(ff4.m mVar, r45.b50 b50Var, ff4.k kVar) {
        this.f261687d = mVar;
        this.f261688e = b50Var;
        this.f261689f = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.util.Iterator it;
        java.util.LinkedList linkedList;
        r45.xe6 xe6Var;
        java.util.LinkedList linkedList2;
        r45.xe6 xe6Var2;
        java.util.LinkedList linkedList3;
        r45.xe6 xe6Var3;
        com.tencent.mm.protobuf.g gVar;
        r45.b50 item = this.f261688e;
        kotlin.jvm.internal.o.f(item, "$item");
        this.f261687d.getClass();
        ff4.k h17 = this.f261689f;
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
            d0Var.e(str, j17, i17, null, true);
            nf4.j b17 = d0Var.b(str);
            r45.lf6 y07 = b17.y0();
            r45.oe6 oe6Var = y07.f379432h;
            java.lang.String str2 = (oe6Var == null || (linkedList3 = oe6Var.f382205e) == null || (xe6Var3 = (r45.xe6) kz5.n0.a0(linkedList3, 0)) == null) ? null : xe6Var3.f390025h;
            r45.oe6 oe6Var2 = y07.f379432h;
            java.lang.String str3 = (oe6Var2 == null || (linkedList2 = oe6Var2.f382205e) == null || (xe6Var2 = (r45.xe6) kz5.n0.a0(linkedList2, 0)) == null) ? null : xe6Var2.f390023f;
            r45.oe6 oe6Var3 = y07.f379432h;
            ef4.a0.f252435a.a(str, b17.field_storyID, b17.field_createTime, str2, str3, ((oe6Var3 == null || (linkedList = oe6Var3.f382205e) == null || (xe6Var = (r45.xe6) kz5.n0.a0(linkedList, 0)) == null) ? 0.0f : xe6Var.f390040z) * 1000);
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryCgi.NetSceneStorySync", "processStoryPostDel username:" + str + " createTime:" + i17 + " id:" + j17 + " lastCreateTime:" + b17.field_createTime + " lastId:" + b17.field_storyID + "   ulonglong " + pm0.v.u(j17));
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
