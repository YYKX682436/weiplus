package dk5;

/* loaded from: classes9.dex */
public final class y6 {

    /* renamed from: a, reason: collision with root package name */
    public static final dk5.y6 f235010a = new dk5.y6();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f235011b;

    public static final void a(dk5.y6 y6Var, ot0.q qVar, r45.vc7 vc7Var) {
        y6Var.getClass();
        rt0.a aVar = new rt0.a();
        if (vc7Var != null) {
            aVar.f399371b = vc7Var.f388119m;
            qVar.E2 = vc7Var.f388120n;
            com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendSecretAppMsg isSecretMsg: " + aVar.f399371b + ", forwardFlag: " + qVar.E2);
        }
        qVar.f(aVar);
    }

    public static /* synthetic */ com.tencent.mm.pluginsdk.model.app.a i(dk5.y6 y6Var, boolean z17, java.lang.String str, java.lang.String str2, dk5.f6 f6Var, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str2 = "";
        }
        if ((i17 & 8) != 0) {
            f6Var = null;
        }
        return y6Var.h(z17, str, str2, f6Var);
    }

    public static final void l(android.content.Context context, android.content.Intent intent, com.tencent.mm.pluginsdk.model.app.m app, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.util.LinkedList linkedList, int i17, boolean z17, boolean z18, java.lang.String pkgName, int i18, java.lang.String str, int i19, dk5.e6 e6Var, dk5.f6 f6Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(app, "app");
        kotlin.jvm.internal.o.g(pkgName, "pkgName");
        if (wXMediaMessage == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage fail, WXMediaMessage = null");
            if (e6Var != null) {
                ((dk5.z4) e6Var).b(3, "cb_msg_is_null");
                return;
            }
            return;
        }
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage fail, toUserList is Empty");
            if (e6Var != null) {
                ((dk5.z4) e6Var).b(3, "cb_key_user_list_is_empty");
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage  type:" + wXMediaMessage.getType() + "  scene:" + i19);
        dk5.y6 y6Var = f235010a;
        if (i19 != 2) {
            y6Var.d(context, intent, app, wXMediaMessage, linkedList, i17, z17, z18, pkgName, i18, str, i19, e6Var, f6Var);
            return;
        }
        dk5.u6 u6Var = new dk5.u6(context, intent, app, wXMediaMessage, linkedList, i17, z17, z18, pkgName, i18, str, i19, e6Var);
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXImageObject) {
            kotlin.jvm.internal.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXImageObject");
            com.tencent.mm.opensdk.modelmsg.WXImageObject wXImageObject = (com.tencent.mm.opensdk.modelmsg.WXImageObject) iMediaObject;
            java.lang.String imagePath = wXImageObject.imagePath;
            kotlin.jvm.internal.o.f(imagePath, "imagePath");
            y6Var.c(imagePath, new dk5.g6(wXImageObject, u6Var));
            return;
        }
        if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXFileObject) {
            kotlin.jvm.internal.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXFileObject");
            com.tencent.mm.opensdk.modelmsg.WXFileObject wXFileObject = (com.tencent.mm.opensdk.modelmsg.WXFileObject) iMediaObject;
            java.lang.String filePath = wXFileObject.filePath;
            kotlin.jvm.internal.o.f(filePath, "filePath");
            y6Var.c(filePath, new dk5.h6(wXFileObject, u6Var));
            return;
        }
        if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXEmojiObject) {
            kotlin.jvm.internal.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXEmojiObject");
            com.tencent.mm.opensdk.modelmsg.WXEmojiObject wXEmojiObject = (com.tencent.mm.opensdk.modelmsg.WXEmojiObject) iMediaObject;
            java.lang.String emojiPath = wXEmojiObject.emojiPath;
            kotlin.jvm.internal.o.f(emojiPath, "emojiPath");
            y6Var.c(emojiPath, new dk5.i6(wXEmojiObject, u6Var));
            return;
        }
        if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXVideoFileObject) {
            kotlin.jvm.internal.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXVideoFileObject");
            com.tencent.mm.opensdk.modelmsg.WXVideoFileObject wXVideoFileObject = (com.tencent.mm.opensdk.modelmsg.WXVideoFileObject) iMediaObject;
            java.lang.String filePath2 = wXVideoFileObject.filePath;
            kotlin.jvm.internal.o.f(filePath2, "filePath");
            y6Var.c(filePath2, new dk5.j6(wXVideoFileObject, u6Var));
            return;
        }
        if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject) {
            kotlin.jvm.internal.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject");
            com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject wXGameVideoFileObject = (com.tencent.mm.opensdk.modelmsg.WXGameVideoFileObject) iMediaObject;
            java.lang.String filePath3 = wXGameVideoFileObject.filePath;
            kotlin.jvm.internal.o.f(filePath3, "filePath");
            y6Var.c(filePath3, new dk5.k6(wXGameVideoFileObject, u6Var));
            return;
        }
        if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXAppExtendObject) {
            kotlin.jvm.internal.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXAppExtendObject");
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = (com.tencent.mm.opensdk.modelmsg.WXAppExtendObject) iMediaObject;
            java.lang.String filePath4 = wXAppExtendObject.filePath;
            kotlin.jvm.internal.o.f(filePath4, "filePath");
            y6Var.c(filePath4, new dk5.l6(wXAppExtendObject, u6Var));
            return;
        }
        if (!(iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject)) {
            u6Var.invoke(0);
            return;
        }
        kotlin.jvm.internal.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject");
        com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = (com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject) iMediaObject;
        java.lang.String hdAlbumThumbFilePath = wXMusicVideoObject.hdAlbumThumbFilePath;
        kotlin.jvm.internal.o.f(hdAlbumThumbFilePath, "hdAlbumThumbFilePath");
        y6Var.c(hdAlbumThumbFilePath, new dk5.m6(wXMusicVideoObject, u6Var));
    }

    public final void b(java.lang.String str, k91.v5 v5Var, ot0.q qVar, r45.vc7 vc7Var, dk5.f6 f6Var) {
        r45.k46 k46Var;
        ot0.a aVar = new ot0.a();
        aVar.f348360p = v5Var.u0() != null ? v5Var.u0().f305642q : 0;
        aVar.f348362r = v5Var.u0() != null ? v5Var.u0().f305643r : 0;
        aVar.f348363s = v5Var.u0() != null ? v5Var.u0().f305644s : 0;
        if (vc7Var != null) {
            boolean z17 = vc7Var.f388116g;
            aVar.f348349e = z17;
            if (z17 && (k46Var = vc7Var.f388115f) != null) {
                aVar.f348350f = k46Var.f378366d;
                aVar.f348351g = k46Var.f378367e;
                aVar.f348352h = k46Var.f378368f;
                aVar.f348353i = k46Var.f378369g;
                aVar.f348354j = k46Var.f378370h;
                aVar.f348355k = k46Var.f378373n;
                aVar.f348357m = k46Var.f378372m;
                aVar.f348356l = k46Var.f378371i;
            }
            boolean z18 = vc7Var.f388119m;
            aVar.f348367w = z18;
            if (z18) {
                qVar.f348705r2 = 1;
            }
        }
        aVar.K = f6Var != null ? f6Var.f234624a : false;
        if (kotlin.jvm.internal.o.b("wxid_wi_1d142z0zdj03", str)) {
            java.lang.String str2 = v5Var.field_appId;
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0 Ai = ((com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p) ((com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0) i95.n0.c(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0.class))).Ai(str2);
            if (Ai != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "getAndUploadPageContentCache appId:" + str2 + "}result:" + Ai);
                aVar.S = Ai.f80294c;
                aVar.T = Ai.f80295d;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.SendWXMediaMessageHelper", "getAndUploadPageContentCache appId:" + str2 + " result is null");
            }
        }
        qVar.f(aVar);
    }

    public final void c(java.lang.String str, yz5.p pVar) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        if (!com.tencent.mm.pluginsdk.model.app.w.e(str)) {
            pVar.invoke(3, null);
            return;
        }
        pVar.invoke(1, null);
        ((ku5.t0) ku5.t0.f312615d).h(new dk5.n6(str, pVar), "SendWXMediaMessageCopyFile");
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0612  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r28, android.content.Intent r29, com.tencent.mm.pluginsdk.model.app.m r30, com.tencent.mm.opensdk.modelmsg.WXMediaMessage r31, java.util.LinkedList r32, int r33, boolean r34, boolean r35, java.lang.String r36, int r37, java.lang.String r38, int r39, dk5.e6 r40, dk5.f6 r41) {
        /*
            Method dump skipped, instructions count: 1575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk5.y6.d(android.content.Context, android.content.Intent, com.tencent.mm.pluginsdk.model.app.m, com.tencent.mm.opensdk.modelmsg.WXMediaMessage, java.util.LinkedList, int, boolean, boolean, java.lang.String, int, java.lang.String, int, dk5.e6, dk5.f6):void");
    }

    public final void f(ot0.q qVar, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage) {
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject;
        if (qVar == null || wXMediaMessage == null || (iMediaObject = wXMediaMessage.mediaObject) == null) {
            return;
        }
        if (!(iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject)) {
            if (iMediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) {
                kotlin.jvm.internal.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject");
                qVar.f348705r2 = ((com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) iMediaObject).disableforward;
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject");
        com.tencent.mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject wXDynamicVideoMiniProgramObject = (com.tencent.mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject) iMediaObject;
        ot0.a aVar = new ot0.a();
        byte[] thumbData = wXMediaMessage.thumbData;
        if (thumbData != null) {
            kotlin.jvm.internal.o.f(thumbData, "thumbData");
            if (!(thumbData.length == 0)) {
                byte[] bArr = wXMediaMessage.thumbData;
                int length = bArr.length;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(length));
                arrayList.add(0);
                arrayList.add(bArr);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/transmit/SendWXMediaMessageHelper", "fillWeishiVideoData", "(Lcom/tencent/mm/message/AppMessage$Content;Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj, decodeByteArray, "com/tencent/mm/ui/transmit/SendWXMediaMessageHelper", "fillWeishiVideoData", "(Lcom/tencent/mm/message/AppMessage$Content;Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                if (decodeByteArray != null) {
                    aVar.f348370z = decodeByteArray.getWidth();
                    aVar.A = decodeByteArray.getHeight();
                }
            }
        }
        aVar.B = wXDynamicVideoMiniProgramObject.videoSource;
        aVar.C = wXDynamicVideoMiniProgramObject.appThumbUrl;
        aVar.D = 1;
        qVar.f(aVar);
        qVar.f348705r2 = wXDynamicVideoMiniProgramObject.disableforward;
        qVar.f348726x = null;
    }

    public final java.lang.String g(com.tencent.mm.pluginsdk.model.app.m mVar) {
        java.lang.String str = mVar.field_appId;
        java.lang.String a17 = c01.n2.a("app_" + mVar.field_appId);
        c01.n2.d().c(a17, true).i("prePublishId", "app_" + mVar.field_appId);
        kotlin.jvm.internal.o.d(a17);
        return a17;
    }

    public final com.tencent.mm.pluginsdk.model.app.a h(boolean z17, java.lang.String str, java.lang.String str2, dk5.f6 f6Var) {
        com.tencent.mm.pluginsdk.model.app.a aVar = new com.tencent.mm.pluginsdk.model.app.a();
        aVar.f188790a = z17 ? 1 : 0;
        aVar.f188791b = str;
        aVar.f188792c = str2;
        aVar.f188793d = f6Var != null ? f6Var.f234625b : null;
        aVar.f188794e = f6Var != null ? f6Var.f234626c : null;
        aVar.f188795f = f6Var != null ? f6Var.f234627d : null;
        aVar.f188796g = f6Var != null ? f6Var.f234628e : 0;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x003d, code lost:
    
        if ((r0.length() == 0) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if ((r0.length == 0) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.tencent.mm.pluginsdk.model.app.m r21, com.tencent.mm.opensdk.modelmsg.WXMediaMessage r22, java.util.LinkedList r23, java.lang.String r24, java.lang.String r25, int r26, boolean r27, boolean r28, java.lang.String r29, java.lang.String r30, java.lang.Object r31, dk5.e6 r32, dk5.f6 r33) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk5.y6.j(com.tencent.mm.pluginsdk.model.app.m, com.tencent.mm.opensdk.modelmsg.WXMediaMessage, java.util.LinkedList, java.lang.String, java.lang.String, int, boolean, boolean, java.lang.String, java.lang.String, java.lang.Object, dk5.e6, dk5.f6):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.tencent.mm.pluginsdk.model.app.m r17, com.tencent.mm.opensdk.modelmsg.WXMediaMessage r18, java.util.LinkedList r19, boolean r20, boolean r21, dk5.e6 r22, dk5.f6 r23, com.tencent.mm.modelmulti.WxaInfo r24) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk5.y6.k(com.tencent.mm.pluginsdk.model.app.m, com.tencent.mm.opensdk.modelmsg.WXMediaMessage, java.util.LinkedList, boolean, boolean, dk5.e6, dk5.f6, com.tencent.mm.modelmulti.WxaInfo):void");
    }
}
