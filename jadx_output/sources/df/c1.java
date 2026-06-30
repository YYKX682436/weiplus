package df;

/* loaded from: classes7.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final df.c1 f229435a = new df.c1();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f229436b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.skyline.SkylineRuntime f229437c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f229438d;

    /* renamed from: e, reason: collision with root package name */
    public static int f229439e;

    public final com.tencent.skyline.SkylineRuntime a() {
        com.tencent.skyline.SkylineRuntime skylineRuntime = new com.tencent.skyline.SkylineRuntime();
        skylineRuntime.init();
        if (f229436b) {
            long runtimePtr = skylineRuntime.getRuntimePtr();
            try {
                com.tencent.skyline.SkylineLogic.preloadTaskRunner(runtimePtr);
            } catch (java.lang.Error e17) {
                com.tencent.skyline.SkylineLog.e("SkylinePreloader", "preloadTaskRunner " + runtimePtr + ' ' + skylineRuntime + " fail: " + e17);
            } catch (java.lang.Exception e18) {
                com.tencent.skyline.SkylineLog.e("SkylinePreloader", "preloadTaskRunner " + runtimePtr + ' ' + skylineRuntime + " fail: " + e18);
            }
            io.flutter.embedding.engine.TaskRunnerJNI taskRunner = com.tencent.skyline.SkylineLogic.getTaskRunner(runtimePtr);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(runtimePtr);
            sb6.append(' ');
            sb6.append(skylineRuntime);
            sb6.append(" use task_Runner: ");
            sb6.append(taskRunner);
            sb6.append(" - ");
            sb6.append(taskRunner != null ? java.lang.Long.valueOf(taskRunner.getTaskRunnerAddress()) : null);
            com.tencent.skyline.SkylineLog.i("SkylinePreloader", sb6.toString());
            if (taskRunner != null) {
                skylineRuntime.initUITaskRunner(taskRunner.getTaskRunnerAddress());
            }
            if (taskRunner != null) {
                taskRunner.post(new df.b1(skylineRuntime));
            }
        }
        return skylineRuntime;
    }
}
