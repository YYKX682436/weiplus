package gh4;

@j95.b
/* loaded from: classes8.dex */
public final class e0 extends i95.w implements gh4.s, androidx.lifecycle.m1 {

    /* renamed from: d, reason: collision with root package name */
    public gh4.o0 f271919d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.l1 f271920e = new androidx.lifecycle.l1();

    public final com.tencent.mm.plugin.multitask.model.MultiTaskInfo Ai(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        gh4.o0 Bi = Bi();
        if (Bi != null) {
            return Bi.y0(id6);
        }
        return null;
    }

    public final gh4.o0 Bi() {
        if (this.f271919d == null && gm0.j1.a()) {
            synchronized (this) {
                if (this.f271919d == null) {
                    l75.k0 k0Var = gm0.j1.u().f273153f;
                    kotlin.jvm.internal.o.f(k0Var, "getDataDB(...)");
                    this.f271919d = new gh4.o0(k0Var);
                }
            }
        }
        return this.f271919d;
    }

    public java.util.List Di(int i17) {
        gh4.o0 Bi = Bi();
        if (Bi == null) {
            return new java.util.ArrayList();
        }
        android.database.Cursor B = Bi.f271946d.B("SELECT * FROM TaskBarInfo WHERE type = ? ORDER BY updateTime DESC;", new java.lang.String[]{java.lang.String.valueOf(i17)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (B.moveToNext()) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
            multiTaskInfo.convertFrom(B);
            arrayList.add(multiTaskInfo);
        }
        B.close();
        return arrayList;
    }

    public final void Ni(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        gh4.s0 s0Var = (gh4.s0) i95.n0.c(gh4.s0.class);
        s0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewService", "notifyRemoveTaskBarItem " + multiTaskInfo.v0().getString(1) + ' ' + multiTaskInfo.field_id + ' ' + multiTaskInfo.field_type);
        java.util.HashSet hashSet = (java.util.HashSet) s0Var.f271954d.get(multiTaskInfo.field_type);
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((hh4.k) it.next()).p0(multiTaskInfo);
            }
        }
        fs.g.c(hh4.j.class, java.lang.Integer.valueOf(multiTaskInfo.field_type), new gh4.r0(multiTaskInfo));
    }

    public final void Ri(java.lang.String str) {
        if (str != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = gh4.m0.f271939a;
            sb6.append(gh4.m0.f271940b);
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            if (com.tencent.mm.vfs.w6.j(sb7)) {
                com.tencent.mm.vfs.w6.h(sb7);
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String str3 = gh4.m0.f271939a;
            sb8.append(gh4.m0.f271939a);
            sb8.append(str);
            java.lang.String sb9 = sb8.toString();
            if (com.tencent.mm.vfs.w6.j(sb9)) {
                com.tencent.mm.vfs.w6.h(sb9);
            }
        }
    }

    public void Ui(java.lang.String str, boolean z17, int i17) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo y07;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.PluginTaskBar", "removeTaskInfo " + str + ' ' + z17 + ' ' + i17);
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.COL_ID, str);
            bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, gh4.b.class, gh4.y.f271968d);
            return;
        }
        if (gm0.j1.a() && str != null) {
            Ri(str);
            gh4.o0 Bi = Bi();
            if (Bi == null || (y07 = Bi.y0(str)) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarStorage", com.tencent.tinker.loader.shareutil.ShareConstants.RES_DEL_TITLE + y07.field_type + ' ' + y07.field_id + ' ' + y07.v0().getString(1) + ' ' + i17);
            Bi.delete((l75.f0) y07, false, new java.lang.String[0]);
            if (z17) {
                gh4.n0 n0Var = new gh4.n0();
                n0Var.f271943a = y07;
                n0Var.f271944b = i17;
                Bi.doNotify("single", 5, n0Var);
            }
        }
    }

    public final void Vi(android.graphics.Bitmap bitmap, java.lang.String str, yz5.a aVar) {
        ((ku5.t0) ku5.t0.f312615d).q(new gh4.z(bitmap, str, aVar));
    }

    public final void Zi(java.lang.String id6, int i17, r45.lr4 lr4Var, byte[] bArr, boolean z17) {
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo Ai = Ai(id6);
        if (Ai != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.PluginTaskBar", "updateTaskInfo id:" + id6 + " type:" + i17 + " updateBitmapOnly:" + z17);
            Ai.field_updateTime = java.lang.System.currentTimeMillis();
            if (!z17) {
                Ai.field_showData = lr4Var;
                if (bArr != null) {
                    Ai.field_data = bArr;
                }
            }
            gh4.o0 Bi = Bi();
            if (Bi != null) {
                Bi.update(Ai, new java.lang.String[0]);
            }
        }
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return this.f271920e;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.PluginTaskBar", "onAccountRelease");
        this.f271919d = null;
    }

    public final void wi(java.lang.String id6, int i17, r45.lr4 lr4Var, byte[] bArr) {
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo Ai = Ai(id6);
        if (Ai != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.PluginTaskBar", "updateTaskInfo id:" + id6 + " type:" + i17);
            Ai.field_updateTime = java.lang.System.currentTimeMillis();
            Ai.field_showData = lr4Var;
            if (bArr != null) {
                Ai.field_data = bArr;
            }
            gh4.o0 Bi = Bi();
            if ((Bi != null ? java.lang.Boolean.valueOf(Bi.update(Ai, new java.lang.String[0])) : null) != null) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBar.PluginTaskBar", "addTaskInfo id:" + id6 + " type:" + i17);
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.field_id = id6;
        multiTaskInfo.field_type = i17;
        multiTaskInfo.field_createTime = java.lang.System.currentTimeMillis();
        multiTaskInfo.field_updateTime = java.lang.System.currentTimeMillis();
        multiTaskInfo.field_showData = lr4Var;
        multiTaskInfo.field_data = bArr;
        gh4.o0 Bi2 = Bi();
        if (Bi2 != null) {
            Bi2.insert(multiTaskInfo);
        }
    }
}
