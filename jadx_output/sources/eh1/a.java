package eh1;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.i f252901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f252903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252904g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fh1.i iVar, java.lang.String str, kotlin.jvm.internal.h0 h0Var, java.lang.String str2) {
        super(0);
        this.f252901d = iVar;
        this.f252902e = str;
        this.f252903f = h0Var;
        this.f252904g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.h0 h0Var = com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.h0.f84288a;
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams wAMagicBrushFrameLaunchParams = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams();
        wAMagicBrushFrameLaunchParams.f84243e = this.f252902e;
        wAMagicBrushFrameLaunchParams.f84244f = ((com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b) this.f252903f.f310123d).f82194d;
        wAMagicBrushFrameLaunchParams.f84246h = this.f252904g;
        fh1.i iVar = this.f252901d;
        wAMagicBrushFrameLaunchParams.f84254i = ((fh1.z) iVar).c();
        wAMagicBrushFrameLaunchParams.f84255m = com.tencent.mm.plugin.magicbrush.a5.f147843h;
        kotlin.jvm.internal.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFrameBizHostImpl");
        h0Var.a(wAMagicBrushFrameLaunchParams, (fh1.z) iVar);
        return jz5.f0.f302826a;
    }
}
