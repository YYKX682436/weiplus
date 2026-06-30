package com.tencent.mm.splash;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.splash.j.d("WxSplash.Splash", "verify mH callback hack, result failed!.", new java.lang.Object[0]);
        com.tencent.mm.splash.j.f193660s.a(675L, 32L, 1L);
        try {
            java.lang.Object f17 = com.tencent.mm.splash.j.f(com.tencent.mm.splash.j.f193644c);
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(f17 == com.tencent.mm.splash.q.f193673a);
            com.tencent.mm.splash.j.d("WxSplash.Splash", "spy, activityThread %s", objArr);
            java.lang.reflect.Field declaredField = f17.getClass().getDeclaredField("mH");
            declaredField.setAccessible(true);
            android.os.Handler handler = (android.os.Handler) declaredField.get(f17);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Boolean.valueOf(handler == com.tencent.mm.splash.q.f193674b);
            com.tencent.mm.splash.j.d("WxSplash.Splash", "spy, ActivityThread_mH %s", objArr2);
            java.lang.reflect.Field declaredField2 = android.os.Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            android.os.Handler.Callback callback = (android.os.Handler.Callback) declaredField2.get(handler);
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            objArr3[0] = java.lang.Boolean.valueOf(callback == com.tencent.mm.splash.q.f193677e);
            objArr3[1] = callback;
            com.tencent.mm.splash.j.d("WxSplash.Splash", "spy, callback %s %s", objArr3);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.splash.j.e(e17, "spy failed.");
        }
    }
}
