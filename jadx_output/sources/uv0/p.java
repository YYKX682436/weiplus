package uv0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f431343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(uv0.u uVar) {
        super(1);
        this.f431343d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        uv0.u uVar = this.f431343d;
        uv0.i iVar = uVar.U;
        if (iVar != null) {
            uv0.h hVar = (uv0.h) iVar;
            if (uVar.getUserActed$plugin_mj_template_release()) {
                hVar.f431334b.m7().c(vv0.b.f440371d, hVar.f431336d);
            }
            uVar.H();
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
