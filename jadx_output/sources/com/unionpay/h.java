package com.unionpay;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.unionpay.a.f220692s.sendEmptyMessageDelayed(1001, 800L);
            py5.b bVar = new py5.b(com.unionpay.a.f220691r, qy5.b.b(com.unionpay.a.m()));
            bVar.a();
            java.lang.String str = bVar.f359097a;
            android.os.Handler handler = com.unionpay.a.f220692s;
            if (handler != null) {
                android.os.Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = 1002;
                obtainMessage.obj = str;
                com.unionpay.a.f220692s.removeMessages(1001);
                com.unionpay.a.f220692s.sendMessage(obtainMessage);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
