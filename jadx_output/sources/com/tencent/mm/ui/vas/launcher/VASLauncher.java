package com.tencent.mm.ui.vas.launcher;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/vas/launcher/VASLauncher;", "Lcom/tencent/mm/ui/MMFragmentActivity;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public class VASLauncher extends com.tencent.mm.ui.MMFragmentActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f211145f = 0;

    /* renamed from: d, reason: collision with root package name */
    public xk5.b f211146d = new xk5.b(0, 0, 0, 0, null, false, false, null, null, null, 1023, null);

    /* renamed from: e, reason: collision with root package name */
    public boolean f211147e;

    public final com.tencent.mm.ui.vas.VASCommonFragment S6() {
        java.util.List<androidx.fragment.app.Fragment> fragments = getSupportFragmentManager().getFragments();
        kotlin.jvm.internal.o.f(fragments, "getFragments(...)");
        for (androidx.fragment.app.Fragment fragment : fragments) {
            if (fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment) {
                com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = (com.tencent.mm.ui.vas.VASCommonFragment) fragment;
                if (!lk5.s.c(vASCommonFragment.A)) {
                    return vASCommonFragment;
                }
            }
        }
        return null;
    }

    public final android.view.View T6() {
        try {
            return findViewById(com.tencent.mm.R.id.hyv);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VAS.VASLauncher", th6, "find view err", new java.lang.Object[0]);
            return null;
        }
    }

    public final boolean U6() {
        android.view.View T6 = T6();
        return T6 != null && T6.getVisibility() == 0;
    }

    public final boolean V6() {
        android.view.View T6 = T6();
        boolean z17 = false;
        if (T6 != null && T6.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return W6();
    }

    public boolean W6() {
        return false;
    }

    public void X6() {
        vj5.n c17 = vj5.n.c(this);
        if (c17 != null) {
            c17.a();
        }
        if (c17 != null) {
            c17.e();
        }
    }

    public void Y6() {
    }

    public void Z6() {
    }

    public void a7() {
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z17;
        if (!V6()) {
            super.onBackPressed();
            return;
        }
        com.tencent.mm.ui.vas.VASCommonFragment S6 = S6();
        boolean z18 = false;
        if (S6 != null) {
            com.tencent.mm.ui.vas.VASActivity vASActivity = S6.f211121p;
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

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mm.ui.vas.VASCommonFragment S6 = S6();
        com.tencent.mm.ui.vas.VASActivity vASActivity = S6 != null ? S6.f211121p : null;
        if (vASActivity != null) {
            vASActivity.onConfigurationChanged(newConfig);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!V6()) {
            return super.onKeyDown(i17, event);
        }
        com.tencent.mm.ui.vas.VASCommonFragment S6 = S6();
        boolean z17 = false;
        if (S6 != null) {
            com.tencent.mm.ui.vas.VASActivity vASActivity = S6.f211121p;
            if (vASActivity != null && vASActivity.onKeyDown(i17, event)) {
                z17 = true;
            }
        }
        if (z17) {
            return true;
        }
        return super.onKeyDown(i17, event);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent != null) {
            intent.getFlags();
        }
        if (V6()) {
            int flags = intent != null ? intent.getFlags() : 0;
            if (!(intent != null ? intent.getBooleanExtra("KEY_IGNORE_CLEAR_TOP_IN_VAS", false) : false) && (flags & 67108864) != 0) {
                java.util.Objects.toString(intent);
                try {
                    if (U6()) {
                        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                            getSupportFragmentManager().popBackStackImmediate();
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VAS.VASLauncher", th6, "handleVASOnNewIntent err", new java.lang.Object[0]);
                }
            }
        }
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        java.lang.String str;
        android.content.ComponentName component;
        if (!V6()) {
            super.startActivityForResult(intent, i17, bundle);
            return;
        }
        android.view.View T6 = T6();
        if (T6 == null) {
            super.startActivityForResult(intent, i17, bundle);
            return;
        }
        if (!(intent != null && lk5.s.d(intent, 2))) {
            super.startActivityForResult(intent, i17, bundle);
            return;
        }
        if (T6.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VAS.VASLauncher", "startActivityForResult blocked, VAS container already visible");
            return;
        }
        com.tencent.mm.ui.MMFragmentActivity.aReporter.b(intent, this, true);
        java.util.Iterator it = com.tencent.mm.ui.component.UIComponentActivity.activeUIComponents$default(this, false, 1, null).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onStartActivityForResult(intent, i17, bundle);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(T6, arrayList.toArray(), "com/tencent/mm/ui/vas/launcher/VASLauncher", "startActivityForResult", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(T6, "com/tencent/mm/ui/vas/launcher/VASLauncher", "startActivityForResult", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T6.setOnClickListener(qk5.b.f364451d);
        if (intent == null || (component = intent.getComponent()) == null || (str = component.getClassName()) == null) {
            str = "";
        }
        java.lang.Class<?> cls = java.lang.Class.forName(str);
        com.tencent.mm.ui.vas.VASCommonFragment a17 = lk5.q0.a(cls, intent, false, true, true, null, 32, null);
        android.content.Intent intent2 = a17.A;
        kotlin.jvm.internal.o.g(intent2, "<this>");
        java.lang.Object a18 = ok5.d.a(intent2, "KEY_VAS_START_ENTER_ANIM");
        sk5.j jVar = a18 instanceof sk5.j ? (sk5.j) a18 : null;
        if (jVar != null) {
            a17.B = jVar;
        }
        a17.setTargetFragment(null, i17);
        android.view.Window window = getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        this.f211146d = xk5.c.b(window, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.VAS.VASLauncher", "startActivityForResult lastWindowStyle:" + this.f211146d);
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.l(com.tencent.mm.R.anim.f477919f7, com.tencent.mm.R.anim.f477920f8, com.tencent.mm.R.anim.f477921f9, com.tencent.mm.R.anim.f_);
        beginTransaction.h(com.tencent.mm.R.id.hys, a17, null, 1);
        beginTransaction.c(cls.getName());
        beginTransaction.f11359p = true;
        beginTransaction.e();
        al5.a3.d(this);
        new java.lang.ref.WeakReference(a17);
        rk5.b bVar = rk5.b.f397141d;
        bVar.D5(this, intent);
        bVar.H(this);
        Z6();
        this.f211147e = true;
    }
}
