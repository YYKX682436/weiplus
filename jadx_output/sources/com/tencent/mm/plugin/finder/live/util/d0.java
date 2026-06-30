package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.d0 f115473a = new com.tencent.mm.plugin.finder.live.util.d0();

    public final int a(dk2.zf zfVar) {
        jz5.l q17;
        int type = zfVar.getType();
        zfVar.p();
        java.lang.String str = null;
        dk2.fg fgVar = zfVar instanceof dk2.fg ? (dk2.fg) zfVar : null;
        if (fgVar != null && (q17 = fgVar.q()) != null) {
            str = (java.lang.String) q17.f302833d;
        }
        if (type == 1000066) {
            return 1;
        }
        if (type == 20035) {
            return 2;
        }
        return str != null ? 4 : 0;
    }

    public final void b(gk2.e eVar, int i17, java.lang.String str, java.util.HashMap extraKv) {
        java.lang.String str2;
        androidx.lifecycle.j0 j0Var;
        r45.qm1 qm1Var;
        kotlin.jvm.internal.o.g(extraKv, "extraKv");
        com.tencent.mars.xlog.Log.i("FinderLivePostMsgReportUtil", "reportPostFinderLiveBoxMsg type:" + i17 + ", content:" + str + ", extraKvSize:" + extraKv.size());
        extraKv.put("comment_type", java.lang.String.valueOf(i17 == 1000066 ? 1 : i17 == 20035 ? 2 : 0));
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (eVar == null || (j0Var = ((mm2.e0) eVar.a(mm2.e0.class)).f328970m) == null || (qm1Var = (r45.qm1) j0Var.getValue()) == null || (str2 = qm1Var.getString(1)) == null) {
            str2 = "";
        }
        r0Var.getClass();
        r0Var.cj(str, "", "", valueOf, true, str2, extraKv);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(gk2.e r14, dk2.zf r15, java.util.HashMap r16) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.d0.c(gk2.e, dk2.zf, java.util.HashMap):void");
    }

    public final void d(gk2.e eVar, java.lang.String content, dk2.zf zfVar, java.util.HashMap extraKv) {
        jz5.l q17;
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(extraKv, "extraKv");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportPostFinderLiveMsg, content: ");
        sb6.append(content);
        sb6.append(", repliedMsgSeq:");
        sb6.append(zfVar != null ? java.lang.Long.valueOf(zfVar.m()) : null);
        sb6.append(", extraKv:");
        sb6.append(extraKv);
        com.tencent.mars.xlog.Log.i("FinderLivePostMsgReportUtil", sb6.toString());
        extraKv.put("content", content);
        boolean z17 = false;
        if (zfVar != null) {
            extraKv.put("reply_comment_type", java.lang.String.valueOf(a(zfVar)));
            dk2.fg fgVar = zfVar instanceof dk2.fg ? (dk2.fg) zfVar : null;
            if (fgVar != null && (q17 = fgVar.q()) != null) {
                extraKv.put("reply_emoji_md5", q17.f302833d);
            }
        } else {
            extraKv.put("reply_comment_type", "0");
        }
        if (zl2.r4.f473950a.w1()) {
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            j0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : extraKv.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            zy2.zb.y6(j0Var, ml2.z4.f328357i2, jSONObject.toString(), null, 4, null);
            return;
        }
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T) {
            z17 = true;
        }
        if (z17) {
            extraKv.put("identity", "1");
        } else {
            extraKv.put("identity", "0");
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r0Var.getClass();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.util.Map.Entry entry2 : extraKv.entrySet()) {
            jSONObject2.put((java.lang.String) entry2.getKey(), entry2.getValue());
        }
        ml2.r0.hj(r0Var, ml2.b4.f327274x, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
        r0Var.f327864J++;
    }
}
