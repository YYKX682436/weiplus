package com.tencent.mm.plugin.finder.nearby.ui.special.factory;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/special/factory/ThemeSmallLivingItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/ui/special/factory/ThemeLivingItemConvertFactory;", "", "type", "Lin5/r;", "getItemConvert", "screenWidth", "Ljz5/f0;", "updateLivingWidth", "leftRightMargin", "I", "livingWidth", "Landroid/content/Context;", "context", "commentScene", "", "aspectRatio", "<init>", "(Landroid/content/Context;IF)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ThemeSmallLivingItemConvertFactory extends com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory {
    private final int leftRightMargin;
    private int livingWidth;

    public /* synthetic */ ThemeSmallLivingItemConvertFactory(android.content.Context context, int i17, float f17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, i17, (i18 & 4) != 0 ? 1.7776f : f17);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory, in5.s
    public in5.r getItemConvert(int type) {
        return type != 4 ? type != 13 ? createFinderEmptyConvert() : new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.b4(this.livingWidth, getAspectRatio(), getOutsideOperator(), new br2.f(this)) : new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2(true, this.livingWidth, getAspectRatio(), getOutsideOperator(), new br2.e(this));
    }

    @Override // com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory
    public void updateLivingWidth(int i17) {
        this.livingWidth = i17 - (this.leftRightMargin * 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSmallLivingItemConvertFactory(android.content.Context context, int i17, float f17) {
        super(context, i17, f17);
        kotlin.jvm.internal.o.g(context, "context");
        int a17 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        this.leftRightMargin = a17;
        this.livingWidth = (getScreenWidth() - (a17 * 3)) / 2;
    }
}
