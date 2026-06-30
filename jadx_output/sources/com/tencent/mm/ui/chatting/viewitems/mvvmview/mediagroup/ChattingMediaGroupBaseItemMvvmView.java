package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0003B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&R\"\u0010\t\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupBaseItemMvvmView;", "Lb11/a;", "VM", "Lcom/tencent/mm/mvvm/MvvmView;", "Landroid/graphics/Bitmap;", "getBitmap", "", "g", "Z", "isTopView", "()Z", "setTopView", "(Z)V", "Ljava/lang/Class;", "h", "Ljz5/g;", "getResolvedViewModelClazz", "()Ljava/lang/Class;", "resolvedViewModelClazz", "", "value", "getMaskAlpha", "()F", "setMaskAlpha", "(F)V", "maskAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public abstract class ChattingMediaGroupBaseItemMvvmView<VM extends b11.a> extends com.tencent.mm.mvvm.MvvmView<b11.a> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f204700i = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.chatting.widget.RoundClipFrameLayout f204701f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isTopView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g resolvedViewModelClazz;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingMediaGroupBaseItemMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final java.lang.Class<? extends b11.a> getResolvedViewModelClazz() {
        return (java.lang.Class) this.resolvedViewModelClazz.getValue();
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public final android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.chatting.widget.RoundClipFrameLayout roundClipFrameLayout = new com.tencent.mm.chatting.widget.RoundClipFrameLayout(context, null, 0, 6, null);
        roundClipFrameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) (com.tencent.mm.ui.gk.c() * 3), (int) (com.tencent.mm.ui.gk.c() * 4)));
        roundClipFrameLayout.addView(g(context));
        roundClipFrameLayout.setClipRadius(context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv));
        roundClipFrameLayout.setInnerStrokeColor(context.getColor(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.BW_100_Alpha_0_1_5 : com.tencent.mm.R.color.BW_100_Alpha_0_3));
        roundClipFrameLayout.setInnerStrokeWidth(context.getResources().getDimension(com.tencent.mm.R.dimen.f479642bh));
        roundClipFrameLayout.setOuterStrokeColor(context.getColor(com.tencent.mm.R.color.f479307vn));
        roundClipFrameLayout.setOuterStrokeWidth(context.getResources().getDimension(com.tencent.mm.R.dimen.f479641bg));
        roundClipFrameLayout.setMaskColor(-16777216);
        roundClipFrameLayout.setMaskAlpha(0.0f);
        this.f204701f = roundClipFrameLayout;
        return roundClipFrameLayout;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        b11.a aVar = (b11.a) pVar;
        b11.a aVar2 = (b11.a) pVar2;
        if (aVar2 == null) {
            return;
        }
        if (i(aVar2)) {
            if (aVar == null) {
                aVar = null;
            }
            j(aVar, aVar2);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingMediaGroupBaseItemMvvmView", "onUpdateViewModel, not available viewModel: " + aVar2.getClass());
        }
    }

    public abstract android.view.View g(android.content.Context context);

    public abstract android.graphics.Bitmap getBitmap();

    public final float getMaskAlpha() {
        com.tencent.mm.chatting.widget.RoundClipFrameLayout roundClipFrameLayout = this.f204701f;
        if (roundClipFrameLayout != null) {
            return roundClipFrameLayout.getMaskAlpha();
        }
        kotlin.jvm.internal.o.o("clipContainer");
        throw null;
    }

    public final java.lang.Class h(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
            if (rawType instanceof java.lang.Class) {
                return (java.lang.Class) rawType;
            }
        } else if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.Type[] upperBounds = ((java.lang.reflect.WildcardType) type).getUpperBounds();
            kotlin.jvm.internal.o.f(upperBounds, "getUpperBounds(...)");
            return h((java.lang.reflect.Type) kz5.z.O(upperBounds));
        }
        return null;
    }

    public final boolean i(b11.a viewModel) {
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        return getResolvedViewModelClazz().isInstance(viewModel);
    }

    public abstract void j(b11.a aVar, b11.a aVar2);

    public void k(boolean z17) {
        this.isTopView = z17;
    }

    public void l() {
    }

    public final void m(android.view.View view, android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(listener, "listener");
        view.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.b(this, listener));
    }

    public final void setMaskAlpha(float f17) {
        com.tencent.mm.chatting.widget.RoundClipFrameLayout roundClipFrameLayout = this.f204701f;
        if (roundClipFrameLayout != null) {
            roundClipFrameLayout.setMaskAlpha(f17);
        } else {
            kotlin.jvm.internal.o.o("clipContainer");
            throw null;
        }
    }

    public final void setTopView(boolean z17) {
        this.isTopView = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingMediaGroupBaseItemMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.resolvedViewModelClazz = jz5.h.a(jz5.i.f302831f, new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.a(this));
    }
}
