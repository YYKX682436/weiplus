package rf2;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.q f394755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.dn f394756g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f394757h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r45.f02 f02Var, rf2.q qVar, df2.dn dnVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394754e = f02Var;
        this.f394755f = qVar;
        this.f394756g = dnVar;
        this.f394757h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.h(this.f394754e, this.f394755f, this.f394756g, this.f394757h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [mm2.v4] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.mm4 mm4Var;
        java.lang.String str;
        r45.jm4 jm4Var;
        java.lang.Object obj2;
        java.lang.String str2;
        r45.vl4 vl4Var;
        java.lang.String str3;
        r45.vl4 vl4Var2;
        r45.vl4 vl4Var3;
        java.lang.String str4;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394753d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.f02 f02Var = this.f394754e;
            r45.fm4 fm4Var = f02Var.f373880f;
            boolean z17 = false;
            java.lang.Object obj3 = null;
            r8 = null;
            r45.jm4 jm4Var2 = null;
            if ((fm4Var != null && fm4Var.f374448g == 1) == true) {
                mm2.v4 v4Var = (mm2.v4) this.f394755f.f394854e.business(mm2.v4.class);
                java.lang.String str5 = this.f394754e.f373878d;
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.Object O6 = v4Var.O6(str5);
                r45.i02 i02Var = O6 instanceof r45.i02 ? (r45.i02) O6 : null;
                if (i02Var != null && i02Var.f376612d == 2) {
                    z17 = true;
                }
                if (z17) {
                    android.widget.TextView textView = this.f394755f.f394861o;
                    if (textView != null) {
                        r45.zd4 zd4Var = i02Var.f376613e;
                        if (zd4Var == null || (str4 = zd4Var.f391936h) == null) {
                            str4 = "";
                        }
                        textView.setText(str4);
                    }
                    rf2.q qVar = this.f394755f;
                    rf2.g gVar = rf2.g.f394739h;
                    java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dwe);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    qVar.e(gVar, string, com.tencent.mm.R.color.aew, 17.0f, 0, true, true);
                    java.lang.String str6 = this.f394755f.f394855f;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lotteryInfo coupon_info:");
                    r45.km4 km4Var = this.f394754e.f373883i;
                    java.lang.Object obj4 = km4Var != null ? km4Var.f378828n : null;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    sb6.append(pm0.b0.g(obj4));
                    sb6.append(";cache coupon_info:");
                    sb6.append(pm0.b0.g(i02Var));
                    com.tencent.mars.xlog.Log.i(str6, sb6.toString());
                } else {
                    android.widget.TextView textView2 = this.f394755f.f394861o;
                    if (textView2 != null) {
                        r45.km4 km4Var2 = this.f394754e.f373883i;
                        if (km4Var2 == null || (vl4Var2 = km4Var2.f378828n) == null || (str3 = vl4Var2.f388348g) == null) {
                            str3 = "";
                        }
                        textView2.setText(str3);
                    }
                    rf2.q qVar2 = this.f394755f;
                    rf2.g gVar2 = rf2.g.f394738g;
                    r45.km4 km4Var3 = this.f394754e.f373883i;
                    if (km4Var3 == null || (vl4Var = km4Var3.f378828n) == null || (str2 = vl4Var.f388347f) == null) {
                        str2 = "";
                    }
                    qVar2.e(gVar2, str2, com.tencent.mm.R.color.UN_BW_100_Alpha_0_8, 17.0f, com.tencent.mm.R.drawable.f481735a50, false, true);
                }
                if (this.f394756g == df2.dn.f229991e) {
                    rf2.q qVar3 = this.f394755f;
                    r45.f02 f02Var2 = this.f394754e;
                    this.f394753d = 1;
                    if (rf2.q.a(qVar3, f02Var2, this) == aVar) {
                        return aVar;
                    }
                } else if (i02Var == null) {
                    ?? r07 = (mm2.v4) this.f394755f.f394854e.business(mm2.v4.class);
                    java.lang.String str7 = this.f394754e.f373878d;
                    if (str7 == null) {
                        str7 = "";
                    }
                    r45.i02 i02Var2 = new r45.i02();
                    r45.f02 f02Var3 = this.f394754e;
                    i02Var2.f376612d = 1;
                    r45.km4 km4Var4 = f02Var3.f373883i;
                    if (km4Var4 != null && (vl4Var3 = km4Var4.f378828n) != null) {
                        r45.zd4 zd4Var2 = new r45.zd4();
                        zd4Var2.f391932d = vl4Var3.f388345d;
                        zd4Var2.f391933e = vl4Var3.f388346e;
                        zd4Var2.f391934f = vl4Var3.f388347f;
                        zd4Var2.f391935g = vl4Var3.f388349h;
                        zd4Var2.f391936h = vl4Var3.f388348g;
                        i02Var2.f376613e = zd4Var2;
                    }
                    r07.W6(str7, i02Var2);
                }
            } else if (this.f394757h) {
                r45.km4 km4Var5 = f02Var.f373883i;
                if (km4Var5 != null && (jm4Var = km4Var5.f378830p) != null) {
                    rf2.q qVar4 = this.f394755f;
                    android.widget.ImageView imageView = qVar4.A;
                    if (imageView != null) {
                        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
                        r45.kv1 kv1Var = jm4Var.f377933f;
                        d1Var.a(((c61.i8) i5Var).Ai(kv1Var != null ? kv1Var.getString(2) : null, com.tencent.mm.plugin.finder.storage.y90.f128356f)).c(imageView);
                    }
                    android.widget.ImageView imageView2 = qVar4.B;
                    if (imageView2 != null) {
                        mn2.d1 d1Var2 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                        vd2.i5 i5Var2 = (vd2.i5) i95.n0.c(vd2.i5.class);
                        r45.kv1 kv1Var2 = jm4Var.f377933f;
                        d1Var2.a(((c61.i8) i5Var2).Ai(kv1Var2 != null ? kv1Var2.getString(2) : null, com.tencent.mm.plugin.finder.storage.y90.f128356f)).c(imageView2);
                    }
                    if (jm4Var.f377932e == 0) {
                        je2.t tVar = (je2.t) qVar4.f394854e.business(je2.t.class);
                        tVar.getClass();
                        synchronized (tVar) {
                            java.util.Iterator it = ((java.util.ArrayList) tVar.f299275u).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (kotlin.jvm.internal.o.b(((r45.oq1) obj2).f382441d, jm4Var.f377931d)) {
                                    break;
                                }
                            }
                            if (obj2 == null) {
                                r4 = false;
                            }
                            if (r4) {
                                com.tencent.mars.xlog.Log.i(tVar.f299263f, "tryAddLocalFreeGift failed gift " + jm4Var.f377931d + " is already cached");
                            } else {
                                r45.oq1 oq1Var = new r45.oq1();
                                oq1Var.f382441d = jm4Var.f377931d;
                                r45.kv1 kv1Var3 = jm4Var.f377933f;
                                oq1Var.f382442e = kv1Var3 != null ? kv1Var3.getString(0) : null;
                                ((java.util.ArrayList) tVar.f299276v).add(oq1Var);
                                ((java.util.ArrayList) tVar.f299275u).add(0, oq1Var);
                                com.tencent.mars.xlog.Log.i(tVar.f299263f, "add local free gift " + je2.u.a(oq1Var));
                                java.lang.String str8 = tVar.f299263f;
                                ?? sb7 = new java.lang.StringBuilder();
                                sb7.append("after addLocal free gift: ");
                                java.util.List list = tVar.f299275u;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                                java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
                                while (it6.hasNext()) {
                                    arrayList.add(je2.u.a((r45.oq1) it6.next()));
                                }
                                sb7.append(arrayList);
                                com.tencent.mars.xlog.Log.i(str8, sb7.toString());
                                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new je2.s(jm4Var, tVar, null), 2, null);
                            }
                        }
                        java.util.Iterator it7 = ((je2.t) qVar4.f394854e.business(je2.t.class)).P6().iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it7.next();
                            if (kotlin.jvm.internal.o.b(((r45.oq1) next).f382441d, jm4Var.f377931d)) {
                                obj3 = next;
                                break;
                            }
                        }
                        if (obj3 != null) {
                            rf2.g gVar3 = rf2.g.f394740i;
                            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.m3k);
                            kotlin.jvm.internal.o.f(string2, "getString(...)");
                            qVar4.e(gVar3, string2, com.tencent.mm.R.color.UN_BW_100_Alpha_0_8, 17.0f, com.tencent.mm.R.drawable.a09, false, true);
                        } else {
                            rf2.g gVar4 = rf2.g.f394741m;
                            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.m3l);
                            kotlin.jvm.internal.o.f(string3, "getString(...)");
                            qVar4.e(gVar4, string3, com.tencent.mm.R.color.f479080af2, 17.0f, 0, false, false);
                        }
                    } else {
                        rf2.g gVar5 = rf2.g.f394741m;
                        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.m3l);
                        kotlin.jvm.internal.o.f(string4, "getString(...)");
                        qVar4.e(gVar5, string4, com.tencent.mm.R.color.f479080af2, 17.0f, 0, false, false);
                    }
                    jm4Var2 = jm4Var;
                }
                if (jm4Var2 == null) {
                    com.tencent.mars.xlog.Log.e(this.f394755f.f394855f, "prize type is free gift but gift info is null!!");
                }
            } else {
                if ((fm4Var != null && fm4Var.f374448g == 3) == true) {
                    android.widget.TextView textView3 = this.f394755f.f394863q;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f394755f.f394864r;
                    if (weImageView != null) {
                        weImageView.setVisibility(8);
                    }
                    r45.fm4 fm4Var2 = this.f394754e.f373880f;
                    if (fm4Var2 != null && (mm4Var = fm4Var2.f374451m) != null && (str = mm4Var.f380663d) != null) {
                        rf2.q qVar5 = this.f394755f;
                        android.widget.TextView textView4 = qVar5.C;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                        }
                        android.widget.TextView textView5 = qVar5.C;
                        if (textView5 != null) {
                            textView5.setText(str);
                        }
                    }
                } else {
                    if ((fm4Var != null && fm4Var.f374448g == 4) == true) {
                        rf2.q.b(this.f394755f, f02Var.f373885n);
                    } else {
                        android.widget.TextView textView6 = this.f394755f.f394861o;
                        if (textView6 != null) {
                            textView6.setText("");
                        }
                        mm2.v4 v4Var2 = (mm2.v4) this.f394755f.f394854e.business(mm2.v4.class);
                        java.lang.String str9 = this.f394754e.f373878d;
                        if (str9 == null) {
                            str9 = "";
                        }
                        java.lang.Object O62 = v4Var2.O6(str9);
                        r45.i52 i52Var = O62 instanceof r45.i52 ? (r45.i52) O62 : null;
                        if ((i52Var != null && i52Var.getBoolean(0)) == true) {
                            rf2.q qVar6 = this.f394755f;
                            rf2.g gVar6 = rf2.g.f394737f;
                            java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dwd);
                            kotlin.jvm.internal.o.f(string5, "getString(...)");
                            qVar6.e(gVar6, string5, com.tencent.mm.R.color.aew, 17.0f, 0, false, false);
                        } else {
                            rf2.q qVar7 = this.f394755f;
                            rf2.g gVar7 = rf2.g.f394736e;
                            java.lang.String string6 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dwc);
                            kotlin.jvm.internal.o.f(string6, "getString(...)");
                            qVar7.e(gVar7, string6, com.tencent.mm.R.color.UN_BW_100_Alpha_0_8, 17.0f, com.tencent.mm.R.drawable.f481735a50, false, true);
                        }
                        if (this.f394756g == df2.dn.f229991e) {
                            if (!(i52Var != null && i52Var.getBoolean(0))) {
                                rf2.q qVar8 = this.f394755f;
                                r45.f02 f02Var4 = this.f394754e;
                                this.f394753d = 2;
                                if (rf2.q.c(qVar8, f02Var4, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
