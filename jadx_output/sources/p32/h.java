package p32;

/* loaded from: classes12.dex */
public class h extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f351466f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f351467g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f351468h;

    public h(java.util.List list, h32.b bVar) {
        this.f351466f = list;
        this.f351468h = new java.lang.ref.WeakReference(bVar);
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f I() {
        return new r45.g4();
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f J() {
        return new r45.h4();
    }

    @Override // h32.a
    public void K(com.tencent.mm.protobuf.f fVar) {
        r45.g4 g4Var = (r45.g4) fVar;
        java.util.Iterator it = this.f351466f.iterator();
        while (it.hasNext()) {
            g4Var.f374866d.add((java.lang.String) it.next());
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1777;
    }

    @Override // h32.a
    public java.lang.String getUri() {
        return "/cgi-bin/mmoc-bin/hardware/addfollow";
    }

    @Override // h32.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        h32.b bVar;
        if (i18 == 0 && i19 == 0) {
            r45.h4 h4Var = (r45.h4) H();
            this.f351467g = new java.util.ArrayList();
            java.util.LinkedList linkedList = h4Var.f375815d;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.e43 e43Var = (r45.e43) it.next();
                    int i27 = e43Var.f373004d;
                    this.f351467g.add(e43Var);
                }
                this.f351467g.toString();
                h4Var.f375815d.size();
            }
            s32.a Ri = com.tencent.mm.plugin.exdevice.model.l3.Ri();
            java.util.ArrayList arrayList = this.f351467g;
            Ri.getClass();
            if (arrayList != null) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    r45.e43 e43Var2 = (r45.e43) it6.next();
                    r32.c cVar = new r32.c();
                    cVar.field_rankID = "hardcode_rank_id";
                    cVar.field_step = e43Var2.f373006f;
                    cVar.field_username = e43Var2.f373005e;
                    cVar.field_appusername = "hardcode_app_name";
                    Ri.L0(cVar);
                }
            }
        }
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        java.lang.ref.WeakReference weakReference = this.f351468h;
        if (weakReference == null || (bVar = (h32.b) weakReference.get()) == null) {
            return;
        }
        bVar.a(i18, i19, str, this);
    }
}
