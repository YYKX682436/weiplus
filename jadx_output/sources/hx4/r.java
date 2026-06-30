package hx4;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final hx4.r f285691a = new hx4.r();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.pluginsdk.model.y3 f285692b;

    public static final android.content.Intent a(android.content.Context context, android.content.Intent intent, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("target_url", str);
        bundle.putParcelable("target_intent", intent);
        if (intent != null) {
            intent.putExtra("targeturl", str);
        }
        if (intent != null) {
            intent.putExtra("show_browser_setting_entry", z17);
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(context, com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI.class);
        intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
        intent2.putExtra("targetintent", intent);
        intent2.putExtra("transferback", bundle);
        return intent2;
    }

    public static final java.lang.String c(android.content.Context context, android.content.pm.ResolveInfo resolveInfo) {
        java.lang.String str;
        java.lang.String obj;
        kotlin.jvm.internal.o.g(context, "context");
        if (resolveInfo == null) {
            return "";
        }
        java.lang.CharSequence loadLabel = resolveInfo.activityInfo.loadLabel(context.getPackageManager());
        if (loadLabel == null || (str = loadLabel.toString()) == null) {
            str = "";
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\(.*推荐.*\\)", 2).matcher(str);
        if (!matcher.find()) {
            return r26.n0.u0(str).toString();
        }
        java.lang.String replaceAll = matcher.replaceAll("");
        return (replaceAll == null || (obj = r26.n0.u0(replaceAll).toString()) == null) ? "" : obj;
    }

    public static final android.graphics.drawable.Drawable d(android.content.Context context, android.content.pm.ResolveInfo resolveInfo) {
        android.content.pm.PackageManager packageManager;
        android.graphics.drawable.Drawable drawable;
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.drawable.Drawable drawable2 = null;
        if (resolveInfo == null || (packageManager = context.getPackageManager()) == null) {
            return null;
        }
        try {
            java.lang.String str = resolveInfo.resolvePackageName;
            if (str != null && resolveInfo.icon != 0) {
                android.content.res.Resources resourcesForApplication = packageManager.getResourcesForApplication(str);
                kotlin.jvm.internal.o.f(resourcesForApplication, "getResourcesForApplication(...)");
                try {
                    drawable = j65.j.h(resourcesForApplication, resolveInfo.icon);
                } catch (android.content.res.Resources.NotFoundException unused) {
                    drawable = null;
                }
                if (drawable != null) {
                    return drawable;
                }
            }
            int iconResource = resolveInfo.getIconResource();
            if (iconResource != 0) {
                android.content.res.Resources resourcesForApplication2 = packageManager.getResourcesForApplication(resolveInfo.activityInfo.packageName);
                kotlin.jvm.internal.o.f(resourcesForApplication2, "getResourcesForApplication(...)");
                try {
                    drawable2 = j65.j.h(resourcesForApplication2, iconResource);
                } catch (android.content.res.Resources.NotFoundException unused2) {
                }
                if (drawable2 != null) {
                    return drawable2;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrowserChooseDialogHelper", "Couldn't find resources for package", e17);
        }
        return resolveInfo.loadIcon(packageManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(android.content.Context context, android.content.Intent intent, android.content.pm.ResolveInfo resolveInfo) {
        java.lang.String stringExtra;
        android.content.pm.ActivityInfo activityInfo;
        android.content.pm.ActivityInfo activityInfo2;
        android.net.Uri data;
        android.content.pm.ActivityInfo activityInfo3;
        java.lang.String str = null;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("targeturl");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BrowserChooseDialogHelper", e17, "onBrowserItemClick exception", new java.lang.Object[0]);
                return;
            }
        } else {
            stringExtra = null;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = (resolveInfo == null || (activityInfo3 = resolveInfo.activityInfo) == null) ? null : activityInfo3.packageName;
        objArr[1] = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
        objArr[2] = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseDialogHelper", "openInBrowser package: %s, uri: %s, url: %s", objArr);
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
        com.tencent.mm.pluginsdk.model.y3 b17 = com.tencent.mm.pluginsdk.model.z3.a().b(0, null);
        if (b17.h((resolveInfo == null || (activityInfo2 = resolveInfo.activityInfo) == null) ? null : activityInfo2.packageName)) {
            ((com.tencent.mm.pluginsdk.model.t3) ((jt.y) b17)).s(context, stringExtra);
            return;
        }
        if (intent != null) {
            intent.addFlags(524288);
            if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null) {
                str = activityInfo.packageName;
            }
            if (str == null) {
                str = "";
            }
            intent.setPackage(str);
        } else {
            intent = null;
        }
        if (fp.h.c(29)) {
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(134217728));
            if (activity != null) {
                activity.send(context, 1, null, hx4.q.f285690a, null);
                return;
            }
            return;
        }
        if (context != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/browser/BrowserChooseDialogHelper", "openInBrowser", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/pm/ResolveInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/browser/BrowserChooseDialogHelper", "openInBrowser", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/pm/ResolveInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public final java.util.List b(java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.content.pm.ApplicationInfo applicationInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) it.next();
                if (resolveInfo != null) {
                    android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if ((((activityInfo == null || (applicationInfo = activityInfo.applicationInfo) == null) ? 0 : applicationInfo.flags) & 1) > 0) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        objArr[0] = activityInfo != null ? activityInfo.packageName : null;
                        com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseDialogHelper", "filterBrowserList package: %s is system application", objArr);
                        arrayList3.add(resolveInfo);
                    } else {
                        java.util.HashSet hashSet = hx4.u.f285694a;
                        java.lang.String str4 = activityInfo != null ? activityInfo.packageName : null;
                        java.util.HashSet hashSet2 = hx4.u.f285694a;
                        if (str4 != null) {
                            str = str4.toLowerCase();
                            kotlin.jvm.internal.o.f(str, "toLowerCase(...)");
                        } else {
                            str = null;
                        }
                        if (kz5.n0.O(hashSet2, str)) {
                            android.content.pm.ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                            java.lang.String str5 = activityInfo2 != null ? activityInfo2.packageName : null;
                            if (f285692b == null) {
                                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
                                f285692b = com.tencent.mm.pluginsdk.model.z3.a().b(0, null);
                            }
                            com.tencent.mm.pluginsdk.model.y3 y3Var = f285692b;
                            kotlin.jvm.internal.o.d(y3Var);
                            if (str5 != null) {
                                str2 = str5.toLowerCase();
                                kotlin.jvm.internal.o.f(str2, "toLowerCase(...)");
                            } else {
                                str2 = null;
                            }
                            if (y3Var.h(str2)) {
                                arrayList4.add(resolveInfo);
                            } else {
                                arrayList2.add(resolveInfo);
                            }
                        } else {
                            if (hx4.u.f285695b) {
                                android.content.pm.ActivityInfo activityInfo3 = resolveInfo.activityInfo;
                                java.lang.String str6 = activityInfo3 != null ? activityInfo3.packageName : null;
                                java.util.HashSet hashSet3 = hx4.u.f285696c;
                                if (str6 != null) {
                                    str3 = str6.toLowerCase();
                                    kotlin.jvm.internal.o.f(str3, "toLowerCase(...)");
                                } else {
                                    str3 = null;
                                }
                                if (kz5.n0.O(hashSet3, str3)) {
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    android.content.pm.ActivityInfo activityInfo4 = resolveInfo.activityInfo;
                                    objArr2[0] = activityInfo4 != null ? activityInfo4.packageName : null;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseDialogHelper", "filterBrowserList package: %s is in block list", objArr2);
                                }
                            }
                            arrayList.add(resolveInfo);
                        }
                    }
                }
            }
        }
        arrayList.addAll(0, arrayList3);
        arrayList.addAll(arrayList3.size(), arrayList4);
        arrayList.addAll(arrayList3.size() + arrayList4.size(), arrayList2);
        java.lang.Object[] objArr3 = new java.lang.Object[5];
        objArr3[0] = list != null ? java.lang.Integer.valueOf(list.size()) : null;
        objArr3[1] = java.lang.Integer.valueOf(arrayList.size());
        objArr3[2] = java.lang.Integer.valueOf(arrayList3.size());
        objArr3[3] = java.lang.Integer.valueOf(arrayList4.size());
        objArr3[4] = java.lang.Integer.valueOf(arrayList2.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseDialogHelper", "filterBrowserList resolveList: %s, finalList: %s, systemBrowserCount: %d, qqBrowserList: %s, filteredAllowList: %s", objArr3);
        return arrayList;
    }

    public final android.content.Intent f(android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        java.lang.String uri = data != null ? data.toString() : null;
        if ((uri == null || uri.length() == 0) || !(r26.i0.A(uri, "https://view.inews.qq.com", false, 2, null) || r26.i0.y(uri, "http://view.inews.qq.com", false))) {
            return intent;
        }
        android.content.Intent intent2 = new android.content.Intent(intent);
        intent2.setData(android.net.Uri.parse("https://mp.weixin.qq.com"));
        return intent2;
    }
}
