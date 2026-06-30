package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgFileUI f155363d;

    public c1(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI) {
        this.f155363d = recordMsgFileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = this.f155363d;
        java.lang.String t17 = bt3.g2.t(recordMsgFileUI.f155300v, recordMsgFileUI.f155298t, recordMsgFileUI.f155297s, 1);
        new android.content.Intent().setAction("android.intent.action.VIEW");
        if (4 == recordMsgFileUI.T6()) {
            recordMsgFileUI.C = false;
            recordMsgFileUI.a7();
        } else if (!o72.x1.t0(bw5.ar0.TingScene_ChatHistory, recordMsgFileUI.f155300v, t17)) {
            r45.gp0 gp0Var = recordMsgFileUI.f155300v;
            java.lang.String str = gp0Var.K;
            com.tencent.mm.storage.f9 f9Var = recordMsgFileUI.f155302x;
            bt3.g2.t(gp0Var, f9Var.Q0(), f9Var.getMsgId(), 1);
            if (com.tencent.mm.sdk.platformtools.t8.F0(str)) {
                r45.gp0 gp0Var2 = recordMsgFileUI.f155300v;
                com.tencent.mm.storage.f9 f9Var2 = recordMsgFileUI.f155302x;
                java.lang.String t18 = bt3.g2.t(gp0Var2, f9Var2.Q0(), f9Var2.getMsgId(), 1);
                java.lang.String str2 = recordMsgFileUI.f155300v.f375404d;
                re5.f0.a(t18);
                android.content.Intent intent = new android.content.Intent(recordMsgFileUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.media.MediaGalleryContainerUI.class);
                pf5.j0.a(intent, re5.g0.class);
                intent.putExtra("KEY_PATH", t18);
                intent.putExtra("KEY_VIDEO_FILE_NAME", str2);
                intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_COMMON_AREA_CONTROL, true);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(recordMsgFileUI, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "openByVideoPlayer", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                recordMsgFileUI.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(recordMsgFileUI, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "openByVideoPlayer", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).wi(recordMsgFileUI, t17, recordMsgFileUI.f155300v.K, 5);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
