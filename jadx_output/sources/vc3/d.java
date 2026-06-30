package vc3;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc3.g f435259d;

    public d(vc3.g gVar) {
        this.f435259d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsruntime.b bVar = this.f435259d.f435262d;
        if (bVar != null) {
            bVar.destroy();
        } else {
            kotlin.jvm.internal.o.o("rt");
            throw null;
        }
    }
}
