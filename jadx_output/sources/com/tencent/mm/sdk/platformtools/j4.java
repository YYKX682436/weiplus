package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public final class j4 implements android.content.SharedPreferences.Editor {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f192762d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f192763e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.l4 f192764f;

    public j4(com.tencent.mm.sdk.platformtools.l4 l4Var, com.tencent.mm.sdk.platformtools.d4 d4Var) {
        this.f192764f = l4Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|4)|8|9|(5:24|19|20|25|26)|40|41|(2:43|44)(8:46|(1:48)(1:65)|49|(1:51)(1:64)|52|d0|57|58)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r7 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a1, code lost:
    
        if (r7 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
    
        if (r7 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fe, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.MultiProcSharedPreferences", "writeToFile: Got exception:", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0120, code lost:
    
        if (r6.f192764f.f192825e.exists() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.MultiProcSharedPreferences", "Couldn't clean up partially-written file " + r6.f192764f.f192825e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0146, code lost:
    
        r7.f192808f = false;
        r7.f192807e.countDown();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014d, code lost:
    
        r6 = r6.f192764f;
        r7 = r6.f192828h;
        r6 = r6;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0151, code lost:
    
        if (r7 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010c, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.MultiProcSharedPreferences", "writeToFile: Got exception:", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.tencent.mm.sdk.platformtools.j4 r6, com.tencent.mm.sdk.platformtools.k4 r7) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.j4.a(com.tencent.mm.sdk.platformtools.j4, com.tencent.mm.sdk.platformtools.k4):void");
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        com.tencent.mm.sdk.platformtools.k4 b17 = b();
        com.tencent.mm.sdk.platformtools.f4 f4Var = new com.tencent.mm.sdk.platformtools.f4(this, b17);
        com.tencent.mm.sdk.platformtools.j6.f192765a.add(f4Var);
        d(b17, new com.tencent.mm.sdk.platformtools.g4(this, f4Var));
        e(b17);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.sdk.platformtools.k4 b() {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.j4.b():com.tencent.mm.sdk.platformtools.k4");
    }

    public final java.io.FileOutputStream c(java.io.File file) {
        try {
            return new java.io.FileOutputStream(file);
        } catch (java.io.FileNotFoundException unused) {
            java.io.File parentFile = file.getParentFile();
            if (!parentFile.mkdir()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiProcSharedPreferences", "Couldn't create directory for SharedPreferences file " + file);
                return null;
            }
            int i17 = this.f192764f.f192827g;
            parentFile.setReadable(true, (i17 & 1) == 0);
            parentFile.setWritable(true, (i17 & 2) == 0);
            try {
                return new java.io.FileOutputStream(file);
            } catch (java.io.FileNotFoundException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiProcSharedPreferences", "Couldn't create SharedPreferences file " + file, e17);
                return null;
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor clear() {
        synchronized (this) {
            this.f192763e = true;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        com.tencent.mm.sdk.platformtools.k4 b17 = b();
        d(b17, null);
        try {
            b17.f192807e.await();
            e(b17);
            return b17.f192808f;
        } catch (java.lang.InterruptedException unused) {
            return false;
        }
    }

    public final void d(com.tencent.mm.sdk.platformtools.k4 k4Var, java.lang.Runnable runnable) {
        java.util.concurrent.ExecutorService executorService;
        boolean z17;
        com.tencent.mm.sdk.platformtools.h4 h4Var = new com.tencent.mm.sdk.platformtools.h4(this, k4Var, runnable);
        if (runnable == null) {
            synchronized (this.f192764f) {
                z17 = this.f192764f.f192830m == 1;
            }
            if (z17) {
                h4Var.run();
                return;
            }
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = com.tencent.mm.sdk.platformtools.j6.f192765a;
        synchronized (com.tencent.mm.sdk.platformtools.j6.class) {
            if (com.tencent.mm.sdk.platformtools.j6.f192766b == null) {
                com.tencent.mm.sdk.platformtools.j6.f192766b = java.util.concurrent.Executors.newSingleThreadExecutor();
            }
            executorService = com.tencent.mm.sdk.platformtools.j6.f192766b;
        }
        executorService.execute(h4Var);
    }

    public final void e(com.tencent.mm.sdk.platformtools.k4 k4Var) {
        java.util.List list;
        if (k4Var.f192805c == null || (list = k4Var.f192804b) == null || list.size() == 0) {
            return;
        }
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.tencent.mm.sdk.platformtools.l4.f192821s.post(new com.tencent.mm.sdk.platformtools.i4(this, k4Var));
            return;
        }
        for (int size = k4Var.f192804b.size() - 1; size >= 0; size--) {
            java.lang.String str = (java.lang.String) k4Var.f192804b.get(size);
            for (android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : k4Var.f192805c) {
                if (onSharedPreferenceChangeListener != null) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f192764f, str);
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z17) {
        synchronized (this) {
            ((java.util.HashMap) this.f192762d).put(str, java.lang.Boolean.valueOf(z17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f17) {
        synchronized (this) {
            ((java.util.HashMap) this.f192762d).put(str, java.lang.Float.valueOf(f17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putInt(java.lang.String str, int i17) {
        synchronized (this) {
            ((java.util.HashMap) this.f192762d).put(str, java.lang.Integer.valueOf(i17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String str, long j17) {
        synchronized (this) {
            ((java.util.HashMap) this.f192762d).put(str, java.lang.Long.valueOf(j17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            ((java.util.HashMap) this.f192762d).put(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
        synchronized (this) {
            ((java.util.HashMap) this.f192762d).put(str, set);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor remove(java.lang.String str) {
        synchronized (this) {
            ((java.util.HashMap) this.f192762d).put(str, this);
        }
        return this;
    }
}
