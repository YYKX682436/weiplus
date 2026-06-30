package gg1;

/* loaded from: classes7.dex */
public final class q extends com.tencent.mm.plugin.appbrand.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gg1.w f271619c;

    public q(gg1.w wVar) {
        this.f271619c = wVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.oc
    public boolean a(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (1 == event.getAction()) {
            return false;
        }
        gg1.w wVar = this.f271619c;
        yz5.p pVar = wVar.f271649v;
        if (pVar != null) {
        }
        wVar.e();
        return true;
    }
}
