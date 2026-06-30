package ws2;

/* loaded from: classes3.dex */
public final class j extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f449056d;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.ArrayList arrayList = this.f449056d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r8, int r9) {
        /*
            r7 = this;
            ws2.i r8 = (ws2.i) r8
            java.lang.String r0 = "vh"
            kotlin.jvm.internal.o.g(r8, r0)
            if (r9 < 0) goto L12
            int r0 = r7.getItemCount()
            if (r9 >= r0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            java.lang.String r1 = "FinderLiveReplayViewCallback"
            r2 = 0
            if (r0 == 0) goto L23
            java.util.ArrayList r0 = r7.f449056d
            if (r0 == 0) goto L39
            java.lang.Object r0 = r0.get(r9)
            km2.m r0 = (km2.m) r0
            goto L3a
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "getData invalid pos:"
            r0.<init>(r3)
            r0.append(r9)
            r3 = 33
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
        L39:
            r0 = r2
        L3a:
            android.view.View r3 = r8.itemView
            r4 = 2131307302(0x7f092b26, float:1.8232827E38)
            android.view.View r3 = r3.findViewById(r4)
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r3 = (com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "replay_step2-1:bind view,"
            r4.<init>(r5)
            if (r0 == 0) goto L55
            com.tencent.mm.live.api.LiveConfig r5 = r0.f309129d
            if (r5 == 0) goto L55
            java.lang.String r5 = r5.f68551u
            goto L56
        L55:
            r5 = r2
        L56:
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            if (r0 == 0) goto L67
            com.tencent.mm.live.api.LiveConfig r5 = r0.f309129d
            if (r5 == 0) goto L67
            java.lang.String r5 = r5.M
            goto L68
        L67:
            r5 = r2
        L68:
            r4.append(r5)
            java.lang.String r5 = ",pos:"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r9 = "(itemCount:"
            r4.append(r9)
            int r9 = r7.getItemCount()
            r4.append(r9)
            java.lang.String r9 = "),liveId:"
            r4.append(r9)
            if (r0 == 0) goto L90
            com.tencent.mm.live.api.LiveConfig r9 = r0.f309129d
            if (r9 == 0) goto L90
            long r5 = r9.f68537e
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
        L90:
            r4.append(r2)
            java.lang.String r9 = ",viewHolder:"
            r4.append(r9)
            int r8 = r8.hashCode()
            r4.append(r8)
            java.lang.String r8 = ",pluginLayout:"
            r4.append(r8)
            int r8 = r3.hashCode()
            r4.append(r8)
            java.lang.String r8 = ",size:"
            r4.append(r8)
            int r8 = r3.getPluginSize()
            r4.append(r8)
            r8 = 125(0x7d, float:1.75E-43)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            com.tencent.mars.xlog.Log.i(r1, r8)
            if (r0 == 0) goto Lc9
            r3.bindData(r0)
            goto Lce
        Lc9:
            java.lang.String r8 = "bind view err: data is null!!!"
            com.tencent.mars.xlog.Log.w(r1, r8)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ws2.j.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup vg6, int i17) {
        kotlin.jvm.internal.o.g(vg6, "vg");
        android.view.View inflate = android.view.View.inflate(vg6.getContext(), com.tencent.mm.R.layout.ayd, null);
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = (com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) inflate.findViewById(com.tencent.mm.R.id.fk9);
        inflate.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -1));
        ws2.i iVar = new ws2.i(this, inflate);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "replay_step0-0 onCreateViewHolder viewHolder:" + iVar.hashCode() + ",pluginLayout:" + finderLiveReplayPluginLayout.hashCode() + ",size:" + finderLiveReplayPluginLayout.getPluginSize() + '}');
        return iVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
        ws2.i holder = (ws2.i) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "onViewDetachedFromWindow, " + holder.hashCode());
        super.onViewDetachedFromWindow(holder);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        x(itemView);
    }

    public final void x(android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    childAt.animate().cancel();
                    if (childAt.hasTransientState()) {
                        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "[protectViewItemRecycleHealthy] child=" + childAt);
                    }
                    x(childAt);
                }
            }
            view.animate().cancel();
        }
    }
}
