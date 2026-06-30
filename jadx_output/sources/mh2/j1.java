package mh2;

/* loaded from: classes10.dex */
public final class j1 extends mh2.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.content.Context context, android.view.ViewGroup root) {
        super(context, root);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
    }

    @Override // mh2.a
    public int a() {
        return com.tencent.mm.R.layout.e_w;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        r45.xn1 xn1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(singState, "singState");
        android.widget.ImageView imageView = (android.widget.ImageView) this.f326292b.findViewById(com.tencent.mm.R.id.a_4);
        om2.x xVar = singState instanceof om2.x ? (om2.x) singState : null;
        if (xVar == null || (xn1Var = xVar.f346388a.f346361b) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return;
        }
        kotlin.jvm.internal.o.d(imageView);
        b(imageView, finderContact);
    }
}
