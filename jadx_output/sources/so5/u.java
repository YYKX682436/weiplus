package so5;

/* loaded from: classes14.dex */
public final class u implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f410909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f410910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so5.y f410911f;

    public u(int i17, boolean z17, so5.y yVar) {
        this.f410909d = i17;
        this.f410910e = z17;
        this.f410911f = yVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        uo5.j jVar = (uo5.j) obj;
        boolean z17 = jVar instanceof uo5.e;
        so5.y yVar = this.f410911f;
        int i17 = this.f410909d;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIP.EncoderManager", "on codec " + i17 + " state error " + ((uo5.e) jVar).f429717a);
            if (this.f410910e) {
                yVar.f410931r[i17].f410887b++;
            } else {
                yVar.f410931r[i17].f410886a++;
            }
            yVar.f410931r[i17].f410888c = false;
            yVar.i(i17);
            yVar.f410931r[i17].f410890e = true;
        } else if (kotlin.jvm.internal.o.b(jVar, uo5.i.f429721a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.EncoderManager", "configHWEncoder: on codec " + i17 + " state working");
            yVar.f410931r[i17].f410888c = true;
        } else if (jVar instanceof uo5.h) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ILinkVoIP.EncoderManager", "on codec " + i17 + " state reset");
            so5.n nVar = yVar.f410931r[i17];
            nVar.f410888c = false;
            nVar.f410889d = true;
        } else {
            yVar.f410931r[i17].f410888c = false;
        }
        return jz5.f0.f302826a;
    }
}
