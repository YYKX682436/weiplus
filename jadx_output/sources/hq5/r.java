package hq5;

/* loaded from: classes5.dex */
public final class r extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f283259d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f283260e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f283261f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f283262g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283259d = jz5.h.b(new hq5.p(this));
        this.f283260e = jz5.h.b(new hq5.q(activity));
    }

    public final void T6() {
        boolean z17 = false;
        jq5.b.f301255a.b().G("is_first_send", false);
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext().getSystemService("wifi");
            android.net.wifi.WifiManager wifiManager = systemService instanceof android.net.wifi.WifiManager ? (android.net.wifi.WifiManager) systemService : null;
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    z17 = true;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeDrop.WeDropPermissionManager", "[isWiFiEnable] error=" + e17);
        }
        if (z17) {
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new eq5.d());
                return;
            }
            return;
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.B3(new eq5.i(14));
        }
    }

    public final com.tencent.mm.wedrop.ui.view.PermissionAreaView U6() {
        return (com.tencent.mm.wedrop.ui.view.PermissionAreaView) ((jz5.n) this.f283259d).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r2 == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            r4 = this;
            com.tencent.mm.wedrop.ui.view.PermissionAreaView r0 = r4.U6()
            if (r0 == 0) goto L25
            java.util.List r0 = r0.f214291f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
            r2 = r1
        L10:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r0.next()
            com.tencent.mm.wedrop.ui.view.PermissionLineView r3 = (com.tencent.mm.wedrop.ui.view.PermissionLineView) r3
            boolean r3 = r3.g()
            r2 = r2 & r3
            goto L10
        L22:
            if (r2 != r1) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            if (r1 == 0) goto L36
            j75.f r0 = r4.Q6()
            if (r0 == 0) goto L36
            eq5.d r1 = new eq5.d
            r1.<init>()
            r0.B3(r1)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hq5.r.V6():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new hq5.o(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.wedrop.ui.view.PermissionAreaView U6 = U6();
        boolean z17 = false;
        if (U6 != null && U6.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            V6();
        } else if (this.f283262g) {
            T6();
        }
    }
}
