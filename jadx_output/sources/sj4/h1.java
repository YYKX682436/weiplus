package sj4;

/* loaded from: classes11.dex */
public final class h1 implements bi4.t0, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final bi4.n1 f408847d;

    /* renamed from: e, reason: collision with root package name */
    public final bi4.l1 f408848e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f408849f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f408850g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f408851h;

    /* renamed from: i, reason: collision with root package name */
    public cj4.r1 f408852i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f408853m;

    public h1(android.content.Context context, bi4.n1 param, bi4.l1 l1Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(param, "param");
        this.f408847d = param;
        this.f408848e = l1Var;
        this.f408849f = new java.lang.ref.WeakReference(context);
    }

    public final void a(pj4.b0 b0Var) {
        bi4.d1 d1Var = new bi4.d1();
        if (b0Var != null) {
            d1Var.f354937d = b0Var;
        }
        bi4.n1 n1Var = this.f408847d;
        d1Var.f354942i = n1Var.f354966h;
        d1Var.f354953w = n1Var.f354967i;
        d1Var.f354955y = n1Var.f354970o;
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver() { // from class: com.tencent.mm.plugin.textstatus.third.TextStatusActionTask$jumpSetStatus$setStatusCallback$1
            {
                super(null);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                byte[] byteArray;
                super.onReceiveResult(i17, bundle);
                int i18 = i17 == -1 ? 0 : 2;
                bi4.l1 l1Var = sj4.h1.this.f408848e;
                if (l1Var != null) {
                    pj4.r0 r0Var = new pj4.r0();
                    r0Var.f355272d = 2;
                    pj4.w wVar = new pj4.w();
                    if (bundle != null && (byteArray = bundle.getByteArray("select_status_info")) != null) {
                        wVar.parseFrom(byteArray);
                    }
                    r0Var.f355273e = wVar;
                    l1Var.onFinishAction(i18, "", r0Var);
                }
            }
        };
        android.content.Context context = (android.content.Context) this.f408849f.get();
        if (context != null && (!(context instanceof android.app.Activity) || !((android.app.Activity) context).isFinishing())) {
            ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ri(context, d1Var, resultReceiver);
        }
        android.app.ProgressDialog progressDialog = this.f408853m;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f408853m = null;
    }

    @Override // bi4.t0
    public void cancel() {
        com.tencent.mm.modelbase.m1 m1Var;
        this.f408850g = true;
        java.lang.ref.WeakReference weakReference = this.f408851h;
        if (weakReference != null && (m1Var = (com.tencent.mm.modelbase.m1) weakReference.get()) != null) {
            gm0.j1.d().d(m1Var);
        }
        android.app.ProgressDialog progressDialog = this.f408853m;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if ((kotlin.jvm.internal.o.b(r1.f355139d, "5") || kotlin.jvm.internal.o.b(r1.f355139d, "7")) == true) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r8, int r9, java.lang.String r10, com.tencent.mm.modelbase.m1 r11) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj4.h1.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
