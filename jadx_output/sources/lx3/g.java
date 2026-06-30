package lx3;

/* loaded from: classes2.dex */
public final class g extends com.tencent.mm.modelbase.i {
    public g(java.util.LinkedList dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.dh dhVar = new r45.dh();
        dhVar.f372461d = c01.id.e();
        r45.ch chVar = new r45.ch();
        chVar.f371548d = dataList;
        dhVar.f372462e = new com.tencent.mm.protobuf.g(chVar.toByteArray());
        lVar.f70664a = dhVar;
        lVar.f70665b = new r45.eh();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchuploaduserdatalist";
        lVar.f70667d = 7181;
        p(lVar.a());
    }
}
