package z2;

/* loaded from: classes13.dex */
public class e1 implements z2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Notification.Builder f469432a;

    /* renamed from: b, reason: collision with root package name */
    public final z2.k0 f469433b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f469434c;

    /* renamed from: d, reason: collision with root package name */
    public final int f469435d;

    public e1(z2.k0 k0Var) {
        java.lang.String str;
        android.app.Notification notification;
        java.util.ArrayList arrayList;
        int i17;
        java.util.ArrayList arrayList2;
        android.os.Bundle[] bundleArr;
        android.app.Notification notification2;
        java.lang.String str2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        z2.e1 e1Var = this;
        new java.util.ArrayList();
        e1Var.f469434c = new android.os.Bundle();
        e1Var.f469433b = k0Var;
        android.content.Context context = k0Var.f469457a;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            e1Var.f469432a = z2.a1.a(context, k0Var.f469482z);
        } else {
            e1Var.f469432a = new android.app.Notification.Builder(k0Var.f469457a);
        }
        android.app.Notification notification3 = k0Var.D;
        int i18 = 0;
        e1Var.f469432a.setWhen(notification3.when).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, null).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(k0Var.f469461e).setContentText(k0Var.f469462f).setContentInfo(null).setContentIntent(k0Var.f469463g).setDeleteIntent(notification3.deleteIntent).setFullScreenIntent(k0Var.f469464h, (notification3.flags & 128) != 0).setNumber(0).setProgress(k0Var.f469470n, k0Var.f469471o, k0Var.f469472p);
        android.app.Notification.Builder builder = e1Var.f469432a;
        androidx.core.graphics.drawable.IconCompat iconCompat = k0Var.f469465i;
        z2.y0.b(builder, iconCompat == null ? null : f3.e.f(iconCompat, context));
        z2.t0.b(z2.t0.d(z2.t0.c(e1Var.f469432a, k0Var.f469469m), false), k0Var.f469466j);
        java.util.Iterator it = k0Var.f469458b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (!it.hasNext()) {
                break;
            }
            z2.f0 f0Var = (z2.f0) it.next();
            androidx.core.graphics.drawable.IconCompat a17 = f0Var.a();
            android.app.Notification.Action.Builder a18 = z2.y0.a(a17 != null ? f3.e.f(a17, null) : null, f0Var.f469444i, f0Var.f469445j);
            z2.v1[] v1VarArr = f0Var.f469438c;
            if (v1VarArr != null) {
                android.app.RemoteInput[] remoteInputArr = new android.app.RemoteInput[v1VarArr.length];
                for (int i19 = 0; i19 < v1VarArr.length; i19++) {
                    remoteInputArr[i19] = z2.v1.a(v1VarArr[i19]);
                }
                for (android.app.RemoteInput remoteInput : remoteInputArr) {
                    z2.w0.c(a18, remoteInput);
                }
            }
            android.os.Bundle bundle = f0Var.f469436a;
            android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
            boolean z17 = f0Var.f469439d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z17);
            int i27 = android.os.Build.VERSION.SDK_INT;
            z2.z0.a(a18, z17);
            int i28 = f0Var.f469441f;
            bundle2.putInt("android.support.action.semanticAction", i28);
            if (i27 >= 28) {
                z2.b1.b(a18, i28);
            }
            if (i27 >= 29) {
                z2.c1.c(a18, f0Var.f469442g);
            }
            if (i27 >= 31) {
                z2.d1.a(a18, f0Var.f469446k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", f0Var.f469440e);
            z2.w0.b(a18, bundle2);
            z2.w0.a(e1Var.f469432a, z2.w0.d(a18));
        }
        android.os.Bundle bundle3 = k0Var.f469476t;
        if (bundle3 != null) {
            e1Var.f469434c.putAll(bundle3);
        }
        int i29 = android.os.Build.VERSION.SDK_INT;
        z2.u0.a(e1Var.f469432a, k0Var.f469467k);
        z2.w0.i(e1Var.f469432a, k0Var.f469474r);
        z2.w0.g(e1Var.f469432a, k0Var.f469473q);
        z2.w0.j(e1Var.f469432a, null);
        z2.w0.h(e1Var.f469432a, false);
        e1Var.f469435d = 0;
        z2.x0.b(e1Var.f469432a, k0Var.f469475s);
        z2.x0.c(e1Var.f469432a, k0Var.f469477u);
        z2.x0.f(e1Var.f469432a, k0Var.f469478v);
        z2.x0.d(e1Var.f469432a, null);
        z2.x0.e(e1Var.f469432a, notification3.sound, notification3.audioAttributes);
        java.util.ArrayList arrayList5 = k0Var.f469459c;
        java.util.ArrayList arrayList6 = k0Var.F;
        if (i29 < 28) {
            if (arrayList5 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new java.util.ArrayList(arrayList5.size());
                java.util.Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    z2.r1 r1Var = (z2.r1) it6.next();
                    java.lang.String str3 = r1Var.f469515c;
                    if (str3 == null) {
                        java.lang.CharSequence charSequence = r1Var.f469513a;
                        str3 = charSequence != null ? "name:" + ((java.lang.Object) charSequence) : "";
                    }
                    arrayList4.add(str3);
                }
            }
            if (arrayList4 != null) {
                if (arrayList6 != null) {
                    x.d dVar = new x.d(arrayList4.size() + arrayList6.size());
                    dVar.addAll(arrayList4);
                    dVar.addAll(arrayList6);
                    arrayList4 = new java.util.ArrayList(dVar);
                }
                arrayList6 = arrayList4;
            }
        }
        if (arrayList6 != null && !arrayList6.isEmpty()) {
            java.util.Iterator it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                z2.x0.a(e1Var.f469432a, (java.lang.String) it7.next());
            }
        }
        java.util.ArrayList arrayList7 = k0Var.f469460d;
        if (arrayList7.size() > 0) {
            if (k0Var.f469476t == null) {
                k0Var.f469476t = new android.os.Bundle();
            }
            android.os.Bundle bundle4 = k0Var.f469476t.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new android.os.Bundle() : bundle4;
            android.os.Bundle bundle5 = new android.os.Bundle(bundle4);
            android.os.Bundle bundle6 = new android.os.Bundle();
            int i37 = 0;
            while (i37 < arrayList7.size()) {
                java.lang.String num = java.lang.Integer.toString(i37);
                z2.f0 f0Var2 = (z2.f0) arrayList7.get(i37);
                java.lang.Object obj = z2.f1.f469447a;
                android.os.Bundle bundle7 = new android.os.Bundle();
                androidx.core.graphics.drawable.IconCompat a19 = f0Var2.a();
                bundle7.putInt("icon", a19 != null ? a19.f() : i18);
                bundle7.putCharSequence(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, f0Var2.f469444i);
                bundle7.putParcelable("actionIntent", f0Var2.f469445j);
                android.os.Bundle bundle8 = f0Var2.f469436a;
                android.os.Bundle bundle9 = bundle8 != null ? new android.os.Bundle(bundle8) : new android.os.Bundle();
                bundle9.putBoolean(str, f0Var2.f469439d);
                bundle7.putBundle("extras", bundle9);
                z2.v1[] v1VarArr2 = f0Var2.f469438c;
                if (v1VarArr2 == null) {
                    arrayList2 = arrayList7;
                    notification2 = notification3;
                    arrayList3 = arrayList5;
                    str2 = str;
                    bundleArr = null;
                } else {
                    arrayList2 = arrayList7;
                    bundleArr = new android.os.Bundle[v1VarArr2.length];
                    notification2 = notification3;
                    str2 = str;
                    int i38 = 0;
                    while (i38 < v1VarArr2.length) {
                        z2.v1 v1Var = v1VarArr2[i38];
                        z2.v1[] v1VarArr3 = v1VarArr2;
                        android.os.Bundle bundle10 = new android.os.Bundle();
                        java.util.ArrayList arrayList8 = arrayList5;
                        bundle10.putString("resultKey", v1Var.f469527a);
                        bundle10.putCharSequence("label", v1Var.f469528b);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", v1Var.f469529c);
                        bundle10.putBundle("extras", v1Var.f469530d);
                        java.util.Set set = v1Var.f469531e;
                        if (set != null && !set.isEmpty()) {
                            java.util.ArrayList<java.lang.String> arrayList9 = new java.util.ArrayList<>(set.size());
                            java.util.Iterator it8 = set.iterator();
                            while (it8.hasNext()) {
                                arrayList9.add((java.lang.String) it8.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList9);
                        }
                        bundleArr[i38] = bundle10;
                        i38++;
                        v1VarArr2 = v1VarArr3;
                        arrayList5 = arrayList8;
                    }
                    arrayList3 = arrayList5;
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", f0Var2.f469440e);
                bundle7.putInt("semanticAction", f0Var2.f469441f);
                bundle6.putBundle(num, bundle7);
                i37++;
                i18 = 0;
                arrayList7 = arrayList2;
                str = str2;
                notification3 = notification2;
                arrayList5 = arrayList3;
            }
            notification = notification3;
            arrayList = arrayList5;
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (k0Var.f469476t == null) {
                k0Var.f469476t = new android.os.Bundle();
            }
            k0Var.f469476t.putBundle("android.car.EXTENSIONS", bundle4);
            e1Var = this;
            e1Var.f469434c.putBundle("android.car.EXTENSIONS", bundle5);
        } else {
            notification = notification3;
            arrayList = arrayList5;
        }
        int i39 = android.os.Build.VERSION.SDK_INT;
        z2.v0.a(e1Var.f469432a, k0Var.f469476t);
        z2.z0.e(e1Var.f469432a, null);
        android.widget.RemoteViews remoteViews = k0Var.f469479w;
        if (remoteViews != null) {
            z2.z0.c(e1Var.f469432a, remoteViews);
        }
        android.widget.RemoteViews remoteViews2 = k0Var.f469480x;
        if (remoteViews2 != null) {
            z2.z0.b(e1Var.f469432a, remoteViews2);
        }
        android.widget.RemoteViews remoteViews3 = k0Var.f469481y;
        if (remoteViews3 != null) {
            z2.z0.d(e1Var.f469432a, remoteViews3);
        }
        if (i39 >= 26) {
            z2.a1.b(e1Var.f469432a, 0);
            z2.a1.e(e1Var.f469432a, null);
            z2.a1.f(e1Var.f469432a, null);
            z2.a1.g(e1Var.f469432a, k0Var.A);
            z2.a1.d(e1Var.f469432a, 0);
            if (!android.text.TextUtils.isEmpty(k0Var.f469482z)) {
                e1Var.f469432a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i39 >= 28) {
            java.util.Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                z2.r1 r1Var2 = (z2.r1) it9.next();
                android.app.Notification.Builder builder2 = e1Var.f469432a;
                r1Var2.getClass();
                z2.b1.a(builder2, z2.p1.b(r1Var2));
            }
        }
        int i47 = android.os.Build.VERSION.SDK_INT;
        if (i47 >= 29) {
            z2.c1.a(e1Var.f469432a, k0Var.C);
            z2.c1.b(e1Var.f469432a, null);
        }
        if (i47 >= 31 && (i17 = k0Var.B) != 0) {
            z2.d1.b(e1Var.f469432a, i17);
        }
        if (k0Var.E) {
            e1Var.f469433b.getClass();
            e1Var.f469435d = 1;
            e1Var.f469432a.setVibrate(null);
            e1Var.f469432a.setSound(null);
            android.app.Notification notification4 = notification;
            int i48 = notification4.defaults & (-2) & (-3);
            notification4.defaults = i48;
            e1Var.f469432a.setDefaults(i48);
            if (i47 >= 26) {
                if (android.text.TextUtils.isEmpty(e1Var.f469433b.f469473q)) {
                    z2.w0.g(e1Var.f469432a, "silent");
                }
                z2.a1.d(e1Var.f469432a, 1);
            }
        }
    }
}
