package xv2;

/* loaded from: classes10.dex */
public final class g implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv2.j f457410d;

    public g(xv2.j jVar) {
        this.f457410d = jVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.LinkedList linkedList;
        r45.q23 video_tmpl_info;
        r45.el2 feedBgmInfo;
        r45.el2 feedBgmInfo2;
        java.lang.Object obj5;
        r45.el2 feedBgmInfo3;
        xv2.j jVar = this.f457410d;
        java.lang.String str3 = jVar.f457414i;
        java.lang.String str4 = "on cdn callback someOneFailed:" + jVar.f457421s + ", mediaId = %s, startRet = %d, sceneResult %s";
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.toString()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.tencent.mars.xlog.Log.i(str3, str4, objArr);
        if (!jVar.f457419q && !jVar.f457421s) {
            jVar.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                java.util.Map map = jVar.f457416n;
                if (map.containsKey(str) && gVar != null) {
                    float f17 = (((float) gVar.field_finishedLength) * 1.0f) / ((float) gVar.field_toltalLength);
                    java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
                    java.lang.Object obj6 = linkedHashMap.get(str);
                    kotlin.jvm.internal.o.d(obj6);
                    if (f17 > ((java.lang.Number) obj6).floatValue()) {
                        kotlin.jvm.internal.o.d(str);
                        map.put(str, java.lang.Float.valueOf(f17));
                    }
                    float H0 = kz5.n0.H0(linkedHashMap.values()) / map.size();
                    int i18 = ((int) (45 * H0)) + 45;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = jVar.f457413h;
                    sb6.append(finderItem.getLocalId());
                    sb6.append(" updateProgress  ");
                    sb6.append(H0);
                    sb6.append(", ");
                    sb6.append(i18);
                    com.tencent.mars.xlog.Log.i(jVar.f457414i, sb6.toString());
                    if (finderItem.getPostInfo().getInteger(4) < i18) {
                        finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i18));
                        cu2.u.f222441a.l(finderItem);
                    }
                    com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
                    long localId = finderItem.getLocalId();
                    am.ga gaVar = feedPostProgressEvent.f54250g;
                    gaVar.f6749a = localId;
                    gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
                    feedPostProgressEvent.e();
                }
            }
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            r7 = null;
            r45.zi2 zi2Var = null;
            r7 = null;
            r45.zi2 zi2Var2 = null;
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.e(jVar.f457414i, "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
                if (i17 == -21005 || xv2.j.k(jVar, str)) {
                    return 0;
                }
                ((java.util.ArrayList) jVar.f457422t).add(str != null ? str : "");
                jVar.f457421s = true;
                java.util.Iterator<T> it = jVar.f457413h.getMediaList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.mb4) next).getString(9), jVar.o(str))) {
                        obj8 = next;
                        break;
                    }
                }
                r45.mb4 mb4Var = (r45.mb4) obj8;
                if (mb4Var != null) {
                    xv2.j.m(jVar, i17, mb4Var);
                }
                jVar.p(false, true);
                xv2.j.l(jVar, new tv2.x(jVar.f457413h, 2));
                return 0;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && hVar != null) {
                com.tencent.mars.xlog.Log.i(jVar.f457414i, "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.field_retCode), hVar.field_fileId, hVar.field_fileUrl);
                if (hVar.field_retCode != 0) {
                    if (xv2.j.k(jVar, str)) {
                        return 0;
                    }
                    ((java.util.ArrayList) jVar.f457422t).add(str != null ? str : "");
                    jVar.f457421s = true;
                    java.util.Iterator<T> it6 = jVar.f457413h.getMediaList().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj5 = null;
                            break;
                        }
                        obj5 = it6.next();
                        if (kotlin.jvm.internal.o.b(((r45.mb4) obj5).getString(9), jVar.o(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var2 = (r45.mb4) obj5;
                    if (mb4Var2 != null) {
                        xv2.j.m(jVar, hVar.field_retCode, mb4Var2);
                    }
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = jVar.f457413h.getFeedObject().getObjectDesc();
                    if (objectDesc != null && (feedBgmInfo3 = objectDesc.getFeedBgmInfo()) != null) {
                        zi2Var = (r45.zi2) feedBgmInfo3.getCustom(0);
                    }
                    if (zi2Var != null && kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.a(zi2Var.getString(5)), jVar.o(str))) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1530L, 3L, 1L);
                    }
                    jVar.p(false, true);
                    xv2.j.l(jVar, new tv2.x(jVar.f457413h, 2));
                    return 0;
                }
                jVar.f457417o.remove(str);
                java.util.LinkedList<r45.mb4> mediaList = jVar.f457413h.getMediaList();
                int size = jVar.f457417o.size();
                com.tencent.mars.xlog.Log.i(jVar.f457414i, "%s waitToUpload %d media localId:" + jVar.f457413h.getLocalId(), java.lang.Long.valueOf(jVar.f457413h.getLocalId()), java.lang.Integer.valueOf(size));
                java.util.Iterator<T> it7 = mediaList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it7.next();
                    if (kotlin.jvm.internal.o.b(((r45.mb4) obj).getString(9), jVar.o(str))) {
                        break;
                    }
                }
                r45.mb4 mb4Var3 = (r45.mb4) obj;
                if (mb4Var3 != null) {
                    mb4Var3.set(9, com.tencent.mm.sdk.platformtools.w2.a(mb4Var3.getString(0)));
                    mb4Var3.set(11, hVar.field_fileUrl);
                    mb4Var3.set(12, hVar.field_thumbUrl);
                    mb4Var3.set(6, hVar.field_filemd5);
                    mb4Var3.set(7, java.lang.Integer.valueOf((int) hVar.field_fileLength));
                    jVar.f457413h.setMediaList(mediaList);
                    xv2.j.m(jVar, 0, mb4Var3);
                    cu2.u.f222441a.l(jVar.f457413h);
                }
                if (mb4Var3 == null) {
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = jVar.f457413h.getFeedObject().getObjectDesc();
                    r45.zi2 zi2Var3 = (objectDesc2 == null || (feedBgmInfo2 = objectDesc2.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo2.getCustom(0);
                    if (zi2Var3 != null) {
                        java.lang.String string = zi2Var3.getString(5);
                        if (string == null) {
                            string = "";
                        }
                        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string.getBytes()), jVar.o(str))) {
                            com.tencent.mars.xlog.Log.i(jVar.f457414i, "upload audio track ok, url:" + hVar.field_fileUrl);
                            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = jVar.f457413h.getFeedObject().getObjectDesc();
                            r45.zi2 imgFeedBgmInfo = objectDesc3 != null ? objectDesc3.getImgFeedBgmInfo() : null;
                            if (imgFeedBgmInfo != null) {
                                imgFeedBgmInfo.set(5, hVar.field_fileUrl);
                            }
                            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = jVar.f457413h.getFeedObject().getObjectDesc();
                            if (objectDesc4 != null && (feedBgmInfo = objectDesc4.getFeedBgmInfo()) != null) {
                                zi2Var2 = (r45.zi2) feedBgmInfo.getCustom(0);
                            }
                            if (zi2Var2 != null) {
                                zi2Var2.set(5, hVar.field_fileUrl);
                            }
                            cu2.u.f222441a.l(jVar.f457413h);
                        }
                    }
                    java.util.Iterator<T> it8 = mediaList.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it8.next();
                        java.lang.String string2 = ((r45.mb4) obj2).getString(41);
                        if (string2 == null) {
                            string2 = "";
                        }
                        char[] cArr2 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string2.getBytes()), jVar.o(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var4 = (r45.mb4) obj2;
                    if (mb4Var4 != null) {
                        com.tencent.mars.xlog.Log.i(jVar.f457414i, "upload fullCover ok, url:" + hVar.field_fileUrl);
                        mb4Var4.set(40, hVar.field_fileUrl);
                        r45.mb4 mb4Var5 = (r45.mb4) kz5.n0.Z(jVar.f457420r);
                        if (mb4Var5 != null) {
                            mb4Var5.set(40, hVar.field_fileUrl);
                        }
                    }
                    java.util.Iterator<T> it9 = mediaList.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it9.next();
                        java.lang.String string3 = ((r45.mb4) obj3).getString(16);
                        if (string3 == null) {
                            string3 = "";
                        }
                        char[] cArr3 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string3.getBytes()), jVar.o(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var6 = (r45.mb4) obj3;
                    if (mb4Var6 != null) {
                        com.tencent.mars.xlog.Log.i(jVar.f457414i, "upload cover ok, url:" + hVar.field_fileUrl);
                        mb4Var6.set(23, hVar.field_fileUrl);
                        r45.mb4 mb4Var7 = (r45.mb4) kz5.n0.Z(jVar.f457420r);
                        if (mb4Var7 != null) {
                            mb4Var7.set(23, hVar.field_fileUrl);
                        }
                    }
                    java.util.Iterator<T> it10 = mediaList.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it10.next();
                        java.lang.String string4 = ((r45.mb4) obj4).getString(25);
                        if (string4 == null) {
                            string4 = "";
                        }
                        char[] cArr4 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string4.getBytes()), jVar.o(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var8 = (r45.mb4) obj4;
                    if (mb4Var8 != null) {
                        com.tencent.mars.xlog.Log.i(jVar.f457414i, "upload fullThumb ok, url:" + hVar.field_fileUrl);
                        mb4Var8.set(27, hVar.field_fileUrl);
                    }
                    java.lang.String str5 = hVar.field_fileUrl;
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc5 = jVar.f457413h.getFeedObject().getObjectDesc();
                    r45.iy5 iy5Var = (objectDesc5 == null || (video_tmpl_info = objectDesc5.getVideo_tmpl_info()) == null) ? null : video_tmpl_info.f383592n;
                    if (iy5Var != null && (linkedList = iy5Var.f377412d) != null) {
                        java.util.Iterator it11 = linkedList.iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                break;
                            }
                            java.lang.Object next2 = it11.next();
                            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.a((java.lang.String) next2), jVar.o(str))) {
                                obj7 = next2;
                                break;
                            }
                        }
                        java.lang.String str6 = (java.lang.String) obj7;
                        if (str6 != null) {
                            linkedList.set(linkedList.indexOf(str6), str5 != null ? str5 : "");
                            com.tencent.mars.xlog.Log.i(jVar.f457414i, "handleTemplateScyThumb target:" + str6 + " to mediaId:" + str);
                        }
                    }
                    cu2.u.f222441a.l(jVar.f457413h);
                }
                if (size == 0) {
                    jVar.p(true, true);
                    xv2.j.l(jVar, new xv2.e(jVar.f457413h, jVar.f457424v));
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
