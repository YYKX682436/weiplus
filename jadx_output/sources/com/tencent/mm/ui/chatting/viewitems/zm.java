package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class zm implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f206167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f206168e;

    public zm(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.ao aoVar) {
        this.f206167d = dVar;
        this.f206168e = aoVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f206167d.P(true);
        this.f206168e.f203391n.f447173r = 1;
    }
}
