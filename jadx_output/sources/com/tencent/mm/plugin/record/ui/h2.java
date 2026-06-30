package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordVoiceBaseView f155416d;

    public h2(com.tencent.mm.plugin.record.ui.RecordVoiceBaseView recordVoiceBaseView) {
        this.f155416d = recordVoiceBaseView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.record.ui.RecordVoiceBaseView recordVoiceBaseView = this.f155416d;
        java.lang.String str = recordVoiceBaseView.f155338m;
        com.tencent.mm.modelbase.c1 c1Var = recordVoiceBaseView.f155336h.f24196d;
        if (c1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
        } else {
            ((sl.j) c1Var).c();
        }
        android.content.Context context = recordVoiceBaseView.f155335g;
        if (iq.b.C(context) || iq.b.v(context) || iq.b.e(context)) {
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!fp.i.b() && !com.tencent.mm.sdk.platformtools.t8.K0(recordVoiceBaseView.f155338m)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str2 = recordVoiceBaseView.f155338m;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equals(recordVoiceBaseView.f155336h.f24197e)) {
            com.tencent.mm.modelbase.c1 c1Var2 = recordVoiceBaseView.f155336h.f24196d;
            boolean z18 = false;
            if (c1Var2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
                c17 = false;
            } else {
                c17 = ((sl.j) c1Var2).c();
            }
            if (c17) {
                recordVoiceBaseView.c();
                recordVoiceBaseView.f155336h.c();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordVoiceBaseView", "resume play");
                bt3.a3 a3Var = recordVoiceBaseView.f155336h;
                a3Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordVoiceHelper", "resume play");
                com.tencent.mm.sdk.platformtools.c3.a("keep_app_silent");
                com.tencent.mm.modelbase.c1 c1Var3 = a3Var.f24196d;
                if (c1Var3 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "resum play error, player is null");
                } else {
                    z18 = ((sl.j) c1Var3).e();
                }
                if (!z18) {
                    com.tencent.mm.plugin.record.ui.RecordVoiceBaseView.a(recordVoiceBaseView);
                }
            }
        } else {
            com.tencent.mm.plugin.record.ui.RecordVoiceBaseView.a(recordVoiceBaseView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
