package mg3;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer f326233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f326234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f326235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f326236g;

    public i(com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer previewGestureContainer, float f17, kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2, ml5.j jVar) {
        this.f326233d = previewGestureContainer;
        this.f326234e = f17;
        this.f326235f = e0Var;
        this.f326236g = e0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17 = this.f326234e;
        com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer previewGestureContainer = this.f326233d;
        previewGestureContainer.D(f17, previewGestureContainer.getContentViewScale()[0], this.f326235f.f310115d, this.f326236g.f310115d, null);
    }
}
