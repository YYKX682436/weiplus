package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class VoiceLoginUI extends com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI implements fq4.v {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f176198z = 0;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f176199x = null;

    /* renamed from: y, reason: collision with root package name */
    public fq4.w f176200y = null;

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI
    public void V6() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m3m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        X6();
        this.f176168h.setTitleText(com.tencent.mm.R.string.k9m);
        this.f176168h.f176226f.setVisibility(8);
        this.f176165e.setEnabled(false);
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI
    public void W6() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f176171n) || com.tencent.mm.sdk.platformtools.t8.K0(this.f176172o)) {
            return;
        }
        fq4.w wVar = this.f176200y;
        fq4.o oVar = new fq4.o(this.f176171n, wVar.f265649f, 0, wVar.f265647d);
        oVar.f265625h = true;
        c01.d9.e().g(oVar);
        this.f176165e.setEnabled(false);
        X6();
    }

    public void Z6(boolean z17) {
        T6();
        this.f176165e.setEnabled(true);
        int i17 = 0;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceLoginUI", "login failed");
            this.f176168h.setErr(com.tencent.mm.R.string.k9l);
            this.f176168h.c();
            java.lang.String str = fq4.e0.f265591a;
            if (str == null) {
                str = v61.d.a(1);
            }
            java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("login_sessionid", str), new java.util.AbstractMap.SimpleEntry("voicelock_verify_result", 1)};
            java.util.HashMap hashMap = new java.util.HashMap(2);
            while (i17 < 2) {
                java.util.Map.Entry entry = entryArr[i17];
                java.lang.Object key = entry.getKey();
                java.util.Objects.requireNonNull(key);
                java.lang.Object value = entry.getValue();
                java.util.Objects.requireNonNull(value);
                if (hashMap.put(key, value) != null) {
                    throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                }
                i17++;
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_login_request_end", java.util.Collections.unmodifiableMap(hashMap), 34575);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceLoginUI", "login success[%s]", com.tencent.mm.sdk.platformtools.t8.G1(this.f176200y.f265650g));
        java.lang.String str2 = fq4.e0.f265591a;
        if (str2 == null) {
            str2 = v61.d.a(1);
        }
        java.util.Map.Entry[] entryArr2 = {new java.util.AbstractMap.SimpleEntry("login_sessionid", str2), new java.util.AbstractMap.SimpleEntry("voicelock_verify_result", 0)};
        java.util.HashMap hashMap2 = new java.util.HashMap(2);
        while (i17 < 2) {
            java.util.Map.Entry entry2 = entryArr2[i17];
            java.lang.Object key2 = entry2.getKey();
            java.util.Objects.requireNonNull(key2);
            java.lang.Object value2 = entry2.getValue();
            java.util.Objects.requireNonNull(value2);
            if (hashMap2.put(key2, value2) != null) {
                throw new java.lang.IllegalArgumentException("duplicate key: " + key2);
            }
            i17++;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voicelock_login_request_end", java.util.Collections.unmodifiableMap(hashMap2), 34575);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("VoiceLoginAuthPwd", this.f176200y.f265650g);
        setResult(-1, intent);
        finish();
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11557, 1);
        java.lang.String stringExtra = getIntent().getStringExtra("Kusername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = null;
        }
        this.f176199x = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("Kvertify_key");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f176199x) && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceLoginUI", "onCreate error, username and ticket are both null");
            return;
        }
        this.f176175r = true;
        fq4.w wVar = new fq4.w();
        this.f176200y = wVar;
        wVar.f265651h = this.f176199x;
        wVar.f265647d = str;
        wVar.f265648e = this;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            c01.d9.e().g(new fq4.h(1, wVar.f265651h));
        } else {
            c01.d9.e().g(new fq4.l(73, wVar.f265647d));
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        java.lang.String string = getString(com.tencent.mm.R.string.j0y);
        ((sb0.f) jVar).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceLoginUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", java.lang.Boolean.valueOf(j35.u.a(this, "android.permission.RECORD_AUDIO", 80, "", string)), new com.tencent.mm.sdk.platformtools.z3(), this);
        setBackBtn(new com.tencent.mm.plugin.voiceprint.ui.u(this));
        if (fp.h.c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.f479461zy));
            updataStatusBarIcon(com.tencent.mm.ui.bk.C());
        }
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fq4.w wVar = this.f176200y;
        if (wVar != null) {
            wVar.getClass();
            c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.ia.CTRL_INDEX, wVar);
            c01.d9.e().q(616, wVar);
            c01.d9.e().q(617, wVar);
            wVar.f265648e = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        setResult(0);
        finish();
        return true;
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceLoginUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceLoginUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 80) {
            return;
        }
        if (iArr[0] == 0) {
            Y6();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.voiceprint.ui.v(this), new com.tencent.mm.plugin.voiceprint.ui.w(this));
        }
    }
}
