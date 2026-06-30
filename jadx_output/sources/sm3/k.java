package sm3;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp4.a f409883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm3.o f409884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f409885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sm3.n f409886g;

    public k(kp4.a aVar, sm3.o oVar, int i17, sm3.n nVar) {
        this.f409883d = aVar;
        this.f409884e = oVar;
        this.f409885f = i17;
        this.f409886g = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clicked ");
        kp4.a aVar = this.f409883d;
        sb6.append(aVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksAdapter", sb6.toString());
        sm3.o oVar = this.f409884e;
        com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = ((sm3.q) oVar.f409896d).f409903a;
        java.util.List<kp4.a> tracks = mvTracksEditView.getTracks();
        int i17 = this.f409885f;
        long d17 = tracks.get(i17).d();
        if (d17 < 2000) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MvTracksEditView", "video's duration is too short: index=" + i17 + ", duration=" + d17);
        } else {
            kp4.a aVar2 = mvTracksEditView.getTracks().get(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", "startSelecting: " + i17 + ", start=" + aVar2.f311074d + ", end=" + aVar2.f311075e);
            int selectedIndex = mvTracksEditView.getSelectedIndex();
            sm3.o oVar2 = mvTracksEditView.f152014g;
            if (selectedIndex != -1) {
                int selectedIndex2 = mvTracksEditView.getSelectedIndex();
                oVar2.getClass();
                oVar2.notifyItemChanged(selectedIndex2 + 1);
            }
            mvTracksEditView.setSelectedIndex(i17);
            oVar2.getClass();
            oVar2.notifyItemChanged(i17 + 1);
            mvTracksEditView.f152027w.f409832q = false;
            mvTracksEditView.f152012e.setVisibility(4);
            mvTracksEditView.f152011d.D0();
            sm3.u uVar = mvTracksEditView.callback;
            if (uVar != null) {
                long j17 = aVar2.f311074d;
                long j18 = aVar2.f311075e;
                mm3.h hVar = (mm3.h) uVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "onSelectStarted: " + i17 + ", startTime=" + j17 + ", endTime=" + j18);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                mm3.n nVar = hVar.f329640h;
                nVar.f329663q.put(valueOf, new android.util.Range(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView2 = nVar.f329653d;
                if (mvTracksEditView2 == null) {
                    kotlin.jvm.internal.o.o("tracksEditView");
                    throw null;
                }
                long j19 = mvTracksEditView2.getTracks().get(i17).f311080j;
                pk4.c cVar = hVar.f329639g.f151186n;
                if (cVar != null) {
                    ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).e(j19, (j18 - j17) + j19);
                }
                com.tencent.mm.plugin.music.player.base.l a17 = kl3.t.g().a();
                java.util.LinkedList linkedList = nVar.f329657h;
                if (linkedList == null) {
                    kotlin.jvm.internal.o.o("trackList");
                    throw null;
                }
                a17.c((int) ((r45.jf2) linkedList.get(i17)).getLong(0));
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "enterSelectMode");
                android.view.ViewGroup viewGroup = nVar.f329654e;
                if (viewGroup == null) {
                    kotlin.jvm.internal.o.o("selectButtonsContainer");
                    throw null;
                }
                viewGroup.setVisibility(0);
                android.widget.Button button = nVar.f329655f;
                if (button == null) {
                    kotlin.jvm.internal.o.o("completeButton");
                    throw null;
                }
                button.setVisibility(8);
            }
        }
        oVar.f409898f = new sm3.j(this.f409886g, aVar, oVar);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksAdapter$TrackViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
