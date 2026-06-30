package l41;

@j95.b
/* loaded from: classes4.dex */
public class q2 extends i95.w implements j41.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f315906d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final db5.n f315907e = new l41.l2(this);

    /* renamed from: f, reason: collision with root package name */
    public final db5.n f315908f = new l41.m2(this);

    public q2() {
        com.tencent.mm.vfs.w6.u("wcf://openim/");
        u41.c cVar = new u41.c();
        cVar.field_appid = "3552365301";
        cVar.field_language = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        cVar.field_subType = 0;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "subType");
        if (cVar.systemRowid == -1) {
            wi("3552365301", com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), "", 0);
        }
    }

    public java.lang.String Ai(l75.w0 w0Var, java.lang.String str, java.lang.String str2) {
        if (w0Var == null) {
            return "";
        }
        java.lang.Object obj = w0Var.f316976d;
        if (!(obj instanceof u41.k)) {
            return "";
        }
        u41.k kVar = (u41.k) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.OpenImResourceMgr", "checkMatchOpenIMDescWording, openImAppId: %s, input openImAppId: %s, wordingId: %s, input wordingId: %s, wording: %s", kVar.field_appid, str, kVar.field_wordingId, str2, kVar.field_wording);
        return (com.tencent.mm.sdk.platformtools.t8.D0(kVar.field_appid, str) && com.tencent.mm.sdk.platformtools.t8.D0(kVar.field_wordingId, str2)) ? kVar.field_wording : "";
    }

    public void Bi(java.lang.String str, java.lang.String str2, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        u41.c cVar = new u41.c();
        cVar.field_appid = str;
        cVar.field_language = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        cVar.field_subType = i17;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "subType");
        stringBuffer.append(java.lang.String.format("openIMAppIdinfo.field_updateTime %s | ", java.lang.Long.valueOf(cVar.field_updateTime)));
        boolean z17 = true;
        boolean z18 = cVar.systemRowid == -1 || com.tencent.mm.sdk.platformtools.t8.H1(cVar.field_updateTime) > 172800;
        if (!z18 && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            u41.k kVar = new u41.k();
            kVar.field_appid = str;
            kVar.field_language = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            kVar.field_wordingId = str2;
            ((i41.l) i95.n0.c(i41.l.class)).Ui().get(kVar, "appid", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "wordingId");
            if (kVar.systemRowid != -1 && com.tencent.mm.sdk.platformtools.t8.H1(kVar.field_updateTime) <= 172800) {
                z17 = z18;
            }
            stringBuffer.append(java.lang.String.format("wordingInfo.field_updateTime %s | ", java.lang.Long.valueOf(kVar.field_updateTime)));
            z18 = z17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.OpenImResourceMgr", "checkRecUpdate openimAppId %s wordingId %s needUpdate %s subType: %s, logBuffer: %s", str, str2, java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i17), stringBuffer.toString());
        if (z18) {
            wi(str, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), str2, i17);
        }
    }

    public void Di() {
        ((i41.l) i95.n0.c(i41.l.class)).Ai().f424625d.delete("OpenIMAppIdInfo", null, null);
        ((i41.l) i95.n0.c(i41.l.class)).wi().f424622d.delete("OpenIMAccTypeInfo", null, null);
        ((i41.l) i95.n0.c(i41.l.class)).Ui().f424637d.delete("OpenIMWordingInfo", null, null);
    }

    public java.lang.String Ni(java.lang.String str, java.lang.String str2, j41.a0 a0Var) {
        u41.c cVar = new u41.c();
        cVar.field_appid = str;
        cVar.field_subType = 0;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", "subType");
        if (cVar.systemRowid == -1) {
            wi(str, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), "", 0);
            return null;
        }
        java.lang.String Ui = Ui(cVar.field_acctTypeId, str2, a0Var, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        return Ui == null ? Ui(cVar.field_acctTypeId, str2, a0Var, "en") : Ui;
    }

    public java.lang.String Ri(java.lang.String str, java.lang.String str2, j41.a0 a0Var) {
        java.lang.String Ui = Ui(str, str2, a0Var, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        return Ui == null ? Ui(str, str2, a0Var, "en") : Ui;
    }

    public final java.lang.String Ui(java.lang.String str, java.lang.String str2, j41.a0 a0Var, java.lang.String str3) {
        u41.a aVar = new u41.a();
        aVar.field_acctTypeId = str;
        aVar.field_language = str3;
        ((i41.l) i95.n0.c(i41.l.class)).wi().get(aVar, "acctTypeId", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
        if (aVar.systemRowid == -1) {
            return null;
        }
        if (a0Var == j41.a0.TYPE_WORDING) {
            java.util.Iterator it = aVar.field_accTypeRec.f377488e.iterator();
            while (it.hasNext()) {
                r45.l15 l15Var = (r45.l15) it.next();
                if (str2.equals(l15Var.f379074d)) {
                    return l15Var.f379075e;
                }
            }
            return null;
        }
        java.util.Iterator it6 = aVar.field_accTypeRec.f377489f.iterator();
        while (it6.hasNext()) {
            r45.j15 j15Var = (r45.j15) it6.next();
            if (str2.equals(j15Var.f377494d)) {
                return j15Var.f377495e;
            }
        }
        return null;
    }

    public java.lang.String Vi(java.lang.String str, java.lang.String str2, j41.a0 a0Var, int i17) {
        java.lang.String Zi = Zi(str, str2, a0Var, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), i17);
        return Zi == null ? Zi(str, str2, a0Var, "en", i17) : Zi;
    }

    public final java.lang.String Zi(java.lang.String str, java.lang.String str2, j41.a0 a0Var, java.lang.String str3, int i17) {
        u41.c cVar = new u41.c();
        cVar.field_appid = str;
        cVar.field_language = str3;
        cVar.field_subType = i17;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "subType");
        if (cVar.systemRowid == -1) {
            wi(str, str3, "", i17);
            return null;
        }
        if (a0Var == j41.a0.TYPE_WORDING) {
            java.util.Iterator it = cVar.field_appRec.f389851e.iterator();
            while (it.hasNext()) {
                r45.l15 l15Var = (r45.l15) it.next();
                if (str2.equals(l15Var.f379074d)) {
                    return l15Var.f379075e;
                }
            }
            return null;
        }
        java.util.Iterator it6 = cVar.field_appRec.f389852f.iterator();
        while (it6.hasNext()) {
            r45.j15 j15Var = (r45.j15) it6.next();
            if (str2.equals(j15Var.f377494d)) {
                return j15Var.f377495e;
            }
        }
        return null;
    }

    public java.lang.CharSequence aj(android.content.Context context, java.lang.CharSequence charSequence) {
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            charSequence = "";
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new android.text.style.ImageSpan(drawable), charSequence.length(), charSequence.length() + 1, 33);
        return spannableStringBuilder;
    }

    public int bj(java.lang.String str, int i17) {
        u41.c cVar = new u41.c();
        cVar.field_appid = str;
        cVar.field_subType = i17;
        ((i41.l) i95.n0.c(i41.l.class)).Ai().get(cVar, "appid", "subType");
        if (cVar.systemRowid != -1) {
            return cVar.field_appRec.f389850d;
        }
        wi(str, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), "", i17);
        return 0;
    }

    public android.graphics.Bitmap cj(java.lang.String str) {
        l41.o2 o2Var = new l41.o2(this, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342082f = "wcf://openim/" + kk.k.g(str.getBytes());
        m11.b1.Bi().i(str, null, fVar.a(), new l41.n2(this, o2Var));
        return o2Var.f315889a;
    }

    public java.lang.String fj(java.lang.String str, java.lang.String str2) {
        java.lang.String hj6 = hj(str, str2, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        return hj6 == null ? hj(str, str2, "en") : hj6;
    }

    public final java.lang.String hj(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        u41.k kVar = new u41.k();
        kVar.field_appid = str;
        kVar.field_language = str3;
        kVar.field_wordingId = str2;
        ((i41.l) i95.n0.c(i41.l.class)).Ui().get(kVar, "appid", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "wordingId");
        if (kVar.systemRowid != -1) {
            return kVar.field_wording;
        }
        wi(str, str3, str2, 0);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ij(android.content.Context context, android.widget.TextView textView, java.lang.CharSequence charSequence, java.lang.String str, java.lang.String str2, int i17) {
        android.text.SpannableString spannableString;
        if (textView instanceof com.tencent.mm.ui.base.EllipsizeTextView) {
            com.tencent.mm.ui.base.EllipsizeTextView ellipsizeTextView = (com.tencent.mm.ui.base.EllipsizeTextView) textView;
            java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(str, str2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(fj6)) {
                fj6 = "";
            } else if ("3552365301".equals(str)) {
                fj6 = "@" + fj6;
            }
            ellipsizeTextView.setLayoutCallback(this.f315907e);
            ellipsizeTextView.b(charSequence, fj6, com.tencent.mm.R.color.a0j, i17);
            return;
        }
        java.lang.String fj7 = fj(str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(fj7)) {
            spannableString = com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence);
        } else {
            if ("3552365301".equals(str)) {
                fj7 = " @" + fj7;
            }
            android.text.SpannableString i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) i18);
            android.text.SpannableString spannableString2 = new android.text.SpannableString(fj7);
            android.content.res.ColorStateList e17 = i65.a.e(context, com.tencent.mm.R.color.a0j);
            spannableString2.setSpan(new android.text.style.TextAppearanceSpan(null, 0, i17, e17, e17), 0, fj7.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableString2);
            spannableString = spannableStringBuilder;
        }
        textView.setText(spannableString);
    }

    public final void wi(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.OpenImResourceMgr", "try checkDoSceneGetRec openimAppId %s language %s wordingid %s, subType: %s", str, str2, str3, java.lang.Integer.valueOf(i17));
        java.lang.String str4 = str + str2 + i17;
        java.util.HashMap hashMap = this.f315906d;
        if (!hashMap.containsKey(str4)) {
            l41.p2 p2Var = new l41.p2(this, null);
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str3);
            java.util.LinkedList linkedList = p2Var.f315898b;
            if (!K0) {
                linkedList.add(str3);
            }
            hashMap.put(str + str2 + i17, p2Var);
            gm0.j1.n().f273288b.g(new l41.z(str, str2, linkedList, i17));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return;
        }
        l41.p2 p2Var2 = (l41.p2) hashMap.get(str + str2 + i17);
        if (p2Var2.f315897a.contains(str3) || p2Var2.f315898b.contains(str3)) {
            return;
        }
        p2Var2.f315897a.add(str3);
    }
}
