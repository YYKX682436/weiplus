package com.tencent.mm.plugin.finder.video.sticker;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002'(B!\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b$\u0010&R2\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/sticker/StickerEffectView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "Lr45/p64;", "Ljz5/f0;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lyz5/l;", "getSelectionCallback", "()Lyz5/l;", "setSelectionCallback", "(Lyz5/l;)V", "selectionCallback", "Lkotlin/Function0;", "B", "Lyz5/a;", "getLoadMoreCallback", "()Lyz5/a;", "setLoadMoreCallback", "(Lyz5/a;)V", "loadMoreCallback", "Lqw2/a;", "moreDiffCallback", "Lqw2/a;", "getMoreDiffCallback", "()Lqw2/a;", "setMoreDiffCallback", "(Lqw2/a;)V", "historyDiffCallback", "getHistoryDiffCallback", "setHistoryDiffCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "qw2/k", "qw2/l", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class StickerEffectView extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: A, reason: from kotlin metadata */
    public yz5.l selectionCallback;

    /* renamed from: B, reason: from kotlin metadata */
    public yz5.a loadMoreCallback;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f130809v;

    /* renamed from: w, reason: collision with root package name */
    public final qw2.l f130810w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f130811x;

    /* renamed from: y, reason: collision with root package name */
    public r45.p64 f130812y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.p f130813z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerEffectView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f130809v = "MicroMsg.StickerEffectView";
        android.view.View.inflate(context, com.tencent.mm.R.layout.agc, this);
        setBackgroundResource(com.tencent.mm.R.drawable.f481633yl);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.d_2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.d_3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) findViewById2;
        ((com.google.android.material.tabs.TabLayout) findViewById).setupWithViewPager(viewPager);
        qw2.l lVar = new qw2.l(this);
        this.f130810w = lVar;
        viewPager.setAdapter(lVar);
        viewPager.setCurrentItem(1);
        this.f130813z = new qw2.h(this);
        u85.i.f425707a.e(new qw2.i(this));
    }

    public static final void A(com.tencent.mm.plugin.finder.video.sticker.StickerEffectView stickerEffectView, fp0.u uVar) {
        java.lang.String str = stickerEffectView.f130811x;
        if (str == null || uVar != fp0.u.f265290f) {
            yz5.l lVar = stickerEffectView.selectionCallback;
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        java.lang.String packDir = u85.i.f425707a.b(str);
        kotlin.jvm.internal.o.g(packDir, "packDir");
        t85.j jVar = new t85.j();
        jVar.f416476c = packDir;
        jVar.b(packDir);
        if (!jVar.a()) {
            com.tencent.mars.xlog.Log.i(stickerEffectView.f130809v, "onLoaderFin: sticker is not valid");
            com.tencent.mm.vfs.w6.f(packDir);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f416474a)) {
            java.lang.String str2 = stickerEffectView.f130811x;
            kotlin.jvm.internal.o.d(str2);
            jVar.f416474a = str2;
        }
        yz5.l lVar2 = stickerEffectView.selectionCallback;
        if (lVar2 != null) {
            lVar2.invoke(stickerEffectView.f130812y);
        }
    }

    public final qw2.a getHistoryDiffCallback() {
        return null;
    }

    public final yz5.a getLoadMoreCallback() {
        return this.loadMoreCallback;
    }

    public final qw2.a getMoreDiffCallback() {
        return null;
    }

    public final yz5.l getSelectionCallback() {
        return this.selectionCallback;
    }

    public final void setHistoryDiffCallback(qw2.a aVar) {
    }

    public final void setLoadMoreCallback(yz5.a aVar) {
        this.loadMoreCallback = aVar;
    }

    public final void setMoreDiffCallback(qw2.a aVar) {
    }

    public final void setSelectionCallback(yz5.l lVar) {
        this.selectionCallback = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerEffectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
