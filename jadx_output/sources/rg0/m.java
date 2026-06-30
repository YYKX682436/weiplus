package rg0;

/* loaded from: classes15.dex */
public final class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent event = (com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.ti tiVar = event.f54470g;
        if (tiVar != null) {
            rg0.t tVar = rg0.t.f395191a;
            boolean z17 = tiVar.f8013a;
            java.lang.String str = tiVar.f8014b;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = tiVar.f8016d;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = tiVar.f8015c;
            java.lang.String str4 = str3 != null ? str3 : "";
            if ((str.compareTo("wxalite3315c0ca15ac6d9bb2ba2a4d8feb0e5a@pay") == 0 || str.compareTo("wxalited990fc783e5711cc47206cf5dd6d45a8@pay") == 0) && z17) {
                if (!(str4.length() == 0) && (str.compareTo("wxalite3315c0ca15ac6d9bb2ba2a4d8feb0e5a@pay") != 0 || tVar.a(str2, rg0.t.f395196f) > 0)) {
                    kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new rg0.q(str4, str2, null), 3, null);
                }
            }
        }
        return false;
    }
}
