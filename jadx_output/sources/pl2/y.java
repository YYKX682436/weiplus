package pl2;

/* loaded from: classes3.dex */
public final class y extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.azo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r8, in5.c r9, int r10, int r11, boolean r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl2.y.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.mwa);
        findViewById.setBackground(null);
        android.content.Context context = findViewById.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = new com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView(context, 3);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1);
        layoutParams.f10906q = 0;
        layoutParams.f10908s = 0;
        layoutParams.f10893h = 0;
        layoutParams.f10899k = 0;
        nearbyLivePreviewView.setLayoutParams(layoutParams);
        nearbyLivePreviewView.setId(com.tencent.mm.R.id.toa);
        nearbyLivePreviewView.setMute(true);
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.k69);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        ym5.v6.b(findViewById2, nearbyLivePreviewView);
    }
}
