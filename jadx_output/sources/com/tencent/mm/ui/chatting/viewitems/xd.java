package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class xd implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.od f205981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ae f205982e;

    public xd(com.tencent.mm.ui.chatting.viewitems.ae aeVar, com.tencent.mm.ui.chatting.viewitems.od odVar) {
        this.f205982e = aeVar;
        this.f205981d = odVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f205982e.f203348s.P(true);
        this.f205981d.f205184g.f447173r = 1;
    }
}
