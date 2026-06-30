package gf;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f271153d;

    public o(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        this.f271153d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f271153d;
        yVar.e("onSkylineGlobalReady", "", yVar.getComponentId());
    }
}
