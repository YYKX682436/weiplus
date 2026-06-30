package com.tencent.mm.xwebutil;

/* loaded from: classes7.dex */
public class d implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f214829a;

    public d(android.webkit.ValueCallback valueCallback) {
        this.f214829a = valueCallback;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mars.xlog.Log.i("XFilesReaderLogic", "readFileByXWeb onReceiveValue: " + num);
        int intValue = num.intValue();
        android.webkit.ValueCallback valueCallback = this.f214829a;
        if (intValue == 0) {
            valueCallback.onReceiveValue(0);
        } else {
            valueCallback.onReceiveValue(-102);
        }
    }
}
