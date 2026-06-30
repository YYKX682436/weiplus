package fk;

/* loaded from: classes12.dex */
public final class c extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263257a;

    public c(java.lang.String str) {
        this.f263257a = str;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fk.d.f263258a;
        java.lang.String aid = this.f263257a;
        kotlin.jvm.internal.o.g(aid, "aid");
        fk.a aVar = (fk.a) fk.d.f263258a.get(aid);
        if (aVar != null) {
            synchronized (aVar) {
                if (aVar.f263249b == 0) {
                    aVar.f263249b = ik.f.f291821a.b();
                }
            }
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fk.d.f263258a;
        java.lang.String aid = this.f263257a;
        kotlin.jvm.internal.o.g(aid, "aid");
        fk.a aVar = (fk.a) fk.d.f263258a.get(aid);
        if (aVar != null) {
            synchronized (aVar) {
                aVar.f263250c += aVar.f263249b != 0 ? ik.f.f291821a.b() - aVar.f263249b : 0L;
                aVar.f263249b = 0L;
            }
        }
    }
}
