package o72;

/* loaded from: classes9.dex */
public abstract class r3 {
    public static final void a(android.content.Intent intent, com.tencent.mm.sendtowework.LocationData locationData) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if (locationData == null) {
            return;
        }
        intent.putExtra("content_type_forward_to_wework", 6);
        intent.putExtra("Select_Data_Send_To_WeWork", locationData);
    }

    public static final void b(android.content.Intent intent, o72.r2 r2Var) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if ((r2Var != null ? r2Var.field_favProto : null) == null || com.tencent.mm.sdk.platformtools.t8.L0(r2Var.field_favProto.f370964f)) {
            return;
        }
        r45.gp0 J2 = o72.x1.J(r2Var);
        kotlin.jvm.internal.o.f(J2, "getFirstDataItem(...)");
        java.lang.String x17 = o72.x1.x(J2);
        if (com.tencent.mm.vfs.w6.j(x17)) {
            com.tencent.mm.sendtowework.VideoData videoData = new com.tencent.mm.sendtowework.VideoData(com.tencent.mm.vfs.w6.i(x17, false));
            intent.putExtra("content_type_forward_to_wework", 3);
            intent.putExtra("Select_Data_Send_To_WeWork", videoData);
        }
    }

    public static final void c(android.content.Intent intent, o72.r2 r2Var) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if (r2Var == null) {
            return;
        }
        int i17 = r2Var.field_type;
        if (i17 == 1) {
            java.lang.String str = r2Var.field_favProto.f370974s;
            if (str == null) {
                return;
            }
            com.tencent.mm.sendtowework.TextData textData = new com.tencent.mm.sendtowework.TextData(str);
            intent.putExtra("content_type_forward_to_wework", 1);
            intent.putExtra("Select_Data_Send_To_WeWork", textData);
            return;
        }
        if (i17 == 2) {
            r45.bq0 bq0Var = r2Var.field_favProto;
            if (bq0Var == null || com.tencent.mm.sdk.platformtools.t8.L0(bq0Var.f370964f)) {
                return;
            }
            r45.gp0 J2 = o72.x1.J(r2Var);
            kotlin.jvm.internal.o.f(J2, "getFirstDataItem(...)");
            java.lang.String x17 = o72.x1.x(J2);
            if (com.tencent.mm.vfs.w6.j(x17)) {
                com.tencent.mm.sendtowework.ImgData imgData = new com.tencent.mm.sendtowework.ImgData(com.tencent.mm.vfs.w6.i(x17, false));
                intent.putExtra("content_type_forward_to_wework", 2);
                intent.putExtra("Select_Data_Send_To_WeWork", imgData);
                return;
            }
            return;
        }
        switch (i17) {
            case 4:
                b(intent, r2Var);
                return;
            case 5:
                r45.tq0 tq0Var = r2Var.field_favProto.f370968m;
                if (tq0Var == null) {
                    return;
                }
                com.tencent.mm.sendtowework.LinkData linkData = new com.tencent.mm.sendtowework.LinkData(android.text.TextUtils.isEmpty(tq0Var.f386668h) ? r2Var.field_favProto.f370962d.f378052y : tq0Var.f386668h, tq0Var.f386664d, tq0Var.f386666f, tq0Var.f386670m);
                intent.putExtra("content_type_forward_to_wework", 7);
                intent.putExtra("Select_Data_Send_To_WeWork", linkData);
                return;
            case 6:
                r45.bq0 bq0Var2 = r2Var.field_favProto;
                r45.pp0 pp0Var = bq0Var2 != null ? bq0Var2.f370966h : null;
                if (pp0Var == null) {
                    return;
                }
                a(intent, new com.tencent.mm.sendtowework.LocationData(pp0Var.f383274o, pp0Var.f383272m, java.lang.Double.valueOf(pp0Var.f383266d), java.lang.Double.valueOf(pp0Var.f383268f), java.lang.Double.valueOf(pp0Var.f383270h)));
                return;
            case 7:
                break;
            case 8:
                r45.bq0 bq0Var3 = r2Var.field_favProto;
                if (bq0Var3 == null) {
                    return;
                }
                r45.gp0 gp0Var = (r45.gp0) bq0Var3.f370964f.get(0);
                com.tencent.mm.sendtowework.FileData fileData = new com.tencent.mm.sendtowework.FileData(com.tencent.mm.vfs.w6.i(o72.x1.x(gp0Var), false), java.lang.Long.valueOf(gp0Var.R), gp0Var.f375404d);
                intent.putExtra("content_type_forward_to_wework", 4);
                intent.putExtra("Select_Data_Send_To_WeWork", fileData);
                return;
            default:
                switch (i17) {
                    case 18:
                        intent.putExtra("content_type_forward_to_wework", 13);
                        return;
                    case 19:
                        r45.bq0 bq0Var4 = r2Var.field_favProto;
                        r45.dp0 dp0Var = bq0Var4 != null ? bq0Var4.I : null;
                        if (dp0Var == null) {
                            return;
                        }
                        com.tencent.mm.sendtowework.AppBrandData appBrandData = new com.tencent.mm.sendtowework.AppBrandData(dp0Var.f372634d, dp0Var.f372639i, dp0Var.f372637g, com.tencent.mm.vfs.w6.i(o72.x1.X((r45.gp0) bq0Var4.f370964f.getFirst()), false), dp0Var.f372640m, r2Var.field_favProto.f370972q, java.lang.Integer.valueOf(dp0Var.f372638h));
                        intent.putExtra("content_type_forward_to_wework", 5);
                        intent.putExtra("Select_Data_Send_To_WeWork", appBrandData);
                        return;
                    case 20:
                        return;
                    case 21:
                        break;
                    default:
                        intent.putExtra("content_type_forward_to_wework", -1);
                        return;
                }
        }
        intent.putExtra("content_type_forward_to_wework", 11);
    }
}
