package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class ad implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f198618d;

    public ad(com.tencent.mm.ui.chatting.component.bd bdVar, android.view.View view) {
        this.f198618d = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f198618d.setBackgroundResource(com.tencent.mm.R.drawable.f481196mu);
    }
}
