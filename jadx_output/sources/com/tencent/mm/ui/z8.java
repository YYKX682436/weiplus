package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class z8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f212606a;

    public z8() {
        this.f212606a = com.tencent.mm.sdk.platformtools.a0.c() || android.os.Environment.getExternalStorageDirectory().getAbsolutePath().toLowerCase().contains("appclone");
    }

    public boolean a(android.app.Activity activity, int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(iArr == null ? -1 : iArr.length);
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = strArr;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[3] = new com.tencent.mm.sdk.platformtools.z3();
            com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", objArr);
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.u8(this), 500L);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        int i18 = com.tencent.mm.R.string.hhr;
        if (i17 != 32) {
            if (i17 != 33) {
                if (i17 != 64) {
                    if (i17 != 70) {
                        if (i17 != 96) {
                            if (i17 != 97) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (i17 == 97) {
                i18 = com.tencent.mm.R.string.hho;
            } else if (i17 == 70) {
                i18 = com.tencent.mm.R.string.hhm;
            }
            if (iArr[0] != 0) {
                this.f212606a = false;
                db5.e1.C(activity, activity.getString(i18), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.ui.x8(this, i17, activity), new com.tencent.mm.ui.y8(this, i17));
            } else if (i17 == 33) {
                jx3.f.INSTANCE.idkeyStat(462L, 9L, 1L, true);
            } else if (i17 == 97) {
                jx3.f.INSTANCE.idkeyStat(462L, 10L, 1L, true);
            } else {
                jx3.f.INSTANCE.idkeyStat(462L, 11L, 1L, true);
            }
            return true;
        }
        int i19 = i17 == 96 ? com.tencent.mm.R.string.hho : i17 == 64 ? com.tencent.mm.R.string.hhm : com.tencent.mm.R.string.hhr;
        if (iArr[0] != 0) {
            db5.e1.C(activity, activity.getString(i19), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.ui.v8(this, i17, activity), new com.tencent.mm.ui.w8(this, i17, activity));
        } else if (i17 == 32) {
            jx3.f.INSTANCE.idkeyStat(462L, 0L, 1L, true);
        } else if (i17 == 96) {
            jx3.f.INSTANCE.idkeyStat(462L, 1L, 1L, true);
            wo.w0.f447840b.a();
            wo.w0.f447841c.a();
            wo.w0.f447848j.a();
        } else {
            jx3.f.INSTANCE.idkeyStat(462L, 2L, 1L, true);
        }
        return true;
    }
}
