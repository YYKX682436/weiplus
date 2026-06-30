package jm3;

/* loaded from: classes2.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final jm3.h1 f300322a = new jm3.h1();

    public final void a(com.tencent.mm.protocal.protobuf.FinderObject obj) {
        java.util.LinkedList list;
        java.lang.Object obj2;
        r45.m23 m23Var;
        r45.oj4 oj4Var;
        r45.rj4 rj4Var;
        java.util.LinkedList<r45.bk4> list2;
        kotlin.jvm.internal.o.g(obj, "obj");
        r45.lu0 attachmentList = obj.getAttachmentList();
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> linkedList = null;
        if (attachmentList != null && (list = attachmentList.getList(0)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((r45.ku0) obj2).getInteger(0) == 1) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            r45.ku0 ku0Var = (r45.ku0) obj2;
            if (ku0Var != null && (m23Var = (r45.m23) ku0Var.getCustom(1)) != null && (oj4Var = (r45.oj4) m23Var.getCustom(1)) != null && (rj4Var = (r45.rj4) oj4Var.getCustom(2)) != null && (list2 = rj4Var.getList(1)) != null) {
                linkedList = new java.util.LinkedList<>();
                for (r45.bk4 bk4Var : list2) {
                    kotlin.jvm.internal.o.g(bk4Var, "<this>");
                    com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = new com.tencent.mm.protocal.protobuf.FinderMedia();
                    finderMedia.setUrl(bk4Var.getString(0));
                    finderMedia.setThumbUrl(bk4Var.getString(1));
                    finderMedia.setMediaType(4);
                    finderMedia.setVideoDuration(bk4Var.getInteger(3));
                    finderMedia.setWidth(bk4Var.getFloat(4));
                    finderMedia.setHeight(bk4Var.getFloat(5));
                    finderMedia.setMd5sum(bk4Var.getString(6));
                    finderMedia.setFileSize(bk4Var.getInteger(7));
                    finderMedia.setBitrate(bk4Var.getInteger(8));
                    java.util.LinkedList<r45.vf2> spec = finderMedia.getSpec();
                    spec.clear();
                    java.util.LinkedList<r45.ck4> list3 = bk4Var.getList(15);
                    kotlin.jvm.internal.o.f(list3, "getSpec(...)");
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    for (r45.ck4 ck4Var : list3) {
                        kotlin.jvm.internal.o.g(ck4Var, "<this>");
                        r45.vf2 vf2Var = new r45.vf2();
                        vf2Var.set(0, ck4Var.getString(0));
                        vf2Var.set(1, java.lang.Integer.valueOf(ck4Var.getInteger(1)));
                        vf2Var.set(2, java.lang.Integer.valueOf(ck4Var.getInteger(2)));
                        vf2Var.set(3, ck4Var.getString(3));
                        linkedList2.add(vf2Var);
                    }
                    spec.addAll(linkedList2);
                    finderMedia.setCoverUrl(bk4Var.getString(10));
                    finderMedia.setDecodeKey(bk4Var.getString(9));
                    finderMedia.setUrl_token(bk4Var.getString(12));
                    finderMedia.setThumb_url_token(bk4Var.getString(13));
                    finderMedia.setCover_url_token(bk4Var.getString(14));
                    finderMedia.setHls_spec((r45.kb1) bk4Var.getCustom(16));
                    finderMedia.setHot_flag(bk4Var.getInteger(18));
                    finderMedia.setHalf_rect((r45.bb1) bk4Var.getCustom(19));
                    finderMedia.setFull_thumb_url(bk4Var.getString(20));
                    finderMedia.setFull_thumb_url_token(bk4Var.getString(21));
                    linkedList.add(finderMedia);
                }
            }
        }
        if (linkedList != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvLogic", "convertFinderLongVideoDuration replace success " + obj.getId());
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = obj.getObjectDesc();
            if (objectDesc == null) {
                return;
            }
            objectDesc.setMedia(linkedList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(r45.ss4 r19) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jm3.h1.b(r45.ss4):void");
    }

    public final java.lang.String c(r45.hf2 hf2Var) {
        kotlin.jvm.internal.o.g(hf2Var, "<this>");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("songId: ");
        stringBuffer.append(hf2Var.getString(5));
        stringBuffer.append("\nsongName: ");
        stringBuffer.append(hf2Var.getString(0));
        stringBuffer.append("\nsinger: ");
        stringBuffer.append(hf2Var.getString(1));
        stringBuffer.append("\nalbumName: ");
        stringBuffer.append(hf2Var.getString(7));
        stringBuffer.append("\nalbumUrl: ");
        stringBuffer.append(hf2Var.getString(8));
        stringBuffer.append("\ngenre: ");
        stringBuffer.append(hf2Var.getString(9));
        stringBuffer.append("\npublicTime: ");
        stringBuffer.append(hf2Var.getLong(11));
        stringBuffer.append("\nduration: ");
        stringBuffer.append(hf2Var.getInteger(14));
        stringBuffer.append("\ndataUrl: ");
        stringBuffer.append(hf2Var.getString(2));
        stringBuffer.append("\nwebUrl: ");
        stringBuffer.append(hf2Var.getString(4));
        stringBuffer.append("\nsongLyric: ");
        stringBuffer.append(hf2Var.getString(6));
        stringBuffer.append("\n");
        return "FinderMVSongInfo " + ((java.lang.Object) stringBuffer);
    }
}
