package mm2;

/* loaded from: classes10.dex */
public final class v4 extends mm2.e {

    /* renamed from: p, reason: collision with root package name */
    public static final mm2.q4 f329475p = new mm2.q4(null);

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f329476f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329477g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f329478h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329479i;

    /* renamed from: m, reason: collision with root package name */
    public mm2.r4 f329480m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329481n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f329482o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329476f = "Finder.LiveMilestoneLotterySlice";
        this.f329477g = kotlinx.coroutines.flow.i3.a(null);
        this.f329478h = new java.util.concurrent.ConcurrentHashMap();
        this.f329479i = kotlinx.coroutines.flow.i3.a(null);
        this.f329481n = kotlinx.coroutines.flow.i3.a(null);
    }

    public final void N6(r45.f02 f02Var, java.lang.String str) {
        r45.l30 l30Var;
        r45.l30 l30Var2;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.Object obj;
        java.util.LinkedList linkedList3;
        java.lang.Object obj2;
        java.lang.String str2 = f02Var.f373878d;
        boolean z17 = str2 == null || str2.length() == 0;
        java.lang.String str3 = this.f329476f;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str3, "addOrReplaceLotteryInfo lotteryId empty");
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f329478h;
        r45.f02 f02Var2 = (r45.f02) concurrentHashMap.get(str2);
        if (f02Var2 != null) {
            com.tencent.mars.xlog.Log.i(str3, str + ", addOrReplaceLotteryInfo replace");
        } else {
            com.tencent.mars.xlog.Log.i(str3, str + ", addOrReplaceLotteryInfo add");
        }
        if (f02Var2 == null) {
            com.tencent.mars.xlog.Log.i(str3, "diffLotteryInfo prev is null");
        } else {
            if (pm0.v.z(f02Var2.f373881g, 1)) {
                f02Var.f373881g |= 1;
            }
            r45.tl4 tl4Var = f02Var2.f373879e;
            r45.tl4 tl4Var2 = f02Var.f373879e;
            if (tl4Var != null && tl4Var2 != null && tl4Var2.f386550i < tl4Var.f386550i) {
                com.tencent.mars.xlog.Log.i(str3, "curBaseInfo.participate_count " + tl4Var2.f386550i + " < preBaseInfo.participate_count " + tl4Var.f386550i);
                tl4Var2.f386550i = tl4Var.f386550i;
            }
            r45.sl4 sl4Var = f02Var2.f373882h;
            java.lang.Object obj3 = null;
            if (sl4Var == null || (linkedList3 = sl4Var.f385833f) == null) {
                l30Var = null;
            } else {
                java.util.Iterator it = linkedList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((r45.l30) obj2).getInteger(2) > 0) {
                            break;
                        }
                    }
                }
                l30Var = (r45.l30) obj2;
            }
            r45.sl4 sl4Var2 = f02Var.f373882h;
            if (sl4Var2 == null || (linkedList2 = sl4Var2.f385833f) == null) {
                l30Var2 = null;
            } else {
                java.util.Iterator it6 = linkedList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (((r45.l30) obj).getInteger(2) > 0) {
                            break;
                        }
                    }
                }
                l30Var2 = (r45.l30) obj;
            }
            if (l30Var != null && l30Var2 == null) {
                r45.sl4 sl4Var3 = f02Var.f373882h;
                if (sl4Var3 != null && (linkedList = sl4Var3.f385833f) != null) {
                    java.util.Iterator it7 = linkedList.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it7.next();
                        if (((r45.l30) next).getInteger(0) == l30Var.getInteger(0)) {
                            obj3 = next;
                            break;
                        }
                    }
                    r45.l30 l30Var3 = (r45.l30) obj3;
                    if (l30Var3 != null) {
                        l30Var3.set(2, java.lang.Integer.valueOf(l30Var.getInteger(2)));
                        if (l30Var3.getInteger(3) < l30Var.getInteger(3)) {
                            com.tencent.mars.xlog.Log.i(str3, "current.select_count " + l30Var3.getInteger(3) + " < preVotedChoice.select_count " + l30Var.getInteger(3));
                            l30Var3.set(3, java.lang.Integer.valueOf(l30Var.getInteger(3)));
                        }
                    }
                }
            } else if (l30Var != null && l30Var2 != null && l30Var2.getInteger(3) < l30Var.getInteger(3)) {
                com.tencent.mars.xlog.Log.i(str3, "current2.select_count " + l30Var2.getInteger(3) + " < preVotedChoice.select_count " + l30Var.getInteger(3));
                l30Var2.set(3, java.lang.Integer.valueOf(l30Var.getInteger(3)));
            }
        }
        if (f02Var2 != null) {
            mm2.w4.a(f02Var2, str3, "addOrReplaceLotteryInfo prev,");
        }
        mm2.w4.a(f02Var, str3, "addOrReplaceLotteryInfo cur,");
        concurrentHashMap.put(str2, f02Var);
    }

    public final java.lang.Object O6(java.lang.String lotteryId) {
        kotlin.jvm.internal.o.g(lotteryId, "lotteryId");
        java.util.HashMap hashMap = this.f329482o;
        if (hashMap != null) {
            return hashMap.get(lotteryId);
        }
        return null;
    }

    public final mm2.r4 P6() {
        mm2.r4 r4Var;
        synchronized (this) {
            r4Var = this.f329480m;
        }
        return r4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q6(java.lang.String r20, android.content.Context r21, boolean r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.v4.Q6(java.lang.String, android.content.Context, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void R6(r45.g02 g02Var, java.lang.String tag, java.lang.String prefix) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(g02Var, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveMilestoneLotteryMetaInfo logInfo ");
        sb6.append(prefix);
        sb6.append(" wording:");
        sb6.append(g02Var.f374769e);
        sb6.append(", title:");
        sb6.append(g02Var.f374772h);
        sb6.append(", description:");
        sb6.append(g02Var.f374773i);
        sb6.append(", color infos = ");
        java.util.LinkedList<r45.ql4> linkedList = g02Var.f374775n;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.ql4 ql4Var : linkedList) {
                arrayList.add(ql4Var.f384087d + ": " + ql4Var.f384088e);
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        java.util.LinkedList<r45.dm4> infos = g02Var.f374768d;
        kotlin.jvm.internal.o.f(infos, "infos");
        for (r45.dm4 dm4Var : infos) {
            com.tencent.mars.xlog.Log.i(tag, prefix + " infos, title:" + dm4Var.f372569d + ", button_status:" + dm4Var.f372572g + ", is_reserved:" + dm4Var.f372574i + ", is_attended:" + dm4Var.f372576n + ", sub_title:" + dm4Var.f372570e + ", start_time:" + dm4Var.f372571f + ", notice_id:" + dm4Var.f372573h + ", lottery_id:" + dm4Var.f372575m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r45.l30 S6(java.lang.String lotteryId, java.lang.Integer num) {
        r45.dm4 dm4Var;
        r45.sl4 sl4Var;
        java.util.LinkedList linkedList;
        r45.tl4 tl4Var;
        java.util.LinkedList linkedList2;
        java.lang.Object obj;
        java.lang.String str = this.f329476f;
        com.tencent.mars.xlog.Log.i(str, "participateLottery lottery:" + lotteryId + ", choiceId:" + num);
        r45.l30 l30Var = null;
        if (lotteryId == null || lotteryId.length() == 0) {
            com.tencent.mm.sdk.platformtools.Log.c(str, "participateLottery lotteryId empty", new java.lang.Object[0]);
            return null;
        }
        r45.g02 g02Var = (r45.g02) ((kotlinx.coroutines.flow.h3) this.f329477g).getValue();
        if (g02Var == null || (linkedList2 = g02Var.f374768d) == null) {
            dm4Var = null;
        } else {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.dm4) obj).f372575m, lotteryId)) {
                    break;
                }
            }
            dm4Var = (r45.dm4) obj;
        }
        if (dm4Var != null) {
            dm4Var.f372576n = 1;
        }
        kotlin.jvm.internal.o.g(lotteryId, "lotteryId");
        r45.f02 f02Var = (r45.f02) this.f329478h.get(lotteryId);
        if (f02Var != null) {
            int i17 = f02Var.f373881g;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            f02Var.f373881g = i17 | 1;
        }
        if (f02Var != null && (tl4Var = f02Var.f373879e) != null) {
            tl4Var.f386550i++;
        }
        if (num == null) {
            if (f02Var != null) {
                mm2.w4.a(f02Var, str, "participateLottery");
            }
            return null;
        }
        if (f02Var != null && (sl4Var = f02Var.f373882h) != null && (linkedList = sl4Var.f385833f) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (((r45.l30) next).getInteger(0) == num.intValue()) {
                    l30Var = next;
                    break;
                }
            }
            l30Var = l30Var;
        }
        if (l30Var == null) {
            com.tencent.mars.xlog.Log.e(str, "participateLottery choiceId:" + num + " not exist");
        } else {
            l30Var.set(2, 1);
            l30Var.set(3, java.lang.Integer.valueOf(l30Var.getInteger(3) + 1));
        }
        if (f02Var != null) {
            mm2.w4.a(f02Var, str, "participateLottery");
        }
        return l30Var;
    }

    public final java.lang.Object T6(r45.gn3 gn3Var, java.lang.Class cls, kotlin.coroutines.Continuation continuation) {
        return f329475p.a(this.f329476f, ((mm2.c1) business(mm2.c1.class)).f328852o, ((mm2.e1) business(mm2.e1.class)).f328985o, ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) business(mm2.e1.class)).f328983m, gn3Var, cls, continuation);
    }

    public final void U6(r45.f02 lotteryInfo, boolean z17) {
        kotlin.jvm.internal.o.g(lotteryInfo, "lotteryInfo");
        N6(lotteryInfo, "getlivemsg");
        if (z17) {
            ((kotlinx.coroutines.flow.h3) this.f329481n).k(lotteryInfo);
        } else {
            ((kotlinx.coroutines.flow.h3) this.f329479i).k(lotteryInfo);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if ((r10 == null || r10.length() == 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0074, code lost:
    
        if ((r9 == null || r9.length() == 0) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(r45.g02 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.v4.V6(r45.g02, boolean):void");
    }

    public final void W6(java.lang.String lotteryId, java.lang.Object resultInfo) {
        kotlin.jvm.internal.o.g(lotteryId, "lotteryId");
        kotlin.jvm.internal.o.g(resultInfo, "resultInfo");
        java.util.HashMap hashMap = this.f329482o;
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        this.f329482o = hashMap;
        hashMap.put(lotteryId, resultInfo);
        com.tencent.mars.xlog.Log.i(this.f329476f, "setClaimed lotteryId:" + lotteryId + ',' + pm0.b0.g(resultInfo));
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        ((kotlinx.coroutines.flow.h3) this.f329477g).k(null);
        ((kotlinx.coroutines.flow.h3) this.f329479i).k(null);
        ((kotlinx.coroutines.flow.h3) this.f329481n).k(null);
        this.f329480m = null;
        this.f329478h.clear();
    }
}
