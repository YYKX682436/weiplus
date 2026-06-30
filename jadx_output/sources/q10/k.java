package q10;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final q10.k f359520a = new q10.k();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f359521b = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    /* renamed from: c, reason: collision with root package name */
    public static volatile kotlinx.coroutines.r2 f359522c;

    public static final void a(q10.k kVar, java.lang.String str) {
        kVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new q10.e(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlinx.coroutines.r] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.tencent.mars.cdn.CronetLogic$CronetRequestParams] */
    public static final java.lang.Object b(q10.k kVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar;
        q10.k kVar2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = str;
        kVar.getClass();
        q10.k kVar3 = f359520a;
        java.lang.String str6 = "\r\n--";
        ?? rVar2 = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar2.k();
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                long k17 = com.tencent.mm.vfs.w6.k(str);
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MBProfileUtil", "uploadFile start: file=" + r6Var.getName() + ", size=" + k17 + " bytes, url=" + str2);
                    java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                    try {
                        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("--");
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\r\n--");
                        sb6.append(valueOf);
                        sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
                        sb6.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + r6Var.getName() + '\"');
                        sb6.append("\r\nContent-Type: application/octet-stream\r\n\r\n");
                        sb7.append(valueOf);
                        sb7.append("--\r\n");
                        java.lang.String sb8 = sb6.toString();
                        kotlin.jvm.internal.o.f(sb8, "toString(...)");
                        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
                        kotlin.jvm.internal.o.f(forName, "forName(...)");
                        byte[] bytes = sb8.getBytes(forName);
                        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                        java.lang.String sb9 = sb7.toString();
                        kotlin.jvm.internal.o.f(sb9, "toString(...)");
                        java.nio.charset.Charset forName2 = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
                        kotlin.jvm.internal.o.f(forName2, "forName(...)");
                        byte[] bytes2 = sb9.getBytes(forName2);
                        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                        long length = bytes.length + k17 + bytes2.length;
                        com.tencent.mars.xlog.Log.i("MicroMsg.MBProfileUtil", "uploadFile contentLength=" + length);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        java.lang.String a17 = ik1.l0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, "", (ik1.k0) nd.f.a(ik1.k0.class));
                        kotlin.jvm.internal.o.f(a17, "appendUserAgent(...)");
                        hashMap.put("User-Agent", a17);
                        hashMap.put("Accept-Encoding", "gzip, deflate");
                        hashMap.put("Content-Type", "multipart/form-data; boundary=" + valueOf);
                        hashMap.put("Content-Length", java.lang.String.valueOf(length));
                        ?? cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
                        cronetRequestParams.url = str2;
                        cronetRequestParams.method = "POST";
                        cronetRequestParams.followRedirect = true;
                        cronetRequestParams.useQuic = false;
                        cronetRequestParams.useHttp2 = false;
                        cronetRequestParams.useMemoryCache = false;
                        cronetRequestParams.taskType = 7;
                        cronetRequestParams.makeRequestHeader(hashMap);
                        com.tencent.mars.cdn.CronetLogic.UploadParams uploadParams = new com.tencent.mars.cdn.CronetLogic.UploadParams();
                        str6 = str;
                        try {
                            uploadParams.filePath = str6;
                            uploadParams.vfsPath = true;
                            uploadParams.uploadOffset = 0L;
                            uploadParams.uploadRange = length;
                            uploadParams.formData = bytes;
                            uploadParams.endData = bytes2;
                            cronetRequestParams.uploadParams = uploadParams;
                            rVar = rVar2;
                            str4 = str;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            kVar2 = kVar3;
                            str3 = "\nURL: ";
                            rVar = rVar2;
                            com.tencent.mars.xlog.Log.e("MicroMsg.MBProfileUtil", "uploadFile init error: " + e.getMessage());
                            a(kVar2, "Upload Init Error:\nFile: " + str6 + str3 + str2 + "\nError: " + e.getClass().getSimpleName() + " - " + e.getMessage());
                            rVar.resumeWith(kotlin.Result.m521constructorimpl(""));
                            java.lang.Object j17 = rVar.j();
                            pz5.a aVar = pz5.a.f359186d;
                            return j17;
                        }
                        try {
                            q10.j jVar = new q10.j(currentTimeMillis, c0Var, str4, str2, rVar);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MBProfileUtil", "uploadFile starting Cronet upload...");
                            com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetUploadTask = com.tencent.mars.cdn.CronetLogic.startCronetUploadTask(cronetRequestParams, jVar);
                            if (startCronetUploadTask != null && startCronetUploadTask.createRet == 0) {
                                h0Var.f310123d = startCronetUploadTask.taskId;
                                com.tencent.mars.xlog.Log.i("MicroMsg.MBProfileUtil", "uploadFile Cronet task started: taskId=" + ((java.lang.String) h0Var.f310123d));
                                rVar.m(new q10.i(h0Var, c0Var));
                                rVar2 = str4;
                                str5 = cronetRequestParams;
                            }
                            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Upload Error:\nFile: ");
                            sb10.append(str6);
                            str3 = "\nURL: ";
                            try {
                                sb10.append(str3);
                                sb10.append(str2);
                                sb10.append("\nError: Failed to create Cronet task, createRet=");
                                sb10.append(startCronetUploadTask != null ? new java.lang.Integer(startCronetUploadTask.createRet) : null);
                                kVar2 = kVar3;
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                kVar2 = kVar3;
                            }
                            try {
                                a(kVar2, sb10.toString());
                                java.lang.String str7 = "uploadFile failed: createRet=";
                                java.lang.StringBuilder sb11 = new java.lang.StringBuilder(str7);
                                sb11.append(startCronetUploadTask != null ? new java.lang.Integer(startCronetUploadTask.createRet) : null);
                                com.tencent.mars.xlog.Log.e("MicroMsg.MBProfileUtil", sb11.toString());
                                rVar.resumeWith(kotlin.Result.m521constructorimpl(""));
                                rVar2 = str7;
                                str5 = cronetRequestParams;
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                com.tencent.mars.xlog.Log.e("MicroMsg.MBProfileUtil", "uploadFile init error: " + e.getMessage());
                                a(kVar2, "Upload Init Error:\nFile: " + str6 + str3 + str2 + "\nError: " + e.getClass().getSimpleName() + " - " + e.getMessage());
                                rVar.resumeWith(kotlin.Result.m521constructorimpl(""));
                                java.lang.Object j172 = rVar.j();
                                pz5.a aVar2 = pz5.a.f359186d;
                                return j172;
                            }
                        } catch (java.lang.Exception e27) {
                            e = e27;
                            kVar2 = kVar3;
                            str3 = "\nURL: ";
                            com.tencent.mars.xlog.Log.e("MicroMsg.MBProfileUtil", "uploadFile init error: " + e.getMessage());
                            a(kVar2, "Upload Init Error:\nFile: " + str6 + str3 + str2 + "\nError: " + e.getClass().getSimpleName() + " - " + e.getMessage());
                            rVar.resumeWith(kotlin.Result.m521constructorimpl(""));
                            java.lang.Object j1722 = rVar.j();
                            pz5.a aVar22 = pz5.a.f359186d;
                            return j1722;
                        }
                    } catch (java.lang.Exception e28) {
                        e = e28;
                        str6 = str;
                    }
                } catch (java.lang.Exception e29) {
                    e = e29;
                    str6 = str5;
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MBProfileUtil", "uploadFile failed: file not exist, path=".concat(str5));
                rVar2.resumeWith(kotlin.Result.m521constructorimpl(""));
                rVar = rVar2;
                rVar2 = rVar2;
                str5 = str5;
            }
        } catch (java.lang.Exception e37) {
            e = e37;
            rVar = rVar2;
            str6 = str5;
        }
        java.lang.Object j17222 = rVar.j();
        pz5.a aVar222 = pz5.a.f359186d;
        return j17222;
    }
}
