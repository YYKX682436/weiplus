package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public abstract class AbstractTabChildActivity extends androidx.appcompat.app.AppCompatActivity {

    /* loaded from: classes11.dex */
    public static abstract class AbStractTabFragment extends com.tencent.mm.ui.MMFragment implements com.tencent.mm.ui.y7 {

        /* renamed from: d, reason: collision with root package name */
        public boolean f196534d;

        /* renamed from: e, reason: collision with root package name */
        public android.os.Bundle f196535e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f196536f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f196537g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f196538h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f196539i = false;

        /* renamed from: m, reason: collision with root package name */
        public boolean f196540m = false;

        @Override // com.tencent.mm.ui.y7
        public void E() {
            e0();
            this.f196536f = true;
        }

        @Override // com.tencent.mm.ui.y7
        public void T() {
        }

        @Override // com.tencent.mm.ui.y7
        public void U() {
            this.f196539i = true;
        }

        @Override // com.tencent.mm.ui.MMFragment
        /* renamed from: getLayoutId */
        public int getF72225d() {
            return 0;
        }

        public abstract void l0(android.os.Bundle bundle);

        public abstract void m0();

        public abstract void n0();

        public abstract void o0();

        @Override // androidx.fragment.app.Fragment
        public void onActivityCreated(android.os.Bundle bundle) {
            super.onActivityCreated(bundle);
            this.f196534d = true;
            this.f196535e = bundle;
        }

        @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            if (this.f196540m) {
                m0();
            }
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
            com.tencent.mars.xlog.Log.i("MicroMsg.INIT", "onPause");
            if (this.f196537g) {
                java.lang.System.currentTimeMillis();
                n0();
                toString();
                java.lang.System.currentTimeMillis();
                this.f196537g = false;
            }
        }

        @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onResume() {
            com.tencent.mars.xlog.Log.i("MicroMsg.INIT", "onResume");
            super.onResume();
            com.tencent.mars.xlog.Log.i("MicroMsg.INIT", "resumeWithVerify %s", java.lang.Boolean.valueOf(this.f196538h));
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI == null || !launcherUI.f196833p) {
                return;
            }
            this.f196538h = true;
            if (this.f196539i) {
                v();
                this.f196539i = false;
            }
        }

        @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
        public void onStart() {
            super.onStart();
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
            if (launcherUI == null || !launcherUI.f196833p) {
                return;
            }
            p0();
        }

        @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
        public void onStop() {
            super.onStop();
            q0();
        }

        public abstract void p0();

        public abstract void q0();

        public abstract void r0();

        @Override // com.tencent.mm.ui.MMFragment
        public boolean supportNavigationSwipeBack() {
            return false;
        }

        @Override // com.tencent.mm.ui.y7
        public void v() {
            com.tencent.mars.xlog.Log.i("MicroMsg.INIT", "deliverOnTabResume %s", java.lang.Boolean.valueOf(this.f196538h));
            if (this.f196538h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.INIT", "checkNeedRecreate");
                if (this.f196534d) {
                    l0(this.f196535e);
                    this.f196534d = false;
                }
                this.f196540m = true;
                java.lang.System.currentTimeMillis();
                if (this.f196536f) {
                    this.f196536f = false;
                    V();
                }
                o0();
                toString();
                java.lang.System.currentTimeMillis();
                this.f196537g = true;
                this.f196538h = false;
            }
        }
    }
}
