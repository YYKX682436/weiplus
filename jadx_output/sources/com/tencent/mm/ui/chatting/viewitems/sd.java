package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class sd implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.od f205512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.pd f205513e;

    public sd(com.tencent.mm.ui.chatting.viewitems.pd pdVar, com.tencent.mm.ui.chatting.viewitems.od odVar) {
        this.f205513e = pdVar;
        this.f205512d = odVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f205513e.f205251s.P(true);
        this.f205512d.f205184g.f447173r = 1;
    }
}
