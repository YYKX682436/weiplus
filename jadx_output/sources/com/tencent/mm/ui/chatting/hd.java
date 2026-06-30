package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public abstract class hd {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.u3 f201679a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f201680b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f201681c = new java.util.concurrent.ConcurrentHashMap();

    public static void a(final android.content.Context context, final com.tencent.mm.storage.z3 z3Var, final java.util.List msgList, final boolean z17, final com.tencent.wework.api.IWWAPI.WWAppType wWAppType, final int i17) {
        int type;
        ot0.q v17;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(msgList) && msgList.size() == 1) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) msgList.get(0);
            if (f9Var != null && ((type = f9Var.getType()) == 754974769 || type == 771751985 || type == 973078577 || ((v17 = ot0.q.v(f9Var.j())) != null && v17.f348666i == 24))) {
                com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) msgList.get(0);
                r45.w43 w43Var = new r45.w43();
                w43Var.f388872d = java.lang.String.valueOf(c01.id.c());
                w43Var.f388873e = 49;
                w43Var.f388874f = new com.tencent.mm.protobuf.g((f9Var2.getType() == 754974769 ? c01.w9.r(f9Var2.j()) : f9Var2.j()).getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(w43Var);
                u(context);
                ((dk5.s5) tg3.t1.a()).wi(context, c(wWAppType), arrayList, new tg3.x0() { // from class: com.tencent.mm.ui.chatting.hd$$b
                    @Override // tg3.x0
                    public final void a(int i18, int i19, java.util.List list, byte[] bArr) {
                        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.ui.chatting.hd.f201679a;
                        if (u3Var != null) {
                            u3Var.dismiss();
                            com.tencent.mm.ui.chatting.hd.f201679a = null;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "onCallback() called with: errorType = [" + i18 + "], errorCode = [" + i19 + "], resultList = [" + list + "]");
                        if (i18 == 0 && i19 == 0) {
                            return;
                        }
                        android.content.Context context2 = context;
                        db5.t7.g(context2, context2.getString(com.tencent.mm.R.string.h0a));
                    }
                });
                return;
            }
        }
        sc5.k kVar = sc5.k.f406589a;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        java.util.ArrayList arrayList2 = (java.util.ArrayList) sc5.k.f406593e;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) sc5.k.f406594f;
        arrayList3.clear();
        java.util.ArrayList arrayList4 = (java.util.ArrayList) sc5.k.f406595g;
        arrayList4.clear();
        java.util.Iterator it = msgList.iterator();
        while (true) {
            r45.ul5 ul5Var = null;
            if (!it.hasNext()) {
                if (arrayList2.size() + arrayList3.size() <= 0) {
                    g(context, z3Var, msgList, z17, wWAppType, i17);
                    return;
                }
                u(context);
                f201680b = true;
                ((java.util.concurrent.ConcurrentHashMap) f201681c).clear();
                sc5.k kVar2 = sc5.k.f406589a;
                yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.chatting.hd$$d
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        android.content.Context context2 = context;
                        com.tencent.mm.storage.z3 z3Var2 = z3Var;
                        java.util.List list = msgList;
                        boolean z18 = z17;
                        com.tencent.wework.api.IWWAPI.WWAppType wWAppType2 = wWAppType;
                        int i18 = i17;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            if (com.tencent.mm.ui.chatting.hd.f201680b) {
                                com.tencent.mm.ui.chatting.hd.g(context2, z3Var2, list, z18, wWAppType2, i18);
                            }
                            com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.ui.chatting.hd.f201679a;
                            if (u3Var != null) {
                                u3Var.dismiss();
                                com.tencent.mm.ui.chatting.hd.f201679a = null;
                            }
                            com.tencent.mm.ui.chatting.hd.f201680b = false;
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SendToWeWorkHelper", "doMultiShare: doGetBuffer failed");
                            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = com.tencent.mm.ui.chatting.hd.f201679a;
                            if (u3Var2 != null) {
                                u3Var2.dismiss();
                                com.tencent.mm.ui.chatting.hd.f201679a = null;
                            }
                            com.tencent.mm.ui.chatting.hd.f201680b = false;
                        }
                        return null;
                    }
                };
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = sc5.k.f406590b;
                if (lifecycleScope != null) {
                    kotlinx.coroutines.l.d(lifecycleScope, null, null, new sc5.j(lVar, context, null), 3, null);
                    return;
                }
                return;
            }
            com.tencent.mm.storage.f9 f9Var3 = (com.tencent.mm.storage.f9) it.next();
            switch (f9Var3.getType()) {
                case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                case 268435505:
                case 1090519089:
                    ot0.q v18 = ot0.q.v(f9Var3.U1());
                    if (v18 == null) {
                        break;
                    } else {
                        if (v18.f348666i == 19) {
                            java.lang.String j17 = f9Var3.j();
                            if (com.tencent.mm.storage.z3.R4(f9Var3.Q0())) {
                                j17 = c01.w9.u(f9Var3.j());
                            }
                            ot0.q v19 = ot0.q.v(j17);
                            if (v19 != null) {
                                java.lang.String recordinfo = v19.f348663h0;
                                kotlin.jvm.internal.o.f(recordinfo, "recordinfo");
                                ul5Var = bt3.g2.A(recordinfo);
                            }
                            if (ul5Var != null) {
                                java.util.Iterator it6 = ul5Var.f387465f.iterator();
                                while (it6.hasNext()) {
                                    kVar.e((r45.gp0) it6.next());
                                }
                            }
                        }
                        if (v18.f348666i != 24) {
                            break;
                        } else {
                            arrayList4.add(f9Var3);
                            r45.w43 d17 = kVar.d(f9Var3);
                            if (!kVar.c(d17)) {
                                arrayList3.add(d17);
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MultiSendToWeWorkHelper", "Message[" + d17.f388872d + "] already in pending list");
                                break;
                            }
                        }
                    }
                case 754974769:
                case 771751985:
                case 973078577:
                    kVar.b(kVar.d(f9Var3));
                    break;
            }
        }
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.String str2 = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.forward.RepairerConfigForwardToWeWorkFileProvider()) != 1) {
            str2 = com.tencent.mm.vfs.w6.i(str, false);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)));
            if (b17 != null) {
                str2 = b17.toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "getFileProviderUri: filePath：%s ,fileProviderUri:%s", str, str2);
            } else {
                str2 = com.tencent.mm.vfs.w6.i(str, false);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "getFilePath() called with: filePath = [" + str + "] , result = [" + str2 + "]");
        if (!com.tencent.mm.sdk.platformtools.y1.g(str2)) {
            return str2;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String P0 = m11.b1.Di().P0(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "exportToJpgAndGetFullPath, jpgFile = " + P0);
        return P0;
    }

    public static int c(com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "getIntWWAppType() called with: type = [" + wWAppType + "]");
        return (wWAppType != com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork && wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal) ? 2 : 1;
    }

    public static com.tencent.wework.api.IWWAPI.WWAppType d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "getWWAppType() called with: type = [" + i17 + "]");
        com.tencent.wework.api.IWWAPI.WWAppType wWAppType = com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork;
        return (i17 != 1 && i17 == 2) ? com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal : wWAppType;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v104, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v105, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v106, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v107, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v108, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v109, types: [com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.WWMediaLocation] */
    /* JADX WARN: Type inference failed for: r0v110, types: [com.tencent.wework.api.model.WWMediaFile, com.tencent.wework.api.model.WWMediaVideo] */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v70, types: [com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.WWMediaLink] */
    /* JADX WARN: Type inference failed for: r0v73, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v78, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v81, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v85, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v89, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v95, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r0v98, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.WWMediaMergedConvs] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v60, types: [com.tencent.wework.api.model.WWMediaText] */
    /* JADX WARN: Type inference failed for: r4v65, types: [com.tencent.wework.api.model.WWMediaText] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.wework.api.model.WWMediaMessage.WWMediaObject e(android.content.Context r28, com.tencent.mm.storage.z3 r29, java.util.List r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.hd.e(android.content.Context, com.tencent.mm.storage.z3, java.util.List, boolean):com.tencent.wework.api.model.WWMediaMessage$WWMediaObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.wework.api.model.WWMediaMessage.WWMediaObject f(com.tencent.mm.storage.z3 r7, r45.gp0 r8, com.tencent.mm.storage.f9 r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.hd.f(com.tencent.mm.storage.z3, r45.gp0, com.tencent.mm.storage.f9, boolean):com.tencent.wework.api.model.WWMediaMessage$WWMediaObject");
    }

    public static void g(android.content.Context context, com.tencent.mm.storage.z3 z3Var, java.util.List list, boolean z17, com.tencent.wework.api.IWWAPI.WWAppType wWAppType, int i17) {
        com.tencent.wework.api.IWWAPI a17 = com.tencent.wework.api.WWAPIFactory.a(context);
        try {
            com.tencent.wework.api.model.WWMediaMessage.WWMediaObject e17 = e(context, z3Var, list, z17);
            l(e17, i17);
            a17.a(e17, wWAppType);
            a14.g.a().c(1);
        } catch (com.tencent.mm.ui.chatting.nd unused) {
            db5.e1.s(context, context.getResources().getString(com.tencent.mm.R.string.iik, java.lang.Long.valueOf(ip.c.k() / 1048576)), context.getResources().getString(com.tencent.mm.R.string.f490573yv));
            a14.g.a().c(2);
        }
        com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct multiMessageForwardStruct = a14.g.a().f609a;
        multiMessageForwardStruct.f59346i = 1L;
        multiMessageForwardStruct.n();
        multiMessageForwardStruct.k();
    }

    public static boolean h(android.content.Context context, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean c17 = com.tencent.wework.api.WWAPIFactory.a(context).c(wWAppType);
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "isSupport: result:%s type:%s costTime:%s", java.lang.Boolean.valueOf(c17), wWAppType, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return c17;
    }

    public static boolean i(android.content.Context context) {
        boolean z17 = k() || j();
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "isSupportForwardToWeWork: isSupportMultiMsgForward:%s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static boolean j() {
        boolean b17 = com.tencent.wework.api.WWAPIFactory.a(com.tencent.mm.sdk.platformtools.x2.f193071a).b(com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal);
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "isWeWorkLocalSupportMultiForward:%s ", java.lang.Boolean.valueOf(b17));
        return b17;
    }

    public static boolean k() {
        boolean b17 = com.tencent.wework.api.WWAPIFactory.a(com.tencent.mm.sdk.platformtools.x2.f193071a).b(com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork);
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "isWeWorkSupportMultiForward:%s ", java.lang.Boolean.valueOf(b17));
        return b17;
    }

    public static void l(com.tencent.wework.api.model.WWMediaMessage.WWMediaObject wWMediaObject, int i17) {
        r45.w43 w43Var;
        java.lang.String str;
        if (wWMediaObject instanceof com.tencent.wework.api.model.WWMediaMergedConvs) {
            com.tencent.wework.api.model.WWMediaMergedConvs wWMediaMergedConvs = (com.tencent.wework.api.model.WWMediaMergedConvs) wWMediaObject;
            wWMediaMergedConvs.f220163g = i17;
            com.tencent.mm.protobuf.g gVar = sc5.k.f406592d;
            sc5.k.f406592d = null;
            if (gVar != null) {
                wWMediaMergedConvs.f220164h = gVar.f192156a;
            }
        }
        java.util.Map map = f201681c;
        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
            long longValue = ((java.lang.Long) entry.getKey()).longValue();
            java.util.LinkedHashMap linkedHashMap = sc5.k.f406591c;
            long parseLong = (!linkedHashMap.containsKey(java.lang.Long.valueOf(longValue)) || (w43Var = (r45.w43) linkedHashMap.get(java.lang.Long.valueOf(longValue))) == null || (str = w43Var.f388872d) == null) ? -1L : java.lang.Long.parseLong(str);
            if (parseLong != -1) {
                for (com.tencent.wework.api.model.WWMediaMessage.WWMediaObject wWMediaObject2 : (java.util.List) entry.getValue()) {
                    if (wWMediaObject2 instanceof com.tencent.wework.api.model.WWMediaText) {
                        ((com.tencent.wework.api.model.WWMediaText) wWMediaObject2).f220177g = java.lang.String.valueOf(parseLong);
                    }
                }
            }
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = f201679a;
        if (u3Var != null) {
            u3Var.dismiss();
            f201679a = null;
        }
        f201680b = false;
        ((java.util.concurrent.ConcurrentHashMap) map).clear();
    }

    public static void m(android.content.Context context, com.tencent.mm.sendtowework.FileData fileData, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        if (fileData == null) {
            return;
        }
        long longValue = fileData.f193167e.longValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendFileToWeWork() called with: context = [");
        sb6.append(context);
        sb6.append("], filePath = [");
        java.lang.String str = fileData.f193166d;
        sb6.append(str);
        sb6.append("], fileSize = [");
        sb6.append(longValue);
        sb6.append("], title = [");
        java.lang.String str2 = fileData.f193168f;
        sb6.append(str2);
        sb6.append("], appType = [");
        sb6.append(wWAppType);
        sb6.append("]");
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", sb6.toString());
        long k17 = ip.c.k();
        if (longValue > k17) {
            throw new com.tencent.mm.ui.chatting.nd();
        }
        com.tencent.wework.api.model.WWMediaFile wWMediaFile = new com.tencent.wework.api.model.WWMediaFile();
        wWMediaFile.f220154h = str2;
        wWMediaFile.f220153g = b(str);
        wWMediaFile.f220152f = (int) k17;
        com.tencent.wework.api.WWAPIFactory.a(context).a(wWMediaFile, wWAppType);
    }

    public static void n(android.content.Context context, java.lang.String str, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "sendImgToWeWork() called with: context = [" + context + "], filePath = [" + str + "], appType = [" + wWAppType + "]");
        com.tencent.wework.api.model.WWMediaImage wWMediaImage = new com.tencent.wework.api.model.WWMediaImage();
        wWMediaImage.f220153g = b(str);
        com.tencent.wework.api.WWAPIFactory.a(context).a(wWMediaImage, wWAppType);
    }

    public static void o(android.content.Context context, com.tencent.mm.sendtowework.LinkData linkData, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        if (linkData == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendLinkToWeWork() called with: context = [");
        sb6.append(context);
        sb6.append("], url = [");
        java.lang.String str = linkData.f193170d;
        sb6.append(str);
        sb6.append("], title = [");
        java.lang.String str2 = linkData.f193171e;
        sb6.append(str2);
        sb6.append("], description = [");
        java.lang.String str3 = linkData.f193172f;
        sb6.append(str3);
        sb6.append("], imgUrl = [");
        java.lang.String str4 = linkData.f193173g;
        sb6.append(str4);
        sb6.append("], appType = [");
        sb6.append(wWAppType);
        sb6.append("]");
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", sb6.toString());
        com.tencent.wework.api.model.WWMediaLink wWMediaLink = new com.tencent.wework.api.model.WWMediaLink();
        wWMediaLink.f220156f = str;
        wWMediaLink.f220165c = str2;
        wWMediaLink.f220166d = str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.wework.api.WWAPIFactory.a(context).a(wWMediaLink, wWAppType);
        } else {
            wWMediaLink.f220157g = str4;
            com.tencent.wework.api.WWAPIFactory.a(context).a(wWMediaLink, wWAppType);
        }
    }

    public static void p(android.content.Context context, java.lang.String str, java.lang.String str2, double d17, double d18, double d19, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "sendLocationToWeWork() called with: context = [" + context + "], poiName = [" + str + "], address = [" + str2 + "], longitude = [" + d17 + "], latitude = [" + d18 + "], zoom = [" + d19 + "], appType = [" + wWAppType + "]");
        com.tencent.wework.api.model.WWMediaLocation wWMediaLocation = new com.tencent.wework.api.model.WWMediaLocation();
        wWMediaLocation.f220165c = str;
        wWMediaLocation.f220158f = str2;
        wWMediaLocation.f220159g = d17;
        wWMediaLocation.f220160h = d18;
        wWMediaLocation.f220161i = d19;
        com.tencent.wework.api.WWAPIFactory.a(context).a(wWMediaLocation, wWAppType);
    }

    public static void q(android.content.Context context, com.tencent.mm.sendtowework.AppBrandData appBrandData, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        if (appBrandData == null) {
            return;
        }
        java.lang.String str = appBrandData.f193163h;
        java.lang.String str2 = appBrandData.f193164i;
        int intValue = appBrandData.f193165m.intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendMiniProgramToWeWork() called with: context = [");
        sb6.append(context);
        sb6.append("], appbrandUsername = [");
        java.lang.String str3 = appBrandData.f193159d;
        sb6.append(str3);
        sb6.append("], appbrandPagepath = [");
        java.lang.String str4 = appBrandData.f193160e;
        sb6.append(str4);
        sb6.append("], appbrandWeAappIconUrl = [");
        java.lang.String str5 = appBrandData.f193161f;
        sb6.append(str5);
        sb6.append("], imgPath = [");
        java.lang.String str6 = appBrandData.f193162g;
        sb6.append(str6);
        sb6.append("], srcDisplayname = [");
        sb6.append(str);
        sb6.append("], title = [");
        sb6.append(str2);
        sb6.append("], appbrandType = [");
        sb6.append(intValue);
        sb6.append("], appType = [");
        sb6.append(wWAppType);
        sb6.append("]");
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", sb6.toString());
        com.tencent.wework.api.model.WWMediaMiniProgram wWMediaMiniProgram = new com.tencent.wework.api.model.WWMediaMiniProgram();
        wWMediaMiniProgram.f220168f = str3;
        wWMediaMiniProgram.f220169g = str4;
        wWMediaMiniProgram.f220171i = str5;
        final com.tencent.mm.ui.chatting.hd$$a hd__a = new com.tencent.mm.ui.chatting.hd$$a(wWMediaMiniProgram, str, str2, intValue, context, wWAppType);
        byte[] bArr = null;
        if (android.text.TextUtils.isEmpty(str6)) {
            hd__a.a(null);
            return;
        }
        if (str6.startsWith("http://") || str6.startsWith("https://")) {
            l01.d0.f314761a.o(str6, new l01.t() { // from class: com.tencent.mm.ui.chatting.hd$$c
                @Override // l01.t
                public final void a(byte[] bArr2) {
                    ((com.tencent.mm.ui.chatting.hd$$a) com.tencent.mm.ui.chatting.od.this).a(bArr2);
                }
            });
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(str6)) {
            str6 = m11.b1.Di().D2(null, str6, true);
        }
        if (o35.a.b(str6)) {
            try {
                android.graphics.Bitmap d17 = t23.t1.d(str6);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                d17.compress(android.graphics.Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SendToWeWorkHelper", e17, "resolveMiniProgramImageData, read local file to bitmap data fail", new java.lang.Object[0]);
            }
        }
        hd__a.a(bArr);
    }

    public static void r(android.content.Context context, java.lang.String str, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "sendTextToWeWork() called with: context = [" + context + "], textContent = [" + str + "], appType = [" + wWAppType + "]");
        com.tencent.wework.api.WWAPIFactory.a(context).a(new com.tencent.wework.api.model.WWMediaText(str), wWAppType);
    }

    public static void s(android.content.Context context, java.lang.String str, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "sendVideoToWeWork() called with: context = [" + context + "], filePath = [" + str + "], appType = [" + wWAppType + "]");
        com.tencent.wework.api.model.WWMediaVideo wWMediaVideo = new com.tencent.wework.api.model.WWMediaVideo();
        wWMediaVideo.f220153g = b(str);
        com.tencent.wework.api.WWAPIFactory.a(context).a(wWMediaVideo, wWAppType);
    }

    public static boolean t(android.content.Context context, com.tencent.mm.storage.z3 z3Var, java.util.List list, boolean z17, com.tencent.wework.api.IWWAPI.WWAppType wWAppType, int i17) {
        if (list == null || list.size() == 0) {
            return false;
        }
        if (com.tencent.mm.ui.chatting.n3.t(list)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SendToWeWorkHelper", "isContainPlaceHolderMsg");
            db5.e1.y(context, context.getString(com.tencent.mm.R.string.bko), "", context.getString(com.tencent.mm.R.string.f489708h), new com.tencent.mm.ui.chatting.id());
            return false;
        }
        if (com.tencent.mm.ui.chatting.n3.w(list)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SendToWeWorkHelper", "isContainUndownloadFile");
            db5.e1.u(context, context.getString(com.tencent.mm.R.string.bks), "", new com.tencent.mm.ui.chatting.jd(), null);
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!com.tencent.mm.ui.chatting.la.a((com.tencent.mm.storage.f9) it.next())) {
                db5.e1.y(context, context.getString(com.tencent.mm.R.string.c96), "", context.getString(com.tencent.mm.R.string.l_e), null);
                return false;
            }
        }
        if (com.tencent.mm.ui.chatting.n3.g(true, list, z3Var.d1(), null)) {
            a(context, z3Var, list, z17, wWAppType, i17);
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SendToWeWorkHelper", "handleInvalidSendToFriendMsg");
        db5.e1.A(context, context.getString(com.tencent.mm.R.string.g1l), "", context.getString(com.tencent.mm.R.string.f492836i24), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.chatting.kd(context, z3Var, list, z17, wWAppType, i17), new com.tencent.mm.ui.chatting.ld());
        return true;
    }

    public static void u(android.content.Context context) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = f201679a;
        if (u3Var != null) {
            u3Var.dismiss();
            f201679a = null;
        }
        if (context == null) {
            return;
        }
        f201679a = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.ggc), context.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.chatting.md());
    }
}
