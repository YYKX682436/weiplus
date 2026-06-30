package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f191967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI f191968e;

    public w4(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI, android.os.Bundle bundle) {
        this.f191968e = miniQBReaderUI;
        this.f191967d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        md5.a aVar;
        final com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI = this.f191968e;
        final android.os.Bundle bundle = this.f191967d;
        if (bundle != null) {
            int i17 = com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.R;
            miniQBReaderUI.getClass();
            java.lang.String string = bundle.getString("dn");
            android.view.View inflate = android.view.LayoutInflater.from(miniQBReaderUI).inflate(com.tencent.mm.R.layout.ehk, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.u7v);
            textView.getPaint().setFakeBoldText(true);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(miniQBReaderUI, string, textSize));
            textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i18 = com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.R;
                    com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI2 = com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.this;
                    miniQBReaderUI2.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.os.Bundle bundle2 = bundle;
                    arrayList.add(bundle2);
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/MiniQBReaderUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", miniQBReaderUI2, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(bundle2);
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/MiniQBReaderUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", miniQBReaderUI2, array2);
                    com.tencent.mm.autogen.events.CleanJumpChatEvent cleanJumpChatEvent = new com.tencent.mm.autogen.events.CleanJumpChatEvent();
                    am.z2 z2Var = cleanJumpChatEvent.f54061g;
                    z2Var.f8508a = miniQBReaderUI2;
                    z2Var.f8509b = bundle2;
                    cleanJumpChatEvent.e();
                    yj0.a.h(miniQBReaderUI2, "com/tencent/mm/pluginsdk/ui/tools/MiniQBReaderUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(miniQBReaderUI2, "com/tencent/mm/pluginsdk/ui/tools/MiniQBReaderUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            com.tencent.mm.xwebutil.i.f214840b = new uh0.q(inflate, 72, 0, 0, 0, 0);
        } else {
            com.tencent.mm.xwebutil.i.f214840b = null;
        }
        ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
        com.tencent.mm.xwebutil.i.f214839a = com.tencent.mm.pluginsdk.model.t3.q(miniQBReaderUI);
        vt0.c.f(miniQBReaderUI.f191401s.s(), miniQBReaderUI.f191401s.a(), false, miniQBReaderUI, miniQBReaderUI.f191394i, miniQBReaderUI.f191398p, miniQBReaderUI.f191395m, miniQBReaderUI.f191396n, miniQBReaderUI.f191399q, miniQBReaderUI.f191397o, miniQBReaderUI.f191388J, com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.V6(miniQBReaderUI, true), false, "", true, miniQBReaderUI.f191407y);
        uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
        java.lang.String str = miniQBReaderUI.f191395m;
        android.content.Intent intent = new android.content.Intent();
        ((th0.u) rVar).getClass();
        com.tencent.xweb.k h17 = com.tencent.xweb.n.h(str, true, intent);
        if (h17 == com.tencent.xweb.k.X5) {
            md5.b bVar = miniQBReaderUI.f191401s;
            if (bVar != null) {
                bVar.f325884z = true;
            }
            md5.a aVar2 = miniQBReaderUI.f191402t;
            if (aVar2 != null) {
                java.lang.String str2 = bVar.f300077a.field_id;
                aVar2.f325879q = true;
                aVar2.f325880r = false;
                aVar2.f325881s = str2;
            }
        } else if (h17 == com.tencent.xweb.k.XWEB && (aVar = miniQBReaderUI.f191402t) != null) {
            java.lang.String str3 = miniQBReaderUI.f191401s.f300077a.field_id;
            aVar.f325879q = false;
            aVar.f325880r = true;
            aVar.f325881s = str3;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setAction("MINIQB_OPEN_RET");
        intent2.putExtra("op_type", "OPEN_MINI_QBREADER");
        intent2.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        miniQBReaderUI.sendBroadcast(intent2, com.tencent.mm.sdk.platformtools.v9.a());
    }
}
