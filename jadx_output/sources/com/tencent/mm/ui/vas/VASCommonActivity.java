package com.tencent.mm.ui.vas;

@db5.a(672)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/vas/VASCommonActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public class VASCommonActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f211115d = "MicroMsg.VAS.VASCommonActivity@" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f211116e = jz5.h.b(new lk5.x(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f211117f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f211118g;

    public VASCommonActivity() {
        jz5.h.b(new lk5.z(this));
        this.f211117f = jz5.h.b(new lk5.y(this));
        this.f211118g = jz5.h.b(new lk5.w(this));
    }

    public int T6() {
        return com.tencent.mm.R.id.hys;
    }

    public final com.tencent.mm.ui.vas.VASCommonFragment U6() {
        java.util.List<androidx.fragment.app.Fragment> fragments = getSupportFragmentManager().getFragments();
        kotlin.jvm.internal.o.f(fragments, "getFragments(...)");
        for (androidx.fragment.app.Fragment fragment : fragments) {
            if (fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment) {
                return (com.tencent.mm.ui.vas.VASCommonFragment) fragment;
            }
        }
        return null;
    }

    public final android.view.View V6() {
        java.lang.Object value = ((jz5.n) this.f211117f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void W6() {
        android.view.ViewGroup viewGroup = this.mWrappingFrame;
        if (viewGroup == null || !(viewGroup instanceof vj5.h)) {
            return;
        }
        ((vj5.h) viewGroup).s(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        com.tencent.mm.ui.vas.VASActivity vASActivity2;
        com.tencent.mm.ui.vas.VASCommonFragment U6 = U6();
        if (!((U6 == null || (vASActivity2 = U6.f211121p) == null) ? true : vASActivity2.get_isFinishing())) {
            com.tencent.mm.ui.vas.VASCommonFragment U62 = U6();
            if (U62 == null || (vASActivity = U62.f211121p) == null) {
                return;
            }
            vASActivity.finishWithNoAnim();
            return;
        }
        jz5.o oVar = null;
        if (vk5.a.f437774d) {
            jz5.o oVar2 = new jz5.o(java.lang.Integer.valueOf(vk5.a.f437771a), vk5.a.f437772b, java.lang.Integer.valueOf(vk5.a.f437773c));
            vk5.a.f437771a = 0;
            vk5.a.f437772b = null;
            vk5.a.f437773c = -1;
            vk5.a.f437774d = false;
            oVar = oVar2;
        }
        if (oVar != null) {
            setResult(((java.lang.Number) oVar.f302841d).intValue(), (android.content.Intent) oVar.f302842e);
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487928bt;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean isCallSuperOnSaveInstanceState() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean isForceFixStatusBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.util.Objects.toString(intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z17;
        com.tencent.mm.ui.vas.VASCommonFragment U6 = U6();
        boolean z18 = false;
        if (U6 != null) {
            com.tencent.mm.ui.vas.VASActivity vASActivity = U6.f211121p;
            if (vASActivity != null) {
                vASActivity.onBackPressed();
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                z18 = true;
            }
        }
        if (z18) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0017  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            java.util.Objects.toString(r8)
            r0 = 0
            r1 = 1
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L60
            r4 = 29
            if (r3 == r4) goto L13
            r4 = 28
            if (r3 != r4) goto L11
            goto L13
        L11:
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            if (r3 != 0) goto L17
            goto L6a
        L17:
            if (r8 != 0) goto L1a
            goto L25
        L1a:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L60
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L60
            r8.setClassLoader(r3)     // Catch: java.lang.Throwable -> L60
        L25:
            if (r8 == 0) goto L6a
            java.lang.String r3 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r3 = r8.getBundle(r3)     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L6a
            java.util.Set r4 = r3.keySet()     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L6a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L60
        L39:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L60
            boolean r6 = r5 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L50
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch: java.lang.Throwable -> L60
            goto L51
        L50:
            r5 = r0
        L51:
            if (r5 != 0) goto L54
            goto L39
        L54:
            java.lang.Class r6 = r7.getClass()     // Catch: java.lang.Throwable -> L60
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Throwable -> L60
            r5.setClassLoader(r6)     // Catch: java.lang.Throwable -> L60
            goto L39
        L60:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r7.f211115d
            java.lang.String r6 = "protectSysBundleCrash err"
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r3, r6, r4)
        L6a:
            o25.n1.f(r7)
            super.onCreate(r8)
            r7.setActionbarColor(r2)
            android.view.Window r2 = r7.getWindow()
            android.view.View r2 = r2.getDecorView()
            r3 = 1792(0x700, float:2.511E-42)
            r2.setSystemUiVisibility(r3)
            android.view.Window r2 = r7.getWindow()
            vj5.o.e(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131102543(0x7f060b4f, float:1.7817527E38)
            int r2 = r2.getColor(r3)
            r7.setNavigationbarColor(r2)
            r7.hideActionbarLine()
            r7.hideActionBarOperationArea()
            androidx.appcompat.app.b r2 = r7.getSupportActionBar()
            if (r2 == 0) goto La4
            r2.o()
        La4:
            if (r8 != 0) goto Lca
            lk5.a0 r8 = com.tencent.mm.ui.vas.VASCommonFragment.Q
            jz5.g r2 = r7.f211116e
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Class<com.tencent.mm.ui.vas.VASCommonFragmentForCommonActivity> r3 = com.tencent.mm.ui.vas.VASCommonFragmentForCommonActivity.class
            com.tencent.mm.ui.vas.VASCommonFragment r8 = r8.a(r2, r3)
            androidx.fragment.app.FragmentManager r2 = r7.getSupportFragmentManager()
            androidx.fragment.app.i2 r2 = r2.beginTransaction()
            int r3 = r7.T6()
            r2.h(r3, r8, r0, r1)
            r2.d()
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.vas.VASCommonActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        java.util.List<androidx.fragment.app.Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments.size() > 0) {
            androidx.lifecycle.m1 m1Var = (androidx.fragment.app.Fragment) fragments.get(fragments.size() - 1);
            if (m1Var instanceof lk5.b) {
                com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = (com.tencent.mm.ui.vas.VASCommonFragment) ((lk5.b) m1Var);
                if (!z17) {
                    vASCommonFragment.getClass();
                    return;
                }
                if (!(vASCommonFragment.getActivity() instanceof com.tencent.mm.ui.vas.VASCommonActivity)) {
                    com.tencent.mm.ui.vas.VASActivity vASActivity = vASCommonFragment.f211121p;
                    if (!((vASActivity == null || vASActivity.getDisableCommonAreaControl()) ? false : true)) {
                        return;
                    }
                }
                vASCommonFragment.y0();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent) {
        java.lang.String str;
        android.content.ComponentName component;
        if (!com.tencent.mm.ui.MMFragmentActivity.isVASActivity(intent)) {
            super.startActivity(intent);
            return;
        }
        com.tencent.mm.ui.vas.VASCommonFragment U6 = U6();
        if (U6 != null) {
            if (intent == null || (component = intent.getComponent()) == null || (str = component.getClassName()) == null) {
                str = "";
            }
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            com.tencent.mm.ui.vas.VASActivity vASActivity = U6.f211121p;
            if (vASActivity != null) {
                lk5.q0.f(vASActivity, cls, intent, null, -1);
            }
        }
    }
}
