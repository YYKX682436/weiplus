package jm3;

/* loaded from: classes8.dex */
public final class s0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvPostUI f300351d;

    public s0(com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI) {
        this.f300351d = musicMvPostUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI = this.f300351d;
        g4Var.f(1, musicMvPostUI.getContext().getResources().getString(com.tencent.mm.R.string.f490407u4));
        g4Var.f(2, musicMvPostUI.getContext().getResources().getString(com.tencent.mm.R.string.h4m));
    }
}
