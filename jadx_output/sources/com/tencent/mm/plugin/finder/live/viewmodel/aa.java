package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes2.dex */
public final class aa extends com.tencent.mm.ui.component.UIComponent implements zy2.v9 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.viewmodel.z9 f116905h = new com.tencent.mm.plugin.finder.live.viewmodel.z9(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116906d;

    /* renamed from: e, reason: collision with root package name */
    public r45.md5 f116907e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f116908f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f116909g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f116906d = "";
    }

    public void O6(java.lang.String encryptedFeedId, long j17) {
        r45.md5 md5Var;
        kotlin.jvm.internal.o.g(encryptedFeedId, "encryptedFeedId");
        r45.md5 md5Var2 = this.f116907e;
        if (!kotlin.jvm.internal.o.b(md5Var2 != null ? md5Var2.getString(2) : null, encryptedFeedId) || (md5Var = this.f116907e) == null) {
            return;
        }
        md5Var.set(0, java.lang.Long.valueOf(j17));
    }

    public void P6(r45.g92 g92Var) {
        if (g92Var == null) {
            return;
        }
        try {
            g92Var.set(42, pm0.v.u(((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(pm0.v.Z(g92Var.getString(0)))));
            com.tencent.mars.xlog.Log.i("Finder.FinderProductTraceUIC", "insertEnterSessionId " + g92Var.getString(42));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderProductTraceUIC", th6, "", new java.lang.Object[0]);
        }
    }

    public void Q6(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        try {
            boolean z17 = true;
            if (obj instanceof r45.g92) {
                long Z = pm0.v.Z(((r45.g92) obj).getString(0));
                r45.md5 md5Var = this.f116907e;
                if (md5Var == null || Z != md5Var.getLong(1)) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mm.sdk.platformtools.Log.c("Finder.FinderProductTraceUIC", "insertLastGMsgId to live, lastGMsgId:" + this.f116906d, new java.lang.Object[0]);
                    ((r45.g92) obj).set(41, this.f116906d);
                    return;
                }
                return;
            }
            if (!(obj instanceof r45.kv2)) {
                if (obj instanceof r45.jv2) {
                    com.tencent.mm.sdk.platformtools.Log.c("Finder.FinderProductTraceUIC", "insertLastGMsgId to profile, lastGMsgId:" + this.f116906d, new java.lang.Object[0]);
                    ((r45.jv2) obj).set(7, this.f116906d);
                    return;
                }
                return;
            }
            long Z2 = pm0.v.Z(((r45.kv2) obj).getString(0));
            r45.md5 md5Var2 = this.f116907e;
            if (md5Var2 == null || Z2 != md5Var2.getLong(0)) {
                z17 = false;
            }
            if (z17 || this.f116908f) {
                com.tencent.mm.sdk.platformtools.Log.c("Finder.FinderProductTraceUIC", "insertLastGMsgId to feed, lastGMsgId:" + this.f116906d, new java.lang.Object[0]);
                ((r45.kv2) obj).set(27, this.f116906d);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderProductTraceUIC", th6, "", new java.lang.Object[0]);
        }
    }

    public android.content.Intent R6(android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        f116905h.a(intent, this.f116906d, this.f116907e);
        return intent;
    }

    public android.content.Intent S6(long j17, android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        r45.md5 md5Var = this.f116907e;
        boolean z17 = false;
        if (md5Var != null && md5Var.getLong(0) == j17) {
            z17 = true;
        }
        if (z17 || this.f116908f) {
            f116905h.a(intent, this.f116906d, this.f116907e);
        }
        return intent;
    }

    public com.tencent.mm.protocal.protobuf.FinderJumpInfo T6(long j17, com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        r45.md5 md5Var = this.f116907e;
        boolean z17 = false;
        if (md5Var != null && md5Var.getLong(1) == j17) {
            z17 = true;
        }
        if (z17) {
            f116905h.b(this.f116906d, jumpInfo);
        }
        return jumpInfo;
    }

    public l81.b1 U6(long j17, l81.b1 bundle) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        r45.md5 md5Var = this.f116907e;
        boolean z17 = false;
        if (md5Var != null && md5Var.getLong(1) == j17) {
            z17 = true;
        }
        if (z17) {
            f116905h.c(this.f116906d, bundle);
        }
        return bundle;
    }

    public void V6(java.lang.String gmsgId, r45.md5 md5Var) {
        kotlin.jvm.internal.o.g(gmsgId, "gmsgId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set gmsgid manually, gmsgid = ");
        sb6.append(gmsgId);
        sb6.append(", extraInfo: liveId = ");
        sb6.append(md5Var != null ? java.lang.Long.valueOf(md5Var.getLong(1)) : null);
        sb6.append(", feedId = ");
        sb6.append(md5Var != null ? java.lang.Long.valueOf(md5Var.getLong(0)) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderProductTraceUIC", sb6.toString());
        this.f116906d = gmsgId;
        this.f116907e = md5Var;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("FINDER_PRODUCT_LAST_GLOBAL_MSG_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f116906d = stringExtra;
        r45.md5 md5Var = new r45.md5();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("FINDER_PRODUCT_TRACE_EXTRA_INFO");
        if (byteArrayExtra != null) {
            try {
                md5Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
            this.f116907e = md5Var;
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            android.app.Activity context = getContext();
            ((c61.p2) ybVar).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            this.f116908f = context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI;
            com.tencent.mars.xlog.Log.i("Finder.FinderProductTraceUIC", "onCreate activity:" + getActivity() + " lastGMsgId:" + this.f116906d + ", traceExtraInfo:" + f116905h.d(this.f116907e));
        }
        md5Var = null;
        this.f116907e = md5Var;
        c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
        android.app.Activity context2 = getContext();
        ((c61.p2) ybVar2).getClass();
        kotlin.jvm.internal.o.g(context2, "context");
        this.f116908f = context2 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI;
        com.tencent.mars.xlog.Log.i("Finder.FinderProductTraceUIC", "onCreate activity:" + getActivity() + " lastGMsgId:" + this.f116906d + ", traceExtraInfo:" + f116905h.d(this.f116907e));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        yz5.a aVar = this.f116909g;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
