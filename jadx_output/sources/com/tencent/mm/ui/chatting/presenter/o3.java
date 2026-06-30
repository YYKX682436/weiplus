package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class o3 extends com.tencent.mm.ui.chatting.presenter.y {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f202404v = {1040187441, 1409286193, 1442840625};

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f202405w = {"msgId", "type", "createTime", "talker", "content", "isSend", "imgPath", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202406s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f202407t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f202408u;

    public o3(android.content.Context context) {
        super(context);
        this.f202406s = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f202407t = new java.util.concurrent.ConcurrentHashMap();
        this.f202408u = new java.util.concurrent.ConcurrentHashMap();
    }

    public static java.util.Map p(com.tencent.mm.ui.chatting.presenter.o3 o3Var, java.util.List list) {
        o3Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        if (!list.isEmpty() && !o3Var.f202406s.get()) {
            java.lang.String X8 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).X8(o3Var.f202542e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            for (int i18 = 0; i18 < 10; i18++) {
                if (i18 > 0) {
                    sb6.append(",");
                }
                sb6.append(f202405w[i18]);
            }
            java.lang.String[] strArr = {"SELECT " + ((java.lang.Object) sb6) + " FROM " + X8 + " WHERE msgId IN (", ")"};
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[1];
            int size = ((list.size() + 100) - 1) / 100;
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(size);
            while (i17 < list.size()) {
                int i19 = i17 + 100;
                int min = java.lang.Math.min(i19, list.size());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                for (int i27 = i17; i27 < min; i27++) {
                    if (i27 > i17) {
                        sb7.append(",");
                    }
                    sb7.append(list.get(i27));
                }
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.s3(o3Var, str + sb7.toString() + str2, concurrentHashMap, countDownLatch));
                i17 = i19;
            }
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicHistoryListPresenter", "[perf] batchRawQuery:%dms, batches:%d, msgIds:%d, found:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(concurrentHashMap.size()));
        }
        return concurrentHashMap;
    }

    public static void q(com.tencent.mm.ui.chatting.presenter.o3 o3Var, java.util.List list, java.util.Map map, com.tencent.mm.storage.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue) {
        o3Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (list.isEmpty() || o3Var.f202406s.get()) {
            return;
        }
        int size = list.size();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(((size + 50) - 1) / 50);
        int i17 = 0;
        while (i17 < size) {
            int i18 = i17 + 50;
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.t3(o3Var, i17, java.lang.Math.min(i18, size), list, map, a3Var, concurrentLinkedQueue, countDownLatch));
            i17 = i18;
        }
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicHistoryListPresenter", "[perf] Phase1c-parse:%dms, validItems:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(concurrentLinkedQueue.size()));
    }

    public static com.tencent.mm.ui.chatting.presenter.a4 r(com.tencent.mm.ui.chatting.presenter.o3 o3Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.a3 a3Var) {
        o3Var.getClass();
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            return null;
        }
        int i17 = v17.f348666i;
        if (!(3 == i17 || i17 == 76 || i17 == 92)) {
            return null;
        }
        java.lang.String j17 = o3Var.j(f9Var, com.tencent.mm.storage.z3.R4(o3Var.f202542e), false);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j17, true);
        java.lang.String z07 = a3Var != null ? a3Var.z0(j17) : "";
        com.tencent.mm.ui.chatting.presenter.a4 a4Var = new com.tencent.mm.ui.chatting.presenter.a4(null);
        a4Var.f202109a = f9Var;
        a4Var.f202110b = v17;
        if (n17 != null) {
            j17 = n17.d1();
        }
        a4Var.f202111c = j17;
        a4Var.f202112d = n17 != null ? n17.f2() : "";
        a4Var.f202113e = n17 != null ? n17.w0() : "";
        a4Var.f202114f = z07;
        return a4Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f202543f.P(z17);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.q3(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f202541d.getString(com.tencent.mm.R.string.f489989hp);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.ui.chatting.presenter.c4(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489595d34, viewGroup, false));
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void d(androidx.recyclerview.widget.k3 k3Var, int i17, int i18) {
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 e(android.view.ViewGroup viewGroup, int i17) {
        return null;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void f(com.tencent.mm.ui.chatting.adapter.e0 e0Var, int i17, int i18) {
        com.tencent.mm.ui.chatting.presenter.c4 c4Var = (com.tencent.mm.ui.chatting.presenter.c4) e0Var;
        com.tencent.mm.ui.chatting.presenter.b4 b4Var = (com.tencent.mm.ui.chatting.presenter.b4) h(i17);
        if (b4Var == null) {
            return;
        }
        c4Var.f198403f.setText(com.tencent.mm.plugin.fav.ui.w6.c(this.f202541d, b4Var.f198408a));
        long j17 = b4Var.f198411d;
        c4Var.f202149n = j17;
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap m07 = m11.b1.Di().m0(null, b4Var.f202129l, i65.a.g(this.f202541d), false);
        if (m07 == null || m07.isRecycled()) {
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(b4Var.f202127j, 1, i65.a.g(this.f202541d));
            if (Di == null || Di.isRecycled()) {
                c4Var.f202147i.setImageResource(com.tencent.mm.R.raw.app_attach_file_icon_webpage);
            } else {
                c4Var.f202147i.setImageBitmap(Di);
            }
        } else {
            c4Var.f202147i.setImageBitmap(m07);
        }
        java.lang.String str = (java.lang.String) this.f202408u.get(java.lang.Long.valueOf(j17));
        if (str != null) {
            android.widget.TextView textView = c4Var.f202148m;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            textView.setText(str);
            c4Var.i(c4Var.f202148m, this.f202544g.f198433e);
        } else {
            android.widget.TextView textView2 = c4Var.f202148m;
            java.lang.String str2 = b4Var.f202132o;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            textView2.setText(str2);
        }
        java.lang.String str3 = b4Var.f202130m;
        java.lang.String str4 = b4Var.f202131n;
        java.lang.String str5 = b4Var.f202132o;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.z3(this, str3, str4, str5, j17, b4Var, c4Var));
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f202541d.getString(com.tencent.mm.R.string.f489989hp);
    }

    @Override // zb5.h
    public int getType() {
        return 3;
    }

    @Override // zb5.h
    public com.tencent.mm.ui.chatting.adapter.i0 i() {
        return new com.tencent.mm.ui.chatting.presenter.x3(this);
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y
    public int k() {
        return 4;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y, com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202406s.set(true);
        super.onDetach();
    }
}
