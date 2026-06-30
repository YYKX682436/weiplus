package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class fp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f168355d;

    public fp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI) {
        this.f168355d = snsSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f168355d.getContext());
        u1Var.u("清除见面有礼广告彩蛋页MMKV（重启生效）");
        u1Var.f(java.lang.Boolean.TRUE);
        u1Var.b(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.plugin.sns.ui.fp$$a
            /* JADX WARN: Removed duplicated region for block: B:7:0x002f A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0021, B:7:0x002f, B:8:0x0038), top: B:10:0x0021 }] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0038 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0021, B:7:0x002f, B:8:0x0038), top: B:10:0x0021 }] */
            @Override // com.tencent.mm.ui.widget.dialog.w1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(boolean r7, java.lang.String r8) {
                /*
                    r6 = this;
                    com.tencent.mm.plugin.sns.ui.fp r0 = com.tencent.mm.plugin.sns.ui.fp.this
                    r0.getClass()
                    java.lang.String r1 = "lambda$onClick$0"
                    java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsSettingUI$7"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                    com.tencent.mm.plugin.sns.ui.SnsSettingUI r0 = r0.f168355d
                    r0.hideVKB()
                    if (r7 == 0) goto L59
                    java.lang.String r7 = "clearSelectCardList, key is "
                    java.lang.String r0 = "clearSelectCardList"
                    java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage"
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
                    java.lang.String r4 = "RandomSelectCardStorage"
                    if (r8 == 0) goto L2c
                    int r5 = r8.length()     // Catch: java.lang.Throwable -> L2a
                    if (r5 != 0) goto L28
                    goto L2c
                L28:
                    r5 = 0
                    goto L2d
                L2a:
                    r7 = move-exception
                    goto L53
                L2c:
                    r5 = 1
                L2d:
                    if (r5 == 0) goto L38
                    java.lang.String r7 = "clearSelectCardList, vangoghId is null or empty"
                    com.tencent.mars.xlog.Log.w(r4, r7)     // Catch: java.lang.Throwable -> L2a
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)     // Catch: java.lang.Throwable -> L2a
                    goto L59
                L38:
                    y84.p3 r5 = y84.p3.f460192a     // Catch: java.lang.Throwable -> L2a
                    java.lang.String r8 = r5.a(r8)     // Catch: java.lang.Throwable -> L2a
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
                    r5.<init>(r7)     // Catch: java.lang.Throwable -> L2a
                    r5.append(r8)     // Catch: java.lang.Throwable -> L2a
                    java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L2a
                    com.tencent.mars.xlog.Log.i(r4, r7)     // Catch: java.lang.Throwable -> L2a
                    java.lang.String r7 = ""
                    p34.o.i(r8, r7)     // Catch: java.lang.Throwable -> L2a
                    goto L56
                L53:
                    ca4.q.c(r4, r7)
                L56:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
                L59:
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.fp$$a.a(boolean, java.lang.String):void");
            }
        });
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$7");
    }
}
