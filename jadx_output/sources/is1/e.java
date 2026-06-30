package is1;

/* loaded from: classes7.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f294411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f294412b;

    public e(java.util.LinkedList linkedList, int i17) {
        this.f294411a = linkedList;
        this.f294412b = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        boolean z17;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplInfoManager", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(fVar2.f70615a), java.lang.Integer.valueOf(fVar2.f70616b), fVar2.f70617c);
        java.util.Iterator it = this.f294411a.iterator();
        while (it.hasNext()) {
            is1.l.f294429g.remove(java.lang.Integer.valueOf(((r45.p20) it.next()).f382676d));
        }
        if (fVar2.f70615a == 0 && fVar2.f70616b == 0 && (fVar = fVar2.f70618d) != null) {
            if (((r45.r20) fVar).f384464i > 0) {
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().putLong("_check_time_colddown", r2 * 1000);
            }
            int i17 = ((r45.r20) fVar2.f70618d).f384465m;
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().putBoolean("_android_fst_tmpl_fix", i17 == 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplInfoManager", "saveAndroidFastTmplFix value = " + i17);
            java.util.LinkedList linkedList = ((r45.r20) fVar2.f70618d).f384463h;
            if (linkedList == null || linkedList.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplInfoManager", "cgi back tmplInfoList is empty, return");
            } else {
                java.util.Iterator it6 = ((r45.r20) fVar2.f70618d).f384463h.iterator();
                while (it6.hasNext()) {
                    r45.vm6 vm6Var = (r45.vm6) it6.next();
                    if (vm6Var != null) {
                        int i18 = this.f294412b;
                        synchronized (is1.l.class) {
                            if (!com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.j(vm6Var)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.Preload.TmplInfoManager", "isTmplInfoExist() tmplInfo is invalid, return false");
                            } else if (is1.l.f(vm6Var.f388372d).f388373e == vm6Var.f388373e) {
                                if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.i(com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.a(vm6Var))) {
                                    z17 = true;
                                } else {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplInfoManager", "[isTmplInfoExist]file isn't exist, may be delete");
                                }
                            }
                            z17 = false;
                        }
                        if (z17) {
                            com.tencent.mm.plugin.brandservice.ui.timeline.preload.w1.a("MicroMsg.Preload.TmplInfoManager", vm6Var.f388380o + " exist, only see for debug");
                        } else {
                            int i19 = vm6Var.f388372d;
                            is1.l lVar = is1.l.f294423a;
                            is1.j jVar = new is1.j(i19);
                            java.lang.String str = vm6Var.f388374f;
                            if (str == null || r26.n0.N(str)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplInfoManager", "[addDownloadTask] TmplInfo is null, return");
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplInfoManager", "start download:" + lVar.d(vm6Var));
                                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new is1.h(vm6Var, i18, jVar, null), 2, null);
                            }
                        }
                        java.lang.String e17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.e(vm6Var);
                        java.lang.String str2 = vm6Var.f388380o;
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().putString("_tmpl_info_latest_responsed_-" + vm6Var.f388372d, str2);
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().W(com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.c(vm6Var));
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().W(com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.d(vm6Var));
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().H(e17, vm6Var.toByteArray());
                        java.lang.String f17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.f(vm6Var);
                        com.tencent.mm.sdk.platformtools.o4 g17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g();
                        java.util.Set stringSet = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().getStringSet(f17, null);
                        if (stringSet == null) {
                            stringSet = new java.util.HashSet();
                        }
                        stringSet.add(vm6Var.f388380o);
                        g17.putStringSet(f17, stringSet);
                    }
                }
                ax4.a.a(1);
            }
        } else {
            ax4.a.a(2);
        }
        return null;
    }
}
