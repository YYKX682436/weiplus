package so2;

/* loaded from: classes2.dex */
public final class i1 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f410416d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f410417e;

    /* renamed from: f, reason: collision with root package name */
    public final long f410418f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f410419g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f410420h;

    public i1() {
        ae2.in inVar = ae2.in.f3688a;
        this.f410420h = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3872s3).getValue()).r()).intValue() == 0;
        this.f410416d = null;
        this.f410417e = new java.util.ArrayList();
        new java.util.ArrayList();
        this.f410418f = g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (((r3 == null || (r3 = r3.getLiveInfo()) == null || r3.getLong(0) != r8) ? false : true) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.f410417e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r0.next()
            so2.j5 r3 = (so2.j5) r3
            boolean r4 = r3 instanceof so2.j1
            if (r4 == 0) goto L33
            so2.j1 r3 = (so2.j1) r3
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f410439d
            r4 = 1
            if (r3 == 0) goto L2f
            r45.nw1 r3 = r3.getLiveInfo()
            if (r3 == 0) goto L2f
            long r5 = r3.getLong(r1)
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 != 0) goto L2f
            r3 = r4
            goto L30
        L2f:
            r3 = r1
        L30:
            if (r3 == 0) goto L33
            goto L34
        L33:
            r4 = r1
        L34:
            if (r4 == 0) goto L37
            goto L3b
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            r2 = -1
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.i1.a(long):int");
    }

    public final so2.j1 b(long j17) {
        java.lang.Object obj;
        r45.nw1 liveInfo;
        java.util.Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((so2.j1) obj).f410439d;
            boolean z17 = false;
            if (finderObject != null && (liveInfo = finderObject.getLiveInfo()) != null && liveInfo.getLong(0) == j17) {
                z17 = true;
            }
        }
        return (so2.j1) obj;
    }

    public final java.util.ArrayList c() {
        return this.f410417e;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof so2.i1 ? (so2.i1) obj : null) == null || this.f410418f != ((so2.i1) obj).f410418f) ? -1 : 0;
    }

    public final long e() {
        return this.f410418f;
    }

    public final java.util.ArrayList f() {
        try {
            java.util.ArrayList arrayList = this.f410417e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (obj instanceof so2.j1) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderFeedLiveList", "get liveList:" + e17.getMessage());
            return new java.util.ArrayList();
        }
    }

    public final long g() {
        java.util.Iterator it = this.f410417e.iterator();
        long j17 = io.flutter.embedding.android.KeyboardMap.kValueMask;
        while (it.hasNext()) {
            j17 &= ((so2.j5) it.next()).getItemId();
        }
        com.tencent.mars.xlog.Log.i("FinderFeedLiveList", "listId:" + j17);
        return j17;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410418f;
    }

    @Override // in5.c
    public int h() {
        return 2003;
    }

    public final java.util.ArrayList i(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (cm2.a.f43328a.t((com.tencent.mm.protocal.protobuf.FinderObject) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new so2.j1((com.tencent.mm.protocal.protobuf.FinderObject) it.next()));
        }
        return new java.util.ArrayList(arrayList2);
    }

    public final void j(int i17) {
        java.util.ArrayList arrayList = this.f410417e;
        if (i17 >= 0 && i17 < arrayList.size()) {
            arrayList.remove(i17);
        }
        if (f().isEmpty()) {
            arrayList.clear();
            com.tencent.mars.xlog.Log.i("FinderFeedLiveList", "removeItem clear list!");
        }
    }

    public final void k() {
        if (this.f410420h) {
            java.util.ArrayList arrayList = this.f410417e;
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                kotlin.jvm.internal.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.o.f(next, "next(...)");
                    if (((so2.j5) next) instanceof so2.m1) {
                        it.remove();
                    }
                }
                if (f().size() > 0) {
                    arrayList.add(new so2.m1());
                }
            }
        }
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = this.f410417e;
        int size = arrayList.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveListId,size:" + size + ':');
        for (int i17 = 0; i17 < size; i17++) {
            so2.j5 j5Var = (so2.j5) arrayList.get(i17);
            if (j5Var instanceof so2.j1) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[index:");
                sb7.append(i17);
                sb7.append(",username:");
                so2.j1 j1Var = (so2.j1) j5Var;
                sb7.append(j1Var.f410439d.getNickname());
                sb7.append(",feedId:");
                sb7.append(j1Var.f410439d.getId());
                sb7.append(",liveId:");
                r45.nw1 liveInfo = j1Var.f410439d.getLiveInfo();
                sb7.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
                sb7.append("，friendLikeCount:");
                sb7.append(j1Var.f410439d.getFriendLikeCount());
                sb7.append(']');
                sb6.append(sb7.toString());
            } else {
                sb6.append("[index:" + i17 + ",feedId:" + j5Var.getItemId() + ']');
            }
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }

    public i1(r45.ww2 finderStreamCard) {
        kotlin.jvm.internal.o.g(finderStreamCard, "finderStreamCard");
        ae2.in inVar = ae2.in.f3688a;
        this.f410420h = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3872s3).getValue()).r()).intValue() == 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f410417e = arrayList;
        new java.util.ArrayList();
        java.util.LinkedList list = finderStreamCard.getList(4);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        arrayList.addAll(i(list));
        k();
        this.f410416d = finderStreamCard.getByteString(6);
        this.f410418f = g();
        this.f410419g = finderStreamCard.getBoolean(10);
    }
}
