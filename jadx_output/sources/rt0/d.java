package rt0;

/* loaded from: classes9.dex */
public final class d extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f399375b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f399376c;

    @Override // ot0.h
    public ot0.h a() {
        rt0.d dVar = new rt0.d();
        dVar.f399375b = this.f399375b;
        dVar.f399376c = this.f399376c;
        return dVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (this.f399375b == null || sb6 == null) {
            return;
        }
        sb6.append("<textannouncement>" + this.f399375b + "</textannouncement>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f399375b = map != null ? (java.lang.String) map.get(".msg.appmsg.textannouncement") : null;
        this.f399376c = map != null ? (java.lang.String) map.get(".msg.appmsg.announcement") : null;
        if (map != null) {
        }
    }
}
