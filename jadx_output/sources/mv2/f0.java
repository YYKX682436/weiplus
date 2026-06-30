package mv2;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static int f331564d;

    /* renamed from: a, reason: collision with root package name */
    public static final mv2.f0 f331561a = new mv2.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final fp0.o f331562b = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "finderUploadImage"));

    /* renamed from: c, reason: collision with root package name */
    public static final ov2.c f331563c = new ov2.c();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f331565e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f331566f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final int f331567g = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.a7n);

    public void a(mv2.w0 w0Var) {
        pm0.v.X(new mv2.s(w0Var));
    }

    public final com.tencent.mm.protocal.protobuf.FinderObjectDesc b(java.lang.String tag, com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc, com.tencent.mm.protocal.protobuf.FinderObject feedObject, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(objectDesc, "objectDesc");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        if (feedObject.getRefObjectId() != 0) {
            return objectDesc;
        }
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media = objectDesc.getMedia();
        kotlin.jvm.internal.o.f(media, "getMedia(...)");
        for (com.tencent.mm.protocal.protobuf.FinderMedia finderMedia : media) {
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(finderMedia.getUrl());
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            r45.mb4 mediaExt = finderItem.mediaExt(a17);
            if (mediaExt != null) {
                mv2.t0.f331631a.a(finderMedia, mediaExt);
                if (finderMedia.getMediaType() == 4) {
                    finderMedia.setVideo_type(mediaExt.getInteger(50));
                    finderMedia.setDynamic_range_type(mediaExt.getInteger(49));
                    if (finderMedia.getVideoDuration() <= 0 || finderMedia.getVideoDuration() > 2000) {
                        qc0.e1 e1Var = (qc0.e1) i95.n0.c(qc0.e1.class);
                        java.lang.String string = mediaExt.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        qc0.d1 wi6 = ((pc0.g2) e1Var).wi(string);
                        finderMedia.setVideoDuration((wi6 != null ? (int) wi6.f361366d : 0) / 1000);
                        if (finderMedia.getVideoDuration() <= 0 || finderMedia.getVideoDuration() > 2000) {
                            com.tencent.mars.xlog.Log.e(tag, "NetSceneFinderPost videoDuration invalid:" + mediaExt.getInteger(3));
                            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        }
                    }
                }
            }
        }
        return objectDesc;
    }

    public void c() {
        f331563c.b(null);
    }

    public final void d(com.tencent.mm.plugin.vlog.model.z result, com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue() == 5) {
            result.f175794b = false;
            result.f175793a = false;
        }
        if (result.f175794b || result.f175793a) {
            return;
        }
        finderObj.setPostFailedAndNotRetry(0);
        cu2.u.f222441a.l(finderObj);
    }

    public final r45.mb4 e(java.lang.String filePath, java.lang.String thumbUrl) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(thumbUrl, "thumbUrl");
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", "gen img media url %s, thumbUrl %s", filePath, thumbUrl);
        r45.mb4 mb4Var = new r45.mb4();
        mb4Var.set(2, 2);
        if (com.tencent.mm.compatible.util.Exif.fromFile(filePath).getOrientationInDegree() != 0) {
            com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102143l);
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            sb6.append(com.tencent.mm.sdk.platformtools.w2.b(filePath.getBytes()));
            sb6.append('_');
            sb6.append(com.tencent.mm.vfs.w6.l(filePath));
            sb6.append("_rotated");
            java.lang.String sb7 = sb6.toString();
            if (com.tencent.mm.vfs.w6.j(sb7)) {
                filePath = sb7;
            }
        }
        mb4Var.set(0, filePath);
        mb4Var.set(1, thumbUrl);
        mb4Var.set(25, thumbUrl);
        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.a(mb4Var.getString(0)));
        mb4Var.set(46, hc2.l.k(mb4Var.getString(1)));
        java.lang.String string = mb4Var.getString(0);
        if (string == null) {
            string = "";
        }
        android.graphics.Point h17 = h(string);
        mb4Var.set(4, java.lang.Float.valueOf(h17.x));
        mb4Var.set(5, java.lang.Float.valueOf(h17.y));
        mb4Var.set(10, 1);
        mb4Var.set(13, java.lang.Boolean.FALSE);
        return mb4Var;
    }

    public final r45.mb4 f(java.lang.String filePath, java.lang.String thumbUrl, r45.dd4 dd4Var, java.lang.String coverUrl, java.lang.String fullCoverUrl, r45.fp5 fp5Var) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(thumbUrl, "thumbUrl");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        kotlin.jvm.internal.o.g(fullCoverUrl, "fullCoverUrl");
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", "gen video media url %s, thumbUrl %s", filePath, thumbUrl);
        r45.mb4 mb4Var = new r45.mb4();
        mb4Var.set(2, 4);
        mb4Var.set(0, filePath);
        mb4Var.set(1, thumbUrl);
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b(filePath.getBytes()));
        mb4Var.set(46, hc2.l.k(thumbUrl));
        mb4Var.set(7, java.lang.Integer.valueOf((int) com.tencent.mm.vfs.w6.k(filePath)));
        mb4Var.set(16, coverUrl);
        mb4Var.set(41, fullCoverUrl);
        com.tencent.mm.plugin.sight.base.b e17 = hc2.l.e(filePath);
        if (e17 != null) {
            mb4Var.set(4, java.lang.Float.valueOf(e17.f162384c));
            mb4Var.set(5, java.lang.Float.valueOf(e17.f162385d));
            mb4Var.set(8, java.lang.Integer.valueOf(e17.f162383b));
            mb4Var.set(3, java.lang.Integer.valueOf(e17.a()));
            if (dd4Var == null || dd4Var.getInteger(3) <= 0) {
                mb4Var.set(24, java.lang.Long.valueOf(e17.f162382a));
            } else {
                mb4Var.set(3, java.lang.Integer.valueOf(dd4Var.getInteger(3) / 1000));
                mb4Var.set(24, java.lang.Long.valueOf(dd4Var.getInteger(3)));
            }
        }
        mb4Var.set(10, 1);
        if (dd4Var == null) {
            mb4Var.set(13, java.lang.Boolean.FALSE);
        } else {
            mb4Var.set(13, java.lang.Boolean.TRUE);
            mb4Var.set(4, java.lang.Float.valueOf(dd4Var.getInteger(4)));
            mb4Var.set(5, java.lang.Float.valueOf(dd4Var.getInteger(5)));
            mb4Var.set(14, dd4Var);
        }
        mb4Var.set(52, fp5Var);
        return mb4Var;
    }

    public final android.graphics.Point h(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        android.graphics.Point point = new android.graphics.Point();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.sdk.platformtools.x.J(filePath, options);
        point.x = options.outWidth;
        point.y = options.outHeight;
        if (com.tencent.mm.compatible.util.Exif.fromFile(filePath).getOrientationInDegree() % 180 != 0) {
            int i17 = point.y;
            point.y = point.x;
            point.x = i17;
        }
        return point;
    }

    public final r45.zi2 i(android.os.Bundle bundle) {
        r45.zi2 zi2Var;
        byte[] byteArray;
        byte[] byteArray2;
        if (bundle == null || (byteArray2 = bundle.getByteArray("MEDIA_EXTRA_MUSIC")) == null) {
            zi2Var = null;
        } else {
            r45.mh4 mh4Var = new r45.mh4();
            try {
                mh4Var.parseFrom(byteArray2);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                mh4Var = null;
            }
            if (mh4Var == null) {
                zi2Var = null;
            } else {
                zi2Var = new r45.zi2();
                zi2Var.set(0, mh4Var.f380523v >= 1 ? pm0.v.u(mh4Var.f380524w) : java.lang.String.valueOf(mh4Var.f380508d));
                zi2Var.set(11, java.lang.Integer.valueOf(mh4Var.f380523v));
                zi2Var.set(1, mh4Var.f380516o);
                zi2Var.set(2, mh4Var.f380513i);
                java.util.LinkedList linkedList = mh4Var.f380514m;
                zi2Var.set(3, linkedList != null ? (java.lang.String) kz5.n0.Z(linkedList) : null);
                zi2Var.set(5, mh4Var.f380511g);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post with extra music sid: ");
            sb6.append(mh4Var != null ? java.lang.Integer.valueOf(mh4Var.f380508d) : null);
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", sb6.toString());
        }
        if (bundle != null && (byteArray = bundle.getByteArray("ORIGIN_MUSIC_INFO")) != null) {
            zi2Var = new r45.zi2();
            try {
                zi2Var.parseFrom(byteArray);
            } catch (java.lang.Exception e18) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                zi2Var = null;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("post with origin music sid: ");
            sb7.append(zi2Var != null ? zi2Var.getString(12) : null);
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", sb7.toString());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[getMusicInfo] name:");
        sb8.append(zi2Var != null ? zi2Var.getString(2) : null);
        sb8.append(" doc_type:");
        sb8.append(zi2Var != null ? java.lang.Integer.valueOf(zi2Var.getInteger(11)) : null);
        sb8.append(" docId:");
        sb8.append(zi2Var != null ? zi2Var.getString(0) : null);
        sb8.append(" song_id:");
        sb8.append(zi2Var != null ? zi2Var.getString(12) : null);
        sb8.append(" mediaStreamingUrl:");
        sb8.append(zi2Var != null ? zi2Var.getString(5) : null);
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", sb8.toString());
        return zi2Var;
    }

    public final long j(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = finderItem.getFeedObject();
        long j17 = feedObject.getShowOriginal() ? 1L : 0L;
        r45.dm2 object_extend = feedObject.getObject_extend();
        return ((object_extend != null ? object_extend.getInteger(2) : 0) & 4) > 0 ? j17 | 2 : j17;
    }

    public final int k(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        r45.z31 fromApp;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        if (9 == ((objectDesc == null || (fromApp = objectDesc.getFromApp()) == null) ? 0 : fromApp.getInteger(6))) {
            return 2;
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        int enterScene = finderFeedReportObject != null ? finderFeedReportObject.getEnterScene() : 0;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = finderItem.field_reportObject;
        if ((finderFeedReportObject2 != null ? finderFeedReportObject2.getBusinessType() : 0) == 1) {
            if (enterScene != 38 && enterScene != 43 && enterScene != 44) {
                return 4;
            }
        } else {
            if (enterScene == 13) {
                return 3;
            }
            if (enterScene != 16) {
                return (enterScene == 60 || enterScene == 61) ? 6 : 0;
            }
        }
        return 1;
    }

    public final int l() {
        int i17;
        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
            return f331567g;
        }
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z17 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        return (i18 - 2) / 3;
    }

    public final boolean m(r45.qb4 postInfo) {
        kotlin.jvm.internal.o.g(postInfo, "postInfo");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", "[isDraftToManyTry] tryCount:" + postInfo + ".tryCount, configMax:5");
        return postInfo.getInteger(1) > 5;
    }

    public final boolean n(r45.qb4 postInfo) {
        kotlin.jvm.internal.o.g(postInfo, "postInfo");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", "[isToManyTry] tryCount:" + postInfo.getInteger(1) + ", configMax:5");
        return postInfo.getInteger(1) > 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r5 == 1.0f) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.o o(int r4, int r5, int r6) {
        /*
            r3 = this;
            float r5 = (float) r5
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r0
            float r4 = (float) r4
            float r5 = r5 / r4
            int r4 = r3.l()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 1068149419(0x3faaaaab, float:1.3333334)
            if (r5 > 0) goto L20
            r2 = 1
            if (r6 == r2) goto L20
            if (r6 != 0) goto L1d
            if (r5 != 0) goto L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L1d
            goto L20
        L1d:
            float r5 = (float) r4
            float r5 = r5 * r0
            goto L22
        L20:
            float r5 = (float) r4
            float r5 = r5 * r1
        L22:
            jz5.o r6 = new jz5.o
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.<init>(r0, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mv2.f0.o(int, int, int):jz5.o");
    }

    public final void p(mv2.g0 event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        java.lang.String postId = finderFeedReportObject != null ? finderFeedReportObject.getPostId() : null;
        if (postId == null) {
            postId = "";
        }
        if (postId.length() == 0) {
            com.tencent.mars.xlog.Log.w("LogPost.FinderPostManager", "notifyPrePostEvent postId isEmpty");
        } else {
            pm0.v.X(new mv2.z(postId, event));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x051d A[LOOP:3: B:124:0x04e7->B:138:0x051d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0521 A[EDGE_INSN: B:139:0x0521->B:140:0x0521 BREAK  A[LOOP:3: B:124:0x04e7->B:138:0x051d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(com.tencent.mm.plugin.finder.storage.FinderItem r55, com.tencent.mm.protocal.protobuf.FinderObject r56, java.lang.String r57, int r58) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mv2.f0.q(com.tencent.mm.plugin.finder.storage.FinderItem, com.tencent.mm.protocal.protobuf.FinderObject, java.lang.String, int):void");
    }

    public final java.lang.String r(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            java.lang.String query = new java.net.URI(str).getQuery();
            kotlin.jvm.internal.o.f(query, "getQuery(...)");
            java.util.List f07 = r26.n0.f0(query, new java.lang.String[]{"&"}, false, 0, 6, null);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                java.util.List f08 = r26.n0.f0((java.lang.String) it.next(), new java.lang.String[]{"="}, false, 0, 6, null);
                if (f08.size() == 2) {
                    linkedHashMap.put(f08.get(0), f08.get(1));
                }
            }
            return (java.lang.String) linkedHashMap.get("encfilekey");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", "parseEncfilekey e:" + th6);
            return null;
        }
    }

    public void s(java.lang.Object feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (feed instanceof com.tencent.mm.plugin.finder.storage.FinderItem) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Finder.PostLog repost ");
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) feed;
            sb6.append(finderItem.getLocalId());
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", sb6.toString());
            com.tencent.mm.plugin.finder.storage.FinderItem f17 = cu2.u.f222441a.f(finderItem.getLocalId());
            if (f17 != null) {
                finderItem = f17;
            }
            ft2.b bVar = ft2.b.f266519a;
            ft2.d dVar = ft2.c.f266520a;
            ft2.b.d(bVar, ft2.c.f266521b, finderItem, 0, 0, 12, null);
            finderItem.setPostWaiting();
            r45.qb4 postInfo = finderItem.getPostInfo();
            postInfo.set(1, 0);
            postInfo.set(4, 0);
            if (postInfo.getInteger(2) == 2) {
                postInfo.set(2, 0);
            }
            java.util.Iterator<T> it = finderItem.getMediaList().iterator();
            while (it.hasNext()) {
                r45.dd4 dd4Var = (r45.dd4) ((r45.mb4) it.next()).getCustom(14);
                if (dd4Var != null) {
                    dd4Var.set(7, 0);
                }
            }
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.setClickRepostCount(finderFeedReportObject.getClickRepostCount() + 1);
                hc2.p0.b(finderFeedReportObject, "clickRepost");
            }
            if (finderItem.isMvFeed()) {
                java.util.Iterator<T> it6 = finderItem.getClipListExt().iterator();
                while (it6.hasNext()) {
                    java.util.Iterator<T> it7 = ((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next()).getMediaList().iterator();
                    while (it7.hasNext()) {
                        r45.dd4 dd4Var2 = (r45.dd4) ((r45.mb4) it7.next()).getCustom(14);
                        if (dd4Var2 != null) {
                            dd4Var2.set(7, 0);
                        }
                    }
                }
                cu2.u.f222441a.n(finderItem);
            } else {
                cu2.u.f222441a.l(finderItem);
            }
            c();
            boolean isLongVideo = finderItem.isLongVideo();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1253L, 15L, 1L);
            if (isLongVideo) {
                if ((1253 == 1253 ? 1523L : 0L) > 0) {
                    g0Var.C(1253 == 1253 ? 1523L : 0L, 15L, 1L);
                }
            }
            boolean isLongVideo2 = finderItem.isLongVideo();
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.C(1253L, 42L, 1L);
            if (isLongVideo2) {
                g0Var2.C(1523L, 42L, 1L);
            }
            if (finderItem.isLongVideo()) {
                g0Var2.C(1253L, 53L, 1L);
                g0Var2.C(1523L, 53L, 1L);
            }
            com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
            long localId = finderItem.getLocalId();
            am.ga gaVar = feedPostProgressEvent.f54250g;
            gaVar.f6749a = localId;
            gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
            feedPostProgressEvent.e();
        }
    }

    public void t(mv2.w0 w0Var) {
        pm0.v.X(new mv2.c0(w0Var));
    }

    public final void u(java.lang.String nickName, java.lang.String eventName, yz5.l callback) {
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (nickName.length() > 0) {
            if (eventName.length() > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1253L, 70L, 1L);
                new db2.w2(nickName, eventName, null, null, null, null, 60, null).l().K(new mv2.d0(callback));
                return;
            }
        }
        callback.invoke(null);
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", "nickName or eventName is Empty");
    }

    public final r45.qb4 v(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        r45.qb4 postInfo = draftItem.getPostInfo();
        postInfo.set(1, java.lang.Integer.valueOf(postInfo.getInteger(1) + 1));
        draftItem.t0().setPostInfo(postInfo);
        cu2.o.f222430a.b(draftItem);
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", "[updateDraftTryCount] tryCount:" + postInfo.getInteger(1));
        return postInfo;
    }

    public final r45.qb4 w(com.tencent.mm.plugin.finder.storage.FinderItem feedObject) {
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        r45.qb4 postInfo = feedObject.getPostInfo();
        postInfo.set(1, java.lang.Integer.valueOf(postInfo.getInteger(1) + 1));
        feedObject.setPostInfo(postInfo);
        cu2.u.f222441a.l(feedObject);
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", "[updateTryCount] tryCount:" + postInfo.getInteger(1));
        return postInfo;
    }

    public void x(java.lang.String path, java.lang.String userName, java.lang.Object callback) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        f331562b.b(new mv2.n0(path, userName), (fp0.p) callback);
    }
}
