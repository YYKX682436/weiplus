package p32;

/* loaded from: classes4.dex */
public class n extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f351505f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f351506g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f351507h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.ref.WeakReference f351508i;

    public n(h32.b bVar) {
        this.f351508i = new java.lang.ref.WeakReference(bVar);
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f I() {
        return new r45.as3();
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f J() {
        return new r45.bs3();
    }

    @Override // h32.a
    public /* bridge */ /* synthetic */ void K(com.tencent.mm.protobuf.f fVar) {
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1758;
    }

    @Override // h32.a
    public java.lang.String getUri() {
        return "/cgi-bin/mmoc-bin/hardware/getwerunfollowerlist";
    }

    @Override // h32.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        h32.b bVar;
        if (i18 == 0 && i19 == 0) {
            r45.bs3 bs3Var = (r45.bs3) H();
            this.f351507h = new java.util.ArrayList();
            java.util.Iterator it = bs3Var.f371022d.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(str2)) {
                    this.f351507h.add(str2);
                }
            }
            this.f351505f = new java.util.ArrayList();
            this.f351506g = new java.util.ArrayList();
            java.util.LinkedList linkedList = bs3Var.f371023e;
            if (linkedList != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.j43 j43Var = (r45.j43) it6.next();
                    if (j43Var.f377576e) {
                        this.f351506g.add(j43Var.f377575d);
                    }
                    if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(j43Var.f377575d)) {
                        this.f351505f.add(j43Var.f377575d);
                    }
                }
            }
            this.f351506g.size();
            this.f351506g.toString();
            this.f351505f.size();
        }
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        java.lang.ref.WeakReference weakReference = this.f351508i;
        if (weakReference == null || (bVar = (h32.b) weakReference.get()) == null) {
            return;
        }
        bVar.a(i18, i19, str, this);
    }
}
