package nr2;

/* loaded from: classes2.dex */
public final class l extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f339251d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f339252e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f339253f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f339254g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f339255h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f339256i;

    /* renamed from: m, reason: collision with root package name */
    public nr2.m f339257m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f339258n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f339252e = new java.util.ArrayList();
        this.f339253f = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f339254g = true;
        this.f339256i = "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:28)|(1:23)|24|(2:26|27))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(nr2.l r8, so2.q6 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof nr2.b
            if (r0 == 0) goto L16
            r0 = r10
            nr2.b r0 = (nr2.b) r0
            int r1 = r0.f339164f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f339164f = r1
            goto L1b
        L16:
            nr2.b r0 = new nr2.b
            r0.<init>(r8, r10)
        L1b:
            r5 = r0
            java.lang.Object r10 = r5.f339162d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f339164f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L79
            goto L72
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L79
            db2.t1 r1 = new db2.t1     // Catch: java.lang.Throwable -> L79
            android.app.Activity r8 = r8.getContext()     // Catch: java.lang.Throwable -> L79
            java.lang.String r10 = "context"
            kotlin.jvm.internal.o.g(r8, r10)     // Catch: java.lang.Throwable -> L79
            boolean r10 = r8 instanceof com.tencent.mm.ui.MMFragmentActivity     // Catch: java.lang.Throwable -> L79
            r3 = 0
            if (r10 == 0) goto L59
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8     // Catch: java.lang.Throwable -> L79
            pf5.z r10 = pf5.z.f353948a     // Catch: java.lang.Throwable -> L79
            pf5.v r8 = r10.a(r8)     // Catch: java.lang.Throwable -> L79
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r10 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r8 = r8.a(r10)     // Catch: java.lang.Throwable -> L79
            com.tencent.mm.plugin.finder.viewmodel.component.ny r8 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r8     // Catch: java.lang.Throwable -> L79
            goto L5a
        L59:
            r8 = r3
        L5a:
            if (r8 == 0) goto L60
            r45.qt2 r3 = r8.V6()     // Catch: java.lang.Throwable -> L79
        L60:
            r1.<init>(r9, r3)     // Catch: java.lang.Throwable -> L79
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f339164f = r2     // Catch: java.lang.Throwable -> L79
            r2 = r8
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L79
            if (r10 != r0) goto L72
            goto L85
        L72:
            r45.oa1 r10 = (r45.oa1) r10     // Catch: java.lang.Throwable -> L79
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r10)     // Catch: java.lang.Throwable -> L79
            goto L84
        L79:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r8)
        L84:
            r0 = r8
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.l.O6(nr2.l, so2.q6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View P6() {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.l.P6():android.view.View");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        byte[] byteArrayExtra = getContext().getIntent().getByteArrayExtra("paid_collection_info");
        if (byteArrayExtra != null) {
            com.tencent.mm.protobuf.f parseFrom = new r45.do2().parseFrom(byteArrayExtra);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPaidCollectionInfo");
            this.f339257m = new nr2.m((r45.do2) parseFrom);
        }
        this.f339256i = pm0.v.u(getIntent().getLongExtra("key_ref_object_id", 0L));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f339252e = new java.util.ArrayList();
        this.f339253f = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f339254g = true;
        this.f339256i = "";
    }
}
