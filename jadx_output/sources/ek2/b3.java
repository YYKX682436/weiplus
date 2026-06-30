package ek2;

/* loaded from: classes.dex */
public final class b3 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f253419u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.f13 f253420v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(java.util.ArrayList arrayList, long j17, long j18, long j19, java.lang.String userName, ek2.a3 a3Var, int i17, kotlin.jvm.internal.i iVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f253419u = new org.json.JSONObject();
        r45.f13 f13Var = new r45.f13();
        this.f253420v = f13Var;
        f13Var.set(1, db2.t4.f228171a.b(5891, this.f16135n));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedList.add((java.lang.String) it.next());
            }
        }
        this.f253420v.set(2, linkedList);
        this.f253420v.set(4, java.lang.Long.valueOf(j18));
        this.f253420v.set(5, java.lang.Long.valueOf(j19));
        this.f253420v.set(6, userName);
        this.f253420v.set(3, java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = this.f253420v;
        r45.g13 g13Var = new r45.g13();
        g13Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) g13Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = g13Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderupdatelivesonglist";
        lVar.f70667d = 5891;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.g13 resp = (r45.g13) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderUpdateLiveSongList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253419u;
    }
}
