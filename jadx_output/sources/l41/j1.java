package l41;

/* loaded from: classes15.dex */
public final class j1 implements l41.m {

    /* renamed from: t, reason: collision with root package name */
    public static final l41.k0 f315841t = new l41.k0(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f315842a;

    /* renamed from: b, reason: collision with root package name */
    public v41.s f315843b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest f315844c;

    /* renamed from: d, reason: collision with root package name */
    public j41.u f315845d;

    /* renamed from: e, reason: collision with root package name */
    public int f315846e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f315847f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f315848g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f315849h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f315850i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f315851j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f315852k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f315853l;

    /* renamed from: m, reason: collision with root package name */
    public final l41.r0 f315854m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f315855n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Intent f315856o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f315857p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f315858q;

    /* renamed from: r, reason: collision with root package name */
    public long f315859r;

    /* renamed from: s, reason: collision with root package name */
    public long f315860s;

    public j1(android.app.Activity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f315842a = context;
        this.f315846e = -1;
        this.f315847f = jz5.h.b(new l41.t0(this));
        this.f315848g = jz5.h.b(new l41.p0(this));
        this.f315849h = jz5.h.b(new l41.s0(this));
        this.f315850i = jz5.h.b(new l41.a1(this));
        this.f315851j = jz5.h.b(new l41.z0(this));
        this.f315854m = new l41.r0(this);
        this.f315857p = jz5.h.b(new l41.c1(this));
        this.f315858q = jz5.h.b(new l41.q0(this));
        this.f315859r = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:10:0x0027, B:17:0x0036, B:19:0x003a, B:21:0x003e, B:23:0x0048, B:28:0x0054, B:30:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #0 {Exception -> 0x0072, blocks: (B:10:0x0027, B:17:0x0036, B:19:0x003a, B:21:0x003e, B:23:0x0048, B:28:0x0054, B:30:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(l41.j1 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof l41.o0
            if (r0 == 0) goto L16
            r0 = r6
            l41.o0 r0 = (l41.o0) r0
            int r1 = r0.f315887f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f315887f = r1
            goto L1b
        L16:
            l41.o0 r0 = new l41.o0
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f315885d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f315887f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L72
            goto L70
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r6 = r5.f315844c     // Catch: java.lang.Exception -> L72
            if (r6 == 0) goto L45
            android.content.Intent r6 = r6.f72289x     // Catch: java.lang.Exception -> L72
            if (r6 == 0) goto L45
            java.lang.String r2 = "key_appbrand_check_bind_info"
            java.lang.String r6 = r6.getStringExtra(r2)     // Catch: java.lang.Exception -> L72
            goto L46
        L45:
            r6 = 0
        L46:
            if (r6 == 0) goto L51
            int r2 = r6.length()     // Catch: java.lang.Exception -> L72
            if (r2 != 0) goto L4f
            goto L51
        L4f:
            r2 = r3
            goto L52
        L51:
            r2 = r4
        L52:
            if (r2 == 0) goto L62
            jz5.l r1 = new jz5.l     // Catch: java.lang.Exception -> L72
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Exception -> L72
            r6 = 5
            r5.<init>(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = "request invalid"
            r1.<init>(r5, r6)     // Catch: java.lang.Exception -> L72
            goto L89
        L62:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L72
            r2.<init>(r6)     // Catch: java.lang.Exception -> L72
            r0.f315887f = r4     // Catch: java.lang.Exception -> L72
            java.lang.Object r6 = r5.p(r2, r0)     // Catch: java.lang.Exception -> L72
            if (r6 != r1) goto L70
            goto L89
        L70:
            r1 = r6
            goto L89
        L72:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r0 = "MicroMsg.OpenIMKefuConfirmController"
            java.lang.String r1 = "checkAppBrandBindState exception"
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r5, r1, r6)
            jz5.l r1 = new jz5.l
            java.lang.Integer r5 = new java.lang.Integer
            r6 = 6
            r5.<init>(r6)
            java.lang.String r6 = "check failed"
            r1.<init>(r5, r6)
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l41.j1.a(l41.j1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(l41.j1 j1Var, m41.d dVar) {
        j1Var.getClass();
        boolean z17 = dVar.f323447i;
        r45.iq6 iq6Var = (r45.iq6) dVar.f68421b;
        int i17 = iq6Var.f377271d;
        java.lang.String str = iq6Var.f377273f;
        j1Var.f315846e = iq6Var.f377272e;
        j1Var.f315845d = dVar.f323446h;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "handleTryAddSuccess isDegraded: " + z17 + ", confirmType: " + j1Var.f315846e + ", source: " + i17 + ", antispamTips: " + str);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "tryAdd degraded to getContact, confirmType: " + j1Var.f315846e);
            ((ku5.t0) ku5.t0.f312615d).B(new l41.u0(j1Var));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "tryAdd success without degradation, confirmType: " + j1Var.f315846e);
        ((ku5.t0) ku5.t0.f312615d).B(new l41.v0(j1Var));
        ku5.u0 u0Var = ku5.t0.f312615d;
        l41.w0 w0Var = new l41.w0(j1Var);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(w0Var, 400L, false);
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "cancelConfirmPage confirmPageType: %s, confirmType: %s", java.lang.Integer.valueOf(j()), java.lang.Integer.valueOf(this.f315846e));
        this.f315852k = true;
        android.os.ResultReceiver l17 = l();
        m();
        if (l17 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("result_key_err_code", 3);
            bundle.putString("result_key_err_msg", "user cancel");
            bundle.putInt("result_key_action", 6);
            l17.send(3, bundle);
        }
        v41.s sVar = this.f315843b;
        if (sVar == null) {
            g(3, "user cancel");
        } else if (sVar != null) {
            sVar.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:23:0x0064, B:25:0x0068, B:28:0x0070, B:32:0x0079, B:34:0x007d, B:36:0x0085, B:41:0x0091, B:43:0x0099, B:45:0x009d, B:46:0x00a1, B:48:0x00a7, B:49:0x00ad, B:51:0x00b6, B:54:0x00bd, B:56:0x00c1, B:60:0x00c9, B:64:0x00cb), top: B:22:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l41.j1.d(int):void");
    }

    public final void e() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f315855n;
        boolean z17 = false;
        if (u3Var2 != null && u3Var2.isShowing()) {
            z17 = true;
        }
        if (!z17 || (u3Var = this.f315855n) == null) {
            return;
        }
        u3Var.dismiss();
    }

    public void f(int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "finishUI resultCode: %d, data == null: %b", objArr);
        if (i18 != 0 && i18 != 3 && i18 != 7) {
            q();
        }
        android.app.Activity activity = this.f315842a;
        activity.setResult(i17, intent);
        activity.finish();
        e();
        v41.s sVar = this.f315843b;
        if (sVar != null) {
            sVar.release();
        }
        this.f315843b = null;
    }

    public final void g(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuConfirmController", "finishUI errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_err_code", i17);
        intent.putExtra("key_result_err_msg", str);
        f(-1, i17, intent);
    }

    public boolean h() {
        boolean z17 = j41.g0.a(this.f315846e) && this.f315853l;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "finishWhenCancel: %s", java.lang.Boolean.valueOf(z17));
        return !z17;
    }

    public boolean i() {
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f315844c;
        if (!(openIMKefuStartConversationRequest != null && openIMKefuStartConversationRequest.f72274f == 1)) {
            if (!(openIMKefuStartConversationRequest != null && openIMKefuStartConversationRequest.f72274f == 2)) {
                return true;
            }
        }
        return false;
    }

    public final int j() {
        return ((java.lang.Number) ((jz5.n) this.f315848g).getValue()).intValue();
    }

    public final int k() {
        return ((java.lang.Number) ((jz5.n) this.f315849h).getValue()).intValue();
    }

    public final android.os.ResultReceiver l() {
        return (android.os.ResultReceiver) ((jz5.n) this.f315851j).getValue();
    }

    public final long m() {
        return ((java.lang.Number) ((jz5.n) this.f315850i).getValue()).longValue();
    }

    public final void n() {
        this.f315853l = false;
        if (this.f315852k) {
            return;
        }
        e();
        l41.e2.b(l(), m(), false, 4, "start conversation failed");
        v41.s sVar = this.f315843b;
        if (sVar != null) {
            sVar.e();
        }
        if (i()) {
            return;
        }
        q();
    }

    public final void o() {
        this.f315853l = false;
        if (this.f315852k) {
            return;
        }
        e();
        ((ku5.t0) ku5.t0.f312615d).B(new l41.x0(this));
    }

    public final java.lang.Object p(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "checkAppBrandBindState data: " + jSONObject);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("extInfo"));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6803;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/checkappcustomerservicebind";
        r45.nz nzVar = new r45.nz();
        nzVar.f381773f = jSONObject2.optString("url");
        nzVar.f381771d = jSONObject.optString("appId");
        nzVar.f381772e = jSONObject.optString("corpId");
        lVar.f70664a = nzVar;
        lVar.f70665b = new r45.oz();
        com.tencent.mm.ipcinvoker.wx_extension.h0.a(lVar.a(), new l41.y0(nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final void q() {
        if (((java.lang.Boolean) ((jz5.n) this.f315857p).getValue()).booleanValue()) {
            ((ku5.t0) ku5.t0.f312615d).B(new l41.d1(this));
        }
    }

    public final void r(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "tryAddKefuConversation start");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f315855n;
        boolean z18 = u3Var != null && u3Var.isShowing();
        android.app.Activity activity = this.f315842a;
        if (!z18) {
            this.f315855n = db5.e1.Q(activity, "", activity.getString(com.tencent.mm.R.string.f490604zq), false, true, new l41.g1(this));
        }
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = this.f315844c;
        if (openIMKefuStartConversationRequest == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuConfirmController", "tryAddKefuConversation request is null");
            n();
            return;
        }
        int i17 = openIMKefuStartConversationRequest.f72274f;
        r45.s4 s4Var = openIMKefuStartConversationRequest.f72277i;
        java.lang.String str = s4Var != null ? s4Var.f385490h : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = s4Var != null ? s4Var.f385486d : null;
        if (str2 == null) {
            str2 = "";
        }
        j41.h0 h0Var = new j41.h0(i17, str, str2);
        h0Var.f297635e = true;
        if (z17) {
            h0Var.f297636f = 1;
        }
        android.content.Intent intent = this.f315856o;
        h0Var.f297637g = intent != null ? intent.getByteArrayExtra("key_spam_context") : null;
        h0Var.f297638h = openIMKefuStartConversationRequest.f72290y;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        objArr[1] = java.lang.Integer.valueOf(h0Var.f297636f);
        objArr[2] = 1;
        objArr[3] = java.lang.Integer.valueOf(openIMKefuStartConversationRequest.f72274f);
        r45.s4 s4Var2 = openIMKefuStartConversationRequest.f72277i;
        objArr[4] = s4Var2 != null ? s4Var2.f385490h : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmController", "tryAddKefuConversation build request, enablePhase2Opt: %s, kfInfoScene: %s (IGNORE_PRODUCT_LIST=%s), scene: %s, username: %s", objArr);
        r45.s4 s4Var3 = openIMKefuStartConversationRequest.f72277i;
        java.lang.String str3 = s4Var3 != null ? s4Var3.f385490h : null;
        j41.j0 j0Var = new j41.j0(str3 != null ? str3 : "");
        android.content.Intent intent2 = this.f315856o;
        j0Var.f297651e = intent2 != null ? intent2.getByteArrayExtra("key_spam_context") : null;
        j0Var.f297652f = openIMKefuStartConversationRequest.f72290y;
        this.f315853l = true;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = activity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity : null;
        kotlinx.coroutines.l.d(appCompatActivity != null ? v65.m.b(appCompatActivity) : kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new l41.h1(h0Var, j0Var, openIMKefuStartConversationRequest, this, z17, null), 2, null);
    }
}
