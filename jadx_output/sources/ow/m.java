package ow;

/* loaded from: classes11.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f349258d;

    public m(kotlin.jvm.internal.h0 h0Var) {
        this.f349258d = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.mm_foundation.DartServiceCallerApi Bi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Bi();
        if (Bi != null) {
            byte[] byteArray = ((com.tencent.wechat.mm.brand_service.c) this.f349258d.f310123d).toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            Bi.flutterBSUpdateContact(byteArray, ow.l.f349257d);
        }
    }
}
