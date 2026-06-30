package mg1;

/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ChangeLanguageEvent event = (com.tencent.mm.autogen.events.ChangeLanguageEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String language = event.f54031g.f8162a;
        kotlin.jvm.internal.o.f(language, "language");
        com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().N(new mg1.a(language));
        return false;
    }
}
