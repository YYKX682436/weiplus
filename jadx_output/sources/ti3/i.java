package ti3;

/* loaded from: classes9.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f419588a = 0;

    static {
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.app_brand_app_default_icon_for_tail;
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20);
        fVar.f342086j = b17;
        fVar.f342087k = b18;
        fVar.f342096t = true;
        fVar.f342078b = true;
        fVar.f342077a = true;
        fVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r9 != 106) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r6, ti3.m r7, com.tencent.mm.ui.tools.e3 r8, com.tencent.mm.storage.f9 r9, ot0.q r10) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti3.i.a(android.content.Context, ti3.m, com.tencent.mm.ui.tools.e3, com.tencent.mm.storage.f9, ot0.q):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        r4 = m11.b1.Di().J3(r23, r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r20, ti3.m r21, com.tencent.mm.ui.tools.e3 r22, com.tencent.mm.storage.f9 r23) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti3.i.b(android.content.Context, ti3.m, com.tencent.mm.ui.tools.e3, com.tencent.mm.storage.f9):boolean");
    }

    public static java.lang.String c(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.storage.a3 z07;
        java.lang.String str = "";
        if (f9Var == null) {
            return "";
        }
        java.lang.String c17 = bm5.d1.c(f9Var);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c17, true);
        if (com.tencent.mm.sdk.platformtools.t8.K0("") && com.tencent.mm.storage.z3.R4(f9Var.Q0()) && (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(f9Var.Q0())) != null) {
            java.lang.String z08 = z07.z0(c17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(z08)) {
                str = z08;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && n17 != null) {
            str = n17.P0();
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? c17 : str;
    }

    public static java.lang.String d(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        com.tencent.mm.storage.a3 z07;
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.MsgQuoteHelp", "msginfo empty");
            return str;
        }
        java.lang.String c17 = bm5.d1.c(f9Var);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c17, true);
        java.lang.String w07 = n17 != null ? n17.w0() : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07) && com.tencent.mm.storage.z3.R4(f9Var.Q0()) && (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(f9Var.Q0())) != null) {
            java.lang.String z08 = z07.z0(c17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(z08)) {
                w07 = z08;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07) && n17 != null) {
            w07 = n17.P0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07) && n17 != null) {
            w07 = n17.t0();
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(w07) ? str : w07;
    }

    public static java.lang.String e(ot0.q qVar) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        eqVar.f6583a = 0;
        eqVar.f6584b = qVar.f348663h0;
        recordOperationEvent.e();
        am.fq fqVar = recordOperationEvent.f54664h;
        r45.ul5 ul5Var = fqVar.f6692a;
        str = "";
        if (ul5Var == null) {
            return "";
        }
        java.util.LinkedList linkedList = ul5Var.f387465f;
        java.util.Iterator it = linkedList.iterator();
        java.lang.String str3 = null;
        int i17 = 0;
        boolean z17 = false;
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (!com.tencent.mm.plugin.fav.ui.x5.f(gp0Var) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.P1) || !gp0Var.P1.equals("WeNoteHtmlFile")) {
                int i18 = gp0Var.I;
                if (i18 == 10130) {
                    i18 = 8;
                }
                if (i18 != 1) {
                    if (i18 == 2) {
                        i17++;
                    }
                } else if (!z17) {
                    java.lang.String str4 = gp0Var.f375408f;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4.replaceAll("\n", "").trim())) {
                            str3 = gp0Var.f375408f.replaceAll("&lt;", "<").replaceAll("&gt;", ">");
                        }
                        z17 = true;
                    }
                }
            }
        }
        if (str3 != null) {
            java.lang.String[] split = str3.split("\n", 2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (split.length > 0) {
                for (java.lang.String str5 : split) {
                    if (str5.length() > 0) {
                        arrayList.add(str5);
                    }
                }
            }
            str = ((arrayList.size() == 1 && linkedList.size() == 2) ? "" : i17 > 0 ? (java.lang.String) arrayList.get(0) : (java.lang.String) arrayList.get(0)).trim();
        }
        if (str.isEmpty() && (str2 = fqVar.f6692a.f387464e) != null) {
            java.lang.String[] split2 = str2.split("\n");
            if (split2.length > 0) {
                str = split2[0];
                com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.MsgQuoteHelp", "get from event.result.recordInfo.desc");
            }
        }
        return str != null ? str.replaceAll("&lt;", "<").replaceAll("&gt;", ">") : str;
    }

    public static ti3.l f(android.content.Context context, float f17, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.f9 f9Var2, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        if (f9Var2 == null) {
            return new ti3.l(false, "", 0);
        }
        ui3.b D0 = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Di().D0(f9Var2.Q0(), f9Var2.I0());
        if (f9Var2.getMsgId() == 0 && msgQuoteItem.f149482d == 0) {
            return new ti3.l(false, context.getString(com.tencent.mm.R.string.gzj), 0);
        }
        if ((D0 != null && D0.field_status == 1) || f9Var2.W2()) {
            return new ti3.l(false, context.getString(com.tencent.mm.R.string.f492571h03), 0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = msgQuoteItem.f149486h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String d17 = d(f9Var2, str);
        ((ke0.e) xVar).getClass();
        sb6.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.j(context, d17, f17));
        sb6.append("：");
        int length = sb6.length();
        java.lang.String i17 = i(context, f9Var2.getType(), f9Var2.getType() == 34 ? f9Var2.j() : f9Var2.U1(), f9Var2.A0() == 1);
        if (D0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.MsgQuoteHelp", "getShowSummary() msgQuote is null");
            if (com.tencent.mm.sdk.platformtools.t8.K0(sb6.toString())) {
                return new ti3.l(false, "", 0);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            android.graphics.drawable.Drawable h17 = h(context, f9Var2);
            if (h17 != null) {
                return new ti3.l(true, ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ai(context, sb6, h17, true), length);
            }
        } else {
            android.graphics.drawable.Drawable h18 = h(context, f9Var2);
            if (h18 != null) {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, i17, f17);
                ((ke0.e) xVar2).getClass();
                return new ti3.l(true, com.tencent.mm.pluginsdk.ui.span.c0.b(context, sb6, j17, h18, true, true), length);
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            sb6.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.j(context, i17, f17));
        }
        return new ti3.l(true, sb6, length);
    }

    public static android.graphics.drawable.Drawable g(android.content.Context context, int i17, l15.c cVar) {
        if (cVar == null) {
            return null;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        switch (i17) {
            case 34:
                android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_quote_voice, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                e17.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                return e17;
            case 42:
            case 66:
                android.graphics.drawable.Drawable e18 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_me, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                e18.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                return e18;
            case 48:
                android.graphics.drawable.Drawable e19 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_quote_location, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                e19.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                return e19;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
            case 1048625:
            case 419430449:
            case 436207665:
            case 754974769:
            case 805306417:
            case 822083633:
            case 855638065:
            case 973078577:
            case 975175729:
            case 979370033:
            case 1040187441:
            case 1174405169:
            case 1241514033:
            case 1409286193:
            case 1426063409:
            case 1442840625:
            case 1476395057:
                if (cVar.k() == null) {
                    return null;
                }
                v05.b k17 = cVar.k();
                int integer = k17.getInteger(k17.f368365d + 6);
                if (integer != 3) {
                    if (integer != 4 && integer != 5) {
                        if (integer != 6) {
                            if (integer != 50) {
                                if (integer != 51) {
                                    if (integer != 68) {
                                        if (integer != 69 && integer != 105) {
                                            if (integer != 106 && integer != 129) {
                                                if (integer != 130) {
                                                    if (integer != 2000) {
                                                        if (integer == 2001) {
                                                            v05.b k18 = cVar.k();
                                                            android.graphics.drawable.Drawable e27 = "1001".equals(((b15.c) k18.getCustom(k18.f432315e + 31)).w()) ? com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_accounts, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A)) : com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_envelopes, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                                                            e27.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                                                            return e27;
                                                        }
                                                        switch (integer) {
                                                            case 24:
                                                                android.graphics.drawable.Drawable e28 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_quote_pencil, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                                                                e28.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                                                                return e28;
                                                            case 33:
                                                            case 36:
                                                            case 44:
                                                            case 48:
                                                                android.graphics.drawable.Drawable e29 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_quote_mini_program, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                                                                e29.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                                                                return e29;
                                                            case 60:
                                                                android.graphics.drawable.Drawable e37 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_live, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                                                                e37.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                                                                return e37;
                                                            case 63:
                                                            case 65:
                                                            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                                                                break;
                                                            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                                break;
                                                            case 92:
                                                                v05.b k19 = cVar.k();
                                                                e15.c cVar2 = (e15.c) k19.getCustom(k19.f432315e + 48);
                                                                if (cVar2 == null) {
                                                                    return null;
                                                                }
                                                                qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
                                                                int type = cVar2.getType();
                                                                ((ef0.l4) i9Var).getClass();
                                                                boolean l17 = il4.l.l(type);
                                                                int i18 = com.tencent.mm.R.raw.music_regular;
                                                                if (!l17 && il4.l.g(type)) {
                                                                    i18 = com.tencent.mm.R.raw.icons_outlined_voice_new;
                                                                }
                                                                if (i18 == 0) {
                                                                    return null;
                                                                }
                                                                android.graphics.drawable.Drawable e38 = com.tencent.mm.ui.uk.e(context, i18, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                                                                e38.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                                                                return e38;
                                                            case 101:
                                                                break;
                                                            case 113:
                                                                break;
                                                            case 120:
                                                                android.graphics.drawable.Drawable e39 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_video, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                                                                e39.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                                                                return e39;
                                                            case 132:
                                                                android.graphics.drawable.Drawable e47 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_me, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                                                                e47.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                                                                return e47;
                                                            case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION /* 2011 */:
                                                                break;
                                                            default:
                                                                return null;
                                                        }
                                                    }
                                                    android.graphics.drawable.Drawable e48 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_accounts, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                                                    e48.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                                                    return e48;
                                                }
                                            }
                                        }
                                    }
                                    android.graphics.drawable.Drawable e49 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_quote_link, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                                    e49.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                                    return e49;
                                }
                                android.graphics.drawable.Drawable e57 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_video, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                                e57.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                                return e57;
                            }
                            android.graphics.drawable.Drawable e58 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_me, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                            e58.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                            return e58;
                        }
                        android.graphics.drawable.Drawable e59 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_document, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                        e59.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                        return e59;
                    }
                    android.graphics.drawable.Drawable e66 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_quote_link, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                    e66.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                    return e66;
                }
                android.graphics.drawable.Drawable e67 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_music_new, context.getResources().getColor(com.tencent.mm.R.color.BW_BG_5A));
                e67.setBounds(0, 0, i65.a.a(context, 16.0f), i65.a.a(context, 16.0f));
                return e67;
            default:
                return null;
        }
    }

    public static android.graphics.drawable.Drawable h(android.content.Context context, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        java.lang.String U1 = f9Var.U1();
        if (com.tencent.mm.sdk.platformtools.t8.K0(U1)) {
            return null;
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(U1);
        return g(context, f9Var.getType(), cVar);
    }

    public static java.lang.String i(android.content.Context context, int i17, java.lang.String str, boolean z17) {
        java.lang.String j17 = j(context, i17, str, z17);
        return !com.tencent.mm.sdk.platformtools.t8.K0(j17) ? j17.replace('\n', ' ') : j17;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x00de. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x00e1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String j(android.content.Context r16, int r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti3.i.j(android.content.Context, int, java.lang.String, boolean):java.lang.String");
    }

    public static boolean k(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.storage.z3 n17;
        return (f9Var == null || (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f9Var.Q0(), true)) == null || com.tencent.mm.storage.z3.K3(f9Var.Q0()) || n17.k2()) ? false : true;
    }

    public static boolean l(java.lang.String str, android.content.Context context) {
        return (str == null || str.equals("") || str.equals(context.getResources().getString(com.tencent.mm.R.string.gzt))) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x003a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(com.tencent.mm.storage.f9 r10) {
        /*
            r0 = -1
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r10.getType()
            r2 = 15
            r3 = 12
            r4 = 3
            r5 = 2
            r6 = 6
            r7 = 4
            r8 = 1
            switch(r1) {
                case 3: goto L63;
                case 13: goto L63;
                case 23: goto L63;
                case 33: goto L63;
                case 39: goto L63;
                case 42: goto L62;
                case 43: goto L61;
                case 44: goto L61;
                case 47: goto L60;
                case 48: goto L5f;
                case 49: goto L1b;
                case 62: goto L61;
                case 66: goto L62;
                case 1048625: goto L1b;
                case 268435505: goto L63;
                case 436207665: goto L1b;
                case 754974769: goto L1b;
                case 771751985: goto L62;
                case 805306417: goto L1b;
                case 822083633: goto L1b;
                case 939524145: goto L62;
                case 973078577: goto L1b;
                case 974127153: goto L1b;
                case 975175729: goto L1b;
                case 1040187441: goto L1a;
                case 1090519089: goto L1b;
                case 1140850737: goto L1b;
                case 1157627953: goto L62;
                case 1174405169: goto L1b;
                case 1224736817: goto L1b;
                case 1241514033: goto L1b;
                case 1409286193: goto L1a;
                case 1426063409: goto L19;
                case 1442840625: goto L16;
                case 1476395057: goto L15;
                default: goto L14;
            }
        L14:
            goto L64
        L15:
            return r2
        L16:
            r10 = 13
            return r10
        L19:
            return r3
        L1a:
            return r6
        L1b:
            java.lang.String r10 = r10.j()
            ot0.q r10 = ot0.q.v(r10)
            if (r10 == 0) goto L64
            int r1 = r10.f348666i
            if (r1 == r4) goto L5e
            if (r1 == r7) goto L5d
            r4 = 9
            r5 = 5
            if (r1 == r5) goto L5c
            if (r1 == r6) goto L5a
            r9 = 92
            if (r1 == r9) goto L5e
            r9 = 93
            if (r1 == r9) goto L59
            switch(r1) {
                case 8: goto L58;
                case 33: goto L55;
                case 36: goto L55;
                case 44: goto L55;
                case 48: goto L55;
                case 51: goto L52;
                case 63: goto L52;
                case 65: goto L52;
                case 74: goto L5a;
                case 76: goto L5e;
                case 82: goto L55;
                case 88: goto L52;
                case 101: goto L51;
                case 106: goto L52;
                case 113: goto L52;
                case 120: goto L4e;
                case 2001: goto L43;
                default: goto L3d;
            }
        L3d:
            switch(r1) {
                case 129: goto L52;
                case 130: goto L5a;
                case 131: goto L5a;
                case 132: goto L42;
                case 133: goto L41;
                default: goto L40;
            }
        L40:
            goto L64
        L41:
            return r2
        L42:
            return r7
        L43:
            java.lang.String r0 = "1001"
            java.lang.String r10 = r10.f348700q1
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L51
            return r5
        L4e:
            r10 = 14
            return r10
        L51:
            return r4
        L52:
            r10 = 8
            return r10
        L55:
            r10 = 10
            return r10
        L58:
            return r8
        L59:
            return r3
        L5a:
            r10 = 7
            return r10
        L5c:
            return r4
        L5d:
            return r5
        L5e:
            return r6
        L5f:
            return r4
        L60:
            return r8
        L61:
            return r5
        L62:
            return r7
        L63:
            return r8
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ti3.i.m(com.tencent.mm.storage.f9):int");
    }

    public static android.graphics.Bitmap n(android.content.Context context, android.graphics.Bitmap bitmap, int i17, int i18) {
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.MsgQuoteHelp", "scaleQuoteImage in bitmap is null");
            return null;
        }
        float f17 = i18 / i17;
        int e17 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479714d7);
        int e18 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479718db);
        if (f17 > 0.0f && f17 < 0.5d) {
            e18 = (int) (e17 / f17);
        } else if (f17 < 0.5d || f17 >= 1.0f) {
            if (f17 >= 1.0f && f17 < 2.0f) {
                e17 = (int) (e18 / f17);
            } else if (f17 >= 2.0f) {
                e18 = (int) (e17 * f17);
            } else {
                e17 = 0;
                e18 = 0;
            }
            int i19 = e17;
            e17 = e18;
            e18 = i19;
        } else {
            e17 = (int) (e18 * f17);
        }
        if (e17 <= 0 || e18 <= 0) {
            return null;
        }
        return android.graphics.Bitmap.createScaledBitmap(bitmap, e18, e17, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:133:0x030e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0434  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o(final android.content.Context r22, ti3.m r23, com.tencent.mm.ui.tools.e3 r24, final com.tencent.mm.storage.f9 r25, final boolean r26) {
        /*
            Method dump skipped, instructions count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti3.i.o(android.content.Context, ti3.m, com.tencent.mm.ui.tools.e3, com.tencent.mm.storage.f9, boolean):boolean");
    }

    public static void p(android.widget.ImageView imageView) {
        imageView.setClipToOutline(true);
        imageView.setBackgroundResource(com.tencent.mm.R.drawable.apz);
    }

    public static void q(android.widget.ImageView imageView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            imageView.setImageDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.bhm));
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        }
    }

    public static void r(android.widget.ImageView imageView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            imageView.setImageDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.bgo));
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
        }
    }
}
