package mh2;

/* loaded from: classes10.dex */
public final class v1 extends mh2.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(android.content.Context context, android.view.ViewGroup root) {
        super(context, root);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
    }

    @Override // mh2.a
    public int a() {
        return com.tencent.mm.R.layout.drh;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(singState, "singState");
        android.view.View view = this.f326292b;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a_4);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ndn);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kb_);
        om2.x xVar = singState instanceof om2.x ? (om2.x) singState : null;
        if (xVar != null) {
            om2.o oVar = xVar.f346388a;
            boolean z17 = oVar.f346366g;
            android.content.Context context = this.f326291a;
            textView.setText(z17 ? context.getResources().getString(com.tencent.mm.R.string.ork, oVar.f346364e) : context.getResources().getString(com.tencent.mm.R.string.mjw, oVar.f346364e));
            kotlin.jvm.internal.o.d(imageView);
            r45.xn1 xn1Var = oVar.f346361b;
            b(imageView, xn1Var != null ? (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0) : null);
            r45.xn1 xn1Var2 = oVar.f346361b;
            if (xn1Var2 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) {
                return;
            }
            textView2.setText(zl2.r4.D0(zl2.r4.f473950a, finderContact.getUsername(), finderContact.getNickname(), false, 4, null));
        }
    }
}
