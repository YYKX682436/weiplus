package q71;

/* loaded from: classes15.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public s71.a f360339a = new s71.a();

    /* renamed from: b, reason: collision with root package name */
    public boolean f360340b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f360341c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f360342d = new java.util.ArrayList();

    public s71.b a(int i17) {
        for (int i18 = 0; i18 < this.f360339a.f403969d.size(); i18++) {
            s71.b bVar = (s71.b) this.f360339a.f403969d.get(i18);
            if (bVar.f403970d == i17) {
                return bVar;
            }
        }
        return null;
    }

    public com.tencent.mm.plugin.address.model.RcptItem b(java.util.List list, java.lang.String str) {
        if (list == null || list.isEmpty() || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.tencent.mm.plugin.address.model.RcptItem rcptItem = (com.tencent.mm.plugin.address.model.RcptItem) list.get(i17);
            if (rcptItem != null && str.startsWith(rcptItem.f74371d)) {
                return rcptItem;
            }
        }
        return null;
    }

    public com.tencent.mm.plugin.address.model.RcptItem c(int i17) {
        return (com.tencent.mm.plugin.address.model.RcptItem) this.f360341c.get(java.lang.Integer.valueOf(i17));
    }

    public java.util.List d(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f360342d).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.address.model.RcptItem rcptItem = (com.tencent.mm.plugin.address.model.RcptItem) it.next();
            if (rcptItem.f74375h == i17) {
                arrayList.add(rcptItem);
            }
        }
        return arrayList;
    }

    public java.util.List e(java.lang.String str) {
        return d(com.tencent.mm.sdk.platformtools.t8.K0(str) ? 0 : str.hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0070 A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #2 {Exception -> 0x006c, blocks: (B:128:0x0068, B:121:0x0070), top: B:127:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0088 A[Catch: Exception -> 0x0084, TRY_LEAVE, TryCatch #14 {Exception -> 0x0084, blocks: (B:143:0x0080, B:134:0x0088), top: B:142:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q71.f0.f():void");
    }

    public void g() {
        try {
            qg0.b0 b0Var = (qg0.b0) i95.n0.c(qg0.b0.class);
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_ADDRESS_INFO_STRING_SYNC;
            ((pg0.a3) b0Var).getClass();
            java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(u3Var, null);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            this.f360339a = (s71.a) new s71.a().parseFrom(str.getBytes(r26.c.f368867c));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletAddrMgr", e17, "", new java.lang.Object[0]);
        }
    }

    public com.tencent.mm.plugin.address.model.RcptItem h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.address.model.RcptItem b17;
        com.tencent.mm.plugin.address.model.RcptItem b18;
        com.tencent.mm.plugin.address.model.RcptItem b19;
        com.tencent.mm.plugin.address.model.RcptItem b27;
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && (b17 = b(d(0), str)) != null) {
            java.lang.String str5 = b17.f74372e;
            if (!android.text.TextUtils.isEmpty(str5) && (b18 = b(e(str5), str2)) != null) {
                java.lang.String str6 = b18.f74372e;
                if (!android.text.TextUtils.isEmpty(str6)) {
                    return (android.text.TextUtils.isEmpty(str3) || (b19 = b(e(str6), str3)) == null) ? b18 : (android.text.TextUtils.isEmpty(str4) || (b27 = b(e(b19.f74372e), str4)) == null) ? b19 : b27;
                }
            }
        }
        return null;
    }

    public void i() {
        try {
            byte[] byteArray = this.f360339a.toByteArray();
            java.lang.System.currentTimeMillis();
            qg0.b0 b0Var = (qg0.b0) i95.n0.c(qg0.b0.class);
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_ADDRESS_INFO_STRING_SYNC;
            java.lang.String str = new java.lang.String(byteArray, r26.c.f368867c);
            ((pg0.a3) b0Var).getClass();
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(u3Var, str);
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletAddrMgr", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        if ((r0.f74374g == 3) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(java.util.LinkedList r8) {
        /*
            r7 = this;
            s71.a r0 = r7.f360339a
            java.util.LinkedList r0 = r0.f403969d
            r0.clear()
            java.util.Iterator r8 = r8.iterator()
        Lb:
            boolean r0 = r8.hasNext()
            r1 = 1
            if (r0 == 0) goto La9
            java.lang.Object r0 = r8.next()
            r45.zi5 r0 = (r45.zi5) r0
            s71.b r2 = new s71.b
            r2.<init>()
            int r3 = r0.f392109d
            r2.f403970d = r3
            r45.du5 r3 = r0.f392118p
            java.lang.String r3 = r3.f372756d
            r2.f403979p = r3
            r45.du5 r3 = r0.f392112g
            java.lang.String r3 = r3.f372756d
            r2.f403973g = r3
            r45.du5 r4 = r0.f392115m
            java.lang.String r4 = r4.f372756d
            r2.f403976m = r4
            r45.du5 r4 = r0.f392113h
            java.lang.String r4 = r4.f372756d
            r2.f403974h = r4
            r45.du5 r5 = r0.f392116n
            java.lang.String r5 = r5.f372756d
            r2.f403977n = r5
            r45.du5 r5 = r0.f392117o
            java.lang.String r5 = r5.f372756d
            r2.f403978o = r5
            r45.du5 r5 = r0.f392111f
            java.lang.String r5 = r5.f372756d
            r2.f403972f = r5
            r45.du5 r6 = r0.f392114i
            java.lang.String r6 = r6.f372756d
            r2.f403975i = r6
            r45.du5 r6 = r0.f392119q
            java.lang.String r6 = r6.f372756d
            r2.f403980q = r6
            r45.du5 r0 = r0.f392120r
            java.lang.String r0 = r0.f372756d
            r2.f403981r = r0
            com.tencent.mm.plugin.address.model.RcptItem r0 = r7.h(r5, r3, r4, r6)
            if (r0 == 0) goto L71
            java.lang.String r3 = r2.f403979p
            if (r3 == 0) goto L6d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L71
        L6d:
            java.lang.String r3 = r0.f74372e
            r2.f403979p = r3
        L71:
            if (r0 == 0) goto L7c
            int r0 = r0.f74374g
            r3 = 3
            if (r0 != r3) goto L79
            goto L7a
        L79:
            r1 = 0
        L7a:
            if (r1 == 0) goto L9c
        L7c:
            java.lang.String r0 = r2.f403974h
            if (r0 == 0) goto L88
            java.lang.String r1 = r2.f403980q
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9c
        L88:
            java.lang.String r0 = "undefined"
            java.lang.String r1 = r2.f403980q
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "null"
            java.lang.String r1 = r2.f403980q
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto La0
        L9c:
            java.lang.String r0 = ""
            r2.f403980q = r0
        La0:
            s71.a r0 = r7.f360339a
            java.util.LinkedList r0 = r0.f403969d
            r0.add(r2)
            goto Lb
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q71.f0.j(java.util.LinkedList):boolean");
    }
}
