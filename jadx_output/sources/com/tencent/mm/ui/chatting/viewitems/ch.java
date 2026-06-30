package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ch implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.FoldableCellLayout f203729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb5.k0 f203730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203731f;

    public ch(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.view.FoldableCellLayout foldableCellLayout, sb5.k0 k0Var) {
        this.f203731f = chattingItemDyeingTemplate;
        this.f203729d = foldableCellLayout;
        this.f203730e = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f203729d.e(new com.tencent.mm.ui.chatting.viewitems.bh(this));
    }
}
