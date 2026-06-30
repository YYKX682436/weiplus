package gk5;

/* loaded from: classes9.dex */
public final class r0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.SequenceLifecycleScope f272714d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f272715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f272714d = new com.tencent.mm.sdk.coroutines.SequenceLifecycleScope("ForwardNoteToWeWorkUIC", activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T6(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof gk5.h0
            if (r0 == 0) goto L13
            r0 = r7
            gk5.h0 r0 = (gk5.h0) r0
            int r1 = r0.f272663g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f272663g = r1
            goto L18
        L13:
            gk5.h0 r0 = new gk5.h0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f272661e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f272663g
            java.lang.String r3 = "MicroMsg.ForwardNoteToWeWorkUIC"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.f272660d
            gk5.r0 r6 = (gk5.r0) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L73
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r7 = r26.n0.N(r6)
            r7 = r7 ^ r4
            if (r7 == 0) goto L8f
            oc0.b r7 = new oc0.b
            r7.<init>()
            java.lang.String r2 = "<set-?>"
            kotlin.jvm.internal.o.g(r6, r2)
            r7.f344126e = r6
            java.lang.Class<mc0.k> r6 = mc0.k.class
            i95.m r2 = i95.n0.c(r6)
            mc0.k r2 = (mc0.k) r2
            zs3.z r2 = (zs3.z) r2
            r2.getClass()
            bt3.g0 r2 = new bt3.g0
            r2.<init>()
            r7.f344128g = r2
            i95.m r6 = i95.n0.c(r6)
            mc0.k r6 = (mc0.k) r6
            r0.f272660d = r5
            r0.f272663g = r4
            zs3.z r6 = (zs3.z) r6
            java.lang.Object r7 = r6.hj(r7, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            r6 = r5
        L73:
            oc0.c r7 = (oc0.c) r7
            oc0.d r0 = r7.f344131a
            oc0.d r1 = oc0.d.f344133d
            if (r0 != r1) goto L8b
            java.lang.String r6 = r7.f344132b     // Catch: java.lang.Exception -> L7e
            return r6
        L7e:
            r7 = move-exception
            r6.V6()
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = "record_attach_upload_xml"
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r7, r0, r6)
            goto L94
        L8b:
            r6.V6()
            goto L94
        L8f:
            java.lang.String r6 = "dealUpload: xml is blank"
            com.tencent.mars.xlog.Log.w(r3, r6)
        L94:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gk5.r0.T6(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void U6(java.lang.String xml, long j17, java.lang.String str, boolean z17, com.tencent.wework.api.IWWAPI.WWAppType wwAppType) {
        kotlin.jvm.internal.o.g(xml, "xml");
        kotlin.jvm.internal.o.g(wwAppType, "wwAppType");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealUploadAndForward() called with: xml = ");
        sb6.append(!r26.n0.N(xml));
        sb6.append(", originMsgId = ");
        sb6.append(j17);
        sb6.append(", isFromFav = ");
        sb6.append(z17);
        sb6.append(", wwAppType = ");
        sb6.append(wwAppType);
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardNoteToWeWorkUIC", sb6.toString());
        if (!(!r26.n0.N(xml))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForwardNoteToWeWorkUIC", "dealUploadAndForward: xml is blank");
        } else {
            v65.i.b(this.f272714d, null, new gk5.l0(xml, z17, j17, str, this, wwAppType, null), 1, null);
        }
    }

    public final void V6() {
        ym5.a1.f(new gk5.q0(this));
    }
}
