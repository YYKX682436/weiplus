package va2;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f434235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.card.FinderProfileCardView f434236e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.protocal.protobuf.FinderContact finderContact, com.tencent.mm.plugin.finder.view.card.FinderProfileCardView finderProfileCardView) {
        super(1);
        this.f434235d = finderContact;
        this.f434236e = finderProfileCardView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", this.f434235d.getUsername());
        intent.putExtra("key_enter_profile_type", 38);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = this.f434236e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.mk(context, intent);
        return jz5.f0.f302826a;
    }
}
