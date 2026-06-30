package wy2;

@j95.b(dependencies = {e70.q.class})
/* loaded from: classes11.dex */
public final class g extends i95.w implements o40.e {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.o4 f450639f;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f450637d = jz5.h.b(wy2.f.f450636d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f450638e = jz5.h.b(wy2.e.f450635d);

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f450640g = "FinderAudioService_showNewTipsKey";

    public boolean Ai() {
        jm4.g3 f17;
        jm4.n2 n2Var = wi().f451767b;
        qk.ia a17 = (n2Var == null || (f17 = ((jm4.p2) n2Var).f()) == null) ? null : qk.ia.f364169e.a(((jm4.h3) f17).i());
        return a17 == qk.ia.f364171g || a17 == qk.ia.f364172h;
    }

    public void Bi(android.content.Context context, byte[] bArr, java.util.Map map) {
        kotlin.jvm.internal.o.g(context, "context");
        x40.h wi6 = wi();
        if (map == null) {
            map = new java.util.HashMap();
        }
        wi6.getClass();
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new x40.e(wi6, map, context, bArr, null), 3, null);
    }

    public void Di(android.content.Context context, byte[] bArr, java.util.Map map, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        x40.h wi6 = wi();
        if (map == null) {
            map = new java.util.HashMap();
        }
        wi6.getClass();
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new x40.d(wi6, map, context, z17, bArr, null), 3, null);
    }

    public void Ni(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        x40.h wi6 = wi();
        wi6.getClass();
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new x40.f(wi6, context, null), 3, null);
    }

    public void Ri() {
        x40.h wi6 = wi();
        wi6.getClass();
        com.tencent.mars.xlog.Log.i("start to destroyEngine", "MicroMsg.FinderAudioRoute");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new x40.g(wi6, null), 3, null);
    }

    public final x40.h wi() {
        return (x40.h) ((jz5.n) this.f450637d).getValue();
    }
}
