package t51;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final u51.a f415708a;

    public b(android.content.Context context, v51.f fVar) {
        u51.a aVar = new u51.a(2);
        this.f415708a = aVar;
        aVar.f424790k = context;
        aVar.f424781b = fVar;
    }

    public void a(w51.g gVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        u51.a aVar = this.f415708a;
        gVar.f442966g = aVar;
        android.content.Context context = aVar.f424790k;
        gVar.b();
        android.content.Context context2 = gVar.f442963d;
        gVar.f442969m = android.view.animation.AnimationUtils.loadAnimation(context2, com.tencent.mm.R.anim.f477839cx);
        gVar.f442968i = android.view.animation.AnimationUtils.loadAnimation(context2, com.tencent.mm.R.anim.f477840cy);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.byu, gVar.f442964e);
        android.widget.TextView textView = (android.widget.TextView) gVar.f442964e.findViewById(com.tencent.mm.R.id.okp);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) gVar.f442964e.findViewById(com.tencent.mm.R.id.m99);
        android.widget.Button button = (android.widget.Button) gVar.f442964e.findViewById(com.tencent.mm.R.id.azv);
        android.widget.Button button2 = (android.widget.Button) gVar.f442964e.findViewById(com.tencent.mm.R.id.azm);
        button.setTag("submit");
        button2.setTag("cancel");
        button.setOnClickListener(gVar);
        button2.setOnClickListener(gVar);
        gVar.f442966g.getClass();
        if (android.text.TextUtils.isEmpty(null)) {
            str = context.getResources().getString(com.tencent.mm.R.string.f492705hj0);
        } else {
            gVar.f442966g.getClass();
            str = null;
        }
        button.setText(str);
        gVar.f442966g.getClass();
        if (android.text.TextUtils.isEmpty(null)) {
            str2 = context.getResources().getString(com.tencent.mm.R.string.hiu);
        } else {
            gVar.f442966g.getClass();
            str2 = null;
        }
        button2.setText(str2);
        gVar.f442966g.getClass();
        if (android.text.TextUtils.isEmpty(null)) {
            str3 = "";
        } else {
            gVar.f442966g.getClass();
            str3 = null;
        }
        textView.setText(str3);
        gVar.f442966g.getClass();
        button.setTextColor(-15028967);
        gVar.f442966g.getClass();
        button2.setTextColor(-1979711488);
        gVar.f442966g.getClass();
        textView.setTextColor(-16777216);
        gVar.f442966g.getClass();
        relativeLayout.setBackgroundColor(-657931);
        gVar.f442966g.getClass();
        float f17 = 24;
        button.setTextSize(f17);
        gVar.f442966g.getClass();
        button2.setTextSize(f17);
        gVar.f442966g.getClass();
        textView.setTextSize(f17);
        u51.a aVar2 = gVar.f442966g;
        boolean[] zArr = aVar2.f424786g;
        w51.n nVar = gVar.f442975p;
        if (nVar.f442989a == null) {
            nVar.f442989a = null;
        }
        nVar.f442998j = zArr;
        nVar.f442996h = 17;
        if (aVar2.f424782c != null) {
            nVar.f443012x = new w51.f(gVar);
        }
        java.util.Calendar calendar = aVar2.f424788i;
        java.lang.String str4 = gVar.f442977r;
        if (calendar == null || aVar2.f424789j == null) {
            if (calendar == null) {
                java.util.Calendar calendar2 = aVar2.f424789j;
                if (calendar2 != null && calendar2.get(1) > 2100) {
                    com.tencent.mm.ui.yk.b(str4, "initWheelTime: The endDate should not be later than 2100, set endDate to null", new java.lang.Object[0]);
                    gVar.f442966g.f424788i = null;
                }
            } else if (calendar.get(1) < 1900) {
                com.tencent.mm.ui.yk.b(str4, "initWheelTime: The startDate can not as early as 1900, set startDate to null", new java.lang.Object[0]);
                gVar.f442966g.f424788i = null;
            }
        } else if (calendar.getTimeInMillis() > gVar.f442966g.f424789j.getTimeInMillis()) {
            com.tencent.mm.ui.yk.b(str4, "initWheelTime: startDate can't be later than endDate, set startDate to null", new java.lang.Object[0]);
            gVar.f442966g.f424788i = null;
        }
        u51.a aVar3 = gVar.f442966g;
        java.util.Calendar calendar3 = aVar3.f424788i;
        java.util.Calendar calendar4 = aVar3.f424789j;
        if (calendar3 == null && calendar4 != null) {
            int i39 = calendar4.get(1);
            int i47 = calendar4.get(2) + 1;
            int i48 = calendar4.get(5);
            int i49 = nVar.f442999k;
            if (i39 > i49) {
                nVar.f443000l = i39;
                nVar.f443002n = i47;
                nVar.f443004p = i48;
            } else if (i39 == i49) {
                int i57 = nVar.f443001m;
                if (i47 > i57) {
                    nVar.f443000l = i39;
                    nVar.f443002n = i47;
                    nVar.f443004p = i48;
                } else if (i47 == i57 && i48 > nVar.f443003o) {
                    nVar.f443000l = i39;
                    nVar.f443002n = i47;
                    nVar.f443004p = i48;
                }
            }
        } else if (calendar3 != null && calendar4 == null) {
            int i58 = calendar3.get(1);
            int i59 = calendar3.get(2) + 1;
            int i66 = calendar3.get(5);
            int i67 = nVar.f443000l;
            if (i58 < i67) {
                nVar.f443001m = i59;
                nVar.f443003o = i66;
                nVar.f442999k = i58;
            } else if (i58 == i67) {
                int i68 = nVar.f443002n;
                if (i59 < i68) {
                    nVar.f443001m = i59;
                    nVar.f443003o = i66;
                    nVar.f442999k = i58;
                } else if (i59 == i68 && i66 < nVar.f443004p) {
                    nVar.f443001m = i59;
                    nVar.f443003o = i66;
                    nVar.f442999k = i58;
                }
            }
        } else if (calendar3 != null && calendar4 != null) {
            nVar.f442999k = calendar3.get(1);
            nVar.f443000l = calendar4.get(1);
            nVar.f443001m = calendar3.get(2) + 1;
            nVar.f443002n = calendar4.get(2) + 1;
            nVar.f443003o = calendar3.get(5);
            nVar.f443004p = calendar4.get(5);
            nVar.f443005q = calendar3.get(11);
            nVar.f443006r = calendar3.get(12);
            nVar.f443007s = calendar4.get(11);
            nVar.f443008t = calendar4.get(12);
        }
        if (!gVar.f442978s) {
            u51.a aVar4 = gVar.f442966g;
            java.util.Calendar calendar5 = aVar4.f424788i;
            if (calendar5 != null && aVar4.f424789j != null) {
                java.util.Calendar calendar6 = aVar4.f424787h;
                if (calendar6 == null || calendar6.getTimeInMillis() < gVar.f442966g.f424788i.getTimeInMillis()) {
                    u51.a aVar5 = gVar.f442966g;
                    aVar5.f424787h = aVar5.f424788i;
                } else if (gVar.f442966g.f424787h.getTimeInMillis() > gVar.f442966g.f424789j.getTimeInMillis()) {
                    u51.a aVar6 = gVar.f442966g;
                    aVar6.f424787h = aVar6.f424789j;
                }
            } else if (calendar5 != null) {
                aVar4.f424787h = calendar5;
            } else {
                java.util.Calendar calendar7 = aVar4.f424789j;
                if (calendar7 != null) {
                    aVar4.f424787h = calendar7;
                }
            }
        }
        java.util.Calendar calendar8 = gVar.f442966g.f424787h;
        if (calendar8 == null) {
            java.util.Calendar calendar9 = java.util.Calendar.getInstance();
            calendar9.setTimeInMillis(java.lang.System.currentTimeMillis());
            i17 = calendar9.get(1);
            i18 = calendar9.get(2);
            i19 = calendar9.get(5);
            i27 = calendar9.get(11);
            i28 = calendar9.get(12);
            i29 = calendar9.get(13);
        } else {
            i17 = calendar8.get(1);
            i18 = gVar.f442966g.f424787h.get(2);
            i19 = gVar.f442966g.f424787h.get(5);
            i27 = gVar.f442966g.f424787h.get(11);
            i28 = gVar.f442966g.f424787h.get(12);
            i29 = gVar.f442966g.f424787h.get(13);
        }
        nVar.f443009u = i17;
        nVar.f442990b = (com.tencent.mm.picker.base.view.WheelView) nVar.f442989a.findViewById(com.tencent.mm.R.id.pta);
        nVar.f442991c = (com.tencent.mm.picker.base.view.WheelView) nVar.f442989a.findViewById(com.tencent.mm.R.id.jqd);
        nVar.f442992d = (com.tencent.mm.picker.base.view.WheelView) nVar.f442989a.findViewById(com.tencent.mm.R.id.cqu);
        int i69 = nVar.f442999k;
        int i76 = nVar.f443000l;
        android.content.Context context3 = nVar.A;
        o51.f fVar = new o51.f(i69, i76, context3);
        nVar.f442997i = fVar;
        nVar.f442990b.setAdapter(fVar);
        nVar.f442990b.setCurrentItem(i17 - nVar.f442999k);
        nVar.f442990b.setGravity(nVar.f442996h);
        int i77 = nVar.f442999k;
        int i78 = nVar.f443000l;
        if (i77 == i78) {
            nVar.f442991c.setAdapter(new o51.d(nVar.f443001m, nVar.f443002n, new o51.b(context3)));
            nVar.f442991c.setCurrentItem((i18 + 1) - nVar.f443001m);
        } else if (i17 == i77) {
            nVar.f442991c.setAdapter(new o51.d(nVar.f443001m, 12, new o51.b(context3)));
            nVar.f442991c.setCurrentItem((i18 + 1) - nVar.f443001m);
        } else if (i17 == i78) {
            nVar.f442991c.setAdapter(new o51.d(1, nVar.f443002n, new o51.b(context3)));
            nVar.f442991c.setCurrentItem(i18);
        } else if (nVar.f443011w && i17 - 1 == i77) {
            nVar.f442991c.setAdapter(new o51.d(nVar.f443001m, 12, new o51.b(context3)));
            nVar.f442991c.setCurrentItem((i18 + 1) - nVar.f443001m);
        } else {
            nVar.f442991c.setAdapter(new o51.d(1, 12, new o51.b(context3)));
            nVar.f442991c.setCurrentItem(i18);
        }
        nVar.f442991c.setGravity(nVar.f442996h);
        int i79 = nVar.f443011w ? i17 - 1 : i17;
        int i86 = nVar.f442999k;
        int i87 = nVar.f443000l;
        java.util.List list = nVar.f443014z;
        java.util.List list2 = nVar.f443013y;
        if (i86 == i87 && nVar.f443001m == nVar.f443002n) {
            int i88 = i18 + 1;
            if (list2.contains(java.lang.String.valueOf(i88))) {
                if (nVar.f443004p > 31) {
                    nVar.f443004p = 31;
                }
                nVar.f442992d.setAdapter(new o51.d(nVar.f443003o, nVar.f443004p));
            } else if (list.contains(java.lang.String.valueOf(i88))) {
                if (nVar.f443004p > 30) {
                    nVar.f443004p = 30;
                }
                nVar.f442992d.setAdapter(new o51.d(nVar.f443003o, nVar.f443004p));
            } else if ((i79 % 4 != 0 || i79 % 100 == 0) && i79 % 400 != 0) {
                if (nVar.f443004p > 28) {
                    nVar.f443004p = 28;
                }
                nVar.f442992d.setAdapter(new o51.d(nVar.f443003o, nVar.f443004p));
            } else {
                if (nVar.f443004p > 29) {
                    nVar.f443004p = 29;
                }
                nVar.f442992d.setAdapter(new o51.d(nVar.f443003o, nVar.f443004p));
            }
            nVar.f442992d.setCurrentItem(i19 - nVar.f443003o);
        } else if (i79 == i86 && (i38 = i18 + 1) == nVar.f443001m) {
            if (list2.contains(java.lang.String.valueOf(i38))) {
                nVar.f442992d.setAdapter(new o51.d(nVar.f443003o, 31));
            } else if (list.contains(java.lang.String.valueOf(i38))) {
                nVar.f442992d.setAdapter(new o51.d(nVar.f443003o, 30));
            } else if ((i79 % 4 != 0 || i79 % 100 == 0) && i79 % 400 != 0) {
                nVar.f442992d.setAdapter(new o51.d(nVar.f443003o, 28));
            } else {
                nVar.f442992d.setAdapter(new o51.d(nVar.f443003o, 29));
            }
            nVar.f442992d.setCurrentItem(i19 - nVar.f443003o);
        } else if (i79 == i87 && (i37 = i18 + 1) == nVar.f443002n) {
            if (list2.contains(java.lang.String.valueOf(i37))) {
                if (nVar.f443004p > 31) {
                    nVar.f443004p = 31;
                }
                nVar.f442992d.setAdapter(new o51.d(1, nVar.f443004p));
            } else if (list.contains(java.lang.String.valueOf(i37))) {
                if (nVar.f443004p > 30) {
                    nVar.f443004p = 30;
                }
                nVar.f442992d.setAdapter(new o51.d(1, nVar.f443004p));
            } else if ((i79 % 4 != 0 || i79 % 100 == 0) && i79 % 400 != 0) {
                if (nVar.f443004p > 28) {
                    nVar.f443004p = 28;
                }
                nVar.f442992d.setAdapter(new o51.d(1, nVar.f443004p));
            } else {
                if (nVar.f443004p > 29) {
                    nVar.f443004p = 29;
                }
                nVar.f442992d.setAdapter(new o51.d(1, nVar.f443004p));
            }
            nVar.f442992d.setCurrentItem(i19 - 1);
        } else {
            int i89 = i18 + 1;
            if (list2.contains(java.lang.String.valueOf(i89))) {
                nVar.f442992d.setAdapter(new o51.d(1, 31));
            } else if (list.contains(java.lang.String.valueOf(i89))) {
                nVar.f442992d.setAdapter(new o51.d(1, 30));
            } else if ((i79 % 4 != 0 || i79 % 100 == 0) && i79 % 400 != 0) {
                nVar.f442992d.setAdapter(new o51.d(1, 28));
            } else {
                nVar.f442992d.setAdapter(new o51.d(1, 29));
            }
            nVar.f442992d.setCurrentItem(i19 - 1);
        }
        nVar.f442992d.setGravity(nVar.f442996h);
        com.tencent.mm.picker.base.view.WheelView wheelView = (com.tencent.mm.picker.base.view.WheelView) nVar.f442989a.findViewById(com.tencent.mm.R.id.h1w);
        nVar.f442993e = wheelView;
        wheelView.setAdapter(new o51.d(nVar.f443005q, nVar.f443007s));
        nVar.f442993e.setCurrentItem(i27 - nVar.f443005q);
        nVar.f442993e.setGravity(nVar.f442996h);
        com.tencent.mm.picker.base.view.WheelView wheelView2 = (com.tencent.mm.picker.base.view.WheelView) nVar.f442989a.findViewById(com.tencent.mm.R.id.jk7);
        nVar.f442994f = wheelView2;
        int i96 = nVar.f443005q;
        if (i27 == i96 && i96 == nVar.f443007s) {
            wheelView2.setAdapter(new o51.d(nVar.f443006r, nVar.f443008t));
            if (i28 < nVar.f443006r) {
                nVar.f442994f.setCurrentItem(0);
            } else {
                int i97 = nVar.f443008t;
                if (i28 > i97) {
                    nVar.f442994f.setCurrentItem(i97);
                } else {
                    nVar.f442994f.setCurrentItem(i28);
                }
            }
        } else if (i27 == i96) {
            wheelView2.setAdapter(new o51.d(nVar.f443006r, 59));
            int i98 = nVar.f443006r;
            if (i28 < i98) {
                nVar.f442994f.setCurrentItem(0);
            } else {
                nVar.f442994f.setCurrentItem(i28 - i98);
            }
        } else if (i27 == nVar.f443007s) {
            wheelView2.setAdapter(new o51.d(0, nVar.f443008t));
            int i99 = nVar.f443008t;
            if (i28 >= i99) {
                nVar.f442994f.setCurrentItem(i99);
            } else {
                nVar.f442994f.setCurrentItem(i28);
            }
        } else {
            wheelView2.setAdapter(new o51.d(0, 59));
            nVar.f442994f.setCurrentItem(i28);
        }
        nVar.f442994f.setGravity(nVar.f442996h);
        com.tencent.mm.picker.base.view.WheelView wheelView3 = (com.tencent.mm.picker.base.view.WheelView) nVar.f442989a.findViewById(com.tencent.mm.R.id.mfv);
        nVar.f442995g = wheelView3;
        wheelView3.setAdapter(new o51.d(0, 59));
        nVar.f442995g.setCurrentItem(i29);
        nVar.f442995g.setGravity(nVar.f442996h);
        nVar.f442993e.setOnItemSelectedListener(new w51.l(nVar));
        nVar.f442990b.setOnItemSelectedListener(new w51.k(nVar));
        nVar.f442991c.setOnItemSelectedListener(new w51.j(nVar));
        nVar.b(nVar.f442992d);
        nVar.b(nVar.f442993e);
        nVar.b(nVar.f442994f);
        nVar.b(nVar.f442995g);
        if (nVar.f442998j.length != 6) {
            throw new java.lang.IllegalArgumentException("type[] length is not 6");
        }
        java.util.Iterator it = ((java.util.ArrayList) nVar.e()).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.picker.base.view.WheelView) it.next()).setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f));
        }
        if (nVar.f443011w && i17 == 2) {
            nVar.f442991c.e(0);
            nVar.f442992d.e(0);
            nVar.f442991c.invalidate();
            nVar.f442992d.invalidate();
        }
        if (gVar.f442976q.getResources().getConfiguration().locale.getLanguage().endsWith("zh")) {
            gVar.f442966g.getClass();
            gVar.f442966g.getClass();
            gVar.f442966g.getClass();
            gVar.f442966g.getClass();
            gVar.f442966g.getClass();
            gVar.f442966g.getClass();
            nVar.f442990b.setLabel(nVar.f442989a.getContext().getString(com.tencent.mm.R.string.f492706hj1));
            nVar.f442991c.setLabel(nVar.f442989a.getContext().getString(com.tencent.mm.R.string.hiy));
            nVar.f442992d.setLabel(nVar.f442989a.getContext().getString(com.tencent.mm.R.string.hiv));
            nVar.f442993e.setLabel(nVar.f442989a.getContext().getString(com.tencent.mm.R.string.hiw));
            nVar.f442994f.setLabel(nVar.f442989a.getContext().getString(com.tencent.mm.R.string.hix));
            nVar.f442995g.setLabel(nVar.f442989a.getContext().getString(com.tencent.mm.R.string.hiz));
        }
        gVar.f442966g.getClass();
        gVar.f442966g.getClass();
        gVar.f442966g.getClass();
        gVar.f442966g.getClass();
        gVar.f442966g.getClass();
        gVar.f442966g.getClass();
        gVar.f442966g.getClass();
        android.view.ViewGroup viewGroup = gVar.f442965f;
        if (viewGroup != null) {
            viewGroup.findViewById(com.tencent.mm.R.id.knb).setOnTouchListener(gVar.f442971o);
        }
        nVar.f(gVar.f442966g.f424791l);
        u51.a aVar7 = gVar.f442966g;
        s51.c cVar = aVar7.f424793n;
        boolean z17 = aVar7.f424785f;
        nVar.f442990b.setCyclic(z17);
        nVar.f442991c.setCyclic(z17);
        nVar.f442992d.setCyclic(z17);
        nVar.f442993e.setCyclic(z17);
        nVar.f442994f.setCyclic(z17);
        nVar.f442995g.setCyclic(z17);
        gVar.f442966g.getClass();
        gVar.f442966g.getClass();
        nVar.f442992d.f72388p = false;
        nVar.f442991c.f72388p = false;
        nVar.f442990b.f72388p = false;
        nVar.f442993e.f72388p = false;
        nVar.f442994f.f72388p = false;
        nVar.f442995g.f72388p = false;
        int i100 = gVar.f442966g.f424794o;
    }

    public t51.b b(java.util.Calendar calendar, java.util.Calendar calendar2) {
        u51.a aVar = this.f415708a;
        aVar.f424788i = calendar;
        aVar.f424789j = calendar2;
        return this;
    }
}
