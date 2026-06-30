package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    public static android.content.Intent f191613b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.ref.WeakReference f191614c;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f191616e;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f191612a = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f191615d = new java.util.HashMap();

    static {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.lang.String[] split = com.tencent.mm.vfs.w6.M("assets:///mimetype.txt").split("\n");
            for (java.lang.String str : split) {
                java.lang.String[] split2 = str.split(",");
                if (split2 == null || split2.length <= 1 || com.tencent.mm.sdk.platformtools.t8.K0(split2[0]) || com.tencent.mm.sdk.platformtools.t8.K0(split2[1])) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "mimeType %s", str);
                } else {
                    f191615d.put(split2[0].trim(), split2[1].trim());
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "read from mimetype text %d %d %d", java.lang.Integer.valueOf(split.length), java.lang.Integer.valueOf(f191615d.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppChooserIntentUtil", e17, "read mimeType from asset", new java.lang.Object[0]);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        f191616e = hashMap;
        hashMap.put("txt", "mtt/txt");
        hashMap.put("epub", "mtt/epub");
        hashMap.put("pdf", "mtt/pdf");
        hashMap.put("doc", "mtt/doc");
        hashMap.put("xls", "mtt/xls");
        hashMap.put("ppt", "mtt/ppt");
        hashMap.put("docx", "mtt/docx");
        hashMap.put("xlsx", "mtt/xlsx");
        hashMap.put("pptx", "mtt/pptx");
        hashMap.put("chm", "mtt/chm");
        hashMap.put("ini", "mtt/ini");
        hashMap.put("log", "mtt/log");
        hashMap.put("bat", "mtt/bat");
        hashMap.put("php", "mtt/php");
        hashMap.put("lrc", "mtt/lrc");
        hashMap.put("js", "mtt/js");
    }

    public static void a(java.lang.String str, int i17) {
        if (gm0.j1.a()) {
            gm0.j1.u().c().w(str != null ? i17 + 274528 + str.hashCode() : i17 + 274528, "");
        }
    }

    public static android.content.Intent b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        com.tencent.mm.sdk.platformtools.i1.e(context, intent, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2 == null ? "" : str2)), str3, str, false);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "createNormalIntent %s %s %s", str, str2, intent.toString());
        } catch (java.lang.Exception unused) {
        }
        return intent;
    }

    public static android.content.Intent c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.tencent.mtt");
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("ChannelID", "com.tencent.mm");
        intent.putExtra("key_reader_sdk_id", 1);
        intent.putExtra("key_reader_sdk_type", 0);
        intent.putExtra("key_reader_sdk_path", str2);
        intent.putExtra("key_reader_sdk_sub_id", 1);
        if (i17 != -1) {
            intent.putExtra("PosID", i17);
        }
        if (str3 != null) {
            intent.putExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, str3);
            intent.putExtra("key_reader_sdk_format", com.tencent.mm.vfs.w6.n(str3));
        }
        com.tencent.mm.sdk.platformtools.i1.f(context, intent, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2 == null ? "" : str2)), str, false);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "createQQBrowserIntent %s %s %s", str, str2, intent.toString());
        } catch (java.lang.Exception unused) {
        }
        return intent;
    }

    public static java.lang.String d(java.lang.String str, int i17) {
        return (java.lang.String) gm0.j1.u().c().l(str != null ? i17 + 274528 + str.hashCode() : i17 + 274528, "");
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.String str2 = "application/octet-stream";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(mimeTypeFromExtension)) {
                mimeTypeFromExtension = (java.lang.String) f191615d.get(str);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mimeTypeFromExtension)) {
                str2 = mimeTypeFromExtension;
            } else if (!str.startsWith("/")) {
                str2 = "application/".concat(str);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "getMimeTypeByExt fileExt: %s mimeType: %s", str, str2);
        return str2;
    }

    public static void f(android.app.Activity activity, int i17, int i18, android.content.Intent intent, boolean z17, int i19, int i27, int i28) {
        if (i17 == 2) {
            if (-1 != i18 || intent == null) {
                if (4098 == i18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppChooserIntentUtil", "Not Found App Support media type");
                    if (z17) {
                        db5.e1.i(activity, i19, i27);
                        return;
                    }
                    return;
                }
                if (4097 != i18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "AppChooserUI result code is not ok or data is null");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "AppChooserUI result code is no choice");
                if (z17) {
                    db5.e1.i(activity, i19, i27);
                    return;
                }
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("selectpkg");
            android.content.Intent intent2 = (android.content.Intent) intent.getBundleExtra("transferback").getParcelable("targetintent");
            if (intent2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppChooserIntentUtil", "AppChooserUI target intent is null in handlerResultOfAppChooserUI");
                if (z17) {
                    db5.e1.i(activity, i19, i27);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "AppChooserUI select package name %s and target intent is not null", stringExtra);
            android.content.Intent intent3 = new android.content.Intent(intent2);
            intent3.setPackage(stringExtra);
            com.tencent.mm.pluginsdk.ui.otherway.i0.f190963a.a(stringExtra, intent2.getType());
            if (!com.tencent.mm.sdk.platformtools.t8.I0(activity, intent3, true, false)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppChooserIntentUtil", "Always Intent is not support mimetype");
                if (z17) {
                    db5.e1.i(activity, i19, i27);
                    return;
                }
                return;
            }
            try {
                if ("com.tencent.mtt".equals(stringExtra)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11168, 5, java.lang.Integer.valueOf(i28));
                    intent3.putExtra("PosID", 10262);
                    intent3.putExtra("ChannelID", "com.tencent.mtt");
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "handlerResultOfAppChooserUI", "(Landroid/app/Activity;IILandroid/content/Intent;ZIII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activity, "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "handlerResultOfAppChooserUI", "(Landroid/app/Activity;IILandroid/content/Intent;ZIII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (android.content.ActivityNotFoundException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppChooserIntentUtil", "ActivityNotFoundException:" + e17);
                if (z17) {
                    db5.e1.i(activity, i19, i27);
                }
            }
        }
    }

    public static void g(android.content.Context context, long j17, java.lang.String str, boolean z17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, java.lang.String str6, r45.w60 w60Var) {
        if (!com.tencent.mm.pluginsdk.model.t3.k(str3, str6)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "openByMiniQB: file Can't OpenByMiniQB ");
            return;
        }
        com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
        am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
        b6Var.f6219a = j17;
        b6Var.f6220b = str;
        exDeviceHaveBindNetworkDeviceEvent.e();
        am.c6 c6Var = exDeviceHaveBindNetworkDeviceEvent.f54142h;
        boolean z18 = c6Var.f6336a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "openByMiniQB msgId: " + j17 + ", filePath:" + str2 + ", fileExt:" + str3 + ", sence:" + i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("msg_id", j17);
        intent.putExtra("msg_talker", str);
        intent.putExtra("msg_share_forbidden", z17);
        intent.putExtra("open_in_device", c6Var.f6336a);
        intent.putExtra("file_path", str2);
        intent.putExtra("file_ext", str3);
        intent.putExtra("file_name", str4);
        intent.putExtra("file_md5", str5);
        intent.putExtra("sence", i17);
        if (w60Var != null) {
            try {
                intent.putExtra("key_multi_task_common_info", w60Var.toByteArray());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppChooserIntentUtil", "invoke openByMiniQB Exception! Error:%s", e17.getMessage());
            }
        }
        intent.addFlags(268435456);
        intent.setComponent(new android.content.ComponentName(com.tencent.mm.ui.u2.f211062a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CHECK_MINIQB_CAN_OPEN_FILE");
        ((th0.u) ((uh0.r) i95.n0.c(uh0.r.class))).getClass();
        com.tencent.mm.pluginsdk.model.c4.a(intent);
        if (str2 == null) {
            str2 = "";
        }
        android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(context, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2)));
        if (b17 != null) {
            ((java.util.HashSet) com.tencent.mm.sdk.platformtools.t8.f192994f).add(b17.toString());
        }
    }

    public static void h(java.lang.String str, int i17) {
        if (str != null) {
            gm0.j1.u().c().w(i17 + 274576 + str.hashCode(), java.lang.Boolean.TRUE);
        } else {
            gm0.j1.u().c().l(i17 + 274576, java.lang.Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(android.app.Activity r33, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.f.i(android.app.Activity, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, r45.w60 r41) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.f.j(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, r45.w60):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:9|(1:11)|12|(1:14)(1:241)|15|(3:16|17|18)|(3:19|20|21)|22|(35:24|(1:26)(2:170|(1:172)(2:173|(1:175)(40:176|177|178|(1:180)(1:230)|181|(5:183|(1:228)(14:187|188|189|190|191|192|(2:195|193)|196|197|(2:200|198)|201|202|203|(5:207|(3:209|(1:211)|212)(1:220)|(2:214|(33:216|217|28|29|30|31|32|33|(1:165)(1:37)|38|(4:157|158|159|160)(1:40)|41|42|(18:51|52|53|(1:55)(1:149)|56|(1:58)|59|139|140|141|142|143|65|(1:67)|68|(1:70)(1:138)|(1:72)(1:137)|73)|154|155|156|53|(0)(0)|56|(0)|59|139|140|141|142|143|65|(0)|68|(0)(0)|(0)(0)|73))|219|(0)))|221|219|(0))(1:229)|218|217|28|29|30|31|32|33|(1:35)|165|38|(0)(0)|41|42|(21:44|46|48|51|52|53|(0)(0)|56|(0)|59|139|140|141|142|143|65|(0)|68|(0)(0)|(0)(0)|73)|154|155|156|53|(0)(0)|56|(0)|59|139|140|141|142|143|65|(0)|68|(0)(0)|(0)(0)|73)))|27|28|29|30|31|32|33|(0)|165|38|(0)(0)|41|42|(0)|154|155|156|53|(0)(0)|56|(0)|59|139|140|141|142|143|65|(0)|68|(0)(0)|(0)(0)|73)(1:234)|74|(1:76)|77|78|79|80|81|82|83|(14:85|(2:87|(14:89|(1:91)(1:113)|92|93|(1:95)|96|97|98|(1:100)(1:109)|(1:102)|103|(1:105)|106|108)(1:114))(1:116)|115|93|(0)|96|97|98|(0)(0)|(0)|103|(0)|106|108)(2:117|(1:119))) */
    /* JADX WARN: Can't wrap try/catch for region: R(35:24|(1:26)(2:170|(1:172)(2:173|(1:175)(40:176|177|178|(1:180)(1:230)|181|(5:183|(1:228)(14:187|188|189|190|191|192|(2:195|193)|196|197|(2:200|198)|201|202|203|(5:207|(3:209|(1:211)|212)(1:220)|(2:214|(33:216|217|28|29|30|31|32|33|(1:165)(1:37)|38|(4:157|158|159|160)(1:40)|41|42|(18:51|52|53|(1:55)(1:149)|56|(1:58)|59|139|140|141|142|143|65|(1:67)|68|(1:70)(1:138)|(1:72)(1:137)|73)|154|155|156|53|(0)(0)|56|(0)|59|139|140|141|142|143|65|(0)|68|(0)(0)|(0)(0)|73))|219|(0)))|221|219|(0))(1:229)|218|217|28|29|30|31|32|33|(1:35)|165|38|(0)(0)|41|42|(21:44|46|48|51|52|53|(0)(0)|56|(0)|59|139|140|141|142|143|65|(0)|68|(0)(0)|(0)(0)|73)|154|155|156|53|(0)(0)|56|(0)|59|139|140|141|142|143|65|(0)|68|(0)(0)|(0)(0)|73)))|27|28|29|30|31|32|33|(0)|165|38|(0)(0)|41|42|(0)|154|155|156|53|(0)(0)|56|(0)|59|139|140|141|142|143|65|(0)|68|(0)(0)|(0)(0)|73) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x067b, code lost:
    
        r5 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0471, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0473, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0474, code lost:
    
        r10 = "MicroMsg.AppChooserIntentUtil";
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03f1, code lost:
    
        if (r58.getBoolean(2) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03f3, code lost:
    
        r0.put("from", "taskbar");
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x047b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0481, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0482, code lost:
    
        r10 = "MicroMsg.AppChooserIntentUtil";
        r3 = r32;
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0477, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0478, code lost:
    
        r10 = "MicroMsg.AppChooserIntentUtil";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x07b3 A[Catch: Exception -> 0x0802, TryCatch #13 {Exception -> 0x0802, blocks: (B:98:0x0754, B:100:0x07b3, B:102:0x07c3, B:103:0x07cd, B:105:0x07d1, B:106:0x07ed), top: B:97:0x0754 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x07c3 A[Catch: Exception -> 0x0802, TryCatch #13 {Exception -> 0x0802, blocks: (B:98:0x0754, B:100:0x07b3, B:102:0x07c3, B:103:0x07cd, B:105:0x07d1, B:106:0x07ed), top: B:97:0x0754 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07d1 A[Catch: Exception -> 0x0802, TryCatch #13 {Exception -> 0x0802, blocks: (B:98:0x0754, B:100:0x07b3, B:102:0x07c3, B:103:0x07cd, B:105:0x07d1, B:106:0x07ed), top: B:97:0x0754 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x038a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x036d A[Catch: Exception -> 0x047b, TryCatch #7 {Exception -> 0x047b, blocks: (B:33:0x0354, B:35:0x036d, B:38:0x0376, B:160:0x0390, B:41:0x03b0, B:44:0x03c1, B:46:0x03cb, B:48:0x03d4, B:51:0x03e5, B:151:0x03ed, B:153:0x03f3), top: B:32:0x0354 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03c1 A[Catch: Exception -> 0x047b, TRY_ENTER, TryCatch #7 {Exception -> 0x047b, blocks: (B:33:0x0354, B:35:0x036d, B:38:0x0376, B:160:0x0390, B:41:0x03b0, B:44:0x03c1, B:46:0x03cb, B:48:0x03d4, B:51:0x03e5, B:151:0x03ed, B:153:0x03f3), top: B:32:0x0354 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0452 A[Catch: Exception -> 0x0477, TryCatch #2 {Exception -> 0x0477, blocks: (B:53:0x0401, B:56:0x041a, B:58:0x0452, B:59:0x0461, B:156:0x03fe), top: B:155:0x03fe }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0730  */
    /* JADX WARN: Type inference failed for: r0v59, types: [d73.i] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [com.tencent.mm.plugin.handoff.model.HandOff] */
    /* JADX WARN: Type inference failed for: r5v25, types: [com.tencent.mm.plugin.handoff.model.HandOff] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, int r56, boolean r57, r45.w60 r58) {
        /*
            Method dump skipped, instructions count: 2399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.f.k(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, r45.w60):boolean");
    }

    public static boolean l(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        java.lang.String e17 = e(str3);
        android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(activity, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str == null ? "" : str)));
        android.os.Bundle bundle = new android.os.Bundle();
        android.content.Intent b18 = b(activity, e17, str, str2);
        bundle.putString("targeturl", b17 != null ? b17.toString() : "");
        bundle.putString("filepath", str);
        bundle.putString("fileext", str3);
        bundle.putParcelable("targetintent", b18);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.class);
        intent.putExtra("type", 0);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, activity.getResources().getString(com.tencent.mm.R.string.f490899b74));
        intent.putExtra("mimetype", e17);
        intent.putExtra("targetintent", b18);
        intent.putExtra("transferback", bundle);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        intent.putExtra("enter_scene", i18);
        intent.putExtra("openWay", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(2);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "startChooseWayActivity", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    public static void m(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        java.lang.String e17 = e(str3);
        a(e17, 0);
        android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(mMActivity, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str == null ? "" : str)));
        android.os.Bundle bundle = new android.os.Bundle();
        android.content.Intent b18 = b(mMActivity, e17, str, str2);
        bundle.putString("targeturl", b17.toString());
        bundle.putString("filepath", str);
        bundle.putString("fileext", str3);
        bundle.putParcelable("targetintent", b18);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("type", 0);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, mMActivity.getResources().getString(com.tencent.mm.R.string.f490899b74));
        intent.putExtra("mimetype", e17);
        intent.putExtra("targetintent", b18);
        intent.putExtra("transferback", bundle);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        intent.putExtra("openWay", true);
        j45.l.w(mMActivity, ".pluginsdk.ui.tools.AppChooserUI", intent, 2, new com.tencent.mm.pluginsdk.ui.tools.e(mMActivity, i17));
    }
}
