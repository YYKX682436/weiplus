package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class u9 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f190683c = kz5.c1.k(new jz5.l('(', ")"), new jz5.l((char) 65288, "）"), new jz5.l((char) 12304, "】"), new jz5.l('<', ">"));

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f190684d = kz5.c0.i(".", ".", "、", ")", "）", "】");

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190685a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f190686b;

    public u9(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        kotlin.jvm.internal.o.g(chatFooter, "chatFooter");
        this.f190685a = chatFooter;
    }

    public static final boolean a(com.tencent.mm.pluginsdk.ui.chat.u9 u9Var, int i17, fl5.i iVar) {
        com.tencent.mm.pluginsdk.ui.chat.s9 b17;
        if (i17 != 0) {
            u9Var.getClass();
            if (i17 != 1) {
                return false;
            }
            kotlin.jvm.internal.o.g(iVar, "<this>");
            if (kotlin.jvm.internal.o.b(iVar.getTag(com.tencent.mm.R.id.bkv), java.lang.Boolean.TRUE)) {
                iVar.setTag(com.tencent.mm.R.id.bkv, java.lang.Boolean.FALSE);
                return false;
            }
            int selectionStart = iVar.getSelectionStart();
            android.text.Editable text = iVar.getText();
            if (text == null || r26.n0.N(text)) {
                b17 = com.tencent.mm.pluginsdk.ui.chat.s9.f190648j;
            } else {
                java.lang.String v17 = r26.i0.v(text.subSequence(0, selectionStart).toString(), "\u200b", "", false, 4, null);
                if (v17.charAt(v17.length() - 1) != '\n') {
                    b17 = com.tencent.mm.pluginsdk.ui.chat.s9.f190648j;
                } else {
                    java.lang.String substring = v17.substring(0, v17.length() - 1);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    b17 = u9Var.b(substring);
                }
            }
            if (!(!r26.n0.N((java.lang.String) ((jz5.n) b17.f190657i).getValue()))) {
                return false;
            }
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.Character ch6 = b17.f190650b;
                if (ch6 != null) {
                    sb6.append(ch6.charValue());
                }
                sb6.append((java.lang.String) ((jz5.n) b17.f190657i).getValue());
                java.lang.String str = b17.f190651c;
                if (str != null) {
                    sb6.append(str);
                }
                if (b17.f190654f) {
                    sb6.append(" ");
                }
                text.insert(selectionStart, sb6);
                int i18 = !u9Var.f190686b ? 1 : 0;
                java.lang.String a17 = b17.a();
                com.tencent.mm.autogen.mmdata.rpt.FullScreenSeqAutoCompleteStruct fullScreenSeqAutoCompleteStruct = new com.tencent.mm.autogen.mmdata.rpt.FullScreenSeqAutoCompleteStruct();
                fullScreenSeqAutoCompleteStruct.f58267d = 2;
                fullScreenSeqAutoCompleteStruct.f58268e = fullScreenSeqAutoCompleteStruct.b("CompleteSeq", a17, true);
                fullScreenSeqAutoCompleteStruct.f58269f = i18;
                java.lang.String n17 = fullScreenSeqAutoCompleteStruct.n();
                kotlin.jvm.internal.o.f(n17, "toShowString(...)");
                com.tencent.mars.xlog.Log.i("SAInputReporter", "report%s %s", 27027, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
                fullScreenSeqAutoCompleteStruct.k();
                if (!u9Var.f190686b) {
                    u9Var.f190686b = true;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("ChatFooterKtHelper", th6, "edt insert err", new java.lang.Object[0]);
                return false;
            }
        } else {
            if (!u9Var.d(iVar)) {
                return false;
            }
            iVar.setTag(com.tencent.mm.R.id.bkv, java.lang.Boolean.TRUE);
        }
        return true;
    }

    public final com.tencent.mm.pluginsdk.ui.chat.s9 b(java.lang.CharSequence charSequence) {
        java.lang.String str;
        if (charSequence == null || r26.n0.N(charSequence)) {
            return com.tencent.mm.pluginsdk.ui.chat.s9.f190648j;
        }
        java.lang.String obj = charSequence.toString();
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i17 = length - 1;
                if (charSequence.charAt(length) == 8203) {
                    break;
                }
                if (i17 < 0) {
                    break;
                }
                length = i17;
            }
        }
        length = -1;
        if (length == -1) {
            length = charSequence.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i18 = length - 1;
                    if (charSequence.charAt(length) == '\n') {
                        break;
                    }
                    if (i18 < 0) {
                        break;
                    }
                    length = i18;
                }
            }
            length = -1;
        }
        int i19 = length != -1 ? length + 1 : 0;
        java.lang.Character valueOf = obj.length() > i19 ? java.lang.Character.valueOf(obj.charAt(i19)) : null;
        java.util.Map map = f190683c;
        if (map.containsKey(valueOf)) {
            str = (java.lang.String) map.get(valueOf);
            i19++;
        } else {
            valueOf = null;
            str = null;
        }
        if (i19 == -1) {
            return com.tencent.mm.pluginsdk.ui.chat.s9.f190648j;
        }
        if (str != null) {
            return c(i19, obj, valueOf, str);
        }
        java.util.Iterator it = f190684d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.ui.chat.s9 c17 = c(i19, obj, null, (java.lang.String) it.next());
            if (!r26.n0.N((java.lang.String) ((jz5.n) c17.f190657i).getValue())) {
                return c17;
            }
        }
        return c(i19, obj, null, null);
    }

    public final com.tencent.mm.pluginsdk.ui.chat.s9 c(int i17, java.lang.String str, java.lang.Character ch6, java.lang.String str2) {
        kotlin.jvm.internal.o.g(str, "str");
        int L = str2 != null ? r26.n0.L(str, str2, i17, false, 4, null) : i17 + 1;
        if (L == -1 || i17 >= L || str.length() < L) {
            com.tencent.mm.pluginsdk.ui.chat.s9 s9Var = com.tencent.mm.pluginsdk.ui.chat.s9.f190648j;
            return com.tencent.mm.pluginsdk.ui.chat.s9.f190648j;
        }
        java.lang.String obj = str.subSequence(i17, L).toString();
        if (ch6 != null) {
            i17--;
        }
        int i18 = i17;
        boolean z17 = false;
        int length = L + (str2 != null ? str2.length() : 0);
        if (str.length() > length && str.charAt(length) == ' ') {
            z17 = true;
        }
        boolean z18 = z17;
        int i19 = length + (z18 ? 1 : 0);
        return new com.tencent.mm.pluginsdk.ui.chat.s9(obj, ch6, str2, i18, i19, z18, str.length() > i19 ? java.lang.Character.valueOf(str.charAt(i19)) : null);
    }

    public final boolean d(fl5.i edt) {
        int i17;
        kotlin.jvm.internal.o.g(edt, "edt");
        int selectionStart = edt.getSelectionStart();
        android.text.Editable text = edt.getText();
        kotlin.jvm.internal.o.d(text);
        com.tencent.mm.pluginsdk.ui.chat.s9 b17 = b(text.subSequence(0, selectionStart).toString());
        if ((!r26.n0.N((java.lang.String) ((jz5.n) b17.f190657i).getValue())) && (i17 = b17.f190653e) == selectionStart) {
            try {
                text.delete(b17.f190652d, i17);
                return true;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("ChatFooterKtHelper", th6, "edt delete err", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
