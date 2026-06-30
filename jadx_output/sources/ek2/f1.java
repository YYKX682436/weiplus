package ek2;

/* loaded from: classes.dex */
public final class f1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253446u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.e1 f253447v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.ot1 f253448w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(long j17, byte[] bArr, java.lang.String str, long j18, r45.xg7 tabType, com.tencent.mm.protobuf.g gVar, ek2.e1 callback) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(tabType, "tabType");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253446u = "Finder.CgiFinderLiveGetMusicTabList";
        this.f253447v = callback;
        r45.ot1 ot1Var = new r45.ot1();
        this.f253448w = ot1Var;
        ot1Var.set(1, db2.t4.f228171a.a(11752));
        ot1Var.set(3, java.lang.Long.valueOf(j17));
        ot1Var.set(5, com.tencent.mm.protobuf.g.b(bArr));
        ot1Var.set(2, str);
        ot1Var.set(4, java.lang.Long.valueOf(j18));
        ot1Var.set(6, gVar);
        ot1Var.set(7, java.lang.Integer.valueOf(tabType.f390089d));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ot1Var;
        r45.pt1 pt1Var = new r45.pt1();
        pt1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pt1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = pt1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetmusictablist";
        lVar.f70667d = 11752;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveGetMusicTabList init ");
        sb6.append(ot1Var.getLong(3));
        sb6.append(',');
        sb6.append(ot1Var.getString(2));
        sb6.append(",tab type:");
        sb6.append(ot1Var.getInteger(7));
        sb6.append(",liveCookies is null:");
        sb6.append(ot1Var.getByteString(5) == null);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetMusicTabList", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.pt1 resp = (r45.pt1) fVar;
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
        java.lang.String str2 = this.f253446u;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (zl2.q4.f473933a.E()) {
            java.util.LinkedList<r45.d22> list2 = resp.getList(1);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("搜索 tab:" + this.f253448w.getInteger(7) + '\n');
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
        sf2.z zVar = (sf2.z) this.f253447v;
        zVar.getClass();
        pm0.v.X(new sf2.y(i18, zVar.f407374a, i17, str, zVar.f407375b, resp, zVar.f407376c));
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
