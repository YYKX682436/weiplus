package kn;

/* loaded from: classes5.dex */
public class d extends com.tencent.mm.modelbase.i {
    public d(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        com.tencent.mm.sdk.platformtools.t8.G1(str3);
        r45.ta taVar = new r45.ta();
        taVar.f386226f = str;
        taVar.f386224d = str2;
        taVar.f386225e = str3;
        taVar.f386227g = new java.util.LinkedList(list);
        taVar.f386228h = j17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = taVar;
        lVar.f70665b = new r45.ua();
        lVar.f70666c = "/cgi-bin/micromsg-bin/approveaddchatroommember";
        lVar.f70667d = 774;
        p(lVar.a());
    }
}
