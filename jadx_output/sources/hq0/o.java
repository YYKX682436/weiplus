package hq0;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f283036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hq0.b0 b0Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str) {
        super(1);
        this.f283035d = b0Var;
        this.f283036e = h0Var;
        this.f283037f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        android.view.MotionEvent ev6 = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (((je3.i) i95.n0.c(je3.i.class)).W7() && ev6.getAction() == 1) {
            cl0.g gVar = new cl0.g();
            ie3.i iVar = (ie3.i) i95.n0.c(ie3.i.class);
            hq0.b0 b0Var = this.f283035d;
            if (iVar != null) {
                str = ((he3.e) iVar).bj(b0Var.f282970x.f293634a);
            } else {
                str = "";
            }
            kotlin.jvm.internal.h0 h0Var = this.f283036e;
            gVar.o("w", ((com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer) h0Var.f310123d).getWidth());
            gVar.o("h", ((com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer) h0Var.f310123d).getHeight());
            gVar.h("mb_biz_version", b0Var.f282970x.f293634a + ':' + str);
            je3.i iVar2 = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String instanceName = b0Var.f282970x.f293634a;
            kotlin.jvm.internal.o.g(instanceName, "instanceName");
            java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType iMagicBrushClickEnumExt$RoleType = com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType.ADClient;
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$EventType iMagicBrushClickEnumExt$EventType = com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$EventType.NativeClick;
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$ActionType iMagicBrushClickEnumExt$ActionType = com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$ActionType.NativeTriggerClick;
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
            kotlin.jvm.internal.o.d(iVar2);
            je3.i.m519if(iVar2, s07, 0, currentTimeMillis, "", iMagicBrushClickEnumExt$RoleType, iMagicBrushClickEnumExt$EventType, iMagicBrushClickEnumExt$ActionType, 0, 0, t17, this.f283037f, 386, null);
        }
        return jz5.f0.f302826a;
    }
}
