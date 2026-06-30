package iu1;

/* loaded from: classes9.dex */
public final class v0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f294963d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f294964e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f294965f;

    /* renamed from: g, reason: collision with root package name */
    public iu1.w0 f294966g;

    /* renamed from: h, reason: collision with root package name */
    public iu1.w0 f294967h;

    /* renamed from: i, reason: collision with root package name */
    public iu1.w0 f294968i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f294969m;

    public v0(boolean z17) {
        this.f294969m = z17;
    }

    public final void B(java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        if (com.tencent.mm.sdk.platformtools.t8.K0(title)) {
            this.f294967h = null;
            return;
        }
        if (this.f294967h == null) {
            iu1.w0 w0Var = new iu1.w0();
            this.f294967h = w0Var;
            w0Var.f294971a = 0;
        }
        iu1.w0 w0Var2 = this.f294967h;
        kotlin.jvm.internal.o.d(w0Var2);
        w0Var2.f294972b = title;
    }

    public final void E(java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        if (com.tencent.mm.sdk.platformtools.t8.K0(title)) {
            this.f294966g = null;
            return;
        }
        if (this.f294966g == null) {
            iu1.w0 w0Var = new iu1.w0();
            this.f294966g = w0Var;
            w0Var.f294971a = 0;
        }
        iu1.w0 w0Var2 = this.f294966g;
        kotlin.jvm.internal.o.d(w0Var2);
        w0Var2.f294972b = title;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        int i17 = this.f294966g != null ? 1 : 0;
        java.util.ArrayList arrayList = this.f294965f;
        if (arrayList != null) {
            i17 += arrayList.size();
        }
        java.util.ArrayList arrayList2 = this.f294963d;
        if (arrayList2 != null) {
            i17 += arrayList2.size();
        }
        if (this.f294967h != null) {
            i17++;
        }
        java.util.ArrayList arrayList3 = this.f294964e;
        if (arrayList3 != null) {
            i17 += arrayList3.size();
        }
        return this.f294968i != null ? i17 + 1 : i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        iu1.w0 x17 = x(i17);
        if (x17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardTicketAdapter", "[getItemId] position=" + i17 + " itemCount=" + getItemCount() + " }");
            return 0L;
        }
        java.lang.String str = x17.f294972b;
        if (str == null) {
            str = "";
        }
        r45.g45 g45Var = x17.f294974d;
        java.lang.String str2 = g45Var != null ? g45Var.f374871d : null;
        if (str2 == null) {
            str2 = "";
        }
        r45.h45 h45Var = x17.f294973c;
        java.lang.String str3 = h45Var != null ? h45Var.f375825d : null;
        if (str3 == null) {
            str3 = "";
        }
        r45.nj4 nj4Var = x17.f294975e;
        java.lang.String str4 = nj4Var != null ? nj4Var.f381443d : null;
        java.lang.String str5 = str + str2 + str3 + (str4 != null ? str4 : "");
        if (str5 == null || str5.length() == 0) {
            return x17.hashCode();
        }
        return (str5 + i17 + x17.f294971a).hashCode();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        iu1.w0 x17 = x(i17);
        if (x17 != null) {
            return x17.f294971a;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        r45.nj4 nj4Var;
        iu1.r1 holder = (iu1.r1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        iu1.w0 x17 = x(i17);
        if (x17 != null) {
            int i18 = x17.f294971a;
            if (i18 != 0) {
                boolean z17 = true;
                if (i18 == 1) {
                    r45.h45 h45Var = x17.f294973c;
                    if (h45Var != null) {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(h45Var.f375826e)) {
                            holder.k().setImageResource(com.tencent.mm.R.raw.card_default_merchant_icon);
                        } else {
                            holder.k().b(h45Var.f375826e, 0, 0, com.tencent.mm.R.raw.card_default_merchant_icon);
                        }
                        holder.l().setText(h45Var.f375825d);
                        holder.j().setText(h45Var.f375827f);
                    }
                } else if (i18 == 2) {
                    r45.g45 g45Var = x17.f294974d;
                    if (g45Var != null) {
                        java.lang.Object tag = holder.i().getTag();
                        java.lang.String str = g45Var.f374871d;
                        if (!(tag instanceof java.lang.String) || android.text.TextUtils.isEmpty((java.lang.CharSequence) tag) || !tag.equals(str)) {
                            holder.i().setTag(str);
                            holder.k().setRoundCorner(true);
                            if (com.tencent.mm.sdk.platformtools.t8.K0(g45Var.f374874g)) {
                                holder.k().setImageResource(com.tencent.mm.R.raw.card_default_merchant_icon);
                            } else {
                                holder.k().b(g45Var.f374874g, 0, 0, com.tencent.mm.R.raw.card_default_merchant_icon);
                            }
                            holder.l().setText(g45Var.f374872e);
                            holder.j().setText(g45Var.f374873f);
                            int i19 = g45Var.f374875h;
                            if (i19 == 1 || i19 == 3 || i19 == 4) {
                                holder.i().setVisibility(4);
                                android.widget.ImageView imageView = holder.f294951n;
                                if (imageView == null) {
                                    kotlin.jvm.internal.o.o("shadowIv");
                                    throw null;
                                }
                                imageView.setVisibility(4);
                                android.view.View view = holder.itemView;
                                view.setBackground(view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481110l0));
                                holder.l().setTextColor(android.graphics.Color.parseColor("#555555"));
                                holder.l().setShadowLayer(0.0f, 0.0f, 0.0f, i65.a.d(holder.itemView.getContext(), com.tencent.mm.R.color.a9e));
                                holder.j().setTextColor(android.graphics.Color.parseColor("#555555"));
                                holder.j().setShadowLayer(0.0f, 0.0f, 0.0f, i65.a.d(holder.itemView.getContext(), com.tencent.mm.R.color.a9e));
                            } else {
                                holder.l().setTextColor(-1);
                                holder.j().setTextColor(i65.a.d(holder.i().getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
                                java.util.LinkedList<r45.st> ticket_label = g45Var.f374876i;
                                kotlin.jvm.internal.o.f(ticket_label, "ticket_label");
                                android.widget.LinearLayout linearLayout = holder.f294950m;
                                if (linearLayout == null) {
                                    kotlin.jvm.internal.o.o("rightLabelLayout");
                                    throw null;
                                }
                                linearLayout.removeAllViews();
                                if (ticket_label.isEmpty()) {
                                    linearLayout.setVisibility(4);
                                } else {
                                    linearLayout.setVisibility(0);
                                    for (r45.st stVar : ticket_label) {
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(stVar.f385967d)) {
                                            android.widget.LinearLayout linearLayout2 = holder.f294950m;
                                            if (linearLayout2 == null) {
                                                kotlin.jvm.internal.o.o("rightLabelLayout");
                                                throw null;
                                            }
                                            com.tencent.mm.plugin.card.widget.CardTagTextView cardTagTextView = new com.tencent.mm.plugin.card.widget.CardTagTextView(linearLayout2.getContext());
                                            android.content.Context context = linearLayout.getContext();
                                            cardTagTextView.setMinHeight(i65.a.b(context, 18));
                                            int b17 = i65.a.b(context, 8);
                                            int b18 = i65.a.b(context, 4);
                                            cardTagTextView.setPadding(b17, b18, b17, b18);
                                            cardTagTextView.setText(stVar.f385967d);
                                            cardTagTextView.setTextSize(1, 10.0f);
                                            if (com.tencent.mm.sdk.platformtools.t8.K0(stVar.f385968e)) {
                                                cardTagTextView.setTextColor(-1);
                                            } else {
                                                cardTagTextView.setTextColor(android.graphics.Color.parseColor(stVar.f385968e));
                                            }
                                            if (com.tencent.mm.sdk.platformtools.t8.K0(stVar.f385969f)) {
                                                cardTagTextView.setFillColor(lu1.a0.a(-16777216, 26));
                                            } else {
                                                cardTagTextView.setFillColor(lu1.a0.b(stVar.f385969f, stVar.f385972i));
                                            }
                                            linearLayout.addView(cardTagTextView);
                                        }
                                    }
                                }
                                iu1.q1 q1Var = new iu1.q1(holder, g45Var);
                                if (holder.f294944d <= 0 || holder.f294945e <= 0) {
                                    holder.f294944d = holder.itemView.getHeight();
                                    int width = holder.itemView.getWidth();
                                    holder.f294945e = width;
                                    if (holder.f294944d <= 0 || width <= 0) {
                                        holder.itemView.post(new iu1.p1(holder, q1Var));
                                    }
                                }
                                q1Var.invoke();
                            }
                        }
                    }
                } else if (i18 == 3 && (nj4Var = x17.f294975e) != null) {
                    holder.l().setText(nj4Var.f381443d);
                    java.lang.String str2 = nj4Var.f381445f;
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        holder.j().setVisibility(8);
                    } else {
                        holder.j().setText(nj4Var.f381445f);
                        holder.j().setVisibility(0);
                    }
                }
            } else {
                holder.l().setText(x17.f294972b);
            }
            if (this.f294969m) {
                android.view.View view2 = holder.itemView;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.6f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : com.tencent.mm.R.layout.f488331qd : com.tencent.mm.R.layout.f488370rh : com.tencent.mm.R.layout.f488332qe : com.tencent.mm.R.layout.f488371ri, parent, false);
        if (this.f294969m) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.6f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        kotlin.jvm.internal.o.d(inflate);
        return new iu1.r1(inflate, i17);
    }

    public final iu1.w0 x(int i17) {
        int i18;
        java.util.ArrayList arrayList = this.f294965f;
        if (arrayList != null) {
            arrayList.size();
        }
        java.util.ArrayList arrayList2 = this.f294963d;
        if (arrayList2 != null) {
            arrayList2.size();
        }
        java.util.ArrayList arrayList3 = this.f294964e;
        if (arrayList3 != null) {
            arrayList3.size();
        }
        iu1.w0 w0Var = this.f294966g;
        if (w0Var == null) {
            i18 = -1;
        } else {
            if (i17 == 0) {
                return w0Var;
            }
            i18 = 0;
        }
        java.util.ArrayList arrayList4 = this.f294965f;
        if (arrayList4 != null) {
            if (i17 > i18 && i17 <= arrayList4.size() + i18) {
                return (iu1.w0) arrayList4.get((i17 - i18) - 1);
            }
            i18 += arrayList4.size();
        }
        java.util.ArrayList arrayList5 = this.f294963d;
        if (arrayList5 != null) {
            if (i17 > i18 && i17 <= arrayList5.size() + i18) {
                return (iu1.w0) arrayList5.get((i17 - i18) - 1);
            }
            i18 += arrayList5.size();
        }
        iu1.w0 w0Var2 = this.f294967h;
        if (w0Var2 != null && i17 == (i18 = i18 + 1)) {
            return w0Var2;
        }
        java.util.ArrayList arrayList6 = this.f294964e;
        if (arrayList6 != null) {
            if (i17 > i18 && i17 <= arrayList6.size() + i18) {
                return (iu1.w0) arrayList6.get((i17 - i18) - 1);
            }
            i18 += arrayList6.size();
        }
        iu1.w0 w0Var3 = this.f294968i;
        if (w0Var3 == null || i17 != i18 + 1) {
            return null;
        }
        return w0Var3;
    }

    public final int y(java.lang.String cardId, int i17) {
        kotlin.jvm.internal.o.g(cardId, "cardId");
        if (i17 != 1) {
            java.util.ArrayList arrayList = this.f294964e;
            if (arrayList == null) {
                return 0;
            }
            java.util.Iterator it = arrayList.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                int i19 = i18 + 1;
                r45.g45 g45Var = ((iu1.w0) it.next()).f294974d;
                if (kotlin.jvm.internal.o.b(g45Var != null ? g45Var.f374871d : null, cardId)) {
                    return i18;
                }
                i18 = i19;
            }
            return 0;
        }
        java.util.ArrayList arrayList2 = this.f294965f;
        int size = arrayList2 != null ? arrayList2.size() + 0 : 0;
        java.util.ArrayList arrayList3 = this.f294963d;
        if (arrayList3 == null) {
            return 0;
        }
        java.util.Iterator it6 = arrayList3.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            int i28 = i27 + 1;
            r45.g45 g45Var2 = ((iu1.w0) it6.next()).f294974d;
            if (kotlin.jvm.internal.o.b(g45Var2 != null ? g45Var2.f374871d : null, cardId)) {
                return i27 + size;
            }
            i27 = i28;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r8.isEmpty() != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "cardId"
            kotlin.jvm.internal.o.g(r8, r0)
            java.util.ArrayList r0 = r7.f294965f
            if (r0 == 0) goto Lc
            r0.size()
        Lc:
            java.util.ArrayList r0 = r7.f294963d
            r1 = 2
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L50
            java.util.Iterator r4 = r0.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r4.next()
            iu1.w0 r5 = (iu1.w0) r5
            r45.g45 r6 = r5.f294974d
            if (r6 == 0) goto L2a
            java.lang.String r6 = r6.f374871d
            goto L2b
        L2a:
            r6 = r3
        L2b:
            boolean r6 = r26.i0.q(r6, r8, r2, r1, r3)
            if (r6 == 0) goto L17
            r0.remove(r5)
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L49
            java.util.ArrayList r8 = r7.f294965f
            if (r8 == 0) goto L47
            kotlin.jvm.internal.o.d(r8)
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L49
        L47:
            r7.f294966g = r3
        L49:
            r7.notifyDataSetChanged()
            return
        L4d:
            r0.size()
        L50:
            java.util.ArrayList r0 = r7.f294964e
            if (r0 == 0) goto L84
            java.util.Iterator r4 = r0.iterator()
        L58:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r4.next()
            iu1.w0 r5 = (iu1.w0) r5
            r45.g45 r6 = r5.f294974d
            if (r6 == 0) goto L6b
            java.lang.String r6 = r6.f374871d
            goto L6c
        L6b:
            r6 = r3
        L6c:
            boolean r6 = r26.i0.q(r6, r8, r2, r1, r3)
            if (r6 == 0) goto L58
            r0.remove(r5)
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L81
            iu1.w0 r8 = r7.f294968i
            if (r8 != 0) goto L81
            r7.f294967h = r3
        L81:
            r7.notifyDataSetChanged()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iu1.v0.z(java.lang.String):void");
    }
}
