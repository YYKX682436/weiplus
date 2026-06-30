package x51;

/* loaded from: classes5.dex */
public class c1 implements js.a1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Runnable f451976a;

    public void a(android.app.Activity activity, java.lang.Runnable runnable) {
        boolean z17 = true;
        if (!com.tencent.mm.sdk.platformtools.o4.L().getBoolean("had_show_permission_guild", true)) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.h(activity, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE")) {
                db5.e1.j(activity, com.tencent.mm.R.string.hhk, com.tencent.mm.R.string.hht, com.tencent.mm.R.string.hhl, com.tencent.mm.R.string.f490347sg, new x51.a1(this, activity, runnable), new x51.b1(this));
                z17 = false;
            }
        }
        if (z17) {
            runnable.run();
        }
    }

    public final void b(android.app.Activity activity, java.lang.Runnable runnable) {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(activity, "android.permission.READ_PHONE_STATE", 96, "", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionCheckHelper", "check init, summerper checkPermission checkPhone[%b]", java.lang.Boolean.valueOf(a17));
        if (!a17) {
            jx3.f.INSTANCE.idkeyStat(462L, 20L, 1L, true);
            this.f451976a = runnable;
            return;
        }
        wo.w0.f447840b.a();
        wo.w0.f447841c.a();
        wo.w0.f447848j.a();
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean c(android.app.Activity activity, int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(iArr == null ? -1 : iArr.length);
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = strArr;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[3] = new com.tencent.mm.sdk.platformtools.z3();
            com.tencent.mars.xlog.Log.w("MicroMsg.PermissionCheckHelper", "onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", objArr);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionCheckHelper", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 32 && i17 != 96) {
            return false;
        }
        if (iArr[0] != 0) {
            android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
            sharedPreferences.edit().putBoolean(i17 == 32 ? "SP_PERMISSION_HAD_REQUEST_PERMISSION_STORAGE_1" : "SP_PERMISSION_HAD_REQUEST_PERMISSION_PHONE", true).apply();
            sharedPreferences.edit().putInt("SP_PERMISSION_HAD_REQUEST_PERMISSION_UID", com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().uid).apply();
        } else if (i17 == 32) {
            jx3.f.INSTANCE.idkeyStat(462L, 19L, 1L, true);
        } else if (i17 == 96) {
            jx3.f.INSTANCE.idkeyStat(462L, 21L, 1L, true);
            wo.w0.f447840b.a();
            wo.w0.f447841c.a();
            wo.w0.f447848j.a();
        }
        if (i17 == 32) {
            b(activity, this.f451976a);
        } else {
            java.lang.Runnable runnable = this.f451976a;
            if (runnable != null) {
                runnable.run();
            }
        }
        return true;
    }
}
