package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class nb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f132704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f132705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f132706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(boolean z17, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, int i17) {
        super(0);
        this.f132704d = z17;
        this.f132705e = weImageView;
        this.f132706f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f132704d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f132705e;
        if (z17) {
            weImageView.setIconColor(this.f132706f);
        } else {
            weImageView.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
