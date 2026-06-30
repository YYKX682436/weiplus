package su3;

/* loaded from: classes5.dex */
public final class k extends su3.f {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f412787d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f412788e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView f412789f;

    /* renamed from: g, reason: collision with root package name */
    public final int f412790g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ su3.m f412791h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(su3.m mVar, android.view.View itemView) {
        super(mVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f412791h = mVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.non);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f412787d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.nop);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f412788e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.noo);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f412789f = (com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView) findViewById3;
        this.f412790g = i65.a.d(itemView.getContext(), com.tencent.mm.R.color.a9x);
    }

    @Override // su3.f
    public void i(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(info, "info");
        su3.m mVar = this.f412791h;
        boolean z17 = i17 == mVar.f412794e;
        this.itemView.setSelected(z17);
        android.graphics.drawable.Drawable i18 = i65.a.i(this.itemView.getContext(), mVar.f412797h);
        android.content.res.ColorStateList e17 = i65.a.e(this.itemView.getContext(), com.tencent.mm.R.color.f479527a75);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f412787d;
        weImageView.setImageDrawable(i18);
        weImageView.setIconColor(e17.getColorForState(weImageView.getDrawableState(), 0));
        if (info.f155714h.isEmpty()) {
            str = info.f155723t;
        } else {
            str = info.f155723t + " - " + com.tencent.mm.sdk.platformtools.t8.c1(info.f155714h, ",");
        }
        this.f412788e.setText(com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView.f156056o.a(str, mVar.f412795f, this.f412790g));
        java.util.ArrayList arrayList = info.f155713g;
        java.lang.String str2 = mVar.f412795f;
        com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView = this.f412789f;
        musicLrcView.b(arrayList, str2);
        musicLrcView.d(z17, -1);
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.nom);
        if (findViewById != null) {
            findViewById.setTag(com.tencent.mm.R.id.e5q, str);
        }
    }
}
