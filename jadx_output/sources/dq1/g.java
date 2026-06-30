package dq1;

/* loaded from: classes8.dex */
public final class g extends dq1.a {
    public g() {
        dq1.u[] uVarArr = dq1.u.f242358d;
    }

    @Override // dq1.k
    public boolean a(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI ui6, dq1.b context, com.tencent.mm.protobuf.g actionBuffer, com.tencent.mm.protobuf.g gVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f242353a;
        if (!pVar.a(dq1.c.f242346d, context, pVar.b())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeFinderOpenLive", "context self check fail!");
            return false;
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_finder_live_enable_external_schema_url_open_live, true)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeFinderOpenLive", "xlab config disable opening live from URL scheme");
            return false;
        }
        r45.k00 k00Var = new r45.k00();
        try {
            k00Var.parseFrom(actionBuffer.g());
            if (com.tencent.mm.sdk.platformtools.t8.K0(k00Var.getString(0))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeFinderOpenLive", "exportId is empty!");
                return false;
            }
            r45.c90 c90Var = (r45.c90) k00Var.getCustom(4);
            int integer = c90Var != null ? c90Var.getInteger(0) : 0;
            r45.c90 c90Var2 = (r45.c90) k00Var.getCustom(4);
            int integer2 = c90Var2 != null ? c90Var2.getInteger(1) : 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exportId:");
            sb6.append(k00Var.getString(0));
            sb6.append(", entranceScene:");
            sb6.append(integer);
            sb6.append(", cardType:");
            sb6.append(integer2);
            sb6.append(", joinliveBuffer size:");
            com.tencent.mm.protobuf.g byteString = k00Var.getByteString(1);
            sb6.append(byteString != null ? byteString.f192156a.length : 0);
            sb6.append(", openLiveH5Buffer size:");
            com.tencent.mm.protobuf.g byteString2 = k00Var.getByteString(2);
            sb6.append(byteString2 != null ? byteString2.f192156a.length : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSchemeFinderOpenLive", sb6.toString());
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("key_comment_scene_for_external_live_h5", "391");
            linkedHashMap.put("key_enter_scene", java.lang.Integer.valueOf(integer));
            linkedHashMap.put("key_card_type", java.lang.Integer.valueOf(integer2));
            com.tencent.mm.protobuf.g byteString3 = k00Var.getByteString(1);
            if (byteString3 != null) {
                linkedHashMap.put("key_joinlive_buffer", byteString3.g());
            }
            com.tencent.mm.protobuf.g byteString4 = k00Var.getByteString(2);
            if (byteString4 != null) {
                linkedHashMap.put("key_open_live_h5_buffer", byteString4.g());
            }
            ((c61.l7) b6Var).getClass();
            vd2.t3.f435921a.m(ui6.getContext(), null, 0L, k00Var.getString(0), "", linkedHashMap, new dq1.e(this), new dq1.f(this));
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeFinderOpenLive", "parse CheckExternalFinderOpenLiveActionBuffer error: e = " + e17.getMessage());
            return false;
        }
    }
}
