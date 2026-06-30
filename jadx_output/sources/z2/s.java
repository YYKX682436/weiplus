package z2;

/* loaded from: classes13.dex */
public final class s extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.core.app.JobIntentService f469519a;

    public s(androidx.core.app.JobIntentService jobIntentService) {
        this.f469519a = jobIntentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[LOOP:0: B:2:0x0002->B:13:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r5) {
        /*
            r4 = this;
            java.lang.Void[] r5 = (java.lang.Void[]) r5
        L2:
            androidx.core.app.JobIntentService r5 = r4.f469519a
            z2.t r0 = r5.f11024d
            r1 = 0
            if (r0 == 0) goto L31
            z2.y r0 = (z2.y) r0
            java.lang.Object r2 = r0.f469535b
            monitor-enter(r2)
            android.app.job.JobParameters r5 = r0.f469536c     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            goto L49
        L14:
            android.app.job.JobWorkItem r5 = r5.dequeueWork()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L49
            android.content.Intent r2 = r5.getIntent()
            androidx.core.app.JobIntentService r3 = r0.f469534a
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setExtrasClassLoader(r3)
            z2.x r2 = new z2.x
            r2.<init>(r0, r5)
            goto L4a
        L2e:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r5
        L31:
            java.util.ArrayList r0 = r5.f11028h
            monitor-enter(r0)
            java.util.ArrayList r2 = r5.f11028h     // Catch: java.lang.Throwable -> L5a
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5a
            if (r2 <= 0) goto L48
            java.util.ArrayList r5 = r5.f11028h     // Catch: java.lang.Throwable -> L5a
            r2 = 0
            java.lang.Object r5 = r5.remove(r2)     // Catch: java.lang.Throwable -> L5a
            r2 = r5
            z2.w r2 = (z2.w) r2     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            goto L4a
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
        L49:
            r2 = r1
        L4a:
            if (r2 == 0) goto L59
            androidx.core.app.JobIntentService r5 = r4.f469519a
            android.content.Intent r0 = r2.getIntent()
            r5.b(r0)
            r2.complete()
            goto L2
        L59:
            return r1
        L5a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.s.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onCancelled(java.lang.Object obj) {
        this.f469519a.c();
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        this.f469519a.c();
    }
}
