package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MusicPlayerEvent f150733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI.AnonymousClass4 f150734e;

    public d0(com.tencent.mm.plugin.music.ui.MusicMainUI.AnonymousClass4 anonymousClass4, com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
        this.f150734e = anonymousClass4;
        this.f150733d = musicPlayerEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.music.ui.u uVar = com.tencent.mm.plugin.music.ui.MusicMainUI.this.f150708m;
        java.lang.String str = this.f150733d.f54512g.f7038d;
        java.util.Iterator it = uVar.f150802m.entrySet().iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            com.tencent.mm.plugin.music.ui.t tVar = (com.tencent.mm.plugin.music.ui.t) ((android.view.View) ((java.util.Map.Entry) it.next()).getValue()).getTag();
            if (tVar.f150779a.field_musicId.equals(str)) {
                tVar.c(ll3.o2.Ai().y0(str), true);
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainAdapter", "holder song id is not exist, do refresh all");
        uVar.notifyDataSetChanged();
    }
}
