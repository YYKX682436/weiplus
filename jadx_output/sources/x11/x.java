package x11;

/* loaded from: classes11.dex */
public final class x implements x11.a {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ju4 f451418a;

    /* renamed from: b, reason: collision with root package name */
    public int f451419b;

    public x(int i17, int i18, java.lang.String str, r45.ju4 ju4Var, int i19, int i27, kotlin.jvm.internal.i iVar) {
        ju4Var = (i27 & 8) != 0 ? null : ju4Var;
        i19 = (i27 & 16) != 0 ? 0 : i19;
        this.f451418a = ju4Var;
        this.f451419b = i19;
    }

    @Override // x11.a
    public x11.y a(x11.t initController) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        kotlin.jvm.internal.o.g(initController, "initController");
        t4.a.f("NewInitProcessData");
        com.tencent.mm.plugin.zero.a1 a1Var = new com.tencent.mm.plugin.zero.a1();
        a1Var.b("NetSceneInit");
        int i17 = ((java.lang.Boolean) ((jz5.n) initController.f451403t).getValue()).booleanValue() ? Integer.MAX_VALUE : initController.f451393g ? 40 : 10;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i19 >= i17) {
                break;
            }
            r45.ju4 ju4Var = this.f451418a;
            r4 = null;
            r4 = null;
            r45.b50 b50Var = null;
            if ((((ju4Var != null ? ju4Var.f378116i : null) == null || this.f451419b >= ju4Var.f378116i.size()) ? i18 : 1) == 0) {
                ((java.util.LinkedList) initController.f451402s).poll();
                java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(x51.j1.d(ju4Var != null ? ju4Var.f378111d : null));
                java.lang.String l18 = com.tencent.mm.sdk.platformtools.t8.l(x51.j1.d(ju4Var != null ? ju4Var.f378112e : null));
                gm0.j1.u().c().w(8197, l17);
                gm0.j1.u().c().w(8198, l18);
                gm0.j1.u().c().w(16, java.lang.Integer.valueOf(i18));
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[i18] = ju4Var != null ? java.lang.Integer.valueOf(ju4Var.f378113f) : null;
                objArr[1] = l17;
                objArr[2] = l18;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "handleNoMoreCmds ContinueFlag:%s, cur[%s], max[%s]", objArr);
                gm0.j1.u().c().w(8196, ju4Var != null ? java.lang.Long.valueOf(ju4Var.f378113f) : null);
                gm0.j1.u().c().i(true);
            } else {
                if ((((ju4Var != null ? ju4Var.f378116i : null) == null || this.f451419b >= ju4Var.f378116i.size()) ? i18 : 1) != 0 && ju4Var != null && (linkedList2 = ju4Var.f378116i) != null) {
                    b50Var = (r45.b50) linkedList2.get(this.f451419b);
                }
                r45.b50 b50Var2 = b50Var;
                a1Var.d("NetSceneInit", this.f451419b, (ju4Var == null || (linkedList = ju4Var.f378116i) == null) ? i18 : linkedList.size(), b50Var2, true, com.tencent.mm.booter.x1.e(), 1);
                this.f451419b++;
                initController.d(b50Var2);
                i19++;
                i18 = 0;
            }
        }
        a1Var.a("NetSceneInit");
        return x11.y.f451421e;
    }

    @Override // x11.a
    public java.lang.String b() {
        return "InitTaskNewInitRsp@" + hashCode();
    }
}
