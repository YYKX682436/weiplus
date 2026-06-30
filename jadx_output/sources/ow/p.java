package ow;

/* loaded from: classes11.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.brand_service.e f349261d;

    public p(com.tencent.wechat.mm.brand_service.e eVar) {
        this.f349261d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.mm_foundation.DartServiceCallerApi Bi;
        f50.y yVar = (f50.y) i95.n0.c(f50.y.class);
        if (yVar == null || (Bi = ((e50.z0) yVar).Bi()) == null) {
            return;
        }
        byte[] byteArray = this.f349261d.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        Bi.flutterBSInitNotifyData(byteArray, ow.o.f349260d);
    }
}
