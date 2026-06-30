package ct2;

/* loaded from: classes3.dex */
public final class d extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.String f222242f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f222243g;

    /* renamed from: h, reason: collision with root package name */
    public zs2.e f222244h;

    /* renamed from: i, reason: collision with root package name */
    public zs2.d f222245i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f222246m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f222247n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f222248o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f222249p;

    /* renamed from: q, reason: collision with root package name */
    public int f222250q;

    /* renamed from: r, reason: collision with root package name */
    public r45.t71 f222251r;

    /* renamed from: s, reason: collision with root package name */
    public int f222252s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gk2.e liveBuContext) {
        super(liveBuContext);
        kotlin.jvm.internal.o.g(liveBuContext, "liveBuContext");
        this.f222242f = "";
        this.f222244h = new zs2.e(0L, 0, 0, false);
        this.f222246m = new java.util.concurrent.CopyOnWriteArrayList();
        this.f222247n = jz5.h.b(ct2.b.f222240d);
    }

    public final java.util.LinkedList N6() {
        return (java.util.LinkedList) ((jz5.n) this.f222247n).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void O6(int r24, boolean r25) {
        /*
            r23 = this;
            r1 = r23
            r0 = r25
            monitor-enter(r23)
            if (r0 != 0) goto L14
            boolean r2 = r1.f222243g     // Catch: java.lang.Throwable -> Lcc
            if (r2 == 0) goto L14
            java.lang.String r0 = "LiveMsgOffsetSlice"
            java.lang.String r2 = "getMessage invalid,message requesting!"
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r23)
            return
        L14:
            kotlin.jvm.internal.c0 r2 = new kotlin.jvm.internal.c0     // Catch: java.lang.Throwable -> Lcc
            r2.<init>()     // Catch: java.lang.Throwable -> Lcc
            r3 = 3
            r4 = 0
            r5 = 0
            r6 = 1
            if (r0 != 0) goto L2e
            r45.t71 r7 = r1.f222251r     // Catch: java.lang.Throwable -> Lcc
            if (r7 == 0) goto L28
            com.tencent.mm.protobuf.g r7 = r7.getByteString(r3)     // Catch: java.lang.Throwable -> Lcc
            goto L29
        L28:
            r7 = r5
        L29:
            if (r7 != 0) goto L2c
            goto L2e
        L2c:
            r7 = r4
            goto L2f
        L2e:
            r7 = r6
        L2f:
            r2.f310112d = r7     // Catch: java.lang.Throwable -> Lcc
            r1.f222243g = r6     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class<mm2.e1> r7 = mm2.e1.class
            androidx.lifecycle.c1 r7 = r1.business(r7)     // Catch: java.lang.Throwable -> Lcc
            mm2.e1 r7 = (mm2.e1) r7     // Catch: java.lang.Throwable -> Lcc
            r45.nw1 r7 = r7.f328988r     // Catch: java.lang.Throwable -> Lcc
            long r10 = r7.getLong(r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            r7.<init>()     // Catch: java.lang.Throwable -> Lcc
            r7.append(r10)     // Catch: java.lang.Throwable -> Lcc
            r8 = 45
            r7.append(r8)     // Catch: java.lang.Throwable -> Lcc
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lcc
            r7.append(r8)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lcc
            r1.f222242f = r7     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class<mm2.c1> r7 = mm2.c1.class
            androidx.lifecycle.c1 r7 = r1.business(r7)     // Catch: java.lang.Throwable -> Lcc
            mm2.c1 r7 = (mm2.c1) r7     // Catch: java.lang.Throwable -> Lcc
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.f328846n     // Catch: java.lang.Throwable -> Lcc
            if (r7 == 0) goto L6d
            java.lang.String r7 = r7.getUsername()     // Catch: java.lang.Throwable -> Lcc
            if (r7 != 0) goto L6f
        L6d:
            java.lang.String r7 = ""
        L6f:
            r9 = r7
            java.lang.Class<mm2.e1> r7 = mm2.e1.class
            androidx.lifecycle.c1 r7 = r1.business(r7)     // Catch: java.lang.Throwable -> Lcc
            mm2.e1 r7 = (mm2.e1) r7     // Catch: java.lang.Throwable -> Lcc
            long r12 = r7.f328983m     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class<mm2.e1> r7 = mm2.e1.class
            androidx.lifecycle.c1 r7 = r1.business(r7)     // Catch: java.lang.Throwable -> Lcc
            mm2.e1 r7 = (mm2.e1) r7     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r14 = r7.f328992v     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class<mm2.e1> r7 = mm2.e1.class
            androidx.lifecycle.c1 r7 = r1.business(r7)     // Catch: java.lang.Throwable -> Lcc
            mm2.e1 r7 = (mm2.e1) r7     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r15 = r7.f328984n     // Catch: java.lang.Throwable -> Lcc
            r45.qt2 r18 = new r45.qt2     // Catch: java.lang.Throwable -> Lcc
            r18.<init>()     // Catch: java.lang.Throwable -> Lcc
            int r7 = r1.f222252s     // Catch: java.lang.Throwable -> Lcc
            boolean r8 = r2.f310112d     // Catch: java.lang.Throwable -> Lcc
            if (r8 != 0) goto L9c
            r20 = r6
            goto L9e
        L9c:
            r20 = r4
        L9e:
            if (r8 == 0) goto La3
        La0:
            r21 = r5
            goto Lac
        La3:
            r45.t71 r4 = r1.f222251r     // Catch: java.lang.Throwable -> Lcc
            if (r4 == 0) goto La0
            com.tencent.mm.protobuf.g r5 = r4.getByteString(r3)     // Catch: java.lang.Throwable -> Lcc
            goto La0
        Lac:
            java.lang.String r3 = r1.f222242f     // Catch: java.lang.Throwable -> Lcc
            db2.y0 r4 = new db2.y0     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r17 = ""
            r8 = r4
            r16 = r7
            r19 = r24
            r22 = r3
            r8.<init>(r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> Lcc
            pq5.g r3 = r4.l()     // Catch: java.lang.Throwable -> Lcc
            ct2.a r4 = new ct2.a     // Catch: java.lang.Throwable -> Lcc
            r5 = r24
            r4.<init>(r1, r5, r0, r2)     // Catch: java.lang.Throwable -> Lcc
            pm0.v.T(r3, r4)     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r23)
            return
        Lcc:
            r0 = move-exception
            monitor-exit(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ct2.d.O6(int, boolean):void");
    }

    public final void P6(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ReplayMsgInfo:");
        sb6.append(str);
        sb6.append(" msg size:");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f222246m;
        sb6.append(copyOnWriteArrayList.size());
        sb6.append("(second:");
        r45.b53 b53Var = (r45.b53) kz5.n0.Z(copyOnWriteArrayList);
        sb6.append(b53Var != null ? b53Var.getInteger(0) : 0);
        sb6.append('~');
        r45.b53 b53Var2 = (r45.b53) kz5.n0.k0(copyOnWriteArrayList);
        sb6.append(b53Var2 != null ? b53Var2.getInteger(0) : 0);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("LiveMsgOffsetSlice", sb6.toString());
    }

    public final void Q6(int i17) {
        if (i17 != this.f222250q) {
            com.tencent.mars.xlog.Log.i("LiveMsgOffsetSlice", "startOffsetSec from:" + this.f222250q + " to " + i17);
            this.f222250q = i17;
        }
    }

    public final void R6(int i17, boolean z17) {
        boolean z18 = ((ct2.j) business(ct2.j.class)).D;
        int i18 = this.f222244h.f475254c;
        com.tencent.mars.xlog.Log.i("LiveMsgOffsetSlice", "tryGetMessage playerOffsetSecond:" + i17 + "(total:" + i18 + "),force:" + z17 + ",replayTransitioning:" + z18);
        if (i17 < 0 || z18) {
            return;
        }
        if (z17) {
            O6(i17, z17);
            return;
        }
        r45.b53 b53Var = (r45.b53) kz5.n0.k0(this.f222246m);
        boolean z19 = false;
        int integer = b53Var != null ? b53Var.getInteger(0) : 0;
        int i19 = integer - i17;
        if (i19 >= 0 && i19 < 3) {
            if (1 <= integer && integer < i18) {
                z19 = true;
            }
            if (z19) {
                O6(integer + 1, z17);
            }
        }
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        com.tencent.mars.xlog.Log.i("LiveMsgOffsetSlice", "onCleared");
        this.f222242f = "";
        this.f222243g = false;
        this.f222246m.clear();
        N6().clear();
        this.f222245i = null;
        com.tencent.mars.xlog.Log.i("LiveMsgOffsetSlice", "set offsetMsgInfo last buffer to null!");
        this.f222251r = null;
    }
}
