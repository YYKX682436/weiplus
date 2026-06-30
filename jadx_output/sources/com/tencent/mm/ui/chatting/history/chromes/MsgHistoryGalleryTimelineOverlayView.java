package com.tencent.mm.ui.chatting.history.chromes;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryTimelineOverlayView;", "Lcom/tencent/mm/ui/immersive/ImmersiveBaseChromeView;", "", com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "Ljz5/f0;", "setTimelineText", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "", "g", "I", "getDefaultVisibility", "()I", "defaultVisibility", "Leh5/a;", "h", "Leh5/a;", "getImmersiveType", "()Leh5/a;", "immersiveType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MsgHistoryGalleryTimelineOverlayView extends com.tencent.mm.ui.immersive.ImmersiveBaseChromeView {

    /* renamed from: f, reason: collision with root package name */
    public em.f2 f201737f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int defaultVisibility;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final eh5.a immersiveType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryTimelineOverlayView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseChromeView
    public android.view.View a() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.eks, (android.view.ViewGroup) this, false);
        em.f2 f2Var = new em.f2(inflate);
        this.f201737f = f2Var;
        android.widget.TextView a17 = f2Var.a();
        vc5.t tVar = vc5.t.f435345a;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(a17, tVar);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseChromeView
    public int getDefaultVisibility() {
        return this.defaultVisibility;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseChromeView
    public eh5.a getImmersiveType() {
        return this.immersiveType;
    }

    public final void setTimelineText(long j17) {
        em.f2 f2Var = this.f201737f;
        if (f2Var != null) {
            f2Var.a().setText(k35.m1.f(getContext(), j17, false, false));
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryTimelineOverlayView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public /* synthetic */ MsgHistoryGalleryTimelineOverlayView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgHistoryGalleryTimelineOverlayView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.defaultVisibility = 8;
        this.immersiveType = eh5.a.f252953f;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        setLayoutParams(layoutParams);
    }

    public final void setTimelineText(java.lang.CharSequence text) {
        kotlin.jvm.internal.o.g(text, "text");
        em.f2 f2Var = this.f201737f;
        if (f2Var != null) {
            f2Var.a().setText(text);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }
}
