package com.tencent.mm.plugin.mv.ui.open.text_status;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0002R#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/open/text_status/MusicMvView;", "", "Landroid/widget/RelativeLayout;", "Ljz5/f0;", "getSongIdWithCheckPermission", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "e", "Ljz5/g;", "getVideoContainer", "()Landroid/widget/FrameLayout;", "videoContainer", "Lom3/c;", "f", "getLyricManager", "()Lom3/c;", "lyricManager", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final r45.hf2 f150896d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g videoContainer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g lyricManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        new fm3.u();
        this.f150896d = new r45.hf2();
        this.videoContainer = jz5.h.b(new om3.e(this));
        this.lyricManager = jz5.h.b(new om3.d(context, this));
        android.view.View.inflate(context, com.tencent.mm.R.layout.czv, this);
    }

    private final om3.c getLyricManager() {
        return (om3.c) ((jz5.n) this.lyricManager).getValue();
    }

    private final void getSongIdWithCheckPermission() {
        gm0.j1.d().g(new hm3.g(this.f150896d, hashCode()));
    }

    private final android.widget.FrameLayout getVideoContainer() {
        return (android.widget.FrameLayout) ((jz5.n) this.videoContainer).getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicMvView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
