package rx;

@j95.b
/* loaded from: classes11.dex */
public final class f extends i95.w implements sx.b0 {
    public kotlinx.coroutines.flow.n2 Ai(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        if (aj6 != null) {
            return aj6.U6(mediaId);
        }
        return null;
    }

    public kotlinx.coroutines.flow.n2 Bi(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        if (aj6 == null) {
            return null;
        }
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(3, 0, null, 6, null);
        aj6.c7(new com.tencent.mm.modelcdntran.j(aj6, mediaId, b17, null));
        return kotlinx.coroutines.flow.l.a(b17);
    }

    public w65.m Di(kq.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        return new com.tencent.mm.modelcdntran.c(params);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ni(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rx.c
            if (r0 == 0) goto L13
            r0 = r8
            rx.c r0 = (rx.c) r0
            int r1 = r0.f400657f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400657f = r1
            goto L18
        L13:
            rx.c r0 = new rx.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f400655d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f400657f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            kotlin.ResultKt.throwOnFailure(r8)
            goto L54
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            kotlin.ResultKt.throwOnFailure(r8)
            com.tencent.mm.modelcdntran.z r8 = com.tencent.mm.modelcdntran.s1.aj()
            if (r8 == 0) goto L5d
            r0.f400657f = r4
            oz5.n r2 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r2.<init>(r0)
            com.tencent.mm.modelcdntran.n r0 = new com.tencent.mm.modelcdntran.n
            r5 = 0
            r0.<init>(r2, r8, r7, r5)
            r8.c7(r0)
            java.lang.Object r8 = r2.a()
            if (r8 != r1) goto L54
            return r1
        L54:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L5d
            r3 = r4
        L5d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.f.Ni(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public dn.m Ri(dn.m taskInfo, java.lang.ref.WeakReference listenerRef) {
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        kotlin.jvm.internal.o.g(listenerRef, "listenerRef");
        com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "startCdnDownload taskInfo field_mediaId:" + taskInfo.field_mediaId);
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        kotlinx.coroutines.flow.n2 d76 = aj6 != null ? aj6.d7(taskInfo) : null;
        if (d76 == null) {
            return null;
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope == null) {
            return taskInfo;
        }
        v65.i.b(lifecycleScope, null, new com.tencent.mm.modelcdntran.d0(d76, listenerRef, null), 1, null);
        return taskInfo;
    }

    public dn.m Ui(dn.m taskInfo, java.lang.ref.WeakReference listenerRef) {
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        kotlin.jvm.internal.o.g(listenerRef, "listenerRef");
        com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "startCdnUpload taskInfo field_mediaId:" + taskInfo.field_mediaId);
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        kotlinx.coroutines.flow.n2 e76 = aj6 != null ? aj6.e7(taskInfo) : null;
        if (e76 == null) {
            return null;
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope == null) {
            return taskInfo;
        }
        v65.i.b(lifecycleScope, null, new com.tencent.mm.modelcdntran.f0(e76, listenerRef, null), 1, null);
        return taskInfo;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
            mm.d0.f328475a.b(new rx.e(this));
        }
    }

    public java.lang.String wi(java.lang.String mediaId, java.lang.ref.WeakReference listenerRef) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(listenerRef, "listenerRef");
        return com.tencent.mm.modelcdntran.p0.f71115a.a(mediaId, listenerRef);
    }
}
