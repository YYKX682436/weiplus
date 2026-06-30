package mi5;

/* loaded from: classes9.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc5.i f326920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326921e;

    public t0(fc5.i iVar, android.content.Context context) {
        this.f326920d = iVar;
        this.f326921e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingViewFinderFeed$onUpdateViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l15.c j17 = this.f326920d.j();
        zy2.i iVar = (zy2.i) ot0.q.v(j17 != null ? j17.toXml() : null).y(zy2.i.class);
        android.content.Intent intent = new android.content.Intent();
        if ((iVar.f477411b.getInteger(25) & 4) > 0) {
            intent.putExtra("member_username", iVar.f477411b.getString(1));
        }
        intent.putExtra("feed_object_id", pm0.v.Z(iVar.f477411b.getString(0)));
        intent.putExtra("feed_object_nonceId", iVar.f477411b.getString(8));
        intent.putExtra("business_type", 0);
        intent.putExtra("key_from_user_name", iVar.f477411b.getString(1));
        intent.putExtra("finder_user_name", iVar.f477411b.getString(1));
        intent.putExtra("tab_type", 6);
        intent.putExtra("key_source_comment_scene", iVar.f477411b.getInteger(29));
        intent.putExtra("feed_local_id", iVar.f477411b.getLong(9));
        intent.putExtra("key_need_related_list", false);
        if (iVar.f477411b.getByteString(26) != null) {
            com.tencent.mm.protobuf.g byteString = iVar.f477411b.getByteString(26);
            kotlin.jvm.internal.o.d(byteString);
            intent.putExtra("key_share_byp_data", byteString.f192156a);
        }
        boolean Ak = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ak();
        android.content.Context context = this.f326921e;
        ya2.e1 e1Var = ya2.e1.f460472a;
        if (Ak) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            kotlin.jvm.internal.o.f(context, "$context");
            e1Var.t(context, intent);
        } else {
            xa2.e eVar = (xa2.e) i95.n0.c(xa2.e.class);
            kotlin.jvm.internal.o.d(view);
            ((wa2.u) eVar).hj(intent, view, 280L);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            kotlin.jvm.internal.o.f(context, "$context");
            e1Var.A(context, intent, false);
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingViewFinderFeed$onUpdateViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
