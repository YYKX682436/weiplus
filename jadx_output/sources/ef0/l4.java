package ef0;

@j95.b
/* loaded from: classes9.dex */
public final class l4 extends i95.w implements qk.i9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f252270d = new java.util.HashMap();

    public java.lang.String Ai(android.content.Context context, ot0.q content) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(content, "content");
        il4.a aVar = (il4.a) content.y(il4.a.class);
        java.lang.String o17 = il4.d.o(context, aVar != null ? aVar.f292095e : null, true);
        if (!(o17.length() > 0)) {
            java.lang.String str = content.f348654f;
            return str == null ? "" : str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(o17);
        java.lang.String str2 = content.f348654f;
        sb6.append(str2 != null ? str2 : "");
        return sb6.toString();
    }

    public java.lang.String Bi(android.content.Context context, ot0.q content) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(content, "content");
        il4.a aVar = (il4.a) content.y(il4.a.class);
        boolean z17 = true;
        java.lang.String o17 = il4.d.o(context, aVar != null ? aVar.f292095e : null, true);
        java.lang.String str = content.f348654f;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return o17;
        }
        return o17 + content.f348654f;
    }

    public java.lang.String Di(android.content.Context context, ot0.q content) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.String string = context.getString(com.tencent.mm.R.string.omn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(string);
        sb6.append(']');
        java.lang.String str = content.f348654f;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        return sb6.toString();
    }

    public java.lang.String Ni(android.content.Context context, ot0.q content) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.String str = content.f348654f;
        if (str == null || str.length() == 0) {
            com.tencent.mm.pluginsdk.ui.tools.i0 i0Var = (com.tencent.mm.pluginsdk.ui.tools.i0) content.y(com.tencent.mm.pluginsdk.ui.tools.i0.class);
            return il4.l.f(context, i0Var != null ? i0Var.f191706r : 0, true);
        }
        java.lang.String title = content.f348654f;
        kotlin.jvm.internal.o.f(title, "title");
        return title;
    }

    public java.lang.String Ri(android.content.Context context, ot0.q content) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(content, "content");
        boolean z17 = true;
        java.lang.String f17 = il4.l.f(context, ((com.tencent.mm.pluginsdk.ui.tools.i0) content.y(com.tencent.mm.pluginsdk.ui.tools.i0.class)).f191706r, true);
        java.lang.String str = content.f348654f;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return f17;
        }
        return f17 + ' ' + content.f348654f;
    }

    public bw5.fr0 Ui(np1.a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            bw5.fr0 fr0Var = new bw5.fr0();
            fr0Var.parseFrom(aVar.f390974e.f192156a);
            return fr0Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingUtilService", th6, "getTingSnapShotDataFromAudioPlayInfo exception", new java.lang.Object[0]);
            return null;
        }
    }

    public void Vi(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingUtilService", "markInTingPlayerPage %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        synchronized (this.f252270d) {
            if (z17) {
                this.f252270d.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
            } else {
                this.f252270d.remove(java.lang.Integer.valueOf(i17));
            }
        }
    }

    public r45.km6 Zi(java.lang.String prefix, java.util.Map values) {
        java.lang.String c17;
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(values, "values");
        r45.km6 km6Var = new r45.km6();
        try {
            java.lang.String concat = prefix.concat(".tingCategoryItem");
            boolean z17 = true;
            if (!values.isEmpty()) {
                km6Var.f378838d = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(concat + ".type"), 0);
                java.lang.String str = (java.lang.String) values.get(concat + ".categoryItem");
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                km6Var.f378839e = str;
                java.lang.String str3 = (java.lang.String) values.get(concat + ".categoryId");
                if (str3 == null) {
                    str3 = "";
                }
                km6Var.f378840f = str3;
                if (str3.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    bw5.o50 v17 = il4.d.v(km6Var.f378839e);
                    if (v17 != null && (c17 = v17.c()) != null) {
                        str2 = c17;
                    }
                    km6Var.f378840f = str2;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingAlbumShareParser", "parse error! %s", e17.getMessage());
        }
        return km6Var;
    }

    public void aj(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        if (kotlin.jvm.internal.o.b(appId, "wxalitef1d58076d58fb4e8cc6bed37a19a4534")) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Wj(appId, com.tencent.mm.plugin.ting.ui.TingPostLiteAppUI.class);
            com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class));
            iVar.getClass();
            if (!android.text.TextUtils.isEmpty(appId) && com.tencent.liteapp.ui.WxaLiteAppTransparentUI.class.isAssignableFrom(com.tencent.mm.plugin.ting.ui.TingPostLiteAppTransparentUI.class)) {
                ((java.util.concurrent.ConcurrentHashMap) iVar.f67173h).put(appId, com.tencent.mm.plugin.ting.ui.TingPostLiteAppTransparentUI.class);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "registerTransparentLiteAppActivity error. " + com.tencent.mm.plugin.ting.ui.TingPostLiteAppTransparentUI.class + " is not subclass of WxaLiteAppTransparentUI");
        }
    }

    public qk.g9 bj() {
        boolean z17;
        synchronized (rk4.z8.class) {
            z17 = rk4.z8.f397132o;
        }
        if (z17) {
            return (qk.g9) i95.n0.c(qk.g9.class);
        }
        return null;
    }

    public void wi(java.lang.String listenId, boolean z17, boolean z18, yz5.q callback) {
        kotlin.jvm.internal.o.g(listenId, "listenId");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (listenId.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingUtilService", "fetchMusicPlayItem  listenId empty");
            callback.invoke(java.lang.Boolean.FALSE, "listenId invalid", null);
            return;
        }
        int i17 = jm4.y2.f300452d;
        jm4.x2 x2Var = (jm4.x2) urgen.ur_0025.UR_4862.UR_AFBA();
        if (x2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingUtilService", "fetchService is nil, fetch fail");
            callback.invoke(java.lang.Boolean.FALSE, "cpp fetch service is nil", null);
            return;
        }
        bw5.v70 v70Var = new bw5.v70();
        v70Var.u(listenId);
        v70Var.y(1);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        lp0Var.g("temp_".concat(listenId));
        ef0.i4 i4Var = new ef0.i4(callback);
        byte[] byteArray = lp0Var.toByteArray();
        jm4.x1 x1Var = new jm4.x1();
        x1Var.f300443f = i4Var;
        long cppPointer = ((jm4.y2) x2Var).getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_0025.UR_4862.UR_7FD9(cppPointer, byteArray, z17, z18, x1Var);
    }
}
