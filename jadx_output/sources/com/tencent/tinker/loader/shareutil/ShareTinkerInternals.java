package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class ShareTinkerInternals {
    private static final java.lang.String PATCH_PROCESS_NAME = ":patch";
    private static final java.lang.String SAFEMODE_COUNT_REC_PREFIX = "safemode_count_rec_";
    private static final java.lang.String TAG = "Tinker.TinkerInternals";
    private static final boolean VM_IS_ART = isVmArt(java.lang.System.getProperty("java.vm.version"));
    private static final boolean VM_IS_JIT = isVmJitInternal();
    private static java.lang.Boolean isPatchProcess = null;
    private static java.lang.Boolean isARKHotRunning = null;
    private static final java.lang.String[] processName = {null};
    private static java.lang.String tinkerID = null;
    private static java.lang.String currentInstructionSet = null;

    public static com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo changeTestDexToClassN(com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo shareDexDiffPatchInfo, int i17) {
        java.lang.String str;
        if (!shareDexDiffPatchInfo.rawName.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.TEST_DEX_NAME)) {
            return null;
        }
        if (i17 != 1) {
            str = "classes" + i17 + com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX;
        } else {
            str = com.tencent.tinker.loader.shareutil.ShareConstants.DEX_IN_JAR;
        }
        return new com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo(str, shareDexDiffPatchInfo.path, shareDexDiffPatchInfo.destMd5InDvm, shareDexDiffPatchInfo.destMd5InArt, shareDexDiffPatchInfo.dexDiffMd5, shareDexDiffPatchInfo.oldDexCrC, shareDexDiffPatchInfo.newOrPatchedDexCrC, shareDexDiffPatchInfo.dexMode);
    }

    public static int checkPackageAndTinkerFlag(com.tencent.tinker.loader.shareutil.ShareSecurityCheck shareSecurityCheck, int i17) {
        if (isTinkerEnabledAll(i17)) {
            return 0;
        }
        java.util.HashMap<java.lang.String, java.lang.String> metaContentMap = shareSecurityCheck.getMetaContentMap();
        if (!isTinkerEnabledForDex(i17) && metaContentMap.containsKey(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_META_FILE)) {
            return -9;
        }
        if (isTinkerEnabledForNativeLib(i17) || !metaContentMap.containsKey(com.tencent.tinker.loader.shareutil.ShareConstants.SO_META_FILE)) {
            return (isTinkerEnabledForResource(i17) || !metaContentMap.containsKey(com.tencent.tinker.loader.shareutil.ShareConstants.RES_META_FILE)) ? 0 : -9;
        }
        return -9;
    }

    public static int checkSignatureAndTinkerID(android.content.Context context, java.io.File file, com.tencent.tinker.loader.shareutil.ShareSecurityCheck shareSecurityCheck) {
        if (!shareSecurityCheck.verifyPatchMetaSignature(file)) {
            return -1;
        }
        java.lang.String manifestTinkerID = getManifestTinkerID(context);
        if (manifestTinkerID == null) {
            return -5;
        }
        java.util.HashMap<java.lang.String, java.lang.String> packagePropertiesIfPresent = shareSecurityCheck.getPackagePropertiesIfPresent();
        if (packagePropertiesIfPresent == null) {
            return -2;
        }
        java.lang.String str = packagePropertiesIfPresent.get(com.tencent.tinker.loader.shareutil.ShareConstants.TINKER_ID);
        if (str == null) {
            return -6;
        }
        if (manifestTinkerID.equals(str)) {
            return 0;
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "tinkerId in patch is not matched with the one in base pack, base: %s, patch: %s.", manifestTinkerID, str);
        return -7;
    }

    public static int checkTinkerPackage(android.content.Context context, int i17, java.io.File file, com.tencent.tinker.loader.shareutil.ShareSecurityCheck shareSecurityCheck) {
        int checkSignatureAndTinkerID = checkSignatureAndTinkerID(context, file, shareSecurityCheck);
        return checkSignatureAndTinkerID == 0 ? checkPackageAndTinkerFlag(shareSecurityCheck, i17) : checkSignatureAndTinkerID;
    }

    public static void cleanPatch(android.content.Context context) {
        if (context == null) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("context is null");
        }
        java.io.File patchDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(context);
        if (!patchDirectory.exists()) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, new java.lang.Throwable(), "try to clean patch while there're not any applied patches.", new java.lang.Object[0]);
            return;
        }
        java.io.File patchInfoFile = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoFile(patchDirectory.getAbsolutePath());
        if (!patchInfoFile.exists()) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, new java.lang.Throwable(), "try to clean patch while patch info file does not exist.", new java.lang.Object[0]);
            return;
        }
        java.io.File patchInfoLockFile = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoLockFile(patchDirectory.getAbsolutePath());
        com.tencent.tinker.loader.shareutil.SharePatchInfo readAndCheckPropertyWithLock = com.tencent.tinker.loader.shareutil.SharePatchInfo.readAndCheckPropertyWithLock(patchInfoFile, patchInfoLockFile);
        if (readAndCheckPropertyWithLock != null) {
            readAndCheckPropertyWithLock.newVersion = "";
            readAndCheckPropertyWithLock.versionToRemove = "";
            com.tencent.tinker.loader.shareutil.SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, readAndCheckPropertyWithLock, patchInfoLockFile);
        } else {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace(TAG, new java.lang.Throwable(), "fail to get patchInfo.", new java.lang.Object[0]);
        }
        cleanPatchDirectoryWithGuard(patchDirectory, null);
    }

    public static void cleanPatchDirectoryWithGuard(java.io.File file, java.lang.String str) {
        java.io.File guardDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getGuardDirectory(file.getAbsolutePath());
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                java.lang.String name = file2.getName();
                if (file2.isDirectory() && name.startsWith(com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_BASE_NAME) && !name.equals(str)) {
                    java.io.File file3 = new java.io.File(guardDirectory, name);
                    if (!file3.exists()) {
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "clean broken patch directory %s", file2.getAbsolutePath());
                        com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir(file2);
                    }
                    com.tencent.tinker.loader.shareutil.Guard acquireClean = com.tencent.tinker.loader.shareutil.Guard.acquireClean(file3);
                    boolean z17 = acquireClean != null;
                    if (z17) {
                        try {
                            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "clean obsolete patch directory %s", file2.getAbsolutePath());
                            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir(file2);
                        } catch (java.lang.Throwable th6) {
                            try {
                                throw th6;
                            } catch (java.lang.Throwable th7) {
                                if (acquireClean != null) {
                                    try {
                                        acquireClean.close();
                                    } catch (java.lang.Throwable th8) {
                                        th6.addSuppressed(th8);
                                    }
                                }
                                throw th7;
                            }
                        }
                    }
                    if (acquireClean != null) {
                        acquireClean.close();
                    }
                    if (z17) {
                        file3.delete();
                    } else {
                        com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "skip cleaning used patch directory %s", file2.getAbsolutePath());
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    public static java.util.Properties fastGetPatchPackageMeta(java.io.File file) {
        java.util.zip.ZipFile zipFile;
        java.io.InputStream inputStream;
        java.util.zip.ZipFile zipFile2 = null;
        if (file != null && file.isFile()) {
            ?? r47 = (file.length() > 0L ? 1 : (file.length() == 0L ? 0 : -1));
            try {
                if (r47 != 0) {
                    try {
                        zipFile = new java.util.zip.ZipFile(file);
                        try {
                            java.util.zip.ZipEntry entry = zipFile.getEntry(com.tencent.tinker.loader.shareutil.ShareConstants.PACKAGE_META_FILE);
                            if (entry == null) {
                                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "patch meta entry not found", new java.lang.Object[0]);
                                com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(zipFile);
                                return null;
                            }
                            try {
                                inputStream = zipFile.getInputStream(entry);
                                try {
                                    java.util.Properties properties = new java.util.Properties();
                                    properties.load(inputStream);
                                    com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(inputStream);
                                    com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(zipFile);
                                    return properties;
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(inputStream);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                inputStream = null;
                            }
                        } catch (java.io.IOException e17) {
                            e = e17;
                            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "fastGetPatchPackageMeta exception:" + e.getMessage(), new java.lang.Object[0]);
                            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(zipFile);
                            return null;
                        }
                    } catch (java.io.IOException e18) {
                        e = e18;
                        zipFile = null;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(zipFile2);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                zipFile2 = r47;
            }
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "patchFile is illegal", new java.lang.Object[0]);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        if (r2.equals("x86_64") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getCurrentInstructionSet() {
        /*
            java.lang.String r0 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.currentInstructionSet
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 1
            r1 = 0
            java.lang.String r2 = "dalvik.system.VMRuntime"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "getCurrentInstructionSet"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L25
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L25
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L25
            com.tencent.tinker.loader.shareutil.ShareTinkerInternals.currentInstructionSet = r2     // Catch: java.lang.Throwable -> L25
            goto Laa
        L25:
            java.lang.String r2 = android.os.Build.CPU_ABI
            r2.getClass()
            int r3 = r2.hashCode()
            java.lang.String r4 = "mips"
            java.lang.String r5 = "x86"
            java.lang.String r6 = "x86_64"
            java.lang.String r7 = "mips64"
            r8 = -1
            switch(r3) {
                case -1073971299: goto L76;
                case -806050265: goto L6f;
                case -738963905: goto L64;
                case 117110: goto L5b;
                case 3351711: goto L52;
                case 145444210: goto L47;
                case 1431565292: goto L3c;
                default: goto L3a;
            }
        L3a:
            r0 = r8
            goto L7e
        L3c:
            java.lang.String r0 = "arm64-v8a"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L45
            goto L3a
        L45:
            r0 = 6
            goto L7e
        L47:
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L50
            goto L3a
        L50:
            r0 = 5
            goto L7e
        L52:
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L59
            goto L3a
        L59:
            r0 = 4
            goto L7e
        L5b:
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L62
            goto L3a
        L62:
            r0 = 3
            goto L7e
        L64:
            java.lang.String r0 = "armeabi"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6d
            goto L3a
        L6d:
            r0 = 2
            goto L7e
        L6f:
            boolean r3 = r2.equals(r6)
            if (r3 != 0) goto L7e
            goto L3a
        L76:
            boolean r0 = r2.equals(r7)
            if (r0 != 0) goto L7d
            goto L3a
        L7d:
            r0 = r1
        L7e:
            switch(r0) {
                case 0: goto La8;
                case 1: goto La5;
                case 2: goto La0;
                case 3: goto L9d;
                case 4: goto L9a;
                case 5: goto La0;
                case 6: goto L95;
                default: goto L81;
            }
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported abi: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L95:
            java.lang.String r0 = "arm64"
            com.tencent.tinker.loader.shareutil.ShareTinkerInternals.currentInstructionSet = r0
            goto Laa
        L9a:
            com.tencent.tinker.loader.shareutil.ShareTinkerInternals.currentInstructionSet = r4
            goto Laa
        L9d:
            com.tencent.tinker.loader.shareutil.ShareTinkerInternals.currentInstructionSet = r5
            goto Laa
        La0:
            java.lang.String r0 = "arm"
            com.tencent.tinker.loader.shareutil.ShareTinkerInternals.currentInstructionSet = r0
            goto Laa
        La5:
            com.tencent.tinker.loader.shareutil.ShareTinkerInternals.currentInstructionSet = r6
            goto Laa
        La8:
            com.tencent.tinker.loader.shareutil.ShareTinkerInternals.currentInstructionSet = r7
        Laa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrentInstructionSet:"
            r0.<init>(r2)
            java.lang.String r2 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.currentInstructionSet
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Tinker.TinkerInternals"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(r2, r0, r1)
            java.lang.String r0 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.currentInstructionSet
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getCurrentInstructionSet():java.lang.String");
    }

    public static java.lang.String getCurrentOatMode(android.content.Context context, java.lang.String str) {
        return str.equals(com.tencent.tinker.loader.shareutil.ShareConstants.CHANING_DEX_OPTIMIZE_PATH) ? isInMainProcess(context) ? "odex" : com.tencent.tinker.loader.shareutil.ShareConstants.INTERPRET_DEX_OPTIMIZE_PATH : str;
    }

    public static java.lang.String getExceptionCauseString(java.lang.Throwable th6) {
        if (th6 == null) {
            return "";
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.PrintStream printStream = new java.io.PrintStream(byteArrayOutputStream);
        while (true) {
            try {
                java.lang.Throwable cause = th6.getCause();
                if (cause == null) {
                    th6.printStackTrace(printStream);
                    return toVisualString(byteArrayOutputStream.toString());
                }
                th6 = cause;
            } finally {
                com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(printStream);
            }
        }
    }

    public static java.lang.String getManifestTinkerID(android.content.Context context) {
        java.lang.String str = tinkerID;
        if (str != null) {
            return str;
        }
        try {
            java.lang.Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(com.tencent.tinker.loader.shareutil.ShareConstants.TINKER_ID);
            if (obj != null) {
                tinkerID = java.lang.String.valueOf(obj);
            } else {
                tinkerID = null;
            }
            return tinkerID;
        } catch (java.lang.Exception e17) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "getManifestTinkerID exception:" + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String getProcessName(android.content.Context context) {
        java.lang.String[] strArr = processName;
        if (strArr[0] == null) {
            synchronized (strArr) {
                if (strArr[0] == null) {
                    strArr[0] = getProcessNameInternal(context);
                }
            }
        }
        java.lang.String str = strArr[0];
        return str != null ? str : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getProcessNameInternal(android.content.Context r8) {
        /*
            java.lang.String r0 = "getProcessNameInternal parse cmdline exception:"
            r1 = 28
            r2 = 1
            boolean r1 = isNewerOrEqualThanVersion(r1, r2)
            if (r1 == 0) goto L16
            java.lang.String r1 = android.app.Application.getProcessName()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L16
            return r1
        L16:
            r1 = 18
            boolean r1 = isNewerOrEqualThanVersion(r1, r2)
            java.lang.String r3 = "Tinker.TinkerInternals"
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L5c
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "currentProcessName"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L44
            java.lang.reflect.Method r1 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(r1, r6, r7)     // Catch: java.lang.Throwable -> L44
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L5c
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L5c
            return r1
        L44:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "getProcessNameInternal reflect activity thread exception:"
            r2.<init>(r6)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(r3, r1, r2)
        L5c:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L89
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L89
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = "/proc/self/cmdline"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L89
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.US_ASCII     // Catch: java.lang.Throwable -> L89
            r2.<init>(r6, r7)     // Catch: java.lang.Throwable -> L89
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L83
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L87
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L87
            if (r0 != 0) goto L83
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r1)
            return r2
        L83:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r1)
            goto La1
        L87:
            r2 = move-exception
            goto L8b
        L89:
            r2 = move-exception
            r1 = r4
        L8b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lef
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> Lef
            r6.append(r0)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> Lef
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lef
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(r3, r0, r2)     // Catch: java.lang.Throwable -> Lef
            goto L83
        La1:
            if (r8 == 0) goto Lee
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Ld6
            int r1 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = "activity"
            java.lang.Object r8 = r8.getSystemService(r2)     // Catch: java.lang.Throwable -> Ld6
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8     // Catch: java.lang.Throwable -> Ld6
            if (r8 == 0) goto Lee
            java.util.List r8 = r8.getRunningAppProcesses()     // Catch: java.lang.Throwable -> Ld6
            if (r8 == 0) goto Lee
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Ld6
        Lbf:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r2 == 0) goto Lee
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> Ld6
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Throwable -> Ld6
            int r6 = r2.pid     // Catch: java.lang.Throwable -> Ld6
            if (r6 != r0) goto Lbf
            int r6 = r2.uid     // Catch: java.lang.Throwable -> Ld6
            if (r6 != r1) goto Lbf
            java.lang.String r8 = r2.processName     // Catch: java.lang.Throwable -> Ld6
            return r8
        Ld6:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getProcessNameInternal getRunningAppProcesses exception:"
            r0.<init>(r1)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(r3, r8, r0)
        Lee:
            return r4
        Lef:
            r8 = move-exception
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getProcessNameInternal(android.content.Context):java.lang.String");
    }

    public static int getSafeModeCount(android.content.Context context) {
        java.lang.String str = SAFEMODE_COUNT_REC_PREFIX + getProcessName(context);
        java.io.DataInputStream dataInputStream = null;
        try {
            java.io.DataInputStream dataInputStream2 = new java.io.DataInputStream(new java.io.FileInputStream(new java.io.File(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(context), str)));
            try {
                java.lang.String readUTF = dataInputStream2.readUTF();
                if (!"safe_mode_count_1.9.15.3".equals(readUTF)) {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "getSafeModeCount: key is not equal, expt: %s, actul: %s, return 0 instead.", "safe_mode_count_1.9.15.3", readUTF);
                    com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(dataInputStream2);
                    return 0;
                }
                int readInt = dataInputStream2.readInt();
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "getSafeModeCount: count: %s", java.lang.Integer.valueOf(readInt));
                com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(dataInputStream2);
                return readInt;
            } catch (java.lang.Throwable unused) {
                dataInputStream = dataInputStream2;
                try {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "getSafeModeCount: recFileName:" + str + " failed, return 0 instead.", new java.lang.Object[0]);
                    return 0;
                } finally {
                    com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(dataInputStream);
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    private static java.lang.String getTinkerSwitchSPKey(android.content.Context context) {
        java.lang.String manifestTinkerID = getManifestTinkerID(context);
        if (isNullOrNil(manifestTinkerID)) {
            manifestTinkerID = "@@";
        }
        return "tinker_enable_1.9.15.3_" + manifestTinkerID;
    }

    public static java.lang.String getTypeString(int i17) {
        switch (i17) {
            case 1:
                return "patch_file";
            case 2:
                return "patch_info";
            case 3:
                return com.tencent.tinker.loader.shareutil.ShareConstants.DEX_PATH;
            case 4:
                return "dex_opt";
            case 5:
                return com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH;
            case 6:
                return "resource";
            default:
                return com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
    }

    public static boolean is32BitEnv() {
        java.lang.String currentInstructionSet2 = getCurrentInstructionSet();
        return "arm".equals(currentInstructionSet2) || "x86".equals(currentInstructionSet2) || "mips".equals(currentInstructionSet2);
    }

    public static boolean isAfterAndroidO() {
        return android.os.Build.VERSION.SDK_INT > 25;
    }

    public static boolean isArkHotRuning() {
        java.lang.Boolean bool = isARKHotRunning;
        if (bool != null) {
            return bool.booleanValue();
        }
        isARKHotRunning = java.lang.Boolean.FALSE;
        try {
            java.lang.reflect.Method declaredMethod = java.lang.ClassLoader.getSystemClassLoader().getParent().loadClass("com.huawei.ark.app.ArkApplicationInfo").getDeclaredMethod("isRunningInArk", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            isARKHotRunning = (java.lang.Boolean) declaredMethod.invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException unused) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "class not found exception", new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException unused2) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "illegal access exception", new java.lang.Object[0]);
        } catch (java.lang.IllegalArgumentException unused3) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "illegal argument exception", new java.lang.Object[0]);
        } catch (java.lang.NoSuchMethodException unused4) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "no such method exception", new java.lang.Object[0]);
        } catch (java.lang.SecurityException unused5) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "security exception", new java.lang.Object[0]);
        } catch (java.lang.reflect.InvocationTargetException unused6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "invocation target exception", new java.lang.Object[0]);
        }
        return isARKHotRunning.booleanValue();
    }

    public static boolean isInMainProcess(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        java.lang.String str = applicationInfo != null ? applicationInfo.processName : null;
        if (isNullOrNil(str)) {
            str = context.getPackageName();
        }
        java.lang.String processName2 = getProcessName(context);
        if (processName2 == null || processName2.length() == 0) {
            processName2 = "";
        }
        return str.equals(processName2);
    }

    public static boolean isInPatchProcess(android.content.Context context) {
        java.lang.Boolean bool = isPatchProcess;
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(getProcessName(context).endsWith(PATCH_PROCESS_NAME));
        isPatchProcess = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean isNewerOrEqualThanVersion(int i17, boolean z17) {
        if (!z17) {
            return android.os.Build.VERSION.SDK_INT >= i17;
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        return i18 >= i17 || (i18 == i17 - 1 && android.os.Build.VERSION.PREVIEW_SDK_INT > 0);
    }

    public static boolean isNullOrNil(java.lang.String str) {
        return str == null || str.length() <= 0;
    }

    public static boolean isOlderOrEqualThanVersion(int i17, boolean z17) {
        if (!z17) {
            return android.os.Build.VERSION.SDK_INT <= i17;
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        return i18 <= i17 || (i18 == i17 - 1 && android.os.Build.VERSION.PREVIEW_SDK_INT > 0);
    }

    public static boolean isSystemOTA(java.lang.String str) {
        java.lang.String str2 = android.os.Build.FINGERPRINT;
        if (str == null || str.equals("") || str2 == null || str2.equals("")) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(TAG, "fingerprint empty:" + str + ",current:" + str2, new java.lang.Object[0]);
            return false;
        }
        if (str.equals(str2)) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(TAG, "same fingerprint:".concat(str2), new java.lang.Object[0]);
            return false;
        }
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.d(TAG, "system OTA,fingerprint not equal:" + str + "," + str2, new java.lang.Object[0]);
        return true;
    }

    public static boolean isTinkerEnableWithSharedPreferences(android.content.Context context) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences(com.tencent.tinker.loader.shareutil.ShareConstants.TINKER_SHARE_PREFERENCE_CONFIG, 4).getBoolean(getTinkerSwitchSPKey(context), true);
    }

    public static boolean isTinkerEnabled(int i17) {
        return i17 != 0;
    }

    public static boolean isTinkerEnabledAll(int i17) {
        return i17 == 15;
    }

    public static boolean isTinkerEnabledForArkHot(int i17) {
        return (i17 & 8) != 0;
    }

    public static boolean isTinkerEnabledForDex(int i17) {
        return (i17 & 1) != 0;
    }

    public static boolean isTinkerEnabledForNativeLib(int i17) {
        return (i17 & 2) != 0;
    }

    public static boolean isTinkerEnabledForResource(int i17) {
        return (i17 & 4) != 0;
    }

    public static boolean isVersionInRange(int i17, int i18, boolean z17) {
        return isNewerOrEqualThanVersion(i17, z17) && isOlderOrEqualThanVersion(i18, z17);
    }

    public static boolean isVmArt() {
        return true;
    }

    public static boolean isVmJit() {
        return false;
    }

    private static boolean isVmJitInternal() {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.os.SystemProperties").getDeclaredMethod("get", java.lang.String.class);
            java.lang.String str = (java.lang.String) declaredMethod.invoke(null, "dalvik.vm.usejit");
            java.lang.String str2 = (java.lang.String) declaredMethod.invoke(null, "dalvik.vm.usejitprofiles");
            if (!isNullOrNil(str) && isNullOrNil(str2)) {
                if (str.equals("true")) {
                    return true;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, "isVmJitInternal ex:" + th6, new java.lang.Object[0]);
        }
        return false;
    }

    public static void killAllOtherProcess(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.uid == android.os.Process.myUid() && runningAppProcessInfo.pid != android.os.Process.myPid()) {
                android.os.Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }

    public static void killProcessExceptMain(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.uid == android.os.Process.myUid() && !runningAppProcessInfo.processName.equals(context.getPackageName())) {
                android.os.Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }

    public static void setSafeModeCount(android.content.Context context, int i17) {
        java.lang.String str = SAFEMODE_COUNT_REC_PREFIX + getProcessName(context);
        java.io.File file = new java.io.File(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(context), str);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        java.io.DataOutputStream dataOutputStream = null;
        try {
            java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(new java.io.FileOutputStream(file));
            try {
                dataOutputStream2.writeUTF("safe_mode_count_1.9.15.3");
                dataOutputStream2.writeInt(i17);
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.i(TAG, "setSafeModeCount: count: %s", java.lang.Integer.valueOf(i17));
                com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(dataOutputStream2);
            } catch (java.lang.Throwable unused) {
                dataOutputStream = dataOutputStream2;
                try {
                    com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "setSafeModeCount: recFileName:" + str + " failed, return 0 instead.", new java.lang.Object[0]);
                } finally {
                    com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(dataOutputStream);
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    public static void setTinkerDisableWithSharedPreferences(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.tencent.tinker.loader.shareutil.ShareConstants.TINKER_SHARE_PREFERENCE_CONFIG, 4);
        sharedPreferences.edit().putBoolean(getTinkerSwitchSPKey(context), false).commit();
    }

    public static java.lang.String toVisualString(java.lang.String str) {
        char[] charArray;
        boolean z17;
        if (str == null || (charArray = str.toCharArray()) == null) {
            return null;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= charArray.length) {
                z17 = false;
                break;
            }
            if (charArray[i17] > 127) {
                charArray[i17] = 0;
                z17 = true;
                break;
            }
            i17++;
        }
        return z17 ? new java.lang.String(charArray, 0, i17) : str;
    }

    private static boolean isVmArt(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(matcher.group(1));
            return parseInt > 2 || (parseInt == 2 && java.lang.Integer.parseInt(matcher.group(2)) >= 1);
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }
}
