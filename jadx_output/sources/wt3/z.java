package wt3;

/* loaded from: classes5.dex */
public final class z extends com.tencent.mm.modelbase.i {
    public z(long j17, java.lang.String query, int i17, long j18, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        j18 = (i27 & 8) != 0 ? 0L : j18;
        i18 = (i27 & 16) != 0 ? 10 : i18;
        kotlin.jvm.internal.o.g(query, "query");
        r45.lh lhVar = new r45.lh();
        r45.mh mhVar = new r45.mh();
        mhVar.setBaseResponse(new r45.ie());
        mhVar.getBaseResponse().f376960e = new r45.du5();
        lhVar.f379467e = j17;
        lhVar.f379468f = query;
        lhVar.f379469g = i17;
        lhVar.f379470h = i18;
        lhVar.f379471i = j18;
        lhVar.f379472m = i19;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = lhVar;
        lVar.f70665b = mhVar;
        lVar.f70666c = "/cgi-bin/micromsg-bin/sprbgmsearch";
        lVar.f70667d = 3645;
        p(lVar.a());
    }
}
