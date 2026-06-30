package ni3;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f337608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.monitor.FinderStreamMonitorView f337609e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(fc2.a aVar, com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        super(0);
        this.f337608d = aVar;
        this.f337609e = finderStreamMonitorView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ec2.f fVar = (ec2.f) this.f337608d;
        int i17 = fVar.f250959d;
        java.lang.Object obj = null;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = this.f337609e;
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = finderStreamMonitorView.f149459h;
            if (dataBuffer == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                throw null;
            }
            java.util.Iterator<T> it = dataBuffer.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((so2.j5) next).getItemId() == fVar.f250965j) {
                    obj = next;
                    break;
                }
            }
            so2.j5 j5Var = (so2.j5) obj;
            if (j5Var != null) {
                java.lang.String string = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, j5Var).getString(9);
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, string != null ? string : "").f337695j = ni3.r.f337714r;
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
            }
            com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
        } else if (i17 == 6) {
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer2 = finderStreamMonitorView.f149459h;
            if (dataBuffer2 == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                throw null;
            }
            java.util.Iterator<T> it6 = dataBuffer2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it6.next();
                if (((so2.j5) next2).getItemId() == fVar.f250965j) {
                    obj = next2;
                    break;
                }
            }
            so2.j5 j5Var2 = (so2.j5) obj;
            if (j5Var2 != null) {
                java.lang.String string2 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, j5Var2).getString(9);
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, string2 != null ? string2 : "").f337695j = ni3.r.f337716t;
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
            }
        } else if (i17 == 11) {
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer3 = finderStreamMonitorView.f149459h;
            if (dataBuffer3 == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                throw null;
            }
            java.util.Iterator<T> it7 = dataBuffer3.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                java.lang.Object next3 = it7.next();
                if (((so2.j5) next3).getItemId() == fVar.f250965j) {
                    obj = next3;
                    break;
                }
            }
            so2.j5 j5Var3 = (so2.j5) obj;
            if (j5Var3 != null) {
                java.lang.String string3 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, j5Var3).getString(9);
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, string3 != null ? string3 : "").f337695j = ni3.r.f337715s;
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
            }
        } else if (i17 == 19) {
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer4 = finderStreamMonitorView.f149459h;
            if (dataBuffer4 == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                throw null;
            }
            java.util.Iterator<T> it8 = dataBuffer4.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                java.lang.Object next4 = it8.next();
                if (((so2.j5) next4).getItemId() == fVar.f250965j) {
                    obj = next4;
                    break;
                }
            }
            so2.j5 j5Var4 = (so2.j5) obj;
            if (j5Var4 != null) {
                java.lang.String string4 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, j5Var4).getString(9);
                ni3.q a17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, string4 != null ? string4 : "");
                kz2.a aVar = fVar.f250979x;
                a17.f337693h = aVar != null ? aVar.f313863d : 0L;
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
            }
        } else if (i17 == 3) {
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer5 = finderStreamMonitorView.f149459h;
            if (dataBuffer5 == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                throw null;
            }
            java.util.Iterator<T> it9 = dataBuffer5.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                java.lang.Object next5 = it9.next();
                if (((so2.j5) next5).getItemId() == fVar.f250965j) {
                    obj = next5;
                    break;
                }
            }
            so2.j5 j5Var5 = (so2.j5) obj;
            if (j5Var5 != null) {
                java.lang.String string5 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, j5Var5).getString(9);
                if (string5 == null) {
                    string5 = "";
                }
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, string5).f337696k = fVar.f250963h;
                java.lang.String string6 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, j5Var5).getString(9);
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, string6 != null ? string6 : "").f337697l = fVar.f250964i;
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
            }
        } else if (i17 == 4) {
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer6 = finderStreamMonitorView.f149459h;
            if (dataBuffer6 == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                throw null;
            }
            java.util.Iterator<T> it10 = dataBuffer6.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                java.lang.Object next6 = it10.next();
                if (((so2.j5) next6).getItemId() == fVar.f250965j) {
                    obj = next6;
                    break;
                }
            }
            so2.j5 j5Var6 = (so2.j5) obj;
            if (j5Var6 != null) {
                java.lang.String string7 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, j5Var6).getString(9);
                ni3.q a18 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, string7 != null ? string7 : "");
                a18.f337695j = ni3.r.f337713q;
                cw2.wa waVar = fVar.f250960e;
                if (waVar != null) {
                    so2.i3 c17 = cu2.x.c(cu2.x.f222449a, waVar.f224096c, false, false, false, 14, null);
                    boolean A0 = c17.A0();
                    boolean j17 = com.tencent.mm.vfs.w6.j(waVar.f224095b);
                    if (A0 && j17 && a18.f337694i == ni3.r.f337704e) {
                        a18.f337694i = ni3.r.f337709m;
                    }
                    java.lang.String field_mediaId = c17.field_mediaId;
                    kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                    a18.f337700o = field_mediaId;
                }
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
            }
        } else if (i17 == 22) {
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer7 = finderStreamMonitorView.f149459h;
            if (dataBuffer7 == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                throw null;
            }
            java.util.Iterator<T> it11 = dataBuffer7.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    break;
                }
                java.lang.Object next7 = it11.next();
                if (((so2.j5) next7).getItemId() == fVar.f250965j) {
                    obj = next7;
                    break;
                }
            }
            so2.j5 j5Var7 = (so2.j5) obj;
            if (j5Var7 != null) {
                java.lang.String string8 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, j5Var7).getString(9);
                ni3.q a19 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, string8 != null ? string8 : "");
                a19.f337695j = ni3.r.f337711o;
                cw2.wa waVar2 = fVar.f250960e;
                if (waVar2 != null) {
                    so2.i3 c18 = cu2.x.c(cu2.x.f222449a, waVar2.f224096c, false, false, false, 14, null);
                    boolean A02 = c18.A0();
                    boolean j18 = com.tencent.mm.vfs.w6.j(waVar2.f224095b);
                    if (A02 && j18 && a19.f337694i == ni3.r.f337704e) {
                        a19.f337694i = ni3.r.f337709m;
                    }
                    java.lang.String field_mediaId2 = c18.field_mediaId;
                    kotlin.jvm.internal.o.f(field_mediaId2, "field_mediaId");
                    a19.f337700o = field_mediaId2;
                }
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
            }
        } else if (i17 == 23) {
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer8 = finderStreamMonitorView.f149459h;
            if (dataBuffer8 == null) {
                kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                throw null;
            }
            java.util.Iterator<T> it12 = dataBuffer8.iterator();
            while (true) {
                if (!it12.hasNext()) {
                    break;
                }
                java.lang.Object next8 = it12.next();
                if (((so2.j5) next8).getItemId() == fVar.f250965j) {
                    obj = next8;
                    break;
                }
            }
            so2.j5 j5Var8 = (so2.j5) obj;
            if (j5Var8 != null) {
                java.lang.String string9 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, j5Var8).getString(9);
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, string9 != null ? string9 : "").f337695j = ni3.r.f337712p;
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
            }
        }
        return jz5.f0.f302826a;
    }
}
