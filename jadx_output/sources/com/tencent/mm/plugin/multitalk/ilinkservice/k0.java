package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
class k0 implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f149670d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.network.s0 f149671e = new com.tencent.mm.plugin.multitalk.ilinkservice.j0();

    /* loaded from: classes8.dex */
    public static class a implements com.tencent.mm.ipcinvoker.j {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            int i17 = ((android.os.Bundle) obj).getInt("newState", 0);
            java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: %s on network changed: %d (%s)", bm5.f1.a(), java.lang.Integer.valueOf(i17), formatedNetType);
            if ("NON_NETWORK".equals(formatedNetType)) {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.C(0);
            } else if ("2G".equals(formatedNetType)) {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.C(1);
            } else if ("3G".equals(formatedNetType)) {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.C(3);
            } else if ("WIFI".equals(formatedNetType)) {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.C(4);
            } else if ("4G".equals(formatedNetType)) {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.C(5);
            } else if ("5G".equals(formatedNetType)) {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.C(5);
            }
            if (rVar != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("err_code", 0);
                bundle.putString("err_desc", ya.b.SUCCESS);
                rVar.a(bundle);
            }
        }
    }

    private k0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("from_process", "");
        f149670d = string;
        int i17 = -1;
        if (com.tencent.mm.sdk.platformtools.t8.K0(string) || !f149670d.startsWith("com.tencent.mm")) {
            str = "invalid package name " + f149670d;
        } else {
            int i18 = bundle.getInt("opcode", -1);
            com.tencent.mm.network.s0 s0Var = f149671e;
            if (i18 == 0) {
                gm0.j1.n().a(s0Var);
            } else if (i18 == 1) {
                gm0.j1.n().d(s0Var);
            } else {
                i17 = -2;
                str = "not valid op code";
            }
            i17 = 0;
            str = ya.b.SUCCESS;
        }
        if (rVar != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("err_code", i17);
            bundle2.putString("err_desc", str);
            rVar.a(bundle2);
        }
    }
}
