package p32;

/* loaded from: classes12.dex */
public class j extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f351471f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f351472g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f351473h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f351474i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f351475m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f351476n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f351477o;

    /* renamed from: p, reason: collision with root package name */
    public r45.hh7 f351478p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f351479q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f351480r;

    /* renamed from: s, reason: collision with root package name */
    public int f351481s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f351482t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.ref.WeakReference f351483u;

    public j(android.content.Context context, java.lang.String str, java.lang.String str2, h32.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetProfileDetail", "NetSceneGetProfileDetail, username: %s, appName: %s", str, str2);
        this.f351471f = context;
        this.f351472g = str;
        this.f351473h = str2;
        this.f351483u = new java.lang.ref.WeakReference(bVar);
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f I() {
        return new r45.qq3();
    }

    @Override // h32.a
    public com.tencent.mm.protobuf.f J() {
        return new r45.rq3();
    }

    @Override // h32.a
    public void K(com.tencent.mm.protobuf.f fVar) {
        r45.qq3 qq3Var = (r45.qq3) fVar;
        qq3Var.f384203e = this.f351473h;
        qq3Var.f384202d = this.f351472g;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1043;
    }

    @Override // h32.a
    public java.lang.String getUri() {
        return "/cgi-bin/mmbiz-bin/rank/getuserrankdetail";
    }

    @Override // h32.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        h32.b bVar;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        boolean z17;
        java.util.LinkedList<r45.ed6> linkedList3;
        if (i18 == 0 && i19 == 0) {
            r45.rq3 rq3Var = (r45.rq3) H();
            android.content.Context context = this.f351471f;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            z32.s sVar = (z32.s) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z32.s.class);
            sVar.f469937f = rq3Var;
            java.util.LinkedList linkedList4 = sVar.f469938g;
            boolean z18 = true;
            if (rq3Var == null || (linkedList3 = rq3Var.f385114w) == null) {
                linkedList = null;
                linkedList2 = null;
                z17 = false;
            } else {
                linkedList = null;
                linkedList2 = null;
                java.lang.String str2 = null;
                java.lang.String str3 = null;
                z17 = false;
                for (r45.ed6 ed6Var : linkedList3) {
                    int i27 = ed6Var.f373335o;
                    if (i27 == 0) {
                        if (str2 == null || !kotlin.jvm.internal.o.b(str2, ed6Var.f373327d)) {
                            if ((linkedList == null || (linkedList.isEmpty() ^ z18) != z18) ? false : z18) {
                                if (linkedList != null) {
                                    linkedList4.add(linkedList);
                                }
                                linkedList = new java.util.LinkedList();
                            }
                            if ((linkedList2 == null || (linkedList2.isEmpty() ^ z18) != z18) ? false : z18) {
                                kotlin.jvm.internal.o.d(linkedList2);
                                linkedList4.add(linkedList2);
                            }
                            java.util.LinkedList linkedList5 = new java.util.LinkedList();
                            str2 = ed6Var.f373327d;
                            linkedList2 = linkedList5;
                        }
                        if (linkedList2 != null) {
                            linkedList2.add(ed6Var);
                        }
                        if (kotlin.jvm.internal.o.b(ed6Var.f373327d, "21f9d636b41b25be")) {
                            z17 = z18;
                        }
                    } else if (i27 == z18) {
                        if (str3 == null || !kotlin.jvm.internal.o.b(str3, ed6Var.f373328e)) {
                            if ((linkedList2 == null || (linkedList2.isEmpty() ^ z18) != z18) ? false : z18) {
                                if (linkedList2 != null) {
                                    linkedList4.add(linkedList2);
                                }
                                linkedList2 = new java.util.LinkedList();
                            }
                            if ((linkedList == null || (linkedList.isEmpty() ^ z18) != z18) ? false : z18) {
                                kotlin.jvm.internal.o.d(linkedList);
                                linkedList4.add(linkedList);
                            }
                            java.util.LinkedList linkedList6 = new java.util.LinkedList();
                            str3 = ed6Var.f373328e;
                            linkedList = linkedList6;
                        }
                        if (linkedList != null) {
                            linkedList.add(ed6Var);
                        }
                    } else {
                        if (i27 == 3) {
                            sVar.f469939h = ed6Var;
                        }
                        z18 = true;
                    }
                }
            }
            if (linkedList != null && (linkedList.isEmpty() ^ true)) {
                kotlin.jvm.internal.o.d(linkedList);
                linkedList4.add(linkedList);
            }
            if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
                kotlin.jvm.internal.o.d(linkedList2);
                linkedList4.add(linkedList2);
            }
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            if (!z17) {
                java.util.LinkedList linkedList8 = rq3Var != null ? rq3Var.A : null;
                if (!(linkedList8 == null || linkedList8.isEmpty())) {
                    r45.ed6 ed6Var2 = new r45.ed6();
                    ed6Var2.f373327d = "21f9d636b41b25be";
                    ed6Var2.f373335o = 0;
                    ed6Var2.f373330g = null;
                    linkedList7.add(ed6Var2);
                    linkedList4.add(linkedList7);
                }
            }
            this.f351475m = rq3Var.f385098d;
            this.f351476n = rq3Var.f385099e;
            this.f351478p = rq3Var.f385100f;
            this.f351477o = rq3Var.f385106o;
            java.util.LinkedList linkedList9 = rq3Var.f385107p;
            this.f351480r = rq3Var.f385109r;
            java.util.LinkedList linkedList10 = rq3Var.f385110s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f351479q = arrayList;
            this.f351481s = rq3Var.f385112u;
            this.f351482t = rq3Var.f385111t;
            this.f351474i = rq3Var.f385113v;
            java.util.LinkedList linkedList11 = rq3Var.f385104m;
            if (linkedList11 != null) {
                arrayList.addAll(linkedList11);
            }
            java.util.LinkedList linkedList12 = new java.util.LinkedList();
            if (linkedList9 != null) {
                linkedList12.addAll(linkedList9);
            }
            java.lang.String str4 = this.f351472g;
            if (str4 != null && !str4.equalsIgnoreCase(c01.z1.r())) {
                if (this.f351480r) {
                    s32.a Ri = com.tencent.mm.plugin.exdevice.model.l3.Ri();
                    Ri.getClass();
                    if (Ri.D0(new q32.b("hardcode_rank_id", "hardcode_app_name", str4)) == null) {
                        r32.c cVar = new r32.c();
                        cVar.field_rankID = "hardcode_rank_id";
                        cVar.field_appusername = "hardcode_app_name";
                        cVar.field_username = str4;
                        cVar.field_step = 0;
                        Ri.insert(cVar);
                    }
                } else {
                    com.tencent.mm.plugin.exdevice.model.l3.Ri().z0(str4);
                }
            }
            java.util.LinkedList linkedList13 = rq3Var.f385108q;
            if (linkedList13 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = linkedList13.iterator();
                while (it.hasNext()) {
                    r45.e43 e43Var = (r45.e43) it.next();
                    if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(e43Var.f373005e)) {
                        r32.c cVar2 = new r32.c();
                        cVar2.field_username = e43Var.f373005e;
                        cVar2.field_step = e43Var.f373006f;
                        arrayList2.add(cVar2);
                    } else {
                        gm0.j1.n().f273288b.g(new p32.i(e43Var.f373005e, null));
                    }
                }
                arrayList2.size();
                arrayList2.toString();
                if (c01.z1.r().equalsIgnoreCase(str4)) {
                    com.tencent.mm.plugin.exdevice.model.l3.Ri().P0(arrayList2);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (linkedList10 != null) {
                arrayList3.addAll(linkedList10);
            }
            this.f351480r = rq3Var.f385109r;
            r32.a aVar = new r32.a();
            aVar.field_championMotto = this.f351476n;
            aVar.field_championUrl = this.f351475m;
            aVar.field_username = str4;
            com.tencent.mm.plugin.exdevice.model.l3.wi().z0(aVar, true);
        }
        java.lang.ref.WeakReference weakReference = this.f351483u;
        if (weakReference != null && (bVar = (h32.b) weakReference.get()) != null) {
            bVar.a(i18, i19, str, this);
        }
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
    }
}
