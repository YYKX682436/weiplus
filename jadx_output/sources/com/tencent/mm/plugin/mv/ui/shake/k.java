package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes10.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew f150951d;

    public k(com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew) {
        this.f150951d = musicMainUINew;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = this.f150951d;
        r45.hf2 a17 = musicMainUINew.E.a(musicMainUINew.getContext());
        r45.xs4 xs4Var = new r45.xs4();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) musicMainUINew.f150910p;
        if (arrayList2.size() > 0) {
            fm3.u uVar = ((lm3.e) arrayList2.get(0)).f319482d;
            fm3.t tVar = fm3.u.A;
            if (tVar.d(uVar) != null) {
                com.tencent.mm.protocal.protobuf.FinderObject d17 = tVar.d(uVar);
                xs4Var.set(0, java.lang.String.valueOf(d17.getId()));
                xs4Var.set(1, d17.getObjectNonceId());
                if (d17.getObjectDesc() != null && d17.getObjectDesc().getMedia() != null && d17.getObjectDesc().getMedia().size() > 0) {
                    xs4Var.set(2, d17.getObjectDesc().getMedia().getFirst().getThumbUrl() + d17.getObjectDesc().getMedia().getFirst().getThumb_url_token());
                }
                xs4Var.set(3, d17.getContact() != null ? d17.getContact().getNickname() : "");
            }
        }
        b21.r rVar = musicMainUINew.f150907m;
        xs4Var.set(4, a17.getString(1));
        xs4Var.set(5, a17.getString(7));
        xs4Var.set(7, a17.getString(9));
        xs4Var.set(8, java.lang.Long.valueOf(a17.getLong(11)));
        xs4Var.set(9, a17.getString(13));
        xs4Var.set(10, java.lang.Integer.valueOf(a17.getInteger(14)));
        xs4Var.set(6, a17.getString(12));
        xs4Var.set(12, ((r45.if2) a17.getCustom(17)) != null ? ((r45.if2) a17.getCustom(17)).getString(0) : "");
        if (!android.text.TextUtils.isEmpty(a17.getString(18)) || rVar == null) {
            xs4Var.set(11, a17.getString(18));
        } else {
            xs4Var.set(11, rVar.P);
        }
        com.tencent.mm.plugin.mv.ui.shake.d0 d0Var = com.tencent.mm.plugin.mv.ui.shake.d0.f150940a;
        com.tencent.mm.plugin.mv.ui.shake.d0.f150941b.f60321q = 0L;
        d0Var.a(255);
        ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).wi(rVar, a17, musicMainUINew.getContext(), xs4Var);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
