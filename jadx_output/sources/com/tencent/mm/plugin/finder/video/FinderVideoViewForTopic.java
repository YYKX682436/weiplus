package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVideoViewForTopic;", "Lcom/tencent/mm/plugin/finder/video/FinderVideoView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FinderVideoViewForTopic extends com.tencent.mm.plugin.finder.video.FinderVideoView {

    /* renamed from: e2, reason: collision with root package name */
    public int f130735e2;

    public FinderVideoViewForTopic(android.content.Context context) {
        super(context);
        this.f130735e2 = 3;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderVideoView, com.tencent.mm.modelvideo.MMVideoView
    public boolean Z(int i17, com.tencent.mm.pointers.PInt start, com.tencent.mm.pointers.PInt end) {
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(end, "end");
        start.value = java.lang.Math.max(i17, this.E1);
        int i18 = this.f71651y1;
        if (i18 == 1) {
            start.value = i17;
            end.value = this.f130735e2 + i17 + 1;
        }
        int i19 = this.f130735e2;
        t21.n0 n0Var = this.J1;
        this.f130735e2 = i19 + n0Var.f414840a;
        if (i18 == 2) {
            int i27 = i17 - 8;
            start.value = i27;
            if (i27 < 0) {
                start.value = 0;
            }
            end.value = start.value + this.F1 + 8;
        }
        if (i18 == 3 || i18 == 4) {
            start.value = this.E1;
            int i28 = n0Var.f414841b;
            end.value = this.A1 + 1;
        }
        int i29 = end.value;
        int i37 = this.A1;
        if (i29 >= i37 + 1) {
            end.value = i37 + 1;
        }
        int i38 = end.value;
        int i39 = start.value;
        if (i38 < i39) {
            end.value = i39 + n0Var.f414841b;
            start();
        }
        return true;
    }

    public FinderVideoViewForTopic(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f130735e2 = 3;
    }
}
