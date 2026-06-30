package mo3;

/* loaded from: classes11.dex */
public abstract class e {
    public static void a(android.content.Context context, android.app.NotificationManager notificationManager, java.lang.String str, boolean z17, boolean z18, boolean z19, boolean z27, android.content.SharedPreferences sharedPreferences) {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(str, context.getString(com.tencent.mm.R.string.f492645hb5), 4);
        notificationChannel.setDescription(context.getString(com.tencent.mm.R.string.f492644hb4));
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-16711936);
        notificationChannel.setVibrationPattern(com.tencent.mm.sdk.platformtools.t8.f192990b);
        if (z17) {
            notificationChannel.enableVibration(true);
        } else {
            notificationChannel.enableVibration(z19);
        }
        if (z17) {
            if (z27) {
                java.lang.String string = sharedPreferences.getString("settings.ringtone", null);
                if (d(string)) {
                    notificationChannel.setSound(android.net.Uri.parse(string), android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
            }
        } else if (z18) {
            if (z27) {
                java.lang.String string2 = sharedPreferences.getString("settings.ringtone", null);
                if (d(string2)) {
                    notificationChannel.setSound(android.net.Uri.parse(string2), android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
            } else {
                notificationChannel.setSound(android.provider.Settings.System.DEFAULT_NOTIFICATION_URI, android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        sharedPreferences.edit().putString("message_channel_id", str).commit();
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void b(android.content.Context context, android.app.NotificationManager notificationManager, java.lang.String str, boolean z17, boolean z18, android.content.SharedPreferences sharedPreferences) {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(str, context.getString(com.tencent.mm.R.string.f492645hb5), 4);
        notificationChannel.setDescription(context.getString(com.tencent.mm.R.string.f492644hb4));
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-16711936);
        notificationChannel.setVibrationPattern(com.tencent.mm.sdk.platformtools.t8.f192990b);
        notificationChannel.enableVibration(z17);
        if (z18) {
            java.lang.String string = sharedPreferences.getString("settings.ringtone", null);
            if (d(string)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NotificationManufacturerCompatibility", "sound = %s", android.net.Uri.parse(string));
                notificationChannel.setSound(android.net.Uri.parse(string), android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        sharedPreferences.edit().putString("message_channel_id", str).commit();
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static boolean c(android.content.Context context, android.app.NotificationManager notificationManager, boolean z17, boolean z18, android.content.SharedPreferences sharedPreferences) {
        boolean startsWith = u75.b.a().startsWith("emotionui_8");
        boolean startsWith2 = u75.b.a().startsWith("emotionui_9");
        boolean z19 = false;
        if (!startsWith && !startsWith2) {
            return false;
        }
        java.lang.String a17 = n25.a.a();
        android.app.NotificationChannel e17 = e(notificationManager, a17);
        if (e17 == null) {
            a(context, notificationManager, a17, startsWith, startsWith2, z17, z18, sharedPreferences);
        } else {
            if (startsWith && (!e17.shouldVibrate() || e17.getSound() == null)) {
                z19 = true;
            }
            if (z19) {
                try {
                    if (e17.getSound() != null) {
                        java.lang.String uri = e17.getSound().toString();
                        ip.b.v().edit().putString("settings.ringtone", uri).commit();
                        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", uri);
                    }
                    notificationManager.deleteNotificationChannel(e17.getId());
                    a(context, notificationManager, "message_channel_compatibility_id", startsWith, startsWith2, z17, z18, sharedPreferences);
                    n25.a.f334317a = "message_channel_compatibility_id";
                    ip.b.f293546b = "message_channel_compatibility_id";
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NotificationManufacturerCompatibility", "huaweiNotificationCompatibility exception:%s", e18.getMessage());
                }
            } else {
                a(context, notificationManager, a17, startsWith, startsWith2, z17, z18, sharedPreferences);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(java.lang.String r7) {
        /*
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            r1 = 1
            java.lang.String r2 = "MicroMsg.NotificationManufacturerCompatibility"
            r3 = 0
            if (r0 != 0) goto L55
            android.net.Uri r0 = android.net.Uri.parse(r7)
            android.content.Context r4 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37 java.lang.SecurityException -> L39 java.lang.NullPointerException -> L3b
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37 java.lang.SecurityException -> L39 java.lang.NullPointerException -> L3b
            java.lang.String r5 = "r"
            android.content.res.AssetFileDescriptor r4 = r4.openAssetFileDescriptor(r0, r5)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37 java.lang.SecurityException -> L39 java.lang.NullPointerException -> L3b
            to.g r5 = new to.g     // Catch: java.lang.Throwable -> L29
            r5.<init>()     // Catch: java.lang.Throwable -> L29
            r5.setDataSource(r4)     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L27
            r4.close()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37 java.lang.SecurityException -> L39 java.lang.NullPointerException -> L3b
        L27:
            r0 = r1
            goto L56
        L29:
            r5 = move-exception
            if (r4 == 0) goto L34
            r4.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37 java.lang.SecurityException -> L39 java.lang.NullPointerException -> L3b
        L34:
            throw r5     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37 java.lang.SecurityException -> L39 java.lang.NullPointerException -> L3b
        L35:
            r7 = move-exception
            throw r7
        L37:
            r4 = move-exception
            goto L3c
        L39:
            r4 = move-exception
            goto L3c
        L3b:
            r4 = move-exception
        L3c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Couldn't open "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ": "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            com.tencent.mars.xlog.Log.w(r2, r0)
        L55:
            r0 = r3
        L56:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            if (r7 != 0) goto L5d
            java.lang.String r7 = "null"
        L5d:
            r4[r3] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r4[r1] = r7
            java.lang.String r7 = "sound = %s result = %s"
            com.tencent.mars.xlog.Log.e(r2, r7, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mo3.e.d(java.lang.String):boolean");
    }

    public static android.app.NotificationChannel e(android.app.NotificationManager notificationManager, java.lang.String str) {
        java.util.List<android.app.NotificationChannel> notificationChannels;
        try {
            notificationChannels = notificationManager.getNotificationChannels();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NotificationManufacturerCompatibility", "deleteNoNumberNotification exception:%s", e17.getMessage());
        }
        if (notificationChannels == null || notificationChannels.size() < 1) {
            return null;
        }
        for (android.app.NotificationChannel notificationChannel : notificationChannels) {
            if (notificationChannel != null && notificationChannel.getId() != null && com.tencent.mm.sdk.platformtools.t8.D0(notificationChannel.getId(), str)) {
                return notificationChannel;
            }
        }
        return null;
    }

    public static boolean f(android.content.Context context, android.app.NotificationManager notificationManager, boolean z17, boolean z18, android.content.SharedPreferences sharedPreferences) {
        if (!u75.d.c()) {
            return false;
        }
        java.lang.String a17 = n25.a.a();
        android.app.NotificationChannel e17 = e(notificationManager, a17);
        if (e17 == null) {
            b(context, notificationManager, a17, z17, z18, sharedPreferences);
            return true;
        }
        c01.qd.c(lp0.b.e());
        java.lang.String a18 = c01.qd.a(2);
        java.lang.String[] split = a18.split(";");
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationManufacturerCompatibility", "xiaomiNotificationCompatibility() lastVersion:%s curVersion:%s", a18, java.lang.Integer.valueOf(o45.wf.f343029g));
        if (split == null || split.length != 2) {
            return true;
        }
        int parseInt = java.lang.Integer.parseInt(split[0], 16);
        com.tencent.mars.xlog.Log.i("MicroMsg.NotificationManufacturerCompatibility", "xiaomiNotificationCompatibility() lastVersion:%s", java.lang.Integer.valueOf(parseInt));
        if (654311424 > parseInt || parseInt > 654312247 || com.tencent.mm.sdk.platformtools.t8.D0(e17.getId(), "message_channel_compatibility_id")) {
            return true;
        }
        if (e17.getSound() != null) {
            b(context, notificationManager, a17, z17, z18, sharedPreferences);
            return true;
        }
        try {
            notificationManager.deleteNotificationChannel(e17.getId());
            b(context, notificationManager, "message_channel_compatibility_id", z17, z18, sharedPreferences);
            n25.a.f334317a = "message_channel_compatibility_id";
            ip.b.f293546b = "message_channel_compatibility_id";
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NotificationManufacturerCompatibility", "huaweiNotificationCompatibility exception:%s", e18.getMessage());
            return true;
        }
    }
}
