package pk2;

/* loaded from: classes3.dex */
public final class ka extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355925h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355926i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355925h = helper.f356112u;
        this.f355926i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.tencent.mm.plugin.finder.live.widget.yx yxVar;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mm.plugin.finder.live.widget.sx sxVar = com.tencent.mm.plugin.finder.live.widget.yx.f120478f;
        pk2.o9 o9Var2 = this.f364427a;
        if (sxVar.b(o9Var2.f356078d, o9Var2.f356074b)) {
            java.lang.Object obj = null;
            pk2.f8.f355747a.c(1, 2, null);
            java.util.List list = ((mm2.o4) o9Var.c(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) next).f309170a, ((mm2.c1) o9Var.c(mm2.c1.class)).m8())) {
                        obj = next;
                        break;
                    }
                }
            }
            boolean z17 = obj != null;
            boolean E7 = ((mm2.o4) o9Var.c(mm2.o4.class)).E7();
            com.tencent.mars.xlog.Log.i(o9Var.f356072a, "showCustomerVideoLevel linking:" + z17 + ",linkWait:" + E7);
            if (z17 || E7) {
                db5.t7.b(this.f364427a.f356078d, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egv));
                return;
            }
            boolean z18 = ((mm2.c1) o9Var.c(mm2.c1.class)).V4 != 0;
            boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (!z18 && isConnected) {
                pk2.d9 d9Var = o9Var.f356082f;
                if (d9Var == null || (yxVar = d9Var.f355667j) == null) {
                    return;
                }
                yxVar.b(o9Var.h(), 1);
                return;
            }
            com.tencent.mars.xlog.Log.i(o9Var.f356072a, "anchor pause live:" + z18 + ",networkEnable:" + isConnected + '!');
            db5.t7.b(this.f364427a.f356078d, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egu));
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355926i;
    }

    @Override // qk2.f
    public boolean o() {
        java.lang.Object obj;
        boolean z17;
        java.lang.String str;
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3928y4).getValue()).r()).intValue() != 0 || zl2.r4.f473950a.X1(((mm2.e1) this.f364427a.c(mm2.e1.class)).f328989s)) {
            return false;
        }
        java.util.List list = ((mm2.o4) this.f364427a.c(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) this.f364427a.c(mm2.c1.class)).m8())) {
                    break;
                }
            }
        }
        boolean z18 = obj != null;
        com.tencent.mm.plugin.finder.live.widget.sx sxVar = com.tencent.mm.plugin.finder.live.widget.yx.f120478f;
        kn0.r c17 = sxVar.c(z18);
        if (c17 != null && (str = c17.f309598c) != null) {
            if (str.length() == 0) {
                z17 = true;
                if (z17 && sxVar.a()) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i(this.f364427a.f356072a, "showLevel:" + c17 + ", and not contain video level!");
                return false;
            }
        }
        z17 = false;
        if (z17) {
        }
        com.tencent.mars.xlog.Log.i(this.f364427a.f356072a, "showLevel:" + c17 + ", and not contain video level!");
        return false;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        java.lang.Object obj;
        java.lang.String str;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        java.util.List list = ((mm2.o4) o9Var.c(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) o9Var.c(mm2.c1.class)).m8())) {
                        break;
                    }
                }
            }
        }
        kn0.r c17 = com.tencent.mm.plugin.finder.live.widget.yx.f120478f.c(obj != null);
        if (c17 == null || (str = c17.f309598c) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491684dx3, str2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        menu.l(this.f355925h, pk2.o9.b(o9Var, string, str2, 0, 4, null), com.tencent.mm.R.raw.finder_icons_video_definition, ((mm2.c1) o9Var.c(mm2.c1.class)).f8());
        pk2.d9 d9Var = o9Var.f356082f;
        if (d9Var != null) {
            d9Var.f355667j = new com.tencent.mm.plugin.finder.live.widget.yx(o9Var.f356078d, o9Var.f356074b);
        }
        pk2.d9 d9Var2 = o9Var.f356082f;
        com.tencent.mm.plugin.finder.live.widget.yx yxVar = d9Var2 != null ? d9Var2.f355667j : null;
        if (yxVar != null) {
            yxVar.f120482d = c17;
        }
        pk2.f8.f355747a.c(1, 1, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f355925h;
    }
}
