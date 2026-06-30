package lk5;

/* loaded from: classes14.dex */
public abstract class q0 {
    public static com.tencent.mm.ui.vas.VASCommonFragment a(java.lang.Class uiCls, android.content.Intent intent, boolean z17, boolean z18, boolean z19, java.lang.Class fragmentCls, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            intent = null;
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        if ((i17 & 16) != 0) {
            z19 = false;
        }
        if ((i17 & 32) != 0) {
            fragmentCls = com.tencent.mm.ui.vas.VASCommonFragment.class;
        }
        kotlin.jvm.internal.o.g(uiCls, "uiCls");
        kotlin.jvm.internal.o.g(fragmentCls, "fragmentCls");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_CLS, uiCls);
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_COMMON_AREA_CONTROL, z17);
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_IS_FRAGMENT_MODE, z17);
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_ACTIVITY_SWIPE_BACK, z18);
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, z19);
        if (intent.getComponent() == null) {
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, uiCls);
        }
        com.tencent.mm.ui.vas.VASCommonFragment a17 = com.tencent.mm.ui.vas.VASCommonFragment.Q.a(intent, fragmentCls);
        kotlin.jvm.internal.o.f(a17, "newInstance(...)");
        return a17;
    }

    public static com.tencent.mm.ui.vas.VASCommonFragment b(java.lang.String uiCls, android.content.Intent intent, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            intent = null;
        }
        android.content.Intent intent2 = intent;
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        kotlin.jvm.internal.o.g(uiCls, "uiCls");
        return a(java.lang.Class.forName(uiCls), intent2, z17, false, false, null, 56, null);
    }

    public static final java.lang.Class c(android.content.Context context, java.lang.Class uiCls) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(uiCls, "uiCls");
        com.tencent.mm.ui.bh.a(context);
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        if (!(java.lang.Math.min(a17.f197135a, a17.f197136b) > i65.a.b(context, 600))) {
            return com.tencent.mm.ui.vas.VASCommonActivity.class;
        }
        java.util.HashSet hashSet = lk5.i0.f319037a;
        return lk5.i0.f319037a.contains(uiCls.getName()) ? com.tencent.mm.ui.vas.VASCommonForPadActivity.class : com.tencent.mm.ui.vas.VASCommonActivity.class;
    }

    public static final void d(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(context, "<this>");
        android.content.ComponentName component = (intent == null ? new android.content.Intent() : intent).getComponent();
        kotlin.jvm.internal.o.d(component);
        java.lang.Class<?> cls = java.lang.Class.forName(component.getClassName());
        if (context instanceof android.app.Activity) {
            e((android.app.Activity) context, cls, intent, bundle, -1);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(context, c(context, cls));
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_CLS, cls);
        intent2.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_FRAGMENT_INTENT, intent);
        intent2.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bundle);
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/vas/VasNavigatorKt", "startVASActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
        yj0.a.f(context, "com/tencent/mm/ui/vas/VasNavigatorKt", "startVASActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    public static final void e(android.app.Activity activity, java.lang.Class uiCls, android.content.Intent intent, android.os.Bundle bundle, int i17) {
        kotlin.jvm.internal.o.g(activity, "<this>");
        kotlin.jvm.internal.o.g(uiCls, "uiCls");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(activity, c(activity, uiCls));
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_CLS, uiCls);
        intent2.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_FRAGMENT_INTENT, intent);
        activity.startActivityForResult(intent2, i17, bundle);
    }

    public static final void f(com.tencent.mm.ui.vas.VASActivity vASActivity, java.lang.Class uiCls, android.content.Intent intent, android.os.Bundle bundle, int i17) {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment;
        com.tencent.mm.ui.vas.VASActivity vASActivity2;
        android.os.Bundle bundle2;
        int i18;
        kotlin.jvm.internal.o.g(vASActivity, "<this>");
        kotlin.jvm.internal.o.g(uiCls, "uiCls");
        if (com.tencent.mars.xlog.Log.isDebug()) {
            uiCls.toString();
            java.util.Objects.toString(intent);
            java.util.Objects.toString(bundle);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VAS.VasNavigator", "startVASActivityForResult() called with " + vASActivity.getClass().getName() + " uiCls = " + uiCls + ", options = " + bundle + ", requestCode = " + i17);
        }
        com.tencent.mm.ui.MMFragmentActivity.aReporter.b(intent, vASActivity, true);
        androidx.fragment.app.FragmentManager fragmentManager = vASActivity.get_parentFragmentManager();
        if (fragmentManager != null) {
            boolean z17 = false;
            int intExtra = intent != null ? intent.getIntExtra(com.tencent.mm.ui.vas.VASActivity.KEY_LAUNCH_MODE, 0) : 0;
            int flags = intent != null ? intent.getFlags() : 0;
            if (intExtra == 0 && (536870912 & flags) != 0) {
                intExtra = 1;
            }
            if (intExtra == 2) {
                flags &= 67108864;
            }
            if ((flags & 67108864) != 0) {
                int backStackEntryCount = fragmentManager.getBackStackEntryCount();
                int i19 = 0;
                while (true) {
                    if (i19 >= backStackEntryCount) {
                        break;
                    }
                    androidx.fragment.app.k1 backStackEntryAt = fragmentManager.getBackStackEntryAt(i19);
                    kotlin.jvm.internal.o.f(backStackEntryAt, "getBackStackEntryAt(...)");
                    androidx.fragment.app.a aVar = (androidx.fragment.app.a) backStackEntryAt;
                    if (kotlin.jvm.internal.o.b(aVar.f11352i, uiCls.getName())) {
                        fragmentManager.popBackStackImmediate(aVar.f11352i, intExtra == 0 ? 1 : 0);
                    } else {
                        i19++;
                    }
                }
            }
            if (intExtra == 1 || intExtra == 2) {
                androidx.fragment.app.Fragment fragment = fragmentManager.getFragments().size() > 0 ? fragmentManager.getFragments().get(0) : null;
                if ((fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment) && (vASActivity2 = (vASCommonFragment = (com.tencent.mm.ui.vas.VASCommonFragment) fragment).f211121p) != null && kotlin.jvm.internal.o.b(vASActivity2.getClass(), uiCls)) {
                    android.os.Bundle arguments = vASCommonFragment.getArguments();
                    if (arguments != null) {
                        arguments.clear();
                    }
                    if (intent == null || (bundle2 = intent.getExtras()) == null) {
                        bundle2 = new android.os.Bundle();
                    }
                    android.os.Bundle arguments2 = vASCommonFragment.getArguments();
                    if (arguments2 != null) {
                        arguments2.putAll(bundle2);
                    }
                    com.tencent.mm.ui.vas.VASActivity vASActivity3 = vASCommonFragment.f211121p;
                    if (vASActivity3 != null) {
                        vASActivity3.onNewBundle(bundle2);
                    }
                    z17 = true;
                }
                if (z17) {
                    return;
                }
            }
            com.tencent.mm.ui.vas.VASCommonFragment a17 = a(uiCls, intent, false, false, false, vASActivity.get_fragment().u0(), 24, null);
            if (!vASActivity.get_fragment().isRemoving()) {
                a17.setTargetFragment(vASActivity.get_fragment(), i17);
            }
            if (vASActivity.isTabMode()) {
                java.util.HashSet hashSet = lk5.i0.f319037a;
                i18 = lk5.i0.f319037a.contains(uiCls.getName()) ? com.tencent.mm.R.id.hyt : com.tencent.mm.R.id.hyu;
            } else {
                i18 = com.tencent.mm.R.id.hys;
            }
            android.content.Intent intent2 = a17.A;
            kotlin.jvm.internal.o.g(intent2, "<this>");
            java.lang.Object a18 = ok5.d.a(intent2, "KEY_VAS_START_ENTER_ANIM");
            sk5.j jVar = a18 instanceof sk5.j ? (sk5.j) a18 : null;
            if (jVar != null) {
                a17.B = jVar;
            }
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = vASActivity.get_fragment();
            kotlin.jvm.internal.o.e(vASCommonFragment2, "null cannot be cast to non-null type com.tencent.mm.ui.vas.VASCommonFragment");
            if (intent != null) {
                java.lang.Object a19 = ok5.d.a(intent, "KEY_VAS_START_EXIT_ANIM");
                sk5.j jVar2 = a19 instanceof sk5.j ? (sk5.j) a19 : null;
                if (jVar2 != null) {
                    vASCommonFragment2.C = jVar2;
                }
            }
            vASActivity.get_fragment().B0();
            androidx.fragment.app.i2 beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.l(com.tencent.mm.R.anim.f477919f7, com.tencent.mm.R.anim.f477920f8, com.tencent.mm.R.anim.f477921f9, com.tencent.mm.R.anim.f_);
            beginTransaction.k(i18, a17, null);
            beginTransaction.c(uiCls.getName());
            beginTransaction.f11359p = true;
            beginTransaction.e();
            a17.f211122q = vASActivity.get_fragment();
        }
    }
}
