package uo1;

/* loaded from: classes5.dex */
public final class m implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.k f429577a;

    public m(com.tencent.mm.plugin.backup.roambackup.k kVar) {
        this.f429577a = kVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92553a.f(this.f429577a);
    }
}
