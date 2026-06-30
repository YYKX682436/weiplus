package jr0;

/* loaded from: classes12.dex */
public class d implements jj.b {

    /* renamed from: b, reason: collision with root package name */
    public static jr0.d f301324b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f301325c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Random f301326a = new java.util.Random();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (com.tencent.mm.sdk.platformtools.o4.L().i("clicfg_report_dropframe", false) != false) goto L6;
     */
    static {
        /*
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r0 = o45.wf.f343033k
            if (r0 != 0) goto L13
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.L()
            java.lang.String r1 = "clicfg_report_dropframe"
            r2 = 0
            boolean r0 = r0.i(r1, r2)
            if (r0 == 0) goto L14
        L13:
            r2 = 1
        L14:
            jr0.d.f301325c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jr0.d.<clinit>():void");
    }

    @Override // jj.c
    public void a(java.lang.String str, android.view.FrameMetrics frameMetrics, float f17, float f18) {
        if (this.f301326a.nextInt(4000) == 0) {
            int i17 = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
            jx3.f fVar = jx3.f.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Integer.valueOf(java.lang.Math.round(f17));
            objArr[1] = str;
            objArr[2] = 110;
            objArr[3] = java.lang.Integer.valueOf(i17);
            objArr[4] = java.lang.Integer.valueOf((int) f18);
            int i18 = kj.m.f308241w;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{unknown_delay_duration=");
            sb6.append(frameMetrics.getMetric(0));
            sb6.append("; input_handling_duration=");
            sb6.append(frameMetrics.getMetric(1));
            sb6.append("; animation_duration=");
            sb6.append(frameMetrics.getMetric(2));
            sb6.append("; layout_measure_duration=");
            sb6.append(frameMetrics.getMetric(3));
            sb6.append("; draw_duration=");
            sb6.append(frameMetrics.getMetric(4));
            sb6.append("; sync_duration=");
            sb6.append(frameMetrics.getMetric(5));
            sb6.append("; command_issue_duration=");
            sb6.append(frameMetrics.getMetric(6));
            sb6.append("; swap_buffers_duration=");
            sb6.append(frameMetrics.getMetric(7));
            sb6.append("; total_duration=");
            sb6.append(frameMetrics.getMetric(8));
            sb6.append("; first_draw_frame=");
            sb6.append(frameMetrics.getMetric(9));
            if (kj.m.f308241w >= 31) {
                sb6.append("; gpu_duration=");
                sb6.append(frameMetrics.getMetric(12));
            }
            sb6.append("}");
            objArr[5] = sb6.toString();
            fVar.d(com.google.android.gms.auth.api.accounttransfer.AccountTransferStatusCodes.INVALID_REQUEST, objArr);
        }
    }
}
