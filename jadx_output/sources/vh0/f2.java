package vh0;

@j95.b
/* loaded from: classes8.dex */
public final class f2 extends i95.w implements vh0.d1 {
    public java.util.List Ai(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return Bi(username, null);
        }
        android.os.Bundle bundle = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(username), vh0.z1.class);
        bundle.setClassLoader(vh0.z1.class.getClassLoader());
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("agreements");
        return parcelableArrayList == null ? kz5.p0.f313996d : parcelableArrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r1 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Bi(java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh0.f2.Bi(java.lang.String, java.util.List):java.util.List");
    }

    public void Di(java.lang.String username, com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo agreement, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(agreement, "agreement");
        Ni(username, kz5.b0.c(agreement), z17);
    }

    public void Ni(java.lang.String username, java.util.Collection agreements, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(agreements, "agreements");
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.setClassLoader(vh0.a2.class.getClassLoader());
            bundle.putString(dm.i4.COL_USERNAME, username);
            bundle.putParcelableArrayList("agreements", new java.util.ArrayList<>(agreements));
            bundle.putBoolean("agreed", z17);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, vh0.a2.class, null);
            return;
        }
        java.lang.String k17 = gm0.j1.b().k();
        if (z17) {
            java.util.Collection<com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo> collection = agreements;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
            for (com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo iYuanBaoAgreement$AgreementInfo : collection) {
                r45.q6 q6Var = new r45.q6();
                q6Var.f383699d = iYuanBaoAgreement$AgreementInfo.f67859d;
                q6Var.f383700e = iYuanBaoAgreement$AgreementInfo.f67862g;
                arrayList.add(q6Var);
            }
            xh0.a.z0().J0(k17, arrayList);
        } else {
            xh0.a.z0().y0(k17);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = agreements.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (!arrayList2.isEmpty()) {
                    com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo[] iYuanBaoAgreement$AgreementInfoArr = (com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo[]) arrayList2.toArray(new com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo[0]);
                    com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo[] iYuanBaoAgreement$AgreementInfoArr2 = (com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo[]) java.util.Arrays.copyOf(iYuanBaoAgreement$AgreementInfoArr, iYuanBaoAgreement$AgreementInfoArr.length);
                    com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                    lVar.f70666c = "/cgi-bin/micromsg-bin/modserviceagreement";
                    lVar.f70667d = 13262;
                    r45.to4 to4Var = new r45.to4();
                    to4Var.f386633d = z17 ? 1 : 2;
                    java.util.LinkedList linkedList = to4Var.f386634e;
                    for (com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo iYuanBaoAgreement$AgreementInfo2 : iYuanBaoAgreement$AgreementInfoArr2) {
                        r45.r6 r6Var = new r45.r6();
                        r6Var.f384567d = iYuanBaoAgreement$AgreementInfo2.f67859d;
                        r6Var.f384568e = iYuanBaoAgreement$AgreementInfo2.f67862g;
                        linkedList.add(r6Var);
                    }
                    lVar.f70664a = to4Var;
                    lVar.f70665b = new r45.uo4();
                    com.tencent.mm.modelbase.z2.d(lVar.a(), vh0.e2.f436852d, false);
                    return;
                }
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo iYuanBaoAgreement$AgreementInfo3 = (com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo) next;
            int i19 = iYuanBaoAgreement$AgreementInfo3.f67862g;
            if (i19 <= 0 || i19 == Integer.MAX_VALUE) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatBotAgreementService", "[!] agreement " + i17 + " with version " + iYuanBaoAgreement$AgreementInfo3.f67862g + " is special and shouldn't notify sign status to server.");
                r4 = 0;
            }
            if (r4 != 0) {
                arrayList2.add(next);
            }
            i17 = i18;
        }
    }

    public boolean wi(android.app.Activity activity, android.view.ViewGroup layout, java.lang.String chatBotUsername, java.util.List agreements) {
        int i17;
        android.app.Activity ui6 = activity;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(chatBotUsername, "chatBotUsername");
        kotlin.jvm.internal.o.g(agreements, "agreements");
        boolean z17 = false;
        if (agreements.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatBotAgreementService", "[!] agreements is empty, skip attaching.");
            return false;
        }
        android.view.View inflate = activity.getLayoutInflater().inflate(com.tencent.mm.R.layout.e0g, layout, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.vjh);
        textView.setMovementMethod(new zh0.d());
        textView.setHighlightColor(0);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.Iterator it = agreements.iterator();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            boolean z18 = true;
            if (!it.hasNext()) {
                textView.setText(spannableStringBuilder);
                layout.addView(viewGroup);
                return true;
            }
            java.lang.Object next = it.next();
            int i27 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo iYuanBaoAgreement$AgreementInfo = (com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo) next;
            if (i18 > 0) {
                spannableStringBuilder.append((java.lang.CharSequence) com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
                int i28 = i19 + 3;
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(ui6.getColor(com.tencent.mm.R.color.ah7)), i19, i28, 33);
                i17 = i28;
            } else {
                i17 = i19;
            }
            if (iYuanBaoAgreement$AgreementInfo.f67863h || iYuanBaoAgreement$AgreementInfo.f67864i) {
                z18 = z17;
            }
            ai0.h hVar = new ai0.h(ui6, com.tencent.mm.R.drawable.d88, 2, z18);
            int i29 = i17;
            ai0.a aVar = new ai0.a(ui6.getColor(com.tencent.mm.R.color.f478524a5), ui6.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1), false, new vh0.b2(iYuanBaoAgreement$AgreementInfo, hVar, this, chatBotUsername, activity));
            java.lang.String str = "《" + iYuanBaoAgreement$AgreementInfo.f67860e + (char) 12299;
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.setSpan(aVar, i29, i29 + str.length(), 33);
            int length = i29 + str.length();
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            i19 = length + 1;
            spannableStringBuilder.setSpan(hVar, length, i19, 33);
            ui6 = activity;
            z17 = false;
            it = it;
            i18 = i27;
        }
    }
}
