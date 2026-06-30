package im3;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im3.i f292693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f292694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im3.j f292695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292696g;

    public h(im3.i iVar, android.widget.FrameLayout frameLayout, im3.j jVar, android.view.View view) {
        this.f292693d = iVar;
        this.f292694e = frameLayout;
        this.f292695f = jVar;
        this.f292696g = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk4.a a17 = ((qk4.f) this.f292693d.f292697e).a();
        android.widget.FrameLayout frameLayout = this.f292694e;
        frameLayout.removeAllViews();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView((android.view.View) a17, layoutParams);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f292695f.f292700f.f380365f;
        if (finderObject != null) {
            java.lang.String mediaId = "video_" + finderObject.getId();
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            java.lang.String o17 = new com.tencent.mm.vfs.r6(ll3.i1.f319182a.c(mediaId)).o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
            if (objectDesc != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
                java.lang.String url = finderMedia.getUrl();
                dk4.a aVar = new dk4.a(mediaId, o17, url == null ? "" : url, a06.d.b(finderMedia.getWidth()), a06.d.b(finderMedia.getHeight()));
                aVar.f234464a = 2;
                aVar.f234465b = "xV2";
                java.lang.String url_token = finderMedia.getUrl_token();
                if (url_token == null) {
                    url_token = "";
                }
                aVar.f234466c = url_token;
                aVar.f234467d = finderMedia.getDecodeKey();
                java.lang.String thumbUrl = finderMedia.getThumbUrl();
                if (thumbUrl == null) {
                    thumbUrl = "";
                }
                aVar.f234471h = thumbUrl;
                java.lang.String thumb_url_token = finderMedia.getThumb_url_token();
                aVar.f234472i = thumb_url_token != null ? thumb_url_token : "";
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
                aVar.f234470g = ((objectDesc2 == null || (media2 = objectDesc2.getMedia()) == null || (finderMedia2 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.X(media2)) == null) ? 0L : finderMedia2.getVideoDuration()) * 1000;
                aVar.f234468e = false;
                aVar.f234480q = finderObject;
                com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout mMRecyclerVideoLayout = (com.tencent.mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout) a17;
                mMRecyclerVideoLayout.a();
                a17.setMediaInfo(aVar);
                mMRecyclerVideoLayout.b();
                kk4.v vVar = mMRecyclerVideoLayout.player;
                if (vVar != null) {
                    vVar.f308585j = true;
                }
                if (vVar != null) {
                    vVar.O();
                }
                a17.setLoop(true);
                a17.setMute(true);
            }
        }
        android.view.View view2 = this.f292696g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
