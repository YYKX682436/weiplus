package com.tencent.mm.plugin.vlog.ui.thumb;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B!\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/SegmentClipThumbSeekBarContainer;", "Landroid/widget/LinearLayout;", "Lbg0/x;", "behaviorHolder", "Ljz5/f0;", "setupBehaviorHolder", "d", "Lbg0/x;", "getBehaviorHolder", "()Lbg0/x;", "setBehaviorHolder", "(Lbg0/x;)V", "Lcom/tencent/mm/plugin/mmsight/segment/e;", "h", "Ljz5/g;", "getTrackViewGestureListener", "()Lcom/tencent/mm/plugin/mmsight/segment/e;", "trackViewGestureListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SegmentClipThumbSeekBarContainer extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public bg0.x behaviorHolder;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.ui.thumb.MediaListThumbView f176050e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.segment.f f176051f;

    /* renamed from: g, reason: collision with root package name */
    public bg0.y f176052g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g trackViewGestureListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentClipThumbSeekBarContainer(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.trackViewGestureListener = jz5.h.a(jz5.i.f302831f, new kp4.r0(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.cjf, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        android.view.KeyEvent.Callback findViewById = linearLayout.findViewById(com.tencent.mm.R.id.o6x);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.mmsight.segment.f fVar = (com.tencent.mm.plugin.mmsight.segment.f) findViewById;
        this.f176051f = fVar;
        android.view.View findViewById2 = linearLayout.findViewById(com.tencent.mm.R.id.jee);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f176050e = (com.tencent.mm.plugin.vlog.ui.thumb.MediaListThumbView) findViewById2;
        fVar.setSegmentThumbBarTouchListener(getTrackViewGestureListener());
    }

    private final com.tencent.mm.plugin.mmsight.segment.e getTrackViewGestureListener() {
        return (com.tencent.mm.plugin.mmsight.segment.e) this.trackViewGestureListener.getValue();
    }

    public final bg0.x getBehaviorHolder() {
        return this.behaviorHolder;
    }

    public final void setBehaviorHolder(bg0.x xVar) {
        this.behaviorHolder = xVar;
    }

    public final void setupBehaviorHolder(bg0.x behaviorHolder) {
        kotlin.jvm.internal.o.g(behaviorHolder, "behaviorHolder");
        this.behaviorHolder = behaviorHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentClipThumbSeekBarContainer(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.trackViewGestureListener = jz5.h.a(jz5.i.f302831f, new kp4.r0(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.cjf, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        android.view.KeyEvent.Callback findViewById = linearLayout.findViewById(com.tencent.mm.R.id.o6x);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.mmsight.segment.f fVar = (com.tencent.mm.plugin.mmsight.segment.f) findViewById;
        this.f176051f = fVar;
        android.view.View findViewById2 = linearLayout.findViewById(com.tencent.mm.R.id.jee);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f176050e = (com.tencent.mm.plugin.vlog.ui.thumb.MediaListThumbView) findViewById2;
        fVar.setSegmentThumbBarTouchListener(getTrackViewGestureListener());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentClipThumbSeekBarContainer(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.trackViewGestureListener = jz5.h.a(jz5.i.f302831f, new kp4.r0(this));
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.cjf, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        android.view.KeyEvent.Callback findViewById = linearLayout.findViewById(com.tencent.mm.R.id.o6x);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.mmsight.segment.f fVar = (com.tencent.mm.plugin.mmsight.segment.f) findViewById;
        this.f176051f = fVar;
        android.view.View findViewById2 = linearLayout.findViewById(com.tencent.mm.R.id.jee);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f176050e = (com.tencent.mm.plugin.vlog.ui.thumb.MediaListThumbView) findViewById2;
        fVar.setSegmentThumbBarTouchListener(getTrackViewGestureListener());
    }
}
