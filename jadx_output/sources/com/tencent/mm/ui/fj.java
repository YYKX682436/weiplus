package com.tencent.mm.ui;

/* loaded from: classes12.dex */
public abstract class fj {

    /* renamed from: a, reason: collision with root package name */
    public static androidx.window.embedding.SplitController f208602a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Set f208603b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f208604c;

    public static void a(android.app.Activity activity, boolean z17, boolean z18) {
        if (!com.tencent.mm.ui.bk.w0() || fp.h.a(31)) {
            return;
        }
        if (f208602a == null) {
            c();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SplitUtil", "exitSplit!!");
        android.content.Intent intent = activity.getIntent();
        if (z18) {
            activity.finish();
        }
        intent.removeFlags(4096);
        if (z17) {
            intent.removeFlags(268435456);
            intent.removeFlags(32768);
            if (fp.e0.g()) {
                intent.removeFlags(142606336);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/SplitUtil", "exitSplit", "(Landroid/app/Activity;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/SplitUtil", "exitSplit", "(Landroid/app/Activity;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (z17) {
            d(activity.getClass(), 0);
        }
    }

    public static boolean b(android.app.Activity activity) {
        if (!com.tencent.mm.ui.bk.w0() || android.os.Build.VERSION.SDK_INT < 30) {
            return false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(activity.isInMultiWindowMode());
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(((android.view.WindowManager) activity.getSystemService("window")).getCurrentWindowMetrics().getBounds().left > 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SplitUtil", "inSplit isRight:%s, inMultiWindowMode:%s", valueOf2, valueOf);
        return valueOf.booleanValue() && valueOf2.booleanValue();
    }

    public static void c() {
        if (f208602a == null) {
            f208602a = androidx.window.embedding.SplitController.INSTANCE.getInstance();
        }
    }

    public static void d(java.lang.Class cls, int i17) {
        if (com.tencent.mm.ui.bk.w0() && com.tencent.mm.ui.bk.y()) {
            if (f208602a == null) {
                c();
            }
            if (f208602a == null) {
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            f208603b = hashSet;
            hashSet.add(new androidx.window.embedding.ActivityFilter(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, cls != null ? cls.getName() : "*"), null));
            f208602a.registerRule(new androidx.window.embedding.ActivityRule(f208603b, i17 == 0));
        }
    }

    public static void e(java.lang.String str, int i17) {
        if (f208602a == null) {
            c();
        }
        if (f208602a == null) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        f208603b = hashSet;
        hashSet.add(new androidx.window.embedding.ActivityFilter(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, str), null));
        f208602a.registerRule(new androidx.window.embedding.ActivityRule(f208603b, i17 == 0));
    }

    public static void f(android.app.Activity activity, boolean z17) {
        g(activity, z17, true, null);
    }

    public static void g(android.app.Activity activity, boolean z17, boolean z18, com.tencent.mm.ui.ej ejVar) {
        if (com.tencent.mm.ui.bk.w0() && android.os.Build.VERSION.SDK_INT >= 26) {
            if (b(activity)) {
                a(activity, z17, z18);
                if (ejVar != null) {
                    ejVar.b();
                    return;
                }
                return;
            }
            i(activity, z17, z18);
            if (ejVar != null) {
                ejVar.a();
            }
        }
    }

    public static boolean h() {
        if (f208604c == null) {
            f208604c = java.lang.Boolean.FALSE;
            java.lang.String str = null;
            try {
                str = j62.e.g().a("clicfg_12l_support_device", "xiaomi, redmi, samsung, lenovo, nubia, zte, leiainc, centerm, chinaunicom, motorola, skyworth", false, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.SplitUtil", "supportDevice:%s", str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SplitUtil", e17, "split supportDevice", new java.lang.Object[0]);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                java.lang.String lowerCase = android.os.Build.BRAND.toLowerCase();
                for (java.lang.String str2 : str.split(",")) {
                    if (str2.contains(lowerCase)) {
                        if (lowerCase.equals("samsung")) {
                            if (android.os.Build.TIME > 1663862400000L) {
                                f208604c = java.lang.Boolean.TRUE;
                                com.tencent.mars.xlog.Log.i("MicroMsg.SplitUtil", "isSupportBrand!! samsung");
                            }
                        } else if (lowerCase.equals("lenovo")) {
                            if (android.os.Build.TIME > 1724092996000L && android.os.Build.VERSION.SDK_INT >= 34) {
                                f208604c = java.lang.Boolean.TRUE;
                                com.tencent.mars.xlog.Log.i("MicroMsg.SplitUtil", "isSupportBrand!! lenovo");
                            }
                        } else if (!lowerCase.equals("nubia") && !lowerCase.equals("zte") && !lowerCase.equals("leiainc")) {
                            f208604c = java.lang.Boolean.TRUE;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SplitUtil", "isSupportBrand!!");
                        } else if (android.os.Build.VERSION.SDK_INT >= 33) {
                            f208604c = java.lang.Boolean.TRUE;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SplitUtil", "isSupportBrand!! zhongxing");
                        }
                    }
                }
            }
        }
        return f208604c.booleanValue();
    }

    public static void i(android.app.Activity activity, boolean z17, boolean z18) {
        if (com.tencent.mm.ui.bk.w0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SplitUtil", "toSplit!! newTask:%s", java.lang.Boolean.valueOf(z17));
            if (f208602a == null) {
                c();
            }
            android.content.Intent intent = new android.content.Intent(activity.getIntent());
            if (z18) {
                activity.finish();
            }
            intent.addFlags(4096);
            if (z17) {
                j(activity.getClass(), 0);
                intent.addFlags(268435456);
                intent.addFlags(32768);
                if (fp.e0.g()) {
                    intent.addFlags(142606336);
                }
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("android:activity.enterSplitSideWithAdjacentFlag", 4);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bundle);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/SplitUtil", "toSplit", "(Landroid/app/Activity;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
            yj0.a.f(activity, "com/tencent/mm/ui/SplitUtil", "toSplit", "(Landroid/app/Activity;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        }
    }

    public static void j(java.lang.Class cls, int i17) {
        if (f208602a == null) {
            c();
        }
        if (f208602a == null) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        f208603b = hashSet;
        hashSet.add(new androidx.window.embedding.ActivityFilter(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, cls != null ? cls.getName() : "*"), null));
        f208602a.unregisterRule(new androidx.window.embedding.ActivityRule(f208603b, i17 == 0));
    }

    public static void k(java.lang.String str, int i17) {
        if (f208602a == null) {
            c();
        }
        if (f208602a == null) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        f208603b = hashSet;
        hashSet.add(new androidx.window.embedding.ActivityFilter(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, str), null));
        f208602a.unregisterRule(new androidx.window.embedding.ActivityRule(f208603b, i17 == 0));
    }
}
