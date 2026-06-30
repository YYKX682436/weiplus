package com.tencent.mm.ui.voicesearch;

/* loaded from: classes11.dex */
public class VoiceSearchResultUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f211174d;

    /* renamed from: e, reason: collision with root package name */
    public yk5.u f211175e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f211176f;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f211178h;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f211177g = null;

    /* renamed from: i, reason: collision with root package name */
    public int f211179i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f211180m = 1;

    /* renamed from: n, reason: collision with root package name */
    public int f211181n = 2;

    /* renamed from: o, reason: collision with root package name */
    public boolean f211182o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f211183p = false;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d4m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x016c, code lost:
    
        if (((!c01.z1.s() || (r7 = ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com")) == null || com.tencent.mm.sdk.platformtools.t8.K0(r7.f195058b)) ? false : true) == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.voicesearch.VoiceSearchResultUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        this.f211182o = false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f211175e.c();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (4 == i17) {
            if (!this.f211182o) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(this.f211181n);
                sb6.append(",");
                sb6.append(this.f211179i);
                sb6.append(",");
                java.lang.String[] strArr = this.f211176f;
                sb6.append(strArr == null ? 0 : strArr.length);
                sb6.append(",0");
                g0Var.kvStat(10452, sb6.toString());
            }
            if (this.f211183p) {
                moveTaskToBack(true);
                finish();
                return true;
            }
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f211182o = true;
    }
}
