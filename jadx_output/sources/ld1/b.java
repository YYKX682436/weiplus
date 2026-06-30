package ld1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld1.c f318055d;

    public b(ld1.c cVar) {
        this.f318055d = cVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        ld1.c cVar = this.f318055d;
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.F(cVar.f318058c.getAppId(), cVar.f318056a);
    }
}
