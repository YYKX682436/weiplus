package mq4;

/* loaded from: classes14.dex */
public class y extends mq4.e0 {
    public y(r45.xc6 xc6Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.q37();
        lVar.f70665b = new r45.r37();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipspeedtest";
        lVar.f70667d = 765;
        lVar.f70668e = 765;
        lVar.f70669f = 1000000765;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        r45.q37 q37Var = (r45.q37) a17.f70710a.f70684a;
        q37Var.f383637d = xc6Var.f389969d;
        q37Var.f383638e = xc6Var.f389970e;
        q37Var.f383639f = xc6Var.f389971f;
        q37Var.f383640g = xc6Var.f389972g;
        q37Var.f383641h = xc6Var.f389973h;
        q37Var.f383642i = xc6Var.f389974i;
        q37Var.f383643m = xc6Var.f389975m;
        q37Var.f383644n = xc6Var.f389976n;
        q37Var.f383645o = xc6Var.f389977o;
        q37Var.f383646p = xc6Var.f389978p;
        q37Var.f383647q = xc6Var.f389979q;
        q37Var.f383648r = xc6Var.f389980r;
        q37Var.f383649s = xc6Var.f389981s;
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.x(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 765;
    }
}
