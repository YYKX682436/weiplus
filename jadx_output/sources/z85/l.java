package z85;

/* loaded from: classes12.dex */
public class l extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f470807e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.emotion.EmojiInfo.L2, "EmojiInfo"), "CREATE INDEX IF NOT EXISTS emojiinfogrouptempindex  on EmojiInfo  (  groupId,temp )", "CREATE INDEX IF NOT EXISTS emojiinfogatalogindex  on EmojiInfo  (  catalog )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470808d;

    public l(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.emotion.EmojiInfo.L2, "EmojiInfo", null);
        this.f470808d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r0.add(r3.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r3.moveToNext() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r3.moveToFirst() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List C1(int r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " select md5 from EmojiInfo"
            r1.<init>(r2)
            r2 = 1
            if (r8 != r2) goto L15
            java.lang.String r8 = " where groupId = \"capture\""
            r1.append(r8)
            goto L1c
        L15:
            java.lang.String r8 = " where catalog = 81"
            r1.append(r8)
            l75.e0 r8 = com.tencent.mm.storage.emotion.EmojiInfo.L2
        L1c:
            java.lang.String r8 = " and state = 4"
            r1.append(r8)
            r8 = 0
            r3 = 0
            l75.k0 r4 = r7.f470808d     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r5 = 2
            android.database.Cursor r3 = r4.f(r1, r3, r5)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r3 == 0) goto L43
            boolean r1 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r1 == 0) goto L43
        L36:
            java.lang.String r1 = r3.getString(r8)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r0.add(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            boolean r1 = r3.moveToNext()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r1 != 0) goto L36
        L43:
            if (r3 == 0) goto L60
        L45:
            r3.close()
            goto L60
        L49:
            r8 = move-exception
            goto L61
        L4b:
            r1 = move-exception
            java.lang.String r4 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r5 = "get need to sync emoji MD5 list failed :%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L49
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z3.c(r1)     // Catch: java.lang.Throwable -> L49
            r2[r8] = r1     // Catch: java.lang.Throwable -> L49
            com.tencent.mars.xlog.Log.e(r4, r5, r2)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L60
            goto L45
        L60:
            return r0
        L61:
            if (r3 == 0) goto L66
            r3.close()
        L66:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.C1(int):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r2 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int D0(boolean r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
            if (r7 == 0) goto L2a
            r7 = 81
            r1 = 18
            if (r8 != 0) goto L1a
            java.lang.String r8 = java.lang.String.valueOf(r1)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String[] r7 = new java.lang.String[]{r8, r7}
            java.lang.String r8 = "select count(*) from EmojiInfo where catalog IN (?,?)"
            goto L3d
        L1a:
            java.lang.String r8 = java.lang.String.valueOf(r1)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String[] r7 = new java.lang.String[]{r8, r7}
            java.lang.String r8 = "select count(*) from EmojiInfo where catalog IN (?,?) AND captureStatus=0"
            goto L3d
        L2a:
            java.lang.String r7 = "81"
            if (r8 != 0) goto L36
            java.lang.String[] r7 = new java.lang.String[]{r7}
            java.lang.String r8 = "select count(*) from EmojiInfo where catalog=?"
            goto L3d
        L36:
            java.lang.String[] r7 = new java.lang.String[]{r7}
            java.lang.String r8 = "select count(*) from EmojiInfo where catalog=? AND captureStatus=0"
        L3d:
            r1 = 0
            r2 = 0
            l75.k0 r3 = r6.f470808d     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            r4 = 2
            android.database.Cursor r2 = r3.f(r8, r7, r4)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            if (r2 == 0) goto L52
            boolean r7 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            if (r7 == 0) goto L52
            int r1 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
        L52:
            if (r2 == 0) goto L7b
        L54:
            r2.close()
            goto L7b
        L58:
            r7 = move-exception
            goto L7c
        L5a:
            r7 = move-exception
            java.lang.String r8 = "exception:%s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L58
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.z3.c(r7)     // Catch: java.lang.Throwable -> L58
            r4[r1] = r5     // Catch: java.lang.Throwable -> L58
            com.tencent.mars.xlog.Log.e(r0, r8, r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = "[countCustomEmoji]Exception:%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L58
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L58
            r3[r1] = r7     // Catch: java.lang.Throwable -> L58
            com.tencent.mars.xlog.Log.e(r0, r8, r3)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L7b
            goto L54
        L7b:
            return r1
        L7c:
            if (r2 == 0) goto L81
            r2.close()
        L81:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.D0(boolean, boolean):int");
    }

    public final java.util.List D2(java.io.InputStream[] inputStreamArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            javax.xml.parsers.DocumentBuilder newDocumentBuilder = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder();
            for (java.io.InputStream inputStream : inputStreamArr) {
                if (inputStream != null) {
                    org.w3c.dom.NodeList elementsByTagName = newDocumentBuilder.parse(inputStream).getDocumentElement().getElementsByTagName("catalog");
                    for (int i17 = 0; i17 < elementsByTagName.getLength(); i17++) {
                        org.w3c.dom.Element element = (org.w3c.dom.Element) elementsByTagName.item(i17);
                        int intValue = java.lang.Integer.decode(element.getAttribute(dm.i4.COL_ID)).intValue();
                        org.w3c.dom.NodeList elementsByTagName2 = element.getElementsByTagName("emoji");
                        for (int i18 = 0; i18 < elementsByTagName2.getLength(); i18++) {
                            h12.b0.b();
                            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo(h12.b0.a());
                            org.w3c.dom.Element element2 = (org.w3c.dom.Element) elementsByTagName2.item(i18);
                            emojiInfo.field_md5 = element2.getAttribute("md5");
                            if (emojiInfo.z0()) {
                                emojiInfo.field_catalog = intValue;
                                emojiInfo.field_groupId = intValue + "";
                                emojiInfo.field_name = element2.getAttribute(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                                emojiInfo.field_type = java.lang.Integer.decode(element2.getAttribute("type")).intValue();
                                org.w3c.dom.Node firstChild = element2.getFirstChild();
                                java.lang.String data = firstChild instanceof org.w3c.dom.CharacterData ? ((org.w3c.dom.CharacterData) firstChild).getData() : "";
                                if (emojiInfo.field_type == 4) {
                                    data = new java.lang.String(android.util.Base64.decode(data, 0));
                                }
                                emojiInfo.field_content = data;
                                arrayList.add(emojiInfo);
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfoStorage", "parse xml error; " + e17.getMessage());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r7.moveToFirst() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r4.add(r7.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r7.moveToNext() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r7 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r4.size() > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] preparedDeleteCustomEmojiList failed. sync list is null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        r0 = new java.util.ArrayList();
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r4.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        r5 = (java.lang.String) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r13.contains(r5.toLowerCase()) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        r0.add(r5);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] delete:%s", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        n1(r0, r12);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDeleteCustomEmojiList user time:%d succes. size:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r2), java.lang.Integer.valueOf(r0.size()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0077, code lost:
    
        if (r7 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean F2(int r12, java.util.List r13) {
        /*
            r11 = this;
            java.lang.String r0 = "[cpan] begin preparedDeleteCustomEmojiList"
            java.lang.String r1 = "MicroMsg.emoji.EmojiInfoStorage"
            com.tencent.mars.xlog.Log.i(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 0
            if (r13 == 0) goto Ld8
            int r4 = r13.size()
            if (r4 > 0) goto L16
            goto Ld8
        L16:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = " select md5 from EmojiInfo"
            r5.<init>(r6)
            r6 = 1
            if (r12 != r6) goto L2b
            java.lang.String r7 = " where groupId = \"capture\" and captureStatus = 0"
            r5.append(r7)
            goto L32
        L2b:
            java.lang.String r7 = " where catalog = 81"
            r5.append(r7)
            l75.e0 r7 = com.tencent.mm.storage.emotion.EmojiInfo.L2
        L32:
            java.lang.String r7 = " and state in (3"
            r5.append(r7)
            java.lang.String r7 = " , 4"
            r5.append(r7)
            java.lang.String r7 = " ) "
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r7 = 0
            l75.k0 r8 = r11.f470808d     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            r9 = 2
            android.database.Cursor r7 = r8.f(r5, r7, r9)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r7 == 0) goto L62
            boolean r5 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r5 == 0) goto L62
        L55:
            java.lang.String r5 = r7.getString(r0)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            r4.add(r5)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            boolean r5 = r7.moveToNext()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r5 != 0) goto L55
        L62:
            if (r7 == 0) goto L7c
            goto L79
        L65:
            r12 = move-exception
            goto Ld2
        L67:
            r5 = move-exception
            java.lang.String r8 = "get download custom emoji MD5 list failed :%s"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L65
            boolean r10 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.z3.c(r5)     // Catch: java.lang.Throwable -> L65
            r9[r0] = r5     // Catch: java.lang.Throwable -> L65
            com.tencent.mars.xlog.Log.e(r1, r8, r9)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L7c
        L79:
            r7.close()
        L7c:
            int r5 = r4.size()
            if (r5 > 0) goto L88
            java.lang.String r12 = "[cpan] preparedDeleteCustomEmojiList failed. sync list is null"
            com.tencent.mars.xlog.Log.i(r1, r12)
            return r0
        L88:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L91:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = r5.toLowerCase()
            boolean r7 = r13.contains(r7)
            if (r7 != 0) goto L91
            r0.add(r5)
            java.lang.String r7 = "[cpan] delete:%s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.tencent.mars.xlog.Log.i(r1, r7, r5)
            goto L91
        Lb4:
            r11.n1(r0, r12)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r2
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            int r13 = r0.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13}
            java.lang.String r13 = "[cpan] end preparedDeleteCustomEmojiList user time:%d succes. size:%d"
            com.tencent.mars.xlog.Log.i(r1, r13, r12)
            return r6
        Ld2:
            if (r7 == 0) goto Ld7
            r7.close()
        Ld7:
            throw r12
        Ld8:
            java.lang.String r12 = "[cpan] preparedDeleteCustomEmojiList failed. list is null"
            com.tencent.mars.xlog.Log.i(r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.F2(int, java.util.List):boolean");
    }

    public boolean G2(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        if (emojiInfo == null || !emojiInfo.z0()) {
            com.tencent.mars.xlog.Log.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "update %s, temp:%s", emojiInfo.field_md5, java.lang.Integer.valueOf(emojiInfo.field_temp));
        int p17 = this.f470808d.p("EmojiInfo", emojiInfo.convertTo(), "md5=?", new java.lang.String[]{emojiInfo.getMd5()});
        if (p17 > 0) {
            doNotify(emojiInfo.getMd5());
            doNotify("event_update_emoji");
        }
        return p17 > 0;
    }

    public com.tencent.mm.storage.emotion.EmojiInfo J0(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        return L0(emojiInfo, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r4.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        r5 = new com.tencent.mm.storage.emotion.EmojiInfo();
        r5.convertFrom(r4);
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (r4.moveToNext() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List K1(int r4, boolean r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "select * from EmojiInfo where catalog = "
            r1.<init>(r2)
            r1.append(r4)
            if (r5 != 0) goto L17
            java.lang.String r4 = " and state != 4"
            r1.append(r4)
        L17:
            java.lang.String r4 = " order by reserved3 asc "
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5 = 0
            l75.k0 r1 = r3.f470808d
            android.database.Cursor r4 = r1.B(r4, r5)
            if (r4 == 0) goto L43
            boolean r5 = r4.moveToFirst()
            if (r5 == 0) goto L40
        L2f:
            com.tencent.mm.storage.emotion.EmojiInfo r5 = new com.tencent.mm.storage.emotion.EmojiInfo
            r5.<init>()
            r5.convertFrom(r4)
            r0.add(r5)
            boolean r5 = r4.moveToNext()
            if (r5 != 0) goto L2f
        L40:
            r4.close()
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.K1(int, boolean):java.util.List");
    }

    public com.tencent.mm.storage.emotion.EmojiInfo L0(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, boolean z17) {
        if (emojiInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.getMd5()) || emojiInfo.getMd5().length() <= 0) {
            com.tencent.mars.xlog.Log.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "create: %s, temp:%s", emojiInfo.field_md5, java.lang.Integer.valueOf(emojiInfo.field_temp));
        if (!insert(emojiInfo)) {
            return null;
        }
        if (z17) {
            doNotify("create_emoji_info_notify");
        }
        return emojiInfo;
    }

    public boolean O2(java.util.List list) {
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "updateEmojiURL failed. empty list");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "updateEmojiURL size:%d", java.lang.Integer.valueOf(list.size()));
        for (int i17 = 0; i17 < list.size(); i17++) {
            r45.ri0 ri0Var = (r45.ri0) list.get(i17);
            com.tencent.mm.storage.emotion.EmojiInfo u17 = u1(ri0Var.f384886d);
            if (u17 == null) {
                u17 = new com.tencent.mm.storage.emotion.EmojiInfo();
                u17.field_md5 = ri0Var.f384886d;
                u17.field_catalog = 65;
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "new emoji as received when updateEmoji url");
            }
            n22.m.a(ri0Var, u17);
            V2(u17);
        }
        return true;
    }

    public com.tencent.mm.storage.emotion.EmojiInfo P0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3) {
        return b1(str, str2, i17, i18, i19, null, null, null, str3, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r4.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        h12.b0.b();
        r9 = new com.tencent.mm.storage.emotion.EmojiInfo(h12.b0.a());
        r9.convertFrom(r4);
        r0.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r4.moveToNext() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List P1(java.lang.String r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "select * from EmojiInfo where groupId=? and temp=? order by idx asc"
            r2 = 1
            r3 = 0
            r4 = 0
            l75.k0 r5 = r8.f470808d     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r6 = 2
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r7[r3] = r9     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.lang.String r9 = "0"
            r7[r2] = r9     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            android.database.Cursor r4 = r5.f(r1, r7, r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r4 == 0) goto L3a
            boolean r9 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r9 == 0) goto L3a
        L22:
            com.tencent.mm.storage.emotion.EmojiInfo r9 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            h12.b0.b()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            java.lang.String r1 = h12.b0.a()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r9.convertFrom(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r0.add(r9)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            boolean r9 = r4.moveToNext()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r9 != 0) goto L22
        L3a:
            if (r4 == 0) goto L55
        L3c:
            r4.close()
            goto L55
        L40:
            r9 = move-exception
            goto L56
        L42:
            r9 = move-exception
            java.lang.String r1 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r5 = "[getEmojiListByGroupId] Exception:%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L40
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L40
            r2[r3] = r9     // Catch: java.lang.Throwable -> L40
            com.tencent.mars.xlog.Log.w(r1, r5, r2)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L55
            goto L3c
        L55:
            return r0
        L56:
            if (r4 == 0) goto L5b
            r4.close()
        L5b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.P1(java.lang.String):java.util.List");
    }

    public android.database.Cursor S1(int i17) {
        return this.f470808d.E("EmojiInfo", null, "catalog=? and temp=?", new java.lang.String[]{"" + i17, "0"}, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "create key :%s" + com.tencent.mm.sdk.platformtools.t8.G1(r1));
        r0 = new com.tencent.mm.storage.emotion.EmojiInfo();
        r0.field_md5 = r1;
        r0.field_catalog = com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ac, code lost:
    
        if (b2(r0) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00af, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        r1 = kk.k.g("com.tencent.mm.key.MicroMsg.Wechat".getBytes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005b, code lost:
    
        r1 = kk.v.a(gm0.j1.b().h());
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "uin is %s", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r1) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        r1 = kk.k.g(r1.getBytes());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String T1() {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r1 = "had key :%s"
            java.lang.String r2 = "SELECT md5 FROM EmojiInfo WHERE catalog =?"
            r3 = 153(0x99, float:2.14E-43)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r5 = 0
            r6 = 0
            l75.k0 r7 = r9.f470808d     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r8 = 2
            android.database.Cursor r2 = r7.f(r2, r4, r8)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r2 == 0) goto L3e
            boolean r4 = r2.moveToFirst()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> Lb0
            if (r4 == 0) goto L3e
            java.lang.String r4 = r2.getString(r5)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> Lb0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> Lb0
            r7.<init>(r1)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> Lb0
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.t8.G1(r4)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> Lb0
            r7.append(r1)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> Lb0
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> Lb0
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> Lb0
            r2.close()
            return r4
        L3c:
            r1 = move-exception
            goto L48
        L3e:
            if (r2 == 0) goto L5b
        L40:
            r2.close()
            goto L5b
        L44:
            r0 = move-exception
            goto Lb2
        L46:
            r1 = move-exception
            r2 = r6
        L48:
            java.lang.String r4 = "createKey :%s"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lb0
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z3.c(r1)     // Catch: java.lang.Throwable -> Lb0
            r7[r5] = r1     // Catch: java.lang.Throwable -> Lb0
            com.tencent.mars.xlog.Log.e(r0, r4, r7)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L5b
            goto L40
        L5b:
            gm0.m r1 = gm0.j1.b()
            int r1 = r1.h()
            java.lang.String r1 = kk.v.a(r1)
            java.lang.String r2 = "uin is %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            com.tencent.mars.xlog.Log.i(r0, r2, r4)
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r2 != 0) goto L80
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = kk.k.g(r1)
            goto L8a
        L80:
            java.lang.String r1 = "com.tencent.mm.key.MicroMsg.Wechat"
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = kk.k.g(r1)
        L8a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "create key :%s"
            r2.<init>(r4)
            java.lang.String r4 = com.tencent.mm.sdk.platformtools.t8.G1(r1)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r0, r2)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = new com.tencent.mm.storage.emotion.EmojiInfo
            r0.<init>()
            r0.field_md5 = r1
            r0.field_catalog = r3
            boolean r0 = r9.insert(r0)
            if (r0 == 0) goto Laf
            return r1
        Laf:
            return r6
        Lb0:
            r0 = move-exception
            r6 = r2
        Lb2:
            if (r6 == 0) goto Lb7
            r6.close()
        Lb7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.T1():java.lang.String");
    }

    public boolean V2(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        if (emojiInfo == null || !emojiInfo.z0()) {
            com.tencent.mars.xlog.Log.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "updateNoNotify %s, temp:%s", emojiInfo.field_md5, java.lang.Integer.valueOf(emojiInfo.field_temp));
        return this.f470808d.p("EmojiInfo", emojiInfo.convertTo(), "md5=?", new java.lang.String[]{emojiInfo.getMd5()}) > 0;
    }

    public com.tencent.mm.storage.emotion.EmojiInfo W0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return b1(str, str2, i17, i18, i19, null, str3, str4, str5, 1);
    }

    public boolean X1(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init");
        com.tencent.mm.storage.emotion.EmojiInfo u17 = u1("86cb157e9c44b2c9934e4e430790776d");
        com.tencent.mm.storage.emotion.EmojiInfo u18 = u1("68f9864ca5c0a5d823ed7184e113a4aa");
        l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
        int y07 = y0(32);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,group art custom catalog count:%d", java.lang.Integer.valueOf(y07));
        if (u17 != null || ((u18 != null && u18.j().length() == 0) || y07 <= 2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,delete all group for very old version");
            d1(17);
            d1(50);
            d1(49);
        }
        com.tencent.mm.storage.emotion.EmojiInfo u19 = u1("9bd1281af3a31710a45b84d736363691");
        if (u19 != null && u19.field_catalog == 17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,delete all group for 5.0");
            d1(17);
            d1(50);
            d1(49);
        }
        java.io.InputStream a17 = h12.e.a(context, "icon_002_cover.png");
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,delete all group for 5.1,update emoji tuzi  for 4.4");
            d1(17);
            d1(50);
            d1(49);
        }
        if (a17 != null) {
            try {
                a17.close();
            } catch (java.lang.Exception unused) {
            }
        }
        l75.e0 e0Var2 = com.tencent.mm.storage.emotion.EmojiInfo.L2;
        if (y0(17) != 0) {
            return true;
        }
        java.io.InputStream inputStream = null;
        try {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init,parse xml start.");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                inputStream = context.getAssets().open("custom_emoji/manifest.xml");
                java.util.List D2 = D2(new java.io.InputStream[]{inputStream});
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]parse xml time: %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                if (((java.util.ArrayList) D2).size() > 0) {
                    k2(D2);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "insert time: %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfoStorage", "[oneliang]init, db error. " + e18.getMessage());
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                    }
                }
            }
            return true;
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
                }
            }
            throw th6;
        }
    }

    public void Y2(android.content.Context context, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        int i17;
        int i18 = emojiInfo.field_catalog;
        l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
        if (i18 == 17 || i18 == 50 || i18 == 49) {
            java.io.InputStream inputStream = null;
            try {
                try {
                    inputStream = h12.e.a(context, emojiInfo.getName());
                    r2 = inputStream != null ? inputStream.available() : 0;
                } catch (java.io.IOException e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                        }
                    }
                }
                i17 = r2;
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e19) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                    }
                }
            }
        } else {
            i17 = (int) com.tencent.mm.vfs.w6.k(emojiInfo.N0());
        }
        if (i17 == 0 || i17 == emojiInfo.field_size) {
            return;
        }
        emojiInfo.field_size = i17;
        G2(emojiInfo);
    }

    public com.tencent.mm.storage.emotion.EmojiInfo b1(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i27) {
        com.tencent.mm.storage.emotion.EmojiInfo u17;
        if (str == null || str.length() <= 0) {
            com.tencent.mars.xlog.Log.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
            return null;
        }
        if (str.length() <= 0) {
            com.tencent.mars.xlog.Log.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
            u17 = null;
        } else {
            u17 = u1(str);
            if (u17 == null) {
                h12.b0.b();
                u17 = new com.tencent.mm.storage.emotion.EmojiInfo(h12.b0.a());
                u17.field_catalog = i17;
            }
            u17.field_md5 = str;
            u17.field_svrid = str2;
            u17.field_type = i18;
            u17.field_size = i19;
            u17.field_state = 0;
            u17.field_reserved1 = str3;
            u17.field_reserved2 = str4;
            u17.field_app_id = str5;
            u17.field_temp = i27;
            u17.field_reserved4 = 0;
            if (!android.text.TextUtils.isEmpty(str6)) {
                u17.field_groupId = str6;
            }
        }
        u17.field_state = 3;
        if (!insert(u17)) {
            return null;
        }
        doNotify("create_emoji_info_notify");
        return u17;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: b2, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        if (emojiInfo == null || !emojiInfo.z0()) {
            com.tencent.mars.xlog.Log.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "insert: %s", emojiInfo.field_md5);
        long m17 = this.f470808d.m("EmojiInfo", "md5", emojiInfo.convertTo());
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "insert: %s, %s", emojiInfo.field_md5, java.lang.Long.valueOf(m17));
        return m17 >= 0;
    }

    public boolean d1(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(i17);
        return this.f470808d.delete("EmojiInfo", "catalog=?", new java.lang.String[]{sb6.toString()}) >= 0;
    }

    public boolean f1(java.lang.String str) {
        if (str == null || str.length() != 32) {
            com.tencent.mars.xlog.Log.f("MicroMsg.emoji.EmojiInfoStorage", "delete by md5 assertion");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "deleteByMd5: %s", str);
        int delete = this.f470808d.delete("EmojiInfo", "md5=?", new java.lang.String[]{str});
        if (delete > 0) {
            doNotify("event_update_emoji");
        }
        return delete > 0;
    }

    @Override // l75.n0
    public java.lang.String getTableName() {
        return "EmojiInfo";
    }

    public boolean h2(java.util.List list, java.lang.String str) {
        if (list == null || list.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "insert emoji list faild. list is null or size is 0.");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "insertEmojiList groupId:%s size:%d", str, java.lang.Integer.valueOf(list.size()));
        l75.k0 k0Var = this.f470808d;
        long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
        java.util.List P1 = P1(str);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = ((java.util.ArrayList) P1).iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) it.next();
            hashMap.put(emojiInfo.getMd5(), emojiInfo);
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = (com.tencent.mm.storage.emotion.EmojiInfo) list.get(i17);
            emojiInfo2.field_temp = 0;
            k0Var.m("EmojiInfo", "md5", emojiInfo2.convertTo());
            hashMap.remove(emojiInfo2.getMd5());
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo3 = (com.tencent.mm.storage.emotion.EmojiInfo) entry.getValue();
            emojiInfo3.field_temp = 1;
            k0Var.p("EmojiInfo", emojiInfo3.convertTo(), "md5=?", new java.lang.String[]{str2});
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "insertEmojiList set emoji temp %s", emojiInfo3.field_md5);
        }
        if (k0Var != null) {
            k0Var.w(java.lang.Long.valueOf(F));
        }
        return true;
    }

    public boolean i1(java.util.List list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UPDATE EmojiInfo  SET groupId=\"\" where md5 IN (");
        for (int i17 = 0; i17 < list.size(); i17++) {
            sb6.append("'" + ((java.lang.String) list.get(i17)) + "'");
            if (i17 < list.size() - 1) {
                sb6.append(",");
            }
        }
        sb6.append(")");
        if (this.f470808d.A("EmojiInfo", sb6.toString())) {
            doNotify("delete_emoji_info_notify");
        }
        return true;
    }

    public boolean k1(java.util.List list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UPDATE EmojiInfo  SET catalog=65,source=0,needupload=0 where md5 IN (");
        l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
        for (int i17 = 0; i17 < list.size(); i17++) {
            sb6.append("'" + ((java.lang.String) list.get(i17)) + "'");
            if (i17 < list.size() - 1) {
                sb6.append(",");
            }
        }
        sb6.append(")");
        if (this.f470808d.A("EmojiInfo", sb6.toString())) {
            doNotify("delete_emoji_info_notify");
        }
        return true;
    }

    public boolean k2(java.util.List list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        l75.k0 k0Var = this.f470808d;
        long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (k0Var.m("EmojiInfo", "md5", ((com.tencent.mm.storage.emotion.EmojiInfo) it.next()).convertTo()) < 0) {
                if (k0Var != null) {
                    k0Var.w(java.lang.Long.valueOf(F));
                }
                return false;
            }
        }
        if (k0Var == null) {
            return true;
        }
        k0Var.w(java.lang.Long.valueOf(F));
        return true;
    }

    public boolean n1(java.util.List list, int i17) {
        return i17 == 1 ? i1(list) : k1(list);
    }

    public java.util.List o1(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List K1 = K1(18, false);
        if (((java.util.ArrayList) K1).size() > 0) {
            gr.v vVar = gr.v.f274696a;
            vVar.a(false);
            vVar.b().putBoolean("game_to_custom", false);
        }
        arrayList.addAll(K1(81, z17));
        arrayList.addAll(K1);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (r15.moveToFirst() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r12.add(r15.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r15.moveToNext() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r15 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        r0 = r12.size();
        r12.removeAll(r22);
        r14 = r12.subList(0, r21);
        r3 = r12.subList(r21, r12.size());
        r8 = new java.util.ArrayList();
        r8.addAll(r14);
        r8.addAll(r22);
        r8.addAll(r3);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "Rearranged list: head.size: %d, md5List.size: %d, foot.size: %d", java.lang.Integer.valueOf(r14.size()), java.lang.Integer.valueOf(r22.size()), java.lang.Integer.valueOf(r3.size()), java.lang.Integer.valueOf(r8.size()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        if (r0 != r8.size()) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
    
        r0 = r8.iterator();
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f4, code lost:
    
        if (r0.hasNext() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f6, code lost:
    
        r8 = u1((java.lang.String) r0.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0100, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010a, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r8.getMd5()) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
    
        if (r20 != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0114, code lost:
    
        if (r8.m1() != qk.x6.STATUS_SUCCESS) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        r8.field_idx = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0131, code lost:
    
        if (r9.m("EmojiInfo", "md5", r8.convertTo()) >= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0133, code lost:
    
        if (r9 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0135, code lost:
    
        r9.w(java.lang.Long.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013c, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end moveCustomEmojiByMd5 user time:%d faild ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0119, code lost:
    
        r8.field_idx = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011d, code lost:
    
        r8.field_reserved3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0150, code lost:
    
        if (r9 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0152, code lost:
    
        r9.w(java.lang.Long.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0159, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end moveCustomEmojiByMd5 user time:%d succes. size:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r6), java.lang.Integer.valueOf(r22.size()));
        doNotify("event_update_emoji");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019c, code lost:
    
        throw new java.lang.IllegalStateException("Whoops, we lost something? old size is " + r0 + ", new size is " + r8.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0097, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0095, code lost:
    
        if (r15 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o2(int r20, int r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.o2(int, int, java.util.List):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.storage.emotion.EmojiInfo p1(long r13) {
        /*
            r12 = this;
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 0
            l75.k0 r2 = r12.f470808d     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r3 = "EmojiInfo"
            r4 = 0
            java.lang.String r5 = "captureEnterTime=?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            r6[r0] = r13     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r13 = r2.D(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            if (r13 == 0) goto L41
            boolean r14 = r13.moveToFirst()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L5d
            if (r14 == 0) goto L41
            com.tencent.mm.storage.emotion.EmojiInfo r14 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L5d
            h12.b0.b()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L5d
            java.lang.String r2 = h12.b0.a()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L5d
            r14.<init>(r2)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L5d
            r14.convertFrom(r13)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L5d
            r1 = r14
            goto L41
        L3a:
            r1 = move-exception
            goto L4d
        L3c:
            r14 = move-exception
            r11 = r1
            r1 = r14
            r14 = r11
            goto L4d
        L41:
            if (r13 == 0) goto L5c
            r13.close()
            goto L5c
        L47:
            r14 = move-exception
            goto L5f
        L49:
            r13 = move-exception
            r14 = r1
            r1 = r13
            r13 = r14
        L4d:
            java.lang.String r2 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r3 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L5d
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r1, r3, r0)     // Catch: java.lang.Throwable -> L5d
            if (r13 == 0) goto L5b
            r13.close()
        L5b:
            r1 = r14
        L5c:
            return r1
        L5d:
            r14 = move-exception
            r1 = r13
        L5f:
            if (r1 == 0) goto L64
            r1.close()
        L64:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.p1(long):com.tencent.mm.storage.emotion.EmojiInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.storage.emotion.EmojiInfo u1(java.lang.String r15) {
        /*
            r14 = this;
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r15)
            java.lang.String r1 = "MicroMsg.emoji.EmojiInfoStorage"
            r2 = 0
            if (r0 != 0) goto L70
            int r0 = r15.length()
            r3 = 32
            if (r0 == r3) goto L13
            goto L70
        L13:
            l75.k0 r4 = r14.f470808d     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r5 = "EmojiInfo"
            r6 = 0
            java.lang.String r7 = "md5=?"
            java.lang.String[] r8 = new java.lang.String[]{r15}     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2
            android.database.Cursor r15 = r4.D(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            if (r15 == 0) goto L46
            boolean r0 = r15.moveToFirst()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L68
            if (r0 == 0) goto L46
            com.tencent.mm.storage.emotion.EmojiInfo r0 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L68
            h12.b0.b()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L68
            java.lang.String r3 = h12.b0.a()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L68
            r0.<init>(r3)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L68
            r0.convertFrom(r15)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L68
            r2 = r0
            goto L46
        L3f:
            r2 = move-exception
            goto L52
        L41:
            r0 = move-exception
            r13 = r2
            r2 = r0
            r0 = r13
            goto L52
        L46:
            if (r15 == 0) goto L67
            r15.close()
            goto L67
        L4c:
            r0 = move-exception
            goto L6a
        L4e:
            r15 = move-exception
            r0 = r2
            r2 = r15
            r15 = r0
        L52:
            java.lang.String r3 = "[getByMd5]Exception:%s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L68
            r5 = 0
            r4[r5] = r2     // Catch: java.lang.Throwable -> L68
            com.tencent.mars.xlog.Log.e(r1, r3, r4)     // Catch: java.lang.Throwable -> L68
            if (r15 == 0) goto L66
            r15.close()
        L66:
            r2 = r0
        L67:
            return r2
        L68:
            r0 = move-exception
            r2 = r15
        L6a:
            if (r2 == 0) goto L6f
            r2.close()
        L6f:
            throw r0
        L70:
            java.lang.String r0 = "md5 is null or invalue. md5:%s"
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            com.tencent.mars.xlog.Log.i(r1, r0, r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.u1(java.lang.String):com.tencent.mm.storage.emotion.EmojiInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r4 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int y0(int r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r1 = "[countProductId]Count ProductId fail."
            java.lang.String r2 = "select count(*) from EmojiInfo where groupId= ? and temp=?"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ""
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "0"
            java.lang.String[] r8 = new java.lang.String[]{r8, r3}
            r3 = 0
            r4 = 0
            l75.k0 r5 = r7.f470808d     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r6 = 2
            android.database.Cursor r4 = r5.f(r2, r8, r6)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r4 == 0) goto L30
            boolean r8 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r8 == 0) goto L30
            int r3 = r4.getInt(r3)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
        L30:
            if (r4 == 0) goto L5f
        L32:
            r4.close()
            goto L5f
        L36:
            r8 = move-exception
            goto L60
        L38:
            r8 = move-exception
            java.lang.String r2 = "exception:%s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L36
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.z3.c(r8)     // Catch: java.lang.Throwable -> L36
            r5[r3] = r6     // Catch: java.lang.Throwable -> L36
            com.tencent.mars.xlog.Log.e(r0, r2, r5)     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L36
            r2.append(r8)     // Catch: java.lang.Throwable -> L36
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L36
            com.tencent.mars.xlog.Log.e(r0, r8)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L5f
            goto L32
        L5f:
            return r3
        L60:
            if (r4 == 0) goto L65
            r4.close()
        L65:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.y0(int):int");
    }

    public boolean y2(int i17, java.util.List list) {
        return o2(i17, 0, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int z0(boolean r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r1 = "capture"
            if (r8 != 0) goto Le
            java.lang.String[] r8 = new java.lang.String[]{r1}
            java.lang.String r1 = "select count(*) from EmojiInfo where groupId=?"
            goto L15
        Le:
            java.lang.String[] r8 = new java.lang.String[]{r1}
            java.lang.String r1 = "select count(*) from EmojiInfo where groupId=? AND captureStatus=0"
        L15:
            r2 = 0
            r3 = 0
            l75.k0 r4 = r7.f470808d     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r5 = 2
            android.database.Cursor r3 = r4.f(r1, r8, r5)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            if (r3 == 0) goto L2a
            boolean r8 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            if (r8 == 0) goto L2a
            int r2 = r3.getInt(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
        L2a:
            if (r3 == 0) goto L53
        L2c:
            r3.close()
            goto L53
        L30:
            r8 = move-exception
            goto L54
        L32:
            r8 = move-exception
            java.lang.String r1 = "exception:%s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L30
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.z3.c(r8)     // Catch: java.lang.Throwable -> L30
            r5[r2] = r6     // Catch: java.lang.Throwable -> L30
            com.tencent.mars.xlog.Log.e(r0, r1, r5)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "[countCustomEmoji]Exception:%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L30
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L30
            r4[r2] = r8     // Catch: java.lang.Throwable -> L30
            com.tencent.mars.xlog.Log.e(r0, r1, r4)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L53
            goto L2c
        L53:
            return r2
        L54:
            if (r3 == 0) goto L59
            r3.close()
        L59:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.z0(boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int z1() {
        /*
            r7 = this;
            java.lang.String r0 = "select reserved3 from EmojiInfo where catalog=? order by reserved3 desc limit 1"
            r1 = 81
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 0
            r3 = 0
            l75.k0 r4 = r7.f470808d     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            r5 = 2
            android.database.Cursor r3 = r4.f(r0, r1, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            if (r3 == 0) goto L22
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
            if (r0 == 0) goto L22
            int r2 = r3.getInt(r2)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
        L22:
            if (r3 == 0) goto L40
        L24:
            r3.close()
            goto L40
        L28:
            r0 = move-exception
            goto L41
        L2a:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r4 = "getCustomEmojiMaxIndex :%s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L28
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z3.c(r0)     // Catch: java.lang.Throwable -> L28
            r5[r2] = r0     // Catch: java.lang.Throwable -> L28
            com.tencent.mars.xlog.Log.e(r1, r4, r5)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L40
            goto L24
        L40:
            return r2
        L41:
            if (r3 == 0) goto L46
            r3.close()
        L46:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.l.z1():int");
    }
}
