package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class eh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.FoldableCellLayout f203879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb5.g0 f203880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203881f;

    public eh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, com.tencent.mm.ui.chatting.view.FoldableCellLayout foldableCellLayout, sb5.g0 g0Var) {
        this.f203881f = chattingItemDyeingTemplate;
        this.f203879d = foldableCellLayout;
        this.f203880e = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f203879d.e(new com.tencent.mm.ui.chatting.viewitems.dh(this));
    }
}
