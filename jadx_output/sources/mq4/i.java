package mq4;

/* loaded from: classes14.dex */
public class i extends mq4.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f330800h;

    public i(int i17, long j17, java.lang.String str, java.lang.String str2, int i18, int i19, int i27, int i28) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.h27();
        lVar.f70665b = new r45.i27();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipcancelinvite";
        lVar.f70667d = 171;
        lVar.f70668e = 64;
        lVar.f70669f = 1000000064;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        r45.h27 h27Var = (r45.h27) a17.f70710a.f70684a;
        h27Var.f375794e = i17;
        h27Var.f375795f = j17;
        h27Var.f375796g = str;
        h27Var.f375800n = i18;
        h27Var.f375793d = c01.z1.r();
        h27Var.f375798i = i28;
        r45.s37 s37Var = new r45.s37();
        r45.du5 du5Var = new r45.du5();
        du5Var.c(str2);
        s37Var.f385485d = du5Var;
        h27Var.f375797h = s37Var;
        h27Var.f375799m = java.lang.System.currentTimeMillis();
        h27Var.f375801o = i19;
        h27Var.f375802p = i27;
        this.f330800h = i19;
    }

    @Override // mq4.e0
    public int H() {
        r45.h27 h27Var = (r45.h27) this.f330793d.f70710a.f70684a;
        return (h27Var.f375794e == 0 && h27Var.f375800n == 0) ? -1 : 0;
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.h(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 171;
    }
}
