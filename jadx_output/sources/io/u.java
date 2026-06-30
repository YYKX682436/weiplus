package io;

/* loaded from: classes9.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd5.a f293431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f293432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f293433f;

    public u(xd5.a aVar, android.content.Context context, l15.c cVar) {
        this.f293431d = aVar;
        this.f293432e = context;
        this.f293433f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        v05.b k17;
        v05.b k18;
        java.lang.String string;
        java.lang.String string2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xd5.a aVar = this.f293431d;
        long j17 = aVar.j();
        android.content.Context context = this.f293432e;
        if (j17 > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_detail_info_id", aVar.j());
            intent.putExtra("record_show_share", false);
            intent.putExtra("prePublishId", "msgrecord_detail");
            j45.l.j(context, "record", ".ui.FavRecordDetailUI", intent, null);
        } else {
            str = "";
            if (aVar.getLong(aVar.f43702d + 0) > 0) {
                if (((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).nj(aVar.getString(aVar.f43702d + 1))) {
                    com.tencent.mm.storage.f9 m17 = pt0.f0.f358209b1.m(new com.tencent.mm.plugin.msg.MsgIdTalker(aVar.getLong(aVar.f43702d + 0), aVar.getString(aVar.f43702d + 1)));
                    hu.f fVar = new hu.f();
                    fVar.w(aVar.getLong(aVar.f43702d + 0));
                    fVar.y(java.lang.Long.valueOf(m17.I0()));
                    java.lang.String Q0 = m17.Q0();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (Q0 == null) {
                        Q0 = "";
                    }
                    fVar.z(Q0);
                    java.lang.String V1 = m17.V1();
                    if (V1 == null) {
                        V1 = m17.y0();
                    }
                    fVar.x(V1 != null ? V1 : "");
                    fVar.u(3);
                    fVar.B(false);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setClassName(context, "com.tencent.mm.feature.appmsg.ui.RecordDetailUI");
                    intent2.putExtra("params", fVar.toJson().toString());
                    android.content.Context context2 = this.f293432e;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context2, "com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("message_id", aVar.getLong(aVar.f43702d + 0));
                    intent3.putExtra("message_talker", aVar.getString(aVar.f43702d + 1));
                    v05.b k19 = this.f293433f.k();
                    if (k19 != null && (string2 = k19.getString(k19.f432315e + 44)) != null) {
                        str = string2;
                    }
                    intent3.putExtra("record_xml", str);
                    intent3.putExtra("record_show_share", false);
                    j45.l.j(context, "record", ".ui.RecordMsgDetailUI", intent3, null);
                }
            } else if (((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).nj(aVar.getString(aVar.f43702d + 1))) {
                hu.f fVar2 = new hu.f();
                fVar2.u(3);
                l15.c k27 = aVar.k();
                if (k27 != null && (k18 = k27.k()) != null && (string = k18.getString(k18.f432315e + 44)) != null) {
                    str = string;
                }
                fVar2.A(str);
                fVar2.B(false);
                android.content.Intent intent4 = new android.content.Intent();
                intent4.setClassName(context, "com.tencent.mm.feature.appmsg.ui.RecordDetailUI");
                intent4.putExtra("params", fVar2.toJson().toString());
                android.content.Context context3 = this.f293432e;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context3, arrayList3.toArray(), "com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context3, "com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                android.content.Intent intent5 = new android.content.Intent();
                l15.c k28 = aVar.k();
                intent5.putExtra("record_xml", (k28 == null || (k17 = k28.k()) == null) ? null : k17.getString(k17.f432315e + 44));
                intent5.putExtra("record_show_share", false);
                intent5.putExtra("from_scene", 3);
                j45.l.j(context, "record", ".ui.RecordMsgDetailUI", intent5, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ChattingRecordView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
