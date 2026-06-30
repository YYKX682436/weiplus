package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+B#\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b*\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u0013R\u001b\u0010\u001f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR\u001b\u0010\"\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b!\u0010\u0013R\u001b\u0010%\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010\u000e¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/ECProductCardView;", "Landroid/widget/FrameLayout;", "Lr45/rg0;", "productInfo", "Ljz5/f0;", "setProductImg", "setProductTitle", "setProductPrice", "setProductSourceInfo", "setShowBoxItems", "Landroid/widget/ImageView;", "d", "Ljz5/g;", "getProductImg", "()Landroid/widget/ImageView;", "productImg", "Landroid/widget/TextView;", "e", "getTitle", "()Landroid/widget/TextView;", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "Landroid/view/ViewGroup;", "f", "getShowBoxContainer", "()Landroid/view/ViewGroup;", "showBoxContainer", "g", "getProductPrice", "productPrice", "h", "getProductSourceIv", "productSourceIv", "i", "getProductSourceTv", "productSourceTv", "m", "getProductSourcePlatformLogo", "productSourcePlatformLogo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ECProductCardView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g productImg;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g title;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g showBoxContainer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g productPrice;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g productSourceIv;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g productSourceTv;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g productSourcePlatformLogo;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f130843n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECProductCardView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e49, (android.view.ViewGroup) this, true);
        this.productImg = jz5.h.b(new com.tencent.mm.plugin.finder.view.f1(this));
        this.title = jz5.h.b(new com.tencent.mm.plugin.finder.view.m1(this));
        this.showBoxContainer = jz5.h.b(new com.tencent.mm.plugin.finder.view.l1(this));
        this.productPrice = jz5.h.b(new com.tencent.mm.plugin.finder.view.g1(this));
        this.productSourceIv = jz5.h.b(new com.tencent.mm.plugin.finder.view.h1(this));
        this.productSourceTv = jz5.h.b(new com.tencent.mm.plugin.finder.view.j1(this));
        this.productSourcePlatformLogo = jz5.h.b(new com.tencent.mm.plugin.finder.view.i1(this));
        java.lang.Object context2 = getContext();
        this.f130843n = new com.tencent.mm.sdk.coroutines.LifecycleScope("ECProductCardView", context2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context2 : null, 0, 4, null);
    }

    private final android.widget.ImageView getProductImg() {
        java.lang.Object value = this.productImg.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    private final android.widget.TextView getProductPrice() {
        java.lang.Object value = this.productPrice.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    private final android.widget.ImageView getProductSourceIv() {
        java.lang.Object value = this.productSourceIv.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    private final android.widget.ImageView getProductSourcePlatformLogo() {
        java.lang.Object value = this.productSourcePlatformLogo.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    private final android.widget.TextView getProductSourceTv() {
        java.lang.Object value = this.productSourceTv.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.ViewGroup getShowBoxContainer() {
        java.lang.Object value = this.showBoxContainer.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    private final android.widget.TextView getTitle() {
        java.lang.Object value = this.title.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    private final void setProductImg(r45.rg0 rg0Var) {
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d f17 = g1Var.f();
        java.util.LinkedList list = rg0Var.getList(2);
        kotlin.jvm.internal.o.f(list, "getImg_urls(...)");
        f17.c(new mn2.q3((java.lang.String) kz5.n0.Z(list), com.tencent.mm.plugin.finder.storage.y90.f128356f), getProductImg(), g1Var.h(mn2.f1.f329967u));
    }

    private final void setProductPrice(r45.rg0 rg0Var) {
        hc2.o.a(getProductPrice(), false);
        getProductPrice().setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eef, ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ui(rg0Var.getInteger(5))));
    }

    private final void setProductSourceInfo(r45.rg0 rg0Var) {
        java.lang.String string = rg0Var.getString(37);
        boolean z17 = true;
        boolean z18 = string == null || string.length() == 0;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (z18) {
            getProductSourceIv().setVisibility(8);
        } else {
            g1Var.f().c(new mn2.q3(rg0Var.getString(37), com.tencent.mm.plugin.finder.storage.y90.f128356f), getProductSourceIv(), g1Var.h(mn2.f1.f329967u));
            getProductSourceIv().setVisibility(0);
        }
        java.lang.String string2 = rg0Var.getString(38);
        if (string2 != null && string2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            getProductSourcePlatformLogo().setVisibility(8);
        } else {
            g1Var.f().c(new mn2.q3(rg0Var.getString(38), com.tencent.mm.plugin.finder.storage.y90.f128356f), getProductSourcePlatformLogo(), g1Var.h(mn2.f1.f329967u));
            getProductSourcePlatformLogo().setVisibility(0);
        }
        getProductSourceTv().setText(rg0Var.getString(7));
    }

    private final void setProductTitle(r45.rg0 rg0Var) {
        getTitle().setText(rg0Var.getString(1));
    }

    private final void setShowBoxItems(r45.rg0 rg0Var) {
        v65.i.c(this.f130843n, null, new com.tencent.mm.plugin.finder.view.k1(this, rg0Var, null), 1, null);
    }

    public final void b(r45.rg0 productInfo) {
        kotlin.jvm.internal.o.g(productInfo, "productInfo");
        setProductImg(productInfo);
        setProductTitle(productInfo);
        setProductPrice(productInfo);
        setProductSourceInfo(productInfo);
        setShowBoxItems(productInfo);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECProductCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e49, (android.view.ViewGroup) this, true);
        this.productImg = jz5.h.b(new com.tencent.mm.plugin.finder.view.f1(this));
        this.title = jz5.h.b(new com.tencent.mm.plugin.finder.view.m1(this));
        this.showBoxContainer = jz5.h.b(new com.tencent.mm.plugin.finder.view.l1(this));
        this.productPrice = jz5.h.b(new com.tencent.mm.plugin.finder.view.g1(this));
        this.productSourceIv = jz5.h.b(new com.tencent.mm.plugin.finder.view.h1(this));
        this.productSourceTv = jz5.h.b(new com.tencent.mm.plugin.finder.view.j1(this));
        this.productSourcePlatformLogo = jz5.h.b(new com.tencent.mm.plugin.finder.view.i1(this));
        java.lang.Object context2 = getContext();
        this.f130843n = new com.tencent.mm.sdk.coroutines.LifecycleScope("ECProductCardView", context2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context2 : null, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECProductCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e49, (android.view.ViewGroup) this, true);
        this.productImg = jz5.h.b(new com.tencent.mm.plugin.finder.view.f1(this));
        this.title = jz5.h.b(new com.tencent.mm.plugin.finder.view.m1(this));
        this.showBoxContainer = jz5.h.b(new com.tencent.mm.plugin.finder.view.l1(this));
        this.productPrice = jz5.h.b(new com.tencent.mm.plugin.finder.view.g1(this));
        this.productSourceIv = jz5.h.b(new com.tencent.mm.plugin.finder.view.h1(this));
        this.productSourceTv = jz5.h.b(new com.tencent.mm.plugin.finder.view.j1(this));
        this.productSourcePlatformLogo = jz5.h.b(new com.tencent.mm.plugin.finder.view.i1(this));
        java.lang.Object context2 = getContext();
        this.f130843n = new com.tencent.mm.sdk.coroutines.LifecycleScope("ECProductCardView", context2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context2 : null, 0, 4, null);
    }
}
