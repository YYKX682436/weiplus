package tv2;

/* loaded from: classes10.dex */
public final class s implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv2.v f422327d;

    public s(tv2.v vVar) {
        this.f422327d = vVar;
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
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.util.LinkedList linkedList;
        java.lang.Object obj7;
        r45.q23 video_tmpl_info;
        r45.el2 feedBgmInfo;
        r45.el2 feedBgmInfo2;
        java.lang.Object obj8;
        r45.el2 feedBgmInfo3;
        java.lang.Object obj9;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on cdn callback someOneFailed:");
        tv2.v vVar = this.f422327d;
        sb6.append(vVar.f422338r);
        sb6.append(", mediaId = %s, startRet = %d, sceneResult %s");
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.toString()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", sb7, objArr);
        if (!vVar.f422336p && !vVar.f422338r) {
            vVar.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                java.util.Map map = vVar.f422333m;
                if (map.containsKey(str) && gVar != null) {
                    float f17 = (((float) gVar.field_finishedLength) * 1.0f) / ((float) gVar.field_toltalLength);
                    java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
                    java.lang.Object obj10 = linkedHashMap.get(str);
                    kotlin.jvm.internal.o.d(obj10);
                    if (f17 > ((java.lang.Number) obj10).floatValue()) {
                        kotlin.jvm.internal.o.d(str);
                        map.put(str, java.lang.Float.valueOf(f17));
                    }
                    float H0 = kz5.n0.H0(linkedHashMap.values()) / map.size();
                    int i18 = ((int) (45 * H0)) + 45;
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("feed ");
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = vVar.f422331h;
                    sb8.append(finderItem.getLocalId());
                    sb8.append(" updateProgress  ");
                    sb8.append(H0);
                    sb8.append(", ");
                    sb8.append(i18);
                    com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", sb8.toString());
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
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.e("LogPost.FinderUploadStage", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
                if (i17 == -21005 || tv2.v.k(vVar, str)) {
                    return 0;
                }
                ((java.util.ArrayList) vVar.f422339s).add(str != null ? str : "");
                vVar.f422338r = true;
                java.util.Iterator<T> it = vVar.f422331h.getMediaList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj9 = null;
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.mb4) next).getString(9), vVar.q(str))) {
                        obj9 = next;
                        break;
                    }
                }
                r45.mb4 mb4Var = (r45.mb4) obj9;
                if (mb4Var != null) {
                    tv2.v.m(vVar, i17, mb4Var);
                }
                vVar.r(false, true);
                tv2.v.l(vVar, new tv2.x(vVar.f422331h, 2));
                return 0;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && hVar != null) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.field_retCode), hVar.field_fileId, hVar.field_fileUrl);
                if (hVar.field_retCode != 0) {
                    if (tv2.v.k(vVar, str)) {
                        return 0;
                    }
                    ((java.util.ArrayList) vVar.f422339s).add(str != null ? str : "");
                    vVar.f422338r = true;
                    java.util.Iterator<T> it6 = vVar.f422331h.getMediaList().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj8 = null;
                            break;
                        }
                        obj8 = it6.next();
                        if (kotlin.jvm.internal.o.b(((r45.mb4) obj8).getString(9), vVar.q(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var2 = (r45.mb4) obj8;
                    if (mb4Var2 != null) {
                        tv2.v.m(vVar, hVar.field_retCode, mb4Var2);
                    }
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = vVar.f422331h.getFeedObject().getObjectDesc();
                    r45.zi2 zi2Var = (objectDesc == null || (feedBgmInfo3 = objectDesc.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo3.getCustom(0);
                    if (zi2Var != null && kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.a(zi2Var.getString(5)), vVar.q(str))) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1530L, 3L, 1L);
                    }
                    vVar.r(false, true);
                    tv2.v.l(vVar, new tv2.x(vVar.f422331h, 2));
                    return 0;
                }
                vVar.f422334n.remove(str);
                java.util.LinkedList<r45.mb4> mediaList = vVar.f422331h.getMediaList();
                int size = vVar.f422334n.size();
                com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "%s waitToUpload %d media localId:" + vVar.f422331h.getLocalId(), java.lang.Long.valueOf(vVar.f422331h.getLocalId()), java.lang.Integer.valueOf(size));
                java.util.Iterator it7 = vVar.f422337q.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it7.next();
                    if (kotlin.jvm.internal.o.b(((r45.mb4) obj).getString(9), vVar.q(str))) {
                        break;
                    }
                }
                boolean z18 = obj != null;
                java.util.Iterator<T> it8 = mediaList.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it8.next();
                    if (kotlin.jvm.internal.o.b(((r45.mb4) obj2).getString(9), vVar.q(str))) {
                        break;
                    }
                }
                r45.mb4 mb4Var3 = (r45.mb4) obj2;
                if (mb4Var3 != null) {
                    com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "hitMedia, isLongVideo:" + z18 + ", isHalf:false");
                    mb4Var3.set(9, com.tencent.mm.sdk.platformtools.w2.a(mb4Var3.getString(0)));
                    mb4Var3.set(11, hVar.field_fileUrl);
                    mb4Var3.set(12, hVar.field_thumbUrl);
                    mb4Var3.set(6, hVar.field_filemd5);
                    if (z18) {
                        mediaList.clear();
                        mediaList.add(mb4Var3);
                        vVar.f422331h.setMediaList(mediaList);
                        tv2.v.m(vVar, 0, mb4Var3);
                    } else {
                        vVar.f422331h.setMediaList(mediaList);
                        tv2.v.m(vVar, 0, mb4Var3);
                    }
                    cu2.u.f222441a.l(vVar.f422331h);
                }
                if (mb4Var3 == null) {
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = vVar.f422331h.getFeedObject().getObjectDesc();
                    r45.zi2 zi2Var2 = (objectDesc2 == null || (feedBgmInfo2 = objectDesc2.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo2.getCustom(0);
                    if (zi2Var2 != null) {
                        java.lang.String string = zi2Var2.getString(5);
                        if (string == null) {
                            string = "";
                        }
                        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string.getBytes()), vVar.q(str))) {
                            com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload audio track ok, url:" + hVar.field_fileUrl);
                            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = vVar.f422331h.getFeedObject().getObjectDesc();
                            r45.zi2 imgFeedBgmInfo = objectDesc3 != null ? objectDesc3.getImgFeedBgmInfo() : null;
                            if (imgFeedBgmInfo != null) {
                                imgFeedBgmInfo.set(5, hVar.field_fileUrl);
                            }
                            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = vVar.f422331h.getFeedObject().getObjectDesc();
                            r45.zi2 zi2Var3 = (objectDesc4 == null || (feedBgmInfo = objectDesc4.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo.getCustom(0);
                            if (zi2Var3 != null) {
                                zi2Var3.set(5, hVar.field_fileUrl);
                            }
                            cu2.u.f222441a.l(vVar.f422331h);
                        }
                    }
                    java.util.Iterator<T> it9 = mediaList.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it9.next();
                        java.lang.String string2 = ((r45.mb4) obj3).getString(41);
                        if (string2 == null) {
                            string2 = "";
                        }
                        char[] cArr2 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string2.getBytes()), vVar.q(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var4 = (r45.mb4) obj3;
                    if (mb4Var4 != null) {
                        com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload fullCover ok, url:" + hVar.field_fileUrl);
                        mb4Var4.set(40, hVar.field_fileUrl);
                        r45.mb4 mb4Var5 = (r45.mb4) kz5.n0.Z(vVar.f422337q);
                        if (mb4Var5 != null) {
                            mb4Var5.set(40, hVar.field_fileUrl);
                        }
                    }
                    java.util.Iterator<T> it10 = mediaList.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it10.next();
                        java.lang.String string3 = ((r45.mb4) obj4).getString(16);
                        if (string3 == null) {
                            string3 = "";
                        }
                        char[] cArr3 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string3.getBytes()), vVar.q(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var6 = (r45.mb4) obj4;
                    if (mb4Var6 != null) {
                        com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload cover ok, url:" + hVar.field_fileUrl);
                        mb4Var6.set(23, hVar.field_fileUrl);
                        r45.mb4 mb4Var7 = (r45.mb4) kz5.n0.Z(vVar.f422337q);
                        if (mb4Var7 != null) {
                            mb4Var7.set(23, hVar.field_fileUrl);
                        }
                    }
                    java.util.Iterator<T> it11 = mediaList.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            obj5 = null;
                            break;
                        }
                        obj5 = it11.next();
                        java.lang.String string4 = ((r45.mb4) obj5).getString(25);
                        if (string4 == null) {
                            string4 = "";
                        }
                        char[] cArr4 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string4.getBytes()), vVar.q(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var8 = (r45.mb4) obj5;
                    if (mb4Var8 != null) {
                        com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload fullThumb ok, url:" + hVar.field_fileUrl);
                        mb4Var8.set(27, hVar.field_fileUrl);
                    }
                    java.util.Iterator<T> it12 = mediaList.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            obj6 = null;
                            break;
                        }
                        obj6 = it12.next();
                        java.lang.String string5 = ((r45.mb4) obj6).getString(62);
                        if (string5 == null) {
                            string5 = "";
                        }
                        char[] cArr5 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string5.getBytes()), vVar.q(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var9 = (r45.mb4) obj6;
                    if (mb4Var9 != null) {
                        com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "upload shareCover ok, url:" + hVar.field_fileUrl);
                        mb4Var9.set(65, hVar.field_fileUrl);
                    }
                    java.lang.String str3 = hVar.field_fileUrl;
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc5 = vVar.f422331h.getFeedObject().getObjectDesc();
                    r45.iy5 iy5Var = (objectDesc5 == null || (video_tmpl_info = objectDesc5.getVideo_tmpl_info()) == null) ? null : video_tmpl_info.f383592n;
                    if (iy5Var != null && (linkedList = iy5Var.f377412d) != null) {
                        java.util.Iterator it13 = linkedList.iterator();
                        while (true) {
                            if (!it13.hasNext()) {
                                obj7 = null;
                                break;
                            }
                            obj7 = it13.next();
                            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.a((java.lang.String) obj7), vVar.q(str))) {
                                break;
                            }
                        }
                        java.lang.String str4 = (java.lang.String) obj7;
                        if (str4 != null) {
                            linkedList.set(linkedList.indexOf(str4), str3 != null ? str3 : "");
                            com.tencent.mars.xlog.Log.i("LogPost.FinderUploadStage", "handleTemplateScyThumb target:" + str4 + " to mediaId:" + str);
                        }
                    }
                    cu2.u.f222441a.l(vVar.f422331h);
                }
                if (size == 0) {
                    vVar.r(true, true);
                    tv2.v.l(vVar, new tv2.m(vVar.f422331h, vVar.f422341u));
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
