package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.ui.e f138842d;

    public f(com.tencent.mm.plugin.game.chatroom.ui.e eVar) {
        this.f138842d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.ui.e eVar = this.f138842d;
        eVar.f138839a.f138820e.f451633d.setVisibility(8);
        eVar.f138839a.f138820e.f451631b.setVisibility(8);
        eVar.f138839a.f138820e.f451634e.setVisibility(8);
        eVar.f138839a.f138820e.f451632c.setVisibility(8);
        eVar.f138839a.f138820e.f451631b.setVisibility(0);
        eVar.f138839a.f138820e.f451631b.setImageResource(com.tencent.mm.R.raw.image_download_fail_icon);
    }
}
