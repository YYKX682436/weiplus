package hy2;

/* loaded from: classes8.dex */
public final class m extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f286066d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f286067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final boolean O6(int i17, long j17, java.lang.String str) {
        jz5.l lVar;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        boolean z17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                r4 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
            }
            if (r4 && ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127683eg).getValue()).r()).booleanValue()) {
                Q6(j17, str);
            }
            return true;
        }
        if (i17 == 17 || i17 == 18 || i17 == 20 || i17 == 155) {
            Q6(j17, str);
            return true;
        }
        boolean z18 = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 1;
        java.lang.String concat = "finder_feedId_".concat(pm0.v.u(j17));
        if (z18) {
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
            int permissionFlag = (h17 == null || (feedObject = h17.getFeedObject()) == null) ? -1 : feedObject.getPermissionFlag();
            if (((8388608 & permissionFlag) > 0) || permissionFlag == -1) {
                lVar = permissionFlag == -1 ? new jz5.l(java.lang.Boolean.TRUE, "本地无feed缓存，先放过") : new jz5.l(java.lang.Boolean.TRUE, "符合规则（青少年内容 && 在安全池内）");
            } else {
                boolean kf6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).kf(4, concat);
                lVar = new jz5.l(java.lang.Boolean.valueOf(kf6), "内容不在安全池内(临时授权：" + kf6 + ')');
            }
        } else {
            boolean kf7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).kf(4, concat);
            lVar = new jz5.l(java.lang.Boolean.valueOf(kf7), "青少年-不可访问(临时授权：" + kf7 + ')');
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTeenModeTempAuthMgr", "cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms reason=" + ((java.lang.String) lVar.f302834e));
        if (booleanValue) {
            Q6(j17, str);
        }
        return booleanValue;
    }

    public final void P6(long j17, java.lang.String authContent) {
        java.lang.String str;
        r45.kv2 kv2Var;
        kotlin.jvm.internal.o.g(authContent, "authContent");
        if (this.f286066d || this.f286067e) {
            return;
        }
        this.f286066d = true;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ot0.q v17 = ot0.q.v(authContent);
        zy2.i iVar = v17 != null ? (zy2.i) v17.y(zy2.i.class) : null;
        java.lang.String str2 = "<fromusr>" + c01.z1.r() + "</fromusr><type>49</type><content>" + com.tencent.mm.sdk.platformtools.t8.p(authContent) + "</content>";
        kotlin.jvm.internal.o.f(str2, "toString(...)");
        java.lang.String concat = "finder_feedId_".concat(pm0.v.u(j17));
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTeenModeTempAuthMgr", "jumpToAuthorization to isChecking " + this.f286066d + " isFinishing:" + getActivity().isFinishing() + " activity:" + getActivity());
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.f7d);
        android.content.res.Resources resources = getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (iVar == null || (kv2Var = iVar.f477411b) == null || (str = kv2Var.getString(4)) == null) {
            str = "";
        }
        objArr[0] = str;
        c0Var.Od(activity, 10013, 4, concat, string, resources.getString(com.tencent.mm.R.string.f7b, objArr), str2, true, new hy2.l(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q6(long r17, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy2.m.Q6(long, java.lang.String):boolean");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTeenModeTempAuthMgr", "requestCode " + i17 + ", resultCode " + i18);
        if (i17 != 10013 || i18 != 0 || getActivity().isFinishing() || getActivity().isDestroyed()) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = (com.tencent.mm.plugin.finder.viewmodel.component.g1) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
        if (g1Var != null) {
            g1Var.f134458g = true;
        }
        getActivity().finish();
        getActivity().overridePendingTransition(0, com.tencent.mm.R.anim.f477889ed);
    }
}
