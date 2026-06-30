package pe5;

/* loaded from: classes11.dex */
public final class g extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f353752d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f353753e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f353754f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f353755g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f353753e = "";
        this.f353754f = "";
    }

    public final java.util.List O6() {
        android.content.ComponentName componentName;
        java.lang.String className;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService((java.lang.Class<java.lang.Object>) android.app.ActivityManager.class);
        kotlin.jvm.internal.o.f(systemService, "getSystemService(...)");
        java.util.List<android.app.ActivityManager.AppTask> appTasks = ((android.app.ActivityManager) systemService).getAppTasks();
        if (appTasks == null) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : appTasks) {
            android.app.ActivityManager.RecentTaskInfo taskInfo = ((android.app.ActivityManager.AppTask) obj).getTaskInfo();
            if (!((taskInfo == null || (componentName = taskInfo.baseActivity) == null || (className = componentName.getClassName()) == null || !r26.n0.B(className, "com.tencent.mm.booter.notification.tool.NotificationClickActivity", true)) ? false : true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void P6(android.app.TaskInfo taskInfo) {
        android.content.ComponentName componentName;
        java.lang.String str;
        if (taskInfo == null || (componentName = taskInfo.baseActivity) == null) {
            return;
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                str = getContext().getPackageManager().getActivityInfo(componentName, android.content.pm.PackageManager.ComponentInfoFlags.of(0L)).taskAffinity;
                kotlin.jvm.internal.o.d(str);
            } else {
                str = getContext().getPackageManager().getActivityInfo(componentName, 0).taskAffinity;
                kotlin.jvm.internal.o.d(str);
            }
            if (!(str.length() == 0)) {
                java.lang.String className = componentName.getClassName();
                kotlin.jvm.internal.o.f(className, "getClassName(...)");
                this.f353754f = className;
                this.f353753e = str;
            }
            if (r26.i0.p(str, "com.tencent.mm", true)) {
                java.lang.String className2 = componentName.getClassName();
                kotlin.jvm.internal.o.f(className2, "getClassName(...)");
                this.f353754f = className2;
                this.f353753e = "com.tencent.mm";
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NotificationOnClickUIC", "getActivityInfo failed NameNotFoundException: " + e17.getMessage());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NotificationOnClickUIC", "getActivityInfo failed: " + th6.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        if (r10.f353752d == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        if (r10.f353752d == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00de, code lost:
    
        if (r10.f353752d == false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6(android.app.ActivityManager.RecentTaskInfo r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pe5.g.Q6(android.app.ActivityManager$RecentTaskInfo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015c  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateBefore(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pe5.g.onCreateBefore(android.os.Bundle):void");
    }
}
