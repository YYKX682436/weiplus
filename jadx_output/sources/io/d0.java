package io;

/* loaded from: classes10.dex */
public final class d0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.g1 f293175a;

    /* renamed from: b, reason: collision with root package name */
    public xb5.a f293176b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f293175a == null) {
            this.f293175a = new em.g1(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dux, (android.view.ViewGroup) null));
        }
        em.g1 g1Var = this.f293175a;
        kotlin.jvm.internal.o.d(g1Var);
        android.view.View view = g1Var.f254343a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(xb5.a aVar) {
        jz5.f0 f0Var;
        java.lang.String string;
        java.lang.String str;
        this.f293176b = aVar;
        em.g1 g1Var = this.f293175a;
        if (g1Var == null) {
            return;
        }
        if (aVar == null) {
            android.view.View view = g1Var.f254343a;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatting/viewfactory/ContactItemView", "updateViewModel", "(Lcom/tencent/mm/ui/chatting/contact/ContactItemViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatting/viewfactory/ContactItemView", "updateViewModel", "(Lcom/tencent/mm/ui/chatting/contact/ContactItemViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        g1Var.a().setSelected(aVar.f453008f);
        g1Var.a().setChecked(aVar.f453008f);
        g1Var.a().setVisibility(0);
        if (g1Var.f254344b == null) {
            g1Var.f254344b = (android.widget.RelativeLayout) g1Var.f254343a.findViewById(com.tencent.mm.R.id.hhb);
        }
        g1Var.f254344b.setVisibility(0);
        if (g1Var.f254344b == null) {
            g1Var.f254344b = (android.widget.RelativeLayout) g1Var.f254343a.findViewById(com.tencent.mm.R.id.hhb);
        }
        g1Var.f254344b.setOnClickListener(new io.b0(aVar));
        if (g1Var.f254346d == null) {
            g1Var.f254346d = (android.widget.FrameLayout) g1Var.f254343a.findViewById(com.tencent.mm.R.id.rtd);
        }
        g1Var.f254346d.setOnClickListener(new io.c0(aVar, g1Var));
        java.lang.String str2 = aVar.f453006d;
        if (!(!r26.n0.N(str2))) {
            str2 = null;
        }
        if (str2 != null) {
            kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
            if (g1Var.f254345c == null) {
                g1Var.f254345c = (android.widget.ImageView) g1Var.f254343a.findViewById(com.tencent.mm.R.id.a_4);
            }
            ((com.tencent.mm.feature.avatar.w) zVar).Ri(g1Var.f254345c, str2, 0.1f);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str2);
            if (g1Var.f254350h == null) {
                g1Var.f254350h = (android.widget.TextView) g1Var.f254343a.findViewById(com.tencent.mm.R.id.kbq);
            }
            g1Var.f254350h.setText(pg5.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a, e17));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (g1Var.f254345c == null) {
                g1Var.f254345c = (android.widget.ImageView) g1Var.f254343a.findViewById(com.tencent.mm.R.id.a_4);
            }
            android.widget.ImageView imageView = g1Var.f254345c;
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bhm));
            arrayList2.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/chatting/viewfactory/ContactItemView", "updateViewModel", "(Lcom/tencent/mm/ui/chatting/contact/ContactItemViewModel;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/chatting/viewfactory/ContactItemView", "updateViewModel", "(Lcom/tencent/mm/ui/chatting/contact/ContactItemViewModel;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            imageView.setImageBitmap(decodeResource);
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f453006d, true);
        if (n17 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).getClass();
            long c17 = g95.e.f269801a.c(n17.d1());
            com.tencent.mars.xlog.Log.i("AddContactFeatureServic", "[initFriendSourceTime] time:%s", java.lang.Long.valueOf(c17));
            java.lang.String str3 = "";
            sb6.append(c17 > 0 ? k35.m1.d(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492149fe4), c17) : "");
            ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).getClass();
            com.tencent.mars.xlog.Log.i("AddContactFeatureServic", "[getFriendSource] source:%s", java.lang.Integer.valueOf(n17.getSource()));
            int source = n17.getSource();
            if (source != 1) {
                if (source != 8) {
                    if (source == 10) {
                        str3 = n17.f236575p0 > 1000000 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nc6) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nc7);
                    } else if (source == 34) {
                        str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbk);
                    } else if (source == 48) {
                        str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nby);
                    } else if (source == 76) {
                        str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbv);
                    } else if (source != 3) {
                        if (source != 4) {
                            if (source == 17) {
                                str3 = n17.f236575p0 > 1000000 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbn) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbo);
                            } else if (source != 18) {
                                switch (source) {
                                    case 12:
                                        break;
                                    case 13:
                                        if (n17.f236575p0 <= 1000000) {
                                            str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nc7);
                                            break;
                                        } else {
                                            str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nc6);
                                            break;
                                        }
                                    case 14:
                                        break;
                                    case 15:
                                        if (n17.f236575p0 <= 1000000) {
                                            str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490996nc0);
                                            break;
                                        } else {
                                            str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbz);
                                            break;
                                        }
                                    default:
                                        switch (source) {
                                            case 22:
                                            case 23:
                                            case 24:
                                            case 26:
                                            case 27:
                                            case 28:
                                            case 29:
                                                if (n17.f236575p0 <= 1000000) {
                                                    str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491001nc5);
                                                    break;
                                                } else {
                                                    str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491000nc4);
                                                    break;
                                                }
                                            case 25:
                                                if (n17.f236575p0 <= 1000000) {
                                                    str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbm);
                                                    break;
                                                } else {
                                                    str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbl);
                                                    break;
                                                }
                                            case 30:
                                                if (n17.f236575p0 <= 1000000) {
                                                    str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbx);
                                                    break;
                                                } else {
                                                    str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbw);
                                                    break;
                                                }
                                            default:
                                                switch (source) {
                                                    case 58:
                                                    case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                                                    case 60:
                                                        str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492237o54);
                                                        break;
                                                }
                                        }
                                }
                            } else {
                                str3 = n17.f236575p0 > 1000000 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbt) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbu);
                            }
                        }
                        str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490997nc1);
                    } else {
                        str3 = n17.f236575p0 > 1000000 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490998nc2) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490999nc3);
                    }
                }
                com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.Z0(), true);
                if (n18 == null || com.tencent.mm.sdk.platformtools.t8.K0(n18.d1())) {
                    str = null;
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(n18.P0())) {
                    rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
                    java.lang.String d17 = n18.d1();
                    ((c01.w1) eVar).getClass();
                    str = c01.v1.p(d17);
                } else {
                    str = n18.P0();
                }
                str3 = n17.f236575p0 > 1000000 ? !com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbr, str) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbp) : !com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbs, str) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nbq);
            } else {
                str3 = n17.f236575p0 > 1000000 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bjb) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490997nc1);
            }
            sb6.append(str3);
            java.lang.String sb7 = sb6.toString();
            if (g1Var.f254349g == null) {
                g1Var.f254349g = (android.widget.TextView) g1Var.f254343a.findViewById(com.tencent.mm.R.id.rmd);
            }
            g1Var.f254349g.setText(sb7);
            long j17 = aVar.f453007e;
            if (j17 <= 0) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.oav);
            } else {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.f492149fe4);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                string = context.getString(com.tencent.mm.R.string.o78, android.text.format.DateFormat.format(string2, j17).toString());
            }
            kotlin.jvm.internal.o.d(string);
            if (g1Var.f254348f == null) {
                g1Var.f254348f = (android.widget.TextView) g1Var.f254343a.findViewById(com.tencent.mm.R.id.u8u);
            }
            g1Var.f254348f.setText(string);
        }
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293176b;
    }
}
