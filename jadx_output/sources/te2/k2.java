package te2;

/* loaded from: classes14.dex */
public final class k2 implements x91.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f418161a;

    public k2(te2.l2 l2Var) {
        this.f418161a = l2Var;
    }

    @Override // x91.i
    public void a(x91.h hVar) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        te2.l2 l2Var = this.f418161a;
        java.lang.String str = l2Var.f418192e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStop device[");
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] liveData.business(LiveCastScreenSlice::class.java).selectedDevice[");
        gk2.e eVar = l2Var.f418191d;
        x91.h hVar2 = ((je2.i) eVar.a(je2.i.class)).f299235f;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = ((je2.i) eVar.a(je2.i.class)).f299235f;
        sb6.append((hVar3 == null || (cVar = hVar3.f452647a) == null) ? null : cVar.f452641i);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (kotlin.jvm.internal.o.b(hVar, ((je2.i) eVar.a(je2.i.class)).f299235f)) {
            x91.h hVar4 = ((je2.i) eVar.a(je2.i.class)).f299235f;
            if (hVar4 != null) {
                hVar4.f452651e.f452663a = x91.j.Stopped;
            }
            ((mm2.c1) eVar.a(mm2.c1.class)).C4 = null;
            te2.c2 c2Var = l2Var.f418196i;
            if (c2Var != null) {
                pm0.v.X(new te2.s2((te2.a3) c2Var, ((je2.i) eVar.a(je2.i.class)).f299235f));
            }
            ((je2.i) eVar.a(je2.i.class)).f299235f = null;
        }
    }

    @Override // x91.i
    public void b(x91.h hVar) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        te2.l2 l2Var = this.f418161a;
        java.lang.String str = l2Var.f418192e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause device[");
        java.lang.String str2 = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] liveData.business(LiveCastScreenSlice::class.java).selectedDevice[");
        x91.h hVar2 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str2 = cVar.f452641i;
        }
        sb6.append(str2);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlin.jvm.internal.o.b(hVar, ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f);
    }

    @Override // x91.i
    public void c(x91.h hVar, int i17) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        te2.l2 l2Var = this.f418161a;
        java.lang.String str = l2Var.f418192e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgress progress:");
        sb6.append(i17);
        sb6.append(" device[");
        java.lang.String str2 = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] liveData.business(LiveCastScreenSlice::class.java).selectedDevice[");
        x91.h hVar2 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str2 = cVar.f452641i;
        }
        sb6.append(str2);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlin.jvm.internal.o.b(hVar, ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f);
    }

    @Override // x91.i
    public void d(x91.h hVar, int i17) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        te2.l2 l2Var = this.f418161a;
        java.lang.String str = l2Var.f418192e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVolume vol:");
        sb6.append(i17);
        sb6.append(" device[");
        java.lang.String str2 = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] liveData.business(LiveCastScreenSlice::class.java).selectedDevice[");
        x91.h hVar2 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str2 = cVar.f452641i;
        }
        sb6.append(str2);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlin.jvm.internal.o.b(hVar, ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f);
    }

    @Override // x91.i
    public void e(x91.h hVar) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        te2.l2 l2Var = this.f418161a;
        java.lang.String str = l2Var.f418192e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlay device[");
        java.lang.String str2 = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] liveData.business(LiveCastScreenSlice::class.java).selectedDevice[");
        x91.h hVar2 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str2 = cVar.f452641i;
        }
        sb6.append(str2);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlin.jvm.internal.o.b(hVar, ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f);
    }

    @Override // x91.i
    public void f(x91.h hVar, boolean z17) {
        x91.c cVar;
        x91.c cVar2;
        x91.c cVar3;
        x91.c cVar4;
        te2.l2 l2Var = this.f418161a;
        java.lang.String str = l2Var.f418192e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMute mute:");
        sb6.append(z17);
        sb6.append(" device[");
        java.lang.String str2 = null;
        sb6.append((hVar == null || (cVar4 = hVar.f452647a) == null) ? null : cVar4.f452639g);
        sb6.append(',');
        sb6.append((hVar == null || (cVar3 = hVar.f452647a) == null) ? null : cVar3.f452641i);
        sb6.append("] liveData.business(LiveCastScreenSlice::class.java).selectedDevice[");
        x91.h hVar2 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        sb6.append((hVar2 == null || (cVar2 = hVar2.f452647a) == null) ? null : cVar2.f452639g);
        sb6.append(',');
        x91.h hVar3 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar3 != null && (cVar = hVar3.f452647a) != null) {
            str2 = cVar.f452641i;
        }
        sb6.append(str2);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlin.jvm.internal.o.b(hVar, ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f);
    }
}
