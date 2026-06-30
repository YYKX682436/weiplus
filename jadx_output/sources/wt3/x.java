package wt3;

/* loaded from: classes4.dex */
public final class x extends com.tencent.mm.modelbase.i {
    public x(int i17, int i18, com.tencent.mm.protobuf.g gVar, long j17, long j18, com.tencent.mm.protobuf.g gVar2, java.util.List list, java.lang.String str, int i19, kotlin.jvm.internal.i iVar) {
        gVar = (i19 & 4) != 0 ? null : gVar;
        j17 = (i19 & 8) != 0 ? 0L : j17;
        j18 = (i19 & 16) != 0 ? 0L : j18;
        gVar2 = (i19 & 32) != 0 ? null : gVar2;
        list = (i19 & 64) != 0 ? null : list;
        str = (i19 & 128) != 0 ? null : str;
        r45.vg4 vg4Var = new r45.vg4();
        r45.wg4 wg4Var = new r45.wg4();
        wg4Var.setBaseResponse(new r45.ie());
        wg4Var.getBaseResponse().f376960e = new r45.du5();
        vg4Var.f388201d = i17;
        vg4Var.f388202e = i18;
        vg4Var.f388203f = gVar;
        vg4Var.f388207m = j17;
        vg4Var.f388208n = j18;
        vg4Var.f388209o = gVar2;
        if (list != null && (!list.isEmpty())) {
            vg4Var.f388210p.addAll(list);
        }
        vg4Var.f388211q = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = vg4Var;
        lVar.f70665b = wg4Var;
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/listenvideobgmlist";
        lVar.f70667d = 4404;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiGetLikedListenVideoBgmList", "type:" + i17 + " count" + i18 + " forRecommendExtraInfo:" + str);
    }
}
