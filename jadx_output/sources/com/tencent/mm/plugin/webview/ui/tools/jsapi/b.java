package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f184935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f184937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f184938g;

    public b(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, int i17, boolean z17, java.util.ArrayList arrayList) {
        this.f184935d = c1Var;
        this.f184936e = i17;
        this.f184937f = z17;
        this.f184938g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_source_type", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
        boolean z17 = this.f184937f;
        java.util.ArrayList arrayList = this.f184938g;
        intent.putExtra("key_pick_local_media_local_ids", z17 ? com.tencent.mm.plugin.webview.model.o5.g(arrayList) : com.tencent.mm.plugin.webview.model.o5.h(arrayList));
        this.f184935d.mmOnActivityResult(this.f184936e, -1, intent);
    }
}
