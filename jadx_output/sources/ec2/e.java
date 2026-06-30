package ec2;

/* loaded from: classes2.dex */
public final class e extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f250958g = "FinderPlayProgressObserver";

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return (event instanceof ec2.f) && ((ec2.f) event).f250959d == 3;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("offset = ");
            ec2.f fVar = (ec2.f) ev6;
            sb6.append(fVar.f250963h);
            sb6.append(",total = ");
            sb6.append(fVar.f250964i);
            com.tencent.mars.xlog.Log.i(this.f250958g, sb6.toString());
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128050z2).getValue()).r()).intValue() != 1 || fVar.f250963h < fVar.f250964i - 1) {
                return;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }
}
