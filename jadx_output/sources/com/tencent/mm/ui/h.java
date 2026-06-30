package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.j f208765d;

    public h(com.tencent.mm.ui.j jVar) {
        this.f208765d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.j jVar = this.f208765d;
        android.view.ViewGroup.LayoutParams layoutParams = jVar.f208976i.getLayoutParams();
        if (-2 != layoutParams.width) {
            layoutParams.width = -2;
            jVar.f208976i.setLayoutParams(layoutParams);
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = jVar.f208971d.getLayoutParams();
        if (-2 != layoutParams2.width) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, already fix title");
            return;
        }
        android.text.Layout layout = jVar.f208971d.getLayout();
        if (layout == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, layout is null");
            return;
        }
        if (layout.getEllipsisCount(0) <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, title is not too long");
            return;
        }
        int width = jVar.f208971d.getWidth();
        int width2 = jVar.f208975h.getWidth();
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) jVar.f208975h.getLayoutParams();
        int marginStart = layoutParams3.getMarginStart();
        int marginEnd = layoutParams3.getMarginEnd();
        com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarCustomArea", "fixWhenTitleTooLong, titleWidth: %d, titleGotoBtnWidth: %d, titleGotoBtnMarginStart: %d, titleGotoBtnMarginEnd: %d", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(width2), java.lang.Integer.valueOf(marginStart), java.lang.Integer.valueOf(marginEnd));
        layoutParams2.width = ((width - width2) - marginStart) - marginEnd;
        jVar.f208971d.setLayoutParams(layoutParams2);
    }
}
