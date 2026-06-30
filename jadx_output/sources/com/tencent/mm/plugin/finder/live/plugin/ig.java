package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ig implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f112972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f112973c;

    public ig(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, java.util.List list, kotlin.jvm.internal.f0 f0Var) {
        this.f112971a = mgVar;
        this.f112972b = list;
        this.f112973c = f0Var;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112971a;
        mgVar.D.f22180m.clear();
        mgVar.D.f22180m.addAll(this.f112972b);
        try {
            mgVar.D.notifyItemRangeChanged(i17, i18, 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[updateComments] notifyItemRangeChanged, err = " + e17.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        this.f112973c.f310116d = i18;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112971a;
        mgVar.D.f22180m.clear();
        mgVar.D.f22180m.addAll(this.f112972b);
        try {
            mgVar.D.notifyItemRangeInserted(i17, i18);
            java.util.Objects.toString(mgVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[updateComments] notifyItemRangeInserted, err = " + e17.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112971a;
        mgVar.D.f22180m.clear();
        mgVar.D.f22180m.addAll(this.f112972b);
        try {
            mgVar.D.notifyItemRangeRemoved(i17, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[updateComments] notifyItemRangeRemoved, err = " + e17.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        try {
            this.f112971a.D.notifyItemMoved(i17, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[updateComments] notifyItemMoved, err = " + e17.getMessage());
        }
    }
}
