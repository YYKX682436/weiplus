package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class pb extends com.tencent.mm.ui.contact.p6 {
    @Override // com.tencent.mm.ui.contact.p6, com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        int i18;
        com.tencent.mm.ui.contact.item.u0 u0Var;
        if (i17 == this.f207086q) {
            return u(i17);
        }
        if (i17 < 0) {
            return null;
        }
        if (this.f207089t == 1) {
            i18 = i17 - 1;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsSelectConversationAdapter", "Actually dead branch. position=%d", java.lang.Integer.valueOf(i17));
            i18 = i17;
        }
        if (!this.f207085p.moveToPosition(i18)) {
            com.tencent.mm.ui.contact.item.k0 k0Var = new com.tencent.mm.ui.contact.item.k0(4, i17);
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsSelectConversationAdapter", "wrong case: %s, %s", java.lang.Boolean.valueOf(this.f207085p.isClosed()), java.lang.Integer.valueOf(i18));
            return k0Var;
        }
        com.tencent.mm.ui.contact.item.f0 f0Var = new com.tencent.mm.ui.contact.item.f0(i17);
        com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
        l4Var.convertFrom(this.f207085p);
        gm0.j1.i();
        f0Var.f(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(l4Var.h1()));
        if (f0Var.B == null) {
            gm0.j1.i();
            f0Var.f(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(l4Var.h1()));
        }
        f0Var.f206836e = this.f207078f;
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(l4Var.h1())) {
            f0Var.f206844m = true;
            if (i17 == this.f207086q + 1 && (u0Var = this.F) != null) {
                this.G = true;
                u0Var.h(com.tencent.mm.R.drawable.agd);
            }
        }
        if (i17 == this.f207086q - 1) {
            f0Var.f206843l = true;
        }
        java.lang.String str = f0Var.f206850s;
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(str)) {
            this.f207093x++;
        }
        ((java.util.HashMap) this.f207091v).put(str, java.lang.Integer.valueOf(i17 - this.f207086q));
        return f0Var;
    }

    @Override // com.tencent.mm.ui.contact.p6, com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationAdapter", "resetData");
        t();
        int i17 = this.f207088s;
        if (com.tencent.mm.ui.contact.i5.d(i17, 4)) {
            java.util.List c17 = com.tencent.mm.ui.contact.k3.c();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(c17)) {
                com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list = this.f206588m;
                l75.e0 e0Var = pp.a.f357364e2;
                this.f207084o = Di.t(c17, 3, list, null, this.f206587i, "");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationAdapter", "resetData: recent forward control switch on");
            com.tencent.mm.storage.m4 Di2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list2 = this.f206588m;
            l75.e0 e0Var2 = pp.a.f357364e2;
            this.f207083n = Di2.C(3, list2, null, this.f206587i, "");
        } else if (com.tencent.mm.ui.contact.i5.d(i17, 16)) {
            java.util.List b17 = com.tencent.mm.ui.contact.k3.b();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(b17)) {
                com.tencent.mm.storage.m4 Di3 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list3 = this.f206588m;
                l75.e0 e0Var3 = pp.a.f357364e2;
                this.f207084o = Di3.t(b17, 5, list3, null, this.f206587i, "");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationAdapter", "resetData: recent forward control switch on");
            com.tencent.mm.storage.m4 Di4 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list4 = this.f206588m;
            l75.e0 e0Var4 = pp.a.f357364e2;
            this.f207083n = Di4.C(5, list4, null, this.f206587i, "");
        } else {
            java.util.List d17 = com.tencent.mm.ui.contact.k3.d();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(d17)) {
                com.tencent.mm.storage.m4 Di5 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list5 = this.f206588m;
                l75.e0 e0Var5 = pp.a.f357364e2;
                this.f207084o = Di5.t(d17, 1, list5, null, this.f206587i, "");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationAdapter", "resetData: recent forward control switch on");
            com.tencent.mm.storage.m4 Di6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list6 = this.f206588m;
            l75.e0 e0Var6 = pp.a.f357364e2;
            this.f207083n = Di6.C(1, list6, null, this.f206587i, "");
        }
        int count = this.f207083n.getCount();
        this.A = count;
        if (count > 0) {
            this.f207086q = 0;
        } else {
            this.f207086q = this.f207076d.O3().getHeaderViewsCount();
        }
        this.f207085p = this.f207083n;
        h();
    }
}
