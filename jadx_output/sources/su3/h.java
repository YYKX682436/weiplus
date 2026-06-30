package su3;

/* loaded from: classes5.dex */
public final class h extends su3.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f412781d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f412782e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView f412783f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.AudioWaveView f412784g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f412785h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ su3.m f412786i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(su3.m mVar, android.view.View itemView) {
        super(mVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f412786i = mVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.noh);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f412781d = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.noi);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f412782e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.nos);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f412783f = (com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.f487686pg2);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f412784g = (com.tencent.mm.plugin.recordvideo.ui.editor.AudioWaveView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.nog);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f412785h = (android.widget.ImageView) findViewById5;
    }

    @Override // su3.f
    public void i(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(info, "info");
        android.view.View view = this.itemView;
        android.content.Context context = view.getContext();
        su3.m mVar = this.f412786i;
        view.setBackground(i65.a.i(context, mVar.f412796g));
        android.view.ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i65.a.B(this.itemView.getContext()) - i65.a.b(this.itemView.getContext(), 80);
        }
        this.itemView.setEnabled(true);
        boolean z17 = i17 == mVar.f412794e;
        this.itemView.setSelected(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendMusicAdapter", "LogStory: " + z17);
        com.tencent.mm.plugin.recordvideo.ui.editor.AudioWaveView audioWaveView = this.f412784g;
        audioWaveView.setVisibility(0);
        android.content.res.ColorStateList e17 = i65.a.e(this.itemView.getContext(), mVar.f412799m);
        kotlin.jvm.internal.o.f(e17, "getColorStateList(...)");
        audioWaveView.setColor(e17);
        audioWaveView.setShow(z17);
        android.graphics.drawable.Drawable i18 = i65.a.i(this.itemView.getContext(), mVar.f412797h);
        android.content.res.ColorStateList e18 = i65.a.e(this.itemView.getContext(), mVar.f412798i);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f412782e;
        weImageView.setImageDrawable(i18);
        weImageView.setIconColor(e18.getColorForState(weImageView.getDrawableState(), 0));
        weImageView.setVisibility(0);
        android.content.res.ColorStateList e19 = i65.a.e(this.itemView.getContext(), mVar.f412800n);
        com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView = this.f412783f;
        musicLrcView.setTextColor(e19);
        java.util.ArrayList arrayList = info.f155713g;
        if (arrayList == null || arrayList.isEmpty()) {
            if (info.f155714h.isEmpty()) {
                str = info.f155723t;
            } else {
                str = info.f155723t + " - " + com.tencent.mm.sdk.platformtools.t8.c1(info.f155714h, ",");
            }
            musicLrcView.setText(str);
            musicLrcView.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
            musicLrcView.setMarqueeRepeatLimit(-1);
            musicLrcView.d(false, -1);
        } else {
            musicLrcView.b(info.f155713g, null);
            musicLrcView.setEllipsize(null);
            musicLrcView.d(z17, -1);
        }
        musicLrcView.setVisibility(0);
        android.view.View view2 = this.f412781d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$RecommendMusicViewHolder", "update", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$RecommendMusicViewHolder", "update", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z18 = info.f155725v.length() > 0;
        android.widget.ImageView imageView = this.f412785h;
        if (!z18) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            n11.a.b().g(info.f155725v, imageView);
        }
    }
}
