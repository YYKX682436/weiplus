package com.tencent.mm.plugin.palm.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/palm/ui/PalmPrintMainUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-face_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class PalmPrintMainUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: d, reason: collision with root package name */
    public jp3.k f152871d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f152876i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f152877m;

    /* renamed from: q, reason: collision with root package name */
    public kp3.f f152881q;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152872e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f152873f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f152874g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152875h = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f152878n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f152879o = "";

    /* renamed from: p, reason: collision with root package name */
    public final r45.t45 f152880p = new r45.t45();

    public final boolean U6() {
        return kotlin.jvm.internal.o.b(this.f152874g, "1");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dmr;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{kp3.p0.class, kp3.x.class});
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.palmPrintMainUI", "[onBackPressed]");
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kp3.x xVar = (kp3.x) pf5.z.f353948a.a(context).a(kp3.x.class);
        xVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onCancel]");
        if (xVar.f311054m.compareAndSet(false, true)) {
            xVar.R6(1, "cancel", "");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.PalmPrintCameraSettingUIC", "[onCancel] ignore, isVerifyHadResult is true!");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0365, code lost:
    
        if (r0 != 0) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x050a  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.palm.ui.PalmPrintMainUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        jp3.k kVar = this.f152871d;
        if (kVar != null) {
            java.lang.String str = kVar.f301012e;
            if (str == null || str.length() == 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintLogic", "[release] currentCdnMediaId ：" + kVar.f301012e);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(kVar.f301012e);
            kVar.f301012e = "";
        }
    }
}
