package com.tencent.mm.wexnet;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/wexnet/WeXNet;", "", "()V", "Companion", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WeXNet {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.mm.wexnet.WeXNet.Companion INSTANCE = new com.tencent.mm.wexnet.WeXNet.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/wexnet/WeXNet$Companion;", "", "", "cachePath", "Ljz5/f0;", "activateCacheFiles", "com/tencent/mm/wexnet/w", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public Companion(kotlin.jvm.internal.i iVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:131:0x00b8 A[Catch: all -> 0x030c, TryCatch #0 {, blocks: (B:4:0x0009, B:16:0x0013, B:18:0x0029, B:20:0x0037, B:22:0x0043, B:23:0x0056, B:28:0x0076, B:29:0x007d, B:31:0x0089, B:33:0x0095, B:34:0x00ac, B:38:0x00c2, B:39:0x00c9, B:41:0x0115, B:42:0x0122, B:44:0x013e, B:46:0x014a, B:47:0x0159, B:52:0x0179, B:53:0x017c, B:55:0x0182, B:56:0x0185, B:58:0x0194, B:64:0x01a1, B:67:0x01ba, B:69:0x01c1, B:71:0x01c9, B:73:0x01cf, B:75:0x01d3, B:77:0x01db, B:80:0x01f5, B:82:0x0204, B:85:0x020f, B:91:0x021c, B:94:0x0232, B:97:0x024e, B:101:0x026f, B:104:0x028b, B:117:0x02bd, B:120:0x02e1, B:125:0x0166, B:127:0x0170, B:130:0x011c, B:131:0x00b8, B:132:0x0063, B:134:0x006d, B:137:0x010c, B:93:0x022b), top: B:3:0x0009, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: all -> 0x030c, TryCatch #0 {, blocks: (B:4:0x0009, B:16:0x0013, B:18:0x0029, B:20:0x0037, B:22:0x0043, B:23:0x0056, B:28:0x0076, B:29:0x007d, B:31:0x0089, B:33:0x0095, B:34:0x00ac, B:38:0x00c2, B:39:0x00c9, B:41:0x0115, B:42:0x0122, B:44:0x013e, B:46:0x014a, B:47:0x0159, B:52:0x0179, B:53:0x017c, B:55:0x0182, B:56:0x0185, B:58:0x0194, B:64:0x01a1, B:67:0x01ba, B:69:0x01c1, B:71:0x01c9, B:73:0x01cf, B:75:0x01d3, B:77:0x01db, B:80:0x01f5, B:82:0x0204, B:85:0x020f, B:91:0x021c, B:94:0x0232, B:97:0x024e, B:101:0x026f, B:104:0x028b, B:117:0x02bd, B:120:0x02e1, B:125:0x0166, B:127:0x0170, B:130:0x011c, B:131:0x00b8, B:132:0x0063, B:134:0x006d, B:137:0x010c, B:93:0x022b), top: B:3:0x0009, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[Catch: all -> 0x030c, TryCatch #0 {, blocks: (B:4:0x0009, B:16:0x0013, B:18:0x0029, B:20:0x0037, B:22:0x0043, B:23:0x0056, B:28:0x0076, B:29:0x007d, B:31:0x0089, B:33:0x0095, B:34:0x00ac, B:38:0x00c2, B:39:0x00c9, B:41:0x0115, B:42:0x0122, B:44:0x013e, B:46:0x014a, B:47:0x0159, B:52:0x0179, B:53:0x017c, B:55:0x0182, B:56:0x0185, B:58:0x0194, B:64:0x01a1, B:67:0x01ba, B:69:0x01c1, B:71:0x01c9, B:73:0x01cf, B:75:0x01d3, B:77:0x01db, B:80:0x01f5, B:82:0x0204, B:85:0x020f, B:91:0x021c, B:94:0x0232, B:97:0x024e, B:101:0x026f, B:104:0x028b, B:117:0x02bd, B:120:0x02e1, B:125:0x0166, B:127:0x0170, B:130:0x011c, B:131:0x00b8, B:132:0x0063, B:134:0x006d, B:137:0x010c, B:93:0x022b), top: B:3:0x0009, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c2 A[Catch: all -> 0x030c, TryCatch #0 {, blocks: (B:4:0x0009, B:16:0x0013, B:18:0x0029, B:20:0x0037, B:22:0x0043, B:23:0x0056, B:28:0x0076, B:29:0x007d, B:31:0x0089, B:33:0x0095, B:34:0x00ac, B:38:0x00c2, B:39:0x00c9, B:41:0x0115, B:42:0x0122, B:44:0x013e, B:46:0x014a, B:47:0x0159, B:52:0x0179, B:53:0x017c, B:55:0x0182, B:56:0x0185, B:58:0x0194, B:64:0x01a1, B:67:0x01ba, B:69:0x01c1, B:71:0x01c9, B:73:0x01cf, B:75:0x01d3, B:77:0x01db, B:80:0x01f5, B:82:0x0204, B:85:0x020f, B:91:0x021c, B:94:0x0232, B:97:0x024e, B:101:0x026f, B:104:0x028b, B:117:0x02bd, B:120:0x02e1, B:125:0x0166, B:127:0x0170, B:130:0x011c, B:131:0x00b8, B:132:0x0063, B:134:0x006d, B:137:0x010c, B:93:0x022b), top: B:3:0x0009, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0179 A[Catch: all -> 0x030c, TryCatch #0 {, blocks: (B:4:0x0009, B:16:0x0013, B:18:0x0029, B:20:0x0037, B:22:0x0043, B:23:0x0056, B:28:0x0076, B:29:0x007d, B:31:0x0089, B:33:0x0095, B:34:0x00ac, B:38:0x00c2, B:39:0x00c9, B:41:0x0115, B:42:0x0122, B:44:0x013e, B:46:0x014a, B:47:0x0159, B:52:0x0179, B:53:0x017c, B:55:0x0182, B:56:0x0185, B:58:0x0194, B:64:0x01a1, B:67:0x01ba, B:69:0x01c1, B:71:0x01c9, B:73:0x01cf, B:75:0x01d3, B:77:0x01db, B:80:0x01f5, B:82:0x0204, B:85:0x020f, B:91:0x021c, B:94:0x0232, B:97:0x024e, B:101:0x026f, B:104:0x028b, B:117:0x02bd, B:120:0x02e1, B:125:0x0166, B:127:0x0170, B:130:0x011c, B:131:0x00b8, B:132:0x0063, B:134:0x006d, B:137:0x010c, B:93:0x022b), top: B:3:0x0009, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0182 A[Catch: all -> 0x030c, TryCatch #0 {, blocks: (B:4:0x0009, B:16:0x0013, B:18:0x0029, B:20:0x0037, B:22:0x0043, B:23:0x0056, B:28:0x0076, B:29:0x007d, B:31:0x0089, B:33:0x0095, B:34:0x00ac, B:38:0x00c2, B:39:0x00c9, B:41:0x0115, B:42:0x0122, B:44:0x013e, B:46:0x014a, B:47:0x0159, B:52:0x0179, B:53:0x017c, B:55:0x0182, B:56:0x0185, B:58:0x0194, B:64:0x01a1, B:67:0x01ba, B:69:0x01c1, B:71:0x01c9, B:73:0x01cf, B:75:0x01d3, B:77:0x01db, B:80:0x01f5, B:82:0x0204, B:85:0x020f, B:91:0x021c, B:94:0x0232, B:97:0x024e, B:101:0x026f, B:104:0x028b, B:117:0x02bd, B:120:0x02e1, B:125:0x0166, B:127:0x0170, B:130:0x011c, B:131:0x00b8, B:132:0x0063, B:134:0x006d, B:137:0x010c, B:93:0x022b), top: B:3:0x0009, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0194 A[Catch: all -> 0x030c, TryCatch #0 {, blocks: (B:4:0x0009, B:16:0x0013, B:18:0x0029, B:20:0x0037, B:22:0x0043, B:23:0x0056, B:28:0x0076, B:29:0x007d, B:31:0x0089, B:33:0x0095, B:34:0x00ac, B:38:0x00c2, B:39:0x00c9, B:41:0x0115, B:42:0x0122, B:44:0x013e, B:46:0x014a, B:47:0x0159, B:52:0x0179, B:53:0x017c, B:55:0x0182, B:56:0x0185, B:58:0x0194, B:64:0x01a1, B:67:0x01ba, B:69:0x01c1, B:71:0x01c9, B:73:0x01cf, B:75:0x01d3, B:77:0x01db, B:80:0x01f5, B:82:0x0204, B:85:0x020f, B:91:0x021c, B:94:0x0232, B:97:0x024e, B:101:0x026f, B:104:0x028b, B:117:0x02bd, B:120:0x02e1, B:125:0x0166, B:127:0x0170, B:130:0x011c, B:131:0x00b8, B:132:0x0063, B:134:0x006d, B:137:0x010c, B:93:0x022b), top: B:3:0x0009, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01a1 A[Catch: all -> 0x030c, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0009, B:16:0x0013, B:18:0x0029, B:20:0x0037, B:22:0x0043, B:23:0x0056, B:28:0x0076, B:29:0x007d, B:31:0x0089, B:33:0x0095, B:34:0x00ac, B:38:0x00c2, B:39:0x00c9, B:41:0x0115, B:42:0x0122, B:44:0x013e, B:46:0x014a, B:47:0x0159, B:52:0x0179, B:53:0x017c, B:55:0x0182, B:56:0x0185, B:58:0x0194, B:64:0x01a1, B:67:0x01ba, B:69:0x01c1, B:71:0x01c9, B:73:0x01cf, B:75:0x01d3, B:77:0x01db, B:80:0x01f5, B:82:0x0204, B:85:0x020f, B:91:0x021c, B:94:0x0232, B:97:0x024e, B:101:0x026f, B:104:0x028b, B:117:0x02bd, B:120:0x02e1, B:125:0x0166, B:127:0x0170, B:130:0x011c, B:131:0x00b8, B:132:0x0063, B:134:0x006d, B:137:0x010c, B:93:0x022b), top: B:3:0x0009, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01ba A[Catch: all -> 0x030c, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0009, B:16:0x0013, B:18:0x0029, B:20:0x0037, B:22:0x0043, B:23:0x0056, B:28:0x0076, B:29:0x007d, B:31:0x0089, B:33:0x0095, B:34:0x00ac, B:38:0x00c2, B:39:0x00c9, B:41:0x0115, B:42:0x0122, B:44:0x013e, B:46:0x014a, B:47:0x0159, B:52:0x0179, B:53:0x017c, B:55:0x0182, B:56:0x0185, B:58:0x0194, B:64:0x01a1, B:67:0x01ba, B:69:0x01c1, B:71:0x01c9, B:73:0x01cf, B:75:0x01d3, B:77:0x01db, B:80:0x01f5, B:82:0x0204, B:85:0x020f, B:91:0x021c, B:94:0x0232, B:97:0x024e, B:101:0x026f, B:104:0x028b, B:117:0x02bd, B:120:0x02e1, B:125:0x0166, B:127:0x0170, B:130:0x011c, B:131:0x00b8, B:132:0x0063, B:134:0x006d, B:137:0x010c, B:93:0x022b), top: B:3:0x0009, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x024c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 783
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wexnet.WeXNet.Companion.a():void");
        }

        public final void activateCacheFiles(java.lang.String cachePath) {
            com.tencent.mm.vfs.r6[] G;
            kotlin.jvm.internal.o.g(cachePath, "cachePath");
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(cachePath));
            if (!r6Var.y() || (G = r6Var.G()) == null) {
                return;
            }
            for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                if (r6Var2.y()) {
                    com.tencent.mm.wexnet.WeXNet.Companion companion = com.tencent.mm.wexnet.WeXNet.INSTANCE;
                    java.lang.String o17 = r6Var2.o();
                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                    companion.activateCacheFiles(o17);
                } else {
                    r6Var2.N(java.lang.System.currentTimeMillis());
                }
            }
        }

        public final com.tencent.mm.wexnet.Result b(com.tencent.mm.wexnet.SessionKeeper sessionKeeper, java.util.HashMap inputTensors, java.util.HashMap outputSharedTensors, com.tencent.mm.plugin.appbrand.jsruntime.f1 dataHolderFactory) {
            kotlin.jvm.internal.o.g(sessionKeeper, "sessionKeeper");
            kotlin.jvm.internal.o.g(inputTensors, "inputTensors");
            kotlin.jvm.internal.o.g(outputSharedTensors, "outputSharedTensors");
            kotlin.jvm.internal.o.g(dataHolderFactory, "dataHolderFactory");
            a();
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.wexnet.Result run = com.tencent.mm.wexnet.WeXNet.run(sessionKeeper, inputTensors, hashMap);
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                java.nio.ByteBuffer data = ((com.tencent.mm.wexnet.TensorCpuB) entry.getValue()).getData();
                int capacity = data.capacity();
                cl.y3 y3Var = null;
                if (com.eclipsesource.mmv8.V8.isLoaded()) {
                    com.eclipsesource.mmv8.InSandboxByteBuffer allocate = com.eclipsesource.mmv8.InSandboxByteBuffer.allocate(capacity);
                    if (allocate.asByteBuffer() != null) {
                        y3Var = new cl.y3(allocate, null);
                    }
                }
                kotlin.jvm.internal.o.d(y3Var);
                java.nio.ByteBuffer asByteBuffer = y3Var.f42831d.asByteBuffer();
                kotlin.jvm.internal.o.d(asByteBuffer);
                asByteBuffer.put(data);
                outputSharedTensors.put(entry.getKey(), new com.tencent.mm.wexnet.r(((com.tencent.mm.wexnet.TensorCpuB) entry.getValue()).getDateType(), ((com.tencent.mm.wexnet.TensorCpuB) entry.getValue()).getDataShape(), y3Var));
            }
            hashMap.clear();
            return run;
        }
    }

    public static final /* synthetic */ java.lang.String access$getXNetRuntimeVer() {
        return getXNetRuntimeVer();
    }

    public static final void activateCacheFiles(java.lang.String str) {
        INSTANCE.activateCacheFiles(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native com.tencent.mm.wexnet.SessionCreateResult createSession(java.lang.String str, com.tencent.mm.wexnet.Options options);

    private static final native java.lang.String getXNetRuntimeVer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native com.tencent.mm.wexnet.Result releaseSession(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native com.tencent.mm.wexnet.Result run(com.tencent.mm.wexnet.SessionKeeper sessionKeeper, java.util.Map<java.lang.String, com.tencent.mm.wexnet.TensorCpuB> map, java.util.Map<java.lang.String, com.tencent.mm.wexnet.TensorCpuB> map2);

    public static final com.tencent.mm.wexnet.SessionCreateResult tryCreateSession(java.lang.String modelFilePath, com.tencent.mm.wexnet.Options options) {
        com.tencent.mm.wexnet.WeXNet.Companion companion = INSTANCE;
        companion.getClass();
        kotlin.jvm.internal.o.g(modelFilePath, "modelFilePath");
        kotlin.jvm.internal.o.g(options, "options");
        companion.a();
        return createSession(modelFilePath, options);
    }

    public static final java.lang.String tryGetXNetRuntimeVer() {
        INSTANCE.a();
        return access$getXNetRuntimeVer();
    }

    public static final void tryLoadLib() {
        INSTANCE.a();
    }

    public static final com.tencent.mm.wexnet.Result tryReleaseSession(long j17) {
        INSTANCE.a();
        return releaseSession(j17);
    }

    public static final com.tencent.mm.wexnet.Result tryRun(com.tencent.mm.wexnet.SessionKeeper sessionKeeper, java.util.HashMap<java.lang.String, com.tencent.mm.wexnet.TensorCpuB> hashMap, java.util.HashMap<java.lang.String, com.tencent.mm.wexnet.r> hashMap2, com.tencent.mm.plugin.appbrand.jsruntime.f1 f1Var) {
        return INSTANCE.b(sessionKeeper, hashMap, hashMap2, f1Var);
    }
}
