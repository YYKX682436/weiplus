package ru1;

/* loaded from: classes13.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru1.e f399706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru1.e eVar) {
        super(0);
        this.f399706d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ru1.e eVar = this.f399706d;
        tl.w wVar = eVar.f399711e;
        if (wVar != null) {
            wVar.l();
        }
        eVar.f399709c.quitSafely();
        com.tencent.mm.vfs.y6 y6Var = eVar.f399710d;
        if (y6Var != null) {
            y6Var.close();
        }
        eVar.f399710d = null;
        return jz5.f0.f302826a;
    }
}
