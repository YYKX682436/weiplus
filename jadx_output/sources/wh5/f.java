package wh5;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static long f446053b;

    /* renamed from: a, reason: collision with root package name */
    public static final wh5.f f446052a = new wh5.f();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f446054c = new java.util.HashMap();

    public final boolean a() {
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigC2CLiveImagePreview()) == 1)) {
            return false;
        }
        ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
        return qp.b.f365678e;
    }

    public final boolean b(com.tencent.mm.storage.f9 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.HashMap hashMap = f446054c;
        java.lang.Boolean bool = (java.lang.Boolean) hashMap.get(java.lang.Long.valueOf(msg.getMsgId()));
        if (bool != null) {
            return bool.booleanValue();
        }
        int Zi = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Zi(msg);
        boolean z17 = false;
        if (Zi > 0) {
            com.tencent.mars.xlog.Log.i("C2CLiveHelper", "msg(" + msg.getMsgId() + "): isExpiredLiveInternal: false, remainDays: " + Zi);
        } else {
            ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).getClass();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(msg);
            java.lang.String str2 = "";
            if (S1 == null || S1.f322633a <= 0) {
                str = "";
            } else {
                java.lang.String str3 = S1.f322637e;
                if (S1.j()) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(S1.f322649q));
                    if (C1.f322633a == S1.f322649q) {
                        str2 = C1.f322637e;
                    }
                }
                str = str2;
                str2 = str3;
            }
            bm5.b0 a17 = bm5.b0.f22531e.a(msg, str2, str);
            boolean z18 = com.tencent.mm.vfs.w6.j(bm5.b0.a(a17, bm5.f0.f22563h, false, 2, null)) && com.tencent.mm.vfs.w6.j(bm5.b0.a(a17, bm5.f0.f22568p, false, 2, null));
            boolean z19 = com.tencent.mm.vfs.w6.j(bm5.b0.a(a17, bm5.f0.f22562g, false, 2, null)) && com.tencent.mm.vfs.w6.j(bm5.b0.a(a17, bm5.f0.f22569q, false, 2, null));
            if (!z18 && !z19) {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("C2CLiveHelper", "msg(" + msg.getMsgId() + "): isExpiredLiveInternal: " + z17 + ", hasMiddleRes: " + z18 + " hasHdRes: " + z19);
        }
        hashMap.put(java.lang.Long.valueOf(msg.getMsgId()), java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
