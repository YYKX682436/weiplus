package dy0;

/* loaded from: classes13.dex */
public final class l extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.widgets.RoundFrameLayout f244557a;

    public l(com.tencent.mm.mj_publisher.finder.widgets.RoundFrameLayout roundFrameLayout) {
        this.f244557a = roundFrameLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        outline.setRoundRect(new android.graphics.Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), this.f244557a.f69691f);
    }
}
