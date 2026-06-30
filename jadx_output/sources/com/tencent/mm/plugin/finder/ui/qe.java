package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class qe implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.TextModeSelectView f129735b;

    public qe(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, com.tencent.mm.view.TextModeSelectView textModeSelectView) {
        this.f129734a = finderSelectCoverUI;
        this.f129735b = textModeSelectView;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l lVar = new jz5.l("video_duration_time", java.lang.Integer.valueOf(this.f129734a.D1));
        com.tencent.mm.view.TextModeSelectView textModeSelectView = this.f129735b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(textModeSelectView.curMode);
        java.util.List list = textModeSelectView.modeList;
        return kz5.c1.k(lVar, new jz5.l("word_style", java.lang.Integer.valueOf(((java.lang.Number) list.get((list.indexOf(valueOf) + 1) % list.size())).intValue())));
    }
}
