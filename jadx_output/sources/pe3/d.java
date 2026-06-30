package pe3;

/* loaded from: classes7.dex */
public final class d implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.f f353645d;

    public d(pe3.f fVar) {
        this.f353645d = fVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        if (obj instanceof se3.b) {
            pe3.f fVar = this.f353645d;
            se3.b bVar = (se3.b) obj;
            fVar.f353652d = hq0.i0.K0(fVar.f353654f, fVar, fVar.getActivity(), "wxf337cbaa27790mb2", bVar.f406911a, bVar.f406912b, false, 32, null);
        } else {
            boolean z17 = obj instanceof se3.c;
            pe3.f fVar2 = this.f353645d;
            if (z17) {
                hq0.e0 e0Var = fVar2.f353652d;
                if (e0Var != null) {
                    ((se3.c) obj).f406913a.c(e0Var);
                }
            } else if (obj instanceof se3.a) {
                int a17 = vp0.b.a(new java.lang.Integer(com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x));
                se3.a aVar = (se3.a) obj;
                fq0.x frameSet = aVar.f406910a.getFrameSet();
                if (frameSet != null) {
                    frameSet.f265482f = a17;
                }
                com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView = aVar.f406910a;
                hq0.e0 e0Var2 = fVar2.f353652d;
                if (e0Var2 != null) {
                    magicBrushSclDemoView.a(e0Var2);
                }
            } else if (obj instanceof se3.h) {
                java.lang.String str = ((se3.h) obj).f406918a;
                hq0.e0 e0Var3 = fVar2.f353652d;
                if (e0Var3 != null) {
                    cl0.g gVar = new cl0.g();
                    gVar.h("frameSetName", "mock_tl_card_123");
                    e0Var3.a(str, gVar.toString());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
