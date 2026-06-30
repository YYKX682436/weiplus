package gt4;

/* loaded from: classes14.dex */
public final class a1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f275386d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f275387e;

    /* renamed from: f, reason: collision with root package name */
    public int f275388f;

    /* renamed from: g, reason: collision with root package name */
    public int f275389g;

    /* renamed from: h, reason: collision with root package name */
    public int f275390h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f275391i;

    /* renamed from: m, reason: collision with root package name */
    public int f275392m;

    /* renamed from: n, reason: collision with root package name */
    public final float f275393n;

    /* renamed from: o, reason: collision with root package name */
    public final int f275394o;

    /* renamed from: p, reason: collision with root package name */
    public gt4.w0 f275395p;

    public a1(android.content.Context context, java.util.List data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        this.f275386d = context;
        this.f275387e = data;
        this.f275391i = new java.util.LinkedHashMap();
        this.f275393n = 48.0f;
        this.f275394o = com.tencent.mm.wallet_core.ui.r1.t(java.lang.System.currentTimeMillis());
        int c17 = i65.a.c(context, com.tencent.mm.ui.bk.g());
        float f17 = (c17 - (2 * 22.0f)) / 7;
        this.f275393n = f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonAdapter", "screenWidth " + c17 + " space 22.0 itemWidth " + f17);
        if (f17 > 48.0f) {
            this.f275393n = 48.0f;
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f275387e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((gt4.j1) this.f275387e.get(i17)).f275456a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.util.Iterator it;
        int i18;
        float f17;
        java.lang.String string;
        java.util.LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = holder instanceof gt4.v0;
        float f18 = this.f275393n;
        android.content.Context context = this.f275386d;
        if (!z17) {
            if (holder instanceof gt4.x0) {
                ((gt4.x0) holder).f275574e.getLayoutParams().width = i65.a.a(context, f18) * 7;
                return;
            }
            if (holder instanceof gt4.t0) {
                gt4.j1 j1Var = (gt4.j1) this.f275387e.get(i17);
                gt4.t0 t0Var = (gt4.t0) holder;
                android.widget.TextView textView = t0Var.f275558f;
                textView.setTextSize(1, 22.0f);
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                int i19 = j1Var.f275459d;
                calendar.set(i19 / 100, (i19 % 100) - 1, 1);
                java.lang.String format = new java.text.SimpleDateFormat(context.getString(com.tencent.mm.R.string.lgo)).format(new java.util.Date(calendar.getTimeInMillis()));
                kotlin.jvm.internal.o.d(format);
                textView.setText(r26.i0.t(format, " ", "  ", false));
                t0Var.f275557e.setOnClickListener(new gt4.y0(this));
                return;
            }
            return;
        }
        gt4.j1 j1Var2 = (gt4.j1) this.f275387e.get(i17);
        gt4.v0 v0Var = (gt4.v0) holder;
        int size = this.f275387e.size() - 1;
        android.view.View view = v0Var.f275568d;
        if (i17 == size) {
            view.setPadding(0, 0, 0, i65.a.b(context, this.f275392m));
        } else {
            view.setPadding(0, 0, 0, 0);
        }
        java.util.Iterator it6 = j1Var2.f275460e.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            gt4.k1 k1Var = (gt4.k1) next;
            java.util.List list = v0Var.f275569e;
            gt4.u0 u0Var = (gt4.u0) ((java.util.ArrayList) list).get(i27);
            u0Var.f275561e.getLayoutParams().width = i65.a.a(context, f18);
            android.widget.RelativeLayout relativeLayout = u0Var.f275561e;
            relativeLayout.getLayoutParams().height = i65.a.a(context, f18);
            android.widget.TextView textView2 = u0Var.f275562f;
            gt4.v0 v0Var2 = v0Var;
            textView2.setTextSize(1, 17.0f);
            int i29 = k1Var.f275464a;
            if (i29 <= 0) {
                android.view.View view2 = u0Var.f275560d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f17 = f18;
                it = it6;
                i18 = i28;
            } else {
                int i37 = this.f275390h;
                it = it6;
                java.util.Map map = this.f275391i;
                i18 = i28;
                if (i29 < i37) {
                    java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                    int i38 = k1Var.f275464a;
                    f17 = f18;
                    calendar2.set(i38 / 10000, ((i38 % 10000) / 100) - 1, 1);
                    calendar2.add(2, -2);
                    int t17 = com.tencent.mm.wallet_core.ui.r1.t(calendar2.getTimeInMillis());
                    gt4.w0 w0Var = this.f275395p;
                    if (w0Var != null) {
                        int i39 = this.f275390h;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletComplexDatePicker", "getDotMap start:" + t17 + " end:" + i39);
                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                        gt4.y yVar = ((gt4.p0) w0Var).f275495a.L;
                        java.util.Map a17 = yVar != null ? yVar.a(t17, i39) : null;
                        if (a17 != null && (!a17.isEmpty())) {
                            linkedHashMap2.putAll(a17);
                        }
                        linkedHashMap = linkedHashMap2;
                    } else {
                        linkedHashMap = null;
                    }
                    this.f275390h = t17;
                    if (linkedHashMap != null) {
                        map.putAll(linkedHashMap);
                    }
                } else {
                    f17 = f18;
                }
                android.view.View view3 = ((gt4.u0) ((java.util.ArrayList) list).get(i27)).f275560d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = u0Var.f275563g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView3 = u0Var.f275564h;
                textView3.setVisibility(4);
                textView3.setTextSize(1, 10.0f);
                int i47 = k1Var.f275464a;
                int i48 = this.f275394o;
                if (i47 == i48) {
                    textView3.setText(context.getString(com.tencent.mm.R.string.fd_));
                    textView3.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_1));
                    textView3.setVisibility(0);
                }
                com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                textView2.setText(java.lang.String.valueOf(k1Var.f275464a % 100));
                if (k1Var.f275464a > i48) {
                    relativeLayout.setImportantForAccessibility(2);
                    textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
                } else {
                    relativeLayout.setImportantForAccessibility(1);
                    textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                    if (map.containsKey(java.lang.Integer.valueOf(k1Var.f275464a))) {
                        android.view.View view5 = u0Var.f275563g;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View view6 = u0Var.f275563g;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(8);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view6, "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                relativeLayout.setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
                int i49 = this.f275388f;
                if (i49 > 0) {
                    int i57 = this.f275389g;
                    if (i57 > 0) {
                        int i58 = k1Var.f275464a;
                        if (i49 == i58) {
                            if (i49 == i57) {
                                x(u0Var, 4, i27, j1Var2);
                            } else {
                                x(u0Var, 2, i27, j1Var2);
                            }
                        } else if (i57 == i58) {
                            x(u0Var, 3, i27, j1Var2);
                        } else {
                            if (i49 + 1 <= i58 && i58 < i57) {
                                x(u0Var, 5, i27, j1Var2);
                            }
                        }
                    } else if (i49 == k1Var.f275464a) {
                        x(u0Var, 1, i27, j1Var2);
                    }
                }
                if (map.containsKey(java.lang.Integer.valueOf(k1Var.f275464a))) {
                    string = context.getString(com.tencent.mm.R.string.m2c, textView2.getText());
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                } else {
                    string = context.getString(com.tencent.mm.R.string.m2d, textView2.getText());
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                }
                relativeLayout.setContentDescription(string + ", " + ((java.lang.Object) textView3.getText()));
                relativeLayout.setOnClickListener(new gt4.z0(k1Var, this, i17, u0Var));
            }
            v0Var = v0Var2;
            it6 = it;
            i27 = i18;
            f18 = f17;
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dgq, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new gt4.t0(inflate);
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dgr, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new gt4.x0(inflate2);
        }
        if (i17 != 3) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ddt, parent, false);
            kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
            return new gt4.v0(inflate3);
        }
        android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ddt, parent, false);
        kotlin.jvm.internal.o.f(inflate4, "inflate(...)");
        return new gt4.v0(inflate4);
    }

    public final void x(gt4.u0 u0Var, int i17, int i18, gt4.j1 j1Var) {
        boolean z17 = false;
        android.content.Context context = this.f275386d;
        if (i17 == 1) {
            u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.ckp);
            java.lang.String string = context.getString(com.tencent.mm.R.string.lgp);
            android.widget.TextView textView = u0Var.f275564h;
            textView.setText(string);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
            textView.setVisibility(0);
            return;
        }
        if (i17 == 2) {
            if (i18 >= 6 || ((gt4.k1) j1Var.f275460e.get(i18 + 1)).f275464a == 0) {
                u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.ckp);
            } else {
                u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.cko);
            }
            u0Var.f275564h.setText(context.getString(com.tencent.mm.R.string.lgp));
            int color = context.getResources().getColor(com.tencent.mm.R.color.f478502m);
            android.widget.TextView textView2 = u0Var.f275564h;
            textView2.setTextColor(color);
            textView2.setVisibility(0);
            return;
        }
        if (i17 == 3) {
            if (i18 <= 0 || ((gt4.k1) j1Var.f275460e.get(i18 - 1)).f275464a == 0) {
                u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.ckp);
            } else {
                u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.ckj);
            }
            u0Var.f275564h.setText(context.getString(com.tencent.mm.R.string.lgm));
            int color2 = context.getResources().getColor(com.tencent.mm.R.color.f478502m);
            android.widget.TextView textView3 = u0Var.f275564h;
            textView3.setTextColor(color2);
            textView3.setVisibility(0);
            return;
        }
        if (i17 == 4) {
            u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.ckp);
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.lgq);
            android.widget.TextView textView4 = u0Var.f275564h;
            textView4.setText(string2);
            textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478502m));
            textView4.setVisibility(0);
            return;
        }
        if (i17 != 5) {
            return;
        }
        if (i18 == 0) {
            if (((gt4.k1) j1Var.f275460e.get(i18 + 1)).f275464a == 0) {
                u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.ckp);
                return;
            } else {
                u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.cko);
                return;
            }
        }
        if (1 <= i18 && i18 < 6) {
            z17 = true;
        }
        if (!z17) {
            if (i18 == 6) {
                if (((gt4.k1) j1Var.f275460e.get(i18 - 1)).f275464a == 0) {
                    u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.ckp);
                    return;
                } else {
                    u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.ckj);
                    return;
                }
            }
            return;
        }
        if (((gt4.k1) j1Var.f275460e.get(i18 - 1)).f275464a == 0) {
            u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.cko);
        } else if (((gt4.k1) j1Var.f275460e.get(i18 + 1)).f275464a == 0) {
            u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.ckj);
        } else {
            u0Var.f275561e.setBackgroundResource(com.tencent.mm.R.drawable.ckl);
        }
    }
}
