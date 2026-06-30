package yw;

/* loaded from: classes9.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.q2 f466434a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f466435b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f466436c;

    static {
        yw.q2 q2Var = new yw.q2();
        f466434a = q2Var;
        f466435b = q2Var.hashCode();
    }

    public static final com.tencent.mm.opensdk.modelmsg.WXMediaMessage a(yw.q2 q2Var, com.tencent.pigeon.biz.BizShareInfo bizShareInfo) {
        q2Var.getClass();
        java.lang.String url = bizShareInfo.getUrl();
        if (url == null || url.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizFlutterShareMsgHelper", "convert fail, link is null");
            return null;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject();
        wXWebpageObject.webpageUrl = bizShareInfo.getUrl();
        wXMediaMessage.mediaObject = wXWebpageObject;
        wXMediaMessage.title = bizShareInfo.getTitle();
        wXMediaMessage.description = bizShareInfo.getDesc();
        return wXMediaMessage;
    }

    public static final void b(yw.q2 q2Var, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, com.tencent.pigeon.biz.BizShareInfo bizShareInfo, java.lang.String str2) {
        q2Var.getClass();
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(bizShareInfo.getImgUrl());
        if (Bi != null && !Bi.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterShareMsgHelper", "thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
        }
        java.lang.String a17 = c01.n2.a(bizShareInfo.getMsgId());
        c01.l2 c17 = c01.n2.d().c(a17, true);
        java.lang.Long itemShowType = bizShareInfo.getItemShowType();
        c17.i("_DATA_CENTER_ITEM_SHOW_TYPE", itemShowType != null ? java.lang.Integer.valueOf((int) itemShowType.longValue()) : null);
        com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
        am.jt jtVar = sendAppMsgEvent.f54749g;
        jtVar.f7080a = wXMediaMessage;
        jtVar.f7083d = str;
        jtVar.f7084e = 2;
        jtVar.f7096q = a17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(bizShareInfo.getSrcUsername())) {
            jtVar.f7087h = null;
        } else {
            jtVar.f7085f = bizShareInfo.getSrcUsername();
            jtVar.f7086g = bizShareInfo.getDisplayUsername();
        }
        sendAppMsgEvent.e();
        if (!(!(str2 == null || str2.length() == 0))) {
            str2 = null;
        }
        if (str2 != null) {
            ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
            java.util.HashMap a18 = com.tencent.mm.ui.i1.a(str2);
            if (!com.tencent.mm.storage.z3.R4(str) || a18 == null) {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                mtVar.f7362a = str;
                mtVar.f7363b = str2;
                mtVar.f7364c = c01.e2.C(str);
                mtVar.f7365d = 0;
                sendMsgEvent.e();
                return;
            }
            if (w11.t1.a(str)) {
                w11.r1 b17 = w11.s1.b(str, null, 2, null);
                b17.e(str2);
                b17.h(c01.e2.C(str));
                b17.f442131f = 1;
                b17.f442133h = a18;
                w11.r1.d(b17, null, 1, null);
                return;
            }
            w11.r1 b18 = w11.s1.b(str, null, 2, null);
            b18.g(str);
            b18.e(str2);
            b18.h(c01.e2.C(str));
            b18.f442131f = 1;
            b18.f442133h = a18;
            b18.f442134i = 5;
            b18.a().a();
        }
    }

    public final void c(java.lang.String str, yz5.l lVar) {
        java.lang.String str2 = null;
        if (!(str != null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterShareMsgHelper", "downloadImage img url is null");
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String str3 = f466436c;
            if (str3 == null) {
                kotlin.jvm.internal.o.o("imageCacheDir");
                throw null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str3);
            kotlin.jvm.internal.o.d(str);
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            sb6.append(kk.k.g(bytes));
            str2 = sb6.toString();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BizFlutterShareMsgHelper", "downloadImage fullPath=%s", str2);
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str, new yw.p2(str2, lVar));
    }
}
