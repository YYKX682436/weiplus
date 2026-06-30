package hr;

/* loaded from: classes9.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(int i17, int i18, java.util.List md5List, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, int i19, kotlin.jvm.internal.i iVar) {
        i18 = (i19 & 2) != 0 ? 0 : i18;
        md5List = (i19 & 4) != 0 ? kz5.p0.f313996d : md5List;
        gVar = (i19 & 8) != 0 ? null : gVar;
        gVar2 = (i19 & 16) != 0 ? null : gVar2;
        kotlin.jvm.internal.o.g(md5List, "md5List");
        r45.xe xeVar = new r45.xe();
        r45.ye yeVar = new r45.ye();
        xeVar.f390002e = i17;
        xeVar.f390003f = new java.util.LinkedList(md5List);
        xeVar.f390004g = i18;
        xeVar.f390005h = gVar;
        xeVar.f390006i = gVar2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = xeVar;
        lVar.f70665b = yeVar;
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
        lVar.f70667d = 697;
        p(lVar.a());
    }
}
