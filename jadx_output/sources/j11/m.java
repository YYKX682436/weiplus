package j11;

/* loaded from: classes11.dex */
public class m implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f297132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nd3 f297133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j11.h f297134f;

    public m(j11.h hVar, int i17, r45.nd3 nd3Var) {
        this.f297134f = hVar;
        this.f297132d = i17;
        this.f297133e = nd3Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        if (m1Var.getType() != 182) {
            return 0;
        }
        j11.h hVar = this.f297134f;
        hVar.f297112a = false;
        int i19 = this.f297132d;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GetContactService", "tryStartNetscene onSceneEnd errType:" + i17 + " errCode:" + i18 + " getScene:" + i19 + " will retry");
            hVar.f297119h.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            return 0;
        }
        if (!((java.util.ArrayList) hVar.f297115d).isEmpty() && hVar.f297119h.e()) {
            hVar.f297119h.c(500L, 500L);
        }
        if (oVar != null) {
            j11.p pVar = new j11.p(hVar);
            pVar.f297142c = i19;
            r45.od3 od3Var = (r45.od3) oVar.f70711b.f70700a;
            pVar.f297140a = od3Var;
            r45.nd3 nd3Var = this.f297133e;
            if (nd3Var != null && od3Var != null && (linkedList = od3Var.f382170n) != null) {
                java.util.Iterator it = linkedList.iterator();
                int i27 = 0;
                while (it.hasNext()) {
                    int i28 = i27 + 1;
                    r45.eu5 eu5Var = (r45.eu5) it.next();
                    if (eu5Var != null && eu5Var.f373733d == 1) {
                        java.util.LinkedList linkedList2 = nd3Var.f381263e;
                        r45.du5 du5Var = (r45.du5) ((linkedList2 != null && linkedList2.size() > i27) ? linkedList2.get(i27) : null);
                        java.lang.String str2 = du5Var != null ? du5Var.f372756d : null;
                        com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                        errorMsgInfoStruct.f56113e = 2663L;
                        errorMsgInfoStruct.p("GetContact");
                        errorMsgInfoStruct.f56115g = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
                        errorMsgInfoStruct.f56117i = nd3Var.f381268m;
                        errorMsgInfoStruct.r(str2);
                        java.util.LinkedList linkedList3 = nd3Var.f381267i;
                        r45.du5 du5Var2 = (r45.du5) ((linkedList3 != null && linkedList3.size() > i27) ? linkedList3.get(i27) : null);
                        errorMsgInfoStruct.s(du5Var2 != null ? du5Var2.f372756d : null);
                        errorMsgInfoStruct.t((java.lang.String) hn1.e.f282449a.get(str2));
                        errorMsgInfoStruct.k();
                        com.tencent.mars.xlog.Log.e("MicroMsg.GetContactServiceHelper", "bad get contact request: scene: " + errorMsgInfoStruct.f56117i + ", username: " + errorMsgInfoStruct.f56120l + ", chatroom: " + errorMsgInfoStruct.f56121m);
                    }
                    i27 = i28;
                }
            }
            ((java.util.ArrayList) hVar.f297116e).add(pVar);
        }
        if (!((java.util.ArrayList) hVar.f297116e).isEmpty() && hVar.f297120i.e()) {
            hVar.f297120i.c(50L, 50L);
        }
        return 0;
    }
}
