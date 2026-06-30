package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028BX\u0082\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BigBannerItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BaseFactory;", "", "type", "Lin5/r;", "getItemConvert", "Lcom/tencent/mm/ui/MMActivity;", "context", "Lcom/tencent/mm/ui/MMActivity;", "", "isForceNightMode", "Z", "isLocalCityPage", "commentScene", "I", "Lsp2/k;", "outsideOperator", "Lsp2/k;", "screenWidth", "getScreenWidth", "()I", "leftRightMargin", "livingWidth", "<init>", "(Lcom/tencent/mm/ui/MMActivity;ZZILsp2/k;)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BigBannerItemConvertFactory extends com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory {
    private final int commentScene;
    private final com.tencent.mm.ui.MMActivity context;
    private final boolean isForceNightMode;
    private final boolean isLocalCityPage;
    private final int leftRightMargin;
    private final int livingWidth;
    private final sp2.k outsideOperator;
    private final int screenWidth;

    public BigBannerItemConvertFactory(com.tencent.mm.ui.MMActivity context, boolean z17, boolean z18, int i17, sp2.k outsideOperator) {
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
        this.context = context;
        this.isForceNightMode = z17;
        this.isLocalCityPage = z18;
        this.commentScene = i17;
        this.outsideOperator = outsideOperator;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z19 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i19 = a17.f197135a;
        if (!z19 && i19 > (i18 = a17.f197136b)) {
            i19 = i18;
        }
        this.screenWidth = i19;
        int a18 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        this.leftRightMargin = a18;
        this.livingWidth = getScreenWidth() - (a18 * 2);
    }

    private final int getScreenWidth() {
        if (!com.tencent.mm.ui.bk.Q()) {
            return this.screenWidth;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        return com.tencent.mm.ui.zk.a(context, context.getResources().getConfiguration().screenWidthDp);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory, in5.s
    public in5.r getItemConvert(int type) {
        return type == 2 ? new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2(true, this.livingWidth, 1.0f, this.outsideOperator, new up2.d(this)) : createFinderEmptyConvert();
    }
}
