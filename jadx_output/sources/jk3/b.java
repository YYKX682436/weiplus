package jk3;

/* loaded from: classes8.dex */
public abstract class b implements jk3.e {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.model.MultiTaskInfo f300077a;

    /* renamed from: b, reason: collision with root package name */
    public r45.w60 f300078b;

    /* renamed from: c, reason: collision with root package name */
    public r45.kr4 f300079c;

    public void A() {
        r45.gr4 gr4Var;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        objArr[0] = multiTaskInfo != null ? multiTaskInfo.field_id : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsMultiTaskHelper", "onExitPage, type:", objArr);
        r45.kr4 kr4Var = this.f300079c;
        if (kr4Var != null && (gr4Var = (r45.gr4) kr4Var.getCustom(5)) != null) {
            ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
            long c17 = c01.id.c();
            if (c17 >= gr4Var.getLong(0)) {
                gr4Var.set(1, java.lang.Long.valueOf(gr4Var.getLong(1) + (c17 - gr4Var.getLong(0))));
            }
        }
        if (a() && s()) {
            ((ku5.t0) ku5.t0.f312615d).b(new jk3.a(this), "MultiTasklLoopTag");
        }
    }

    public void B(boolean z17) {
        C(z17, 8);
    }

    public void C(boolean z17, int i17) {
    }

