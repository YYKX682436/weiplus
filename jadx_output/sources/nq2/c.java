package nq2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f338979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Intent intent) {
        super(1);
        this.f338979d = intent;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String invokeSource = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        com.tencent.mars.xlog.Log.i("NearbyPreloadManager", "startPreloadSquareTabs invoke:".concat(invokeSource));
        pq2.h hVar = nq2.d.f338981b;
        if (hVar != null) {
            hVar.i();
        }
        pq2.h hVar2 = new pq2.h();
        nq2.d.f338981b = hVar2;
        android.content.Intent intent = this.f338979d;
        kotlin.jvm.internal.o.g(intent, "intent");
        hVar2.f357596o = new r45.qt2();
        if (c92.g.f39738a.b()) {
            r45.qt2 qt2Var = hVar2.f357596o;
            if (qt2Var == null) {
                kotlin.jvm.internal.o.o("contextObj");
                throw null;
            }
            qt2Var.set(2, "8001-" + c01.id.c());
            r45.qt2 qt2Var2 = hVar2.f357596o;
            if (qt2Var2 == null) {
                kotlin.jvm.internal.o.o("contextObj");
                throw null;
            }
            qt2Var2.set(5, java.lang.Integer.valueOf(((v40.s) ((uc.n) i95.n0.c(uc.n.class))).Di(94, 0)));
        } else {
            r45.qt2 qt2Var3 = hVar2.f357596o;
            if (qt2Var3 == null) {
                kotlin.jvm.internal.o.o("contextObj");
                throw null;
            }
            wo2.n0 n0Var = wo2.n0.f448105a;
            qt2Var3.set(2, n0Var.d() + '-' + c01.id.c());
            r45.qt2 qt2Var4 = hVar2.f357596o;
            if (qt2Var4 == null) {
                kotlin.jvm.internal.o.o("contextObj");
                throw null;
            }
            qt2Var4.set(5, java.lang.Integer.valueOf(n0Var.a()));
        }
        r45.qt2 qt2Var5 = hVar2.f357596o;
        if (qt2Var5 == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nk();
        }
        qt2Var5.set(1, stringExtra);
        r45.qt2 qt2Var6 = hVar2.f357596o;
        if (qt2Var6 == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        if (!android.text.TextUtils.isEmpty(qt2Var6.getString(1))) {
            dp2.a aVar = dp2.a.f242183a;
            r45.qt2 qt2Var7 = hVar2.f357596o;
            if (qt2Var7 == null) {
                kotlin.jvm.internal.o.o("contextObj");
                throw null;
            }
            java.lang.String string = qt2Var7.getString(1);
            hVar2.f357599r = (java.lang.String) r26.n0.f0(string == null ? "" : string, new java.lang.String[]{"-"}, false, 0, 6, null).get(0);
        }
        r45.qt2 qt2Var8 = hVar2.f357596o;
        if (qt2Var8 == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        qt2Var8.set(0, Ri);
        r45.qt2 qt2Var9 = hVar2.f357596o;
        if (qt2Var9 == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        qt2Var9.set(9, "");
        r45.qt2 qt2Var10 = hVar2.f357596o;
        if (qt2Var10 == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        qt2Var10.set(11, "");
        r45.qt2 qt2Var11 = hVar2.f357596o;
        if (qt2Var11 == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        qt2Var11.set(12, "");
        hVar2.f357597p = intent.getIntExtra("key_request_scene", 0);
        pq2.h hVar3 = nq2.d.f338981b;
        if (hVar3 != null) {
            hVar3.h();
        }
        return jz5.f0.f302826a;
    }
}
