package ho1;

/* loaded from: classes5.dex */
public final class f0 implements com.tencent.pigeon.roam_backup.BackupPigeonApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f282667d;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f282667d = binding.getActivity();
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().a(true);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "onAttachedToEngine");
        com.tencent.pigeon.roam_backup.BackupPigeonApi.Companion companion = com.tencent.pigeon.roam_backup.BackupPigeonApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.roam_backup.BackupPigeonApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f282667d = null;
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().a(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "onDetachedFromActivity");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f282667d = null;
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().a(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "onDetachedFromActivityForConfigChanges");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "onDetachedFromEngine");
        com.tencent.pigeon.roam_backup.BackupPigeonApi.Companion companion = com.tencent.pigeon.roam_backup.BackupPigeonApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.roam_backup.BackupPigeonApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f282667d = binding.getActivity();
        com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().a(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "onReattachedToActivityForConfigChanges");
    }

    @Override // com.tencent.pigeon.roam_backup.BackupPigeonApi
    public void openSAFDirTree(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f282667d;
        if (activity == null) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("")));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "Device is not initialize, try to get a new device from system");
        java.util.List b17 = ro1.v.f398014a.b();
        if (((java.util.ArrayList) b17).isEmpty()) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("error_no_udisk_devices")));
            return;
        }
        po1.d a17 = po1.d.a((po1.d) kz5.n0.i0(b17), null, null, null, null, "/", null, null, 111, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "Open saf ui and request permission. rootDevice=" + a17);
        android.content.Intent d17 = to1.g.f420911a.d(a17);
        kotlin.jvm.internal.o.d(d17);
        wo1.l1.f447986a.a(null);
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        ((com.tencent.mm.ui.bd) ((com.tencent.mm.ui.MMFragmentActivity) activity).startActivityForResult(d17)).f197877a = new ho1.z(callback, activity);
    }

    @Override // com.tencent.pigeon.roam_backup.BackupPigeonApi
    public void openSAFDirTreeOfDevice(com.tencent.pigeon.roam_backup.PigeonDeviceInfo deviceInfo, yz5.l callback) {
        po1.d e17;
        android.view.View view;
        kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f282667d == null) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("error_context_null")));
            return;
        }
        ro1.v vVar = ro1.v.f398014a;
        java.util.List b17 = vVar.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Count of available devices is ");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
        if (arrayList.isEmpty()) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("error_no_udisk_devices")));
            return;
        }
        if (kotlin.jvm.internal.o.b(deviceInfo.getDeviceId(), "deviceId@roam-at")) {
            e17 = oo1.j.f347145a.a();
        } else {
            java.lang.String deviceId = deviceInfo.getDeviceId();
            kotlin.jvm.internal.o.d(deviceId);
            e17 = vVar.e(deviceId);
            if (e17 == null) {
                java.lang.String deviceId2 = deviceInfo.getDeviceId();
                kotlin.jvm.internal.o.d(deviceId2);
                po1.f fVar = po1.g.f357306d;
                java.lang.Long deviceType = deviceInfo.getDeviceType();
                kotlin.jvm.internal.o.d(deviceType);
                po1.g a17 = fVar.a((int) deviceType.longValue());
                java.lang.String deviceNickname = deviceInfo.getDeviceNickname();
                java.lang.String str = deviceNickname == null ? "" : deviceNickname;
                java.lang.String deviceRemark = deviceInfo.getDeviceRemark();
                java.lang.String str2 = deviceRemark == null ? "" : deviceRemark;
                java.lang.String devicePath = deviceInfo.getDevicePath();
                java.lang.String str3 = devicePath == null ? "" : devicePath;
                java.lang.String deviceUUID = deviceInfo.getDeviceUUID();
                java.lang.String str4 = deviceUUID == null ? "" : deviceUUID;
                java.lang.String uriPath = deviceInfo.getUriPath();
                e17 = new po1.d(deviceId2, a17, str, str2, str3, str4, uriPath == null ? "" : uriPath);
            }
        }
        android.app.Activity activity = this.f282667d;
        if (e17.f357300f.length() == 0) {
            java.lang.String str5 = ((po1.d) kz5.n0.i0(b17)).f357300f;
            kotlin.jvm.internal.o.g(str5, "<set-?>");
            e17.f357300f = str5;
        }
        android.content.Intent d17 = to1.g.f420911a.d(po1.d.a(e17, null, null, null, null, "/", null, null, 111, null));
        kotlin.jvm.internal.o.d(d17);
        wo1.l1.f447986a.a(null);
        try {
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.tencent.mm.ui.bd) ((com.tencent.mm.ui.MMFragmentActivity) activity).startActivityForResult(d17)).f197877a = new ho1.c0(callback, e17, activity);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamFloatWindowHelper", "Remove float window");
            java.lang.ref.WeakReference weakReference = wo1.l1.f447987b;
            if (weakReference != null && (view = (android.view.View) weakReference.get()) != null) {
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                ((android.view.WindowManager) systemService).removeView(view);
                wo1.l1.f447987b = null;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackup.FlutterBackupPlugin", "openSAFDirTreeOfDevice error", e18);
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("error_path_error")));
        }
    }

    @Override // com.tencent.pigeon.roam_backup.BackupPigeonApi
    public void selectConversationByName(java.util.List alreadySelected, yz5.l callback) {
        kotlin.jvm.internal.o.g(alreadySelected, "alreadySelected");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f282667d;
        if (activity == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "selectConversationByName activity is null");
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
            return;
        }
        kotlin.jvm.internal.o.d(activity);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.RoamSelectContactUI.class);
        intent.putExtra("contactListShowSize", true);
        intent.putExtra("contactListSortType", 3);
        intent.putExtra("titile", activity.getString(com.tencent.mm.R.string.mzg));
        intent.putExtra("already_select_contact", (java.lang.String[]) alreadySelected.toArray(new java.lang.String[0]));
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92938f;
        intent.putExtra("reportPageId", 4L);
        intent.putExtra("contactListPushDownAnim", true);
        pf5.j0.a(intent, ap1.g.class);
        pf5.j0.a(intent, ap1.o0.class);
        pf5.j0.a(intent, ap1.x0.class);
        pf5.j0.a(intent, ap1.x1.class);
        pf5.j0.a(intent, ap1.f1.class);
        pf5.j0.a(intent, ap1.p1.class);
        pf5.j0.a(intent, ap1.u1.class);
        pf5.j0.a(intent, ap1.b2.class);
        ((com.tencent.mm.ui.bd) ((com.tencent.mm.ui.MMFragmentActivity) activity).startActivityForResult(intent)).f197877a = new ho1.d0(callback);
    }

    @Override // com.tencent.pigeon.roam_backup.BackupPigeonApi
    public void selectConversationBylabel(java.util.List alreadySelected, yz5.l callback) {
        kotlin.jvm.internal.o.g(alreadySelected, "alreadySelected");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f282667d;
        if (activity == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "selectConversationlabels activity is null");
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
            return;
        }
        kotlin.jvm.internal.o.d(activity);
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(alreadySelected.size());
        java.util.Iterator it = alreadySelected.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        intent.putStringArrayListExtra("label_id", arrayList);
        intent.setClassName(activity, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        ((com.tencent.mm.ui.bd) ((com.tencent.mm.ui.MMFragmentActivity) activity).startActivityForResult(intent)).f197877a = new ho1.e0(callback);
    }
}
