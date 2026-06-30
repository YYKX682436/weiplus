package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class t0 implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175470a;

    public t0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175470a = v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // z21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String[] r5, java.util.List r6) {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.TransVoiceDialog"
            java.lang.String r1 = "onRes."
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.plugin.transvoice.ui.v0 r0 = r4.f175470a
            r0.Z = r6
            com.tencent.mm.sdk.platformtools.n3 r6 = r0.L
            r1 = 5000(0x1388, float:7.006E-42)
            if (r6 == 0) goto L15
            r6.removeMessages(r1)
        L15:
            com.tencent.mm.sdk.platformtools.n3 r6 = r0.L
            if (r6 == 0) goto L1e
            r2 = 5000(0x1388, double:2.4703E-320)
            r6.sendEmptyMessageDelayed(r1, r2)
        L1e:
            r6 = 0
            r1 = 1
            if (r5 == 0) goto L33
            r2 = r5[r6]
            if (r2 == 0) goto L33
            int r2 = r2.length()
            if (r2 <= 0) goto L2e
            r2 = r1
            goto L2f
        L2e:
            r2 = r6
        L2f:
            if (r2 != r1) goto L33
            r2 = r1
            goto L34
        L33:
            r2 = r6
        L34:
            if (r2 == 0) goto L64
            r5 = r5[r6]
            java.lang.String r6 = "<set-?>"
            kotlin.jvm.internal.o.g(r5, r6)
            r0.f175496x0 = r5
            com.tencent.mm.plugin.transvoice.model.e r6 = r0.f175479f
            int r5 = r5.length()
            r6.f175395s = r5
            boolean r5 = r0.I
            if (r5 != 0) goto L64
            r0.I = r1
            com.tencent.mm.ui.widget.MMEditText r5 = r0.f175484n
            if (r5 != 0) goto L52
            goto L55
        L52:
            r5.setFocusable(r1)
        L55:
            com.tencent.mm.ui.widget.MMEditText r5 = r0.f175484n
            if (r5 != 0) goto L5a
            goto L5d
        L5a:
            r5.setFocusableInTouchMode(r1)
        L5d:
            com.tencent.mm.ui.widget.MMEditText r5 = r0.f175484n
            if (r5 == 0) goto L64
            r5.requestFocus()
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.transvoice.ui.t0.a(java.lang.String[], java.util.List):void");
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TransVoiceDialog", "onRecognizeFinish.");
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175470a;
        v0Var.I = false;
        com.tencent.mm.plugin.transvoice.model.e eVar = v0Var.f175479f;
        eVar.f175398v = 1;
        eVar.f175394r = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.n3 n3Var = v0Var.L;
        if (n3Var != null) {
            n3Var.removeMessages(5000);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = v0Var.H;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.plugin.transvoice.ui.v0.D(v0Var);
        android.view.View view = v0Var.f175486p;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$startTrans$1", "onRecognizeFinish", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$startTrans$1", "onRecognizeFinish", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TransVoiceDialog", "onError, errType: %d, errCode: %d, localCode: %d, voiceid: %d.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.transvoice.model.e eVar = this.f175470a.f175479f;
        eVar.f175398v = 0;
        eVar.f175394r = java.lang.System.currentTimeMillis();
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
    }
}
