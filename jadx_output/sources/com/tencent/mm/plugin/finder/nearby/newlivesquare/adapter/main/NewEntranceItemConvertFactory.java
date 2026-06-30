package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0011¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BaseFactory;", "", "type", "Lin5/r;", "getItemConvert", "screenWidth", "Ljz5/f0;", "updateLivingWidth", "Lcom/tencent/mm/ui/MMActivity;", "context", "Lcom/tencent/mm/ui/MMActivity;", "", "isForceNightMode", "Z", "isLocalCityPage", "commentScene", "I", "Lr45/qt2;", "contextObj", "Lr45/qt2;", "Lsp2/k;", "outsideOperator", "Lsp2/k;", "Lsp2/c4;", "autoPlayChecker", "Lsp2/c4;", "", "aspectRatio", "F", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "leftRightMargin", "livingWidth", "<init>", "(Lcom/tencent/mm/ui/MMActivity;ZZILr45/qt2;Lsp2/k;Lsp2/c4;)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NewEntranceItemConvertFactory extends com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory {
    private float aspectRatio;
    private final sp2.c4 autoPlayChecker;
    private final int commentScene;
    private final com.tencent.mm.ui.MMActivity context;
    private final r45.qt2 contextObj;
    private final boolean isForceNightMode;
    private final boolean isLocalCityPage;
    private final int leftRightMargin;
    private int livingWidth;
    private final sp2.k outsideOperator;
    private final int screenWidth;

    public NewEntranceItemConvertFactory(com.tencent.mm.ui.MMActivity context, boolean z17, boolean z18, int i17, r45.qt2 contextObj, sp2.k outsideOperator, sp2.c4 autoPlayChecker) {
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
        kotlin.jvm.internal.o.g(autoPlayChecker, "autoPlayChecker");
        this.context = context;
        this.isForceNightMode = z17;
        this.isLocalCityPage = z18;
        this.commentScene = i17;
        this.contextObj = contextObj;
        this.outsideOperator = outsideOperator;
        this.autoPlayChecker = autoPlayChecker;
        this.aspectRatio = 1.3333f;
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
        this.livingWidth = (i19 - (a18 * 3)) / 2;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory, in5.s
    public in5.r getItemConvert(int type) {
        if (type == -9996) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2(true, this.livingWidth, this.aspectRatio, this.outsideOperator, new up2.i(this));
        }
        if (type == -9994) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x4(true, this.livingWidth, this.aspectRatio, this.outsideOperator, new up2.j(this));
        }
        if (type == -9989) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t(this.livingWidth, this.aspectRatio, this.outsideOperator);
        }
        if (type == -5000) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.b3(this.outsideOperator);
        }
        if (type == -4998) {
            return new gq2.j(this.context, this.autoPlayChecker, this.outsideOperator);
        }
        if (type == 5) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.f(this.autoPlayChecker, this.outsideOperator);
        }
        if (type == 16) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5(this.autoPlayChecker, this.outsideOperator, this.aspectRatio, this.contextObj, this.livingWidth);
        }
        if (type == 19) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w1(this.autoPlayChecker, this.outsideOperator);
        }
        if (type == -9985) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.c2(true, this.livingWidth, this.aspectRatio, this.outsideOperator, new up2.k(this));
        }
        if (type == -9984) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t3(this.livingWidth, this.aspectRatio, this.outsideOperator, new up2.l(this));
        }
        if (type == 1) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1(this.context, this.autoPlayChecker, this.outsideOperator);
        }
        if (type == 2) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0(this.autoPlayChecker, this.outsideOperator);
        }
        if (type == 3) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5(this.autoPlayChecker, this.outsideOperator, this.aspectRatio, this.contextObj, this.livingWidth);
        }
        if (type == 7) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4(this.autoPlayChecker, this.outsideOperator);
        }
        if (type == 8) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.i2(this.autoPlayChecker, this.outsideOperator);
        }
        switch (type) {
            case 9999996:
                return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p0(this.context);
            case 9999997:
                return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.q0(true, this.livingWidth, this.aspectRatio);
            case 9999998:
                return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t0(this.context);
            default:
                return createFinderEmptyConvert();
        }
    }

    public final void setAspectRatio(float f17) {
        this.aspectRatio = f17;
    }

    public final void updateLivingWidth(int i17) {
        this.livingWidth = (i17 - (this.leftRightMargin * 3)) / 2;
    }
}
