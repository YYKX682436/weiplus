package com.tencent.mm.plugin.music.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/music/ui/FloatBallMusicViewNew;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "clickListener", "Ljz5/f0;", "setOnMusicCoverClickListener", "", "coverPath", "setCoverPath", "", "h", "Ljz5/g;", "getPadding20", "()I", "padding20", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/music/ui/d", "plugin-music_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FloatBallMusicViewNew extends android.widget.RelativeLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f150674i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f150675d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f150676e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f150677f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f150678g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g padding20;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallMusicViewNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final int getPadding20() {
        return ((java.lang.Number) ((jz5.n) this.padding20).getValue()).intValue();
    }

    public final void a() {
        com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallMusicView", "loadMusicCover failed");
        android.widget.ImageView imageView = this.f150675d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f150675d;
        if (imageView2 != null) {
            imageView2.setPadding(getPadding20(), getPadding20(), getPadding20(), getPadding20());
        }
        android.widget.ImageView imageView3 = this.f150675d;
        if (imageView3 != null) {
            imageView3.setImageResource(com.tencent.mm.R.raw.icon_music_filled);
        }
    }

    public final void setCoverPath(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(this.f150677f, str)) {
            return;
        }
        this.f150677f = str == null ? "" : str;
        if (str == null || str.length() == 0) {
            a();
            return;
        }
        if (!r26.i0.y(str, "http", false) && !r26.i0.y(str, "https", false)) {
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, false);
            if (!com.tencent.mm.vfs.w6.j(i17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallMusicView", "setCoverPath file not exist %s", i17);
                a();
                return;
            } else {
                str = "file://" + i17;
            }
        }
        l01.d0.f314761a.m(new com.tencent.mm.plugin.music.ui.f(this, str), str, com.tencent.mm.plugin.music.ui.d.f150732d);
    }

    public final void setOnMusicCoverClickListener(android.view.View.OnClickListener onClickListener) {
        this.f150678g = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallMusicViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f150677f = "";
        this.padding20 = jz5.h.b(new com.tencent.mm.plugin.music.ui.g(this));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bo6, (android.view.ViewGroup) this, true);
        this.f150675d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.jyg);
        this.f150676e = inflate.findViewById(com.tencent.mm.R.id.jyh);
        android.widget.ImageView imageView = this.f150675d;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        android.view.View view = this.f150676e;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.music.ui.e(this));
        }
        android.widget.ImageView imageView2 = this.f150675d;
        if (imageView2 == null) {
            return;
        }
        imageView2.setImportantForAccessibility(2);
    }
}
