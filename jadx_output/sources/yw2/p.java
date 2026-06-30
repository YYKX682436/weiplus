package yw2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderJumpAnchorView f466662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView) {
        super(0);
        this.f466662d = finderJumpAnchorView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderJumpAnchorView finderJumpAnchorView = this.f466662d;
        android.view.ViewParent parent = finderJumpAnchorView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(finderJumpAnchorView);
        }
        return jz5.f0.f302826a;
    }
}
