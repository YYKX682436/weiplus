package os3;

/* loaded from: classes8.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.v0 f348191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.C2CUploadResult f348192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ os3.v1 f348193f;

    public s1(os3.v1 v1Var, ks3.v0 v0Var, com.tencent.mars.cdn.CdnManager.C2CUploadResult c2CUploadResult) {
        this.f348193f = v1Var;
        this.f348191d = v0Var;
        this.f348192e = c2CUploadResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        os3.u1 u1Var;
        ks3.v0 v0Var = this.f348191d;
        if (v0Var != null) {
            int i17 = this.f348192e.errorCode;
            os3.v1 v1Var = this.f348193f;
            if (i17 != 0) {
                v0Var.f311758g = 3;
            } else {
                v0Var.f311758g = 2;
                boolean f17 = v1Var.f();
                java.util.Map map = v1Var.f348226h;
                if (f17) {
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    java.util.Iterator it = hashMap.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z17 = true;
                            break;
                        } else if (((ks3.v0) hashMap.get((java.lang.String) it.next())).f311758g != 2) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17 && (u1Var = v1Var.f348229n) != null) {
                        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = ((os3.a0) u1Var).f348025a.f348036d;
                        composeUI.D = com.tencent.mm.plugin.qqmail.ui.ComposeUI.U6(composeUI);
                    }
                } else {
                    os3.u1 u1Var2 = v1Var.f348229n;
                    if (u1Var2 != null) {
                        java.util.HashMap hashMap2 = (java.util.HashMap) map;
                        hashMap2.size();
                        java.util.Iterator it6 = hashMap2.keySet().iterator();
                        while (it6.hasNext() && ((ks3.v0) hashMap2.get((java.lang.String) it6.next())).f311758g == 2) {
                        }
                        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI2 = ((os3.a0) u1Var2).f348025a.f348036d;
                        composeUI2.A.setMessage(composeUI2.getString(com.tencent.mm.R.string.hjm));
                    }
                }
            }
            v1Var.g(v0Var);
        }
    }
}
