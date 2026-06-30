package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class f80 extends com.tencent.mm.plugin.finder.storage.jj0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f126753d;

    /* renamed from: e, reason: collision with root package name */
    public final cw2.f8 f126754e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f80(android.content.Context r1, tu2.b r2, int r3, cw2.f8 r4, int r5, kotlin.jvm.internal.i r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            tu2.b r2 = new tu2.b
            r2.<init>()
            r6 = 0
            r2.f422131a = r6
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L11
            r3 = -1
        L11:
            r5 = r5 & 8
            if (r5 == 0) goto L16
            r4 = 0
        L16:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.f80.<init>(android.content.Context, tu2.b, int, cw2.f8, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.storage.jj0, com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(final yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return com.tencent.mm.plugin.finder.storage.f80.this.g(type, lVar, null);
            }
        };
    }

    public final in5.r g(int i17, yz5.l lVar, yz5.q qVar) {
        in5.r rVar;
        if (i17 == -12) {
            return new com.tencent.mm.plugin.finder.convert.xr();
        }
        if (i17 == -7) {
            return new com.tencent.mm.plugin.finder.convert.zh();
        }
        if (i17 == -5) {
            return new com.tencent.mm.plugin.finder.convert.xh();
        }
        if (i17 == -3) {
            return new com.tencent.mm.plugin.finder.convert.ik();
        }
        tu2.b bVar = this.f127017b;
        int i18 = this.f127016a;
        if (i17 != 2) {
            if (i17 != 4) {
                if (i17 == 9) {
                    return new com.tencent.mm.plugin.finder.storage.c80(this, qVar, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9), new com.tencent.mm.plugin.finder.storage.d80(this));
                }
                if (i17 != 3001) {
                    if (i17 != 3002) {
                        if (lVar != null && (rVar = (in5.r) lVar.invoke(java.lang.Integer.valueOf(i17))) != null) {
                            return rVar;
                        }
                        hc2.l.a("FinderStaggeredConfig", i17);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                    }
                }
            }
            cw2.f8 f8Var = this.f126754e;
            return f8Var != null ? new com.tencent.mm.plugin.finder.storage.a80(qVar, i18, bVar, f8Var) : new com.tencent.mm.plugin.finder.storage.b80(qVar, i18, bVar);
        }
        return new com.tencent.mm.plugin.finder.storage.e80(qVar, i18, bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(android.content.Context baseContext, tu2.b itemViewConfig, int i17, cw2.f8 f8Var) {
        super(i17, itemViewConfig);
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        kotlin.jvm.internal.o.g(itemViewConfig, "itemViewConfig");
        this.f126753d = baseContext;
        this.f126754e = f8Var;
    }
}
