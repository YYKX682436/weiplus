package com.tencent.mm.plugin.story.api;

/* loaded from: classes11.dex */
public abstract class AbsStoryGallery extends android.widget.RelativeLayout {
    public AbsStoryGallery(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract void a(com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView);

    public abstract void b();

    public abstract boolean c();

    public abstract void d(int i17);

    public abstract void e();

    public abstract void f(int i17);

    public abstract void g(int i17);

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(boolean z17);

    public abstract void o(boolean z17, boolean z18);

    public abstract void p();

    public abstract void setCurrentHItem(int i17);

    public abstract void setCurrentVItem(int i17);

    public abstract void setDataSeed(java.lang.Object obj);

    public abstract void setStoryBrowseUIListener(ze4.h hVar);

    public AbsStoryGallery(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
