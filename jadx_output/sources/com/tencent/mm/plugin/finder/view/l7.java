package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class l7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f132544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132545e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        super(0);
        this.f132544d = imageView;
        this.f132545e = finderCommentFooter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f132544d;
        android.view.ViewParent parent = imageView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(imageView);
        }
        this.f132545e.H1 = null;
        return jz5.f0.f302826a;
    }
}
