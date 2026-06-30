package za3;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.s f471006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(za3.s sVar) {
        super(1);
        this.f471006d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.location.ui.impl.f0 item = (com.tencent.mm.plugin.location.ui.impl.f0) obj;
        kotlin.jvm.internal.o.g(item, "item");
        boolean z17 = item.f144810b;
        za3.s sVar = this.f471006d;
        if (z17) {
            xj.m mVar = sVar.f471010i;
            if (mVar != null) {
                if (sVar.f471019u) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 4, "com.tencent.map");
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 5);
                }
                z80.p0 p0Var = sVar.f471008g;
                java.lang.String str = p0Var.f470655a.f144594p;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    kotlin.jvm.internal.o.d(str);
                    if (r26.i0.y(str, "qqmap_", false)) {
                        str = str.substring(6);
                        kotlin.jvm.internal.o.f(str, "substring(...)");
                    }
                }
                wj.r0 r0Var = wj.r0.f446500f;
                jz5.l lVar = new jz5.l("type", "drive");
                jz5.l lVar2 = new jz5.l("touid", str);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.location.model.LocationInfo locationInfo = p0Var.f470655a;
                sb6.append(locationInfo.f144586e);
                sb6.append(',');
                sb6.append(locationInfo.f144587f);
                xj.n nVar = new xj.n(r0Var, null, null, kz5.c1.k(lVar, lVar2, new jz5.l("tocoord", sb6.toString()), new jz5.l("to", locationInfo.f144591m), new jz5.l("referer", "wx_client")), 6, null);
                i95.m c17 = i95.n0.c(xj.i.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                xj.i.y3((xj.i) c17, mVar.f454753a, nVar, null, 4, null);
                sVar.G(false, true);
                za3.s.D(sVar, "com.tencent.map", sVar.f471019u);
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.util.Map t17 = kz5.c1.t(sVar.f471009h);
                t17.put("view_id", "tencent_maps_promote_btn");
                ((cy1.a) rVar).Ej("view_clk", t17, 27051);
                sVar.cancel();
            }
        } else if (item.f144809a) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", va3.w.b(sVar.f471008g.f470655a));
            z80.p0 p0Var2 = sVar.f471008g;
            intent.putExtra("Retr_Msg_Id", p0Var2.f470657c);
            intent.putExtra("Retr_Msg_Type", 48);
            intent.putExtra("Retr_MsgTalker", p0Var2.f470658d);
            intent.putExtra("exdevice_open_certain_device", true);
            intent.putExtra("exdevice_open_certain_device_info", item.f144816h);
            j45.l.u(sVar.f471007f, ".ui.chatting.ChattingSendDataToDeviceUI", intent, null);
        } else {
            java.lang.String str2 = item.f144813e;
            if (!kotlin.jvm.internal.o.b(str2, "com.tencent.map") || sVar.f471019u) {
                za3.d dVar = sVar.f471016r;
                z80.p0 p0Var3 = sVar.f471008g;
                dVar.g(p0Var3.f470655a, p0Var3.f470656b, item.f144813e, false, true);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 4, str2);
                if (str2 == null) {
                    str2 = "";
                }
                za3.s.D(sVar, str2, true);
            } else {
                gw4.f fVar = new gw4.f(sVar.f471007f);
                fVar.f276157b = "mmdownloadapp_JjNedmtv7FDUquSYR5";
                ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 5);
                if (str2 == null) {
                    str2 = "";
                }
                za3.s.D(sVar, str2, false);
            }
            sVar.cancel();
        }
        return jz5.f0.f302826a;
    }
}
