package gy4;

/* loaded from: classes5.dex */
public final class u extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f277625d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f277626e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f277627f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f277628g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f277629h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.r f277630i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.r f277631m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.r f277632n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f277625d = jz5.h.b(gy4.l.f277612d);
        this.f277626e = jz5.h.b(new gy4.t(this));
        this.f277627f = jz5.h.b(new gy4.k(this));
        this.f277628g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f277629h = new java.util.concurrent.ConcurrentHashMap();
        this.f277630i = new gy4.o(this);
        this.f277631m = new gy4.p(this);
        this.f277632n = new gy4.q(this);
    }

    public final ct.q2 T6() {
        return (ct.q2) ((jz5.n) this.f277625d).getValue();
    }

    public final gy4.d U6() {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return null;
        }
        return (gy4.d) stateCenter.getState();
    }

    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI V6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) {
            return (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) activity;
        }
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI V6 = V6();
        boolean z17 = false;
        if ((V6 == null || (mMWebView = V6.f183815f) == null || !mMWebView.canGoBack()) ? false : true) {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI V62 = V6();
            if (V62 != null && V62.K) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI V63 = V6();
                if (V63 != null) {
                    V63.o8();
                }
                return true;
            }
        }
        return super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r2.f277593h == true) goto L8;
     */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r2) {
        /*
            r1 = this;
            gy4.d r2 = r1.U6()
            if (r2 == 0) goto Lc
            boolean r2 = r2.f277593h
            r0 = 1
            if (r2 != r0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L27
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r1.V6()
            if (r2 == 0) goto L3e
            com.tencent.mm.plugin.webview.core.e3 r2 = r2.L1
            if (r2 == 0) goto L3e
            jz5.g r0 = r1.f277626e
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            mw4.p r0 = (mw4.p) r0
            r2.E(r0)
            goto L3e
        L27:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r1.V6()
            if (r2 == 0) goto L3e
            com.tencent.mm.plugin.webview.core.e3 r2 = r2.L1
            if (r2 == 0) goto L3e
            jz5.g r0 = r1.f277627f
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            mw4.p r0 = (mw4.p) r0
            r2.E(r0)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gy4.u.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0010, B:5:0x0016, B:9:0x001f, B:11:0x0025, B:13:0x0029, B:18:0x0037, B:20:0x003d, B:22:0x0041), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0010, B:5:0x0016, B:9:0x001f, B:11:0x0025, B:13:0x0029, B:18:0x0037, B:20:0x003d, B:22:0x0041), top: B:2:0x0010 }] */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.WebViewChatRecordsUIC"
            java.lang.String r1 = "[onDestroy] cleaning up resources"
            com.tencent.mars.xlog.Log.i(r0, r1)
            ct.q2 r1 = r4.T6()
            qg5.l0 r1 = (qg5.l0) r1
            r1.ij()
            gy4.d r1 = r4.U6()     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L1c
            boolean r1 = r1.f277593h     // Catch: java.lang.Exception -> L4f
            r2 = 1
            if (r1 != r2) goto L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L37
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r4.V6()     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L61
            com.tencent.mm.plugin.webview.core.e3 r1 = r1.L1     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L61
            jz5.g r2 = r4.f277626e     // Catch: java.lang.Exception -> L4f
            jz5.n r2 = (jz5.n) r2     // Catch: java.lang.Exception -> L4f
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L4f
            mw4.p r2 = (mw4.p) r2     // Catch: java.lang.Exception -> L4f
            r1.M0(r2)     // Catch: java.lang.Exception -> L4f
            goto L61
        L37:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r4.V6()     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L61
            com.tencent.mm.plugin.webview.core.e3 r1 = r1.L1     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L61
            jz5.g r2 = r4.f277627f     // Catch: java.lang.Exception -> L4f
            jz5.n r2 = (jz5.n) r2     // Catch: java.lang.Exception -> L4f
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L4f
            mw4.p r2 = (mw4.p) r2     // Catch: java.lang.Exception -> L4f
            r1.M0(r2)     // Catch: java.lang.Exception -> L4f
            goto L61
        L4f:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[onDestroy] error during cleanup: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.mars.xlog.Log.e(r0, r1)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gy4.u.onDestroy():void");
    }
}
