package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public final class e implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f159534a;

    public e(yz5.a aVar) {
        this.f159534a = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        yz5.a aVar = this.f159534a;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
