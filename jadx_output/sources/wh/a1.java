package wh;

/* loaded from: classes12.dex */
public class a1 implements wh.a2 {
    @Override // wh.a2
    public java.lang.Object a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return null;
    }

    @Override // wh.a2
    public void b(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Object obj = null;
        if ("createNotificationChannels".equals(method.getName())) {
            if (objArr != null) {
                for (java.lang.Object obj2 : objArr) {
                    if (obj2 != null && obj2.getClass().getName().equals("android.content.pm.ParceledListSlice")) {
                        try {
                            java.lang.reflect.Method declaredMethod = obj2.getClass().getDeclaredMethod("getList", new java.lang.Class[0]);
                            if (declaredMethod != null) {
                                java.lang.Object invoke = declaredMethod.invoke(obj2, new java.lang.Object[0]);
                                if (invoke instanceof java.lang.Iterable) {
                                    java.util.Iterator it = ((java.lang.Iterable) invoke).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        java.lang.Object next = it.next();
                                        if (next != null && next.getClass().getName().equals("android.app.NotificationChannel")) {
                                            obj = next;
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            oj.j.f("Matrix.battery.NotificationHooker", "try parse args fail: " + e17.getMessage(), new java.lang.Object[0]);
                        }
                    }
                }
            }
            java.util.Iterator it6 = ((java.util.ArrayList) wh.c1.f445749a).iterator();
            while (it6.hasNext()) {
                ((rh.f3) ((wh.b1) it6.next())).getClass();
                if (android.os.Build.VERSION.SDK_INT >= 26 && (obj instanceof android.app.NotificationChannel)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#onCreateNotificationChannel, id = ");
                    android.app.NotificationChannel notificationChannel = (android.app.NotificationChannel) obj;
                    sb6.append(notificationChannel.getId());
                    sb6.append(", name = ");
                    sb6.append((java.lang.Object) notificationChannel.getName());
                    oj.j.c("Matrix.battery.NotificationMonitorFeature", sb6.toString(), new java.lang.Object[0]);
                }
            }
            return;
        }
        if ("enqueueNotificationWithTag".equals(method.getName())) {
            int i17 = -1;
            android.app.Notification notification = null;
            for (java.lang.Object obj3 : objArr) {
                if (obj3 instanceof java.lang.Integer) {
                    if (i17 == -1) {
                        i17 = ((java.lang.Integer) obj3).intValue();
                    }
                } else if (obj3 instanceof android.app.Notification) {
                    notification = (android.app.Notification) obj3;
                }
            }
            java.util.Iterator it7 = ((java.util.ArrayList) wh.c1.f445749a).iterator();
            while (it7.hasNext()) {
                rh.f3 f3Var = (rh.f3) ((wh.b1) it7.next());
                f3Var.getClass();
                if (notification != null) {
                    java.lang.String string = notification.extras.getString("android.title", null);
                    java.lang.String string2 = notification.extras.getString("android.text", null);
                    oj.j.c("Matrix.battery.NotificationMonitorFeature", "#onCreateNotification, id = " + i17 + ", title = " + string + ", text = " + string2, new java.lang.Object[0]);
                    boolean isEmpty = android.text.TextUtils.isEmpty(string2);
                    rh.j3 j3Var = f3Var.f395389a;
                    if (isEmpty) {
                        oj.j.f("Matrix.battery.NotificationMonitorFeature", "notify with empty text!", new java.lang.Object[0]);
                        j3Var.k(string, "");
                    } else if (string2.equals(j3Var.f395427c)) {
                        oj.j.f("Matrix.battery.NotificationMonitorFeature", "notify with appRunningText: ".concat(string2), new java.lang.Object[0]);
                        j3Var.k(string, string2);
                    }
                }
            }
        }
    }
}
