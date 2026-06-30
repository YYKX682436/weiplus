package i52;

/* loaded from: classes15.dex */
public abstract class l {
    public static androidx.fragment.app.Fragment a(int i17, java.util.List list, androidx.fragment.app.FragmentActivity fragmentActivity) {
        androidx.fragment.app.Fragment fragment = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        if (i17 < 0 || i17 >= size) {
            return null;
        }
        if (i17 == 0) {
            fragment = b("com.tencent.mm.ui.conversation.MainUI", list);
        } else if (i17 == 1) {
            fragment = b("com.tencent.mm.ui.contact.address.MvvmAddressUIFragment", list);
            if (fragment == null) {
                fragment = b("com.tencent.mm.ui.contact.AddressUI.AddressUIFragment", list);
            }
        } else if (i17 == 2) {
            fragment = b("com.tencent.mm.ui.FindMoreFriendsUI", list);
        } else if (i17 == 3) {
            fragment = b("com.tencent.mm.ui.MoreTabUI", list);
        } else if (i17 == 4) {
            fragment = b("com.tencent.mm.ui.chatting.ChattingUIFragment", list);
        }
        if (fragment != null) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentUtil", "_getFragmentByIndex: " + fragment.getClass().getCanonicalName());
            return fragment;
        }
        try {
            androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) list.get(i17);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI-1: " + fragment2.getClass().getCanonicalName());
            return fragment2;
        } catch (java.lang.Exception unused) {
            androidx.fragment.app.Fragment c17 = c(fragmentActivity);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI-2:" + c17.getClass().getCanonicalName());
            return c17;
        }
    }

    public static androidx.fragment.app.Fragment b(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) it.next();
            if (fragment != null && str.equals(fragment.getClass().getCanonicalName())) {
                return fragment;
            }
        }
        return null;
    }

    public static androidx.fragment.app.Fragment c(androidx.fragment.app.FragmentActivity fragmentActivity) {
        androidx.fragment.app.Fragment fragment;
        java.lang.Boolean bool;
        androidx.fragment.app.Fragment fragment2 = null;
        if (fragmentActivity == null) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = fragmentActivity.getClass().getDeclaredMethod("getCurrentFragmet", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            fragment = (androidx.fragment.app.Fragment) declaredMethod.invoke(fragmentActivity, new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentUtil", "getCurFragment, 1: " + fragment.getClass().getCanonicalName());
        } catch (java.lang.Exception unused) {
            fragment = null;
        }
        if (fragment != null) {
            return fragment;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (supportFragmentManager == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.FragmentUtil", "getCurFragment, FragmentManager: NULL");
            return null;
        }
        java.util.List<androidx.fragment.app.Fragment> fragments = supportFragmentManager.getFragments();
        if (fragments == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.FragmentUtil", "_getCurrentFragmentFromSystem, fragmentList NULL");
        } else {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentUtil", "_getCurrentFragmentFromSystem, fragmentList: " + fragments.size());
            java.util.Iterator<androidx.fragment.app.Fragment> it = fragments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.fragment.app.Fragment next = it.next();
                if (next != null && next.isAdded()) {
                    try {
                        java.lang.reflect.Method declaredMethod2 = androidx.fragment.app.Fragment.class.getDeclaredMethod("isMenuVisible", new java.lang.Class[0]);
                        declaredMethod2.setAccessible(true);
                        bool = (java.lang.Boolean) declaredMethod2.invoke(next, new java.lang.Object[0]);
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FragmentUtil", th6, "isMenuVisible", new java.lang.Object[0]);
                        bool = java.lang.Boolean.FALSE;
                    }
                    if (bool.booleanValue()) {
                        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentUtil", "_getCurrentFragmentFromSystem: " + next.getClass().getCanonicalName());
                        fragment2 = next;
                        break;
                    }
                }
            }
        }
        return fragment2;
    }

    public static androidx.fragment.app.Fragment d(android.app.Activity activity) {
        if (activity == null) {
            return null;
        }
        return e(activity.getClass().getCanonicalName());
    }

    public static androidx.fragment.app.Fragment e(java.lang.String str) {
        if (str == null || !b52.b.k(str)) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = com.tencent.mm.ui.LauncherUI.f196826y;
            java.lang.reflect.Method declaredMethod = com.tencent.mm.ui.LauncherUI.class.getDeclaredMethod("getCurrentTabIndex", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            int intValue = ((java.lang.Integer) declaredMethod.invoke(null, new java.lang.Object[0])).intValue();
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI, index: " + intValue);
            androidx.fragment.app.FragmentActivity f17 = b52.b.f();
            if (f17 == null) {
                return null;
            }
            if (intValue <= 0) {
                return c(f17);
            }
            java.util.List<androidx.fragment.app.Fragment> fragments = f17.getSupportFragmentManager().getFragments();
            if (fragments != null) {
                return a(intValue, fragments, f17);
            }
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI, fragmentList NULL");
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static androidx.fragment.app.Fragment f(androidx.fragment.app.FragmentActivity fragmentActivity, java.lang.String str) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.util.List<androidx.fragment.app.Fragment> fragments;
        if (fragmentActivity == null || str == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
            return null;
        }
        for (androidx.fragment.app.Fragment fragment : fragments) {
            if (fragment != null && str.equals(fragment.getClass().getCanonicalName())) {
                return fragment;
            }
        }
        return null;
    }
}
