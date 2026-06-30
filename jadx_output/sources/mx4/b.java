package mx4;

/* loaded from: classes7.dex */
public final class b extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final mx4.b f332634d = new mx4.b();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c5, code lost:
    
        if (r3.equals("wx4edd479d258d7f25") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cc, code lost:
    
        if (r3.equals("wxe208ce76dfa39515") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d6, code lost:
    
        if (r3.equals("wx9e221f7828fa7482") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01dd, code lost:
    
        if (r3.equals("wx2f3fb5db9f226462") == false) goto L59;
     */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r21, nw4.y2 r22) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx4.b.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return -2;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "handleDynamicCardDebugAction";
    }

    public final void e(nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap) {
        com.tencent.mars.xlog.Log.i("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", "endWithResult:" + hashMap);
        kVar.f340863d.e(y2Var.f341013c, "handleDynamicCardDebugAction:ok", hashMap);
    }

    public final void f() {
        ((ne0.p) ((oe0.s) i95.n0.c(oe0.s.class))).getClass();
        xg4.m mVar = xg4.m.f454446a;
        synchronized (mVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "forceCleanUp");
            if (xg4.m.f454447b != null && mVar.c()) {
                ((ku5.t0) ku5.t0.f312615d).B(xg4.h.f454442d);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "forceCleanUp not registered or not open");
        }
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ek();
    }
}
