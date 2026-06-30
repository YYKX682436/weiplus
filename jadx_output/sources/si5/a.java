package si5;

/* loaded from: classes.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final si5.e a(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.storage.z3 contact, p13.l lVar, p13.r rVar, com.tencent.mm.storage.a3 chatroomMember) {
        java.lang.Object obj;
        java.lang.CharSequence charSequence;
        java.lang.String l17;
        java.lang.Object bj6;
        java.lang.CharSequence concat;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(chatroomMember, "chatroomMember");
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = contact.d1();
        java.lang.String str = chatroomMember.field_chatroomname;
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(d17, str);
        jz5.f0 f0Var = null;
        java.lang.String str2 = lVar != null ? lVar.f351114e : null;
        if (lVar == null || str2 == null) {
            obj = null;
            charSequence = null;
        } else {
            if (kotlin.jvm.internal.o.b(f17, lVar.f351115f)) {
                android.text.SpannableString bj7 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, f17, i65.a.h(activity, com.tencent.mm.R.dimen.f479897ia));
                p13.i iVar = new p13.i();
                iVar.f351093a = bj7;
                iVar.f351094b = rVar;
                iVar.f351095c = lVar.f351118i;
                iVar.f351096d = lVar.f351119j;
                bj6 = o13.q.e(iVar).f351105a;
                concat = null;
            } else {
                bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, f17, i65.a.h(activity, com.tencent.mm.R.dimen.f479897ia));
                android.text.SpannableString bj8 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, lVar.f351115f, i65.a.h(activity, com.tencent.mm.R.dimen.f479853h2));
                p13.i iVar2 = new p13.i();
                iVar2.f351093a = bj8;
                iVar2.f351094b = rVar;
                iVar2.f351095c = lVar.f351118i;
                iVar2.f351096d = lVar.f351119j;
                concat = android.text.TextUtils.concat(lVar.f351116g, o13.q.e(iVar2).f351105a);
            }
            charSequence = concat;
            obj = bj6;
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            obj = d(activity, f17, i65.a.h(activity, com.tencent.mm.R.dimen.f479897ia));
            if (!kotlin.jvm.internal.o.b(f17, contact.P0())) {
                java.lang.CharSequence concat2 = android.text.TextUtils.concat(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.icz), d(activity, contact.P0(), i65.a.h(activity, com.tencent.mm.R.dimen.f479930ja)));
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d18 = contact.d1();
                ((sg3.a) v0Var2).getClass();
                if (f17.equals(c01.a2.a(d18)) && (l17 = c01.v1.l(contact.d1(), chatroomMember.field_chatroomname)) != null) {
                    if (l17.length() > 0) {
                        concat2 = android.text.TextUtils.concat(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ict), l17);
                    }
                }
                charSequence = concat2;
            }
        }
        si5.e eVar = new si5.e();
        eVar.f408329a = (java.lang.CharSequence) obj;
        eVar.f408330b = charSequence;
        return eVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0044. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.CharSequence] */
    public final si5.e b(androidx.appcompat.app.AppCompatActivity activity, p13.r rVar, com.tencent.mm.storage.z3 contact, p13.y yVar, com.tencent.mm.storage.a3 a3Var) {
        java.lang.CharSequence charSequence;
        jz5.f0 f0Var;
        java.lang.Object obj;
        java.lang.String string;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        java.lang.CharSequence charSequence2;
        boolean z28;
        boolean z29;
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contact, "contact");
        if (yVar == null || rVar == null) {
            charSequence = null;
            f0Var = null;
            obj = null;
        } else {
            android.content.res.Resources resources = activity.getResources();
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String d17 = contact.d1();
            ((sg3.a) v0Var).getClass();
            java.lang.String c17 = c01.a2.c(contact, d17);
            int i17 = yVar.f351185c;
            if (i17 == 11) {
                java.util.List d18 = ((com.tencent.mm.plugin.fts.p) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).fj()).d(contact.D0());
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.lang.String[] phrases = rVar.f351131c;
                kotlin.jvm.internal.o.f(phrases, "phrases");
                for (java.lang.String str2 : phrases) {
                    java.util.Iterator it = ((java.util.ArrayList) d18).iterator();
                    while (it.hasNext()) {
                        java.lang.String str3 = (java.lang.String) it.next();
                        java.util.HashMap hashMap = o13.n.f342241a;
                        java.lang.String c18 = o13.s.c(str3.toLowerCase());
                        kotlin.jvm.internal.o.d(c18);
                        kotlin.jvm.internal.o.d(str2);
                        if (r26.n0.B(c18, str2, false)) {
                            stringBuffer.append(str3);
                            stringBuffer.append(",");
                        }
                    }
                }
                stringBuffer.trimToSize();
                java.lang.String substring = stringBuffer.length() == 0 ? "" : stringBuffer.substring(0, stringBuffer.length() - 1);
                string = resources.getString(com.tencent.mm.R.string.f492945id4);
                z17 = false;
                z18 = false;
                z19 = false;
                r1 = substring;
                z27 = true;
                charSequence2 = null;
            } else if (i17 != 38) {
                switch (i17) {
                    case 1:
                        z17 = false;
                        z28 = false;
                        z29 = true;
                        charSequence2 = null;
                        z27 = false;
                        z18 = z29;
                        z19 = z28;
                        string = null;
                        break;
                    case 2:
                        z17 = false;
                        z28 = true;
                        z29 = true;
                        charSequence2 = null;
                        z27 = false;
                        z18 = z29;
                        z19 = z28;
                        string = null;
                        break;
                    case 3:
                        z17 = true;
                        z28 = true;
                        z29 = true;
                        charSequence2 = null;
                        z27 = false;
                        z18 = z29;
                        z19 = z28;
                        string = null;
                        break;
                    case 4:
                        str = contact.f236589y1;
                        string = resources.getString(com.tencent.mm.R.string.icv);
                        charSequence2 = null;
                        z18 = false;
                        z19 = false;
                        z27 = true;
                        r1 = str;
                        z17 = false;
                        break;
                    case 5:
                        str = contact.P0();
                        string = resources.getString(com.tencent.mm.R.string.icz);
                        charSequence2 = null;
                        z18 = false;
                        z19 = false;
                        z27 = true;
                        r1 = str;
                        z17 = false;
                        break;
                    case 6:
                        java.lang.String P0 = contact.P0();
                        string = resources.getString(com.tencent.mm.R.string.icz);
                        charSequence2 = null;
                        z18 = false;
                        z27 = true;
                        z19 = true;
                        r1 = P0;
                        z17 = false;
                        break;
                    case 7:
                        java.lang.String P02 = contact.P0();
                        string = resources.getString(com.tencent.mm.R.string.icz);
                        charSequence2 = null;
                        z18 = false;
                        z27 = true;
                        z19 = true;
                        r1 = P02;
                        z17 = true;
                        break;
                    default:
                        switch (i17) {
                            case 15:
                                str = contact.t0();
                                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                    str = contact.d1();
                                }
                                string = resources.getString(com.tencent.mm.R.string.f492946id5);
                                charSequence2 = null;
                                z18 = false;
                                z19 = false;
                                z27 = true;
                                r1 = str;
                                z17 = false;
                                break;
                            case 16:
                                str = yVar.f351190h;
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                    java.lang.String[] strArr = (java.lang.String[]) new r26.t("\u200b").g(str, 0).toArray(new java.lang.String[0]);
                                    int length = strArr.length;
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < length) {
                                            java.lang.String str4 = strArr[i18];
                                            java.lang.String originQuery = rVar.f351129a;
                                            kotlin.jvm.internal.o.f(originQuery, "originQuery");
                                            if (r26.i0.A(str4, originQuery, false, 2, null)) {
                                                str = str4;
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                }
                                string = resources.getString(com.tencent.mm.R.string.icy);
                                charSequence2 = null;
                                z18 = false;
                                z19 = false;
                                z27 = true;
                                r1 = str;
                                z17 = false;
                                break;
                            case 17:
                            case 18:
                                str = yVar.f351190h;
                                string = resources.getString(com.tencent.mm.R.string.icw);
                                charSequence2 = null;
                                z18 = false;
                                z19 = false;
                                z27 = true;
                                r1 = str;
                                z17 = false;
                                break;
                            default:
                                z17 = false;
                                z28 = false;
                                z29 = false;
                                charSequence2 = null;
                                z27 = false;
                                z18 = z29;
                                z19 = z28;
                                string = null;
                                break;
                        }
                }
            } else {
                p75.n0 n0Var = dm.x1.N;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                linkedList.add(dm.x1.R);
                p75.d dVar = dm.x1.Q;
                java.lang.String d19 = contact.d1();
                kotlin.jvm.internal.o.f(d19, "getUsername(...)");
                p75.m0 j17 = dVar.j(d19);
                p75.i0 g17 = dm.x1.N.g(linkedList);
                g17.f352657d = j17;
                g17.f352659f = linkedList2;
                g17.f352660g = linkedList3;
                g17.c(1, 0);
                java.lang.String p17 = g17.a().p(gm0.j1.u().f273153f);
                r1 = p17 != null ? com.tencent.mm.plugin.fts.ui.n3.d(activity, yVar.f351196n, (java.lang.String[]) r26.n0.f0(p17, new java.lang.String[]{";"}, false, 0, 6, null).toArray(new java.lang.String[0]), rVar, com.tencent.mm.plugin.fts.ui.d.f138036e, contact.d1()) : null;
                string = resources.getString(com.tencent.mm.R.string.icx);
                charSequence2 = r1;
                z17 = false;
                z19 = false;
                r1 = "";
                z27 = true;
                z18 = true;
            }
            java.lang.Object bj6 = z18 ? o13.q.e(p13.i.d(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, c17, i65.a.h(activity, com.tencent.mm.R.dimen.f479897ia)), rVar, z19, z17)).f351105a : ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, c17, i65.a.h(activity, com.tencent.mm.R.dimen.f479897ia));
            if (!z27) {
                charSequence2 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, r1, i65.a.h(activity, com.tencent.mm.R.dimen.f479853h2));
            } else if (charSequence2 == null) {
                charSequence2 = o13.q.e(p13.i.d(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(activity, r1, i65.a.h(activity, com.tencent.mm.R.dimen.f479853h2)), rVar, z19, z17)).f351105a;
            }
            java.lang.CharSequence concat = (com.tencent.mm.sdk.platformtools.t8.K0(string) || charSequence2 == null) ? charSequence2 : android.text.TextUtils.concat(string, charSequence2);
            obj = bj6;
            java.lang.CharSequence charSequence3 = concat;
            f0Var = jz5.f0.f302826a;
            charSequence = charSequence3;
        }
        if (f0Var == null) {
            obj = d(activity, ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(contact), i65.a.h(activity, com.tencent.mm.R.dimen.f479897ia));
        }
        si5.e eVar = new si5.e();
        eVar.f408329a = (java.lang.CharSequence) obj;
        eVar.f408330b = charSequence;
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010b, code lost:
    
        if (r14 == null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final si5.d c(int r12, com.tencent.mm.storage.z3 r13, com.tencent.mm.storage.a3 r14) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si5.a.c(int, com.tencent.mm.storage.z3, com.tencent.mm.storage.a3):si5.d");
    }

    public final android.text.SpannableString d(android.content.Context context, java.lang.String str, int i17) {
        return ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, i17);
    }
}
