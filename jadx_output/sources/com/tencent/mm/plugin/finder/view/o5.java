package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class o5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentEditText f132764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f132765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f132766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132767g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132768h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(com.tencent.mm.plugin.finder.view.FinderCommentEditText finderCommentEditText, java.lang.CharSequence charSequence, android.widget.FrameLayout frameLayout, android.view.View view, android.view.View view2) {
        super(0);
        this.f132764d = finderCommentEditText;
        this.f132765e = charSequence;
        this.f132766f = frameLayout;
        this.f132767g = view;
        this.f132768h = view2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f132764d.setHint(this.f132765e);
        android.widget.FrameLayout frameLayout = this.f132766f;
        frameLayout.removeView(this.f132767g);
        frameLayout.removeView(this.f132768h);
        return jz5.f0.f302826a;
    }
}
