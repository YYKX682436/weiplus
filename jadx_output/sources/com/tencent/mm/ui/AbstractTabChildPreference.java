package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public abstract class AbstractTabChildPreference extends com.tencent.mm.ui.base.preference.MMPreferenceFragment implements com.tencent.mm.ui.y7 {

    /* renamed from: m, reason: collision with root package name */
    public boolean f196541m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Bundle f196542n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f196543o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f196544p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f196545q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f196546r;

    @Override // com.tencent.mm.ui.y7
    public void E() {
        e0();
        this.f196543o = true;
    }

    @Override // com.tencent.mm.ui.y7
    public void U() {
        this.f196545q = true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f196542n = bundle;
        this.f196541m = true;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        q0();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && keyEvent.getAction() == 0) {
            return false;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f196546r) {
            java.lang.System.currentTimeMillis();
            r0();
            toString();
            java.lang.System.currentTimeMillis();
            this.f196546r = false;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        T();
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI == null || !launcherUI.f196833p) {
            return;
        }
        this.f196544p = true;
        if (this.f196545q) {
            v();
            this.f196545q = false;
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        if (launcherUI == null || !launcherUI.f196833p) {
            return;
        }
        t0();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        u0();
    }

    public abstract void p0(android.os.Bundle bundle);

    public abstract void q0();

    public abstract void r0();

    public abstract void s0();

    public abstract void t0();

    public abstract void u0();

    @Override // com.tencent.mm.ui.y7
    public void v() {
        int m07;
        if (this.f196544p) {
            if (this.f196541m) {
                p0(this.f196542n);
                this.f196541m = false;
            }
            java.lang.System.currentTimeMillis();
            if (this.f196543o) {
                V();
                this.f196543o = false;
            }
            if (!this.f197768h && (m07 = m0()) != -1) {
                this.f197764d.g(m07);
                this.f197768h = true;
            }
            s0();
            toString();
            java.lang.System.currentTimeMillis();
            this.f196546r = true;
            this.f196544p = false;
        }
    }
}
