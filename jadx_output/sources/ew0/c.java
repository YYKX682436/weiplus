package ew0;

/* loaded from: classes5.dex */
public final class c implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ew0.a f257008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ew0.l f257009e;

    public c(ew0.a aVar, ew0.l lVar) {
        this.f257008d = aVar;
        this.f257009e = lVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ew0.l lVar;
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment;
        sw0.e eVar = (sw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f257008d.setFontStyleState$plugin_mj_template_release(eVar);
        sw0.m mVar = eVar.f413428c;
        if (!(mVar instanceof sw0.k ? true : mVar instanceof sw0.l ? true : mVar instanceof sw0.i) || (narrationSegment = (lVar = this.f257009e).f257028w) == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
        if (zu0.i.f475676f == (dVar != null ? dVar.f413423b : null)) {
            java.lang.String str = dVar.f413422a.f48224b;
            com.tencent.maas.base.MJID mjid = narrationSegment.f48532a;
            kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
            ex0.q z76 = lVar.z7(mjid);
            if (z76 == null) {
                return;
            }
            kotlin.jvm.internal.o.d(str);
            z76.M(str);
            sw0.b bVar = lVar.f349118q;
            lVar.f349118q = bVar != null ? sw0.b.a(bVar, null, null, null, str, null, 23, null) : null;
            lVar.E7(z76, narrationSegment);
        }
    }
}
