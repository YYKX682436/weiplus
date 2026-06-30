package com.tencent.mm.ui.chatting.variants;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/variants/ChattingMainUI;", "Lcom/tencent/mm/ui/chatting/ChattingUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ChattingMainUI extends com.tencent.mm.ui.chatting.ChattingUI {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f202801u = jz5.h.b(ue5.b.f426949d);

    /* renamed from: v, reason: collision with root package name */
    public boolean f202802v;

    @Override // com.tencent.mm.ui.chatting.ChattingUI
    /* renamed from: d7, reason: from getter */
    public boolean getF202802v() {
        return this.f202802v;
    }

    @Override // com.tencent.mm.ui.chatting.ChattingUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        java.lang.String e76 = launcherUI != null ? launcherUI.e7() : null;
        if (kotlin.jvm.internal.o.b(e76 != null ? e76 : "", stringExtra)) {
            com.tencent.mm.ui.LauncherUI launcherUI2 = com.tencent.mm.ui.LauncherUI.getInstance();
            boolean z17 = false;
            if (launcherUI2 != null ? launcherUI2.i7() : false) {
                java.util.ArrayList arrayList = (java.util.ArrayList) bm5.m.f22701a.e();
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (r26.n0.D((java.lang.CharSequence) ((jz5.l) it.next()).f302833d, "LauncherUI", false, 2, null)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMainUI", "[onCreate]: same talker, finish: ".concat(stringExtra));
                    finish();
                }
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z17, android.content.res.Configuration configuration) {
        super.onMultiWindowModeChanged(z17, configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMainUI", "[onMultiWindowModeChanged]: " + z17);
        if (this.f202802v) {
            ((com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC) pf5.z.f353948a.a(this).a(com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC.class)).A7();
        }
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMainUI", "[onNewIntent]...?");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMainUI", "[reportOnNewIntent]");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_on_new_intent", kz5.q0.f314001d, 36085);
        finish();
        ((ku5.t0) ku5.t0.f312615d).B(new ue5.a(intent));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, r5) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
    
        if (r0 != false) goto L38;
     */
    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataFragmentActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void superImportUIComponents(java.util.HashSet r9) {
        /*
            r8 = this;
            java.lang.String r0 = "set"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[superImportUIComponents]: "
            r0.<init>(r1)
            jz5.g r1 = r8.f202801u
            r2 = r1
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            boolean r2 = r8.isFinishing()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.ChattingMainUI"
            com.tencent.mars.xlog.Log.i(r2, r0)
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf5
            c01.m8 r0 = c01.d9.f()
            com.tencent.mm.booter.notification.x r0 = (com.tencent.mm.booter.notification.x) r0
            java.lang.String r0 = r0.f63517c
            int r1 = com.tencent.mm.ui.LauncherUI.getCurrentTabIndex()
            com.tencent.mm.ui.LauncherUI r3 = com.tencent.mm.ui.LauncherUI.getInstance()
            r4 = 0
            if (r3 == 0) goto L59
            boolean r3 = r3.i7()
            goto L5a
        L59:
            r3 = r4
        L5a:
            android.content.Intent r5 = r8.getIntent()
            java.lang.String r6 = "Chat_User"
            java.lang.String r5 = r5.getStringExtra(r6)
            if (r5 != 0) goto L68
            java.lang.String r5 = ""
        L68:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[checkLauncherStatus]: "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r7 = ", "
            r6.append(r7)
            r6.append(r5)
            r6.append(r7)
            r6.append(r1)
            r6.append(r7)
            r6.append(r3)
            r6.append(r7)
            boolean r7 = r8.f202802v
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r2, r6)
            r2 = 1
            if (r0 == 0) goto Lae
            int r6 = r5.length()
            if (r6 <= 0) goto La0
            r6 = r2
            goto La1
        La0:
            r6 = r4
        La1:
            if (r6 == 0) goto Lae
            if (r1 != 0) goto Lae
            if (r3 == 0) goto Lae
            boolean r0 = kotlin.jvm.internal.o.b(r0, r5)
            if (r0 != 0) goto Le6
            goto Le5
        Lae:
            if (r1 != 0) goto Le5
            if (r3 != 0) goto Le5
            bm5.m r0 = bm5.m.f22701a
            java.util.List r0 = r0.e()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc1
            goto Le1
        Lc1:
            java.util.Iterator r0 = r0.iterator()
        Lc5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le1
            java.lang.Object r1 = r0.next()
            jz5.l r1 = (jz5.l) r1
            java.lang.Object r1 = r1.f302833d
            java.lang.Class<com.tencent.mm.ui.LauncherUI> r3 = com.tencent.mm.ui.LauncherUI.class
            java.lang.String r3 = r3.getName()
            boolean r1 = kotlin.jvm.internal.o.b(r1, r3)
            if (r1 == 0) goto Lc5
            r0 = r2
            goto Le2
        Le1:
            r0 = r4
        Le2:
            if (r0 == 0) goto Le5
            goto Le6
        Le5:
            r4 = r2
        Le6:
            if (r4 == 0) goto Lf5
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto Lf5
            java.lang.Class<com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC> r0 = com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC.class
            r9.add(r0)
            r8.f202802v = r2
        Lf5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.variants.ChattingMainUI.superImportUIComponents(java.util.HashSet):void");
    }
}
