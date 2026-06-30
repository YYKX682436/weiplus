package com.tencent.mm.plugin.websearch;

@j95.b
/* loaded from: classes.dex */
public class w1 extends jm0.o implements su4.x0 {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.a0 f181698m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.q0 f181699n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.d0 f181700o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.o f181701p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.o4 f181702q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.c0 f181703r;

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).wi();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.websearch.x1(this, gm0.j1.b().f273244g.f273257a), "WebSearchThread");
        ((ku5.t0) ku5.t0.f312615d).h(new su4.i3(-1), "WebSearchThread");
        if (this.f181698m == null) {
            this.f181698m = new com.tencent.mm.plugin.websearch.a0();
        }
    }

    @Override // jm0.o
    public void Vi() {
        su4.t2.f413102a = null;
        com.tencent.mm.plugin.websearch.a0 a0Var = this.f181698m;
        if (a0Var != null) {
            com.tencent.mm.plugin.websearch.y yVar = a0Var.f181433p;
            if (yVar.f181724d != null) {
                gm0.j1.d().d(yVar.f181724d);
            }
            com.tencent.mm.plugin.websearch.x xVar = yVar.f181726f;
            if (xVar != null) {
                xVar.f181713e = true;
            }
            com.tencent.mm.plugin.websearch.z zVar = a0Var.f181435r;
            if (zVar.f181730a != null) {
                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                zVar.f181730a.getClass();
                d17.q(1161, zVar.f181731b);
            }
            if (a0Var.f181436s != null) {
                ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(a0Var.f181436s);
                a0Var.f181436s = null;
            }
            ((java.util.ArrayList) ((com.tencent.mm.plugin.websearch.d2) a0Var.f181432o).f181494b).clear();
            a0Var.f181431n.removeCallbacksAndMessages(null);
            a0Var.f181431n.quit();
            this.f181698m = null;
        }
        com.tencent.mm.plugin.websearch.q0 q0Var = this.f181699n;
        if (q0Var != null) {
            q0Var.getClass();
            gm0.j1.d().q(2975, q0Var);
            ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).Ai(q0Var.f181600p);
            q0Var.t();
            this.f181699n = null;
        }
        com.tencent.mm.plugin.websearch.d0 d0Var = this.f181700o;
        if (d0Var != null) {
            d0Var.f181487n.dead();
            d0Var.f181486m.dead();
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ni().remove(d0Var);
            this.f181700o = null;
        }
        com.tencent.mm.plugin.websearch.o oVar = this.f181701p;
        if (oVar != null) {
            oVar.getClass();
            gm0.j1.d().q(1532, oVar);
            this.f181701p = null;
        }
    }

    public su4.u0 Zi() {
        if (this.f181698m == null) {
            this.f181698m = new com.tencent.mm.plugin.websearch.a0();
        }
        return this.f181698m;
    }

    public com.tencent.mm.plugin.websearch.q0 aj() {
        if (this.f181699n == null) {
            this.f181699n = new com.tencent.mm.plugin.websearch.q0();
        }
        return this.f181699n;
    }

    public java.lang.String bj() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_editor_helper_conf, "{\n    \"reuseBrands\":[\"vivo\",\"samsung\"],\n    \"reuseItems\":[\"剪贴板\",\"Clipboard\",\"剪貼板\"],\n    \"sysMenuConfig\":{\n    \t\"vivo\" : [\n    \t\t{\n    \t\t\t\"idName\" : \"clipboard\",\n    \t\t\t\"idPackage\": \"vivo\",\n    \t\t\t\"titleName\": \"vivo_clipboard_title\",\n    \t\t\t\"titlePackage\" : \"vivo\"\n    \t\t}\n    \t],\n    \t\"samsung\" : [\n    \t\t{\n    \t\t\t\"idName\" : \"clipboard\",\n    \t\t\t\"idPackage\": \"android\",\n    \t\t\t\"titleName\": \"tw_clipboard_title_text\",\n    \t\t\t\"titlePackage\" : \"android\"\n    \t\t}\n    \t]\n    }\n}", true);
    }

    public boolean cj() {
        boolean g17 = la5.b.f317600a.g(true);
        if (g17) {
            fl5.b.a(10);
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_is_use_sys_edit_text, bm5.h0.RepairerConfig_Global_EditText_Int, 1) == 1 || g17 || com.tencent.mm.ui.bk.W();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void fj(su4.i1 i1Var) {
        int i17;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.storage.f9 f9Var = i1Var.f412924c;
        switch (i1Var.f412925d) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (f9Var != null) {
                    if (!com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                        i17 = 3;
                        break;
                    } else {
                        i17 = 4;
                        break;
                    }
                }
                i17 = 0;
                break;
            case 5:
            case 10:
                i17 = 5;
                break;
            case 6:
                i17 = 6;
                break;
            case 7:
            case 8:
                i17 = 7;
                break;
            case 9:
                i17 = 9;
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                i17 = 11;
                break;
            default:
                i17 = 0;
                break;
        }
        intent.putExtra("key_source", i1Var.f412925d);
        intent.putExtra("key_scan_goods_request_type", i17);
        switch (i1Var.f412925d) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                long g17 = o13.n.g(81);
                intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI");
                intent.putExtra("key_sns_id", i1Var.f412926e);
                intent.putExtra("key_sns_username", i1Var.f412927f);
                intent.putExtra("key_sns_image_path", i1Var.f412928g);
                intent.putExtra("key_session_id", g17);
                r45.jj4 jj4Var = i1Var.f412929h;
                if (jj4Var != null) {
                    try {
                        intent.putExtra("key_sns_media", jj4Var.toByteArray());
                    } catch (java.lang.Exception unused) {
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PluginWebSearch", "startImageSearch %s %s %s %s %s", i1Var.f412926e, i1Var.f412927f, i1Var.f412928g, java.lang.Integer.valueOf(i1Var.f412925d), java.lang.Long.valueOf(g17));
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
                intent.putExtra("key_upload_image_use_cdn_opt", false);
                long j17 = i1Var.f412922a;
                if (j17 == 0) {
                    ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                    j17 = o13.n.g(17);
                }
                intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI");
                intent.putExtra("key_sns_image_path", i1Var.f412928g);
                intent.putExtra("key_session_id", j17);
                intent.putExtra("key_source", i1Var.f412925d);
                int i18 = i1Var.f412925d;
                if (i18 == 15 || i18 == 16 || i18 == 18 || i18 == 19 || i18 == 20 || i18 == 21) {
                    intent.putExtra("key_scene", i1Var.f412930i);
                } else {
                    intent.putExtra("key_scene", 83);
                }
                intent.addFlags(268435456);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PluginWebSearch", "startImageSearch %s %s %s %s %s", i1Var.f412926e, i1Var.f412927f, i1Var.f412928g, java.lang.Integer.valueOf(i1Var.f412925d), java.lang.Long.valueOf(j17));
                break;
            case 17:
                intent.putExtra("key_upload_image_use_cdn_opt", false);
                long j18 = i1Var.f412922a;
                if (j18 == 0) {
                    ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                    j18 = o13.n.g(17);
                }
                intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI");
                intent.putExtra("key_sns_image_path", i1Var.f412928g);
                intent.putExtra("key_session_id", j18);
                intent.putExtra("key_source", i1Var.f412925d);
                intent.putExtra("key_scene", i1Var.f412930i);
                intent.addFlags(268435456);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PluginWebSearch", "startImageSearch %s %s %s %s %s", i1Var.f412926e, i1Var.f412927f, i1Var.f412928g, java.lang.Integer.valueOf(i1Var.f412925d), java.lang.Long.valueOf(j18));
                break;
            default:
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                long g18 = o13.n.g(67);
                intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI");
                intent.putExtra("key_source", i1Var.f412925d);
                com.tencent.mm.storage.f9 f9Var2 = i1Var.f412924c;
                if (f9Var2 != null) {
                    intent.putExtra("key_msg_id", f9Var2.getMsgId());
                    intent.putExtra("key_msg_talker", i1Var.f412924c.Q0());
                }
                intent.putExtra("key_session_id", g18);
                java.lang.Object[] objArr = new java.lang.Object[3];
                com.tencent.mm.storage.f9 f9Var3 = i1Var.f412924c;
                objArr[0] = java.lang.Long.valueOf(f9Var3 != null ? f9Var3.getMsgId() : -1L);
                objArr[1] = java.lang.Integer.valueOf(i1Var.f412925d);
                objArr[2] = java.lang.Long.valueOf(g18);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PluginWebSearch", "startImageSearch %s %s %s", objArr);
                break;
        }
        android.content.Context context = i1Var.f412923b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/websearch/PluginWebSearch", "startImageSearch", "(Lcom/tencent/mm/plugin/websearch/api/ImageSearchContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/websearch/PluginWebSearch", "startImageSearch", "(Lcom/tencent/mm/plugin/websearch/api/ImageSearchContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
