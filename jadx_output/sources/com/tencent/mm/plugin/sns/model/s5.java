package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public abstract class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static long f164673a;

    /* renamed from: b, reason: collision with root package name */
    public static long f164674b;

    /* renamed from: c, reason: collision with root package name */
    public static long f164675c;

    /* renamed from: d, reason: collision with root package name */
    public static int f164676d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f164677e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f164678f;

    static {
        new java.util.TreeMap(new com.tencent.mm.plugin.sns.model.q5());
        f164673a = 0L;
        f164674b = 0L;
        f164675c = 0L;
        f164676d = 0;
        f164677e = 86400L;
        f164678f = new java.util.concurrent.ConcurrentHashMap();
    }

    public static void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLocalDeletedComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (snsInfo != null) {
            try {
                if (snsInfo.field_attrBuf != null) {
                    java.lang.String r17 = c01.z1.r();
                    long e17 = c01.id.e();
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf);
                    if (snsObject2 != null && !com.tencent.mm.sdk.platformtools.t8.L0(snsObject2.CommentUserList) && snsObject != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (snsObject.CommentUserList == null) {
                            snsObject.CommentUserList = new java.util.LinkedList<>();
                        }
                        java.util.Iterator<r45.e86> it = snsObject.CommentUserList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(java.lang.Integer.valueOf(it.next().f373132m));
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator<r45.e86> it6 = snsObject2.CommentUserList.iterator();
                        while (it6.hasNext()) {
                            r45.e86 next = it6.next();
                            if (com.tencent.mm.sdk.platformtools.t8.D0(next.f373126d, r17) && next.f373138s > 0) {
                                if (e17 - next.f373131i > f164677e) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "it's time to delete local comment deleted tip:[%s,%s]", java.lang.Integer.valueOf(next.f373132m), next.f373126d);
                                } else if (!arrayList.contains(java.lang.Integer.valueOf(next.f373132m))) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "insert a local fake comment deleted tip:[%s,%s]", java.lang.Integer.valueOf(next.f373132m), next.f373126d);
                                    arrayList2.add(next);
                                }
                            }
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList2)) {
                            snsObject.CommentUserList.addAll(arrayList2);
                        }
                        java.util.Collections.sort(snsObject.CommentUserList, new com.tencent.mm.plugin.sns.model.r5());
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e18, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLocalDeletedComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    public static com.tencent.mm.storage.emotion.EmojiInfo b(r45.l86 l86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        if (l86Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return emojiInfo;
        }
        if (l86Var.f379231e == null) {
            emojiInfo.field_md5 = l86Var.f379230d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return emojiInfo;
        }
        try {
            r45.ri0 ri0Var = new r45.ri0();
            ri0Var.parseFrom(l86Var.f379231e.f371841f.f192156a);
            n22.m.a(ri0Var, emojiInfo);
            emojiInfo.field_temp = 1;
            emojiInfo.field_catalog = 65;
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsEmojiInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return emojiInfo;
    }

    public static r45.jj4 c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        }
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        r45.a90 a90Var = timeLine.ContentObj;
        if (a90Var == null || a90Var.f369840h.size() == 0 || timeLine.ContentObj.f369840h.size() <= i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        }
        r45.jj4 jj4Var = (r45.jj4) timeLine.ContentObj.f369840h.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return jj4Var;
    }

    public static r45.jj4 d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        r45.a90 a90Var = timeLine.ContentObj;
        if (a90Var == null || a90Var.f369840h.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return null;
        }
        java.util.Iterator it = timeLine.ContentObj.f369840h.iterator();
        while (it.hasNext()) {
            r45.jj4 jj4Var = (r45.jj4) it.next();
            if (jj4Var.f377855d.equals(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                return jj4Var;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return null;
    }

    public static com.tencent.mm.protocal.protobuf.SnsObject e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        try {
            if (snsInfo.contentByteMd5 == null) {
                snsInfo.contentByteMd5 = kk.k.g(snsInfo.field_content) + kk.k.g(snsInfo.field_attrBuf);
            }
            java.util.Map map = f164678f;
            if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(snsInfo.contentByteMd5)) {
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) ((java.util.concurrent.ConcurrentHashMap) map).get(snsInfo.contentByteMd5);
                if (snsObject != null) {
                    com.tencent.mm.plugin.sns.model.l4.xj().s(snsObject);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                    return snsObject;
                }
            }
            com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf);
            ((java.util.concurrent.ConcurrentHashMap) map).put(snsInfo.contentByteMd5, snsObject2);
            com.tencent.mm.plugin.sns.model.l4.xj().s(snsObject2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return snsObject2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
            com.tencent.mm.protocal.protobuf.SnsObject snsObject3 = new com.tencent.mm.protocal.protobuf.SnsObject();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMergeSnsObject", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return snsObject3;
        }
    }

    public static com.tencent.mm.protocal.protobuf.SnsObject f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMergeSnsObjectWithCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        try {
            com.tencent.mm.protocal.protobuf.SnsObject s17 = com.tencent.mm.plugin.sns.model.l4.xj().s((com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf));
            if (s17.Id == 0) {
                long j17 = snsInfo.field_snsId;
                if (j17 != 0) {
                    s17.Id = j17;
                }
            }
            ((java.util.concurrent.ConcurrentHashMap) f164678f).clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMergeSnsObjectWithCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return s17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMergeSnsObjectWithCache", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return snsObject;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        r3.close();
        r3 = 1;
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r2.contains(r4) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r4 = r6 + r3;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0018, code lost:
    
        if (r3.moveToFirst() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001a, code lost:
    
        r4 = new com.tencent.mm.plugin.sns.storage.q2();
        r4.convertFrom(r3);
        r4 = r4.field_tagName;
        r5 = com.tencent.mm.sdk.platformtools.t8.f192989a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r4 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r3.moveToNext() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g(java.lang.String r6) {
        /*
            java.lang.String r0 = "getTagName"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            com.tencent.mm.plugin.sns.storage.r2 r3 = com.tencent.mm.plugin.sns.model.l4.Lj()
            android.database.Cursor r3 = r3.J0()
            boolean r4 = r3.moveToFirst()
            if (r4 == 0) goto L33
        L1a:
            com.tencent.mm.plugin.sns.storage.q2 r4 = new com.tencent.mm.plugin.sns.storage.q2
            r4.<init>()
            r4.convertFrom(r3)
            java.lang.String r4 = r4.field_tagName
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r4 != 0) goto L2a
            java.lang.String r4 = ""
        L2a:
            r2.add(r4)
            boolean r4 = r3.moveToNext()
            if (r4 != 0) goto L1a
        L33:
            r3.close()
            r3 = 1
            r4 = r6
        L38:
            boolean r5 = r2.contains(r4)
            if (r5 == 0) goto L51
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            int r5 = r3 + 1
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            r3 = r5
            goto L38
        L51:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.s5.g(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.String r17, int r18, java.util.LinkedList r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.s5.h(java.lang.String, int, java.util.LinkedList, java.lang.String):void");
    }

    public static boolean i(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLocalPrivated", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLocalPrivated", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return false;
        }
        boolean z18 = i17 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLocalPrivated", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return z18;
    }

    public static boolean j(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWsFold", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        boolean z17 = (i17 & 16) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWsFold", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return z17;
    }

    public static java.lang.String k(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("listToString", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (str.length() == 0) {
                str = str2;
            } else {
                str = str + "," + str2;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("listToString", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return str;
    }

    public static r45.cu5 l(r45.cu5 cu5Var, byte[] bArr) {
        r45.cu5 cu5Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mergeOperation", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (bArr != null) {
            try {
                cu5Var2 = ((com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(bArr)).ObjectOperations;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeOperation", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                return null;
            }
        } else {
            cu5Var2 = null;
        }
        if (cu5Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeOperation", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return cu5Var2;
        }
        r45.u96 u96Var = new r45.u96();
        if (cu5Var2 != null) {
            u96Var = (r45.u96) u96Var.parseFrom(cu5Var2.f371841f.f192156a);
        }
        r45.u96 u96Var2 = (r45.u96) new r45.u96().parseFrom(cu5Var.f371841f.f192156a);
        if (u96Var2.f387162h == null) {
            u96Var2.f387162h = u96Var.f387162h;
        }
        r45.ad0 ad0Var = u96Var.f387161g;
        if (ad0Var == null) {
            u96Var2.f387161g = null;
        } else if (u96Var2.f387161g == null) {
            u96Var2.f387161g = ad0Var;
        }
        byte[] byteArray = u96Var2.toByteArray();
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(byteArray);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeOperation", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return cu5Var3;
    }

    public static void m(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.protocal.protobuf.SnsObject snsObject2;
        r45.kb5 kb5Var;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mergePreloadInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            if (snsInfo.getTypeFlag() == 15 && (snsObject2 = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf)) != null && (kb5Var = snsObject2.PreDownloadInfo) != null && (i17 = kb5Var.f378575d) > 0) {
                snsObject.PreDownloadInfo = kb5Var;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo predownload info [%d %d %s] cost[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(snsObject.PreDownloadInfo.f378576e), snsObject.PreDownloadInfo.f378577f, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo error %s", e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergePreloadInfo", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    public static void n(long j17, r45.l76 l76Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        r45.k76 k76Var = l76Var.f379205f;
        if (k76Var.f378462h != 9) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
        if (W0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        try {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(W0.field_attrBuf);
            snsObject.Id = j17;
            java.util.Iterator<r45.e86> it = snsObject.CommentUserList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.e86 next = it.next();
                if (next.f373132m == k76Var.f378467p && !com.tencent.mm.sdk.platformtools.t8.K0(next.f373126d) && next.f373126d.equals(k76Var.f378458d)) {
                    snsObject.CommentUserList.remove(next);
                    break;
                }
            }
            W0.setAttrBuf(snsObject.toByteArray());
            com.tencent.mm.plugin.sns.model.l4.Fj().Y2(snsObject.Id, W0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    public static long o(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.SnsObject snsObject, java.lang.String str, int i17) {
        boolean z17;
        boolean z18;
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (snsInfo == null) {
            snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        }
        byte[] bArr = snsInfo.field_content;
        com.tencent.mm.plugin.sns.model.i4 xj6 = com.tencent.mm.plugin.sns.model.l4.xj();
        long j17 = snsInfo.field_snsId;
        synchronized (xj6) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkNotDel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            java.util.Iterator it = xj6.f164298a.f444248h.iterator();
            while (true) {
                z17 = false;
                if (!it.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkNotDel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    z18 = true;
                    break;
                }
                if (((wa4.o) it.next()).f444270d == j17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkNotDel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    z18 = false;
                    break;
                }
            }
        }
        if (!z18) {
            long j18 = snsObject.Id;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return j18;
        }
        if (snsObject.NoChange != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "hit the filter id:" + snsObject.Id + "  " + ca4.z0.t0(snsObject.Id));
            if (!snsInfo.isSourceExist(i17)) {
                snsInfo.addSourceFlag(i17);
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.plugin.sns.model.l4.Fj().Y2(snsObject.Id, snsInfo);
            }
            long j19 = snsObject.Id;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return j19;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "hasChange id:%s listSize %s Stringid %s", ca4.z0.t0(snsObject.Id), java.lang.Integer.valueOf(snsObject.CommentUserList.size()), ca4.z0.t0(snsObject.Id));
        r45.cu5 cu5Var = snsObject.ObjectDesc;
        if (cu5Var == null || (gVar = cu5Var.f371841f) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "object desc is null");
            long j27 = snsObject.Id;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return j27;
        }
        java.lang.String str2 = new java.lang.String(gVar.g());
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            long j28 = snsObject.Id;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return j28;
        }
        if (!snsInfo.setContent(str2)) {
            long j29 = snsObject.Id;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return j29;
        }
        snsObject.ObjectOperations = l(snsObject.ObjectOperations, snsInfo.field_attrBuf);
        snsObject.ObjectDesc.d(new byte[0]);
        snsInfo.setUserName(snsObject.Username);
        snsInfo.setCreateTime(snsObject.CreateTime);
        snsInfo.setLikeFlag(snsObject.LikeFlag);
        snsInfo.setSnsId(snsObject.Id);
        snsInfo.setStringSeq(snsObject.Id);
        snsInfo.field_serverExtFlag = snsObject.ExtFlag;
        snsInfo.addSourceFlag(i17);
        try {
            if (!snsInfo.isAd()) {
                a(snsInfo, snsObject);
            }
            m(snsInfo, snsObject);
            snsInfo.setAttrBuf(snsObject.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        timeLine.UserName = snsObject.Username;
        int i18 = timeLine.Privated;
        snsInfo.setPravited(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "ext flag %s  extflag %s", java.lang.Long.valueOf(snsObject.Id), java.lang.Integer.valueOf(snsObject.ExtFlag));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkClearOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMultiVideoNeedClearOldVideoConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
        pc4.d dVar = pc4.d.f353410a;
        r45.ga6 p17 = dVar.p();
        boolean z19 = p17 != null && p17.f375061w == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMultiVideoNeedClearOldVideoConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMultiVideoNeedClearOldLivePhotoVideoConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
        r45.ga6 p18 = dVar.p();
        boolean z27 = p18 != null && p18.f375064z == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMultiVideoNeedClearOldLivePhotoVideoConfig", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
        if (z19 || z27) {
            ((ku5.t0) ku5.t0.f312615d).h(new sc4.b(bArr, timeLine, z19, z27), "sns_multi_video_clear");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkClearOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        int i19 = snsObject.ExtFlag;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBIDIRFRIEND", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        boolean z28 = (i19 & 1) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBIDIRFRIEND", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (z28) {
            snsInfo.setExtFlag();
        } else {
            snsInfo.unSetExtFlag();
        }
        if (snsObject.WeiShangFeedType != 0) {
            snsInfo.setWsFeedTypeFlag();
        } else {
            snsInfo.clearWsFeedTypeFlag();
        }
        if (j(snsObject.ExtFlag)) {
            snsInfo.addSourceFlag(128);
            com.tencent.mm.plugin.sns.storage.s2 y07 = com.tencent.mm.plugin.sns.model.l4.Qj().y0(snsObject.Id);
            if (y07 != null && !com.tencent.mm.sdk.platformtools.t8.M0(y07.field_groupStrcut)) {
                r45.qb6 qb6Var = new r45.qb6();
                try {
                    qb6Var.parseFrom(y07.field_groupStrcut);
                    z17 = !com.tencent.mm.sdk.platformtools.t8.L0(qb6Var.f383810d);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsInfoStorageLogic", "parse SnsWsGroupStruct fail:%s", e18.getMessage());
                }
            }
            if (y07 == null || !z17) {
                snsInfo.cleanWsFoldFlag();
            } else {
                snsInfo.setWsFoldFlag();
            }
        } else {
            snsInfo.cleanWsFoldFlag();
        }
        if (i18 == 1 && i17 != 4 && i17 != 16 && i17 != 64) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoStorageLogic", "svr error push me the private pic in timelnie or others");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return 0L;
        }
        if (i18 == 1 || (!str.equals(snsObject.Username) && i17 == 4)) {
            snsInfo.setLocalPrivate();
        }
        snsInfo.setTimeLine(timeLine);
        snsInfo.setTypeFlag(timeLine.ContentObj.f369837e);
        snsInfo.setSubTypeFlag(timeLine.ContentObj.f369841i);
        if (!com.tencent.mm.plugin.sns.model.l4.Fj().Y2(snsObject.Id, snsInfo)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoStorageLogic", "");
        }
        if (j62.e.g().c(new com.tencent.mm.plugin.sns.config.RCSnsCmtEmoticonAutoLoad()) == 1) {
            java.util.Iterator<r45.e86> it6 = snsObject.CommentUserList.iterator();
            while (it6.hasNext()) {
                java.util.Iterator it7 = it6.next().f373140u.iterator();
                while (it7.hasNext()) {
                    com.tencent.mm.storage.emotion.EmojiInfo b17 = b((r45.l86) it7.next());
                    if (com.tencent.mm.storage.n5.f().c().u1(b17.field_md5) == null) {
                        com.tencent.mm.storage.n5.f().c().insert(b17);
                        zq.h.f474972a.e(b17, null);
                    }
                }
            }
        }
        long j37 = snsObject.Id;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return j37;
    }

    public static long p(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        long q17 = q(snsObject, "", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return q17;
    }

    public static long q(com.tencent.mm.protocal.protobuf.SnsObject snsObject, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(snsObject.Id);
        if (W0 == null) {
            W0 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        }
        long o17 = o(W0, snsObject, str, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return o17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r(int r17) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.s5.r(int):boolean");
    }

    public static void s(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unsetOmitResendFlag", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        com.tencent.mm.plugin.sns.storage.SnsInfo i18 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        if (i18 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unsetOmitResendFlag", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        i18.unsetOmittedFailResend();
        com.tencent.mm.plugin.sns.model.l4.Fj().w3(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unsetOmitResendFlag", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    public static boolean t(long j17, r45.l76 l76Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        r45.k76 k76Var = l76Var.f379205f;
        int i17 = k76Var.f378462h;
        if (i17 != 1 && i17 != 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return true;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
        if (W0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return true;
        }
        if (W0.getTypeFlag() == 21 && !ha4.h.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "passed because close lucky");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return false;
        }
        try {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(W0.field_attrBuf);
            snsObject.Id = j17;
            int i18 = k76Var.f378462h;
            if (i18 == 1) {
                java.util.Iterator<r45.e86> it = snsObject.LikeUserList.iterator();
                while (it.hasNext()) {
                    r45.e86 next = it.next();
                    if (next.f373131i == k76Var.f378464m && next.f373126d.equals(k76Var.f378458d)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                        return true;
                    }
                }
                snsObject.LikeUserList.add(com.tencent.mm.plugin.sns.model.i4.l(l76Var));
            } else if (i18 == 2) {
                java.util.Iterator<r45.e86> it6 = snsObject.CommentUserList.iterator();
                while (it6.hasNext()) {
                    r45.e86 next2 = it6.next();
                    if (next2.f373131i == k76Var.f378464m && next2.f373126d.equals(k76Var.f378458d)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                        return true;
                    }
                }
                snsObject.CommentUserList.add(com.tencent.mm.plugin.sns.model.i4.l(l76Var));
            }
            W0.setAttrBuf(snsObject.toByteArray());
            com.tencent.mm.plugin.sns.model.l4.Fj().Y2(snsObject.Id, W0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        return true;
    }

    public static void u(long j17, r45.l76 l76Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        r45.k76 k76Var = l76Var.f379205f;
        if (k76Var.f378462h != 13) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
        if (W0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            return;
        }
        try {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(W0.field_attrBuf);
            snsObject.Id = j17;
            if (snsObject.SnsRedEnvelops == null) {
                snsObject.SnsRedEnvelops = new r45.da6();
            }
            if (k76Var.f378462h == 13) {
                java.util.Iterator it = snsObject.SnsRedEnvelops.f372275e.iterator();
                while (it.hasNext()) {
                    if (((r45.b96) it.next()).f370639d.equals(k76Var.f378458d)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                        return;
                    }
                }
                r45.b96 b96Var = new r45.b96();
                b96Var.f370641f = k76Var.f378471t;
                b96Var.f370640e = k76Var.f378464m;
                b96Var.f370639d = k76Var.f378458d;
                snsObject.SnsRedEnvelops.f372275e.add(b96Var);
                r45.da6 da6Var = snsObject.SnsRedEnvelops;
                da6Var.f372274d = da6Var.f372275e.size();
            }
            W0.setAttrBuf(snsObject.toByteArray());
            com.tencent.mm.plugin.sns.model.l4.Fj().Y2(snsObject.Id, W0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoStorageLogic", "error for update hbaction " + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updataHbAction", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }

    public static void v(java.util.LinkedList linkedList, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSnsSearchIndicator", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (i17 == 0) {
            f164673a = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList.getFirst()).Id;
            f164674b = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList.getLast()).Id;
        } else if (i17 == 1) {
            f164673a = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList.getFirst()).Id;
        } else if (i17 == 2) {
            f164674b = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList.getLast()).Id;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSnsSearchIndicator", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
    }
}
