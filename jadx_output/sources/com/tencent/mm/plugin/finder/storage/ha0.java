package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class ha0 extends com.tencent.mm.plugin.finder.storage.jj0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f126881d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f126882e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ha0(int r2, tu2.b r3, boolean r4, java.lang.String r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r2 = -1
        L5:
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L11
            tu2.b r3 = new tu2.b
            r3.<init>()
            r3.f422131a = r0
        L11:
            r6 = r6 & 4
            if (r6 == 0) goto L16
            r4 = r0
        L16:
            java.lang.String r6 = "itemViewConfig"
            kotlin.jvm.internal.o.g(r3, r6)
            java.lang.String r6 = "authorFinderUsername"
            kotlin.jvm.internal.o.g(r5, r6)
            r1.<init>(r2, r3)
            r1.f126881d = r4
            r1.f126882e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.ha0.<init>(int, tu2.b, boolean, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.storage.jj0, com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(final yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.storage.FinderMemberTabConfig$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                in5.r rVar;
                com.tencent.mm.plugin.finder.storage.ha0 ha0Var = com.tencent.mm.plugin.finder.storage.ha0.this;
                yz5.l lVar2 = lVar;
                ha0Var.getClass();
                boolean z17 = type == 3002 || type == 4;
                int i17 = ha0Var.f127016a;
                boolean z18 = ha0Var.f126881d;
                tu2.b bVar = ha0Var.f127017b;
                if (z17) {
                    return new com.tencent.mm.plugin.finder.convert.go(i17, bVar, z18);
                }
                if (type == 3001 || type == 2) {
                    return new com.tencent.mm.plugin.finder.convert.fo(i17, bVar, z18);
                }
                if (type == -3) {
                    return new com.tencent.mm.plugin.finder.convert.ik();
                }
                if (type == -5) {
                    return new com.tencent.mm.plugin.finder.convert.xh();
                }
                if (type == -7) {
                    return new com.tencent.mm.plugin.finder.convert.zh();
                }
                if (type == -12) {
                    return new com.tencent.mm.plugin.finder.convert.xr();
                }
                if (type == 1) {
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
                if (type != -15 && type != -16) {
                    if (type == -20) {
                        return new com.tencent.mm.plugin.finder.convert.eo(i17, bVar);
                    }
                    if (type == com.tencent.mm.plugin.finder.playlist.e.class.hashCode()) {
                        return new com.tencent.mm.plugin.finder.convert.io(ha0Var.f126882e);
                    }
                    if (lVar2 != null && (rVar = (in5.r) lVar2.invoke(java.lang.Integer.valueOf(type))) != null) {
                        return rVar;
                    }
                    hc2.l.a("FinderStaggeredConfig", type);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
                return new com.tencent.mm.plugin.finder.convert.mo(i17, -1, -1, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv), false, true);
            }
        };
    }
}
