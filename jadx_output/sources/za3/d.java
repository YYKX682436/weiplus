package za3;

/* loaded from: classes8.dex */
public class d implements z80.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f470900a;

    public d(android.content.Context context) {
        this.f470900a = context;
    }

    public final android.content.Intent a(android.content.Context context, com.tencent.mm.plugin.location.model.LocationInfo locationInfo, com.tencent.mm.plugin.location.model.LocationInfo locationInfo2, boolean z17) {
        if (z17 || !locationInfo2.a()) {
            double[] a17 = va3.w.a(new double[]{locationInfo.f144587f, locationInfo.f144586e});
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", a17.length < 2 ? android.net.Uri.parse(java.lang.String.format("geo:%s,%s?z=%s", java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f), java.lang.Integer.valueOf(locationInfo.f144588g))) : android.net.Uri.parse(java.lang.String.format("geo:%s,%s?z=%s", java.lang.Double.valueOf(a17[1]), java.lang.Double.valueOf(a17[0]), java.lang.Integer.valueOf(locationInfo.f144588g))));
            intent.setPackage("com.baidu.BaiduMap");
            return intent;
        }
        java.lang.String c17 = c(context, locationInfo2);
        java.lang.String format = !com.tencent.mm.sdk.platformtools.t8.K0(c17) ? java.lang.String.format("name:%s|latlng:%f,%f", c17, java.lang.Double.valueOf(locationInfo2.f144586e), java.lang.Double.valueOf(locationInfo2.f144587f)) : java.lang.String.format("%f,%f", java.lang.Double.valueOf(locationInfo2.f144586e), java.lang.Double.valueOf(locationInfo2.f144587f));
        java.lang.String c18 = c(context, locationInfo);
        java.lang.String format2 = java.lang.String.format("intent://map/direction?origin=%s&destination=%s&mode=recommend&coord_type=gcj02", format, !com.tencent.mm.sdk.platformtools.t8.K0(c18) ? java.lang.String.format("name:%s|latlng:%f,%f", c18, java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f)) : java.lang.String.format("%f,%f", java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f)));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144594p)) {
            format2 = format2 + java.lang.String.format("&destination_uid=%s", locationInfo.f144594p);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MapHelper", "url " + format2);
        try {
            return android.content.Intent.getIntent(format2 + "&referer=tencent|weixin#Intent;scheme=bdapp;package=com.baidu.BaiduMap;end");
        } catch (java.net.URISyntaxException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MapHelper", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final android.content.Intent b(android.content.Context context, com.tencent.mm.plugin.location.model.LocationInfo locationInfo, com.tencent.mm.plugin.location.model.LocationInfo locationInfo2, boolean z17, java.lang.String str) {
        if (z17 || !locationInfo2.a()) {
            double[] a17 = va3.w.a(new double[]{locationInfo.f144587f, locationInfo.f144586e});
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", a17.length < 2 ? android.net.Uri.parse(java.lang.String.format("geo:%s,%s?z=%s", java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f), java.lang.Integer.valueOf(locationInfo.f144588g))) : android.net.Uri.parse(java.lang.String.format("geo:%s,%s?z=%s", java.lang.Double.valueOf(a17[1]), java.lang.Double.valueOf(a17[0]), java.lang.Integer.valueOf(locationInfo.f144588g))));
            intent.setPackage(str);
            return intent;
        }
        java.lang.String format = java.lang.String.format("wechatnav://type=nav&fromcoord=%f,%f&tocoord=%f,%f", java.lang.Double.valueOf(locationInfo2.f144586e), java.lang.Double.valueOf(locationInfo2.f144587f), java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(locationInfo2.f144589h) && (!com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144589h) || !com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144591m))) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(format);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = locationInfo2.f144589h;
            objArr[1] = !com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144591m) ? locationInfo.f144591m : locationInfo.f144589h;
            sb6.append(java.lang.String.format("&from=%s&to=%s", objArr));
            format = sb6.toString();
        }
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(format));
        intent2.setPackage(str);
        if (com.tencent.mm.sdk.platformtools.t8.I0(context, intent2, false, false)) {
            return intent2;
        }
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("geo:" + locationInfo.f144586e + "," + locationInfo.f144587f));
        intent3.setPackage(str);
        return intent3;
    }

    public final java.lang.String c(android.content.Context context, com.tencent.mm.plugin.location.model.LocationInfo locationInfo) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144591m) || locationInfo.f144591m.equals(context.getString(com.tencent.mm.R.string.ggg))) ? !com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144589h) ? locationInfo.f144589h : "" : locationInfo.f144591m;
    }

    public java.util.Map d(com.tencent.mm.plugin.location.model.LocationInfo locationInfo) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("com.tencent.map");
        arrayList.add("com.google.android.apps.maps");
        arrayList.add("com.baidu.BaiduMap");
        arrayList.add("com.autonavi.minimap");
        arrayList.add("com.sogou.map.android.maps");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(java.lang.String.format("geo:%f,%f", java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f))));
        android.content.Context context = this.f470900a;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (android.content.pm.ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
            if (arrayList.contains(resolveInfo.activityInfo.packageName)) {
                android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
                hashMap.put(activityInfo.packageName, activityInfo.loadLabel(context.getPackageManager()).toString());
            }
        }
        return hashMap;
    }

    public java.util.List e(com.tencent.mm.plugin.location.model.LocationInfo locationInfo, boolean z17, boolean z18) {
        android.content.pm.ResolveInfo resolveInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("com.baidu.BaiduMap");
        arrayList.add("com.autonavi.minimap");
        arrayList.add("com.google.android.apps.maps");
        arrayList.add("com.sogou.map.android.maps");
        if (z17) {
            arrayList.add(0, "com.tencent.map");
        } else {
            arrayList.add("com.tencent.map");
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(java.lang.String.format("geo:%f,%f", java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f))));
        android.content.Context context = this.f470900a;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (z18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            for (android.content.pm.ResolveInfo resolveInfo2 : queryIntentActivities) {
                hashMap.put(resolveInfo2.activityInfo.packageName, resolveInfo2);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (hashMap.containsKey(str) && (resolveInfo = (android.content.pm.ResolveInfo) hashMap.get(str)) != null) {
                    arrayList2.add(new com.tencent.mm.plugin.location.ui.impl.f0(false, false, resolveInfo.activityInfo.loadLabel(context.getPackageManager()).toString(), null, resolveInfo.activityInfo.packageName, resolveInfo.loadIcon(packageManager), null));
                }
            }
        } else {
            for (android.content.pm.ResolveInfo resolveInfo3 : queryIntentActivities) {
                if (arrayList.contains(resolveInfo3.activityInfo.packageName)) {
                    arrayList2.add(new com.tencent.mm.plugin.location.ui.impl.f0(false, false, resolveInfo3.activityInfo.loadLabel(context.getPackageManager()).toString(), null, resolveInfo3.activityInfo.packageName, resolveInfo3.loadIcon(packageManager), null));
                }
            }
        }
        return arrayList2;
    }

    public final android.content.Intent f(android.content.Context context, com.tencent.mm.plugin.location.model.LocationInfo locationInfo, com.tencent.mm.plugin.location.model.LocationInfo locationInfo2, boolean z17) {
        if (z17 || !locationInfo2.a()) {
            double[] a17 = va3.w.a(new double[]{locationInfo.f144587f, locationInfo.f144586e});
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", a17.length < 2 ? android.net.Uri.parse(java.lang.String.format("geo:%s,%s?z=%s", java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f), java.lang.Integer.valueOf(locationInfo.f144588g))) : android.net.Uri.parse(java.lang.String.format("geo:%s,%s?z=%s", java.lang.Double.valueOf(a17[1]), java.lang.Double.valueOf(a17[0]), java.lang.Integer.valueOf(locationInfo.f144588g))));
            intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
            return intent;
        }
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(java.lang.String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=" + (com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144590i) ? "zh-cn" : locationInfo.f144590i), java.lang.Double.valueOf(locationInfo2.f144586e), java.lang.Double.valueOf(locationInfo2.f144587f), java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f))));
        intent2.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        return intent2;
    }

    public void g(com.tencent.mm.plugin.location.model.LocationInfo locationInfo, com.tencent.mm.plugin.location.model.LocationInfo locationInfo2, java.lang.String str, boolean z17, boolean z18) {
        android.content.pm.PackageInfo c17;
        android.content.Intent i17;
        if ("com.tencent.map".equals(str)) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11091, 4, 2);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11091, 4, 1);
            }
        } else if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11091, 5, 2);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11091, 5, 1);
        }
        android.content.Context context = this.f470900a;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if ("com.google.android.apps.maps".equals(str)) {
            i17 = f(context, locationInfo, locationInfo2, false);
            if (!com.tencent.mm.sdk.platformtools.t8.I0(context, i17, false, false)) {
                i17 = f(context, locationInfo, locationInfo2, true);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "4", "", 0, 0);
        } else if ("com.baidu.BaiduMap".equals(str)) {
            i17 = a(context, locationInfo, locationInfo2, false);
            if (!com.tencent.mm.sdk.platformtools.t8.I0(context, i17, false, false)) {
                i17 = a(context, locationInfo, locationInfo2, true);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "5", va3.w.c(context, "com.baidu.BaiduMap").applicationInfo.loadLabel(packageManager).toString(), 0, 0);
        } else if ("com.tencent.map".equals(str)) {
            i17 = h(this.f470900a, locationInfo, locationInfo2, false, z18);
            if (!com.tencent.mm.sdk.platformtools.t8.I0(context, i17, false, false)) {
                i17 = h(this.f470900a, locationInfo, locationInfo2, true, z18);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "2", "", 0, 0);
        } else if ("com.autonavi.minimap".equals(str)) {
            android.content.pm.PackageInfo c18 = va3.w.c(context, str);
            if (c18 != null) {
                i17 = b(this.f470900a, locationInfo, locationInfo2, false, str);
                if (!com.tencent.mm.sdk.platformtools.t8.I0(context, i17, false, false)) {
                    i17 = b(this.f470900a, locationInfo, locationInfo2, true, str);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "5", c18.applicationInfo.loadLabel(packageManager).toString(), 0, 0);
            }
            i17 = null;
        } else {
            if ("com.sogou.map.android.maps".equals(str) && (c17 = va3.w.c(context, str)) != null) {
                i17 = i(this.f470900a, locationInfo, locationInfo2, false, str);
                if (!com.tencent.mm.sdk.platformtools.t8.I0(context, i17, false, false)) {
                    i17 = i(this.f470900a, locationInfo, locationInfo2, true, str);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, "5", c17.applicationInfo.loadLabel(packageManager).toString(), 0, 0);
            }
            i17 = null;
        }
        if (i17 != null) {
            i17.addFlags(268435456);
            android.content.Context context2 = this.f470900a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(i17);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public final android.content.Intent h(android.content.Context context, com.tencent.mm.plugin.location.model.LocationInfo locationInfo, com.tencent.mm.plugin.location.model.LocationInfo locationInfo2, boolean z17, boolean z18) {
        if (z17 || !(z18 || locationInfo2.a())) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("geo:" + locationInfo.f144586e + "," + locationInfo.f144587f + "?z=" + locationInfo.f144588g));
            intent.setPackage("com.tencent.map");
            return intent;
        }
        java.lang.String str = locationInfo.f144594p;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && locationInfo.f144594p.startsWith("qqmap_")) {
            str = locationInfo.f144594p.substring(6);
        }
        java.lang.String format = java.lang.String.format("qqmap://map/routeplan/type=drive&touid=%s&tocoord=%f,%f&from=%s&to=%s&referer=wx_client", str, java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f), java.net.URLEncoder.encode(c(context, locationInfo2)), java.net.URLEncoder.encode(c(context, locationInfo)));
        com.tencent.mars.xlog.Log.i("MicroMsg.MapHelper", "tencentluxian, url=%s", format);
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(format));
        intent2.setPackage("com.tencent.map");
        if (com.tencent.mm.sdk.platformtools.t8.I0(context, intent2, false, false)) {
            return intent2;
        }
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("geo:" + locationInfo.f144586e + "," + locationInfo.f144587f));
        intent3.setPackage("com.tencent.map");
        return intent3;
    }

    public final android.content.Intent i(android.content.Context context, com.tencent.mm.plugin.location.model.LocationInfo locationInfo, com.tencent.mm.plugin.location.model.LocationInfo locationInfo2, boolean z17, java.lang.String str) {
        if (z17 || !locationInfo2.a()) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("geo:" + locationInfo.f144586e + "," + locationInfo.f144587f + "?z=" + locationInfo.f144588g));
            intent.setPackage(str);
            return intent;
        }
        java.lang.String format = java.lang.String.format("wechatnav://type=nav&fromcoord=%f,%f&tocoord=%f,%f", java.lang.Double.valueOf(locationInfo2.f144586e), java.lang.Double.valueOf(locationInfo2.f144587f), java.lang.Double.valueOf(locationInfo.f144586e), java.lang.Double.valueOf(locationInfo.f144587f));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(locationInfo2.f144589h) && !com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144589h)) {
            format = format + java.lang.String.format("&from=%s&to=%s", locationInfo2.f144589h, locationInfo.f144589h);
        }
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(format));
        intent2.setPackage(str);
        if (com.tencent.mm.sdk.platformtools.t8.I0(context, intent2, false, false)) {
            return intent2;
        }
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("geo:" + locationInfo.f144586e + "," + locationInfo.f144587f));
        intent3.setPackage(str);
        return intent3;
    }
}
