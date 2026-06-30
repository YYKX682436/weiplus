package od;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final od.p f344516a;

    /* renamed from: b, reason: collision with root package name */
    public final od.k f344517b;

    /* renamed from: c, reason: collision with root package name */
    public final od.f f344518c;

    /* renamed from: d, reason: collision with root package name */
    public final od.m f344519d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f344520e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f344521f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f344522g = new java.util.concurrent.ConcurrentHashMap();

    public l(od.p pVar) {
        new java.util.concurrent.atomic.AtomicInteger(1);
        this.f344516a = pVar;
        od.k kVar = new od.k(this);
        this.f344517b = kVar;
        this.f344518c = new od.f(pVar);
        this.f344519d = new od.n(this);
        pVar.addJavascriptInterface(new od.o(kVar), "_luggageBridgeNative");
    }

    public void a() {
        od.p pVar = this.f344516a;
        char[] cArr = new char[4096];
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.InputStreamReader inputStreamReader = null;
        try {
            try {
                java.io.InputStreamReader inputStreamReader2 = new java.io.InputStreamReader(pVar.getContext().getAssets().open("LuggageBridge.js"));
                while (true) {
                    try {
                        int read = inputStreamReader2.read(cArr);
                        if (-1 != read) {
                            stringWriter.write(cArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("LuggageBridge", "injectJavascript: close error, %s", e17);
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        inputStreamReader = inputStreamReader2;
                        com.tencent.mars.xlog.Log.e("LuggageBridge", "injectJavascript: read error, %s", e);
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                                return;
                            } catch (java.lang.Exception e19) {
                                com.tencent.mars.xlog.Log.e("LuggageBridge", "injectJavascript: close error, %s", e19);
                                return;
                            }
                        }
                        return;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (java.lang.Exception e27) {
                                com.tencent.mars.xlog.Log.e("LuggageBridge", "injectJavascript: close error, %s", e27);
                            }
                        }
                        throw th;
                    }
                }
                inputStreamReader2.close();
                pVar.evaluateJavascript(stringWriter.toString(), null);
            } catch (java.lang.Exception e28) {
                e = e28;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
