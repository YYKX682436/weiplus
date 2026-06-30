package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes2.dex */
public final class z9 {
    public z9(kotlin.jvm.internal.i iVar) {
    }

    public final android.content.Intent a(android.content.Intent intent, java.lang.String str, r45.md5 md5Var) {
        kotlin.jvm.internal.o.g(intent, "intent");
        intent.putExtra("FINDER_PRODUCT_LAST_GLOBAL_MSG_ID", str);
        if (md5Var != null) {
            intent.putExtra("FINDER_PRODUCT_TRACE_EXTRA_INFO", md5Var.toByteArray());
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderProductTraceUIC", "fillTraceInfoToIntent lastGMsgId:" + str + ", traceExtraInfo:" + d(md5Var));
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:6:0x0019, B:9:0x0020, B:11:0x0025, B:16:0x0031, B:17:0x0036), top: B:5:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo b(java.lang.String r9, com.tencent.mm.protocal.protobuf.FinderJumpInfo r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "Finder.FinderProductTraceUIC"
            java.lang.String r2 = "fillTraceInfoToLiteApp lastGMsgID:"
            java.lang.String r3 = "jumpInfo"
            kotlin.jvm.internal.o.g(r10, r3)
            r45.k74 r3 = r10.getLite_app_info()
            r4 = 2
            if (r3 == 0) goto L17
            java.lang.String r3 = r3.getString(r4)
            goto L18
        L17:
            r3 = 0
        L18:
            r5 = 0
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L1f
            r7 = r0
            goto L20
        L1f:
            r7 = r3
        L20:
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L52
            if (r9 == 0) goto L2e
            int r7 = r9.length()     // Catch: java.lang.Throwable -> L52
            if (r7 != 0) goto L2c
            goto L2e
        L2c:
            r7 = r5
            goto L2f
        L2e:
            r7 = 1
        L2f:
            if (r7 != 0) goto L36
            java.lang.String r7 = "entrance_msg"
            r6.put(r7, r9)     // Catch: java.lang.Throwable -> L52
        L36:
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L52
            r6.append(r9)     // Catch: java.lang.Throwable -> L52
            java.lang.String r9 = ", finalQuery:"
            r6.append(r9)     // Catch: java.lang.Throwable -> L52
            r6.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L52
            com.tencent.mars.xlog.Log.i(r1, r9)     // Catch: java.lang.Throwable -> L52
            goto L58
        L52:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r9, r0, r2)
        L58:
            r45.k74 r9 = r10.getLite_app_info()
            if (r9 != 0) goto L5f
            goto L62
        L5f:
            r9.set(r4, r3)
        L62:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.z9.b(java.lang.String, com.tencent.mm.protocal.protobuf.FinderJumpInfo):com.tencent.mm.protocal.protobuf.FinderJumpInfo");
    }

    public final l81.b1 c(java.lang.String str, l81.b1 bundle) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        l81.p0 p0Var = bundle.f317028i;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        if (ahVar == null) {
            ahVar = new dk2.ah();
        }
        ahVar.f233225u = str == null ? "" : str;
        com.tencent.mars.xlog.Log.i("Finder.FinderProductTraceUIC", "fillTraceInfoToWeApp lastGMsgId:" + str + ", ");
        bundle.f317028i = ahVar;
        return bundle;
    }

    public final java.lang.String d(r45.md5 md5Var) {
        if (md5Var == null) {
            return "";
        }
        return "feedId:" + pm0.v.u(md5Var.getLong(0)) + ", liveId:" + pm0.v.u(md5Var.getLong(1));
    }
}
