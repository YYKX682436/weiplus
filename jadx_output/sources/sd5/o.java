package sd5;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f406720a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f406721b;

    /* renamed from: c, reason: collision with root package name */
    public final sd5.q f406722c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f406723d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f406724e;

    public o(java.lang.String talkUsername, yz5.a deleteCreateTimeGetter) {
        kotlin.jvm.internal.o.g(talkUsername, "talkUsername");
        kotlin.jvm.internal.o.g(deleteCreateTimeGetter, "deleteCreateTimeGetter");
        sd5.q qVar = sd5.q.f406726e;
        sd5.q qVar2 = sd5.q.f406726e;
        this.f406720a = talkUsername;
        this.f406721b = deleteCreateTimeGetter;
        this.f406722c = qVar2;
        this.f406723d = new java.util.ArrayList();
    }

    public final int a(int i17) {
        if (i17 > 0) {
            java.util.List list = this.f406723d;
            if (!((java.util.ArrayList) list).isEmpty()) {
                int min = java.lang.Math.min(i17, ((java.util.ArrayList) list).size());
                ((java.util.ArrayList) list).subList(0, min).clear();
                return min;
            }
        }
        return 0;
    }

    public final int b(long j17) {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().F2(this.f406720a, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(this.f406720a), j17);
    }

    public final long c() {
        return ((java.lang.Number) this.f406721b.invoke()).longValue();
    }

    public final long d() {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) kz5.n0.a0(this.f406723d, 0);
            m521constructorimpl = kotlin.Result.m521constructorimpl(f9Var != null ? java.lang.Long.valueOf(f9Var.T1()) : null);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Long l17 = (java.lang.Long) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
        if (l17 != null) {
            return l17.longValue();
        }
        return 0L;
    }

    public final long e() {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.util.List list = this.f406723d;
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) kz5.n0.a0(list, kz5.c0.h(list));
            m521constructorimpl = kotlin.Result.m521constructorimpl(f9Var != null ? java.lang.Long.valueOf(f9Var.T1()) : null);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Long l17 = (java.lang.Long) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
        if (l17 != null) {
            return l17.longValue();
        }
        return 9223372036854775806L;
    }

    public final boolean f() {
        return e() >= ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(this.f406720a);
    }

    public final java.util.List g() {
        this.f406722c.getClass();
        return h(16);
    }

    public final java.util.List h(int i17) {
        java.util.List list = this.f406723d;
        ((java.util.ArrayList) list).clear();
        this.f406724e = false;
        sd5.i iVar = sd5.i.f406719a;
        long c17 = c();
        java.lang.String talker = this.f406720a;
        kotlin.jvm.internal.o.g(talker, "talker");
        ((java.util.ArrayList) list).addAll(iVar.c(talker, i17, c17, 0L));
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new sd5.j());
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        arrayList2.size();
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(java.lang.String r21, long r22, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sd5.o.i(java.lang.String, long, boolean, boolean):java.util.List");
    }

    public final java.util.List j() {
        java.util.List list = this.f406723d;
        if (((java.util.ArrayList) list).isEmpty()) {
            list = g();
        } else {
            ((java.util.ArrayList) list).addAll(sd5.i.f406719a.b(this.f406720a, this.f406722c.f406728b, c(), ((com.tencent.mm.storage.f9) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1)).getCreateTime() + 1));
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new sd5.k());
            }
        }
        list.size();
        return list;
    }

    public final java.util.List k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmMsgDataSource", "loadMoreTop");
        java.util.List list = this.f406723d;
        if (((java.util.ArrayList) list).isEmpty()) {
            return g();
        }
        java.util.List c17 = sd5.i.f406719a.c(this.f406720a, this.f406722c.f406729c, c(), ((com.tencent.mm.storage.f9) ((java.util.ArrayList) list).get(0)).getCreateTime() - 1);
        if (((java.util.ArrayList) c17).isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MvvmMsgDataSource", "beforeList isEmpty!");
            this.f406724e = true;
        }
        ((java.util.ArrayList) list).addAll(c17);
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new sd5.l());
        }
        return list;
    }

    public final java.util.List l() {
        java.util.List d17 = sd5.i.f406719a.d(this.f406720a, c(), d(), ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(this.f406720a));
        java.util.List list = this.f406723d;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(d17);
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new sd5.m());
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        arrayList2.size();
        return arrayList2;
    }

    public final java.util.List m() {
        java.util.List d17 = sd5.i.f406719a.d(this.f406720a, c(), d(), e());
        java.util.List list = this.f406723d;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(d17);
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new sd5.n());
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        arrayList2.size();
        return arrayList2;
    }
}
