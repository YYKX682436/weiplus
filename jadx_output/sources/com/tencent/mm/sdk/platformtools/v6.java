package com.tencent.mm.sdk.platformtools;

/* loaded from: classes10.dex */
public abstract class v6 {
    public static android.net.Uri a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent;
        android.net.Uri uri;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScopedStorageUtil", "#getContextUri: " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            java.util.Iterator<android.app.ActivityManager.AppTask> it = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getAppTasks().iterator();
            while (it.hasNext()) {
                android.app.ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
                if (taskInfo != null && (intent = taskInfo.baseIntent) != null) {
                    android.net.Uri data = intent.getData();
                    if (data != null && str.equals(com.tencent.mm.sdk.platformtools.t8.J(context, data))) {
                        return data;
                    }
                    if (taskInfo.baseIntent.getExtras() != null && (uri = (android.net.Uri) taskInfo.baseIntent.getExtras().getParcelable("android.intent.extra.STREAM")) != null && str.equals(com.tencent.mm.sdk.platformtools.t8.J(context, uri))) {
                        return uri;
                    }
                }
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScopedStorageUtil", "getExternalUri fail: " + e17.getMessage());
            return null;
        }
    }

    public static android.net.Uri b(android.content.Context context, long j17, android.net.Uri uri) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScopedStorageUtil", "#getExternalUri: " + j17);
        if (uri == null || !com.tencent.mm.sdk.platformtools.d7.a(context) || j17 == 0) {
            return null;
        }
        try {
            return com.tencent.mm.sdk.platformtools.b7.b(context, j17, uri);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScopedStorageUtil", "getExternalUri fail: " + e17.getMessage());
            return null;
        }
    }

    public static android.net.Uri c(android.content.Context context, java.lang.String str, android.net.Uri uri) {
        if (uri == null || !com.tencent.mm.sdk.platformtools.d7.a(context) || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return com.tencent.mm.sdk.platformtools.b7.a(context, str, uri);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScopedStorageUtil", "getExternalUri fail: " + e17.getMessage());
            return null;
        }
    }

    public static android.net.Uri d(android.content.Context context, java.lang.String str) {
        return c(context, str, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    public static android.net.Uri e(android.content.Context context, java.lang.String str) {
        android.net.Uri c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScopedStorageUtil", "#getMediaUri: " + str);
        if (!com.tencent.mm.sdk.platformtools.d7.a(context) || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            arrayList.add(android.provider.MediaStore.Images.Media.getContentUri("external"));
            arrayList.add(android.provider.MediaStore.Images.Media.getContentUri("external_primary"));
            arrayList.add(android.provider.MediaStore.Video.Media.getContentUri("external"));
            arrayList.add(android.provider.MediaStore.Video.Media.getContentUri("external_primary"));
            arrayList.add(android.provider.MediaStore.Audio.Media.getContentUri("external"));
            arrayList.add(android.provider.MediaStore.Audio.Media.getContentUri("external_primary"));
            arrayList.add(android.provider.MediaStore.Downloads.getContentUri("external"));
            arrayList.add(android.provider.MediaStore.Downloads.getContentUri("external_primary"));
            arrayList.add(android.provider.MediaStore.Files.getContentUri("external"));
            arrayList.add(android.provider.MediaStore.Files.getContentUri("external_primary"));
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                c17 = c(context, str, (android.net.Uri) it.next());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScopedStorageUtil", "getExternalUri fail: " + e17.getMessage());
            }
            if (c17 != null) {
                return c17;
            }
        }
        return null;
    }
}
