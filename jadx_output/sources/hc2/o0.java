package hc2;

/* loaded from: classes2.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f280336a = jz5.h.b(hc2.n0.f280334d);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f280337b = kz5.o1.c(java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED));

    public static final boolean A(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        return ((finderObject.getPermissionFlag() & 8192) > 0) || (finderObject.getLiveInfo() != null ? e(finderObject) ^ true : false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        if (((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(r4.getFeedObject().getLiveInfo()) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean B(com.tencent.mm.plugin.finder.storage.FinderItem r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r4, r0)
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r0 = com.tencent.mm.plugin.finder.storage.t70.Y4
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L5e
            int r0 = r4.getMediaType()
            r2 = 9
            r3 = 0
            if (r0 != r2) goto L59
            java.lang.Class<s40.w0> r0 = s40.w0.class
            i95.m r0 = i95.n0.c(r0)
            s40.w0 r0 = (s40.w0) r0
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r4.getFeedObject()
            r45.nw1 r2 = r2.getLiveInfo()
            com.tencent.mm.feature.finder.live.v4 r0 = (com.tencent.mm.feature.finder.live.v4) r0
            boolean r0 = r0.hk(r2)
            if (r0 != 0) goto L57
            java.lang.Class<ss5.i0> r0 = ss5.i0.class
            i95.m r0 = i95.n0.c(r0)
            ss5.i0 r0 = (ss5.i0) r0
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            r45.nw1 r4 = r4.getLiveInfo()
            vd2.d5 r0 = (vd2.d5) r0
            boolean r4 = r0.Ui(r4)
            if (r4 == 0) goto L59
        L57:
            r4 = r1
            goto L5a
        L59:
            r4 = r3
        L5a:
            if (r4 == 0) goto L5d
            goto L5e
        L5d:
            r1 = r3
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hc2.o0.B(com.tencent.mm.plugin.finder.storage.FinderItem):boolean");
    }

    public static final boolean C(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media3;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        if (com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q()) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
            if (15 == (objectDesc != null ? objectDesc.getMediaType() : 0)) {
                r45.en2 place_holder_info = finderObject.getPlace_holder_info();
                if (place_holder_info != null && place_holder_info.getInteger(2) == 9) {
                    return false;
                }
            }
        }
        java.util.List u17 = u();
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
        if (u17.contains(java.lang.Integer.valueOf(objectDesc2 != null ? objectDesc2.getMediaType() : 0))) {
            return true;
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderObject.getObjectDesc();
        if ((objectDesc3 == null || (media3 = objectDesc3.getMedia()) == null || media3.size() != 0) ? false : true) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = finderObject.getObjectDesc();
        int mediaType = (objectDesc4 == null || (media2 = objectDesc4.getMedia()) == null || (finderMedia = media2.get(0)) == null) ? 0 : finderMedia.getMediaType();
        if (!u().contains(java.lang.Integer.valueOf(mediaType))) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc5 = finderObject.getObjectDesc();
        if (objectDesc5 != null && (media = objectDesc5.getMedia()) != null) {
            java.util.Iterator<T> it = media.iterator();
            while (it.hasNext()) {
                if (((com.tencent.mm.protocal.protobuf.FinderMedia) it.next()).getMediaType() != mediaType) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean D(com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        boolean z18 = (finderObject.getAdFlag() & 8) > 0 || (finderObject.getAdFlag() & 128) > 0;
        if (z17) {
            return z18 || (finderObject.getAdFlag() & 64) > 0;
        }
        return z18;
    }

    public static /* synthetic */ boolean E(com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return D(finderObject, z17);
    }

    public static final boolean F(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        int mediaType = objectDesc != null ? objectDesc.getMediaType() : 0;
        if (mediaType == 9) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("FinderExt", "isLive return for invalid mediaType:" + mediaType);
        return false;
    }

    public static final boolean G(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        return (finderObject.getAdFlag() & 128) > 0;
    }

    public static final boolean H(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.lang.String str;
        g92.b bVar = g92.b.f269769e;
        if (finderObject == null || (str = finderObject.getUsername()) == null) {
            str = "";
        }
        return bVar.G2(str) || I(finderObject);
    }

    public static final boolean I(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.lang.String str;
        if (finderObject == null || (str = finderObject.getUsername()) == null) {
            str = "";
        }
        m92.b j37 = g92.a.j3(g92.b.f269769e, str, false, 2, null);
        return (j37 == null || j37.w0() || !j37.v0()) ? false : true;
    }

    public static final boolean J(r45.ao2 ao2Var, long j17) {
        if (ao2Var == null || ((r45.sd1) ao2Var.getCustom(3)) == null) {
            return false;
        }
        r45.s25 s25Var = (r45.s25) ao2Var.getCustom(4);
        return j17 >= ((long) ((s25Var != null ? s25Var.getInteger(0) : 0) * 1000));
    }

    public static final int K(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        if (H(finderObject)) {
            return 1;
        }
        return com.tencent.mm.plugin.finder.storage.t70.f127590a.u2();
    }

    public static final boolean a(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.dm2 object_extend;
        return (((finderObject == null || (object_extend = finderObject.getObject_extend()) == null) ? 0L : object_extend.getLong(30)) & 1048576) == 0;
    }

    public static final boolean b(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        return (finderObject.getPermissionFlag() & 2) == 0;
    }

    public static final boolean c(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        return (finderObject.getPermissionFlag() & 32) == 0;
    }

    public static final boolean d(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        return (finderObject.getPermissionFlag() & 128) == 0;
    }

    public static final boolean e(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3764h5).getValue()).r()).intValue() == 1) {
            return false;
        }
        return !pm0.v.z(finderObject.getLiveInfo() != null ? r3.getInteger(54) : 0, 65536);
    }

    public static final boolean f(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        return (finderObject.getPermissionFlag() & 1) == 0;
    }

    public static final boolean g(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        return (finderObject.getPermissionFlag() & 2048) == 0;
    }

    public static final boolean h(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        return (finderObject.getPermissionFlag() & 2097152) == 0;
    }

    public static final boolean i(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        r45.dm2 object_extend = finderObject.getObject_extend();
        return ((object_extend != null ? object_extend.getLong(30) : 0L) & 64) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if ((r0 != null ? java.lang.Integer.valueOf(r0.getMediaType()) : null) == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int j(com.tencent.mm.protocal.protobuf.FinderObject r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r5, r0)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r5.getObjectDesc()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1f
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r5.getObjectDesc()
            if (r0 == 0) goto L1c
            int r0 = r0.getMediaType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 != 0) goto L35
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "obj "
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "FinderExt"
            com.tencent.mm.sdk.platformtools.Log.c(r4, r0, r3)
        L35:
            java.util.List r0 = u()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r5.getObjectDesc()
            if (r3 == 0) goto L47
            int r1 = r3.getMediaType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L47:
            boolean r0 = kz5.n0.O(r0, r1)
            if (r0 == 0) goto L58
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.getObjectDesc()
            if (r5 == 0) goto L57
            int r2 = r5.getMediaType()
        L57:
            return r2
        L58:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r5.getObjectDesc()
            r1 = 1
            if (r0 == 0) goto L6d
            java.util.LinkedList r0 = r0.getMedia()
            if (r0 == 0) goto L6d
            int r0 = r0.size()
            if (r0 != 0) goto L6d
            r0 = r1
            goto L6e
        L6d:
            r0 = r2
        L6e:
            if (r0 == 0) goto L7b
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.getObjectDesc()
            if (r5 == 0) goto L7a
            int r2 = r5.getMediaType()
        L7a:
            return r2
        L7b:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r5.getObjectDesc()
            if (r0 == 0) goto L94
            java.util.LinkedList r0 = r0.getMedia()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.protocal.protobuf.FinderMedia r0 = (com.tencent.mm.protocal.protobuf.FinderMedia) r0
            if (r0 == 0) goto L94
            int r0 = r0.getMediaType()
            goto L95
        L94:
            r0 = r2
        L95:
            java.util.List r3 = u()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto La4
            return r0
        La4:
            r3 = 4
            r4 = 8
            if (r0 != r3) goto Lbc
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r5.getObjectDesc()
            if (r3 == 0) goto Lb9
            java.util.LinkedList r3 = r3.getMedia()
            if (r3 == 0) goto Lb9
            int r2 = r3.size()
        Lb9:
            if (r2 <= r1) goto Lbc
            return r4
        Lbc:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.getObjectDesc()
            if (r5 == 0) goto Ldf
            java.util.LinkedList r5 = r5.getMedia()
            if (r5 == 0) goto Ldf
            java.util.Iterator r5 = r5.iterator()
        Lcc:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Ldf
            java.lang.Object r1 = r5.next()
            com.tencent.mm.protocal.protobuf.FinderMedia r1 = (com.tencent.mm.protocal.protobuf.FinderMedia) r1
            int r1 = r1.getMediaType()
            if (r1 == r0) goto Lcc
            return r4
        Ldf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hc2.o0.j(com.tencent.mm.protocal.protobuf.FinderObject):int");
    }

    public static final java.lang.String k(java.util.List list) {
        java.lang.String str;
        java.lang.StringBuffer stringBuffer;
        java.util.Iterator it;
        int i17;
        java.lang.String str2;
        r45.i21 i21Var;
        java.lang.String str3 = "null";
        if (list == null) {
            return "null";
        }
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        stringBuffer2.append("onCgiBack: count:" + list.size());
        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
        java.util.Iterator it6 = list.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) next;
            java.lang.String o17 = o(finderObject);
            java.lang.String l17 = l(finderObject);
            java.lang.String q17 = q(finderObject);
            r45.n31 foldedLayout = finderObject.getFoldedLayout();
            if (foldedLayout != null) {
                if (foldedLayout.getList(1).size() > 0) {
                    stringBuffer3.append("PARENT_ID:id:".concat(pm0.v.u(finderObject.getId())));
                    stringBuffer3.append("FL>>>");
                }
                java.util.LinkedList list2 = foldedLayout.getList(1);
                if (list2 != null) {
                    java.util.Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) it7.next();
                        kotlin.jvm.internal.o.d(finderObject2);
                        java.lang.String str4 = str3;
                        java.util.Iterator it8 = it6;
                        java.util.Iterator it9 = it7;
                        stringBuffer3.append("#[id:" + pm0.v.u(finderObject2.getId()) + ",md:" + o(finderObject2) + ",d:" + l(finderObject2) + "] " + q(finderObject2));
                        str3 = str4;
                        it6 = it8;
                        it7 = it9;
                        i19 = i19;
                        stringBuffer2 = stringBuffer2;
                    }
                }
                str = str3;
                stringBuffer = stringBuffer2;
                it = it6;
                i17 = i19;
                if (foldedLayout.getList(1).size() > 0) {
                    stringBuffer3.append("<<FL\n");
                }
            } else {
                str = str3;
                stringBuffer = stringBuffer2;
                it = it6;
                i17 = i19;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(";[*");
            sb6.append(i18);
            sb6.append(" id:");
            sb6.append(pm0.v.u(finderObject.getId()));
            sb6.append(",md:");
            sb6.append(o17);
            sb6.append(",d:");
            sb6.append(l17);
            sb6.append("] ");
            sb6.append(q17);
            sb6.append(',');
            sb6.append(cm2.a.f43328a.y(finderObject.getLiveInfo()));
            sb6.append(", exitCacheInfo:");
            r45.dm2 object_extend = finderObject.getObject_extend();
            if (object_extend != null && (i21Var = (r45.i21) object_extend.getCustom(48)) != null) {
                str2 = "{" + i21Var.getInteger(1) + ", " + i21Var.getInteger(2) + ", " + i21Var.getInteger(0) + '}';
                if (str2 != null) {
                    sb6.append(str2);
                    stringBuffer2 = stringBuffer;
                    stringBuffer2.append(sb6.toString());
                    str3 = str;
                    it6 = it;
                    i18 = i17;
                }
            }
            str2 = str;
            sb6.append(str2);
            stringBuffer2 = stringBuffer;
            stringBuffer2.append(sb6.toString());
            str3 = str;
            it6 = it;
            i18 = i17;
        }
        boolean z17 = true;
        if (stringBuffer3.length() <= 0) {
            z17 = false;
        }
        if (z17) {
            stringBuffer2.append("\n" + ((java.lang.Object) stringBuffer3));
        }
        java.lang.String stringBuffer4 = stringBuffer2.toString();
        kotlin.jvm.internal.o.f(stringBuffer4, "toString(...)");
        return stringBuffer4;
    }

    public static final java.lang.String l(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.lang.String description;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc == null || (description = objectDesc.getDescription()) == null) {
            return "";
        }
        java.lang.String substring = description.substring(0, java.lang.Math.min(description.length(), 7));
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.String m(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.lang.String concat;
        if (finderObject != null && (objectDesc = finderObject.getObjectDesc()) != null) {
            java.lang.String k17 = hc2.b0.k(objectDesc.getDescription(), 0, 0, 3, null);
            int mediaType = objectDesc.getMediaType();
            if (mediaType == 2) {
                concat = "IMG-".concat(k17);
            } else if (mediaType == 4) {
                concat = "VIDEO-".concat(k17);
            } else if (mediaType != 9) {
                concat = objectDesc.getMediaType() + '-' + k17;
            } else {
                concat = "LIVE-".concat(k17);
            }
            if (concat != null) {
                return concat;
            }
        }
        return java.lang.String.valueOf(finderObject);
    }

    public static final java.lang.String n(com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NIL.");
        sb6.append(m(finderObject));
        sb6.append('.');
        if (z17) {
            str = ".".concat(pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
        } else {
            str = "";
        }
        sb6.append(str);
        return sb6.toString();
    }

    public static final java.lang.String o(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.lang.String str;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        java.lang.String url;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.a0(media, 0)) == null || (url = finderMedia.getUrl()) == null) {
            str = null;
        } else {
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            str = com.tencent.mm.sdk.platformtools.w2.b(url.getBytes());
        }
        return str == null ? "" : str;
    }

    public static final java.lang.String p(java.util.List list) {
        if (list == null) {
            return "null";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("count:" + list.size() + " \n");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                sb6.append(pm0.v.u(baseFinderFeed.getFeedObject().getId()));
                sb6.append(" nick:");
                sb6.append(baseFinderFeed.getFeedObject().getNickName());
                sb6.append(" flag:");
                sb6.append(baseFinderFeed.getFeedObject().getFeedObject().getFunc_flag());
                sb6.append(" livestate:");
                r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
                sb6.append(liveInfo != null ? java.lang.Integer.valueOf(liveInfo.getInteger(2)) : null);
                sb6.append(" \n");
                stringBuffer.append(sb6.toString());
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(j5Var);
                sb7.append('\n');
                stringBuffer.append(sb7.toString());
            }
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    public static final java.lang.String q(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        int i17 = -1;
        int mediaType = objectDesc != null ? objectDesc.getMediaType() : -1;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
        int i18 = 0;
        if (objectDesc2 != null && (media2 = objectDesc2.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.a0(media2, 0)) != null) {
            i17 = finderMedia.getMediaType();
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderObject.getObjectDesc();
        if (objectDesc3 != null && (media = objectDesc3.getMedia()) != null) {
            i18 = media.size();
        }
        return "t:" + mediaType + ',' + i17 + ";s:" + i18;
    }

    public static final boolean r(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        return (finderObject.getPermissionFlag() & 4194304) > 0;
    }

    public static final long s(so2.j5 j5Var) {
        if (j5Var != null) {
            return j5Var.getItemId();
        }
        return 0L;
    }

    public static final java.lang.String t(so2.j5 j5Var) {
        return j5Var != null ? pm0.v.u(j5Var.getItemId()) : "0L";
    }

    public static final java.util.List u() {
        return (java.util.List) ((jz5.n) f280336a).getValue();
    }

    public static final java.lang.Integer v(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.ey0 ey0Var;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        r45.en2 place_holder_info = finderObject.getPlace_holder_info();
        if (place_holder_info == null || (ey0Var = (r45.ey0) place_holder_info.getCustom(11)) == null) {
            return null;
        }
        return java.lang.Integer.valueOf(ey0Var.getInteger(0));
    }

    public static final com.tencent.mm.protocal.protobuf.FinderJumpInfo w(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.cl2 cl2Var;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        r45.dm2 object_extend = finderObject.getObject_extend();
        if (object_extend == null || (cl2Var = (r45.cl2) object_extend.getCustom(4)) == null) {
            return null;
        }
        return (com.tencent.mm.protocal.protobuf.FinderJumpInfo) cl2Var.getCustom(6);
    }

    public static final com.tencent.mm.protocal.protobuf.FinderObject x(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.en2 place_holder_info;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        r45.en2 place_holder_info2 = finderObject.getPlace_holder_info();
        if (!(place_holder_info2 != null && place_holder_info2.getInteger(2) == 9) || v(finderObject) == null || (place_holder_info = finderObject.getPlace_holder_info()) == null) {
            return null;
        }
        return (com.tencent.mm.protocal.protobuf.FinderObject) place_holder_info.getCustom(7);
    }

    public static final java.lang.String y(com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17) {
        java.lang.String str;
        if (!H(finderObject)) {
            if (i17 == 2) {
                return c01.z1.l();
            }
            ya2.b2 b17 = ya2.h.f460484a.b(g92.b.f269769e.T0());
            return b17 != null ? b17.w0() : "";
        }
        if (finderObject == null || (str = finderObject.getUsername()) == null) {
            str = "";
        }
        m92.b j37 = g92.a.j3(g92.b.f269769e, str, false, 2, null);
        java.lang.String str2 = j37 != null ? j37.field_nickname : null;
        return str2 == null ? "" : str2;
    }

    public static final java.lang.String z(com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17) {
        java.lang.String username;
        if (H(finderObject)) {
            return (finderObject == null || (username = finderObject.getUsername()) == null) ? "" : username;
        }
        if (i17 != 2) {
            return g92.b.f269769e.T0();
        }
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.d(r17);
        return r17;
    }
}
