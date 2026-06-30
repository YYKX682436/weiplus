package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class NoRomSpaceDexUI extends com.tencent.mm.hellhoundlib.activities.HellActivity implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.app.PendingIntent f197036d;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.ActivityManager activityManager;
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        android.app.PendingIntent pendingIntent = this.f197036d;
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (android.app.PendingIntent.CanceledException unused) {
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && (activityManager = (android.app.ActivityManager) getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)) != null && (appTasks = activityManager.getAppTasks()) != null) {
            java.util.Iterator<android.app.ActivityManager.AppTask> it = appTasks.iterator();
            while (it.hasNext()) {
                it.next().finishAndRemoveTask();
            }
        }
        finish();
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/NoRomSpaceDexUI", "onClick", "(Landroid/content/DialogInterface;I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/ui/NoRomSpaceDexUI", "onClick", "(Landroid/content/DialogInterface;I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.sdk.platformtools.m2.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        setContentView(com.tencent.mm.R.layout.c7z);
        android.content.Intent intent = getIntent();
        this.f197036d = (android.app.PendingIntent) intent.getParcelableExtra("action");
        com.tencent.mm.ui.i9 i9Var = new com.tencent.mm.ui.i9(this);
        if (intent.hasExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            i9Var.setTitle(intent.getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        } else {
            i9Var.setTitle(intent.getIntExtra("titleRes", com.tencent.mm.R.string.f490897b72));
        }
        if (intent.hasExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
            java.lang.String stringExtra = intent.getStringExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
            i9Var.f208913i.setVisibility(0);
            i9Var.f208911g.setVisibility(0);
            i9Var.f208911g.setText(stringExtra);
        } else {
            int intExtra = intent.getIntExtra("messageRes", com.tencent.mm.R.string.f490896b71);
            i9Var.f208913i.setVisibility(0);
            i9Var.f208911g.setVisibility(0);
            i9Var.f208911g.setText(intExtra);
        }
        if (intent.hasExtra("button")) {
            java.lang.String stringExtra2 = intent.getStringExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
            i9Var.f208913i.setVisibility(0);
            i9Var.f208911g.setVisibility(0);
            i9Var.f208911g.setText(stringExtra2);
        } else {
            java.lang.String string = getString(intent.getIntExtra("buttonRes", com.tencent.mm.R.string.f490895b70));
            android.widget.Button button = i9Var.f208909e;
            if (button != null) {
                button.setVisibility(0);
                i9Var.f208909e.setText(string);
                i9Var.f208909e.setOnClickListener(new com.tencent.mm.ui.g9(i9Var, this, true));
            }
        }
        i9Var.setCancelable(false);
        i9Var.c(false);
        i9Var.show();
    }
}
