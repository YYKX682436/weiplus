package qv2;

/* loaded from: classes10.dex */
public final class c implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv2.e f366937d;

    public c(qv2.e eVar) {
        this.f366937d = eVar;
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
        java.lang.Object obj7;
        java.util.LinkedList linkedList;
        r45.q23 video_tmpl_info;
        r45.zi2 zi2Var;
        r45.el2 feedBgmInfo;
        r45.el2 feedBgmInfo2;
        java.lang.String s17 = this.f366937d.s();
        java.lang.String str3 = "on cdn callback someOneFailed:" + this.f366937d.f366945r + ", mediaId = %s, startRet = %d, sceneResult %s";
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.toString()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.tencent.mars.xlog.Log.i(s17, str3, objArr);
        if (!this.f366937d.f366939i) {
            qv2.e eVar = this.f366937d;
            if (!eVar.f366945r) {
                eVar.E(str, gVar);
                if (i17 != 0) {
                    com.tencent.mars.xlog.Log.e(this.f366937d.s(), "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
                    if (i17 == -21005 || qv2.e.k(this.f366937d, str)) {
                        return 0;
                    }
                    qv2.e eVar2 = this.f366937d;
                    eVar2.f366945r = true;
                    eVar2.t(str, i17);
                    return 0;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && hVar != null) {
                    com.tencent.mars.xlog.Log.i(this.f366937d.s(), "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.field_retCode), hVar.field_fileId, hVar.field_fileUrl);
                    if (hVar.field_retCode != 0) {
                        if (qv2.e.k(this.f366937d, str)) {
                            return 0;
                        }
                        qv2.e eVar3 = this.f366937d;
                        eVar3.f366945r = true;
                        eVar3.t(str, hVar.field_retCode);
                        return 0;
                    }
                    this.f366937d.f366942o.remove(str);
                    java.util.LinkedList<r45.mb4> mediaList = this.f366937d.f366938h.getMediaList();
                    int size = this.f366937d.f366942o.size();
                    com.tencent.mars.xlog.Log.i(this.f366937d.s(), "%s waitToUpload %d media localId:" + this.f366937d.f366938h.getLocalId(), java.lang.Long.valueOf(this.f366937d.f366938h.getLocalId()), java.lang.Integer.valueOf(size));
                    qv2.e eVar4 = this.f366937d;
                    java.util.Iterator it = eVar4.f366944q.iterator();
                    while (true) {
                        obj = null;
                        zi2Var = null;
                        zi2Var = null;
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (kotlin.jvm.internal.o.b(((r45.mb4) obj2).getString(9), eVar4.x(str))) {
                            break;
                        }
                    }
                    boolean z18 = obj2 != null;
                    qv2.e eVar5 = this.f366937d;
                    java.util.Iterator<T> it6 = mediaList.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it6.next();
                        if (kotlin.jvm.internal.o.b(((r45.mb4) obj3).getString(9), eVar5.x(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var = (r45.mb4) obj3;
                    if (mb4Var != null) {
                        qv2.e eVar6 = this.f366937d;
                        com.tencent.mars.xlog.Log.i(eVar6.s(), "hitMedia, upload media ok isLongVideo:" + z18 + ", isHalf:false");
                        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.a(mb4Var.getString(0)));
                        mb4Var.set(11, hVar.field_fileUrl);
                        mb4Var.set(12, hVar.field_thumbUrl);
                        mb4Var.set(6, hVar.field_filemd5);
                        if (z18) {
                            mediaList.clear();
                            mediaList.add(mb4Var);
                            eVar6.f366938h.setMediaList(mediaList);
                            eVar6.D(0, mb4Var);
                        } else {
                            eVar6.f366938h.setMediaList(mediaList);
                            eVar6.D(0, mb4Var);
                        }
                        eVar6.y();
                    }
                    if (mb4Var == null) {
                        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = this.f366937d.f366938h.getFeedObject().getObjectDesc();
                        r45.zi2 zi2Var2 = (objectDesc == null || (feedBgmInfo2 = objectDesc.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo2.getCustom(0);
                        if (zi2Var2 != null) {
                            java.lang.String string = zi2Var2.getString(5);
                            if (string == null) {
                                string = "";
                            }
                            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string.getBytes()), this.f366937d.x(str))) {
                                com.tencent.mars.xlog.Log.i(this.f366937d.s(), "upload audio track ok, url:" + hVar.field_fileUrl);
                                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = this.f366937d.f366938h.getFeedObject().getObjectDesc();
                                r45.zi2 imgFeedBgmInfo = objectDesc2 != null ? objectDesc2.getImgFeedBgmInfo() : null;
                                if (imgFeedBgmInfo != null) {
                                    imgFeedBgmInfo.set(5, hVar.field_fileUrl);
                                }
                                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = this.f366937d.f366938h.getFeedObject().getObjectDesc();
                                if (objectDesc3 != null && (feedBgmInfo = objectDesc3.getFeedBgmInfo()) != null) {
                                    zi2Var = (r45.zi2) feedBgmInfo.getCustom(0);
                                }
                                if (zi2Var != null) {
                                    zi2Var.set(5, hVar.field_fileUrl);
                                }
                                this.f366937d.y();
                            }
                        }
                        qv2.e eVar7 = this.f366937d;
                        java.util.Iterator<T> it7 = mediaList.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it7.next();
                            java.lang.String string2 = ((r45.mb4) obj4).getString(41);
                            if (string2 == null) {
                                string2 = "";
                            }
                            char[] cArr2 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string2.getBytes()), eVar7.x(str))) {
                                break;
                            }
                        }
                        r45.mb4 mb4Var2 = (r45.mb4) obj4;
                        if (mb4Var2 != null) {
                            qv2.e eVar8 = this.f366937d;
                            com.tencent.mars.xlog.Log.i(eVar8.s(), "upload fullCover ok, url:" + hVar.field_fileUrl);
                            mb4Var2.set(40, hVar.field_fileUrl);
                            r45.mb4 mb4Var3 = (r45.mb4) kz5.n0.Z(eVar8.f366944q);
                            if (mb4Var3 != null) {
                                mb4Var3.set(40, hVar.field_fileUrl);
                            }
                        }
                        qv2.e eVar9 = this.f366937d;
                        java.util.Iterator<T> it8 = mediaList.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                obj5 = null;
                                break;
                            }
                            obj5 = it8.next();
                            java.lang.String string3 = ((r45.mb4) obj5).getString(16);
                            if (string3 == null) {
                                string3 = "";
                            }
                            char[] cArr3 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string3.getBytes()), eVar9.x(str))) {
                                break;
                            }
                        }
                        r45.mb4 mb4Var4 = (r45.mb4) obj5;
                        if (mb4Var4 != null) {
                            qv2.e eVar10 = this.f366937d;
                            com.tencent.mars.xlog.Log.i(eVar10.s(), "upload cover ok, url:" + hVar.field_fileUrl);
                            mb4Var4.set(23, hVar.field_fileUrl);
                            r45.mb4 mb4Var5 = (r45.mb4) kz5.n0.Z(eVar10.f366944q);
                            if (mb4Var5 != null) {
                                mb4Var5.set(23, hVar.field_fileUrl);
                            }
                        }
                        qv2.e eVar11 = this.f366937d;
                        java.util.Iterator<T> it9 = mediaList.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                obj6 = null;
                                break;
                            }
                            obj6 = it9.next();
                            java.lang.String string4 = ((r45.mb4) obj6).getString(25);
                            if (string4 == null) {
                                string4 = "";
                            }
                            char[] cArr4 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string4.getBytes()), eVar11.x(str))) {
                                break;
                            }
                        }
                        r45.mb4 mb4Var6 = (r45.mb4) obj6;
                        if (mb4Var6 != null) {
                            com.tencent.mars.xlog.Log.i(this.f366937d.s(), "upload fullThumb ok, url:" + hVar.field_fileUrl);
                            mb4Var6.set(27, hVar.field_fileUrl);
                        }
                        qv2.e eVar12 = this.f366937d;
                        java.util.Iterator<T> it10 = mediaList.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                obj7 = null;
                                break;
                            }
                            obj7 = it10.next();
                            java.lang.String string5 = ((r45.mb4) obj7).getString(62);
                            if (string5 == null) {
                                string5 = "";
                            }
                            char[] cArr5 = com.tencent.mm.sdk.platformtools.w2.f193046a;
                            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.b(string5.getBytes()), eVar12.x(str))) {
                                break;
                            }
                        }
                        r45.mb4 mb4Var7 = (r45.mb4) obj7;
                        if (mb4Var7 != null) {
                            com.tencent.mars.xlog.Log.i(this.f366937d.s(), "upload shareCoverUrl ok, url:" + hVar.field_fileUrl);
                            mb4Var7.set(65, hVar.field_fileUrl);
                        }
                        qv2.e eVar13 = this.f366937d;
                        java.lang.String str4 = hVar.field_fileUrl;
                        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = eVar13.f366938h.getFeedObject().getObjectDesc();
                        r45.iy5 iy5Var = (objectDesc4 == null || (video_tmpl_info = objectDesc4.getVideo_tmpl_info()) == null) ? null : video_tmpl_info.f383592n;
                        if (iy5Var != null && (linkedList = iy5Var.f377412d) != null) {
                            java.util.Iterator it11 = linkedList.iterator();
                            while (true) {
                                if (!it11.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it11.next();
                                if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.w2.a((java.lang.String) next), eVar13.x(str))) {
                                    obj = next;
                                    break;
                                }
                            }
                            java.lang.String str5 = (java.lang.String) obj;
                            if (str5 != null) {
                                linkedList.set(linkedList.indexOf(str5), str4 != null ? str4 : "");
                                com.tencent.mars.xlog.Log.i(eVar13.s(), "handleTemplateScyThumb target:" + str5 + " to mediaId:" + str);
                            }
                        }
                        this.f366937d.y();
                    }
                    if (size == 0) {
                        this.f366937d.C(true, true);
                        qv2.e eVar14 = this.f366937d;
                        eVar14.z(eVar14.q());
                    }
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
