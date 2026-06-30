package m;

/* loaded from: classes16.dex */
public final class d extends qz5.l implements yz5.p {
    public int L;
    public final /* synthetic */ we0.u0 M;
    public final /* synthetic */ java.util.Map N;
    public final /* synthetic */ android.app.Activity P;
    public final /* synthetic */ android.os.Bundle Q;
    public final /* synthetic */ android.os.ResultReceiver R;
    public final /* synthetic */ int S;
    public final /* synthetic */ java.lang.String T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(we0.u0 u0Var, java.util.Map map, android.app.Activity activity, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.M = u0Var;
        this.N = map;
        this.P = activity;
        this.Q = bundle;
        this.R = resultReceiver;
        this.S = i17;
        this.T = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m.d(this.M, this.N, this.P, this.Q, this.R, this.S, this.T, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:2)|(1:(1:(5:6|7|8|9|(4:11|12|(2:14|15)|16)(5:26|(4:31|(1:33)(1:35)|34|25)|36|(1:38)|39))(2:42|43))(2:44|45))(3:52|53|(1:55))|46|47|48|49|(1:51)|8|9|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|(1:(1:(5:6|7|8|9|(4:11|12|(2:14|15)|16)(5:26|(4:31|(1:33)(1:35)|34|25)|36|(1:38)|39))(2:42|43))(2:44|45))(3:52|53|(1:55))|46|47|48|49|(1:51)|8|9|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        r3 = 0;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0102, code lost:
    
        com.tencent.mars.xlog.Log.e(r15.f445169d, "openFlutterPublishPageViaPrepareIntent: launch failed, err=" + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0119, code lost:
    
        if (r2 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x011b, code lost:
    
        r2.send(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        r2 = r2;
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0076 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #2 {all -> 0x0087, blocks: (B:8:0x0072, B:11:0x0076, B:49:0x006b), top: B:48:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:15:0x0083, B:26:0x008d, B:28:0x0096, B:31:0x009d, B:34:0x00dd, B:36:0x00f4, B:38:0x00fd), top: B:9:0x0074 }] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.tencent.mm.flutter.ui.FlutterPageStyle] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
