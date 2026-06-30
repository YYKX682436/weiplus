package oh1;

/* loaded from: classes7.dex */
public enum h1 implements vg3.q4 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f345225d = new java.util.HashMap();

    h1() {
    }

    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (str == null || !str.equals("wxaapp_msgchannel")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAppMsgChannelHandler", "subType is err, return");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppMsgChannelHandler", "consumeNewXml subType:%s", str);
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaAppMsgChannelHandler", "msg content is null");
            return null;
        }
        if (map.get(".sysmsg.wxaapp_msgchannel") == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.msg_id");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.sender_openid");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.receiver_openid");
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.appid");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.msg_type"), 0);
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.msg_content");
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.wxaapp_msgchannel.send_time"), 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppMsgChannelHandler", "handle addMsg.MsgId:%s", "" + p0Var.f70726a.f377568r);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppMsgChannelHandler", "handle wxaapp_msgchannel xml:%s", g17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppMsgChannelHandler", "msgId:%s, senderOpenId:%s, receiverOpenId:%s, appId:%s, msgType:%d, msgContent:%s, sendTime:%d", str2, str3, str4, str5, java.lang.Integer.valueOf(P), str6, java.lang.Long.valueOf(V));
        com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel wxaAppMsgChannel = new com.tencent.mm.plugin.appbrand.message.WxaAppMsgChannel();
        wxaAppMsgChannel.f86008d = str2;
        wxaAppMsgChannel.f86009e = str3;
        wxaAppMsgChannel.f86010f = str4;
        wxaAppMsgChannel.f86011g = str5;
        wxaAppMsgChannel.f86012h = P;
        wxaAppMsgChannel.f86013i = str6;
        wxaAppMsgChannel.f86014m = V;
        if (com.tencent.mm.plugin.appbrand.task.u0.C().z(str5)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppMsgChannelHandler", "send msg to runtime client");
            synchronized (this) {
                if (this.f345225d.containsKey(str5)) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) this.f345225d.remove(str5);
                    if (arrayList == null || arrayList.size() <= 0) {
                        com.tencent.mm.plugin.appbrand.ipc.m0.b(str5, wxaAppMsgChannel);
                    } else {
                        arrayList.add(wxaAppMsgChannel);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppMsgChannelHandler", "send list size:%d", java.lang.Integer.valueOf(arrayList.size()));
                        com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().N(new com.tencent.mm.plugin.appbrand.jsapi.msgchannel.a(str5, arrayList));
                    }
                } else {
                    com.tencent.mm.plugin.appbrand.ipc.m0.b(str5, wxaAppMsgChannel);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppMsgChannelHandler", "add to cache");
            synchronized (this) {
                if (this.f345225d.containsKey(str5)) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f345225d.get(str5);
                    arrayList2.add(wxaAppMsgChannel);
                    if (arrayList2.size() > 500) {
                        arrayList2.remove(0);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppMsgChannelHandler", "cache size :%d", java.lang.Integer.valueOf(arrayList2.size()));
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(wxaAppMsgChannel);
                    this.f345225d.put(str5, arrayList3);
                }
            }
        }
        return null;
    }
}
