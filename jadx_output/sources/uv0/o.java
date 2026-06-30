package uv0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f431342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uv0.u uVar) {
        super(1);
        this.f431342d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        uv0.u uVar = this.f431342d;
        uv0.i iVar = uVar.U;
        boolean z17 = false;
        if (iVar != null) {
            uv0.h hVar = (uv0.h) iVar;
            if (uVar.getUserActed$plugin_mj_template_release()) {
                gx0.kh q76 = hVar.f431334b.q7();
                java.lang.String string = uVar.getContext().getString(com.tencent.mm.R.string.lm6);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                q76.r7(string, null);
            }
            uVar.D = false;
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
