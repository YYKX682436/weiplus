package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145841d;

    public c(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145841d = envelopeAppBarLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145841d;
        if (envelopeAppBarLayout.N1) {
            android.content.Intent intent = new android.content.Intent();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(10, 2, 32, intent);
            intent.putExtra("finder_username", envelopeAppBarLayout.E1.f381506o);
            if (com.tencent.mm.sdk.platformtools.t8.K0(envelopeAppBarLayout.E1.f381515x)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "same_receive_link is null");
            } else {
                java.lang.String uri = android.net.Uri.parse(envelopeAppBarLayout.E1.f381515x).buildUpon().appendQueryParameter("fromscene", "2").appendQueryParameter("type", "2").build().toString();
                intent.putExtra("key_same_receive_link", uri);
                gb3.m.f270028i = uri;
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "same_receive_link is %s", uri);
            }
            intent.putExtra("key_packet_id", envelopeAppBarLayout.E1.f381508q);
            intent.putExtra("key_enter_from_story", true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("redbag_scene", 1);
                jSONObject.put("coverid", envelopeAppBarLayout.E1.f381508q);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopeAppBarLayout", "jump finder error, ", th6);
            }
            intent.putExtra("key_extra_info", jSONObject.toString());
            intent.putExtra("key_enter_profile_type", 52);
            boolean i17 = envelopeAppBarLayout.i();
            ya2.e1 e1Var = ya2.e1.f460472a;
            if (i17) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.w(envelopeAppBarLayout.U, intent);
                envelopeAppBarLayout.U.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
            } else if (envelopeAppBarLayout.V != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.w(envelopeAppBarLayout.V, intent);
                envelopeAppBarLayout.V.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
            }
            gb3.n.a(7);
            gb3.m.a(84, envelopeAppBarLayout.G1);
            com.tencent.mm.plugin.luckymoney.story.g1.f145873n++;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("red_cover_id", envelopeAppBarLayout.E1.f381508q);
                jSONObject2.put("finderusername", envelopeAppBarLayout.E1.f381506o);
                jSONObject2.put("red_cover_type", 1);
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopeAppBarLayout", "jump finder error, ", th7);
            }
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).bj("red_cover_link_unfold", 1, jSONObject2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
