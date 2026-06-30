package pr;

/* loaded from: classes11.dex */
public final class b extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final int f357693m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f357694n;

    public b(int i17, int i18, java.util.List md5List) {
        kotlin.jvm.internal.o.g(md5List, "md5List");
        this.f357693m = i17;
        java.lang.String str = java.util.UUID.randomUUID().toString() + '_' + java.lang.System.currentTimeMillis();
        this.f357694n = str;
        r45.ad adVar = new r45.ad();
        r45.bd bdVar = new r45.bd();
        adVar.f369933e = i18;
        adVar.f369932d.addAll(md5List);
        adVar.f369934f = i17;
        adVar.f369936h = gm0.j1.u().c().v(z12.g.H(i17), null);
        adVar.f369937i = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = adVar;
        lVar.f70665b = bdVar;
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmbackupemojioperate";
        lVar.f70667d = 698;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        int i19 = this.f357693m;
        if (i17 == 0 && i18 == 0) {
            gm0.j1.u().c().x(z12.g.H(i19), this.f357694n);
        } else if (i18 == -2048) {
            new pr.t(i19, null, false).a();
        }
    }
}
