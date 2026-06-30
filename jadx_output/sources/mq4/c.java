package mq4;

/* loaded from: classes14.dex */
public class c extends mq4.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f330785h = "MicroMsg.NetSceneVoipAck";

    public c(int i17, long j17, int i18, byte[] bArr, byte[] bArr2, java.lang.String str, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.z17();
        lVar.f70665b = new r45.a27();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipack";
        lVar.f70667d = 305;
        lVar.f70668e = 123;
        lVar.f70669f = 1000000123;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        r45.z17 z17Var = (r45.z17) a17.f70710a.f70684a;
        z17Var.f391610d = i17;
        z17Var.f391611e = j17;
        z17Var.f391618o = i18;
        if (i18 != 1) {
            z17Var.f391613g = 0;
            return;
        }
        z17Var.f391617n = str;
        r45.k37 k37Var = new r45.k37();
        k37Var.f378343d = 2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        k37Var.f378344e = cu5Var;
        z17Var.f391614h = k37Var;
        r45.k37 k37Var2 = new r45.k37();
        k37Var2.f378343d = 3;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(bArr2);
        k37Var2.f378344e = cu5Var2;
        z17Var.f391615i = k37Var2;
        z17Var.f391619p = java.lang.System.currentTimeMillis();
        z17Var.f391623t = this.f330796g.f176532x.getIpStack();
        z17Var.f391613g = 1;
        int Ai = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ai(2);
        vq4.d0.c("MicroMsg.NetSceneVoipAck", "simType:" + Ai + " ipstack:" + z17Var.f391623t);
        if (Ai == 0) {
            z17Var.f391620q = 0;
        } else if (Ai == 3) {
            z17Var.f391620q = 3;
        } else {
            z17Var.f391620q = Ai != 1 ? 2 : 1;
        }
        z17Var.f391621r = linkedList.size();
        z17Var.f391622s = linkedList;
        z17Var.f391624u = vq4.p0.b();
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.b(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 305;
    }
}
