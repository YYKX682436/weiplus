package yw4;

/* loaded from: classes7.dex */
public final class q implements nw4.g {

    /* renamed from: a, reason: collision with root package name */
    public final nw4.j f466978a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protocal.JsapiPermissionWrapper f466979b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f466980c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f466981d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f466982e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f466983f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f466984g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f466985h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f466986i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f466987j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f466988k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f466989l;

    static {
        new yw4.k(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (r5.intValue() != 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r5.intValue() != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r5.intValue() == 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        if (r5.intValue() == 1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(nw4.j r5, com.tencent.mm.protocal.JsapiPermissionWrapper r6, com.tencent.mm.ui.widget.MMWebView r7) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw4.q.<init>(nw4.j, com.tencent.mm.protocal.JsapiPermissionWrapper, com.tencent.mm.ui.widget.MMWebView):void");
    }

    public static final void b(yw4.q qVar) {
        android.content.Context context;
        boolean z17;
        java.util.List list = qVar.f466983f;
        if (((java.util.ArrayList) list).isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "dealMsgQueue fail, resultValueList is empty");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealMsgQueue, pre msgList = ");
        java.util.LinkedList linkedList = qVar.f466984g;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", sb6.toString());
        try {
            java.util.List b17 = nw4.z2.b((java.lang.String) ((java.util.ArrayList) list).remove(0), qVar.f466987j, qVar.f466988k);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(b17)) {
                linkedList.addAll(b17);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "dealMsgQueue now msg list size : %d", java.lang.Integer.valueOf(linkedList.size()));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherJsApiHandler", e17, "dealMsgQueue exception", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "dealMsgQueue, post msgList = " + linkedList.size());
        do {
            if (linkedList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "dealNextMsg stop, msgList is empty");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "dealNextMsg size: %s", java.lang.Integer.valueOf(linkedList.size()));
                nw4.y2 y2Var = (nw4.y2) linkedList.remove(0);
                if (y2Var != null) {
                    com.tencent.mm.ui.widget.MMWebView mMWebView = qVar.f466980c;
                    if (mMWebView == null || (context = mMWebView.getContext()) == null) {
                        context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    }
                    android.content.Context context2 = context;
                    kotlin.jvm.internal.o.d(context2);
                    com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = qVar.f466979b;
                    if (jsapiPermissionWrapper == null) {
                        jsapiPermissionWrapper = y2Var.f341016f;
                    }
                    nw4.k kVar = new nw4.k(context2, jsapiPermissionWrapper, null, qVar, qVar.f466980c);
                    nw4.d3 d3Var = nw4.d3.f340821a;
                    nw4.j jsApiPool = qVar.f466978a;
                    kotlin.jvm.internal.o.g(jsApiPool, "jsApiPool");
                    if (jsApiPool.b(kVar, y2Var) && jsApiPool.a(kVar, y2Var)) {
                        z17 = true;
                    }
                }
            }
            z17 = false;
        } while (z17);
        com.tencent.mm.sdk.platformtools.n3 n3Var = qVar.f466981d;
        if (n3Var != null) {
            n3Var.post(new yw4.l(qVar));
        }
    }

    @Override // nw4.f
    public void _getAllHosts(java.lang.String str) {
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String _getDgtVerifyRandomStr() {
        boolean z17 = this.f466986i;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "_getDgtVerifyRandomStr canUpdateRandomStr: %s, canGet: %s, randomStr: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f466989l), this.f466988k);
        if (z17 && !this.f466989l) {
            return "";
        }
        this.f466989l = false;
        return this.f466988k;
    }

    @Override // nw4.f
    public void _getHtmlContent(java.lang.String str) {
    }

    @android.webkit.JavascriptInterface
    public final boolean _isDgtVerifyEnabled() {
        return this.f466987j;
    }

    @Override // nw4.f
    public void _ready(boolean z17) {
    }

    @Override // nw4.f
    @android.webkit.JavascriptInterface
    public void _sendMessage(java.lang.String str) {
        if (this.f466981d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebPrefetcherJsApiHandler", "_sendMessage msgQueueHandler err");
            return;
        }
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.obj = str;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f466981d;
        if (n3Var != null) {
            n3Var.sendMessage(obtain);
        }
    }

    @Override // nw4.g
    public int d() {
        return 0;
    }

    @Override // nw4.e
    public void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        if (!(str == null || str.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("errMsg", str2 == null ? "" : str2);
                if (!(map == null || map.isEmpty())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "doCallback, retValue size: " + map.size() + ' ');
                    hashMap.putAll(map);
                }
                java.lang.String a17 = nw4.x2.a(str, hashMap, this.f466987j, this.f466988k);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "doCallback, ret = " + str2 + ", cb = " + a17);
                if (a17 == null || this.f466980c == null) {
                    return;
                }
                yw4.n nVar = new yw4.n(this, a17);
                if (com.tencent.mm.sdk.platformtools.u3.e()) {
                    nVar.run();
                    return;
                } else {
                    ((ku5.t0) ku5.t0.f312615d).B(nVar);
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebPrefetcherJsApiHandler", "doCallback, invalid args, ret = " + str2);
    }

    @Override // nw4.g
    public nw4.j g() {
        return this.f466978a;
    }
}
