package hc2;

/* loaded from: classes2.dex */
public abstract class g0 {
    public static final r45.f1 a(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        java.util.LinkedList<r45.wf6> style;
        java.lang.Object obj;
        if (finderJumpInfo == null || (style = finderJumpInfo.getStyle()) == null) {
            return null;
        }
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.wf6 wf6Var = (r45.wf6) obj;
            boolean z17 = true;
            if (wf6Var.getInteger(1) != 8 || wf6Var.getInteger(2) != 10) {
                z17 = false;
            }
            if (z17) {
                break;
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj;
        if (wf6Var2 != null) {
            return (r45.f1) wf6Var2.getCustom(13);
        }
        return null;
    }

    public static final r45.f1 b(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo w17;
        if (finderObject == null || (w17 = hc2.o0.w(finderObject)) == null) {
            return null;
        }
        return a(w17);
    }

    public static final jz5.l c(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        java.lang.String necessary_params;
        if (finderJumpInfo != null && (native_info = finderJumpInfo.getNative_info()) != null && (necessary_params = native_info.getNecessary_params()) != null) {
            com.tencent.mars.xlog.Log.i("FinderExt", "[getOpParams] necessaryParams:".concat(necessary_params));
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(necessary_params);
                return new jz5.l(java.lang.Integer.valueOf(jSONObject.optInt("op_switch", 0)), java.lang.Integer.valueOf(jSONObject.optInt("hide_flag", 0)));
            } catch (org.json.JSONException unused) {
            }
        }
        return new jz5.l(0, 0);
    }

    public static final java.lang.String d(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        kotlin.jvm.internal.o.g(finderJumpInfo, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jump_id=");
        sb6.append(finderJumpInfo.getJump_id());
        sb6.append("#jump_type=");
        sb6.append(finderJumpInfo.getJumpinfo_type());
        sb6.append("#business_type=");
        sb6.append(finderJumpInfo.getBusiness_type());
        sb6.append("#wording=");
        sb6.append(finderJumpInfo.getWording());
        sb6.append("#style=");
        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(style, 10));
        for (r45.wf6 wf6Var : style) {
            arrayList.add("pos=" + wf6Var.getInteger(1) + "#style=" + wf6Var.getInteger(2) + "#screen=" + wf6Var.getInteger(0) + "#delayAppearTime=" + wf6Var.getInteger(11) + "#appearTime=" + wf6Var.getInteger(14) + "#disappearTime=" + wf6Var.getInteger(15) + "#condition=" + wf6Var.getInteger(20));
        }
        sb6.append(arrayList);
        return sb6.toString();
    }

    public static final boolean e(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, android.content.Context context, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(context, "context");
        if (finderJumpInfo == null) {
            return false;
        }
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453256r = 8;
        p0Var.f453257s = 10;
        p0Var.f453247i = "timeline";
        p0Var.I = num;
        xc2.y2.f453343a.h(context, p0Var, 1, null);
        return true;
    }

    public static final boolean f(com.tencent.mm.protocal.protobuf.FinderObject finderObject, in5.s0 holder, java.lang.Integer num) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo w17;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!hc2.o0.G(finderObject) || (w17 = hc2.o0.w(finderObject)) == null) {
            return false;
        }
        xc2.p0 p0Var = new xc2.p0(w17);
        p0Var.f453256r = 8;
        p0Var.f453257s = 10;
        p0Var.f453247i = "timeline";
        p0Var.I = num;
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        y2Var.h(context, p0Var, 1, holder);
        return true;
    }

    public static final com.tencent.mm.protocal.protobuf.FinderJumpInfo g(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        byte[] decode = android.util.Base64.decode(str, 2);
        try {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo create = com.tencent.mm.protocal.protobuf.FinderJumpInfo.create();
            create.parseFrom(decode);
            return create;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("FinderExt", "parse accountJumpInfo failed: %s", e17);
            return null;
        }
    }
}
