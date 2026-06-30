package ut2;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.k0 f431065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ut2.k0 k0Var) {
        super(0);
        this.f431065d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f431065d.f430958b.findViewById(com.tencent.mm.R.id.ewd);
        d92.f fVar = d92.f.f227470a;
        kotlin.jvm.internal.o.d(weImageView);
        fVar.k(weImageView, 20.0f, 20.0f);
        return weImageView;
    }
}
