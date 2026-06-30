package oy1;

/* loaded from: classes15.dex */
public final class h extends oy1.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f349872e;

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            a(null);
            b();
        }
        com.tencent.wechat.aff.data_report.h g17 = g();
        if (g17 != null) {
            g17.e(0, 2, oy1.b.f349843a);
        }
        com.tencent.wechat.aff.data_report.h g18 = g();
        if (g18 != null) {
            java.lang.System.currentTimeMillis();
            g18.j(c01.id.c(), oy1.c.f349845a);
        }
    }

    @Override // oy1.l
    public void c(int i17, java.util.List reportInfoList, boolean z17) {
        java.util.LinkedList linkedList;
        com.tencent.wechat.aff.data_report.h g17;
        kotlin.jvm.internal.o.g(reportInfoList, "reportInfoList");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            if (!this.f349872e) {
                java.lang.String i18 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("sdk_data_report"), false);
                com.tencent.wechat.aff.data_report.h g18 = g();
                this.f349872e = g18 != null ? g18.b(i18) : false;
            }
            bw5.r4 r4Var = new bw5.r4();
            java.util.Iterator it = reportInfoList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                linkedList = r4Var.f32400d;
                if (!hasNext) {
                    break;
                }
                oy1.n nVar = (oy1.n) it.next();
                bw5.q4 q4Var = new bw5.q4();
                q4Var.f31921d = i17;
                boolean[] zArr = q4Var.f31936v;
                zArr[1] = true;
                q4Var.f31922e = nVar.f349900f;
                zArr[2] = true;
                q4Var.f31923f = nVar.f349901g;
                zArr[3] = true;
                q4Var.f31924g = nVar.f349902h;
                zArr[4] = true;
                q4Var.f31926i = nVar.f349904m;
                zArr[6] = true;
                q4Var.f31925h = nVar.f349903i;
                zArr[5] = true;
                q4Var.f31927m = nVar.f349905n;
                zArr[7] = true;
                q4Var.f31928n = nVar.f349906o;
                zArr[8] = true;
                q4Var.f31929o = nVar.f349907p;
                zArr[9] = true;
                q4Var.f31930p = c01.id.c();
                zArr[10] = true;
                q4Var.f31931q = nVar.f349908q;
                zArr[11] = true;
                q4Var.f31932r = nVar.f349899e;
                zArr[12] = true;
                q4Var.f31933s = "3.1.1";
                zArr[13] = true;
                q4Var.f31934t = sz1.a.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
                zArr[14] = true;
                q4Var.f31935u = sz1.a.d();
                zArr[15] = true;
                if (z17) {
                    linkedList.add(q4Var);
                    r4Var.f32401e[1] = true;
                } else {
                    com.tencent.wechat.aff.data_report.h g19 = g();
                    if (g19 != null) {
                        g19.d(q4Var, oy1.d.f349865a);
                    }
                }
            }
            if (linkedList.isEmpty() || (g17 = g()) == null) {
                return;
            }
            g17.c(r4Var, oy1.e.f349866a);
        }
    }

    @Override // oy1.l
    public void d(java.lang.String str) {
        com.tencent.wechat.aff.data_report.h g17 = g();
        if (g17 != null) {
            g17.e(0, 1, oy1.f.f349868a);
        }
    }

    @Override // oy1.l
    public void e(boolean z17) {
        com.tencent.wechat.aff.data_report.h g17 = g();
        if (g17 != null) {
            g17.f(z17, oy1.g.f349869a);
        }
    }

    @Override // oy1.l
    public void f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.f(context);
        com.tencent.wechat.aff.data_report.h g17 = g();
        if (g17 != null) {
            g17.i("onIdKeyReport");
        }
    }

    public final com.tencent.wechat.aff.data_report.h g() {
        if (gm0.j1.h() && gm0.j1.a()) {
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            return com.tencent.wechat.aff.data_report.h.f216606c;
        }
        jx3.f.INSTANCE.t(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, 79);
        return null;
    }

    public void h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            a(context);
            b();
            ez1.g.f257840i.P(this);
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("sdk_data_report"), false);
        com.tencent.wechat.aff.data_report.h g17 = g();
        this.f349872e = g17 != null ? g17.b(i17) : false;
        com.tencent.wechat.aff.data_report.h g18 = g();
        if (g18 != null) {
            g18.g("onIdKeyReport", oy1.a.f349838a);
        }
    }
}
