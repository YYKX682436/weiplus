package df2;

/* loaded from: classes3.dex */
public final class i8 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f230384d;

    public i8(df2.s8 s8Var) {
        this.f230384d = s8Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Object obj2;
        android.widget.TextView textView;
        java.util.LinkedList list;
        r45.nz3 nz3Var;
        android.widget.TextView textView2;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        r45.e84 e84Var = (r45.e84) obj;
        df2.s8 s8Var = this.f230384d;
        java.lang.String str = s8Var.f231299m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update card info:");
        if (e84Var == null || (obj2 = pm0.b0.g(e84Var)) == null) {
            obj2 = "null";
        }
        sb6.append(obj2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (e84Var == null || e84Var.getBoolean(8)) {
            s8Var.f231307s = e84Var;
            s8Var.m7(df2.h7.f230307m);
            return;
        }
        boolean h76 = s8Var.h7(e84Var);
        java.lang.String str2 = s8Var.f231299m;
        if (h76) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("client has close task:");
            r45.e84 e84Var2 = s8Var.f231307s;
            sb7.append(e84Var2 != null ? e84Var2.getString(5) : null);
            sb7.append(", dont show");
            com.tencent.mars.xlog.Log.i(str2, sb7.toString());
            return;
        }
        s8Var.m7(df2.h7.f230307m);
        s8Var.f231307s = e84Var;
        com.tencent.mm.plugin.finder.live.util.y.i(s8Var, kotlinx.coroutines.q1.f310570c, kotlinx.coroutines.a1.DEFAULT, new df2.r7(s8Var, null));
        android.view.View T6 = s8Var.T6(com.tencent.mm.R.id.f484640f00, com.tencent.mm.R.id.ezz);
        s8Var.f231301o = T6;
        s8Var.f231302p = T6 != null ? (android.widget.TextView) T6.findViewById(com.tencent.mm.R.id.f0_) : null;
        android.view.View view = s8Var.f231301o;
        s8Var.f231305q = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f0a) : null;
        android.view.View view2 = s8Var.f231301o;
        s8Var.f231306r = view2 != null ? (android.widget.ScrollView) view2.findViewById(com.tencent.mm.R.id.f07) : null;
        android.view.View view3 = s8Var.f231301o;
        s8Var.A = view3 != null ? view3.findViewById(com.tencent.mm.R.id.f0g) : null;
        android.view.View view4 = s8Var.f231301o;
        s8Var.C = view4 != null ? view4.findViewById(com.tencent.mm.R.id.f0h) : null;
        android.view.View view5 = s8Var.f231301o;
        s8Var.D = view5 != null ? (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.f0c) : null;
        android.view.View view6 = s8Var.f231301o;
        s8Var.H = view6 != null ? (com.tencent.mm.view.MMPAGView) view6.findViewById(com.tencent.mm.R.id.f0i) : null;
        android.view.View view7 = s8Var.f231301o;
        s8Var.E = view7 != null ? (android.widget.TextView) view7.findViewById(com.tencent.mm.R.id.f0k) : null;
        android.view.View view8 = s8Var.f231301o;
        s8Var.B = view8 != null ? view8.findViewById(com.tencent.mm.R.id.f0d) : null;
        android.view.View view9 = s8Var.f231301o;
        s8Var.I = view9 != null ? view9.findViewById(com.tencent.mm.R.id.f08) : null;
        android.view.View view10 = s8Var.f231301o;
        s8Var.K = view10 != null ? view10.findViewById(com.tencent.mm.R.id.f484646f06) : null;
        android.view.View view11 = s8Var.f231301o;
        s8Var.F = view11 != null ? (android.widget.TextView) view11.findViewById(com.tencent.mm.R.id.f0f) : null;
        android.view.View view12 = s8Var.f231301o;
        s8Var.G = view12 != null ? (android.widget.TextView) view12.findViewById(com.tencent.mm.R.id.f0l) : null;
        android.view.View view13 = s8Var.f231301o;
        s8Var.f231297J = view13 != null ? (android.widget.ImageView) view13.findViewById(com.tencent.mm.R.id.f0b) : null;
        android.view.View view14 = s8Var.f231301o;
        s8Var.L = view14 != null ? (android.widget.TextView) view14.findViewById(com.tencent.mm.R.id.f0e) : null;
        android.view.View view15 = s8Var.f231301o;
        s8Var.M = view15 != null ? (android.widget.TextView) view15.findViewById(com.tencent.mm.R.id.f09) : null;
        android.view.View view16 = s8Var.f231301o;
        if (view16 != null) {
        }
        android.view.View view17 = s8Var.f231301o;
        s8Var.N = view17 != null ? view17.findViewById(com.tencent.mm.R.id.q5_) : null;
        android.view.View view18 = s8Var.f231301o;
        s8Var.P = view18 != null ? (android.widget.TextView) view18.findViewById(com.tencent.mm.R.id.q5c) : null;
        android.view.View view19 = s8Var.f231301o;
        s8Var.Q = view19 != null ? (android.widget.TextView) view19.findViewById(com.tencent.mm.R.id.q5d) : null;
        android.view.View view20 = s8Var.f231301o;
        s8Var.R = view20 != null ? view20.findViewById(com.tencent.mm.R.id.q59) : null;
        android.view.View view21 = s8Var.f231301o;
        s8Var.S = view21 != null ? view21.findViewById(com.tencent.mm.R.id.q5a) : null;
        android.view.View view22 = s8Var.f231301o;
        s8Var.T = view22 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view22.findViewById(com.tencent.mm.R.id.q58) : null;
        android.view.View view23 = s8Var.f231301o;
        s8Var.U = view23 != null ? view23.findViewById(com.tencent.mm.R.id.q57) : null;
        android.view.View view24 = s8Var.f231301o;
        s8Var.V = view24 != null ? (android.view.ViewGroup) view24.findViewById(com.tencent.mm.R.id.ltm) : null;
        android.view.View view25 = s8Var.f231301o;
        s8Var.W = view25 != null ? (android.view.ViewGroup) view25.findViewById(com.tencent.mm.R.id.ltl) : null;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) dk2.ef.f233411z.get("15_#FFDA98");
        if (bitmap != null && (weImageView = s8Var.T) != null) {
            weImageView.setImageBitmap(bitmap);
        }
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        com.tencent.mm.view.MMPAGView mMPAGView = s8Var.H;
        if (mMPAGView != null) {
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.C1));
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = s8Var.H;
        if (mMPAGView2 != null) {
            mMPAGView2.setComposition(s8Var.f231300n);
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = s8Var.H;
        if (mMPAGView3 != null) {
            mMPAGView3.setRepeatCount(-1);
        }
        com.tencent.mm.view.MMPAGView mMPAGView4 = s8Var.H;
        if (mMPAGView4 != null) {
            mMPAGView4.setScaleMode(3);
        }
        android.widget.TextView textView3 = s8Var.M;
        if (textView3 != null) {
            textView3.setTextSize(1, 14.0f);
        }
        android.widget.TextView textView4 = s8Var.f231302p;
        if (textView4 != null) {
            textView4.setTextSize(1, 14.0f);
        }
        android.widget.TextView textView5 = s8Var.f231305q;
        if (textView5 != null) {
            textView5.setTextSize(1, 14.0f);
        }
        android.widget.TextView textView6 = s8Var.L;
        if (textView6 != null) {
            textView6.setTextSize(1, 14.0f);
        }
        android.widget.TextView textView7 = s8Var.F;
        if (textView7 != null) {
            textView7.setTextSize(1, 14.0f);
        }
        android.widget.TextView textView8 = s8Var.D;
        if (textView8 != null) {
            textView8.setTextSize(1, 14.0f);
        }
        android.widget.TextView textView9 = s8Var.E;
        if (textView9 != null) {
            textView9.setTextSize(1, 14.0f);
        }
        android.widget.TextView textView10 = s8Var.G;
        if (textView10 != null) {
            textView10.setTextSize(1, 14.0f);
        }
        android.widget.TextView textView11 = s8Var.P;
        if (textView11 != null) {
            textView11.setTextSize(1, 14.0f);
        }
        android.widget.TextView textView12 = s8Var.Q;
        if (textView12 != null) {
            textView12.setTextSize(1, 14.0f);
        }
        android.view.View view26 = s8Var.A;
        if (view26 != null) {
            view26.setOnClickListener((android.view.View.OnClickListener) ((jz5.n) s8Var.f231319z1).getValue());
        }
        android.view.View view27 = s8Var.K;
        if (view27 != null) {
            view27.setOnClickListener(new df2.t7(s8Var));
        }
        r45.e84 e84Var3 = s8Var.f231307s;
        if (e84Var3 != null && (list = e84Var3.getList(2)) != null && (nz3Var = (r45.nz3) kz5.n0.Z(list)) != null) {
            ce2.i iVar = (ce2.i) dk2.u7.f234185e.get(nz3Var.getString(0));
            android.widget.ImageView imageView = s8Var.f231297J;
            if (imageView != null) {
                android.view.View view28 = s8Var.R;
                if (view28 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view28, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view28.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view28, "com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                imageView.setVisibility(0);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = s8Var.T;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(8);
                }
                if (nz3Var.getInteger(3) == 1) {
                    imageView.setVisibility(8);
                    android.widget.TextView textView13 = s8Var.L;
                    if (textView13 != null) {
                        textView13.setText((iVar != null ? java.lang.Integer.valueOf((int) iVar.field_price) : "").toString());
                    }
                } else if (nz3Var.getInteger(3) == 2) {
                    android.view.View view29 = s8Var.R;
                    if (view29 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view29, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view29.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view29, "com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = s8Var.T;
                    if (weImageView3 != null) {
                        weImageView3.setVisibility(0);
                    }
                    imageView.setVisibility(8);
                } else {
                    android.widget.TextView textView14 = s8Var.L;
                    if (textView14 != null) {
                        textView14.setText((iVar != null ? java.lang.Integer.valueOf((int) iVar.field_price) : "").toString());
                    }
                    mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                    java.lang.String str3 = iVar != null ? iVar.field_thumbnailFileUrl : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    wo0.c a17 = d1Var.a(new mn2.q3(str3, com.tencent.mm.plugin.finder.storage.y90.f128356f));
                    a17.f447873d = new df2.v7(imageView);
                    a17.f();
                }
            }
            android.widget.TextView textView15 = s8Var.F;
            if (textView15 != null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(nz3Var.getInteger(2));
                sb8.append(' ');
                textView15.setText(sb8.toString());
            }
            android.widget.TextView textView16 = s8Var.G;
            if (textView16 != null) {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(nz3Var.getInteger(1));
                sb9.append(' ');
                textView16.setText(sb9.toString());
            }
            int integer = nz3Var.getInteger(3);
            if (integer == 0) {
                android.widget.TextView textView17 = s8Var.Q;
                if (textView17 != null) {
                    textView17.setText(s8Var.O6().getString(com.tencent.mm.R.string.li_));
                }
            } else {
                if ((integer == 1 || integer == 2) && (textView2 = s8Var.Q) != null) {
                    textView2.setText(s8Var.O6().getString(com.tencent.mm.R.string.lia));
                }
            }
            if (nz3Var.getInteger(1) > 999) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = s8Var.T;
                if (weImageView4 != null) {
                    zl2.r4.f473950a.Q2(weImageView4);
                    android.view.ViewGroup viewGroup = s8Var.V;
                    if (viewGroup != null) {
                        viewGroup.addView(weImageView4);
                    }
                }
                android.widget.ImageView imageView2 = s8Var.f231297J;
                if (imageView2 != null) {
                    zl2.r4.f473950a.Q2(imageView2);
                    android.view.ViewGroup viewGroup2 = s8Var.V;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(imageView2);
                    }
                }
                android.view.ViewGroup viewGroup3 = s8Var.V;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                }
                android.view.ViewGroup viewGroup4 = s8Var.W;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(8);
                }
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = s8Var.T;
                if (weImageView5 != null) {
                    zl2.r4.f473950a.Q2(weImageView5);
                    android.view.ViewGroup viewGroup5 = s8Var.W;
                    if (viewGroup5 != null) {
                        viewGroup5.addView(weImageView5);
                    }
                }
                android.widget.ImageView imageView3 = s8Var.f231297J;
                if (imageView3 != null) {
                    zl2.r4.f473950a.Q2(imageView3);
                    android.view.ViewGroup viewGroup6 = s8Var.W;
                    if (viewGroup6 != null) {
                        viewGroup6.addView(imageView3);
                    }
                }
                android.view.ViewGroup viewGroup7 = s8Var.V;
                if (viewGroup7 != null) {
                    viewGroup7.setVisibility(8);
                }
                android.view.ViewGroup viewGroup8 = s8Var.W;
                if (viewGroup8 != null) {
                    viewGroup8.setVisibility(0);
                }
            }
        }
        r45.e84 e84Var4 = s8Var.f231307s;
        if (e84Var4 != null && (textView = s8Var.E) != null) {
            java.lang.String string = e84Var4.getString(3);
            s8Var.n7(textView, string != null ? string : "", 5000L, true);
        }
        pm0.v.V(100L, new df2.w7(s8Var));
        android.widget.TextView textView18 = s8Var.f231302p;
        if (textView18 != null) {
            textView18.setTextColor(s8Var.c7());
        }
        android.widget.TextView textView19 = s8Var.f231305q;
        if (textView19 != null) {
            textView19.setTextColor(s8Var.c7());
        }
        android.view.View view30 = s8Var.f231301o;
        if (view30 != null) {
            com.tencent.mars.xlog.Log.i(str2, "visibleBarrier new, view = " + view30.hashCode());
            if2.d0 d0Var = new if2.d0(view30, s8Var);
            s8Var.f231317y1 = d0Var;
            s8Var.f291103i = new df2.x7(d0Var);
        }
        android.view.View view31 = s8Var.K;
        if (view31 != null) {
            zl2.r4.c3(zl2.r4.f473950a, view31, 0, 0, 6, null);
        }
        android.view.View view32 = s8Var.f231301o;
        if (view32 != null) {
            view32.setOnClickListener(df2.y7.f231849d);
        }
        s8Var.l7();
        s8Var.m7(df2.h7.f230301d);
        com.tencent.mars.xlog.Log.i(str2, "[tryToShow] showCard");
        df2.pv pvVar = (df2.pv) s8Var.controller(df2.pv.class);
        if (pvVar != null) {
            pvVar.d7(s8Var);
        }
        df2.s8 s8Var2 = this.f230384d;
        com.tencent.mm.plugin.finder.live.util.y.o(s8Var2, kotlinx.coroutines.internal.b0.f310484a, null, new df2.h8(s8Var2, null), 2, null);
    }
}
