package fm3;

/* loaded from: classes10.dex */
public final class t {
    public t(kotlin.jvm.internal.i iVar) {
    }

    public final fm3.u a(r45.ss4 data) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        kotlin.jvm.internal.o.g(data, "data");
        fm3.u uVar = new fm3.u();
        uVar.f264121a = java.lang.Long.valueOf(data.getLong(4));
        uVar.f264122b = data.getString(2);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) data.getCustom(0);
        java.lang.String nickname = (finderObject == null || (contact = finderObject.getContact()) == null) ? null : contact.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        uVar.f264126f = nickname;
        java.util.LinkedList list3 = data.getList(1);
        kotlin.jvm.internal.o.f(list3, "getRefObjectList(...)");
        uVar.f264135o = list3;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) data.getCustom(0);
        r45.ef2 mvInfo = (finderObject2 == null || (objectDesc = finderObject2.getObjectDesc()) == null) ? null : objectDesc.getMvInfo();
        if (mvInfo != null && (list2 = mvInfo.getList(0)) != null) {
            uVar.f264127g.addAll(list2);
        }
        if (mvInfo != null && (list = mvInfo.getList(5)) != null) {
            uVar.f264128h.addAll(list);
        }
        uVar.f264129i = mvInfo != null ? (r45.gf2) mvInfo.getCustom(2) : null;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) data.getCustom(0);
        uVar.f264130j = finderObject3 != null ? finderObject3.getContact() : null;
        uVar.f264137q = (com.tencent.mm.protocal.protobuf.FinderObject) data.getCustom(0);
        uVar.f264145y = mvInfo != null ? mvInfo.getInteger(6) : 0;
        return uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        if (r10 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0131, code lost:
    
        r10 = r11.f264128h.iterator();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013c, code lost:
    
        if (r10.hasNext() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013e, code lost:
    
        r4 = r10.next();
        r5 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        if (r0 < 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0146, code lost:
    
        r4 = (r45.jf2) r4;
        r6 = new r45.jf2();
        r6.set(1, java.lang.Integer.valueOf(r4.getInteger(1)));
        r6.set(0, java.lang.Long.valueOf(r4.getLong(0)));
        r6.set(4, 0L);
        r11.f264128h.set(r0, r6);
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0174, code lost:
    
        kz5.c0.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0177, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.tencent.mm.protocal.protobuf.FinderObject r10, fm3.u r11) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fm3.t.b(com.tencent.mm.protocal.protobuf.FinderObject, fm3.u):void");
    }

    public final void c(r45.ss4 trackData, yz5.l callback) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.ef2 mvInfo;
        java.util.LinkedList list;
        r45.jf2 jf2Var;
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        java.lang.Object next;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3;
        r45.ef2 mvInfo2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4;
        kotlin.jvm.internal.o.g(trackData, "trackData");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) trackData.getCustom(0);
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = null;
        r45.ef2 mvInfo3 = (finderObject == null || (objectDesc4 = finderObject.getObjectDesc()) == null) ? null : objectDesc4.getMvInfo();
        java.util.LinkedList list2 = trackData.getList(1);
        if (mvInfo3 != null && mvInfo3.getInteger(6) == 1) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) trackData.getCustom(0);
            if (finderObject2 != null && (objectDesc3 = finderObject2.getObjectDesc()) != null && (mvInfo2 = objectDesc3.getMvInfo()) != null) {
                list = mvInfo2.getList(5);
            }
            list = null;
        } else {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) trackData.getCustom(0);
            if (finderObject3 != null && (objectDesc = finderObject3.getObjectDesc()) != null && (mvInfo = objectDesc.getMvInfo()) != null) {
                list = mvInfo.getList(0);
            }
            list = null;
        }
        if (list != null) {
            java.util.Iterator it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long j17 = ((r45.jf2) next).getLong(0);
                    do {
                        java.lang.Object next2 = it.next();
                        long j18 = ((r45.jf2) next2).getLong(0);
                        if (j17 > j18) {
                            next = next2;
                            j17 = j18;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            jf2Var = (r45.jf2) next;
        } else {
            jf2Var = null;
        }
        if (jf2Var == null) {
            callback.invoke(java.lang.Boolean.FALSE);
            return;
        }
        kotlin.jvm.internal.o.d(list2);
        java.util.Iterator it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            }
            obj = it6.next();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
            if (jf2Var.getLong(2) != 0 ? jf2Var.getLong(2) == finderObject4.getId() : kotlin.jvm.internal.o.b(jf2Var.getString(3), finderObject4.getObjectNonceId())) {
                break;
            }
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject5 = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        if (finderObject5 != null && (objectDesc2 = finderObject5.getObjectDesc()) != null && (media = objectDesc2.getMedia()) != null) {
            finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
        }
        if (finderMedia == null) {
            callback.invoke(java.lang.Boolean.FALSE);
            return;
        }
        java.lang.String e17 = com.tencent.mm.plugin.finder.assist.e9.f102132a.e("music_mv_cover_" + trackData.getLong(4) + '_' + com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.valueOf(android.os.SystemClock.elapsedRealtime())));
        if (com.tencent.mm.vfs.w6.j(trackData.getString(2))) {
            com.tencent.mm.vfs.w6.c(trackData.getString(2), e17);
            trackData.set(2, e17);
        }
        if (jf2Var.getLong(2) == 0) {
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(finderMedia.getUrl(), false);
            if (i17 == null) {
                i17 = "";
            }
            rm5.h a17 = rm5.h.f397489h.a(new rm5.j(i17, finderMedia.getMediaType() != 2 ? 2 : 1));
            a17.setSize(300, 300);
            a17.a(kz5.b0.c(0L), new fm3.s(e17, trackData, callback));
            return;
        }
        java.lang.String str = finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
        o11.f fVar = new o11.f();
        fVar.f342082f = e17;
        fVar.f342078b = true;
        fVar.f342077a = false;
        n11.a.b().d(str, fVar.a(), new fm3.r(trackData, e17, callback));
    }

    public final com.tencent.mm.protocal.protobuf.FinderObject d(fm3.u musicMv) {
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = musicMv.f264137q;
        if (finderObject != null) {
            if (!(finderObject.getId() != 0)) {
                finderObject = null;
            }
            if (finderObject != null) {
                return finderObject;
            }
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = musicMv.f264140t;
        if (finderObject2 == null) {
            return null;
        }
        if (finderObject2.getId() != 0) {
            return finderObject2;
        }
        return null;
    }

    public final boolean e(fm3.u musicMv) {
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        return d(musicMv) != null;
    }
}
