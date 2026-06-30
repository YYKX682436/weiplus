package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public abstract class b1 {
    public static java.util.Collection a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.ThreadGroup threadGroup = android.os.Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ThreadInfoReader", "getJavaThreads failed");
            return hashMap.values();
        }
        java.lang.Thread[] threadArr = new java.lang.Thread[threadGroup.activeCount() * 2];
        int enumerate = threadGroup.enumerate(threadArr);
        for (int i17 = 0; i17 < enumerate; i17++) {
            java.lang.Thread thread = threadArr[i17];
            java.lang.String name = thread.getName();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(name)) {
                java.lang.String replaceAll = name.replaceAll("[0-9]\\d*", "?");
                if (replaceAll.contains("Binder:")) {
                    replaceAll = "Binder:?_?";
                }
                com.tencent.mm.plugin.performance.watchdogs.a1 a1Var = new com.tencent.mm.plugin.performance.watchdogs.a1();
                a1Var.f153004a = replaceAll;
                a1Var.f153005b = thread.getId();
                com.tencent.mm.plugin.performance.watchdogs.z0 z0Var = (com.tencent.mm.plugin.performance.watchdogs.z0) hashMap.get(replaceAll);
                if (z0Var == null) {
                    z0Var = new com.tencent.mm.plugin.performance.watchdogs.z0(replaceAll);
                    hashMap.put(replaceAll, z0Var);
                }
                ((java.util.LinkedList) z0Var.f153169b).add(a1Var);
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(hashMap.values());
        java.util.Collections.sort(linkedList, new com.tencent.mm.plugin.performance.watchdogs.w0());
        return linkedList;
    }

    public static int b() {
        try {
            java.lang.String[] split = d("/proc/self/status", '\n').trim().split("\n");
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\d+");
            for (java.lang.String str : split) {
                if (str.startsWith("Threads")) {
                    java.util.regex.Matcher matcher = compile.matcher(str);
                    if (matcher.find()) {
                        return com.tencent.mm.sdk.platformtools.t8.D1(matcher.group(), 0);
                    }
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ThreadInfoReader", "[getProcessThreadCount] Wrong!", split[24]);
            return com.tencent.mm.sdk.platformtools.t8.D1(split[24].trim(), 0);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public static java.util.List c() {
        java.io.File[] listFiles;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.ThreadGroup threadGroup = android.os.Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ThreadInfoReader", "getJavaThreads failed");
        } else {
            java.lang.Thread[] threadArr = new java.lang.Thread[threadGroup.activeCount() * 2];
            int enumerate = threadGroup.enumerate(threadArr);
            for (int i17 = 0; i17 < enumerate; i17++) {
                java.lang.Thread thread = threadArr[i17];
                if (thread instanceof android.os.HandlerThread) {
                    com.tencent.mm.plugin.performance.watchdogs.a1 a1Var = new com.tencent.mm.plugin.performance.watchdogs.a1();
                    a1Var.f153004a = thread.getName();
                    long threadId = ((android.os.HandlerThread) thread).getThreadId();
                    a1Var.f153005b = threadId;
                    hashMap.put(java.lang.Long.valueOf(threadId), a1Var);
                    a1Var.f153006c = true;
                }
            }
        }
        com.tencent.mm.plugin.performance.watchdogs.x0 x0Var = new com.tencent.mm.plugin.performance.watchdogs.x0(hashMap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File file = new java.io.File("/proc/self/task/");
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile(" ");
            for (java.io.File file2 : listFiles) {
                try {
                    java.lang.String[] split = compile.split(d("/proc/self/task/" + file2.getName() + "/stat", ' '));
                    com.tencent.mm.plugin.performance.watchdogs.a1 a1Var2 = new com.tencent.mm.plugin.performance.watchdogs.a1();
                    a1Var2.f153005b = java.lang.Long.parseLong(split[0]);
                    a1Var2.f153004a = split[1].replace("(", "").replace(")", "");
                    a1Var2.f153007d = split[2].replace("'", "");
                    arrayList.add(a1Var2);
                    x0Var.a(a1Var2);
                } catch (java.lang.Exception e17) {
                    oj.j.b("MicroMsg.ThreadInfoReader", oj.m.e(e17), new java.lang.Object[0]);
                }
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.performance.watchdogs.a1 a1Var3 = (com.tencent.mm.plugin.performance.watchdogs.a1) it.next();
            java.lang.String str = a1Var3.f153004a;
            com.tencent.mm.plugin.performance.watchdogs.z0 z0Var = (com.tencent.mm.plugin.performance.watchdogs.z0) hashMap2.get(str);
            if (z0Var == null) {
                z0Var = new com.tencent.mm.plugin.performance.watchdogs.z0(str);
                hashMap2.put(str, z0Var);
            }
            ((java.util.LinkedList) z0Var.f153169b).add(a1Var3);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(hashMap2.values());
        java.util.Collections.sort(linkedList, new com.tencent.mm.plugin.performance.watchdogs.y0());
        return linkedList;
    }

    public static java.lang.String d(java.lang.String str, char c17) {
        java.io.BufferedReader bufferedReader;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(str);
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(fileInputStream));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            java.lang.String sb7 = sb6.toString();
                            fileInputStream.close();
                            return sb7;
                        }
                        sb6.append(readLine);
                        sb6.append(c17);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                bufferedReader = null;
            }
        } catch (java.lang.Throwable th8) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th9) {
                th8.addSuppressed(th9);
            }
            throw th8;
        }
    }
}
