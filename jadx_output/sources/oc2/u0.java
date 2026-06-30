package oc2;

/* loaded from: classes4.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f344280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView f344281e;

    public u0(java.util.List list, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView) {
        this.f344280d = list;
        this.f344281e = renderView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f344280d.iterator();
        while (it.hasNext()) {
            this.f344281e.addView((android.view.View) it.next());
        }
    }
}
