package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f150765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI f150766e;

    public l0(com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI, int i17) {
        this.f150766e = musicMainUI;
        this.f150765d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        kl3.z zVar = (kl3.z) ((kl3.i) sl3.b.b(kl3.i.class));
        java.util.ArrayList arrayList = (java.util.ArrayList) zVar.f308856e;
        if (arrayList.size() != 0) {
            int size = (this.f150765d - 100000) % arrayList.size();
            if (size < 0) {
                size += arrayList.size();
            }
            if (size != zVar.f308855d) {
                zVar.f308855d = size;
                ((kl3.t) zVar.B()).n(null);
            }
        }
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 == null) {
            return;
        }
        boolean t07 = z17.t0();
        com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI = this.f150766e;
        if (t07) {
            musicMainUI.V6(z17);
        }
        if (((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).y()) {
            musicMainUI.f150706h.setCanSlide(true);
        }
        int i17 = com.tencent.mm.plugin.music.ui.MusicMainUI.I;
        musicMainUI.X6(z17);
    }
}
