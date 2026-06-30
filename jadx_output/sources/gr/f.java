package gr;

/* loaded from: classes4.dex */
public final class f extends com.tencent.mm.modelbase.i {
    public f(int i17, byte[] bArr, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 4) != 0 ? false : z17;
        r45.bl3 bl3Var = new r45.bl3();
        r45.cl3 cl3Var = new r45.cl3();
        bl3Var.f370846d = i17;
        if (bArr == null) {
            bl3Var.f370847e = new r45.cu5();
        } else {
            bl3Var.f370847e = x51.j1.a(bArr);
        }
        bl3Var.f370848f = 0;
        bl3Var.f370849g = z17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = bl3Var;
        lVar.f70665b = cl3Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmgetpersonaldesigner";
        lVar.f70667d = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiGetPersonalDesigner", "CgiGetPersonalDesigner start");
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        az2.k.f16139a.a(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH);
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        return l17;
    }
}
