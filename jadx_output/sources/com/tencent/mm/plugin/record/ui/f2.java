package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class f2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f155388d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f155389e = -1;

    /* renamed from: f, reason: collision with root package name */
    public bt3.b2 f155390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155391g;

    public f2(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI, com.tencent.mm.plugin.record.ui.v1 v1Var) {
        this.f155391g = recordMsgImageUI;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.fav.ui.gallery.r getItem(int i17) {
        return (com.tencent.mm.plugin.fav.ui.gallery.r) this.f155388d.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f155388d.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (i17 > this.f155388d.size()) {
            return 2;
        }
        return ((com.tencent.mm.plugin.fav.ui.gallery.r) this.f155388d.get(i17)).k();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView;
        boolean f17;
        android.view.View view2 = view;
        com.tencent.mm.plugin.fav.ui.gallery.r item = getItem(i17);
        java.util.Objects.toString(view);
        java.util.Objects.toString(viewGroup);
        item.k();
        int k17 = item.k();
        boolean z17 = k17 == 15 || k17 == 4;
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155391g;
        if (!z17) {
            bt3.b2 b2Var = this.f155390f;
            r45.gp0 n17 = getItem(i17).n();
            java.lang.String str = recordMsgImageUI.f155318o;
            long j17 = this.f155389e;
            android.graphics.Bitmap h17 = b2Var.h(n17, str, j17, false, false);
            if (h17 == null && (f17 = b2Var.f(n17.T, str, j17))) {
                bt3.g2.O(n17, str, j17, f17);
            }
            if (h17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ShowImageUI", "get image fail");
                if (view2 == null || (view2 instanceof com.tencent.mm.ui.base.MultiTouchImageView)) {
                    view2 = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.f489389em5, null);
                }
                android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.crq);
                imageView.setVisibility(0);
                imageView.setImageResource(com.tencent.mm.R.raw.download_image_icon);
                view2.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
                return view2;
            }
            android.content.Context context = viewGroup.getContext();
            if (view2 == null || !(view2 instanceof com.tencent.mm.ui.base.MultiTouchImageView)) {
                multiTouchImageView = new com.tencent.mm.ui.base.MultiTouchImageView(context, h17.getWidth(), h17.getHeight());
            } else {
                multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) view2;
                int width = h17.getWidth();
                int height = h17.getHeight();
                multiTouchImageView.f197651o = width;
                multiTouchImageView.f197652p = height;
            }
            multiTouchImageView.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            multiTouchImageView.setImageBitmap(h17);
            multiTouchImageView.setMaxZoomDoubleTab(true);
            return multiTouchImageView;
        }
        if (view2 == null) {
            view2 = new com.tencent.mm.plugin.fav.ui.widget.FavVideoView(recordMsgImageUI.getContext(), null);
            ((java.util.ArrayList) recordMsgImageUI.f155311e).add(view2);
        }
        java.lang.String j18 = item.j();
        java.util.List list = (java.util.List) recordMsgImageUI.f155312f.get(j18);
        if (list == null) {
            list = new java.util.ArrayList();
        }
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = (com.tencent.mm.plugin.fav.ui.widget.FavVideoView) view2;
        list.add(favVideoView);
        recordMsgImageUI.f155312f.put(j18, list);
        favVideoView.f101571i.setVisibility(8);
        favVideoView.setCallback(new com.tencent.mm.plugin.record.ui.e2(this));
        if (com.tencent.mm.vfs.w6.j(j18)) {
            favVideoView.setVideoData(j18);
            favVideoView.setThumbView(item.w());
            com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "VideoPlay:  videoView.setVideoData(fullPath)");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "VideoPlay:  videoView.initThumbView thumbExist:%s", java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(item.w())));
            favVideoView.j(item.j(), true, item.i());
            favVideoView.setThumbView(item.w());
            bt3.b2 b2Var2 = this.f155390f;
            java.lang.String i18 = item.i();
            java.lang.String str2 = recordMsgImageUI.f155318o;
            long j19 = this.f155389e;
            boolean f18 = b2Var2.f(i18, str2, j19);
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgImgService", "tryDownloadVideo() called with: dataItem = [" + i18 + "], msgId = [" + j19 + "] canRetry:" + f18);
            if (f18) {
                hz4.h hVar = ((hz4.f) hz4.f.wi()).f286407d;
                if (hVar instanceof hz4.w) {
                    bt3.g2.O(((hz4.w) hVar).f(i18), str2, j19, false);
                }
            }
        }
        favVideoView.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
        return view2;
    }
}
