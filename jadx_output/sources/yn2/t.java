package yn2;

/* loaded from: classes2.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn2.u f464010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f464011e;

    public t(yn2.u uVar, in5.s0 s0Var) {
        this.f464010d = uVar;
        this.f464011e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/SeeLaterTitleConvert$setDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = this.f464010d.f464012e;
        if (eVar != null) {
            int adapterPosition = this.f464011e.getAdapterPosition();
            xn2.p0 p0Var = (xn2.p0) eVar;
            android.app.Activity context = p0Var.f455543a;
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
            if (mMFragmentActivity != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_context_id", p0Var.f455544b);
                wn2.f fVar = (wn2.f) i95.n0.c(wn2.f.class);
                fVar.getClass();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = fVar.f447522f;
                if (i0Var != null) {
                    com.tencent.mars.xlog.Log.i("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "enterFinderLongVideoSeeLaterUI");
                    com.tencent.mm.plugin.finder.megavideo.topstory.flow.j jVar = i0Var.f120939h;
                    if (jVar != null) {
                        jVar.a(com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120931g);
                    }
                }
                vn2.u0 u0Var = vn2.u0.f438387a;
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader loader = p0Var.j();
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.b1 b1Var = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.b1) ((jz5.n) p0Var.f455558p).getValue();
                java.lang.String tag = p0Var.f455545c;
                kotlin.jvm.internal.o.g(tag, "tag");
                kotlin.jvm.internal.o.g(loader, "loader");
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                vn2.u0.f438392f = new jz5.l(java.lang.Long.valueOf(elapsedRealtime), loader.c().c());
                com.tencent.mars.xlog.Log.i(tag, "click position=" + adapterPosition + " SeeLaterEntranceFeed:null,data key=" + elapsedRealtime);
                intent.putExtra("key_see_later_data_key", elapsedRealtime);
                intent.putExtra("KEY_FINDER_PROCESS_ID", 1);
                intent.addFlags(67108864);
                intent.setClass(mMFragmentActivity, com.tencent.mm.plugin.finder.feed.ui.FinderSeeLaterDetailUI.class);
                ((com.tencent.mm.ui.bd) mMFragmentActivity.startActivityForResult(intent)).f197877a = new vn2.q0(b1Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/SeeLaterTitleConvert$setDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
