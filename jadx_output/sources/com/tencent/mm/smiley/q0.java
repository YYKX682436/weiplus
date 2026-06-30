package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class q0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f193336d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f193337e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f193338f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f193339g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f193340h;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.smiley.g0 f193341a = new com.tencent.mm.smiley.g0();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.smiley.k0 f193342b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f193343c;

    static {
        java.lang.String str = lp0.b.X() + "app_font";
        f193337e = str;
        f193338f = str + "/color_emoji_new";
        f193339g = str + "/color_emoji";
        f193340h = jz5.h.b(com.tencent.mm.smiley.h0.f193265d);
    }

    public q0(kotlin.jvm.internal.i iVar) {
    }

    public static final com.tencent.mm.smiley.q0 g() {
        return com.tencent.mm.smiley.l0.f193307a;
    }

    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(f193337e);
        if (r6Var.A()) {
            r6Var.l();
        }
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.String str2 = f193338f;
        com.tencent.mm.vfs.w6.c(str, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiResProcessor", "copyColorEmojiFile from " + str + " to " + str2 + ", tryReCheck=[" + z17 + ']');
        if (z17 && com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiResProcessor", "copyColorEmojiFile: try checkEntireCurrentEmojiFile");
            java.lang.String Ni = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ni(37, 8);
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(str2);
            if (kotlin.jvm.internal.o.b(Ni, p17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiResProcessor", "checkEntireCurrentEmojiFile: md5 match success");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiResProcessor", "checkEntireCurrentEmojiFile: md5 match failed, originMd5:" + Ni + ", currentMd5:" + p17);
            a(((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(37, 8), false);
        }
    }

    public final void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(f193337e);
        if (r6Var.A()) {
            r6Var.l();
        }
        if (!r6Var.m()) {
            r6Var.J();
        }
        com.tencent.mm.vfs.w6.c("assets:///color_emoji", f193339g);
        this.f193343c = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiResProcessor", "copyOldColorEmojiFileFromAsset from asset. use time:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    public final com.tencent.mm.smiley.k0 c(java.io.DataInputStream dis) {
        kotlin.jvm.internal.o.g(dis, "dis");
        return new com.tencent.mm.smiley.k0(dis.readInt(), dis.readLong(), dis.readInt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.smiley.k0 d(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.EmojiResProcessor"
            java.lang.String r2 = "filePath"
            kotlin.jvm.internal.o.g(r11, r2)
            boolean r2 = com.tencent.mm.vfs.w6.j(r11)
            r3 = 0
            if (r2 == 0) goto L7b
            r2 = 0
            java.io.InputStream r11 = com.tencent.mm.vfs.w6.E(r11)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b java.io.IOException -> L5f
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3e java.io.IOException -> L43
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3e java.io.IOException -> L43
            int r2 = r4.readInt()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.io.IOException -> L38
            long r5 = r4.readLong()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.io.IOException -> L38
            int r7 = r4.readInt()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.io.IOException -> L38
            com.tencent.mm.smiley.k0 r8 = new com.tencent.mm.smiley.k0     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.io.IOException -> L38
            r8.<init>(r2, r5, r7)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.io.IOException -> L38
            if (r11 == 0) goto L30
            r11.close()
        L30:
            r4.close()
            return r8
        L34:
            r0 = move-exception
            goto L3c
        L36:
            r2 = move-exception
            goto L4f
        L38:
            r2 = move-exception
            goto L63
        L3a:
            r0 = move-exception
            r4 = r2
        L3c:
            r2 = r11
            goto L70
        L3e:
            r4 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
            goto L4f
        L43:
            r4 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
            goto L63
        L48:
            r0 = move-exception
            r4 = r2
            goto L70
        L4b:
            r11 = move-exception
            r4 = r2
            r2 = r11
            r11 = r4
        L4f:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L34
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L59
            r11.close()
        L59:
            if (r4 == 0) goto L7b
        L5b:
            r4.close()
            goto L7b
        L5f:
            r11 = move-exception
            r4 = r2
            r2 = r11
            r11 = r4
        L63:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L34
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto L6d
            r11.close()
        L6d:
            if (r4 == 0) goto L7b
            goto L5b
        L70:
            if (r2 == 0) goto L75
            r2.close()
        L75:
            if (r4 == 0) goto L7a
            r4.close()
        L7a:
            throw r0
        L7b:
            com.tencent.mm.smiley.k0 r11 = new com.tencent.mm.smiley.k0
            r0 = 0
            r11.<init>(r3, r0, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.smiley.q0.d(java.lang.String):com.tencent.mm.smiley.k0");
    }

    public final com.tencent.mm.smiley.b2 e(int i17) {
        boolean z17 = false;
        if (57345 <= i17 && i17 < 58680) {
            z17 = true;
        }
        if (!z17) {
            return null;
        }
        com.tencent.mm.smiley.c1 c1Var = (com.tencent.mm.smiley.c1) com.tencent.mm.smiley.m.f193309a.f193329e.f193217b.get(i17, null);
        com.tencent.mm.smiley.a1 a1Var = c1Var != null ? ((com.tencent.mm.smiley.b) c1Var).f193216a : null;
        if (a1Var instanceof com.tencent.mm.smiley.b2) {
            return (com.tencent.mm.smiley.b2) a1Var;
        }
        return null;
    }

    public final long f() {
        com.tencent.mm.smiley.k0 k0Var = this.f193342b;
        if (k0Var != null) {
            return k0Var.f193302b;
        }
        return 0L;
    }

    public final int h(java.lang.String str, int i17, int i18) {
        if (((java.lang.Boolean) ((jz5.n) f193340h).getValue()).booleanValue()) {
            if (!f193336d) {
                return i18;
            }
            if ((str == null || str.length() == 0) || i17 < 0 || i18 <= 0) {
                return 0;
            }
            if (str.length() <= i18) {
                return str.length();
            }
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            f0Var.f310116d = -1;
            com.tencent.mm.smiley.m.f193309a.a(str, i17, str.length(), new com.tencent.mm.smiley.n0(i18, f0Var));
            if (f0Var.f310116d == -1) {
                f0Var.f310116d = i18;
            }
            return f0Var.f310116d + 1;
        }
        if (!f193336d) {
            return i18;
        }
        if (str != null) {
            if (!(str.length() == 0) && i17 >= 0 && i18 > 0) {
                if (str.length() <= i18) {
                    return str.length();
                }
                kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
                f0Var2.f310116d = i17;
                kotlin.jvm.internal.f0 f0Var3 = new kotlin.jvm.internal.f0();
                f0Var3.f310116d = -1;
                while (true) {
                    int i19 = f0Var2.f310116d;
                    if (i19 >= i18) {
                        break;
                    }
                    com.tencent.mm.smiley.p pVar = com.tencent.mm.smiley.m.f193309a;
                    if (pVar.f193329e.f193217b.get(str.codePointAt(i19)) != null) {
                        pVar.a(str, f0Var2.f310116d, str.length(), new com.tencent.mm.smiley.m0(i18, f0Var3, f0Var2));
                    } else {
                        f0Var3.f310116d = f0Var2.f310116d;
                    }
                    f0Var2.f310116d++;
                }
                if (f0Var3.f310116d == -1) {
                    f0Var3.f310116d = i17 + 1;
                }
                return f0Var3.f310116d + 1;
            }
        }
        return 0;
    }

    public final boolean i(java.io.DataInputStream dataInputStream, com.tencent.mm.smiley.k0 k0Var, boolean z17) {
        int i17 = k0Var != null ? k0Var.f193303c : 0;
        if (k0Var == null || i17 <= 0) {
            return false;
        }
        byte[] bArr = new byte[i17];
        dataInputStream.read(bArr);
        if (this.f193343c) {
            com.tencent.mm.smiley.f fVar = new com.tencent.mm.smiley.f();
            fVar.parseFrom(bArr);
            java.util.LinkedList linkedList = fVar.f193249e;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.smiley.k kVar = (com.tencent.mm.smiley.k) it.next();
                com.tencent.mm.smiley.c cVar = new com.tencent.mm.smiley.c();
                int size = linkedList2.size();
                int i18 = kVar.f193294d;
                java.util.LinkedList linkedList5 = cVar.f193223d;
                if (i18 != 0) {
                    linkedList5.add(java.lang.Integer.valueOf(i18));
                }
                int i19 = kVar.f193295e;
                if (i19 != 0) {
                    linkedList5.add(java.lang.Integer.valueOf(i19));
                }
                com.tencent.mm.smiley.g1 g1Var = new com.tencent.mm.smiley.g1();
                g1Var.f193259d = kVar.f193299i;
                g1Var.f193260e = kVar.f193300m;
                g1Var.f193261f = 64;
                g1Var.f193262g = 64;
                cVar.f193224e = g1Var;
                if (kVar.f193296f != 0) {
                    com.tencent.mm.smiley.a2 a2Var = new com.tencent.mm.smiley.a2();
                    a2Var.f193214d = kVar.f193296f;
                    a2Var.f193215e = size;
                    linkedList3.add(a2Var);
                }
                if (kVar.f193297g != -1) {
                    com.tencent.mm.smiley.f1 f1Var = new com.tencent.mm.smiley.f1();
                    f1Var.f193251d = kVar.f193297g;
                    f1Var.f193252e = size;
                    linkedList4.add(f1Var);
                }
                linkedList2.add(cVar);
            }
            com.tencent.mm.smiley.g0 g0Var = new com.tencent.mm.smiley.g0();
            g0Var.f193256d = linkedList2;
            g0Var.f193258f = linkedList4;
            g0Var.f193257e = linkedList3;
            this.f193341a = g0Var;
        } else {
            this.f193341a.parseFrom(bArr);
        }
        java.util.LinkedList<com.tencent.mm.smiley.c> emojiDataItems = this.f193341a.f193256d;
        kotlin.jvm.internal.o.f(emojiDataItems, "emojiDataItems");
        if (emojiDataItems.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiResProcessor", "constructIndex failed , emoji items is empty.");
        } else {
            for (com.tencent.mm.smiley.c cVar2 : emojiDataItems) {
                java.util.LinkedList codePoints = cVar2.f193223d;
                kotlin.jvm.internal.o.f(codePoints, "codePoints");
                com.tencent.mm.smiley.g1 picItem = cVar2.f193224e;
                kotlin.jvm.internal.o.f(picItem, "picItem");
                com.tencent.mm.smiley.b2 b2Var = new com.tencent.mm.smiley.b2(codePoints, picItem, false);
                com.tencent.mm.smiley.p pVar = com.tencent.mm.smiley.m.f193309a;
                pVar.getClass();
                pVar.f193329e.b(b2Var, 0, com.tencent.mm.smiley.n.f193315d);
            }
            java.util.LinkedList<com.tencent.mm.smiley.a2> softbankEmojiItems = this.f193341a.f193257e;
            kotlin.jvm.internal.o.f(softbankEmojiItems, "softbankEmojiItems");
            for (com.tencent.mm.smiley.a2 a2Var2 : softbankEmojiItems) {
                com.tencent.mm.smiley.p pVar2 = com.tencent.mm.smiley.m.f193309a;
                kotlin.jvm.internal.o.d(a2Var2);
                pVar2.getClass();
                com.tencent.mm.smiley.c cVar3 = (com.tencent.mm.smiley.c) kz5.n0.a0(emojiDataItems, a2Var2.f193215e);
                if (cVar3 != null) {
                    java.util.LinkedList codePoints2 = cVar3.f193223d;
                    kotlin.jvm.internal.o.f(codePoints2, "codePoints");
                    com.tencent.mm.smiley.g1 picItem2 = cVar3.f193224e;
                    kotlin.jvm.internal.o.f(picItem2, "picItem");
                    com.tencent.mm.smiley.b2 b2Var2 = new com.tencent.mm.smiley.b2(codePoints2, picItem2, true);
                    com.tencent.mm.smiley.w1 w1Var = pVar2.f193329e;
                    int i27 = a2Var2.f193214d;
                    w1Var.getClass();
                    com.tencent.mm.smiley.b a17 = w1Var.a();
                    a17.f193216a = b2Var2;
                    synchronized (w1Var.f193217b) {
                        w1Var.f193217b.put(i27, a17);
                    }
                }
            }
        }
        com.tencent.mm.smiley.g0 g0Var2 = this.f193341a;
        java.util.LinkedList linkedList6 = g0Var2.f193257e;
        java.util.LinkedList linkedList7 = g0Var2.f193258f;
        java.util.LinkedList linkedList8 = g0Var2.f193256d;
        java.util.Iterator it6 = linkedList6.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.smiley.a2 a2Var3 = (com.tencent.mm.smiley.a2) it6.next();
            com.tencent.mm.smiley.p pVar3 = com.tencent.mm.smiley.m.f193309a;
            pVar3.f193325a.append(a2Var3.f193214d, a2Var3);
            pVar3.f193326b.append(((com.tencent.mm.smiley.c) linkedList8.get(a2Var3.f193215e)).f193224e.f193259d, a2Var3);
        }
        java.util.Iterator it7 = linkedList7.iterator();
        while (it7.hasNext()) {
            com.tencent.mm.smiley.f1 f1Var2 = (com.tencent.mm.smiley.f1) it7.next();
            com.tencent.mm.smiley.m.f193309a.f193327c.append(f1Var2.f193251d, f1Var2);
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:3|(1:5)(1:162))(1:163)|6|(8:7|8|(1:10)|11|12|13|14|15)|(13:20|21|22|(1:24)|26|(3:28|(1:30)|31)|32|33|(1:35)(1:42)|36|(1:38)|39|40)|61|62|21|22|(0)|26|(0)|32|33|(0)(0)|36|(0)|39|40|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0270, code lost:
    
        if (com.tencent.mm.sdk.platformtools.x2.n() != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0159, code lost:
    
        if (com.tencent.mm.sdk.platformtools.x2.n() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiResProcessor", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
    
        com.tencent.mm.smiley.q0.f193336d = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        if (com.tencent.mm.sdk.platformtools.x2.n() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        r5 = java.lang.System.currentTimeMillis() - r5;
        r7 = !r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
    
        com.tencent.mm.smiley.q0.f193336d = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        if (com.tencent.mm.sdk.platformtools.x2.n() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
    
        r5 = java.lang.System.currentTimeMillis() - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
    
        if (r17 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d6, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
    
        com.tencent.mm.smiley.j0.a(r4, r5, r7, f(), r19.f193341a.f193256d.size(), false, 16, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0089, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008a, code lost:
    
        r9 = r7 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        if (com.tencent.mm.sdk.platformtools.x2.n() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b1, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01af, code lost:
    
        if (com.tencent.mm.sdk.platformtools.x2.n() == false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0229 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: all -> 0x0089, IOException -> 0x008c, TRY_LEAVE, TryCatch #18 {IOException -> 0x008c, all -> 0x0089, blocks: (B:22:0x006f, B:24:0x0074), top: B:21:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0233 A[Catch: all -> 0x022d, IOException -> 0x022f, TRY_LEAVE, TryCatch #17 {IOException -> 0x022f, all -> 0x022d, blocks: (B:120:0x0229, B:96:0x0233), top: B:119:0x0229 }] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [int] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.smiley.q0.j():boolean");
    }
}
