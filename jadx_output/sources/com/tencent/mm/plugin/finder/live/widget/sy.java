package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sy implements com.tencent.mm.plugin.finder.live.plugin.jp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f119849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.n52 f119850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dz f119851c;

    public sy(android.content.Context context, r45.n52 n52Var, com.tencent.mm.plugin.finder.live.widget.dz dzVar) {
        this.f119849a = context;
        this.f119850b = n52Var;
        this.f119851c = dzVar;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.jp
    public void a(boolean z17, int i17, com.tencent.mm.plugin.finder.live.plugin.ip errType, java.lang.String str, java.lang.Long l17, int i18, java.lang.String str2, java.lang.String str3, ek2.i2 i2Var) {
        android.content.Context context;
        kotlin.jvm.internal.o.g(errType, "errType");
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context2 = this.f119849a;
        kotlin.jvm.internal.o.f(context2, "$context");
        r4Var.h3(context2, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "sendGiftCallback, success:" + z17 + " errCode:" + i17 + " errType:" + errType + " balance:" + l17);
        r45.n52 n52Var = this.f119850b;
        java.lang.String str4 = null;
        com.tencent.mm.plugin.finder.live.widget.dz dzVar = this.f119851c;
        if (!z17) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Sj(26, n52Var.getInteger(1), "errCode:" + i17 + " errType:" + errType + " errMsg:" + str3, null);
            dzVar.f118181t = 0L;
            int ordinal = errType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.xy(str3, dzVar));
                    return;
                } else {
                    if (i17 != 10000) {
                        if (i17 != 10003) {
                            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.xy(null, dzVar));
                            return;
                        } else {
                            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.bz(dzVar));
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Uj((ml2.r0) c17, 25, n52Var.getInteger(1), null, null, 8, null);
        if (l17 != null) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = dzVar.f118180s;
            if (lVar != null) {
                qo0.b bVar = qo0.b.Y1;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("PARAM_FINDER_LIVE_GIFT_UPDATE_WECOIN", l17.longValue());
                lVar.M0(bVar, bundle);
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.l lVar2 = dzVar.f118180s;
            if (lVar2 != null) {
                lVar2.M0(qo0.b.Y1, null);
            }
        }
        com.tencent.mm.plugin.finder.live.widget.ry ryVar = dzVar.f118176o;
        if (ryVar != null) {
            com.tencent.mm.plugin.finder.live.widget.wz wzVar = (com.tencent.mm.plugin.finder.live.widget.wz) ryVar;
            com.tencent.mm.plugin.finder.live.widget.m10 m10Var = wzVar.f120250a;
            com.tencent.mm.ui.widget.dialog.y1 y1Var = m10Var.f119013o;
            if (y1Var != null) {
                y1Var.q();
            }
            if (!wzVar.f120251b) {
                wzVar.f120252c.run();
                return;
            }
            android.widget.TextView textView = m10Var.f119005g;
            android.content.Context context3 = textView != null ? textView.getContext() : null;
            android.widget.TextView textView2 = m10Var.f119005g;
            if (textView2 != null && (context = textView2.getContext()) != null) {
                str4 = context.getString(com.tencent.mm.R.string.czq);
            }
            db5.t7.h(context3, str4);
        }
    }
}
