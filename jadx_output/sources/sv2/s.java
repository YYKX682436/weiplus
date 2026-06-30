package sv2;

/* loaded from: classes10.dex */
public final class s implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv2.v f413351d;

    public s(sv2.v vVar) {
        this.f413351d = vVar;
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
        r45.el2 feedBgmInfo;
        r45.el2 feedBgmInfo2;
        r45.el2 feedBgmInfo3;
        r45.el2 feedBgmInfo4;
        java.lang.Object obj7;
        r45.el2 feedBgmInfo5;
        java.lang.Object obj8;
        sv2.v vVar = this.f413351d;
        java.lang.String str3 = vVar.f413355i;
        java.lang.String str4 = "on cdn callback someOneFailed:" + vVar.f413363t + ", mediaId = %s, startRet = %d, sceneResult %s";
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.toString()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.tencent.mars.xlog.Log.i(str3, str4, objArr);
        if (!vVar.f413361r && !vVar.f413363t) {
            vVar.getClass();
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            cu2.o oVar = cu2.o.f222430a;
            if (!K0) {
                java.util.Map map = vVar.f413358o;
                if (map.containsKey(str) && gVar != null) {
                    float f17 = (((float) gVar.field_finishedLength) * 1.0f) / ((float) gVar.field_toltalLength);
                    java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
                    java.lang.Object obj9 = linkedHashMap.get(str);
                    kotlin.jvm.internal.o.d(obj9);
                    if (f17 > ((java.lang.Number) obj9).floatValue()) {
                        kotlin.jvm.internal.o.d(str);
                        map.put(str, java.lang.Float.valueOf(f17));
                    }
                    float H0 = kz5.n0.H0(linkedHashMap.values()) / map.size();
                    int i18 = ((int) (45 * H0)) + 45;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
                    com.tencent.mm.plugin.finder.storage.x80 x80Var = vVar.f413354h;
                    sb6.append(x80Var.field_localId);
                    sb6.append(" updateProgress  ");
                    sb6.append(H0);
                    sb6.append(", ");
                    sb6.append(i18);
                    com.tencent.mars.xlog.Log.i(vVar.f413355i, sb6.toString());
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = vVar.f413356m;
                    if (finderItem.getPostInfo().getInteger(4) < i18) {
                        finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i18));
                        oVar.b(x80Var);
                    }
                    com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
                    long j17 = x80Var.field_localId;
                    am.ga gaVar = feedPostProgressEvent.f54250g;
                    gaVar.f6749a = j17;
                    gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
                    feedPostProgressEvent.e();
                }
            }
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.e(vVar.f413355i, "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
                if (i17 != -21005) {
                    ((java.util.ArrayList) vVar.f413364u).add(str != null ? str : "");
                    vVar.f413363t = true;
                    java.util.Iterator<T> it = vVar.f413356m.getMediaList().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj8 = null;
                            break;
                        }
                        obj8 = it.next();
                        if (kotlin.jvm.internal.o.b(((r45.mb4) obj8).getString(9), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var = (r45.mb4) obj8;
                    if (mb4Var != null) {
                        sv2.v.m(vVar, i17, mb4Var);
                    }
                    sv2.v.q(vVar, false, false, 2, null);
                    sv2.v.l(vVar, new sv2.c(vVar.f413354h, 2));
                }
                return 0;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && hVar != null) {
                com.tencent.mars.xlog.Log.i(vVar.f413355i, "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.field_retCode), hVar.field_fileId, hVar.field_fileUrl);
                if (hVar.field_retCode != 0) {
                    ((java.util.ArrayList) vVar.f413364u).add(str != null ? str : "");
                    vVar.f413363t = true;
                    java.util.Iterator<T> it6 = vVar.f413356m.getMediaList().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj7 = null;
                            break;
                        }
                        obj7 = it6.next();
                        if (kotlin.jvm.internal.o.b(((r45.mb4) obj7).getString(9), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var2 = (r45.mb4) obj7;
                    if (mb4Var2 != null) {
                        sv2.v.m(vVar, hVar.field_retCode, mb4Var2);
                    }
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = vVar.f413356m.getFeedObject().getObjectDesc();
                    r45.zi2 zi2Var = (objectDesc == null || (feedBgmInfo5 = objectDesc.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo5.getCustom(0);
                    if (zi2Var != null && kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.a(zi2Var.getString(5)), sv2.v.k(vVar, str))) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1530L, 3L, 1L);
                    }
                    sv2.v.q(vVar, false, false, 2, null);
                    sv2.v.l(vVar, new sv2.c(vVar.f413354h, 2));
                    return 0;
                }
                vVar.f413359p.remove(str);
                java.util.LinkedList<r45.mb4> mediaList = vVar.f413356m.getMediaList();
                int size = vVar.f413359p.size();
                com.tencent.mars.xlog.Log.i(vVar.f413355i, "%s waitToUpload %d media localId:" + vVar.f413354h.field_localId, java.lang.Long.valueOf(vVar.f413354h.field_localId), java.lang.Integer.valueOf(size));
                java.util.Iterator it7 = vVar.f413362s.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it7.next();
                    if (kotlin.jvm.internal.o.b(((r45.mb4) obj).getString(9), sv2.v.k(vVar, str))) {
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
                    if (kotlin.jvm.internal.o.b(((r45.mb4) obj2).getString(9), sv2.v.k(vVar, str))) {
                        break;
                    }
                }
                r45.mb4 mb4Var3 = (r45.mb4) obj2;
                if (mb4Var3 != null) {
                    com.tencent.mars.xlog.Log.i(vVar.f413355i, "hitMedia, isLongVideo:" + z18 + ", isHalf:false");
                    mb4Var3.set(9, com.tencent.mm.sdk.platformtools.w2.a(mb4Var3.getString(0)));
                    mb4Var3.set(11, hVar.field_fileUrl);
                    mb4Var3.set(12, hVar.field_thumbUrl);
                    mb4Var3.set(6, hVar.field_filemd5);
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = vVar.f413356m;
                    if (z18) {
                        mediaList.clear();
                        mediaList.add(mb4Var3);
                        finderItem2.setMediaList(mediaList);
                        sv2.v.m(vVar, 0, mb4Var3);
                    } else {
                        finderItem2.setMediaList(mediaList);
                        sv2.v.m(vVar, 0, mb4Var3);
                    }
                    oVar.b(vVar.f413354h);
                }
                if (mb4Var3 == null) {
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = vVar.f413356m.getFeedObject().getObjectDesc();
                    r45.zi2 zi2Var2 = (objectDesc2 == null || (feedBgmInfo4 = objectDesc2.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo4.getCustom(0);
                    if (zi2Var2 != null) {
                        java.lang.String string = zi2Var2.getString(5);
                        if (string == null) {
                            string = "";
                        }
                        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string.getBytes()), sv2.v.k(vVar, str))) {
                            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = vVar.f413356m.getFeedObject().getObjectDesc();
                            r45.zi2 zi2Var3 = (objectDesc3 == null || (feedBgmInfo3 = objectDesc3.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo3.getCustom(0);
                            if (zi2Var3 != null) {
                                zi2Var3.set(5, hVar.field_fileUrl);
                            }
                            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = vVar.f413356m.getFeedObject().getObjectDesc();
                            r45.zi2 zi2Var4 = (objectDesc4 == null || (feedBgmInfo2 = objectDesc4.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo2.getCustom(0);
                            if (zi2Var4 != null) {
                                zi2Var4.set(0, "");
                            }
                            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc5 = vVar.f413356m.getFeedObject().getObjectDesc();
                            r45.zi2 zi2Var5 = (objectDesc5 == null || (feedBgmInfo = objectDesc5.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo.getCustom(0);
                            if (zi2Var5 != null) {
                                zi2Var5.set(2, "");
                            }
                            oVar.b(vVar.f413354h);
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
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string2.getBytes()), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var4 = (r45.mb4) obj3;
                    if (mb4Var4 != null) {
                        com.tencent.mars.xlog.Log.i(vVar.f413355i, "upload fullCover ok, url:" + hVar.field_fileUrl);
                        mb4Var4.set(40, hVar.field_fileUrl);
                        r45.mb4 mb4Var5 = (r45.mb4) kz5.n0.Z(vVar.f413362s);
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
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string3.getBytes()), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var6 = (r45.mb4) obj4;
                    if (mb4Var6 != null) {
                        com.tencent.mars.xlog.Log.i(vVar.f413355i, "upload cover ok, url:" + hVar.field_fileUrl);
                        mb4Var6.set(23, hVar.field_fileUrl);
                        r45.mb4 mb4Var7 = (r45.mb4) kz5.n0.Z(vVar.f413362s);
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
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string4.getBytes()), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var8 = (r45.mb4) obj5;
                    if (mb4Var8 != null) {
                        com.tencent.mars.xlog.Log.i(vVar.f413355i, "upload fullThumb ok, url:" + hVar.field_fileUrl);
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
                        if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string5.getBytes()), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var9 = (r45.mb4) obj6;
                    if (mb4Var9 != null) {
                        com.tencent.mars.xlog.Log.i(vVar.f413355i, "upload fullThumb ok, url:" + hVar.field_fileUrl);
                        mb4Var9.set(65, hVar.field_fileUrl);
                    }
                    oVar.b(vVar.f413354h);
                }
                if (size == 0) {
                    sv2.v.q(vVar, true, false, 2, null);
                    sv2.v.l(vVar, new sv2.q(vVar.f413354h, vVar.f413366w));
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
