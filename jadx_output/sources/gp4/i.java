package gp4;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bv3.d f274411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(bv3.d dVar) {
        super(1);
        this.f274411d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.vlog.model.i1 it = (com.tencent.mm.plugin.vlog.model.i1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bv3.d dVar = it.f175620e;
        dVar.getClass();
        bv3.d tr6 = this.f274411d;
        kotlin.jvm.internal.o.g(tr6, "tr");
        if (dVar.c() >= tr6.c()) {
            tr6 = dVar;
            dVar = tr6;
        }
        return java.lang.Boolean.valueOf((dVar.c() == tr6.c() && dVar.b() == tr6.b()) || dVar.b() > tr6.c());
    }
}
