package if3;

/* loaded from: classes.dex */
public final class j0 extends com.tencent.mm.sdk.event.n {
    public j0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (!"clicfg_masssend_image_migration_enabled".equals(((com.tencent.mm.autogen.events.ConfigUpdatedEvent) iEvent).f54072g.f7126a)) {
            return false;
        }
        if (if3.k0.Ni()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMassSend", "Enable MassSend image migration");
            if3.f0.c(false);
        }
        return true;
    }
}
