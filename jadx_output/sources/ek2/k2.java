package ek2;

/* loaded from: classes.dex */
public final class k2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253489u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.j2 f253490v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.t82 f253491w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(long j17, byte[] bArr, java.lang.String str, long j18, java.lang.String query, com.tencent.mm.protobuf.g gVar, ek2.j2 callback) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253489u = "Finder.CgiFinderLiveSearchMusicList";
        this.f253490v = callback;
        r45.t82 t82Var = new r45.t82();
        this.f253491w = t82Var;
        t82Var.set(1, db2.t4.f228171a.a(6291));
        t82Var.set(4, java.lang.Long.valueOf(j17));
        t82Var.set(3, com.tencent.mm.protobuf.g.b(bArr));
        t82Var.set(2, str);
        t82Var.set(5, java.lang.Long.valueOf(j18));
        t82Var.set(6, query);
        t82Var.set(7, gVar);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = t82Var;
        r45.u82 u82Var = new r45.u82();
        u82Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) u82Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = u82Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivesearchmusiclist";
        lVar.f70667d = 6291;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveSearchMusicList init ");
        sb6.append(t82Var.getLong(4));
        sb6.append(',');
        sb6.append(t82Var.getString(2));
        sb6.append(",query:");
        sb6.append(t82Var.getString(6));
        sb6.append(",liveCookies is null:");
        sb6.append(t82Var.getByteString(3) == null);
        sb6.append(", last_buffer:");
        sb6.append(t82Var.getByteString(7));
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveSearchMusicList", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.u82 resp = (r45.u82) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" resp size:");
        java.util.LinkedList list = resp.getList(1);
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(" continueFlag:");
        sb6.append(resp.getInteger(3));
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f253489u;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (zl2.q4.f473933a.E()) {
            java.util.LinkedList<r45.d22> list2 = resp.getList(1);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("搜索内容:" + this.f253491w.getString(6) + '\n');
            kotlin.jvm.internal.o.d(list2);
            for (r45.d22 d22Var : list2) {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(d22Var.getString(1));
                sb9.append('(');
                sb9.append(d22Var.getString(2));
                sb9.append("),url is empty:");
                java.lang.String string = d22Var.getString(7);
                sb9.append(string == null || string.length() == 0);
                sb9.append(", playable:");
                sb9.append(d22Var.getBoolean(6));
                sb9.append('\n');
                sb8.append(sb9.toString());
            }
            zl2.r4 r4Var = zl2.r4.f473950a;
            java.lang.String sb10 = sb8.toString();
            kotlin.jvm.internal.o.f(sb10, "toString(...)");
            r4Var.M2(str2, sb10);
        }
        this.f253490v.a(i17, i18, str, resp);
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
