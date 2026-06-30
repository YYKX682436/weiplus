package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f112098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f112100f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, int i17) {
        super(0);
        this.f112098d = imageView;
        this.f112099e = v3Var;
        this.f112100f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f112098d.setImageDrawable(this.f112099e.f365323d.getContext().getResources().getDrawable(this.f112100f));
        return jz5.f0.f302826a;
    }
}
