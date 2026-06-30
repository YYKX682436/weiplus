package jn4;

/* loaded from: classes12.dex */
public class n implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f300824d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f300825e;

    public n(java.lang.String[] strArr, java.util.List list) {
        this.f300825e = strArr;
        this.f300824d = list;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "MMTraceRouteCMDExecutor_watcher";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.ProcessBuilder] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // java.lang.Runnable
    public void run() {
        java.io.BufferedReader bufferedReader;
        java.io.BufferedReader bufferedReader2;
        java.lang.Exception e17;
        java.lang.InterruptedException e18;
        java.io.IOException e19;
        java.lang.Process process;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ?? processBuilder = new java.lang.ProcessBuilder(this.f300825e);
        processBuilder.redirectErrorStream(true);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.Process process2 = null;
        try {
            try {
                processBuilder = processBuilder.start();
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                com.tencent.mm.sdk.platformtools.t8.v1(processBuilder.getOutputStream());
                currentTimeMillis2 = java.lang.System.currentTimeMillis();
                bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(processBuilder.getInputStream()), 8096);
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb6.append(readLine);
                        }
                    } catch (java.io.IOException e27) {
                        e19 = e27;
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "run cmd err, io exception: " + e19.getMessage());
                        process = processBuilder;
                        jn4.o.a(process, bufferedReader2);
                        java.lang.String sb7 = sb6.toString();
                        java.util.List list = this.f300824d;
                        list.add(sb7);
                        list.add(java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "stringbuilder: " + sb6.toString());
                    } catch (java.lang.InterruptedException e28) {
                        e18 = e28;
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "run cmd err, interruptedexception: " + e18.getMessage());
                        process = processBuilder;
                        jn4.o.a(process, bufferedReader2);
                        java.lang.String sb72 = sb6.toString();
                        java.util.List list2 = this.f300824d;
                        list2.add(sb72);
                        list2.add(java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "stringbuilder: " + sb6.toString());
                    } catch (java.lang.Exception e29) {
                        e17 = e29;
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "run cmd err: " + e17.getMessage());
                        process = processBuilder;
                        jn4.o.a(process, bufferedReader2);
                        java.lang.String sb722 = sb6.toString();
                        java.util.List list22 = this.f300824d;
                        list22.add(sb722);
                        list22.add(java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "stringbuilder: " + sb6.toString());
                    }
                }
                processBuilder.waitFor();
                process = processBuilder;
            } catch (java.io.IOException e37) {
                bufferedReader2 = null;
                e19 = e37;
            } catch (java.lang.InterruptedException e38) {
                bufferedReader2 = null;
                e18 = e38;
            } catch (java.lang.Exception e39) {
                bufferedReader2 = null;
                e17 = e39;
            } catch (java.lang.Throwable th7) {
                th = th7;
                bufferedReader = null;
                process2 = processBuilder;
                jn4.o.a(process2, bufferedReader);
                throw th;
            }
        } catch (java.io.IOException e47) {
            bufferedReader2 = null;
            e19 = e47;
            processBuilder = 0;
        } catch (java.lang.InterruptedException e48) {
            bufferedReader2 = null;
            e18 = e48;
            processBuilder = 0;
        } catch (java.lang.Exception e49) {
            bufferedReader2 = null;
            e17 = e49;
            processBuilder = 0;
        } catch (java.lang.Throwable th8) {
            th = th8;
            bufferedReader = null;
            jn4.o.a(process2, bufferedReader);
            throw th;
        }
        jn4.o.a(process, bufferedReader2);
        java.lang.String sb7222 = sb6.toString();
        java.util.List list222 = this.f300824d;
        list222.add(sb7222);
        list222.add(java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "stringbuilder: " + sb6.toString());
    }
}
