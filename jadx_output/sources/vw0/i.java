package vw0;

/* loaded from: classes5.dex */
public final class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView f440783d;

    public i(com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView captionView) {
        this.f440783d = captionView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        rw0.a aVar = this.f440783d.f69331r;
        if (aVar != null) {
            aVar.g3(true);
        }
    }
}
