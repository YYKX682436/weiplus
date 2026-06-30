package xk3;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f455048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMImageView f455049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xk3.o f455050f;

    public m(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.ui.MMImageView mMImageView, xk3.o oVar) {
        this.f455048d = weImageView;
        this.f455049e = mMImageView;
        this.f455050f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f455048d;
        weImageView.setVisibility(0);
        this.f455049e.setVisibility(8);
        if (this.f455050f.f455054i) {
            weImageView.setImageResource(com.tencent.mm.R.raw.music_filled);
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.audio_filled);
        }
    }
}
