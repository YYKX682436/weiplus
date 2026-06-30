package com.tencent.mm.plugin.finder.nearby.ui.special.factory;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/special/factory/ThemeLargeLivingItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/ui/special/factory/ThemeLivingItemConvertFactory;", "", "type", "Lin5/r;", "getItemConvert", "screenWidth", "Ljz5/f0;", "updateLivingWidth", "Ldr2/a;", "convertOutsideOperator", "Ldr2/a;", "getConvertOutsideOperator", "()Ldr2/a;", "leftRightMargin", "I", "livingWidth", "Landroid/content/Context;", "context", "commentScene", "<init>", "(Landroid/content/Context;ILdr2/a;)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ThemeLargeLivingItemConvertFactory extends com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory {
    private final dr2.a convertOutsideOperator;
    private final int leftRightMargin;
    private int livingWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeLargeLivingItemConvertFactory(android.content.Context context, int i17, dr2.a convertOutsideOperator) {
        super(context, i17, 0.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(convertOutsideOperator, "convertOutsideOperator");
        this.convertOutsideOperator = convertOutsideOperator;
        int a17 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        this.leftRightMargin = a17;
        this.livingWidth = getScreenWidth() - (a17 * 2);
    }

    public final dr2.a getConvertOutsideOperator() {
        return this.convertOutsideOperator;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory, in5.s
    public in5.r getItemConvert(int type) {
        return type == 4 ? new yq2.a(this.livingWidth, 1.3333334f, getOutsideOperator(), this.convertOutsideOperator, new br2.a(this)) : createFinderEmptyConvert();
    }

    @Override // com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory
    public void updateLivingWidth(int i17) {
        this.livingWidth = i17 - (this.leftRightMargin * 2);
    }
}
