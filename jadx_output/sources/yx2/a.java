package yx2;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx2.f f467827d;

    public a(yx2.f fVar) {
        this.f467827d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        r45.xk a17;
        com.tencent.mm.protocal.protobuf.FinderContact contact2;
        com.tencent.mm.protocal.protobuf.FinderContact contact3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/snscover/FinderDetailLoader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yx2.f fVar = this.f467827d;
        android.content.Context context = fVar.f467847f;
        kotlin.jvm.internal.o.f(context, "access$getContext$p(...)");
        if (fVar.f467848g != null) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = fVar.f467848g;
            boolean b17 = kotlin.jvm.internal.o.b((finderObject == null || (contact3 = finderObject.getContact()) == null) ? null : contact3.getUsername(), xy2.c.e(context));
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = fVar.f467848g;
            intent.putExtra("finder_username", (finderObject2 == null || (contact2 = finderObject2.getContact()) == null) ? null : contact2.getUsername());
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = fVar.f467848g;
            if (finderObject3 == null || (contact = finderObject3.getContact()) == null || (a17 = ya2.d.a(contact, false)) == null || (str = a17.getString(0)) == null) {
                str = "";
            }
            intent.putExtra("key_biz_username", str);
            ya2.e1 e1Var = ya2.e1.f460472a;
            if (b17) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.x(context, intent, 20, 2);
            } else {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = fVar.f467848g;
                com.tencent.mm.protocal.protobuf.FinderJumpInfo w17 = finderObject4 != null ? hc2.o0.w(finderObject4) : null;
                if (w17 == null || !hc2.g0.e(w17, context, 0)) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 32, intent);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    e1Var.w(context, intent);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/snscover/FinderDetailLoader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
