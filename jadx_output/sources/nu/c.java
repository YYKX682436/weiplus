package nu;

/* loaded from: classes9.dex */
public final class c extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.Object obj;
        java.lang.String j17;
        x05.i iVar;
        x05.h j18;
        s15.v j19;
        x05.i iVar2;
        x05.h j27;
        x05.i iVar3;
        x05.h j28;
        s15.v j29;
        java.lang.String k17;
        x05.i iVar4;
        x05.h j37;
        s15.v j38;
        java.lang.String k18;
        x05.i iVar5;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        v05.b k19 = cVar.k();
        boolean z17 = false;
        int type = (k19 == null || (iVar5 = (x05.i) k19.getCustom(k19.f432315e + 69)) == null) ? 0 : iVar5.getType();
        java.lang.String str = "";
        int i17 = recordDataItem.f303422d;
        if (type == 3 || type == 4 || type == 5) {
            recordDataItem.set(i17 + 2, 30);
            v05.b k27 = cVar.k();
            s15.t tVar = null;
            s15.v j39 = (k27 == null || (iVar2 = (x05.i) k27.getCustom(k27.f432315e + 69)) == null || (j27 = iVar2.j()) == null) ? null : j27.j();
            v05.b k28 = cVar.k();
            if (k28 != null && (iVar = (x05.i) k28.getCustom(k28.f432315e + 69)) != null && (j18 = iVar.j()) != null && (j19 = j18.j()) != null) {
                tVar = j19.l();
            }
            if (j39 != null && j39.n() == 7) {
                z17 = true;
            }
            if (!z17 || tVar == null) {
                if (j39 == null || (obj = j39.k()) == null) {
                    obj = "";
                }
                recordDataItem.set(i17 + 0, obj);
            } else if (r26.n0.N(tVar.j()) || (tVar.k() & 1) == 1) {
                recordDataItem.set(i17 + 0, tVar.getName());
            } else {
                java.lang.Object string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.odf, tVar.j(), tVar.getName());
                kotlin.jvm.internal.o.f(string, "getString(...)");
                recordDataItem.set(i17 + 0, string);
            }
            if (j39 != null && (j17 = j39.j()) != null) {
                str = j17;
            }
            recordDataItem.set(i17 + 1, str);
            recordDataItem.B0(j39);
        } else {
            recordDataItem.set(i17 + 2, 1);
            v05.b k29 = cVar.k();
            if (k29 != null && (iVar4 = (x05.i) k29.getCustom(k29.f432315e + 69)) != null && (j37 = iVar4.j()) != null && (j38 = j37.j()) != null && (k18 = j38.k()) != null && (!r26.n0.N(k18))) {
                z17 = true;
            }
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490589za));
                sb6.append(' ');
                v05.b k37 = cVar.k();
                if (k37 != null && (iVar3 = (x05.i) k37.getCustom(k37.f432315e + 69)) != null && (j28 = iVar3.j()) != null && (j29 = j28.j()) != null && (k17 = j29.k()) != null) {
                    str = k17;
                }
                sb6.append(str);
                recordDataItem.set(i17 + 1, sb6.toString());
            } else {
                java.lang.Object g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490589za);
                kotlin.jvm.internal.o.f(g17, "getString(...)");
                recordDataItem.set(i17 + 1, g17);
            }
        }
        return true;
    }
}
