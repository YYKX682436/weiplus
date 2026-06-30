package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes4.dex */
public class oa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201247d;

    public oa(com.tencent.mm.ui.chatting.gallery.ta taVar) {
        this.f201247d = taVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.storage.f9)) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) view.getTag();
            com.tencent.mm.ui.chatting.a aVar = com.tencent.mm.ui.chatting.a.EnterCompleteVideo;
            com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
            if (com.tencent.mm.ui.chatting.e.b(f9Var, pString, pString2)) {
                com.tencent.mm.ui.chatting.e.a(aVar, f9Var, pString.value, pString2.value);
            }
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = f9Var.z0();
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(z07);
            r45.uf6 uf6Var = h17.E;
            if (uf6Var != null && !x51.t1.b(uf6Var.f387333d)) {
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KFromTimeLine", false);
                intent.putExtra("KStremVideoUrl", uf6Var.f387333d);
                intent.putExtra("KThumUrl", uf6Var.f387338i);
                intent.putExtra("KThumbPath", tj6);
                intent.putExtra("KMediaId", "fakeid_" + f9Var.getMsgId());
                intent.putExtra("KMediaVideoTime", uf6Var.f387334e);
                intent.putExtra("KMediaTitle", uf6Var.f387337h);
                intent.putExtra("StreamWording", uf6Var.f387335f);
                intent.putExtra("StremWebUrl", uf6Var.f387336g);
                java.lang.String Q0 = f9Var.Q0();
                boolean R4 = com.tencent.mm.storage.z3.R4(Q0);
                java.lang.String s17 = R4 ? c01.w9.s(f9Var.j()) : Q0;
                intent.putExtra("KSta_StremVideoAduxInfo", uf6Var.f387339m);
                intent.putExtra("KSta_StremVideoPublishId", uf6Var.f387340n);
                intent.putExtra("KSta_SourceType", 1);
                intent.putExtra("KSta_Scene", (R4 ? com.tencent.mm.ui.chatting.b.TalkChat : com.tencent.mm.ui.chatting.b.Chat).f198482d);
                intent.putExtra("KSta_FromUserName", s17);
                intent.putExtra("KSta_ChatName", Q0);
                intent.putExtra("KSta_MsgId", f9Var.I0());
                intent.putExtra("KSta_SnsStatExtStr", h17.F);
                if (R4) {
                    intent.putExtra("KSta_ChatroomMembercount", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(Q0));
                }
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1);
                com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201247d;
                if (Ni > 0) {
                    j45.l.j(taVar.f201424b.f201092g.getContext(), "sns", ".ui.SnsAdStreamVideoPlayUI", intent, null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryViewHolder", "use new stream video play UI");
                } else {
                    j45.l.j(taVar.f201424b.f201092g.getContext(), "sns", ".ui.VideoAdPlayerUI", intent, null);
                }
            } else if (uf6Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(uf6Var.f387335f) && !com.tencent.mm.sdk.platformtools.t8.K0(uf6Var.f387336g)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryViewHolder", "moreBtn click,opening " + uf6Var.f387336g);
                android.content.Intent intent2 = new android.content.Intent();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_snsad_statextstr", h17.F);
                intent2.putExtra("jsapiargs", bundle);
                intent2.putExtra("rawUrl", uf6Var.f387336g);
                intent2.putExtra("useJs", true);
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.chatting.gallery.na(this, intent2));
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
