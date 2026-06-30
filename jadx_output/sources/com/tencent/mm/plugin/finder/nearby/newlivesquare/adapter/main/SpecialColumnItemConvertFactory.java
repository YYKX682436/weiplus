package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/SpecialColumnItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BaseFactory;", "", "type", "Lin5/r;", "getItemConvert", "Lcom/tencent/mm/ui/MMActivity;", "context", "Lcom/tencent/mm/ui/MMActivity;", "", "isForceNightMode", "Z", "isLocalCityPage", "commentScene", "I", "Lsp2/k;", "outsideOperator", "Lsp2/k;", "Lr45/qt2;", "contextObj", "Lr45/qt2;", "livingWidth", "", "aspectRatio", "F", "getAspectRatio", "()F", "specialColumnCellWidth", "<init>", "(Lcom/tencent/mm/ui/MMActivity;ZZILsp2/k;Lr45/qt2;IF)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SpecialColumnItemConvertFactory extends com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory {
    private final float aspectRatio;
    private final int commentScene;
    private final com.tencent.mm.ui.MMActivity context;
    private final r45.qt2 contextObj;
    private final boolean isForceNightMode;
    private final boolean isLocalCityPage;
    private final int livingWidth;
    private final sp2.k outsideOperator;
    private final int specialColumnCellWidth;

    public /* synthetic */ SpecialColumnItemConvertFactory(com.tencent.mm.ui.MMActivity mMActivity, boolean z17, boolean z18, int i17, sp2.k kVar, r45.qt2 qt2Var, int i18, float f17, int i19, kotlin.jvm.internal.i iVar) {
        this(mMActivity, z17, z18, i17, kVar, qt2Var, i18, (i19 & 128) != 0 ? 1.7776f : f17);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory, in5.s
    public in5.r getItemConvert(int type) {
        if (type == -1000) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.c3(this.outsideOperator);
        }
        if (type == 4) {
            return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2(true, this.specialColumnCellWidth, this.aspectRatio, this.outsideOperator, new up2.p(this));
        }
        if (type != 5) {
            return type != 6 ? type != 7 ? createFinderEmptyConvert() : new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.s1(this.outsideOperator) : new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x4(true, this.specialColumnCellWidth, this.aspectRatio, this.outsideOperator, new up2.q(this));
        }
        return (this.aspectRatio > 1.3333334f ? 1 : (this.aspectRatio == 1.3333334f ? 0 : -1)) == 0 ? new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.q3(this.contextObj) : new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.j3(this.contextObj);
    }

    public SpecialColumnItemConvertFactory(com.tencent.mm.ui.MMActivity context, boolean z17, boolean z18, int i17, sp2.k outsideOperator, r45.qt2 contextObj, int i18, float f17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.context = context;
        this.isForceNightMode = z17;
        this.isLocalCityPage = z18;
        this.commentScene = i17;
        this.outsideOperator = outsideOperator;
        this.contextObj = contextObj;
        this.livingWidth = i18;
        this.aspectRatio = f17;
        this.specialColumnCellWidth = (int) java.lang.Math.ceil(i18 * 0.92f);
    }
}
