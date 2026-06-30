package com.tencent.mm.ui.chatting.view;

/* loaded from: classes5.dex */
public final class n2 extends com.tencent.mm.sdk.event.n {
    public n2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.uq uqVar = event.f54679g;
        java.lang.String str = uqVar != null ? uqVar.f8126b : null;
        new com.tencent.mm.repairer.config.chatting.RepairerConfigResetMultiSelectCopyWarningDialog();
        if (!kotlin.jvm.internal.o.b(str, "RepairerConfig_ResetMultiSelectCopyWarningDialog")) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("MicroMsg.MultiSelectCopyWarningDialog", 2, null);
        N.putBoolean("multiselect_copy_warning_dialog_accepted", false);
        N.remove("multiselect_copy_warning_dialog_accepted");
        return true;
    }
}
