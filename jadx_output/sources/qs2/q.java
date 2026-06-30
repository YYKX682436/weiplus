package qs2;

@j95.b
/* loaded from: classes10.dex */
public final class q extends i95.w implements w40.e {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f366317d = jz5.h.b(qs2.j.f366305d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f366318e = jz5.h.b(qs2.p.f366316d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f366319f = jz5.h.b(new qs2.o(this));

    public boolean Ai(long j17) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long longValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128038y8).getValue()).r()).longValue();
        boolean z17 = j17 >= longValue;
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "checkVideoEnableFinderPost: enableShowFinderPost=" + z17 + ", durationMs=" + j17 + ", durationLimit=" + longValue);
        return z17;
    }

    public void Bi() {
        mv2.q qVar = mv2.q.f331618a;
        synchronized (mv2.q.f331619b) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            java.util.Set<java.lang.String> stringSet = L.getStringSet("MARK_DEL_FILES", new java.util.HashSet());
            if (stringSet != null) {
                for (java.lang.String str : stringSet) {
                    com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "FinderFileTrack clearMarkFiles " + str);
                    com.tencent.mm.vfs.w6.h(str);
                }
            }
            L.putStringSet("MARK_DEL_FILES", new java.util.HashSet());
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            if (stringSet != null && stringSet.size() > 0) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.C(1267L, 5L, 1L);
                g0Var.C(1267L, 6L, elapsedRealtime2);
            }
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "clearMarkFolder cost:" + elapsedRealtime2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(android.content.Context r17, r45.q23 r18, long r19, int r21, android.content.Intent r22, org.json.JSONObject r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qs2.q.Di(android.content.Context, r45.q23, long, int, android.content.Intent, org.json.JSONObject, int, boolean):void");
    }

    public final void Ni(android.content.Context context, android.content.Intent intent, int i17, long j17, r45.zi2 zi2Var, r45.rz6 rz6Var, java.lang.String str, java.lang.String str2) {
        r45.q23 q23Var = new r45.q23();
        q23Var.f383585d = rz6Var.f385320d;
        q23Var.f383586e = rz6Var.f385321e;
        q23Var.f383587f = rz6Var.f385322f;
        q23Var.f383591m = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("source_feedid", pm0.v.u(j17));
        jSONObject.put("source_songid", zi2Var != null ? zi2Var.getString(12) : null);
        jSONObject.put("source_audioid", str2);
        jSONObject.put("source_templateid", rz6Var.f385320d);
        jSONObject.put("source_template_type", rz6Var.f385321e);
        Di(context, q23Var, j17, i17, intent, jSONObject, 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ab A[Catch: JSONException -> 0x008d, TryCatch #2 {JSONException -> 0x008d, blocks: (B:231:0x0086, B:167:0x009b, B:169:0x009f, B:174:0x00ab, B:175:0x00b3, B:177:0x00b7), top: B:230:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b7 A[Catch: JSONException -> 0x008d, TRY_LEAVE, TryCatch #2 {JSONException -> 0x008d, blocks: (B:231:0x0086, B:167:0x009b, B:169:0x009f, B:174:0x00ab, B:175:0x00b3, B:177:0x00b7), top: B:230:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00c5 A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00df A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00eb A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00f7 A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0103 A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x010f A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0124 A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0132 A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0140 A[Catch: JSONException -> 0x0147, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ri(android.content.Context r20, qs2.e r21, android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qs2.q.Ri(android.content.Context, qs2.e, android.content.Intent):void");
    }

    public final void Ui(android.content.Intent intent, r45.ze2 ze2Var) {
        intent.putExtra("saveLocation", true);
        intent.putExtra("get_poi_name", ze2Var.getString(3));
        intent.putExtra("get_city", ze2Var.getString(2));
        intent.putExtra("get_lat", ze2Var.getFloat(1));
        intent.putExtra("get_lng", ze2Var.getFloat(0));
        intent.putExtra("get_poi_address", ze2Var.getString(4));
        intent.putExtra("get_poi_classify_id", ze2Var.getString(5));
    }

    public r45.qb4 Vi() {
        r45.qb4 qb4Var = new r45.qb4();
        qb4Var.set(0, "FinderLocal_" + java.lang.System.nanoTime());
        return qb4Var;
    }

    public java.lang.String Zi() {
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.finder.assist.e9.f102144m);
        byte[] bytes = java.lang.String.valueOf(java.lang.System.currentTimeMillis()).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        return sb6.toString();
    }

    public java.lang.String aj(long j17) {
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        java.lang.String feedId = "audio_".concat(pm0.v.u(j17));
        kotlin.jvm.internal.o.g(feedId, "feedId");
        return com.tencent.mm.plugin.finder.assist.e9.f102143l + feedId;
    }

    public int bj() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127704g).getValue()).r()).intValue();
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127723h).getValue()).r()).intValue();
        if (!pj()) {
            intValue = intValue2;
        }
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "[getAlbumMaxVideoDuration] maxDuration:" + intValue);
        return intValue;
    }

    public long cj() {
        long t17;
        mv2.f0 f0Var = mv2.f0.f331561a;
        synchronized (com.tencent.mm.plugin.finder.storage.f90.f126757i) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_FINDERITEM_MAXID_LONG_SYNC;
            t17 = c17.t(u3Var, 1L);
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(1 + t17));
        }
        return t17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.tencent.mm.ui.widget.dialog.k0 fj(android.content.Context context, java.lang.String username, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk()) {
            com.tencent.mm.plugin.finder.storage.y90 y90Var = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b96, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbf);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a9m);
            ya2.b2 b17 = ya2.h.f460484a.b(username);
            if (b17 != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String w07 = b17.w0();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07));
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d a17 = g1Var.a();
                int i18 = 2;
                mn2.n nVar = new mn2.n(b17.field_avatarUrl, y90Var, i18, objArr3 == true ? 1 : 0);
                kotlin.jvm.internal.o.d(imageView);
                mn2.f1 f1Var = mn2.f1.f329957h;
                a17.c(nVar, imageView, g1Var.h(f1Var));
                java.lang.Object[] objArr4 = ya2.d.b(b17, true) != null;
                android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f483425as3);
                if (findViewById != null) {
                    int i19 = objArr4 != false ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/FinderPublishFeatureService", "checkPostDialogHeader", "(Lcom/tencent/mm/plugin/finder/api/LocalFinderContact;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/publish/FinderPublishFeatureService", "checkPostDialogHeader", "(Lcom/tencent/mm/plugin/finder/api/LocalFinderContact;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obh);
                if (textView2 != null) {
                    textView2.setText(objArr4 != false ? com.tencent.mm.R.string.f59 : com.tencent.mm.R.string.f58);
                }
                r45.xk b18 = ya2.d.b(b17, true);
                if (b18 != null) {
                    android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbf);
                    if (textView3 != null) {
                        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        java.lang.String string = b18.getString(1);
                        ((ke0.e) xVar2).getClass();
                        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, string));
                    }
                    android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a9m);
                    if (imageView2 != null) {
                        g1Var.a().c(new mn2.n(b18.getString(2), objArr2 == true ? 1 : 0, i18, objArr == true ? 1 : 0), imageView2, g1Var.h(f1Var));
                    }
                }
                k0Var.s(inflate, true);
            }
        }
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        us2.u.n(i17, false);
        return k0Var;
    }

    public java.lang.String hj() {
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        java.lang.String postId = finderFeedReportObject != null ? finderFeedReportObject.getPostId() : null;
        return postId == null ? "" : postId;
    }

    public long ij() {
        long Ui;
        if (pj()) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_to_dynamic_bitrate_video_max_size, 943718400L);
        } else {
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_to_dynamic_bitrate_video_max_size_low, 943718400L);
        }
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "[getPostToDynamicBitrateVideoMaxSize] maxSize:" + Ui);
        return Ui;
    }

    public java.lang.String mj(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String d17 = cu2.f0.f222391a.d("FinderObjectDynamicItemKey_SnsPostEntry");
        java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(d17) ? context.getResources().getString(com.tencent.mm.R.string.jdu) : d17 == null ? "" : d17;
        kotlin.jvm.internal.o.d(string);
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "getSnsPostEntranceTips: text = " + string + ", dynamicWording=" + d17);
        return string;
    }

    public int nj(com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo reportInfo) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        java.lang.Integer num = (java.lang.Integer) reportInfo.b("KEY_MEDIA_SOURCE_INT", 0);
        int i17 = (num == null || num.intValue() != 0) ? (num != null && num.intValue() == 1) ? 2 : 3 : 1;
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "[getVideoSource] videoSource:" + i17 + " mediaSource:" + num);
        return i17;
    }

    public boolean oj(ya2.b2 b2Var) {
        r45.aw0 aw0Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.R8).getValue()).r()).intValue() == 1;
        if (b2Var != null && (aw0Var = b2Var.field_bindInfoList) != null && (list = aw0Var.getList(0)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.zv0) obj).getInteger(0) == 5) {
                    break;
                }
            }
            r45.zv0 zv0Var = (r45.zv0) obj;
            if (zv0Var != null && ((r45.uw2) zv0Var.getCustom(5)) != null) {
                return true;
            }
        }
        return z17;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        mv2.f0 f0Var = mv2.f0.f331561a;
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        f0Var.a(com.tencent.mm.plugin.finder.report.p2.f125246j);
        pm0.v.X(new mv2.r(com.tencent.mm.plugin.finder.report.b0.f124963c));
        f0Var.a((sr2.v) ((jz5.n) this.f366317d).getValue());
        f0Var.a(sr2.t.f411718d);
        ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).getClass();
        com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
        if (z65.c.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "setup");
            com.tencent.mm.plugin.vlog.model.b0.f175566t.alive();
        }
        com.tencent.mm.plugin.finder.report.p2.t(p2Var, null, null, new com.tencent.mm.plugin.finder.report.f2(null), 3, null);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        mv2.f0 f0Var = mv2.f0.f331561a;
        f0Var.t(com.tencent.mm.plugin.finder.report.p2.f125246j);
        pm0.v.X(new mv2.b0(com.tencent.mm.plugin.finder.report.b0.f124963c));
        f0Var.t((sr2.v) ((jz5.n) this.f366317d).getValue());
        f0Var.t(sr2.t.f411718d);
        ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).getClass();
        com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "destroy");
        com.tencent.mm.plugin.vlog.model.b0.f175566t.dead();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mm.plugin.lite.LiteAppCenter.registerModule("finderPost", com.tencent.mm.plugin.finder.publish.LiteAppFinderPostModule.class);
    }

    public final boolean pj() {
        jz5.l Bi = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Bi();
        float floatValue = ((java.lang.Number) Bi.f302833d).floatValue();
        float floatValue2 = ((java.lang.Number) Bi.f302834e).floatValue();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127742i).getValue()).r()).intValue();
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127760j).getValue()).r()).intValue();
        boolean z17 = floatValue >= ((float) intValue) && floatValue2 >= ((float) intValue2);
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "[isNotLowDevice] notLow:" + z17 + "  [cpuScore:" + floatValue + ",cpuBenchmark:" + intValue + "] [gpuScore:" + floatValue2 + ",gpuBenchmark:" + intValue2 + ']');
        return z17;
    }

    public boolean qj() {
        r45.ls2 ls2Var = (r45.ls2) g92.b.f269769e.k2().d().getCustom(26);
        java.util.LinkedList list = ls2Var != null ? ls2Var.getList(1) : null;
        if (list == null || !list.contains(4)) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.B8).getValue()).r()).intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    public void rj(java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17) {
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        com.tencent.mm.plugin.finder.report.p2.w(com.tencent.mm.plugin.finder.report.p2.f125237a, moduleName, str, str2, i17, 0L, 16, null);
    }

    public final void sj(android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "[openCameraOrAlbum] enterScene:" + i17 + " routerFrom:" + i18 + " isOpenCamera:" + z17);
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (z17) {
            intent.putExtra("key_finder_post_router", 2);
            if (((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Zi(false)) {
                ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalProfilePagePostingButton", i17, 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), true);
                intent.putExtra("KEY_FINDER_MJ_PUBLISHER_SHOW_MOVIE_COMPOSING_ENTRANCE", true);
            }
        } else {
            intent.putExtra("key_finder_post_router", 3);
        }
        intent.putExtra("key_finder_post_from", i18);
        intent.putExtra("key_finder_post_id", str2);
        intent.putExtra("KEY_FINDER_USERNAME_SELF", str);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(context, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if ((r8 != null ? (r45.yu0) r8.getCustom(1) : null) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        if (r11.getInteger(0) == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if ((r5 != null ? (r45.at0) r5.getCustom(0) : null) != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0067, code lost:
    
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "parsesFinderDynamicAbility: notFinderUser=" + r1 + ", is not sns post relative ability");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007d, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[LOOP:1: B:39:0x00aa->B:53:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tj(r45.q11 r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qs2.q.tj(r45.q11, java.lang.String):void");
    }

    public boolean uj() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127966u8).getValue()).r()).intValue() == 1;
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        boolean a17 = py0.b.f358971a.a();
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "photoToVideo: ret " + z17 + ", deviceSupport " + a17);
        return z17 && a17;
    }

    public java.lang.String vj(android.content.Context context, java.lang.String videoPath, java.lang.String desc, int i17, r45.ze2 ze2Var, long j17, long j18, r45.q23 q23Var, android.content.Intent intent, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (com.tencent.mm.sdk.platformtools.t8.K0(videoPath)) {
            com.tencent.mars.xlog.Log.e("FinderPublishFeatureService", "postSnsOriginVideoDirectly: video path is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postSnsOriginVideoDirectly: videoPath=");
        sb6.append(videoPath);
        sb6.append(", desc=");
        sb6.append(desc);
        sb6.append(" videoSource=");
        sb6.append(i17);
        sb6.append(" location=");
        if (ze2Var == null || (str = ze2Var.getString(3)) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(" videoTemplateInfo=(");
        sb6.append(q23Var != null ? q23Var.f383585d : null);
        sb6.append(',');
        sb6.append(q23Var != null ? q23Var.f383591m : null);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", sb6.toString());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 29, 74, intent);
        intent.putExtra("key_finder_post_router", 6);
        intent.putExtra("key_finder_post_from", 20);
        java.lang.String str2 = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        intent.putExtra("edit_id", str2);
        intent.putExtra("post_id", str2);
        intent.putExtra("postType", 4);
        intent.putExtra("postMediaList", kz5.c0.d(videoPath));
        intent.putExtra("postTypeList", kz5.c0.d(4));
        intent.putExtra("isLongVideoPost", false);
        intent.putExtra("saveDesc", desc);
        intent.putExtra("KEY_SHOW_FINDER_ACTION_BAR_TITLE", true);
        intent.putExtra("KEY_SNS_SERVER_FEED_ID", j17);
        intent.putExtra("KEY_SNS_LOCAL_FEED_ID", j18);
        if (q23Var != null) {
            intent.putExtra("KEY_POST_VIDEO_TEMPLATE", q23Var.toByteArray());
        }
        if (ze2Var != null) {
            Ui(intent, ze2Var);
        }
        if (z17) {
            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
            p2Var.W(p2Var.i(context, 27, false));
        } else {
            com.tencent.mm.plugin.finder.report.p2 p2Var2 = com.tencent.mm.plugin.finder.report.p2.f125237a;
            p2Var2.W(p2Var2.i(context, 16, false));
        }
        com.tencent.mm.plugin.finder.report.p2 p2Var3 = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var3.B(4);
        if (q23Var != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("template_id", q23Var.f383585d);
            jSONObject.put("music_id", q23Var.f383591m);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            p2Var3.V(r26.i0.t(jSONObject2, ",", ";", false));
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).hk(context, intent);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        wj(true, j17, Ri == null ? "" : Ri, j18, false, z17);
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean wi(boolean r13) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qs2.q.wi(boolean):boolean");
    }

    public void wj(boolean z17, long j17, java.lang.String sessionId, long j18, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "reportSnsPostEntrance: isClick=" + z17 + ", snsFeedId=" + pm0.v.u(j17) + ", snsLocalId=" + j18);
        if (j17 != 0) {
            com.tencent.mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct snsPostSyncFinderPostStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct();
            snsPostSyncFinderPostStruct.f60692d = z17 ? 2L : 1L;
            snsPostSyncFinderPostStruct.f60693e = snsPostSyncFinderPostStruct.b("snsfeedid", pm0.v.u(j17), true);
            snsPostSyncFinderPostStruct.f60694f = snsPostSyncFinderPostStruct.b("FinderPublishSessionId", sessionId, true);
            snsPostSyncFinderPostStruct.f60696h = z18 ? 1L : 15L;
            snsPostSyncFinderPostStruct.f60697i = z19 ? 2L : 1L;
            snsPostSyncFinderPostStruct.k();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(snsPostSyncFinderPostStruct);
            return;
        }
        com.tencent.mm.sdk.event.d dVar = com.tencent.mm.sdk.event.d.f192370d;
        jz5.g gVar = this.f366319f;
        if (!dVar.b((com.tencent.mm.plugin.finder.publish.FinderPublishFeatureService$snsPostListener$2$1) ((jz5.n) gVar).getValue())) {
            ((com.tencent.mm.plugin.finder.publish.FinderPublishFeatureService$snsPostListener$2$1) ((jz5.n) gVar).getValue()).alive();
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct snsPostSyncFinderPostStruct2 = new com.tencent.mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct();
        snsPostSyncFinderPostStruct2.f60692d = z17 ? 2L : 1L;
        snsPostSyncFinderPostStruct2.f60697i = z19 ? 2L : 1L;
        snsPostSyncFinderPostStruct2.f60694f = snsPostSyncFinderPostStruct2.b("FinderPublishSessionId", sessionId, true);
        snsPostSyncFinderPostStruct2.f60696h = z18 ? 1L : 15L;
        ((java.util.ArrayList) ((jz5.n) this.f366318e).getValue()).add(new jz5.l(java.lang.Long.valueOf(j18), snsPostSyncFinderPostStruct2));
    }

    public void xj(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if (qj()) {
            intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
            intent.putExtra("KEY_FINDER_IS_NEED_REFRESH_TAB", true);
            intent.putExtra("KEY_TARGET_TAB_TYPE", 4);
        } else {
            intent.putExtra("KEY_FINDER_JUMP_FOLLOW_TAB", true);
        }
        intent.putExtra("KEY_FINDER_JUMP_FROM_POST", true);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.B8).getValue()).l();
    }
}
