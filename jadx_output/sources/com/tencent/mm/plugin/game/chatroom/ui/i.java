package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes12.dex */
public class i implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI f138844d;

    public i(com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI gameImagePreviewUI) {
        this.f138844d = gameImagePreviewUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        this.f138844d.f138826n.o(null);
        g4Var.clear();
        g4Var.a(1, com.tencent.mm.R.string.i89);
    }
}
