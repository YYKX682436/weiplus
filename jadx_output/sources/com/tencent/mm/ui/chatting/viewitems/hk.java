package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class hk implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f204133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ik f204134e;

    public hk(com.tencent.mm.ui.chatting.viewitems.ik ikVar, android.view.View view) {
        this.f204134e = ikVar;
        this.f204133d = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.view.View view = this.f204133d;
        if (view.findViewById(com.tencent.mm.R.id.i2h) != null) {
            view.findViewById(com.tencent.mm.R.id.i2h).setBackgroundResource(com.tencent.mm.R.drawable.f481208n7);
        } else if (view.findViewById(com.tencent.mm.R.id.f484097d03) != null) {
            view.findViewById(com.tencent.mm.R.id.f484097d03).setBackgroundResource(com.tencent.mm.R.drawable.f481208n7);
        }
        this.f204134e.f204191d.P(true);
    }
}
