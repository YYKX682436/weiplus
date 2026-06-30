package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f175051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.o0 f175052e;

    public n0(com.tencent.mm.plugin.topstory.ui.home.o0 o0Var, android.graphics.Bitmap bitmap) {
        this.f175052e = o0Var;
        this.f175051d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.home.o0 o0Var = this.f175052e;
        android.graphics.Bitmap bitmap = this.f175051d;
        if (bitmap != null) {
            o0Var.f175058d.f174944c.setImageBitmap(bitmap);
        } else {
            o0Var.f175058d.f174944c.setImageDrawable(o0Var.f175063i.f174986d.getResources().getDrawable(com.tencent.mm.R.color.f478489a));
            o0Var.f175058d.f174945d = 0;
        }
        o0Var.f175058d.f174944c.setVisibility(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "layout %s,%s, fakeIv %s,%s", java.lang.Integer.valueOf(o0Var.f175058d.f174943b.getWidth()), java.lang.Integer.valueOf(o0Var.f175058d.f174943b.getHeight()), java.lang.Integer.valueOf(o0Var.f175058d.f174944c.getWidth()), java.lang.Integer.valueOf(o0Var.f175058d.f174944c.getHeight()));
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = o0Var.f175063i.f174991i;
        if (webSearchWebView != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "topStoryWebView %s,%s", java.lang.Integer.valueOf(webSearchWebView.getWidth()), java.lang.Integer.valueOf(o0Var.f175063i.f174991i.getHeight()));
        }
        o0Var.f175063i.j(o0Var.f175059e, o0Var.f175060f, o0Var.f175061g, o0Var.f175062h, true);
    }
}
