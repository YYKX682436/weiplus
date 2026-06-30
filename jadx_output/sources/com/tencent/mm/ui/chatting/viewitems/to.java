package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class to implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lp f205625e;

    public to(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.lp lpVar) {
        this.f205624d = dVar;
        this.f205625e = lpVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f205624d.P(true);
        this.f205625e.f204513k.f447173r = 1;
    }
}
