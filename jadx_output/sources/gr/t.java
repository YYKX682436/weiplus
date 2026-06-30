package gr;

/* loaded from: classes12.dex */
public class t {

    /* renamed from: o, reason: collision with root package name */
    public static gr.t f274681o;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f274694m;

    /* renamed from: a, reason: collision with root package name */
    public boolean f274682a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f274683b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f274684c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f274685d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f274686e = true;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f274687f = {null};

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f274688g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f274689h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f274690i = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f274691j = new gr.s(this, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f274692k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final r45.gj0[] f274693l = {null};

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f274695n = {false};

    public static synchronized gr.t g() {
        gr.t tVar;
        synchronized (gr.t.class) {
            if (f274681o == null) {
                f274681o = new gr.t();
            }
            f274681o.i();
            tVar = f274681o;
        }
        return tVar;
    }

    public java.util.ArrayList a() {
        java.util.ArrayList parcelableArrayList;
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f274691j;
        java.util.ArrayList arrayList = (java.util.ArrayList) r2Var.get("custom");
        if (arrayList == null || this.f274683b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageCache", "getAllCustomEmoji: %s", java.lang.Boolean.valueOf(this.f274683b));
            this.f274683b = false;
            if (((km0.c) gm0.j1.p().a()).a()) {
                z85.l c17 = com.tencent.mm.storage.n5.f().c();
                arrayList = c17 != null ? (java.util.ArrayList) c17.o1(true) : new java.util.ArrayList(2);
            } else {
                arrayList = new java.util.ArrayList();
                android.os.Bundle B = h65.c.B(h65.c.C(), "getAllCustomEmoji", null, null);
                B.setClassLoader(com.tencent.mm.storage.emotion.EmojiInfo.class.getClassLoader());
                if (B.containsKey("key_data") && (parcelableArrayList = B.getParcelableArrayList("key_data")) != null) {
                    arrayList.addAll(parcelableArrayList);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageCache", "[getAllCustomEmojiExport] size:%s", java.lang.Integer.valueOf(parcelableArrayList.size()));
                }
            }
            r2Var.put("custom", arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r3.moveToFirst() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r4 = new com.tencent.mm.storage.emotion.EmojiInfo();
        r4.convertFrom(r3);
        r5.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r3.moveToNext() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r3.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList b(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.f274686e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "MicroMsg.EmojiStorageCache"
            java.lang.String r2 = "getCaptureEmoji: needUpdateCaptureEmoji %s withFailed %s."
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            com.tencent.mm.sdk.platformtools.r2 r0 = r8.f274691j
            java.lang.String r2 = "capture"
            java.lang.Object r3 = r0.get(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L25
            boolean r4 = r8.f274686e
            if (r4 == 0) goto Ld2
        L25:
            r3 = 0
            r8.f274686e = r3
            gm0.a0 r3 = gm0.j1.p()
            km0.b r3 = r3.a()
            km0.c r3 = (km0.c) r3
            boolean r3 = r3.a()
            r4 = 0
            if (r3 == 0) goto L7e
            com.tencent.mm.storage.n5 r3 = com.tencent.mm.storage.n5.f()
            z85.l r3 = r3.c()
            r3.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "select * from EmojiInfo where groupId = \"capture\""
            r6.<init>(r7)
            java.lang.String r7 = " order by idx asc  , captureEnterTime desc "
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            l75.k0 r3 = r3.f470808d
            android.database.Cursor r3 = r3.B(r6, r4)
            if (r3 == 0) goto L7c
            boolean r4 = r3.moveToFirst()
            if (r4 == 0) goto L79
        L68:
            com.tencent.mm.storage.emotion.EmojiInfo r4 = new com.tencent.mm.storage.emotion.EmojiInfo
            r4.<init>()
            r4.convertFrom(r3)
            r5.add(r4)
            boolean r4 = r3.moveToNext()
            if (r4 != 0) goto L68
        L79:
            r3.close()
        L7c:
            r3 = r5
            goto Lb8
        L7e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.net.Uri r5 = h65.c.C()
            java.lang.String r6 = "getCaptureEmoji"
            android.os.Bundle r4 = h65.c.B(r5, r6, r4, r4)
            java.lang.Class<com.tencent.mm.storage.emotion.EmojiInfo> r5 = com.tencent.mm.storage.emotion.EmojiInfo.class
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r4.setClassLoader(r5)
            java.lang.String r5 = "key_data"
            boolean r6 = r4.containsKey(r5)
            if (r6 == 0) goto Lb8
            java.util.ArrayList r4 = r4.getParcelableArrayList(r5)
            if (r4 == 0) goto Lb8
            r3.addAll(r4)
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "[getCaptureEmojiExport] size:%s"
            com.tencent.mars.xlog.Log.i(r1, r5, r4)
        Lb8:
            boolean r4 = r8.f274686e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            int r5 = r3.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "getCaptureEmoji: %s size %s"
            com.tencent.mars.xlog.Log.i(r1, r5, r4)
            r0.put(r2, r3)
        Ld2:
            if (r9 == 0) goto Ld8
            r3.size()
            return r3
        Ld8:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r3.iterator()
        Le1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf9
            java.lang.Object r1 = r0.next()
            com.tencent.mm.storage.emotion.EmojiInfo r1 = (com.tencent.mm.storage.emotion.EmojiInfo) r1
            qk.x6 r2 = r1.m1()
            qk.x6 r3 = qk.x6.STATUS_SUCCESS
            if (r2 != r3) goto Le1
            r9.add(r1)
            goto Le1
        Lf9:
            r9.size()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gr.t.b(boolean):java.util.ArrayList");
    }

    public r45.v75 c(java.lang.String str) {
        r45.v75 v75Var;
        java.util.HashMap hashMap = this.f274692k;
        if (!hashMap.containsKey(str)) {
            byte[] bArr = null;
            if (((km0.c) gm0.j1.p().a()).a()) {
                z85.s y07 = com.tencent.mm.storage.n5.f().d().y0(str);
                if (y07 != null) {
                    bArr = y07.field_content;
                }
            } else {
                android.os.Bundle B = h65.c.B(h65.c.C(), "getDesignerInfo", str, null);
                if (B.containsKey("buffer")) {
                    bArr = B.getByteArray("buffer");
                }
            }
            if (bArr != null) {
                r45.se3 se3Var = new r45.se3();
                try {
                    se3Var.parseFrom(bArr);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiStorageCache", e17, "", new java.lang.Object[0]);
                }
                r45.qj0 qj0Var = se3Var.f385652d;
                if (qj0Var != null && (v75Var = qj0Var.E) != null) {
                    hashMap.put(str, v75Var);
                }
            }
        }
        return (r45.v75) hashMap.get(str);
    }

    public java.util.ArrayList d() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f274690i;
        try {
            reentrantLock.lock();
            if (this.f274685d) {
                this.f274685d = false;
                if (((km0.c) gm0.j1.p().a()).a()) {
                    this.f274688g = com.tencent.mm.storage.n5.f().b().i1(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_panel_store_group_limit, 10000));
                    this.f274689h = null;
                } else {
                    java.util.ArrayList e17 = e();
                    this.f274688g = new java.util.ArrayList();
                    this.f274689h = null;
                    java.util.Iterator it = e17.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = (com.tencent.mm.storage.emotion.EmojiGroupInfo) it.next();
                        if (emojiGroupInfo.field_sync == 2 || com.tencent.mm.sdk.platformtools.t8.D0(emojiGroupInfo.field_productID, java.lang.String.valueOf(17))) {
                            this.f274688g.add(emojiGroupInfo);
                        }
                    }
                }
            }
            return this.f274688g;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final java.util.ArrayList e() {
        java.util.ArrayList parcelableArrayList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle B = h65.c.B(h65.c.C(), "getEmojiGroupInfoList", null, null);
        B.setClassLoader(com.tencent.mm.storage.emotion.EmojiGroupInfo.class.getClassLoader());
        if (B.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) && (parcelableArrayList = B.getParcelableArrayList(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) != null) {
            arrayList.addAll(parcelableArrayList);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageCache", "[getEmojiGroupInfoListExport] size: %s", java.lang.Integer.valueOf(parcelableArrayList.size()));
        }
        return arrayList;
    }

    public java.util.ArrayList f(java.lang.String str) {
        java.util.ArrayList parcelableArrayList;
        boolean z17 = this.f274684c;
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f274691j;
        if (z17) {
            r2Var.d(-1);
            this.f274684c = false;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) r2Var.get(str);
        if (arrayList == null) {
            if (((km0.c) gm0.j1.p().a()).a()) {
                arrayList = (java.util.ArrayList) com.tencent.mm.storage.n5.f().c().P1(str);
            } else {
                arrayList = new java.util.ArrayList();
                android.os.Bundle B = h65.c.B(h65.c.C(), "getEmojiListByGroupId", str + "", null);
                B.setClassLoader(com.tencent.mm.storage.emotion.EmojiInfo.class.getClassLoader());
                if (B.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) && (parcelableArrayList = B.getParcelableArrayList(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) != null) {
                    arrayList.addAll(parcelableArrayList);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageCache", "[getEmojiListByGroupIdExport] size%s", java.lang.Integer.valueOf(parcelableArrayList.size()));
                }
            }
            r2Var.put(str, arrayList);
        }
        return arrayList;
    }

    public r45.gj0 h() {
        r45.gj0[] gj0VarArr = this.f274693l;
        if (gj0VarArr[0] == null) {
            synchronized (gj0VarArr) {
                if (this.f274693l[0] == null) {
                    r45.gj0 gj0Var = new r45.gj0();
                    if (com.tencent.mm.sdk.platformtools.x2.n()) {
                        byte[] y07 = com.tencent.mm.storage.n5.f().e().y0("cache_type_user_data");
                        if (!com.tencent.mm.sdk.platformtools.t8.M0(y07)) {
                            try {
                                gj0Var.parseFrom(y07);
                            } catch (java.io.IOException e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiStorageCache", e17, "parse user data error", new java.lang.Object[0]);
                            }
                        }
                    }
                    this.f274693l[0] = gj0Var;
                }
            }
        }
        return this.f274693l[0];
    }

    public final void i() {
        boolean[] zArr = this.f274695n;
        if (zArr[0]) {
            return;
        }
        synchronized (zArr) {
            if (!this.f274695n[0]) {
                if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("key", -29414086);
                    this.f274694m = h65.c.B(android.net.Uri.parse("content://" + qk.d0.f364065a + "/userinfo/"), "ConfigStorage.getString", null, bundle).getString("key", "smiley");
                    this.f274695n[0] = true;
                } else if (!gm0.j1.a()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiStorageCache", "Not login, skip rest logic this time.");
                    this.f274694m = "smiley";
                } else {
                    this.f274694m = (java.lang.String) gm0.j1.u().c().l(-29414086, "smiley");
                    this.f274695n[0] = true;
                }
            }
        }
    }

    public boolean j(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        synchronized (this.f274691j) {
            java.util.Iterator it = this.f274691j.values().iterator();
            while (it.hasNext()) {
                java.util.Iterator it6 = ((java.util.ArrayList) it.next()).iterator();
                while (it6.hasNext()) {
                    if (((com.tencent.mm.storage.emotion.EmojiInfo) it6.next()).getMd5().equals(iEmojiInfo.getMd5())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public void k(java.lang.String str) {
        this.f274691j.remove(str);
    }

    public void l(boolean z17) {
        this.f274683b = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageCache", "setNeedUpdateAllCustomEmoji %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            int i17 = com.tencent.mm.emoji.sync.EmojiUpdateReceiver.f64930a;
            intent.setAction("com.tencent.mm.Emoji_Update");
            intent.putExtra("type", "update_all_custom_emoji");
            intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
    }

    public void m(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageCache", "setNeedUpdateCaptureEmoji: ");
        this.f274686e = true;
        if (z17) {
            int i17 = com.tencent.mm.emoji.sync.EmojiUpdateReceiver.f64930a;
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.tencent.mm.Emoji_Update");
            intent.putExtra("type", "update_capture_emoji");
            intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
    }

    public void n(boolean z17) {
        this.f274682a = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageCache", "setNeedUpdateAllCustomEmoji %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            int i17 = com.tencent.mm.emoji.sync.EmojiUpdateReceiver.f64930a;
            intent.setAction("com.tencent.mm.Emoji_Update");
            intent.putExtra("type", "update_download_custom_emoji");
            intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
    }

    public void o(boolean z17) {
        this.f274685d = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStorageCache", "setNeedUpdateGroupInfo: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            int i17 = com.tencent.mm.emoji.sync.EmojiUpdateReceiver.f64930a;
            intent.setAction("com.tencent.mm.Emoji_Update");
            intent.putExtra("type", "update_group_info");
            intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
    }
}
