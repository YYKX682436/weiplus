package vo4;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f438672a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.m1 f438673b;

    /* renamed from: c, reason: collision with root package name */
    public p05.l4 f438674c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f438675d = true;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f438676e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final vo4.s f438677f = new vo4.s();

    /* renamed from: g, reason: collision with root package name */
    public long f438678g = 33;

    /* renamed from: h, reason: collision with root package name */
    public long f438679h = 16;

    /* renamed from: i, reason: collision with root package name */
    public long f438680i = 33;

    /* renamed from: j, reason: collision with root package name */
    public int f438681j;

    /* renamed from: k, reason: collision with root package name */
    public int f438682k;

    public r(boolean z17) {
        this.f438672a = z17;
    }

    public final void a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i17, long j17) {
        boolean z17;
        java.lang.String str;
        boolean z18;
        java.lang.Object obj;
        android.opengl.GLES20.glViewport(0, 0, this.f438681j, this.f438682k);
        rs0.i.f399296a.g();
        java.util.ArrayList<vo4.b> arrayList3 = this.f438676e;
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ((vo4.b) it.next()).f438614m = false;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.vlog.model.p0 p0Var = (com.tencent.mm.plugin.vlog.model.p0) it6.next();
            java.util.Iterator it7 = arrayList3.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it7.next();
                vo4.b bVar = (vo4.b) obj;
                if (kotlin.jvm.internal.o.b(bVar.f438605d.f175710c, p0Var.f175710c) && bVar.f438605d.f175708a >= p0Var.f175708a) {
                    break;
                }
            }
            vo4.b bVar2 = (vo4.b) obj;
            if (bVar2 != null) {
                if (!bVar2.f438616o) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", "drawImpl prepare material player: " + j17 + ", " + p0Var.f175708a + ", " + p0Var.f175710c);
                    bVar2.c();
                }
                boolean z19 = bVar2.f438615n;
                com.tencent.mm.plugin.vlog.model.p0 p0Var2 = bVar2.f438605d;
                if (!z19) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", "drawImpl play material player: " + j17 + ", " + p0Var.f175708a + ", " + p0Var.f175710c);
                    bVar2.d(j17 - p0Var2.f175708a);
                }
                bVar2.f438614m = true;
                bVar2.b(j17 - p0Var2.f175708a, true);
            }
            this.f438680i = p0Var instanceof com.tencent.mm.plugin.vlog.model.p1 ? this.f438678g : this.f438679h;
        }
        p05.l4 l4Var = this.f438674c;
        if (l4Var != null) {
            z17 = true;
            str = "MicroMsg.VLogScriptReader";
            rh0.d0.c(l4Var, 0, i17, j17, 0, false, false, false, 120, null);
        } else {
            z17 = true;
            str = "MicroMsg.VLogScriptReader";
        }
        for (vo4.b bVar3 : arrayList3) {
            if (!bVar3.f438614m) {
                com.tencent.mm.plugin.vlog.model.p0 p0Var3 = bVar3.f438605d;
                if (arrayList2 != null) {
                    if (!arrayList2.isEmpty()) {
                        java.util.Iterator it8 = arrayList2.iterator();
                        while (it8.hasNext()) {
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.vlog.model.p0) it8.next()).f175710c, p0Var3.f175710c)) {
                                z18 = z17;
                                break;
                            }
                        }
                    }
                    z18 = false;
                    if (!z18) {
                    }
                }
                if (j17 - p0Var3.f175709b > 0 && bVar3.f438615n) {
                    bVar3.f();
                    com.tencent.mars.xlog.Log.i(str, "stop player " + p0Var3.f175710c + ", pts:" + j17 + ", endTime:" + p0Var3.f175709b);
                }
            }
        }
    }

    public final void b(int i17, int i18) {
        this.f438681j = i17;
        this.f438682k = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", "set target size:[" + this.f438681j + ", " + this.f438682k + ']');
        p05.l4 l4Var = new p05.l4(0, false, false, false, false, false, null, null, false, 511, null);
        this.f438674c = l4Var;
        l4Var.J(this.f438681j, this.f438682k);
        vo4.s sVar = this.f438677f;
        sVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptTexCache", "init cache, cacheTexsNum:2");
        for (int i19 = 0; i19 < 2; i19++) {
            sVar.f438683a[i19] = is0.b.b(false, 11L);
            sVar.f438684b[i19] = is0.b.b(true, 11L);
        }
    }

    public final void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetAllPlayers size:");
        java.util.ArrayList<vo4.b> arrayList = this.f438676e;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", sb6.toString());
        for (vo4.b bVar : arrayList) {
            bVar.f();
            if (z17) {
                bVar.e();
            }
        }
    }
}
