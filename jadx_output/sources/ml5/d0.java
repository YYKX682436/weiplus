package ml5;

/* loaded from: classes10.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.DragExitCropLayout f328416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f328417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f328418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f328419g;

    public d0(com.tencent.mm.ui.widget.cropview.DragExitCropLayout dragExitCropLayout, kotlin.jvm.internal.e0 e0Var, float f17, float f18) {
        this.f328416d = dragExitCropLayout;
        this.f328417e = e0Var;
        this.f328418f = f17;
        this.f328419g = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17 = this.f328417e.f310115d;
        com.tencent.mm.ui.widget.cropview.DragExitCropLayout dragExitCropLayout = this.f328416d;
        dragExitCropLayout.D(f17, dragExitCropLayout.getContentViewScale()[0], this.f328418f, this.f328419g, null);
    }
}
