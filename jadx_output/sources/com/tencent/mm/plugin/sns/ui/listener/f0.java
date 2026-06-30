package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169778d;

    public f0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169778d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        int width;
        int height;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$29");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.i2) {
            com.tencent.mm.plugin.sns.ui.i2 i2Var = (com.tencent.mm.plugin.sns.ui.i2) view.getTag();
            r45.jj4 jj4Var = (r45.jj4) i2Var.f168549a.ContentObj.f369840h.get(0);
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            java.lang.String str3 = i2Var.f168550b;
            Fj.b1(str3);
            java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
            java.lang.String R = ca4.z0.R(jj4Var);
            if (com.tencent.mm.vfs.w6.j(d17 + R)) {
                str = d17 + R;
                str2 = d17 + ca4.z0.U(jj4Var);
            } else {
                str = "";
                str2 = "";
            }
            if (com.tencent.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var))) {
                str = d17 + ca4.z0.Y(jj4Var);
                str2 = d17 + ca4.z0.a0(jj4Var);
            }
            int[] iArr = new int[2];
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.chp);
            if (findViewById != null) {
                findViewById.getLocationInWindow(iArr);
                width = findViewById.getWidth();
                height = findViewById.getHeight();
            } else {
                view.getLocationInWindow(iArr);
                width = view.getWidth();
                height = view.getHeight();
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169778d;
            intent.setClass(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar), com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.class);
            intent.putExtra("intent_videopath", str);
            intent.putExtra("intent_thumbpath", str2);
            intent.putExtra("intent_localid", str3);
            intent.putExtra("intent_isad", false);
            intent.putExtra("intent_from_scene", com.tencent.mm.plugin.sns.ui.listener.i.n(iVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            int i17 = iVar.f169807j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            intent.putExtra("intent_sns_scene", i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            java.lang.String str4 = iVar.f169808k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            intent.putExtra("intent_session_id_sns", str4);
            intent.putExtra("img_gallery_left", iArr[0]);
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", width);
            intent.putExtra("img_gallery_height", height);
            android.app.Activity e17 = com.tencent.mm.plugin.sns.ui.listener.i.e(iVar);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            e17.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).overridePendingTransition(0, 0);
            com.tencent.mm.plugin.sns.ui.listener.i.Q(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar), i2Var.f168549a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$29");
    }
}
