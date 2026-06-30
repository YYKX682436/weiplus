package df2;

/* loaded from: classes3.dex */
public final class gb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230209d;

    public gb(df2.zb zbVar) {
        this.f230209d = zbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.v0 v0Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        com.tencent.mm.protobuf.g necessary_params_bytes;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController$onViewMount$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.zb zbVar = this.f230209d;
        r45.ff1 ff1Var = zbVar.f231944r;
        if ((ff1Var != null && ff1Var.getInteger(7) == 4) == false) {
            zbVar.u7();
            df2.zb.w7(zbVar, false, null, 2, null);
        }
        r45.ff1 ff1Var2 = zbVar.f231944r;
        if ((ff1Var2 != null && ff1Var2.getInteger(7) == 4) == true) {
            r45.ff1 ff1Var3 = zbVar.f231944r;
            if (ff1Var3 != null) {
                ff1Var3.set(2, ff1Var3.getString(8));
            }
            r45.ff1 ff1Var4 = zbVar.f231944r;
            if (ff1Var4 != null) {
                ff1Var4.set(4, "");
            }
            zbVar.y7();
            r45.n72 n72Var = r45.n72.kActionType_AiassistantFeedBack;
            r45.ff1 ff1Var5 = zbVar.f231944r;
            if (ff1Var5 == null || (str2 = ff1Var5.getString(0)) == null) {
                str2 = "";
            }
            zbVar.s7(n72Var, 0, str2);
        } else {
            r45.ff1 ff1Var6 = zbVar.f231944r;
            if ((ff1Var6 != null && ff1Var6.getInteger(7) == 2) == true) {
                r45.ff1 ff1Var7 = zbVar.f231944r;
                if (ff1Var7 != null && (finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ff1Var7.getCustom(3)) != null) {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    android.content.Context O6 = zbVar.O6();
                    xc2.y2 y2Var = xc2.y2.f453343a;
                    xc2.p0 p0Var = new xc2.p0(finderJumpInfo2);
                    p0Var.f453252n = 0;
                    xc2.y2.i(y2Var, O6, p0Var, 0, null, 8, null);
                }
            } else {
                r45.ff1 ff1Var8 = zbVar.f231944r;
                if ((ff1Var8 != null && ff1Var8.getInteger(7) == 3) != false) {
                    r45.u84 u84Var = new r45.u84();
                    r45.ff1 ff1Var9 = zbVar.f231944r;
                    byte[] g17 = (ff1Var9 == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ff1Var9.getCustom(3)) == null || (native_info = finderJumpInfo.getNative_info()) == null || (necessary_params_bytes = native_info.getNecessary_params_bytes()) == null) ? null : necessary_params_bytes.g();
                    if (g17 != null) {
                        try {
                            u84Var.parseFrom(g17);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                        }
                    }
                    int integer = u84Var.getInteger(0);
                    if (integer == 1) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        r45.ff1 ff1Var10 = zbVar.f231944r;
                        bundle.putString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID", ff1Var10 != null ? ff1Var10.getString(0) : null);
                        zbVar.X6(qo0.b.f365382m2, bundle);
                        r45.d22 d22Var = new r45.d22();
                        com.tencent.mm.protobuf.g byteString = u84Var.getByteString(1);
                        byte[] g18 = byteString != null ? byteString.g() : null;
                        if (g18 != null) {
                            try {
                                d22Var.parseFrom(g18);
                            } catch (java.lang.Exception e18) {
                                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                            }
                        }
                        if (((mm2.c1) zbVar.business(mm2.c1.class)).Z6().b(dk2.q.e(d22Var)).f302833d == null) {
                            com.tencent.mm.plugin.finder.live.util.y.d(zbVar, null, null, new df2.za(zbVar, d22Var, null), 3, null);
                        }
                    } else if (integer == 2) {
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putByteArray("PARAM_LIVE_AI_ASSISTANT_INFO", u84Var.toByteArray());
                        r45.ff1 ff1Var11 = zbVar.f231944r;
                        bundle2.putString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID", ff1Var11 != null ? ff1Var11.getString(0) : null);
                        zbVar.X6(qo0.b.K4, bundle2);
                    } else if (integer == 3) {
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putInt("PARAM_FINDER_LIVE_SHOW_APPLY_LIST_INDEX", 1);
                        r45.ff1 ff1Var12 = zbVar.f231944r;
                        bundle3.putString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID", ff1Var12 != null ? ff1Var12.getString(0) : null);
                        com.tencent.mm.protobuf.g byteString2 = u84Var.getByteString(2);
                        bundle3.putByteArray("PARAM_FINDER_LIVE_AI_ASSISTANT_JUMP_INFO_BUFFER", byteString2 != null ? byteString2.g() : null);
                        zbVar.X6(qo0.b.G3, bundle3);
                    } else if (integer == 4 && (v0Var = (df2.v0) zbVar.controller(df2.v0.class)) != null) {
                        r45.ff1 ff1Var13 = zbVar.f231944r;
                        v0Var.f7(ff1Var13 != null ? ff1Var13.getString(0) : null);
                    }
                }
            }
        }
        zbVar.q7(4);
        r45.n72 n72Var2 = r45.n72.kActionType_AiassistantClicked;
        int integer2 = ff1Var != null ? ff1Var.getInteger(7) : 0;
        if (ff1Var == null || (str = ff1Var.getString(2)) == null) {
            str = "";
        }
        zbVar.s7(n72Var2, integer2, str);
        zbVar.s7(r45.n72.kActionType_AiassistantClose, 4, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController$onViewMount$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
