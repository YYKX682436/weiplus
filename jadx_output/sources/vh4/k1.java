package vh4;

/* loaded from: classes5.dex */
public final class k1 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 addMsgInfo) {
        java.lang.String j17;
        android.app.Activity activity;
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        if (gm0.j1.a()) {
            r45.j4 j4Var = addMsgInfo.f70726a;
            if (j4Var != null && j4Var.f377560g == 10002) {
                java.lang.String g17 = x51.j1.g(j4Var.f377561h);
                w15.g gVar = new w15.g();
                kotlin.jvm.internal.o.d(g17);
                gVar.fromXml(g17);
                w15.f j18 = gVar.j();
                if (j18 != null) {
                    if ((ot5.h.f348877a.a(j18.getUuid(), wo.w0.k(), "MicroMsg.ShowTeenageModeStaticSysCmdMsgNewXmlListener", false) || kotlin.jvm.internal.o.b(j18.getUuid(), "uuidtest")) && (j17 = j18.j()) != null) {
                        java.lang.String k17 = j18.k();
                        boolean equals = k17 != null ? k17.equals("1") : false;
                        java.lang.ref.WeakReference k18 = com.tencent.mm.app.w.k();
                        if (k18 == null || (activity = (android.app.Activity) k18.get()) == null) {
                            java.lang.ref.WeakReference j19 = com.tencent.mm.app.w.INSTANCE.j();
                            activity = j19 != null ? (android.app.Activity) j19.get() : null;
                        }
                        if (activity != null) {
                            android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro.class);
                            intent.putExtra("IntentKey_DeadlineWord", j17);
                            intent.putExtra("IntentKey_Title", activity.getString(com.tencent.mm.R.string.ohu));
                            intent.putExtra("IntentKey_BackIconRes", com.tencent.mm.R.raw.close_cross);
                            intent.putExtra("IntentKey_ForceDisplay", equals);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(intent);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/ShowTeenageModeStaticSysCmdMsgNewXmlListener", "onRecieveMsg", "(Lcom/tencent/mm/modelbase/IMessageExtension$AddMsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            activity.startActivity((android.content.Intent) arrayList.get(0));
                            yj0.a.f(activity, "com/tencent/mm/plugin/teenmode/model/ShowTeenageModeStaticSysCmdMsgNewXmlListener", "onRecieveMsg", "(Lcom/tencent/mm/modelbase/IMessageExtension$AddMsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }
                }
            }
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
    }
}
