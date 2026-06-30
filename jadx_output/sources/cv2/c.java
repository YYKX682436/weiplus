package cv2;

/* loaded from: classes10.dex */
public final class c extends uh4.c {
    public static final void f(cv2.c cVar, uh4.a aVar, r45.kv2 kv2Var) {
        cVar.getClass();
        android.content.Context context = aVar.f427963g.getContext();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_object_id", pm0.v.Z(kv2Var.getString(0)));
        intent.putExtra("feed_object_nonceId", kv2Var.getString(8));
        intent.putExtra("key_need_related_list", false);
        intent.putExtra("key_comment_scene", 25);
        if (kv2Var.getInteger(5) == 11111) {
            intent.putExtra("business_type", 1);
        }
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.d(context);
        i0Var.uk(context, intent, false);
    }

    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getString(com.tencent.mm.R.string.f8e);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        java.lang.String str;
        ot0.q v17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        rt0.e eVar = (rt0.e) aVar.f427957a.y(rt0.e.class);
        boolean equals = c01.z1.r().equals(aVar.f427962f);
        if (eVar != null) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(eVar.f399380e, "content", null);
            if (d17 == null || (str = (java.lang.String) d17.get(".content")) == null || (v17 = ot0.q.v(str)) == null) {
                return;
            }
            zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
            r45.kv2 kv2Var = iVar != null ? iVar.f477411b : null;
            com.tencent.mars.xlog.Log.i("FinderAuthorizationFiller", "onFill, state:" + state + ", isWard:" + equals + ", piece.referMsg:" + eVar.f399380e);
            if (equals) {
                android.content.Context context2 = aVar.f427963g.getContext();
                int ordinal = state.ordinal();
                if (ordinal == 0) {
                    aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f7e));
                    h(aVar, kv2Var, false);
                    return;
                }
                if (ordinal == 1) {
                    aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f76));
                    h(aVar, kv2Var, false);
                    return;
                } else if (ordinal == 2) {
                    aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f7a));
                    h(aVar, kv2Var, true);
                    return;
                } else {
                    if (ordinal != 3) {
                        return;
                    }
                    aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f79));
                    h(aVar, kv2Var, false);
                    return;
                }
            }
            android.content.Context context3 = aVar.f427963g.getContext();
            int ordinal2 = state.ordinal();
            if (ordinal2 == 0) {
                aVar.f427963g.setText(context3.getResources().getString(com.tencent.mm.R.string.f7d));
                aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f7c));
            } else if (ordinal2 == 1) {
                aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f76));
            } else if (ordinal2 == 2) {
                aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f7_));
            } else if (ordinal2 == 3) {
                aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f78));
            }
            if (kv2Var != null) {
                java.util.LinkedList list = kv2Var.getList(7);
                if (list != null) {
                    java.util.LinkedList linkedList = list.isEmpty() ^ true ? list : null;
                    if (linkedList != null) {
                        java.lang.Object first = linkedList.getFirst();
                        kotlin.jvm.internal.o.f(first, "getFirst(...)");
                        n11.a.b().g(((r45.iv2) first).getString(2), aVar.f427966j);
                    }
                }
                aVar.f427968l.setText(kv2Var.getString(4));
                aVar.f427965i.setOnClickListener(new cv2.a(this, aVar, kv2Var));
                aVar.f427967k.setVisibility(0);
            }
        }
    }

    public final void h(uh4.a aVar, r45.kv2 kv2Var, boolean z17) {
        if (kv2Var != null) {
            java.util.LinkedList list = kv2Var.getList(7);
            if (list != null) {
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    java.lang.Object first = list.getFirst();
                    kotlin.jvm.internal.o.f(first, "getFirst(...)");
                    n11.a.b().g(((r45.iv2) first).getString(2), aVar.f427966j);
                }
            }
            aVar.f427968l.setText(kv2Var.getString(4));
            aVar.f427967k.setVisibility(0);
            if (z17) {
                aVar.f427965i.setOnClickListener(new cv2.b(this, aVar, kv2Var));
            }
        }
    }
}
