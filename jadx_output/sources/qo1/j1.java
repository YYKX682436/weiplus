package qo1;

/* loaded from: classes5.dex */
public final class j1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f365524b;

    /* renamed from: a, reason: collision with root package name */
    public static final qo1.j1 f365523a = new qo1.j1();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f365525c = jz5.h.b(qo1.h1.f365500d);

    public final void a(qo1.j0 j0Var) {
        com.tencent.mars.xlog.Log.i("TaskManager", "setTask pkgId=" + j0Var.a() + ", task=" + j0Var.hashCode());
        synchronized (c()) {
            f365523a.c().put(java.lang.Long.valueOf(j0Var.a()), j0Var);
        }
        ((ku5.t0) ku5.t0.f312615d).g(new qo1.e1(j0Var));
    }

    public final int b(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        int i17 = 0;
        if (!f365524b) {
            return 0;
        }
        synchronized (c()) {
            java.util.HashMap c17 = f365523a.c();
            if (!c17.isEmpty()) {
                java.util.Iterator it = c17.entrySet().iterator();
                while (it.hasNext()) {
                    if (((java.lang.Boolean) predicate.invoke(((java.util.Map.Entry) it.next()).getValue())).booleanValue()) {
                        i17++;
                    }
                }
            }
        }
        return i17;
    }

    public final java.util.HashMap c() {
        return (java.util.HashMap) ((jz5.n) f365525c).getValue();
    }

    public final qo1.j0 d(long j17) {
        qo1.j0 j0Var;
        synchronized (c()) {
            qo1.j1 j1Var = f365523a;
            j0Var = (qo1.j0) j1Var.c().get(java.lang.Long.valueOf(j17));
            if (j0Var == null) {
                j0Var = new qo1.g0(j17);
                j1Var.a(j0Var);
            }
        }
        return j0Var;
    }

    public final jz5.f0 e(long j17, boolean z17) {
        jz5.f0 f0Var;
        synchronized (c()) {
            qo1.j1 j1Var = f365523a;
            qo1.j0 j0Var = (qo1.j0) j1Var.c().get(java.lang.Long.valueOf(j17));
            if (j0Var != null && (j0Var instanceof qo1.f0)) {
                jz5.l d17 = j0Var.d();
                com.tencent.wechat.aff.affroam.n0 n0Var = (com.tencent.wechat.aff.affroam.n0) d17.f302833d;
                qo1.i0 i0Var = (qo1.i0) d17.f302834e;
                if (n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED || n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_COMPLETED || ((z17 && n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_ERROR) || (z17 && n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PAUSED))) {
                    com.tencent.mars.xlog.Log.i("TaskManager", "remove invalid task, packageId = " + j17 + ", state = " + n0Var + ", error = " + i0Var);
                    j1Var.f(j17);
                }
            }
            f0Var = jz5.f0.f302826a;
        }
        return f0Var;
    }

    public final void f(long j17) {
        com.tencent.mars.xlog.Log.i("TaskManager", "removeTask pkgId=" + j17);
        qo1.g0 g0Var = new qo1.g0(j17);
        synchronized (c()) {
            qo1.j1 j1Var = f365523a;
            qo1.j0 j0Var = (qo1.j0) j1Var.c().get(java.lang.Long.valueOf(j17));
            if ((j0Var instanceof qo1.f0) && ((qo1.f0) j0Var).b()) {
                com.tencent.mars.xlog.Log.e("TaskManager", "Remove running task will cause crash, pkgId=" + j17 + ", task=" + ((qo1.f0) j0Var).hashCode() + '.');
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            j1Var.c().put(java.lang.Long.valueOf(j17), g0Var);
        }
        ((ku5.t0) ku5.t0.f312615d).g(new qo1.g1(g0Var));
    }

    public final qo1.d1 g(com.tencent.wechat.aff.affroam.g pkgInfo) {
        boolean z17;
        qo1.d1 d1Var;
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        boolean z18 = true;
        com.tencent.wechat.aff.affroam.o0 o0Var = (pkgInfo.f215835m & 1) != 0 ? com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP : com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_BACKUP;
        long j17 = pkgInfo.f215829d;
        com.tencent.mars.xlog.Log.i("TaskManager", "Start to backup for package(%s), type(%s)", java.lang.Long.valueOf(j17), o0Var);
        synchronized (c()) {
            java.util.HashMap c17 = f365523a.c();
            if (!c17.isEmpty()) {
                for (java.util.Map.Entry entry : c17.entrySet()) {
                    if ((entry.getValue() instanceof qo1.c1) && ((qo1.j0) entry.getValue()).b()) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                com.tencent.mars.xlog.Log.e("TaskManager", "Fail to launch a backup task. A restore task is running on current device.");
                d1Var = qo1.d1.f365465f;
            } else {
                qo1.j1 j1Var = f365523a;
                qo1.j0 j0Var = (qo1.j0) j1Var.c().get(java.lang.Long.valueOf(j17));
                if (j0Var == null || !j0Var.b()) {
                    z18 = false;
                }
                if (z18) {
                    com.tencent.mars.xlog.Log.e("TaskManager", "A running task(" + j0Var.hashCode() + ") is existed for pkgId=" + j17 + '.');
                    d1Var = qo1.d1.f365464e;
                } else if (j0Var instanceof qo1.v0) {
                    com.tencent.mars.xlog.Log.i("TaskManager", "Launch backup task from cache");
                    ((qo1.v0) j0Var).start();
                    d1Var = qo1.d1.f365463d;
                } else {
                    qo1.v0 v0Var = new qo1.v0(pkgInfo, o0Var);
                    com.tencent.mars.xlog.Log.i("TaskManager", "create new backup task. task=" + v0Var.hashCode());
                    j1Var.c().put(java.lang.Long.valueOf(v0Var.f365483i), v0Var);
                    v0Var.start();
                    d1Var = qo1.d1.f365463d;
                }
            }
        }
        return d1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qo1.d1 h(com.tencent.wechat.aff.affroam.g pkgInfo, java.util.List convList) {
        java.util.List list;
        qo1.d1 d1Var;
        java.lang.Object[] objArr;
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(convList, "convList");
        com.tencent.mars.xlog.Log.i("TaskManager", "startRestore, pkgId=" + pkgInfo.f215829d + ", convList.size = " + convList.size());
        co1.g gVar = co1.g.f43768a;
        synchronized (co1.g.f43778k) {
            list = null;
            objArr = 0;
            co1.g.f43777j = null;
        }
        synchronized (c()) {
            qo1.j1 j1Var = f365523a;
            java.util.Map.Entry c17 = fo1.f.c(j1Var.c(), qo1.i1.f365520d);
            if (c17 != null) {
                qo1.j0 j0Var = (qo1.j0) c17.getValue();
                com.tencent.mars.xlog.Log.e("TaskManager", "Fail to launch a restore task. A task is running on current device, pkgId=" + j0Var.a() + '.');
                return j0Var instanceof qo1.c1 ? qo1.d1.f365465f : qo1.d1.f365466g;
            }
            if (convList.isEmpty()) {
                qo1.j0 j0Var2 = (qo1.j0) j1Var.c().get(java.lang.Long.valueOf(pkgInfo.f215829d));
                if (j0Var2 != null && (j0Var2 instanceof qo1.c1)) {
                    com.tencent.mars.xlog.Log.i("TaskManager", "Launch restore task from cache");
                    j0Var2.start();
                    d1Var = qo1.d1.f365463d;
                    return d1Var;
                }
                qo1.c1 c1Var = new qo1.c1(pkgInfo, list, 2, objArr == true ? 1 : 0);
                com.tencent.mars.xlog.Log.i("TaskManager", "create new restore task. task=" + c1Var.hashCode());
                j1Var.c().put(java.lang.Long.valueOf(c1Var.f365483i), c1Var);
                c1Var.start();
            } else {
                qo1.c1 c1Var2 = new qo1.c1(pkgInfo, convList);
                com.tencent.mars.xlog.Log.i("TaskManager", "create new restore task with specific convs. task=" + c1Var2.hashCode());
                j1Var.c().put(java.lang.Long.valueOf(c1Var2.f365483i), c1Var2);
                c1Var2.start();
            }
            d1Var = qo1.d1.f365463d;
            return d1Var;
        }
    }

    public final jz5.f0 i(long j17) {
        jz5.f0 f0Var;
        synchronized (c()) {
            com.tencent.mars.xlog.Log.i("TaskManager", "stopRoamTask, packageId = " + j17);
            qo1.j0 j0Var = (qo1.j0) f365523a.c().get(java.lang.Long.valueOf(j17));
            if (j0Var != null) {
                j0Var.stop();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
        }
        return f0Var;
    }
}
