package ru5;

/* loaded from: classes10.dex */
public class h implements ru5.j {

    /* renamed from: d, reason: collision with root package name */
    public final qu5.a f399808d;

    public h(ru5.i iVar) {
        this.f399808d = xu5.b.d() == null ? new qu5.b(new android.os.Handler(android.os.Looper.myLooper())) : new xu5.o(xu5.b.d(), null);
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f399808d.post(runnable);
    }

    @Override // ru5.j
    public java.lang.String getTag() {
        qu5.a aVar = this.f399808d;
        return aVar instanceof xu5.o ? aVar.getSerialTag() : xu5.b.c(aVar.getLooper());
    }

    @Override // ru5.j
    public void j() {
        this.f399808d.removeCallbacksAndMessages(null);
    }
}
