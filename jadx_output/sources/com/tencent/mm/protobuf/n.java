package com.tencent.mm.protobuf;

/* loaded from: classes11.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static int f192172a = 1048576;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.protobuf.l f192173b;

    public static final void a(java.lang.String message, java.lang.Throwable throwable) {
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(throwable, "throwable");
        if (f192173b != null) {
            java.lang.String message2 = message + ": \n" + com.tencent.mm.protobuf.p.a(throwable);
            kotlin.jvm.internal.o.g(message2, "message");
            com.tencent.mars.xlog.Log.e("MicroMsg.SerializeTelemetryHelper.PB", message2);
        }
    }

    public static final void b(java.util.Map params, byte[] bArr) {
        kotlin.jvm.internal.o.g(params, "params");
        if (f192173b != null) {
            java.lang.String valueOf = java.lang.String.valueOf(ri.l0.a(params));
            com.tencent.mars.xlog.Log.i("MicroMsg.SerializeTelemetryHelper.PB", valueOf);
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            errorMsgInfoStruct.f56113e = 2662L;
            errorMsgInfoStruct.p("PB.22");
            errorMsgInfoStruct.f56115g = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
            errorMsgInfoStruct.s((java.lang.String) params.get("compute_size"));
            errorMsgInfoStruct.t((java.lang.String) params.get("initial_size"));
            errorMsgInfoStruct.r(valueOf);
            errorMsgInfoStruct.k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:23:0x0002, B:7:0x001d, B:9:0x002e, B:10:0x0031, B:3:0x000f, B:5:0x0018), top: B:22:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(byte[] r4, java.lang.Integer r5) {
        /*
            if (r5 == 0) goto Ld
            int r0 = r5.intValue()     // Catch: java.lang.Throwable -> Lb
            int r1 = com.tencent.mm.protobuf.n.f192172a     // Catch: java.lang.Throwable -> Lb
            if (r0 >= r1) goto L1d
            goto Ld
        Lb:
            r4 = move-exception
            goto L64
        Ld:
            if (r4 == 0) goto L15
            int r0 = r4.length     // Catch: java.lang.Throwable -> Lb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lb
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L69
            int r0 = r4.length     // Catch: java.lang.Throwable -> Lb
            int r1 = com.tencent.mm.protobuf.n.f192172a     // Catch: java.lang.Throwable -> Lb
            if (r0 < r1) goto L69
        L1d:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "version"
            java.lang.String r2 = "PB.20251013"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "initial_size"
            if (r4 == 0) goto L30
            int r2 = r4.length     // Catch: java.lang.Throwable -> Lb
            goto L31
        L30:
            r2 = -1
        L31:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r3.<init>()     // Catch: java.lang.Throwable -> Lb
            r3.append(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Lb
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "compute_size"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r2.<init>()     // Catch: java.lang.Throwable -> Lb
            r2.append(r5)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> Lb
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r5 = "stack"
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch: java.lang.Throwable -> Lb
            r1.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = com.tencent.mm.protobuf.p.a(r1)     // Catch: java.lang.Throwable -> Lb
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> Lb
            b(r0, r4)     // Catch: java.lang.Throwable -> Lb
            goto L69
        L64:
            java.lang.String r5 = "report err"
            a(r5, r4)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.protobuf.n.c(byte[], java.lang.Integer):void");
    }
}
