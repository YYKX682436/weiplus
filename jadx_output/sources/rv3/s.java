package rv3;

/* loaded from: classes5.dex */
public class s extends rv3.e {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f400412m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f400413n;

    public s(yz5.p pVar) {
        super(pVar, null, false, false);
        this.f400412m = jz5.h.b(rv3.q.f400410d);
        this.f400413n = jz5.h.b(rv3.r.f400411d);
    }

    public static void x(rv3.s sVar, com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView, rv3.h hVar, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkScrollText");
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            lVar = null;
        }
        sVar.getClass();
        boolean b17 = kotlin.jvm.internal.o.b(hVar.f400396e, rv3.y.f400419a);
        musicLrcView.setDefaultXPaused(i17);
        if (b17) {
            musicLrcView.post(new rv3.o(musicLrcView, lVar, i17, sVar));
            return;
        }
        musicLrcView.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        musicLrcView.setMarqueeRepeatLimit(-1);
        musicLrcView.d(false, -1);
    }

    @Override // rv3.e, in5.r
    public int e() {
        return com.tencent.mm.R.layout.dhl;
    }

    @Override // rv3.e, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        holder.itemView.setBackground(com.tencent.mm.ui.vk.f211169a.b(((java.lang.Number) ((jz5.n) this.f400412m).getValue()).intValue(), ((java.lang.Number) ((jz5.n) this.f400413n).getValue()).intValue(), 0.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override // rv3.e, in5.r
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, rv3.h item, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        cw3.i iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f486453q05);
        com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView = (com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView) holder.itemView.findViewById(com.tencent.mm.R.id.qg9);
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.jyc);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) holder.itemView.findViewById(com.tencent.mm.R.id.f486048k01);
        mMPAGView.o(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigRfxTingSwitch()) == 1);
        com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView musicLrcView2 = (com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView) holder.itemView.findViewById(com.tencent.mm.R.id.f486051k04);
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.f486037qg5);
        android.content.res.AssetManager assets = mMPAGView.getContext().getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        mMPAGView.k(assets, "ting_music_play_icon.pag");
        mMPAGView.setRepeatCount(-1);
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = item.f400395d;
        int i19 = audioCacheInfo.f155711e;
        kotlin.jvm.internal.o.d(findViewById);
        t(i19, findViewById, mMPAGView, item.f400396e);
        rv3.n nVar = item instanceof rv3.n ? (rv3.n) item : null;
        if (nVar != null && (iVar = nVar.f400403i) != null) {
            if (iVar instanceof cw3.f) {
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerV2RecommendItemConvert", "setBehaviorStatusView", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerV2RecommendItemConvert", "setBehaviorStatusView", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerV2RecommendItemConvert", "setBehaviorStatusView", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerV2RecommendItemConvert", "setBehaviorStatusView", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.view.BehaviorStatusView behaviorStatusView = findViewById2 != null ? (com.tencent.mm.plugin.recordvideo.ui.editor.view.BehaviorStatusView) findViewById2.findViewById(com.tencent.mm.R.id.f486036qg4) : null;
            if (behaviorStatusView != null) {
                behaviorStatusView.a(iVar);
            }
        }
        java.lang.String str3 = audioCacheInfo.f155725v;
        kotlin.jvm.internal.o.d(imageView);
        s(str3, imageView);
        kotlin.jvm.internal.o.d(musicLrcView);
        java.util.ArrayList arrayList3 = audioCacheInfo.f155713g;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            if (audioCacheInfo.f155714h.isEmpty()) {
                str2 = audioCacheInfo.f155723t;
            } else {
                str2 = audioCacheInfo.f155723t + " - " + com.tencent.mm.sdk.platformtools.t8.c1(audioCacheInfo.f155714h, ",");
            }
            musicLrcView.setText(str2);
        } else {
            java.util.ArrayList arrayList4 = audioCacheInfo.f155713g;
            wu3.w1 w1Var = com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView.f156056o;
            musicLrcView.b(arrayList4, null);
        }
        x(this, musicLrcView, item, 0, null, 12, null);
        kotlin.jvm.internal.o.d(musicLrcView2);
        if (audioCacheInfo.f155714h.isEmpty()) {
            str = audioCacheInfo.f155723t;
        } else {
            str = audioCacheInfo.f155723t + " - " + com.tencent.mm.sdk.platformtools.t8.c1(audioCacheInfo.f155714h, ",");
        }
        u(musicLrcView2, str);
        v(musicLrcView2, audioCacheInfo.B);
        x(this, musicLrcView2, item, 0, new rv3.p(musicLrcView, musicLrcView2), 4, null);
        rv3.e.n(this, findViewById, item.f400396e, null, 4, null);
        yz5.p pVar = this.f400384e;
        if (pVar != null) {
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            pVar.invoke(itemView, item);
        }
    }
}
