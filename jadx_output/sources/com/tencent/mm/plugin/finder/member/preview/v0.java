package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.z0 f121290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.finder.member.preview.z0 z0Var) {
        super(0);
        this.f121290d = z0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.member.preview.z0 z0Var = this.f121290d;
        androidx.appcompat.app.AppCompatActivity activity = z0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        return new com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListLoader(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), z0Var.f121308h, z0Var.f121307g, z0Var.f121310m, z0Var.f121312o);
    }
}
