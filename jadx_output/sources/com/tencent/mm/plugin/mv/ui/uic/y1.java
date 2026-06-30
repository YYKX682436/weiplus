package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f151546d = musicMvMainUIC;
        this.f151547e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151546d;
        musicMvMainUIC.T6().notifyItemChanged(0, com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.f150973J);
        db5.t7.i(this.f151547e, musicMvMainUIC.getString(com.tencent.mm.R.string.f490521xh), com.tencent.mm.R.raw.icons_filled_done);
        return jz5.f0.f302826a;
    }
}
