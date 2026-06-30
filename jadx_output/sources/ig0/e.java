package ig0;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig0.o f291312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlinx.coroutines.y0 y0Var, ig0.o oVar) {
        super(2);
        this.f291312d = oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        c01.v8 v8Var;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        java.lang.String msgTalker = (java.lang.String) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        try {
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(msgTalker, longValue);
            if (k17 != null) {
                ig0.o oVar = this.f291312d;
                java.lang.ref.WeakReference weakReference = oVar.f291333m;
                if (weakReference != null && (v8Var = (c01.v8) weakReference.get()) != null) {
                    v8Var.a(k17);
                }
                ((ku5.t0) ku5.t0.f312615d).B(new ig0.n(oVar, k17));
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoiceMsgFeatureService", "asyncDownloadVoice notifiers msgInfo is null");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceMsgFeatureService", "asyncDownloadVoice notifiers error: " + e17);
        }
        return f0Var2;
    }
}
