package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class be implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.le f198733d;

    public be(com.tencent.mm.ui.chatting.component.le leVar) {
        this.f198733d = leVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        androidx.core.widget.NestedScrollView nestedScrollView = this.f198733d.f199415g;
        if (nestedScrollView != null) {
            nestedScrollView.e(33);
        }
    }
}
