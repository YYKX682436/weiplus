package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ko implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lp f204366e;

    public ko(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.lp lpVar) {
        this.f204365d = dVar;
        this.f204366e = lpVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f204365d.P(true);
        this.f204366e.f204515m.f447173r = 1;
    }
}