    public void D() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo o17;
        if (t() || (o17 = o()) == null) {
            return;
        }
        com.tencent.mm.plugin.multitask.n0 n0Var = (com.tencent.mm.plugin.multitask.n0) i95.n0.c(com.tencent.mm.plugin.multitask.n0.class);
        java.lang.String str = o17.field_id;
        ((gh4.h0) n0Var).getClass();
        ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(str, true, 2);
    }

    public boolean E() {
        return true;
    }

    public boolean F(int i17) {
        return !(this instanceof cl4.l);
    }

    public boolean G() {
        return !(this instanceof com.tencent.mm.plugin.finder.live.view.o7);
    }

    public void H(android.graphics.Bitmap bitmap, boolean z17) {
        if (t()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsMultiTaskHelper", "updateCurrentHistoryTaskInfo");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo o17 = o();
        if (o17 != null) {
            com.tencent.mm.plugin.multitask.n0 n0Var = (com.tencent.mm.plugin.multitask.n0) i95.n0.c(com.tencent.mm.plugin.multitask.n0.class);
            java.lang.String str = o17.field_id;
            int i17 = o17.field_type;
            r45.lr4 v07 = o17.v0();
            byte[] bArr = o17.field_data;
            ((gh4.h0) n0Var).getClass();
            gh4.e0 e0Var = (gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class));
            e0Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTaskInfoByBitmap id:");
            sb6.append(str);
            sb6.append(" type:");
            sb6.append(i17);
            sb6.append(" bitmap:");
            sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getByteCount()) : null);
            sb6.append(" updateBitmapOnly:");
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.PluginTaskBar", sb6.toString());
            if (str == null) {
                return;
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                if (gm0.j1.a()) {
                    if (bitmap != null) {
                        gh4.l0 l0Var = gh4.l0.f271938a;
                        java.lang.String c17 = l0Var.c(str);
                        e0Var.Ri(str);
                        e0Var.Vi(bitmap, c17, gh4.a0.f271913d);
                        if (lh4.n.f318719e.b(i17)) {
                            o11.g SNAPSHOT_LOADER_OPTION = gh4.j0.f271934b;
                            kotlin.jvm.internal.o.f(SNAPSHOT_LOADER_OPTION, "SNAPSHOT_LOADER_OPTION");
                            n11.a.b().o(l0Var.b(c17, SNAPSHOT_LOADER_OPTION), bitmap);
                        }
                    }
                    e0Var.Zi(str, i17, v07, bArr, z17);
                    return;
                }
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("addType", 2);
            bundle.putString(dm.i4.COL_ID, str);
            bundle.putInt("type", i17);
            bundle.putByteArray("showData", v07 != null ? v07.toByteArray() : null);
            bundle.putByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bArr);
            bundle.putBoolean("updateBitmapOnly", z17);
            if (bitmap == null) {
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, gh4.a.class, gh4.d0.f271918d);
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            sb7.append(lp0.b.h0("taskbar").o());
            sb7.append('/');
            sb7.append(str);
            java.lang.String sb8 = sb7.toString();
            if (com.tencent.mm.vfs.w6.j(sb8)) {
                com.tencent.mm.vfs.w6.h(sb8);
            }
            e0Var.Vi(bitmap, sb8, new gh4.c0(bundle, sb8));
        }
    }

    public void I() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo;
        if (!s() || (multiTaskInfo = this.f300077a) == null) {
            return;
        }
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        java.lang.String field_id = multiTaskInfo.field_id;
        kotlin.jvm.internal.o.f(field_id, "field_id");
        int i17 = multiTaskInfo.field_type;
        r45.lr4 v07 = multiTaskInfo.v0();
        kotlin.jvm.internal.o.f(v07, "getShowData(...)");
        ((com.tencent.mm.plugin.multitask.p1) l0Var).aj(field_id, i17, v07, multiTaskInfo.field_data);
    }

    public void J() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo;
        if (!s() || (multiTaskInfo = this.f300077a) == null) {
            return;
        }
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        java.lang.String field_id = multiTaskInfo.field_id;
        kotlin.jvm.internal.o.f(field_id, "field_id");
        int i17 = multiTaskInfo.field_type;
        r45.lr4 v07 = multiTaskInfo.v0();
        kotlin.jvm.internal.o.f(v07, "getShowData(...)");
        ((com.tencent.mm.plugin.multitask.p1) l0Var).Zi(field_id, i17, v07, null, multiTaskInfo.field_data);
    }

    public void K(java.lang.String str) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        r45.lr4 v07 = multiTaskInfo != null ? multiTaskInfo.v0() : null;
        if (v07 != null) {
            v07.set(5, str);
        }
        I();
    }

    public void L(java.lang.String str) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        r45.lr4 v07 = multiTaskInfo != null ? multiTaskInfo.v0() : null;
        if (v07 != null) {
            v07.set(1, str);
        }
        I();
    }

    @Override // jk3.e
    public boolean a() {
        return false;
    }

    @Override // jk3.e
    public android.graphics.Bitmap b() {
        return null;
    }

    @Override // jk3.e
    public boolean c(int i17) {
        return !(this instanceof com.tencent.mm.pluginsdk.ui.tools.p3);
    }

    @Override // jk3.e
    public boolean d() {
        return false;
    }

    @Override // jk3.e
    public java.lang.String e() {
        return null;
    }

    @Override // jk3.e
    public boolean f() {
        return false;
    }

    @Override // jk3.e
    public void g(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        if (multiTaskInfo != null) {
            com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
            java.lang.String field_id = multiTaskInfo.field_id;
            kotlin.jvm.internal.o.f(field_id, "field_id");
            int i17 = multiTaskInfo.field_type;
            r45.lr4 v07 = multiTaskInfo.v0();
            kotlin.jvm.internal.o.f(v07, "getShowData(...)");
            ((com.tencent.mm.plugin.multitask.p1) l0Var).Zi(field_id, i17, v07, bitmap, multiTaskInfo.field_data);
        }
    }

    @Override // jk3.e
    public java.lang.String getPosition() {
        return null;
    }

    @Override // jk3.e
    public android.graphics.Bitmap h(android.graphics.Bitmap bitmap) {
        return null;
    }

    @Override // jk3.e
    public java.lang.Boolean i() {
        return java.lang.Boolean.FALSE;
    }

    @Override // jk3.e
    public void j() {
    }

    @Override // jk3.e
    public void k() {
    }

    public void l(android.graphics.Bitmap bitmap, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsMultiTaskHelper", "addCurrentMultiTaskInfoWithBlt, forceUpdate:" + z17);
        if (!s()) {
            r45.kr4 kr4Var = this.f300079c;
            r45.er4 er4Var = kr4Var != null ? (r45.er4) kr4Var.getCustom(6) : null;
            if (er4Var != null) {
                er4Var.set(1, 2L);
            }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
            if (multiTaskInfo != null) {
                com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
                java.lang.String field_id = multiTaskInfo.field_id;
                kotlin.jvm.internal.o.f(field_id, "field_id");
                int i17 = multiTaskInfo.field_type;
                r45.lr4 v07 = multiTaskInfo.v0();
                kotlin.jvm.internal.o.f(v07, "getShowData(...)");
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = this.f300077a;
                ((com.tencent.mm.plugin.multitask.p1) l0Var).wi(field_id, i17, v07, bitmap, multiTaskInfo2 != null ? multiTaskInfo2.field_data : null, this.f300079c);
                return;
            }
            return;
        }
        if (!z17) {
            r45.kr4 kr4Var2 = this.f300079c;
            r45.er4 er4Var2 = kr4Var2 != null ? (r45.er4) kr4Var2.getCustom(6) : null;
            if (er4Var2 != null) {
                er4Var2.set(1, 1L);
            }
            g(bitmap);
            return;
        }
        r45.kr4 kr4Var3 = this.f300079c;
        r45.er4 er4Var3 = kr4Var3 != null ? (r45.er4) kr4Var3.getCustom(6) : null;
        if (er4Var3 != null) {
            er4Var3.set(1, 1L);
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo3 = this.f300077a;
        if (multiTaskInfo3 != null) {
            com.tencent.mm.plugin.multitask.l0 l0Var2 = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
            java.lang.String field_id2 = multiTaskInfo3.field_id;
            kotlin.jvm.internal.o.f(field_id2, "field_id");
            int i18 = multiTaskInfo3.field_type;
            r45.lr4 v08 = multiTaskInfo3.v0();
            kotlin.jvm.internal.o.f(v08, "getShowData(...)");
            ((com.tencent.mm.plugin.multitask.p1) l0Var2).wi(field_id2, i18, v08, bitmap, multiTaskInfo3.field_data, this.f300079c);
        }
    }

    public void m(android.graphics.Bitmap bitmap) {
        if (t()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsMultiTaskHelper", "add or update taskInfo");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo o17 = o();
        if (o17 != null) {
            com.tencent.mm.plugin.multitask.n0 n0Var = (com.tencent.mm.plugin.multitask.n0) i95.n0.c(com.tencent.mm.plugin.multitask.n0.class);
            java.lang.String str = o17.field_id;
            int i17 = o17.field_type;
            r45.lr4 v07 = o17.v0();
            byte[] bArr = o17.field_data;
            ((gh4.h0) n0Var).getClass();
            gh4.e0 e0Var = (gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class));
            e0Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addTaskInfoByBitmap id:");
            sb6.append(str);
            sb6.append(" type:");
            sb6.append(i17);
            sb6.append(" bitmap:");
            sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getByteCount()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.PluginTaskBar", sb6.toString());
            if (str == null) {
                return;
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                if (gm0.j1.a()) {
                    if (bitmap != null) {
                        gh4.l0 l0Var = gh4.l0.f271938a;
                        java.lang.String c17 = l0Var.c(str);
                        e0Var.Ri(str);
                        e0Var.Vi(bitmap, c17, gh4.u.f271959d);
                        if (lh4.n.f318719e.b(i17)) {
                            o11.g SNAPSHOT_LOADER_OPTION = gh4.j0.f271934b;
                            kotlin.jvm.internal.o.f(SNAPSHOT_LOADER_OPTION, "SNAPSHOT_LOADER_OPTION");
                            java.lang.String b17 = l0Var.b(c17, SNAPSHOT_LOADER_OPTION);
                            n11.a.b().p(b17);
                            n11.a.b().o(b17, bitmap);
                        }
                    }
                    e0Var.wi(str, i17, v07, bArr);
                    return;
                }
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("addType", 1);
            bundle.putString(dm.i4.COL_ID, str);
            bundle.putInt("type", i17);
            bundle.putByteArray("showData", v07 != null ? v07.toByteArray() : null);
            bundle.putByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bArr);
            if (bitmap == null) {
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, gh4.a.class, gh4.x.f271967d);
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            sb7.append(lp0.b.h0("taskbar").o());
            sb7.append('/');
            sb7.append(str);
            java.lang.String sb8 = sb7.toString();
            if (com.tencent.mm.vfs.w6.j(sb8)) {
                com.tencent.mm.vfs.w6.h(sb8);
            }
            e0Var.Vi(bitmap, sb8, new gh4.w(bundle, sb8));
        }
    }

    public long n() {
        return 500L;
    }

    public com.tencent.mm.plugin.multitask.model.MultiTaskInfo o() {
        return this.f300077a;
    }

    public int p() {
        return -1;
    }

    public java.lang.String q(int i17) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        if (multiTaskInfo == null) {
            return "";
        }
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        java.lang.String field_id = multiTaskInfo.field_id;
        kotlin.jvm.internal.o.f(field_id, "field_id");
        int i18 = multiTaskInfo.field_type;
        int p17 = p();
        ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
        com.tencent.mm.plugin.multitask.i1 i1Var = (com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class));
        i1Var.getClass();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return i1Var.Ri(field_id, i18, p17, i17);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.COL_ID, field_id);
        bundle.putInt("type", i18);
        bundle.putInt("curPos", p17);
        bundle.putInt("way", i17);
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.multitask.r0.class);
        if (iPCString != null) {
            return iPCString.f68406d;
        }
        return null;
    }

    public void r(android.graphics.Bitmap bitmap, boolean z17) {
        if (t()) {
            return;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbsMultiTaskHelper", "ended, remove historyTaskInfo");
            D();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbsMultiTaskHelper", "not ended update historyTaskInfo");
            H(bitmap, false);
        }
    }

    public boolean s() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        if (multiTaskInfo != null) {
            return ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo);
        }
        return false;
    }

    public boolean t() {
        return this instanceof rh1.c;
    }

    public boolean u() {
        return true;
    }

    public boolean v() {
        return !(this instanceof rh1.a);
    }

    public boolean w() {
        return this instanceof an4.a;
    }

    public boolean x() {
        return this instanceof rh1.a;
    }

    public void y(int i17, java.lang.String str) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        this.f300077a = multiTaskInfo;
        ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
        multiTaskInfo.field_updateTime = c01.id.c();
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = this.f300077a;
        if (multiTaskInfo2 != null) {
            multiTaskInfo2.field_id = str;
        }
        if (multiTaskInfo2 != null) {
            multiTaskInfo2.field_type = i17;
        }
        r45.kr4 kr4Var = new r45.kr4();
        this.f300079c = kr4Var;
        kr4Var.set(6, new r45.er4());
        r45.kr4 kr4Var2 = this.f300079c;
        if (kr4Var2 != null) {
            kr4Var2.set(5, new r45.gr4());
        }
        r45.kr4 kr4Var3 = this.f300079c;
        if (kr4Var3 != null) {
            kr4Var3.set(7, new r45.ir4());
        }
        r45.kr4 kr4Var4 = this.f300079c;
        if (kr4Var4 != null) {
            kr4Var4.set(8, new r45.jr4());
        }
        r45.kr4 kr4Var5 = this.f300079c;
        r45.jr4 jr4Var = kr4Var5 != null ? (r45.jr4) kr4Var5.getCustom(8) : null;
        if (jr4Var == null) {
            return;
        }
        jr4Var.set(1, java.lang.Boolean.TRUE);
    }

    public void z() {
        r45.gr4 gr4Var;
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        objArr[0] = multiTaskInfo != null ? multiTaskInfo.field_id : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsMultiTaskHelper", "onEnterPage, type:", objArr);
        r45.kr4 kr4Var = this.f300079c;
        if (kr4Var == null || (gr4Var = (r45.gr4) kr4Var.getCustom(5)) == null) {
            return;
        }
        ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
        gr4Var.set(0, java.lang.Long.valueOf(c01.id.c()));
    }
}
