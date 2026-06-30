package xc2;

/* loaded from: classes2.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f453144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(java.lang.String str, java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453143e = str;
        this.f453144f = weakReference;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc2.g2(this.f453143e, this.f453144f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc2.g2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453142d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            il4.l lVar = il4.l.f292142a;
            this.f453142d = 1;
            c17 = lVar.c(this.f453143e, this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = obj;
        }
        bw5.o50 o50Var = (bw5.o50) c17;
        android.app.Activity activity = (android.app.Activity) this.f453144f.get();
        boolean z17 = activity != null && activity.isFinishing();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            return f0Var;
        }
        pm0.v.X(xc2.f2.f453128d);
        if (o50Var != null) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            qk.f9.c(aj6, context, o50Var, bw5.ar0.TingScene_FinderChat, new il4.e(null, 0, 1613, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null), null, 16, null);
        } else {
            com.tencent.mars.xlog.Log.w("Finder.JumperUtils", "jumpToTingCategory getCategoryItem failed");
        }
        return f0Var;
    }
}
