package mh2;

/* loaded from: classes10.dex */
public final class g1 extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f326357c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.content.Context context, android.view.ViewGroup root) {
        super(context, root);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View findViewById = this.f326292b.findViewById(com.tencent.mm.R.id.s_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f326357c = (android.widget.ImageView) findViewById;
    }

    @Override // mh2.a
    public int a() {
        return com.tencent.mm.R.layout.e_u;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        r45.xn1 xn1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(singState, "singState");
        om2.c0 c0Var = singState instanceof om2.c0 ? (om2.c0) singState : null;
        if (c0Var == null || (xn1Var = c0Var.f346280a.f346361b) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return;
        }
        b(this.f326357c, finderContact);
    }
}
