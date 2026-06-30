package fm3;

/* loaded from: classes10.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.plugin.mv.ui.view.t3 data, fm3.q item) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(item, "item");
        item.f264109g = 2;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = data.f151952b;
        kotlin.jvm.internal.o.d(finderObject);
        item.f264112m = new fm3.k(finderObject);
        kotlin.jvm.internal.o.d(finderObject);
        item.f264113n = new fm3.l(finderObject);
    }

    public final fm3.q b(r45.jf2 jf2Var, ll3.h1 h1Var, java.util.List list) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        fm3.q qVar = new fm3.q();
        if (h1Var != null && h1Var.e() > 1) {
            qVar.f264106d = h1Var;
        }
        qVar.f264107e = (int) jf2Var.getLong(0);
        qVar.f264108f = (int) (jf2Var.getLong(0) + jf2Var.getInteger(1));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
            if (kotlin.jvm.internal.o.b(finderObject.getObjectNonceId(), jf2Var.getString(3)) && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.a0(media, 0)) != null) {
                if (jf2Var.getLong(2) != 0) {
                    qVar.f264112m = new fm3.k(finderObject);
                    qVar.f264113n = new fm3.l(finderObject);
                    qVar.f264109g = 2;
                } else {
                    java.lang.String url = finderMedia.getUrl();
                    if (url == null) {
                        url = "";
                    }
                    qVar.f264112m = new fm3.g("", url);
                    java.lang.String objectNonceId = finderObject.getObjectNonceId();
                    kotlin.jvm.internal.o.d(objectNonceId);
                    java.lang.String url2 = finderMedia.getUrl();
                    qVar.f264113n = new fm3.p(objectNonceId, url2 == null ? "" : url2, finderMedia.getVideoDuration() * 1000, (int) finderMedia.getWidth(), (int) finderMedia.getHeight());
                    qVar.f264109g = 1;
                }
                fm3.o oVar = qVar.f264113n;
                if (oVar != null) {
                    oVar.a(jf2Var.getLong(4));
                }
            }
        }
        return qVar;
    }

    public final void c(fm3.q item, fm3.q newItem) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(newItem, "newItem");
        newItem.f264106d = item.f264106d;
        newItem.f264107e = item.f264107e;
        newItem.f264108f = item.f264108f;
        newItem.f264110h = item.f264110h;
        newItem.f264111i = item.f264111i;
    }
}
