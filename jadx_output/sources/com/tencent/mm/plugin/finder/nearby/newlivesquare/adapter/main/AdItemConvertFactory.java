package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/AdItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BaseFactory;", "", "type", "Lin5/r;", "getItemConvert", "Lcom/tencent/mm/ui/MMActivity;", "context", "Lcom/tencent/mm/ui/MMActivity;", "", "isForceNightMode", "Z", "isLocalCityPage", "commentScene", "I", "isMoreThanOne", "<init>", "(Lcom/tencent/mm/ui/MMActivity;ZZIZ)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AdItemConvertFactory extends com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory {
    private final int commentScene;
    private final com.tencent.mm.ui.MMActivity context;
    private final boolean isForceNightMode;
    private final boolean isLocalCityPage;
    private final boolean isMoreThanOne;

    public AdItemConvertFactory(com.tencent.mm.ui.MMActivity context, boolean z17, boolean z18, int i17, boolean z19) {
        kotlin.jvm.internal.o.g(context, "context");
        this.context = context;
        this.isForceNightMode = z17;
        this.isLocalCityPage = z18;
        this.commentScene = i17;
        this.isMoreThanOne = z19;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BaseFactory, in5.s
    public in5.r getItemConvert(int type) {
        return type == 8 ? new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.c(this.isMoreThanOne) : createFinderEmptyConvert();
    }
}
