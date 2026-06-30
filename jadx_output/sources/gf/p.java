package gf;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f271158d;

    public p(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        this.f271158d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = df.h.f229477h;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f271158d;
        if (!z17) {
            yVar.e("onSkylineGlobalReady", "", yVar.getComponentId());
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = yVar.getF147808e();
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = f147808e != null ? (com.tencent.mm.plugin.appbrand.jsruntime.f0) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class) : null;
        if (f0Var != null) {
            f0Var.post(new gf.o(yVar));
        }
    }
}
