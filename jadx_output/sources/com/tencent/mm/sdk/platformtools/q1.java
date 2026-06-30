package com.tencent.mm.sdk.platformtools;

/* loaded from: classes11.dex */
public class q1 implements com.tencent.mm.sdk.platformtools.r1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.reflect.Field f192940a;

    public q1() {
        this.f192940a = null;
        try {
            java.lang.reflect.Field declaredField = android.app.ActivityManager.RunningAppProcessInfo.class.getDeclaredField("processState");
            declaredField.setAccessible(true);
            this.f192940a = declaredField;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GreenManUtil", th6, "", new java.lang.Object[0]);
        }
    }
}
