package dr0;

/* loaded from: classes12.dex */
public final class e2 extends dr0.j2 {
    public e2() {
        super(1);
    }

    @Override // dr0.j2
    public boolean a() {
        boolean z17;
        int i17;
        boolean z18;
        java.io.BufferedReader bufferedReader;
        java.lang.String readLine;
        if (!dr0.j2.f242440b.a()) {
            return false;
        }
        dr0.p1 a17 = dr0.p1.f242489d.a();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        a17.getClass();
        java.util.Iterator it = a17.h(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            android.app.ActivityManager.RunningTaskInfo runningTaskInfo = (android.app.ActivityManager.RunningTaskInfo) it.next();
            if (runningTaskInfo.numActivities > 0) {
                java.lang.String packageName = context.getPackageName();
                android.content.ComponentName componentName = runningTaskInfo.topActivity;
                if (componentName != null && kotlin.jvm.internal.o.b(packageName, componentName.getPackageName())) {
                    z17 = true;
                    break;
                }
            }
        }
        dr0.p1 a18 = dr0.p1.f242489d.a();
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        a18.getClass();
        java.util.Iterator it6 = a18.g(context2).iterator();
        while (true) {
            if (!it6.hasNext()) {
                i17 = -1;
                break;
            }
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (android.app.ActivityManager.RunningAppProcessInfo) it6.next();
            if (runningAppProcessInfo.pid == android.os.Process.myPid()) {
                i17 = runningAppProcessInfo.importance;
                break;
            }
        }
        dr0.p1.f242489d.a().getClass();
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new com.tencent.mm.vfs.u6("/proc/self/cgroup")));
        } catch (java.lang.Throwable unused) {
        }
        do {
            try {
                readLine = bufferedReader.readLine();
                kotlin.jvm.internal.o.d(readLine);
                if (!r26.n0.D(readLine, "top-app", false, 2, null) && !r26.n0.D(readLine, "foreground", false, 2, null)) {
                    if (r26.n0.D(readLine, "background", false, 2, null)) {
                        break;
                    }
                }
                vz5.b.a(bufferedReader, null);
                z18 = true;
                break;
            } finally {
            }
        } while (!r26.n0.D(readLine, "restricted", false, 2, null));
        vz5.b.a(bufferedReader, null);
        z18 = false;
        boolean z19 = !z17 || ((i17 <= 0 || i17 > 100) && !z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "quiet launch: " + z19 + ", top=" + z17 + ", importance=" + i17 + ", cgroup=" + z18);
        if (!z19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "abort: quietLaunching=false");
            return false;
        }
        dr0.t tVar = dr0.t0.f242539j;
        dr0.t0 t0Var = dr0.t0.f242540k;
        if (t0Var.i().getAccContinuousRecycleCount() < 5 || t0Var.i().getAccDeadDuringMs() / t0Var.i().getAccContinuousRecycleCount() > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: too many recycle-wakeup, deadMs=" + t0Var.i().getAccDeadDuringMs() + ", continuousCount=" + t0Var.i().getAccContinuousRecycleCount());
        return false;
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        java.util.List S0;
        boolean isEmpty;
        dr0.h1 h1Var = dr0.p1.f242489d;
        synchronized (((java.util.List) h1Var.a().f242492b.getValue())) {
            S0 = kz5.n0.S0((java.util.List) h1Var.a().f242492b.getValue());
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "#recyclingContinuous: quietLaunching=" + h1Var.a().f242493c + ", pullUpActionList=" + S0);
        if (!a()) {
            return null;
        }
        if (!h1Var.a().f242493c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: not-quiet-launching");
            return null;
        }
        if (S0.isEmpty()) {
            isEmpty = false;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : S0) {
                if (!kz5.c0.i("light_push_notify", "light_push_too_many_push", "light_push_too_many_msg_group").contains((java.lang.String) obj)) {
                    arrayList.add(obj);
                }
            }
            isEmpty = kz5.n0.S0(arrayList).isEmpty();
        }
        if (isEmpty) {
            return dr0.a3.b(dr0.a3.f242403d.a(), this.f242449a);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.proc.Recycler", "abort: continuous recycle not supported:" + S0);
        return null;
    }
}
