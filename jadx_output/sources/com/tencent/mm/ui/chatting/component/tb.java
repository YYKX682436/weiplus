package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class tb implements com.tencent.mm.pluginsdk.ui.chat.e5 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.animation.Animation f199990a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.animation.Animation f199991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jb f199992c;

    public tb(com.tencent.mm.ui.chatting.component.jb jbVar) {
        this.f199992c = jbVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.e5
    public boolean a(boolean z17) {
        com.tencent.mm.ui.chatting.component.jb jbVar = this.f199992c;
        jbVar.f199277v = z17;
        if (this.f199990a == null) {
            this.f199990a = android.view.animation.AnimationUtils.loadAnimation(jbVar.f198580d.f460717l.getContext(), com.tencent.mm.R.anim.f477857df);
            this.f199991b = android.view.animation.AnimationUtils.loadAnimation(jbVar.f198580d.f460717l.getContext(), com.tencent.mm.R.anim.f477855dd);
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "switchFooterToInput customFooter is %s", jbVar.f199265g);
            com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = jbVar.f199265g;
            if (chatFooterCustom != null) {
                chatFooterCustom.startAnimation(this.f199991b);
            }
            jbVar.I0();
            jbVar.f199263e.startAnimation(this.f199990a);
            jbVar.f199263e.postInvalidateDelayed(this.f199990a.getDuration());
        } else {
            jbVar.f199263e.startAnimation(this.f199991b);
            jbVar.H0();
            com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom2 = jbVar.f199265g;
            if (chatFooterCustom2 != null) {
                chatFooterCustom2.startAnimation(this.f199990a);
                jbVar.f199265g.postInvalidateDelayed(this.f199990a.getDuration());
            }
        }
        sb5.f fVar = (sb5.f) jbVar.f198580d.f460708c.a(sb5.f.class);
        if (fVar != null) {
            java.lang.String x17 = jbVar.f198580d.x();
            int i17 = 2;
            int i18 = z17 ? 1 : 2;
            com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) fVar;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(x17) && r01.z.n(x17)) {
                com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) aVar.f198580d.f460708c.a(sb5.z.class));
                com.tencent.mm.storage.f9 item = kVar.getCount() > 0 ? kVar.getItem(kVar.getCount() - 1) : null;
                if (item == null) {
                    i17 = 1;
                } else if (item.getType() != 285212721) {
                    if (item.getType() == 318767153) {
                        i17 = 5;
                    } else {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(item.R1())) {
                            if (item.P1() == 1) {
                                i17 = 3;
                            } else if (item.P1() == 2) {
                                i17 = 4;
                            }
                        }
                        i17 = 0;
                    }
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20018, java.lang.Long.valueOf(aVar.f198751p), x17, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i17), item == null ? "" : !com.tencent.mm.sdk.platformtools.t8.K0(item.R1()) ? item.R1() : item.A0() == 0 ? item.Q0() : c01.z1.r(), 1);
            }
        }
        if (com.tencent.mm.storage.z3.L3(jbVar.f198580d.x())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", jbVar.f198580d.x());
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(jbVar.f198580d.k())));
            hashMap.put("enter_sessionid", jbVar.f198580d.f460722q);
            hashMap.put("change_type", java.lang.Integer.valueOf(z17 ? 1 : 0));
            hashMap.put("view_id", "yuanbao_chat_bar_change");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
        return false;
    }
}
