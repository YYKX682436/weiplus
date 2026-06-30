package vi0;

/* loaded from: classes10.dex */
public abstract class j {
    public static final com.tencent.mm.flutter.plugin.proto.b a(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.el2 feedBgmInfo;
        r45.zi2 zi2Var;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        com.tencent.mm.flutter.plugin.proto.b bVar = new com.tencent.mm.flutter.plugin.proto.b();
        bVar.f67933d = finderObject.getCreatetime() * 1000;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        java.lang.String str = null;
        bVar.f67937h = objectDesc != null ? objectDesc.getDescription() : null;
        bVar.f67934e = finderObject.getId();
        bVar.f67935f = finderObject.getObjectNonceId();
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
        bVar.f67936g = objectDesc2 != null ? b(objectDesc2.getMediaType()) : 0;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderObject.getObjectDesc();
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media = objectDesc3 != null ? objectDesc3.getMedia() : null;
        if (media != null) {
            for (com.tencent.mm.protocal.protobuf.FinderMedia finderMedia : media) {
                com.tencent.mm.flutter.plugin.proto.c cVar = new com.tencent.mm.flutter.plugin.proto.c();
                cVar.f67948e = finderMedia.getUrl();
                cVar.f67949f = finderMedia.getUrl_token();
                cVar.f67950g = finderMedia.getThumbUrl();
                cVar.f67951h = finderMedia.getThumb_url_token();
                cVar.f67952i = finderMedia.getDecodeKey();
                cVar.f67947d = b(finderMedia.getMediaType());
                bVar.f67938i.add(cVar);
            }
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = finderObject.getObjectDesc();
        r45.ze2 location = objectDesc4 != null ? objectDesc4.getLocation() : null;
        if (location != null) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            java.lang.String string = location.getString(2);
            java.lang.String string2 = location.getString(3);
            ((c61.l7) b6Var).getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.N0(string, string2)) {
                string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f491898el5, string, string2);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                string = !com.tencent.mm.sdk.platformtools.t8.K0(string2) ? string2 : "";
            }
            bVar.f67939m = string;
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc5 = finderObject.getObjectDesc();
        if (objectDesc5 != null && (feedBgmInfo = objectDesc5.getFeedBgmInfo()) != null && (zi2Var = (r45.zi2) feedBgmInfo.getCustom(0)) != null) {
            str = zi2Var.getString(5);
        }
        bVar.f67940n = str;
        return bVar;
    }

    public static final int b(int i17) {
        if (i17 == 2) {
            vi0.a[] aVarArr = vi0.a.f437247d;
            return 0;
        }
        if (i17 == 4) {
            vi0.a[] aVarArr2 = vi0.a.f437247d;
            return 1;
        }
        if (i17 == 9) {
            vi0.a[] aVarArr3 = vi0.a.f437247d;
            return 2;
        }
        throw new java.lang.IllegalArgumentException("Unsupported type: " + i17);
    }
}
