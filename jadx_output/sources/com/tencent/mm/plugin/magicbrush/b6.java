package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes7.dex */
public final class b6 extends i95.w implements com.tencent.mm.plugin.magicbrush.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f147880d = jz5.h.b(com.tencent.mm.plugin.magicbrush.a6.f147845d);

    public jc3.j0 wi(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        pc3.m mVar = (pc3.m) ((jz5.n) this.f147880d).getValue();
        mVar.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (jc3.u0.f298996a.a(bizName)) {
            com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "create Biz with dynamic bizName: ".concat(bizName));
        }
        java.lang.String str2 = bizName + '-' + ((java.lang.Number) ((jz5.n) mVar.f353387f).getValue()).intValue() + '.' + android.os.SystemClock.uptimeMillis();
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("MagicBrush_" + str2, 5);
        a17.start();
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "createBiz " + str2);
        rc3.w0 w0Var = new rc3.w0(mVar.f353382a, str2, a17, new pc3.i(mVar), new pc3.j(mVar));
        mVar.f353383b.put(str2, w0Var);
        com.tencent.mm.plugin.magicbrush.a5 a5Var = com.tencent.mm.plugin.magicbrush.a5.f147836a;
        java.util.Set set = com.tencent.mm.plugin.magicbrush.a5.f147842g;
        synchronized (set) {
            set.add(str2);
            com.tencent.mm.plugin.magicbrush.a5.f147841f = a5Var.a(set);
        }
        com.tencent.mm.plugin.magicbrush.n4 n4Var = mVar.f353385d;
        if (n4Var != null) {
            w0Var.T(new rc3.f0(w0Var, n4Var));
        }
        return w0Var;
    }
}
