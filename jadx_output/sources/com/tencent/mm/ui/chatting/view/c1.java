package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f202885a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f202886b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f202887c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f202888d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f202889e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f202890f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f202891g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wepicker.RemindTimePickerRemake f202892h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f202893i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f202894j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f202895k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.view.h0 f202896l;

    /* renamed from: m, reason: collision with root package name */
    public java.util.Calendar f202897m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.MessageScheduleReportStruct f202898n;

    /* JADX WARN: Can't wrap try/catch for region: R(11:85|(1:87)(2:143|(1:145)(2:146|(1:148)(14:149|(3:152|(15:158|(1:160)(1:201)|161|(1:163)(2:198|(1:200))|164|(4:166|167|168|(7:170|(1:172)(1:182)|173|(1:175)(1:181)|176|(1:178)(1:180)|179)(3:183|(5:185|(1:187)(1:193)|188|(1:190)(1:192)|191)|194))|197|89|90|91|(8:93|(1:95)(1:132)|96|(1:98)(1:131)|(3:103|(1:106)|107)|130|(1:110)|(1:129)(1:113))(6:133|(3:135|(1:137)(1:140)|(1:139))|130|(0)|(0)|129)|108|(0)|(0)|129)(1:156)|150)|203|204|(0)|197|89|90|91|(0)(0)|108|(0)|(0)|129)))|88|89|90|91|(0)(0)|108|(0)|(0)|129) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0488, code lost:
    
        if ((!r6 || r0) == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0471, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0472, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Remind.MMRemindDatePickerRemake", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0450 A[Catch: Exception -> 0x0471, TryCatch #1 {Exception -> 0x0471, blocks: (B:91:0x0416, B:93:0x041e, B:95:0x0425, B:96:0x042b, B:98:0x0432, B:103:0x043f, B:106:0x0447, B:107:0x0449, B:133:0x0450, B:135:0x045e, B:137:0x0464, B:139:0x046c), top: B:90:0x0416 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x041e A[Catch: Exception -> 0x0471, TryCatch #1 {Exception -> 0x0471, blocks: (B:91:0x0416, B:93:0x041e, B:95:0x0425, B:96:0x042b, B:98:0x0432, B:103:0x043f, B:106:0x0447, B:107:0x0449, B:133:0x0450, B:135:0x045e, B:137:0x0464, B:139:0x046c), top: B:90:0x0416 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c1(android.content.Context r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.view.c1.<init>(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public final void a(java.util.Calendar calendar) {
        int i17 = ((calendar.get(12) + 4) / 5) * 5;
        if (i17 < 60) {
            calendar.set(12, i17);
        } else {
            calendar.add(11, 1);
            calendar.set(12, 0);
        }
    }

    public final boolean b(java.util.Calendar calendar, int i17, int i18) {
        if (1 <= i17 && i17 < 13) {
            if (1 <= i18 && i18 < 32) {
                int i19 = i17 - 1;
                if (calendar.get(2) == i19 && calendar.get(5) == i18) {
                    return false;
                }
                calendar.set(2, i19);
                calendar.set(5, i18);
                return true;
            }
        }
        return false;
    }

    public final long c(java.util.List list, com.tencent.mm.ui.widget.button.WeButton weButton, int i17, int i18) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.widget.button.WeButton weButton2 = (com.tencent.mm.ui.widget.button.WeButton) it.next();
            if (weButton2 != null) {
                weButton2.setSelected(false);
            }
        }
        weButton.setSelected(true);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(i18, i17);
        d(calendar);
        java.lang.Object clone = calendar.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type java.util.Calendar");
        this.f202897m = (java.util.Calendar) clone;
        com.tencent.mars.xlog.Log.i("MicroMsg.Remind.MMRemindDatePickerRemake", "Set quick select time: " + calendar.getTime());
        return calendar.getTimeInMillis();
    }

    public final long d(java.util.Calendar calendar) {
        java.lang.String str;
        boolean z17;
        com.tencent.mm.ui.chatting.view.c1 c1Var;
        boolean z18;
        java.lang.String string;
        java.lang.String string2;
        int i17;
        java.util.ArrayList arrayList;
        java.lang.String str2;
        java.util.Calendar calendar2;
        java.lang.String str3;
        java.util.Calendar calendar3;
        java.lang.String string3;
        java.lang.Object clone = calendar.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type java.util.Calendar");
        java.util.Calendar calendar4 = (java.util.Calendar) clone;
        a(calendar4);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        calendar5.add(12, 6);
        if (calendar4.before(calendar5)) {
            calendar4.setTimeInMillis(calendar5.getTimeInMillis());
            a(calendar4);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Remind.MMRemindDatePickerRemake", "setSelectTime " + calendar.getTime() + " Adjusted time: " + calendar4.getTime());
        com.tencent.mm.wepicker.RemindTimePickerRemake remindTimePickerRemake = this.f202892h;
        java.lang.String str4 = "format(...)";
        if (remindTimePickerRemake != null) {
            long timeInMillis = calendar4.getTimeInMillis();
            java.util.Calendar calendar6 = remindTimePickerRemake.f214324r;
            long timeInMillis2 = timeInMillis - calendar6.getTimeInMillis();
            if (timeInMillis2 <= 360000 || timeInMillis2 >= 31536000000L) {
                str = "format(...)";
                z17 = false;
                com.tencent.mm.ui.yk.f("MicroMsg.RemindTimePickerRemake", "set time error", new java.lang.Object[0]);
            } else {
                java.util.Calendar minSelectCalendar = remindTimePickerRemake.f214325s;
                kotlin.jvm.internal.o.f(minSelectCalendar, "minSelectCalendar");
                java.util.Iterator it = e06.p.m(minSelectCalendar.get(1), calendar4.get(1)).iterator();
                int i18 = 0;
                while (((e06.j) it).hasNext()) {
                    int b17 = ((kz5.x0) it).b();
                    i18 += (b17 % 400 == 0 || (b17 % 100 != 0 && b17 % 4 == 0)) ? 366 : 365;
                }
                int i19 = (i18 + calendar4.get(6)) - minSelectCalendar.get(6);
                java.util.ArrayList arrayList2 = remindTimePickerRemake.f214322p;
                com.tencent.mm.wepicker.WePicker wePicker = (com.tencent.mm.wepicker.WePicker) arrayList2.get(0);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int i27 = calendar6.get(1);
                int i28 = calendar6.get(5);
                int i29 = calendar6.get(2) + 1;
                int c17 = remindTimePickerRemake.c(i27, i29);
                java.util.Calendar calendar7 = java.util.Calendar.getInstance();
                calendar7.set(i27, i29 - 1, i28);
                java.lang.String str5 = " ";
                if (calendar6.get(5) == minSelectCalendar.get(5)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    i17 = i28;
                    sb6.append(remindTimePickerRemake.getContext().getString(com.tencent.mm.R.string.lxj));
                    sb6.append(" ".concat(remindTimePickerRemake.d(calendar7)));
                    arrayList3.add(sb6.toString());
                } else {
                    i17 = i28;
                }
                calendar7.add(6, 1);
                arrayList3.add(remindTimePickerRemake.getContext().getString(com.tencent.mm.R.string.lxk) + " ".concat(remindTimePickerRemake.d(calendar7)));
                calendar7.add(6, 1);
                arrayList3.add(remindTimePickerRemake.getContext().getString(com.tencent.mm.R.string.lxd) + " ".concat(remindTimePickerRemake.d(calendar7)));
                java.util.Iterator it6 = new e06.k(0, 365).iterator();
                int i37 = c17;
                int i38 = i17;
                while (((e06.j) it6).hasNext()) {
                    java.util.Iterator it7 = it6;
                    if (((kz5.x0) it6).b() >= arrayList3.size()) {
                        calendar7.set(i27, i29 - 1, i38);
                        java.lang.String concat = str5.concat(remindTimePickerRemake.d(calendar7));
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        str3 = str5;
                        calendar3 = calendar7;
                        if (i27 == calendar6.get(1)) {
                            calendar2 = calendar6;
                            arrayList = arrayList2;
                            string3 = remindTimePickerRemake.getContext().getString(com.tencent.mm.R.string.lxh, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i38));
                            kotlin.jvm.internal.o.f(string3, "getString(...)");
                            str2 = str4;
                        } else {
                            arrayList = arrayList2;
                            calendar2 = calendar6;
                            android.content.Context context = remindTimePickerRemake.getContext();
                            java.lang.String format = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i27 % 100)}, 1));
                            kotlin.jvm.internal.o.f(format, str4);
                            str2 = str4;
                            string3 = context.getString(com.tencent.mm.R.string.lxg, format, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i38));
                            kotlin.jvm.internal.o.f(string3, "getString(...)");
                        }
                        sb7.append(string3);
                        sb7.append(concat);
                        arrayList3.add(sb7.toString());
                    } else {
                        arrayList = arrayList2;
                        str2 = str4;
                        calendar2 = calendar6;
                        str3 = str5;
                        calendar3 = calendar7;
                    }
                    i38++;
                    if (i38 > i37) {
                        int i39 = i29 + 1;
                        if (i39 > 12) {
                            i27++;
                            i39 = 1;
                        }
                        i29 = i39;
                        i37 = remindTimePickerRemake.c(i27, i39);
                        i38 = 1;
                    }
                    str5 = str3;
                    it6 = it7;
                    calendar7 = calendar3;
                    calendar6 = calendar2;
                    arrayList2 = arrayList;
                    str4 = str2;
                }
                java.util.ArrayList arrayList4 = arrayList2;
                str = str4;
                wePicker.g1(arrayList3, i19);
                java.util.List list = remindTimePickerRemake.f214323q;
                list.set(0, java.lang.Integer.valueOf(i19));
                int i47 = calendar4.get(11);
                if (i19 == 0) {
                    i47 -= remindTimePickerRemake.f214326t;
                }
                ((com.tencent.mm.wepicker.WePicker) arrayList4.get(1)).g1(remindTimePickerRemake.a(), i47);
                list.set(1, java.lang.Integer.valueOf(i47));
                int i48 = calendar4.get(12);
                if (i19 == 0 && i47 == 0) {
                    i48 -= remindTimePickerRemake.f214327u;
                }
                ((com.tencent.mm.wepicker.WePicker) arrayList4.get(2)).g1(remindTimePickerRemake.b(), i48);
                list.set(2, java.lang.Integer.valueOf(i48));
                z17 = false;
            }
        } else {
            str = "format(...)";
            z17 = false;
        }
        java.util.Calendar calendar8 = java.util.Calendar.getInstance();
        if (calendar4.get(1) == calendar8.get(1) && calendar4.get(6) == calendar8.get(6)) {
            z18 = true;
            c1Var = this;
        } else {
            c1Var = this;
            z18 = z17;
        }
        android.content.Context context2 = c1Var.f202885a;
        if (z18) {
            string = context2.getString(com.tencent.mm.R.string.lxj);
        } else {
            java.util.Calendar calendar9 = java.util.Calendar.getInstance();
            calendar9.add(6, 1);
            if ((calendar4.get(1) == calendar9.get(1) && calendar4.get(6) == calendar9.get(6)) ? true : z17) {
                string = context2.getString(com.tencent.mm.R.string.lxk);
            } else {
                java.util.Calendar calendar10 = java.util.Calendar.getInstance();
                calendar10.add(6, 2);
                string = (calendar4.get(1) != calendar10.get(1) || calendar4.get(6) != calendar10.get(6)) ? z17 : true ? context2.getString(com.tencent.mm.R.string.lxd) : context2.getString(com.tencent.mm.R.string.lxh, java.lang.Integer.valueOf(calendar4.get(2) + 1), java.lang.Integer.valueOf(calendar4.get(5)));
            }
        }
        kotlin.jvm.internal.o.d(string);
        com.tencent.mm.ui.widget.MMTextView mMTextView = c1Var.f202888d;
        if (mMTextView != null) {
            mMTextView.setText(string);
        }
        switch (calendar4.get(7)) {
            case 1:
                string2 = context2.getString(com.tencent.mm.R.string.oed);
                break;
            case 2:
                string2 = context2.getString(com.tencent.mm.R.string.oeb);
                break;
            case 3:
                string2 = context2.getString(com.tencent.mm.R.string.oef);
                break;
            case 4:
                string2 = context2.getString(com.tencent.mm.R.string.oeg);
                break;
            case 5:
                string2 = context2.getString(com.tencent.mm.R.string.oee);
                break;
            case 6:
                string2 = context2.getString(com.tencent.mm.R.string.oea);
                break;
            case 7:
                string2 = context2.getString(com.tencent.mm.R.string.oec);
                break;
            default:
                string2 = "";
                break;
        }
        kotlin.jvm.internal.o.d(string2);
        com.tencent.mm.ui.widget.MMTextView mMTextView2 = c1Var.f202889e;
        if (mMTextView2 != null) {
            mMTextView2.setText(string2);
        }
        int i49 = calendar4.get(11);
        int i57 = calendar4.get(12);
        com.tencent.mm.ui.widget.MMTextView mMTextView3 = c1Var.f202890f;
        if (mMTextView3 != null) {
            java.lang.String format2 = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i49), java.lang.Integer.valueOf(i57)}, 2));
            kotlin.jvm.internal.o.f(format2, str);
            mMTextView3.setText(format2);
        }
        return calendar4.getTimeInMillis();
    }
}
