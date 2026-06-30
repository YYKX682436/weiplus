package vf0;

/* loaded from: classes12.dex */
public class k1 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf0.l1 f436212d;

    public k1(vf0.l1 l1Var) {
        this.f436212d = l1Var;
    }

    @Override // wf0.u1
    public void h(final wf0.r1 r1Var) {
        if (r1Var != null && r1Var.f445530b == wf0.s1.UPDATE && r1Var.f445532d == 4) {
            ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: vf0.k1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.List list;
                    java.util.List list2;
                    boolean equals;
                    vf0.k1 k1Var = vf0.k1.this;
                    wf0.r1 r1Var2 = r1Var;
                    k1Var.getClass();
                    java.lang.String str = r1Var2.f445529a;
                    if (str != null && str.contains(ya.b.ORIGIN)) {
                        str = str.substring(0, str.indexOf(ya.b.ORIGIN));
                    }
                    t21.v2 h17 = t21.d3.h(str);
                    if (h17 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ImportMultiVideoService", "notifyChanged, video info is null, file name = " + str);
                        return;
                    }
                    long j17 = h17.f415016n;
                    synchronized (k1Var.f436212d) {
                        list = (java.util.List) k1Var.f436212d.f436218d.get(java.lang.Long.valueOf(j17));
                        android.support.v4.media.f.a(k1Var.f436212d.f436220f.get(java.lang.Long.valueOf(j17)));
                        list2 = (java.util.List) k1Var.f436212d.f436219e.get(java.lang.Long.valueOf(j17));
                        equals = java.lang.Boolean.TRUE.equals(k1Var.f436212d.f436221g.get(java.lang.Long.valueOf(j17)));
                    }
                    if (list == null || !list.contains(str)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideoService", "notifyChanged, video is not in process, file name = " + str + " msg local id = " + j17);
                        return;
                    }
                    int i17 = h17.f415011i;
                    if (i17 != 199 && i17 != 198) {
                        if ((i17 == 104 || i17 == 103) && equals) {
                            t21.d3.z(str);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideoService", "video has been paused at remux process, pause upload now");
                            return;
                        }
                        return;
                    }
                    synchronized (k1Var) {
                        list.remove(h17.d());
                        com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideoService", "remove process, file name = " + h17.d() + " already in process = " + list);
                        if (list2 != null) {
                            list2.remove(h17.f());
                        }
                    }
                    if (list.size() == 0) {
                        synchronized (k1Var.f436212d) {
                            k1Var.f436212d.f436218d.remove(java.lang.Long.valueOf(j17));
                            k1Var.f436212d.f436220f.remove(java.lang.Long.valueOf(j17));
                            k1Var.f436212d.f436219e.remove(java.lang.Long.valueOf(j17));
                            if (k1Var.f436212d.f436220f.size() == 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideoService", "process list is empty. remove listener");
                            }
                        }
                    }
                }
            });
        }
    }
}
