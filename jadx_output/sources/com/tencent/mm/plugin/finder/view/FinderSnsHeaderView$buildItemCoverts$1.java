package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$buildItemCoverts$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderSnsHeaderView$buildItemCoverts$1 implements in5.s {
    final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView this$0;

    public FinderSnsHeaderView$buildItemCoverts$1(com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView) {
        this.this$0 = finderSnsHeaderView;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        if (type == 2004) {
            return new com.tencent.mm.plugin.finder.convert.ev();
        }
        if (type != 2015) {
            hc2.l.a(this.this$0.f131460d, type);
            return new com.tencent.mm.plugin.finder.convert.z2();
        }
        com.tencent.mm.plugin.finder.convert.hx hxVar = new com.tencent.mm.plugin.finder.convert.hx();
        com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView = this.this$0;
        hxVar.f103626e = 1;
        float min = (java.lang.Math.min(finderSnsHeaderView.getContext().getResources().getDisplayMetrics().heightPixels, finderSnsHeaderView.getContext().getResources().getDisplayMetrics().widthPixels) - i65.a.b(finderSnsHeaderView.getContext(), 16)) / 3.5f;
        if (min <= 0.0f) {
            min = finderSnsHeaderView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.by);
        }
        hxVar.f103627f = (int) ((min * 4) / 3);
        return hxVar;
    }
}
