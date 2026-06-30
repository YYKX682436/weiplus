package d83;

/* loaded from: classes15.dex */
public final class t implements com.tencent.ilink.NetworkManager.ReceiveAppMessageEvent {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d83.u f227020a;

    public t(d83.u uVar) {
        this.f227020a = uVar;
    }

    @Override // com.tencent.ilink.NetworkManager.ReceiveAppMessageEvent
    public final void event(com.tencent.ilink.network.IlinkBypassMsgList ilinkBypassMsgList) {
        java.util.LinkedList<com.tencent.ilink.network.IlinkBypassMsgItem> msgitems;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkFeatureService", "onReceiveAppMessageEvent!");
        if (ilinkBypassMsgList != null && (msgitems = ilinkBypassMsgList.getMsgitems()) != null) {
            java.util.Iterator<T> it = msgitems.iterator();
            while (it.hasNext()) {
                e83.s sVar = (e83.s) e83.s.f250231i.parseFrom(((com.tencent.ilink.network.IlinkBypassMsgItem) it.next()).getContent().g());
                byte[] decode = android.util.Base64.decode(sVar.getContent(), 2);
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkFeatureService", "onReceiveAppMessageEvent cmd:" + sVar.g());
                boolean equals = sVar.g().equals("ILINK_SDK_LITEAPP_RESOURCE_UPDATE");
                d83.u uVar = this.f227020a;
                if (equals) {
                    e83.y yVar = (e83.y) e83.y.f250251i.parseFrom(decode);
                    java.util.ArrayList<e70.x> arrayList = new java.util.ArrayList();
                    java.util.List<e83.h0> list = yVar.f250254f;
                    if (list != null) {
                        for (e83.h0 h0Var : list) {
                            java.lang.String g17 = h0Var.g();
                            kotlin.jvm.internal.o.f(g17, "getResourceName(...)");
                            arrayList.add(new e70.x(g17, h0Var.f250146f));
                        }
                    }
                    java.util.Iterator it6 = uVar.f227037o.entrySet().iterator();
                    while (it6.hasNext()) {
                        e70.y yVar2 = (e70.y) ((java.util.Map.Entry) it6.next()).getValue();
                        java.lang.String i17 = yVar.i();
                        kotlin.jvm.internal.o.f(i17, "getProjectId(...)");
                        ((com.tencent.mm.plugin.lite.logic.c0) yVar2).getClass();
                        boolean equals2 = i17.equals(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
                        java.lang.String str = "onReceiveCheckResource projectId: %s, ilinkVersion: %d, resourceVersion: %d";
                        java.lang.String str2 = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
                        java.lang.String str3 = "MicroMsg.AppLite.LiteAppCheckerListener";
                        if (equals2) {
                            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo u17 = com.tencent.mm.plugin.lite.logic.g1.s().u(null);
                            int i18 = u17 != null ? u17.iLinkVersion : 0;
                            if (arrayList.isEmpty()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "onReceiveCheckResource resources.count = 0, projectId: ".concat(i17));
                                com.tencent.mm.plugin.lite.logic.g1.s().h(null);
                            } else {
                                for (e70.x xVar : arrayList) {
                                    if (xVar.f249866a.equals(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)) {
                                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
                                        int i19 = xVar.f249867b;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "onReceiveCheckResource projectId: %s, ilinkVersion: %d, resourceVersion: %d", i17, valueOf, java.lang.Integer.valueOf(i19));
                                        if (i18 < i19) {
                                            com.tencent.mm.plugin.lite.logic.g1.s().h(null);
                                        }
                                    }
                                }
                            }
                        } else {
                            com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(i17, null);
                            int i27 = y17 != null ? y17.iLinkVersion : 0;
                            if (arrayList.isEmpty()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "onReceiveCheckResource resources.count = 0, projectId: ".concat(i17));
                                com.tencent.mm.plugin.lite.logic.g1.s().l(i17, false, 3, 0L, null, null);
                            } else {
                                for (e70.x xVar2 : arrayList) {
                                    if (xVar2.f249866a.equals(str2)) {
                                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i27);
                                        int i28 = xVar2.f249867b;
                                        com.tencent.mars.xlog.Log.i(str3, str, i17, valueOf2, java.lang.Integer.valueOf(i28));
                                        if (i27 < i28) {
                                            com.tencent.mm.plugin.lite.logic.g1.s().l(i17, false, 3, 0L, null, null);
                                            i17 = i17;
                                            str3 = str3;
                                            str = str;
                                            str2 = str2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (sVar.g().equals("ILINK_SDK_RESOURCE_BUGFIX_CDN")) {
                    r45.mq6 mq6Var = new r45.mq6();
                    mq6Var.parseFrom(decode);
                    f83.b bVar = new f83.b();
                    bVar.field_resourceRet = 0;
                    bVar.field_projectId = mq6Var.f380750d;
                    bVar.field_resourceName = mq6Var.f380751e;
                    bVar.field_resourceVersion = mq6Var.f380753g;
                    bVar.field_resourceSize = mq6Var.f380754h;
                    bVar.field_url = mq6Var.f380756m;
                    bVar.field_md5 = mq6Var.f380755i;
                    bVar.field_createTime = java.lang.System.currentTimeMillis();
                    bVar.field_resourceStoreType = mq6Var.f380762s;
                    r45.qk0 qk0Var = mq6Var.f380764u;
                    if (qk0Var != null) {
                        bVar.field_encryptAlgo = qk0Var.f384069d;
                        bVar.field_encryptFileSize = qk0Var.f384070e;
                        java.lang.String str4 = qk0Var.f384071f;
                        if (str4 == null) {
                            str4 = "";
                        }
                        bVar.field_encryptMd5 = str4;
                        java.lang.String str5 = qk0Var.f384072g;
                        if (str5 == null) {
                            str5 = "";
                        }
                        bVar.field_encryptUrl = str5;
                        com.tencent.mm.protobuf.g gVar = qk0Var.f384073h;
                        bVar.field_encryptKey = gVar != null ? gVar.g() : null;
                        com.tencent.mm.protobuf.g gVar2 = qk0Var.f384074i;
                        bVar.field_encryptIv = gVar2 != null ? gVar2.g() : null;
                        com.tencent.mm.protobuf.g gVar3 = qk0Var.f384075m;
                        bVar.field_encryptTag = gVar3 != null ? gVar3.g() : null;
                        com.tencent.mm.protobuf.g gVar4 = qk0Var.f384076n;
                        bVar.field_encryptAad = gVar4 != null ? gVar4.g() : null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int size = mq6Var.f380761r.f382456d.size();
                    for (int i29 = 0; i29 < size; i29++) {
                        arrayList2.add(kz5.b1.e(new jz5.l(((r45.yq6) mq6Var.f380761r.f382456d.get(i29)).f391308d, ((r45.yq6) mq6Var.f380761r.f382456d.get(i29)).f391309e)));
                    }
                    bVar.v0(arrayList2);
                    bVar.field_baseVersion = mq6Var.f380752f;
                    bVar.field_diffAlgo = mq6Var.f380757n;
                    bVar.field_diffSize = mq6Var.f380758o;
                    java.lang.String str6 = mq6Var.f380759p;
                    if (str6 == null) {
                        str6 = "";
                    }
                    bVar.field_diffMd5 = str6;
                    java.lang.String str7 = mq6Var.f380760q;
                    if (str7 == null) {
                        str7 = "";
                    }
                    bVar.field_diffUrl = str7;
                    r45.qk0 qk0Var2 = mq6Var.f380763t;
                    if (qk0Var2 != null) {
                        bVar.field_diffEncryptAlgo = qk0Var2.f384069d;
                        bVar.field_diffEncryptFileSize = qk0Var2.f384070e;
                        java.lang.String str8 = qk0Var2.f384071f;
                        if (str8 == null) {
                            str8 = "";
                        }
                        bVar.field_diffEncryptMd5 = str8;
                        java.lang.String str9 = qk0Var2.f384072g;
                        bVar.field_diffEncryptUrl = str9 != null ? str9 : "";
                        com.tencent.mm.protobuf.g gVar5 = qk0Var2.f384073h;
                        bVar.field_diffEncryptKey = gVar5 != null ? gVar5.g() : null;
                        com.tencent.mm.protobuf.g gVar6 = qk0Var2.f384074i;
                        bVar.field_diffEncryptIv = gVar6 != null ? gVar6.g() : null;
                        com.tencent.mm.protobuf.g gVar7 = qk0Var2.f384075m;
                        bVar.field_diffEncryptTag = gVar7 != null ? gVar7.g() : null;
                        com.tencent.mm.protobuf.g gVar8 = qk0Var2.f384076n;
                        bVar.field_diffEncryptAad = gVar8 != null ? gVar8.g() : null;
                    }
                    java.util.Iterator it7 = uVar.f227037o.entrySet().iterator();
                    while (it7.hasNext()) {
                        ((e70.y) ((java.util.Map.Entry) it7.next()).getValue()).getClass();
                    }
                } else if (!sVar.g().equals("ILINK_SDK_RESOURCE_RULE_MATCH_CDN")) {
                    if (sVar.g().equals("ILINK_SDK_RESOURCE_CHECK_UPDATE_BACKEND")) {
                        r45.nq6 nq6Var = new r45.nq6();
                        nq6Var.parseFrom(decode);
                        java.util.Iterator it8 = uVar.f227037o.entrySet().iterator();
                        while (it8.hasNext()) {
                            e70.y yVar3 = (e70.y) ((java.util.Map.Entry) it8.next()).getValue();
                            java.lang.String project_id = nq6Var.f381608d;
                            kotlin.jvm.internal.o.f(project_id, "project_id");
                            java.util.LinkedList resource_name = nq6Var.f381609e;
                            kotlin.jvm.internal.o.f(resource_name, "resource_name");
                            yVar3.getClass();
                        }
                    } else if (sVar.g().equals("ILINK_SDK_RESOURCE_GET_SPECIFIED_VERSION")) {
                        r45.sq6 sq6Var = new r45.sq6();
                        sq6Var.parseFrom(decode);
                        java.util.Iterator it9 = uVar.f227037o.entrySet().iterator();
                        while (it9.hasNext()) {
                            e70.y yVar4 = (e70.y) ((java.util.Map.Entry) it9.next()).getValue();
                            java.lang.String project_id2 = sq6Var.f385927d;
                            kotlin.jvm.internal.o.f(project_id2, "project_id");
                            java.lang.String resource_name2 = sq6Var.f385928e;
                            kotlin.jvm.internal.o.f(resource_name2, "resource_name");
                            yVar4.getClass();
                        }
                    }
                }
            }
        }
    }
}
