package wq2;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f448529a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f448530b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f448531c;

    /* renamed from: d, reason: collision with root package name */
    public r45.yz2 f448532d;

    /* renamed from: e, reason: collision with root package name */
    public final int f448533e;

    /* renamed from: f, reason: collision with root package name */
    public final dk2.of f448534f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f448535g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f448536h;

    /* renamed from: i, reason: collision with root package name */
    public final xq2.b f448537i;

    /* renamed from: j, reason: collision with root package name */
    public final wq2.e f448538j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f448539k;

    /* renamed from: l, reason: collision with root package name */
    public final gr2.t0 f448540l;

    public h(android.app.Activity context) {
        int i17;
        r45.vz2 vz2Var;
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        this.f448529a = context;
        this.f448530b = kotlinx.coroutines.z0.b();
        this.f448531c = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
        java.lang.String str2 = "";
        this.f448535g = "";
        new java.util.ArrayList();
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(xq2.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f448537i = (xq2.b) a17;
        this.f448538j = new wq2.e(this);
        this.f448539k = jz5.h.b(new wq2.g(this));
        this.f448540l = new gr2.t0((com.tencent.mm.ui.MMActivity) context, 0.0f, 2, null);
        dk2.of a18 = dk2.of.f233859j.a(context.getIntent());
        this.f448534f = a18;
        if (a18 != null && (str = a18.f233861a) != null) {
            str2 = str;
        }
        this.f448535g = str2;
        if (a18 != null && a18.f233868h == 2) {
            i17 = 329;
        } else {
            i17 = (a18 == null || (vz2Var = a18.f233863c) == null || vz2Var.f388698p != 10) ? false : true ? 260 : 261;
        }
        this.f448533e = i17;
        com.tencent.mars.xlog.Log.i("Finder.LiveSpecialFragmentViewCallback", "#init themeSpecialBundle: " + a18);
    }

    public final void a(r45.yz2 yz2Var, boolean z17) {
        r45.ha2 ha2Var;
        zq2.c cVar;
        java.util.LinkedList<r45.fa2> linkedList;
        r45.uz2 uz2Var;
        java.util.LinkedList linkedList2;
        java.lang.Object obj;
        java.util.LinkedList<r45.ea2> linkedList3;
        r45.id2 id2Var;
        r45.zz2 zz2Var;
        r45.vz2 vz2Var;
        com.tencent.mars.xlog.Log.i("Finder.LiveSpecialFragmentViewCallback", "#transResponseToListData cleanCurrent=" + z17);
        r45.yz2 yz2Var2 = this.f448532d;
        boolean z18 = yz2Var2 != null ? yz2Var2.f391524n : true;
        com.tencent.mars.xlog.Log.i("Finder.LiveSpecialFragmentViewCallback", "#transResponseToListData skipAsyncLoadLiveInfo=" + z18);
        if (yz2Var != null && (vz2Var = yz2Var.f391531u) != null) {
            pm0.v.X(new wq2.d(this, vz2Var));
        }
        android.app.Activity context = this.f448529a;
        if (yz2Var != null && (zz2Var = yz2Var.f391532v) != null) {
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            fr2.x xVar = (fr2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(fr2.x.class);
            if (xVar != null) {
                xVar.Q6(zz2Var);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (yz2Var != null && (linkedList2 = yz2Var.f391517d) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r45.fa2) obj).f374126e == 9) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.fa2 fa2Var = (r45.fa2) obj;
            if (fa2Var != null && (linkedList3 = fa2Var.f374129h) != null) {
                for (r45.ea2 ea2Var : linkedList3) {
                    if (ea2Var.getInteger(1) == 12 && (id2Var = (r45.id2) ea2Var.getCustom(13)) != null) {
                        arrayList.add(new zq2.e(id2Var, fa2Var, false, 4, null));
                    }
                }
            }
        }
        this.f448540l.a(context, arrayList);
        if (yz2Var == null || (linkedList = yz2Var.f391517d) == null) {
            ha2Var = null;
            cVar = null;
        } else {
            cVar = null;
            for (r45.fa2 fa2Var2 : linkedList) {
                com.tencent.mars.xlog.Log.i("Finder.LiveSpecialFragmentViewCallback", "#transResponseToListData container.type=" + fa2Var2.f374126e + " container.container_id=" + fa2Var2.f374125d + " container.card_list.size=" + fa2Var2.f374129h.size());
                int i17 = fa2Var2.f374126e;
                if ((i17 == 4 || i17 == 10 || i17 == 11) && (uz2Var = fa2Var2.f374135q) != null) {
                    wq2.f fVar = new wq2.f(fa2Var2, uz2Var, this, yz2Var, z18);
                    cVar = new zq2.c(this.f448535g, fa2Var2);
                    fVar.invoke(cVar);
                    cVar.f475030f = arrayList;
                }
                com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = this.f448536h;
                if (mMProcessBar == null) {
                    kotlin.jvm.internal.o.o("loadingView");
                    throw null;
                }
                mMProcessBar.setVisibility(8);
            }
            ha2Var = null;
        }
        if (cVar != null) {
            ((gr2.p0) ((jz5.n) this.f448539k).getValue()).a(context, cVar);
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sp2.x3 x3Var = (sp2.x3) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(sp2.x3.class);
            x3Var.Z6(yz2Var != null ? yz2Var.f391530t : ha2Var);
            x3Var.X6();
        }
        pf5.z zVar3 = pf5.z.f353948a;
        boolean z19 = context instanceof androidx.appcompat.app.AppCompatActivity;
        if (!z19) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        fr2.p pVar = (fr2.p) zVar3.a(appCompatActivity).e(fr2.p.class);
        if (pVar != null) {
            pVar.W6();
        }
        if (!z19) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        fr2.p pVar2 = (fr2.p) zVar3.a(appCompatActivity).e(fr2.p.class);
        if (pVar2 != null) {
            pVar2.V6(yz2Var != null ? yz2Var.f391534x : false);
        }
    }
}
