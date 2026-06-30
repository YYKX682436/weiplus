package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes4.dex */
public final class u7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC f151481d;

    public u7(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC) {
        this.f151481d = musicMvSongInfoUIC;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f151481d.getActivity().finish();
    }
}
