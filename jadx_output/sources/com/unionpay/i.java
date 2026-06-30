package com.unionpay;

/* loaded from: classes13.dex */
public final class i implements lb.c {
    public final void a(int i17, android.os.Bundle bundle) {
        if (com.unionpay.a.f220692s == null) {
            com.unionpay.a.f220692s = new android.os.Handler(com.unionpay.a.f220697x);
        }
        android.os.Handler handler = com.unionpay.a.f220692s;
        handler.sendMessage(handler.obtainMessage(1003, java.lang.Integer.valueOf(i17)));
    }
}
