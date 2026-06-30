package li3;

/* loaded from: classes9.dex */
public class f extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.l0 f318778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ li3.g f318779e;

    public f(li3.g gVar, xg3.l0 l0Var) {
        this.f318779e = gVar;
        this.f318778d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.util.Map d17;
        xg3.l0 l0Var = this.f318778d;
        if ("gh_f0a92aa7146c".equals(l0Var.f454410a) && l0Var.f454412c.size() != 0) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_revert_payplugin_topmsg, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "revert payplugin topmsg abtest is open, return");
                return;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = l0Var.f454412c.iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                if (f9Var.A0() != 1 && f9Var.k2() && f9Var.a3() && (d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null)) != null && com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.is_top_msg"), 0) == 1) {
                    java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.top_msg_content");
                    str = str2 != null ? str2 : "";
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        r45.i67 i67Var = new r45.i67();
                        i67Var.f376769d = java.lang.Long.toString(f9Var.I0());
                        i67Var.f376770e = str;
                        i67Var.f376771f = c01.id.a();
                        i67Var.f376772g = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.top_msg_expiration_period_sec"), 0L) * 1000;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "get pay plugin topmsg, svrid is %s, content is %s", i67Var.f376769d, i67Var.f376770e);
                        linkedList.add(i67Var);
                    }
                }
            }
            if (linkedList.size() > 0) {
                this.f318779e.getClass();
                gm0.j1.i();
                java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, "");
                r45.j67 j67Var = new r45.j67();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        linkedList2.addFirst((r45.i67) it6.next());
                        if (linkedList2.size() > 5) {
                            linkedList2.removeLast();
                        }
                    }
                    j67Var.f377615d = "gh_f0a92aa7146c";
                    j67Var.f377616e = linkedList2;
                } else {
                    try {
                        j67Var.parseFrom(str3.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WxPaySevice", "parse cacheString exp, " + e17.getLocalizedMessage());
                    }
                    java.util.Iterator it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        j67Var.f377616e.addFirst((r45.i67) it7.next());
                        if (j67Var.f377616e.size() > 5) {
                            j67Var.f377616e.removeLast();
                        }
                    }
                }
                try {
                    str = new java.lang.String(j67Var.toByteArray(), com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxPaySevice", "save dataString exp, " + e18.getLocalizedMessage());
                }
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, str);
            }
        }
    }
}
