package kt1;

@j95.b
/* loaded from: classes4.dex */
public final class z extends i95.w implements ct1.w {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f311967d = jz5.h.b(kt1.y.f311966d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f311968e = jz5.h.b(kt1.v.f311959d);

    public void Ai(byte[] bArr, int i17, int i18) {
        kt1.h0 h0Var = new kt1.h0(bArr, i17, i18);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.ReliableSync.Service", "addSyncTask() called with: task = " + h0Var + " session:" + currentTimeMillis);
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f311968e).getValue(), null, new kt1.w(this, h0Var, currentTimeMillis, null), 1, null);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.ReliableSync.Service", "@" + hashCode() + " onCreate() called isMainProcess:" + com.tencent.mm.sdk.platformtools.x2.n());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0116 A[LOOP:0: B:7:0x0110->B:9:0x0116, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wi(int r7) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kt1.z.wi(int):void");
    }
}
