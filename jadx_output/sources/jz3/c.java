package jz3;

/* loaded from: classes13.dex */
public class c implements kd0.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[][] f302785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f302786b;

    public c(jz3.d dVar, java.lang.String[][] strArr, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f302785a = strArr;
        this.f302786b = countDownLatch;
    }

    @Override // kd0.a3
    public void a(long j17, kd0.c3 c3Var) {
        java.util.List list = c3Var.f306621a;
        if (list != null) {
            java.lang.String[] strArr = new java.lang.String[list.size()];
            java.util.Iterator it = c3Var.f306621a.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                strArr[i17] = ((com.tencent.qbar.WxQBarResult) it.next()).f475332f;
                i17++;
            }
            synchronized (this.f302785a) {
                this.f302785a[0] = strArr;
            }
        }
        this.f302786b.countDown();
    }
}
