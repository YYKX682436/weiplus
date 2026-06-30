package yw3;

/* loaded from: classes12.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI f466747d;

    public g1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI) {
        this.f466747d = repairerFlutterEmojiBridgeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI = this.f466747d;
        repairerFlutterEmojiBridgeUI.getClass();
        ((com.tencent.mm.feature.emoji.n1) ((com.tencent.mm.feature.emoji.api.e6) i95.n0.c(com.tencent.mm.feature.emoji.api.e6.class))).getClass();
        gr.t g17 = gr.t.g();
        com.tencent.mm.sdk.platformtools.r2 r2Var = g17.f274691j;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) r2Var.get("download_custom");
        if (arrayList2 == null || g17.f274682a) {
            g17.f274682a = false;
            if (!((km0.c) gm0.j1.p().a()).a()) {
                throw new java.lang.UnsupportedOperationException("need get from main process");
            }
            z85.l c17 = com.tencent.mm.storage.n5.f().c();
            c17.getClass();
            arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(c17.K1(81, true));
            r2Var.put("download_custom", arrayList2);
        }
        if (arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                com.tencent.mm.api.IEmojiInfo iEmojiInfo = (com.tencent.mm.api.IEmojiInfo) arrayList2.get(i17);
                ((com.tencent.mm.feature.emoji.b1) ((com.tencent.mm.feature.emoji.api.d6) i95.n0.c(com.tencent.mm.feature.emoji.api.d6.class))).getClass();
                wq.a f17 = wq.a.f();
                kotlin.jvm.internal.o.f(f17, "getInstance(...)");
                byte[] c18 = f17.c(iEmojiInfo);
                if (com.tencent.mm.sdk.platformtools.y1.h(c18) && c18 != null) {
                    if (!(c18.length == 0)) {
                        java.lang.String str = lp0.b.h() + "emoji/temp/decrypt/";
                        com.tencent.mm.vfs.w6.u(str);
                        java.lang.String str2 = str + iEmojiInfo.getMd5();
                        com.tencent.mm.vfs.w6.a(str2, c18);
                        repairerFlutterEmojiBridgeUI.d.put("EmojiText", str2);
                        android.widget.Toast.makeText((android.content.Context) repairerFlutterEmojiBridgeUI, (java.lang.CharSequence) ("decrypt first WXAM success, path:" + str2), 0).show();
                        com.tencent.mars.xlog.Log.i(repairerFlutterEmojiBridgeUI.f, "decrypt success, path:" + str2);
                        break;
                    }
                }
                i17++;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerFlutterEmojiBridgeUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
