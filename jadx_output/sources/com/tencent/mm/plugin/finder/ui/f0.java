package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class f0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI f129114d;

    public f0(com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI finderAggregationSettingUI) {
        this.f129114d = finderAggregationSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129114d.finish();
        return true;
    }
}
