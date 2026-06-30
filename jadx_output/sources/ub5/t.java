package ub5;

/* loaded from: classes8.dex */
public final class t implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.wp f426253d;

    public t(com.tencent.mm.ui.chatting.component.wp wpVar) {
        this.f426253d = wpVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        gm0.b bVar;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        com.tencent.mm.ui.chatting.component.wp wpVar = this.f426253d;
        if (wpVar == null || (bVar = gm0.j1.b().f273245h) == null || (lifecycleScope = bVar.f273145e) == null) {
            return;
        }
        v65.i.b(lifecycleScope, null, new com.tencent.mm.ui.chatting.component.up(wpVar, null), 1, null);
    }
}
