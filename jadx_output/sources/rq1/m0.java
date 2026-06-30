package rq1;

@j95.b
/* loaded from: classes12.dex */
public class m0 extends i95.w implements rq1.l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f398758g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f398759h = {3, 3, 3, 3, 3, 3, 3, 3, 6, 6, 6, 6, 6, 6, 6, 6};

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f398760i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static long f398761m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f398762n;

    /* renamed from: d, reason: collision with root package name */
    public final rq1.a f398763d = new rq1.a();

    /* renamed from: e, reason: collision with root package name */
    public android.util.Pair f398764e = new android.util.Pair("", new rq1.k0());

    /* renamed from: f, reason: collision with root package name */
    public boolean f398765f = false;

    static {
        java.lang.String[] strArr = {"(|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?“(.{2,36}?)”(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?【(.{2,36}?)】(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?\\[(.{2,36}?)\\](微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?\\((.{2,36}?)\\)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?（(.{2,36}?)）(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?\"(.{2,36}?)\"(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?「(.{2,36}?)」(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)( )?'(.{2,36}?)'(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?“(.{2,36}?)”", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?\"(.{2,36}?)\"", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?【(.{2,36}?)】", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?\\[(.{2,36}?)\\]", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?\\((.{2,36}?)\\)", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?（(.{2,36}?)）", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?「(.{2,36}?)」", "(搜索并关注|搜索关注|搜索|搜一搜|搜一下|关注一下|关注|进入|打开|前往|登录|登陆|进)(微信)?(官方)?(公众号|小程序|视频号|公众服务平台|公众平台)( )?'(.{2,36}?)'"};
        for (int i17 = 0; i17 < 16; i17++) {
            f398758g.add(java.util.regex.Pattern.compile(strArr[i17]));
        }
        f398762n = new int[]{64};
    }

    public static java.lang.String Di() {
        return new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.websearch.l2.g(2).l()).s(), "flight.txt").o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        r6 = new java.util.Properties();
        r6.load(new rq1.c0(r5));
        r6 = java.lang.Integer.parseInt(r6.getProperty("version", java.lang.String.valueOf(1)).trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        r5.close();
        r1 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void bj(java.lang.String r9, boolean r10) {
        /*
            ku5.u0 r0 = ku5.t0.f312615d
            com.tencent.mm.plugin.box.HotWordSearchUtilNative r1 = com.tencent.mm.plugin.box.HotWordSearchUtilNative.INSTANCE
            java.lang.Runnable r2 = r1.getLoadTask()
            java.lang.String r3 = "HotWordSearchNative"
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r2, r3)
            r1.updateLatestZipPath(r9)
            int r0 = r1.getCurrentWordBankVersion()
            int r1 = r1.getWordBankVersionFromZip(r9)
            java.lang.String r2 = "[updateWordBankRes] currVersion=%s, recvVersion: %d, pass"
            java.lang.String r3 = "[updateWordBankRes] currVersion=%s, recvVersion: %d, start to update"
            java.lang.String r4 = "MicroMsg.Box.PluginBox"
            if (r1 >= r0) goto L35
            if (r10 == 0) goto L25
            goto L35
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            com.tencent.mars.xlog.Log.i(r4, r2, r0)
            goto L50
        L35:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            com.tencent.mars.xlog.Log.i(r4, r3, r0)
            ku5.u0 r0 = ku5.t0.f312615d
            rq1.n0 r1 = new rq1.n0
            r1.<init>(r9)
            ku5.t0 r0 = (ku5.t0) r0
            r0.h(r1, r4)
        L50:
            rq1.v r0 = rq1.v.f398784a
            boolean r0 = r0.a()
            if (r0 != 0) goto Lfd
            int r0 = rq1.e0.c()
            r1 = -1
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch: java.io.IOException -> Lb3
            java.io.InputStream r6 = com.tencent.mm.vfs.w6.E(r9)     // Catch: java.io.IOException -> Lb3
            r5.<init>(r6)     // Catch: java.io.IOException -> Lb3
        L66:
            java.util.zip.ZipEntry r6 = r5.getNextEntry()     // Catch: java.lang.Throwable -> La9
            if (r6 == 0) goto La5
            java.lang.String r7 = "config.conf"
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> La9
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto L66
            boolean r6 = r6.isDirectory()     // Catch: java.lang.Throwable -> La9
            if (r6 == 0) goto L7f
            goto L66
        L7f:
            java.util.Properties r6 = new java.util.Properties     // Catch: java.lang.Throwable -> La9
            r6.<init>()     // Catch: java.lang.Throwable -> La9
            rq1.c0 r7 = new rq1.c0     // Catch: java.lang.Throwable -> La9
            r7.<init>(r5)     // Catch: java.lang.Throwable -> La9
            r6.load(r7)     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = "version"
            r8 = 1
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = r6.getProperty(r7, r8)     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = r6.trim()     // Catch: java.lang.Throwable -> La9
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> La9
            r5.close()     // Catch: java.io.IOException -> Lb3
            r1 = r6
            goto Lcb
        La5:
            r5.close()     // Catch: java.io.IOException -> Lb3
            goto Lcb
        La9:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> Lae
            goto Lb2
        Lae:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.io.IOException -> Lb3
        Lb2:
            throw r6     // Catch: java.io.IOException -> Lb3
        Lb3:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "unzip fail, zipFilePath = "
            r6.<init>(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "MicroMsg.HotWordSearchUtil"
            com.tencent.mars.xlog.Log.printErrStackTrace(r8, r5, r6, r7)
        Lcb:
            if (r1 >= r0) goto Le0
            if (r10 == 0) goto Ld0
            goto Le0
        Ld0:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10}
            com.tencent.mars.xlog.Log.i(r4, r2, r9)
            goto Lfd
        Le0:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r0}
            com.tencent.mars.xlog.Log.i(r4, r3, r10)
            ku5.u0 r10 = ku5.t0.f312615d
            rq1.o0 r0 = new rq1.o0
            r0.<init>(r9)
            java.lang.String r9 = "box.HotWordSearchModel"
            ku5.t0 r10 = (ku5.t0) r10
            r10.h(r0, r9)
        Lfd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rq1.m0.bj(java.lang.String, boolean):void");
    }

    public java.lang.String Ai(java.lang.String str) {
        rq1.k0 Bi = Bi(str);
        return Bi == null ? "" : Bi.f398751a;
    }

    public rq1.k0 Bi(final java.lang.String str) {
        int i17;
        android.util.Pair pair = this.f398764e;
        if (pair != null && ((java.lang.String) pair.first).equals(str)) {
            return (rq1.k0) this.f398764e.second;
        }
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        final org.json.JSONObject d17 = su4.o2.d("chatSearchPattern");
        try {
            i17 = d17.getInt("timeout");
        } catch (java.lang.Exception unused) {
            i17 = 300;
        }
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        ku5.f p17 = ((ku5.t0) ku5.t0.f312615d).p("PluginBox.checkFirstHotWord");
        try {
            p17.submit(new java.lang.Runnable() { // from class: rq1.m0$$b
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
                
                    r1 = new android.util.Pair(r11.replace("$keyword", r12), java.lang.Integer.valueOf(r10.getInt("pattern_type")));
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 361
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: rq1.m0$$b.run():void");
                }
            }).get(i17, java.util.concurrent.TimeUnit.MILLISECONDS);
            p17.shutdown();
            this.f398764e = new android.util.Pair(((rq1.k0) atomicReference.get()).f398751a, (rq1.k0) atomicReference.get());
            return (rq1.k0) atomicReference.get();
        } catch (java.lang.Exception unused2) {
            p17.shutdown();
            return null;
        } catch (java.lang.Throwable th6) {
            p17.shutdown();
            throw th6;
        }
    }

    public java.lang.String Ni(java.lang.String str) {
        org.json.JSONObject optJSONObject;
        if (!"$Express$".equals(str)) {
            return str;
        }
        ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).getClass();
        try {
            org.json.JSONObject optJSONObject2 = new org.json.JSONObject(" { \"exposedWords\": { \"express\": { \"zh_CN\": \"查快递\", \"zh_HK\": \"查快遞\", \"zh_TW\": \"查快遞\", \"en\": \"express\" } } }").optJSONObject("exposedWords");
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("express")) != null) {
                java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
                java.lang.String optString = optJSONObject.optString(d17);
                return (!android.text.TextUtils.isEmpty(optString) || android.text.TextUtils.equals(d17, "en")) ? optString : optJSONObject.optString("en");
            }
            return "";
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.PluginWebSearch", th6, "getExposedWord:%s", "express");
            return "";
        }
    }

    public final java.lang.String Ri(java.lang.String str) {
        boolean z17;
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_hotword_tmp_match_outshow_switch, 0) == 1)) {
            return null;
        }
        java.util.HashMap hashMap = f398760i;
        if (hashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Box.PluginBox", " getHotWordHighPriority text = %s, hit = %s.", str, hashMap.get(str));
            return (java.lang.String) hashMap.get(str);
        }
        if (hashMap.size() > 32 || f398761m > 500) {
            hashMap.clear();
            f398761m = 0L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.util.List list = f398758g;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                break;
            }
            java.util.regex.Pattern pattern = (java.util.regex.Pattern) ((java.util.ArrayList) list).get(i17);
            int i18 = f398759h[i17];
            java.util.regex.Matcher matcher = pattern.matcher(str);
            if (matcher.find() && i18 <= matcher.groupCount()) {
                java.lang.String group = matcher.group(i18);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(group) && !arrayList.contains(group)) {
                    int i19 = 0;
                    while (true) {
                        if (i19 >= arrayList.size()) {
                            z17 = false;
                            break;
                        }
                        java.lang.String str2 = (java.lang.String) arrayList.get(i19);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.contains(group)) {
                            z17 = true;
                            break;
                        }
                        i19++;
                    }
                    if (z17) {
                        arrayList.remove(i19);
                        arrayList.add(i19, group);
                    } else {
                        arrayList.add(group);
                    }
                }
            }
            i17++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.PluginBox", "getHotWordHighPriority time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        if (arrayList.size() < 1 || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) arrayList.get(0))) {
            return null;
        }
        f398761m += ((java.lang.String) arrayList.get(0)).length();
        hashMap.put(str, (java.lang.String) arrayList.get(0));
        return (java.lang.String) arrayList.get(0);
    }

    public java.lang.String Ui(java.lang.String str, java.lang.String str2) {
        if ("$Express$".equals(str)) {
            java.util.regex.Matcher matcher = sq1.b.f411339a.matcher(str2);
            if (matcher.find()) {
                java.lang.String group = matcher.group();
                if (group.length() <= 15 && group.length() >= 13) {
                    return group;
                }
            }
        }
        java.lang.String Ri = Ri(str2);
        return !com.tencent.mm.sdk.platformtools.t8.K0(Ri) ? Ri : str;
    }

    public int Vi() {
        return rq1.v.f398784a.a() ? com.tencent.mm.plugin.box.HotWordSearchUtilNative.INSTANCE.getSearchDuration() : java.lang.Math.max(rq1.e0.f398742n, 1);
    }

    public java.lang.String Zi() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = rq1.e0.f398729a;
        return rq1.e0.c() + "_" + rq1.e0.f398735g;
    }

    public void aj() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_flight_num_flag, 0) == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new rq1.p0(this), "Box.LoadFlightNumberAsync");
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        aj();
        ((ku5.t0) ku5.t0.f312615d).h(com.tencent.mm.plugin.box.HotWordSearchUtilNative.INSTANCE.getLoadTask(), com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG);
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("MicroMsg.Box.PluginBox");
        long q17 = R.q("last_check_res_time", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long abs = java.lang.Math.abs(currentTimeMillis - q17);
        if (abs < 86400000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Box.PluginBox", "manualCheckRes return lastCheckTime %d, current %d, gap %d", java.lang.Long.valueOf(q17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(abs));
            return;
        }
        R.B("last_check_res_time", currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.PluginBox", "manualCheckRes");
        com.tencent.mm.sdk.platformtools.u3.i(new rq1.r0(this), 3000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rq1.k0 wi(java.lang.String r12) {
        /*
            r11 = this;
            rq1.k0 r0 = new rq1.k0
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.regex.Pattern r3 = sq1.b.f411339a
            java.util.regex.Matcher r3 = r3.matcher(r12)
            boolean r4 = r3.find()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L3e
            java.lang.String r3 = r3.group()
            int r4 = r3.length()
            r7 = 15
            if (r4 > r7) goto L3e
            int r3 = r3.length()
            r4 = 13
            if (r3 < r4) goto L3e
            java.lang.String r3 = "$Express$"
            r1.add(r3)
            java.lang.String r4 = "2"
            r2.add(r4)
            r4 = 2
            r7 = r5
            goto L42
        L3e:
            java.lang.String r3 = ""
            r4 = -1
            r7 = r6
        L42:
            java.lang.String r8 = r11.Ri(r12)
            boolean r9 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            if (r9 != 0) goto L58
            r1.add(r8)
            if (r7 != 0) goto L53
            r4 = 3
            r3 = r8
        L53:
            java.lang.String r8 = "3"
            r2.add(r8)
        L58:
            rq1.v r8 = rq1.v.f398784a
            boolean r8 = r8.a()
            java.lang.String r9 = "1"
            if (r8 == 0) goto L9b
            com.tencent.mm.plugin.box.HotWordSearchUtilNative r8 = com.tencent.mm.plugin.box.HotWordSearchUtilNative.INSTANCE
            java.util.List r12 = r8.getAllHotWords(r12)
            rq1.m0$$a r8 = new rq1.m0$$a
            r8.<init>()
            r12.sort(r8)
            java.util.Iterator r8 = r12.iterator()
        L74:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L89
            java.lang.Object r10 = r8.next()
            r45.gb7 r10 = (r45.gb7) r10
            java.lang.String r10 = r10.f375076d
            r1.add(r10)
            r2.add(r9)
            goto L74
        L89:
            boolean r8 = r12.isEmpty()
            if (r8 != 0) goto Ld1
            if (r7 != 0) goto Ld1
            java.lang.Object r12 = r12.get(r6)
            r45.gb7 r12 = (r45.gb7) r12
            java.lang.String r12 = r12.f375076d
            r3 = r12
            goto Ld2
        L9b:
            java.util.LinkedList r12 = rq1.e0.f(r12)
            rq1.q0 r8 = new rq1.q0
            r8.<init>(r11)
            java.util.Collections.sort(r12, r8)
            java.util.Iterator r8 = r12.iterator()
        Lab:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Lc0
            java.lang.Object r10 = r8.next()
            r45.gb7 r10 = (r45.gb7) r10
            java.lang.String r10 = r10.f375076d
            r1.add(r10)
            r2.add(r9)
            goto Lab
        Lc0:
            int r8 = r12.size()
            if (r8 <= 0) goto Ld1
            if (r7 != 0) goto Ld1
            java.lang.Object r12 = r12.get(r6)
            r45.gb7 r12 = (r45.gb7) r12
            java.lang.String r3 = r12.f375076d
            goto Ld2
        Ld1:
            r5 = r4
        Ld2:
            java.lang.String r12 = "|"
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.t8.c1(r1, r12)
            r0.f398753c = r1
            java.lang.String r12 = com.tencent.mm.sdk.platformtools.t8.c1(r2, r12)
            r0.f398754d = r12
            r0.f398751a = r3
            r0.f398752b = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rq1.m0.wi(java.lang.String):rq1.k0");
    }
}
