package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ol implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f147290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147291c;

    public ol(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, java.lang.String str, int i17) {
        this.f147291c = luckyMoneyPickEnvelopeUI;
        this.f147289a = str;
        this.f147290b = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do doCheckAndUseTimeLimitPromo errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f147291c;
        android.app.Dialog dialog = luckyMoneyPickEnvelopeUI.B;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(((r45.kz) fVar.f70618d).f379041d));
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (fVar2 != null && ((r45.kz) fVar2).f379041d == 0) {
                android.content.Intent intent = new android.content.Intent();
                r45.wv3 U6 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.U6(luckyMoneyPickEnvelopeUI, this.f147289a);
                if (U6 != null) {
                    try {
                        intent.putExtra("key_envelope_source", U6.toByteArray());
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyPickEnvelopeUI", e17, "", new java.lang.Object[0]);
                    }
                    luckyMoneyPickEnvelopeUI.setResult(-1, intent);
                    if (U6.f389506o == 3) {
                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyEnvelopeTouchRecyclerView luckyMoneyEnvelopeTouchRecyclerView = luckyMoneyPickEnvelopeUI.f146521i;
                        int i17 = this.f147290b;
                        com.tencent.mm.plugin.luckymoney.ui.vm vmVar = (com.tencent.mm.plugin.luckymoney.ui.vm) luckyMoneyEnvelopeTouchRecyclerView.p0(i17);
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) luckyMoneyPickEnvelopeUI.f146521i.p0(i17).itemView;
                        int width = vmVar.f147579v.getWidth();
                        int height = vmVar.f147579v.getHeight();
                        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(config);
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(height));
                        arrayList.add(java.lang.Integer.valueOf(width));
                        java.lang.Object obj2 = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        vmVar.f147580w.draw(new android.graphics.Canvas(createBitmap));
                        vmVar.f147579v.setImageBitmap(createBitmap);
                        vmVar.f147579v.setVisibility(0);
                        vmVar.f147580w.setVisibility(4);
                        androidx.appcompat.app.AppCompatActivity context = luckyMoneyPickEnvelopeUI.getContext();
                        u4.c1 c1Var = new u4.c1(context);
                        android.content.res.XmlResourceParser xml = context.getResources().getXml(com.tencent.mm.R.transition.f494826a);
                        try {
                            try {
                                try {
                                    androidx.transition.Transition b17 = c1Var.b(xml, android.util.Xml.asAttributeSet(xml), null);
                                    xml.close();
                                    androidx.transition.TransitionSet transitionSet = (androidx.transition.TransitionSet) b17;
                                    transitionSet.T(new com.tencent.mm.plugin.luckymoney.ui.rl(luckyMoneyPickEnvelopeUI, vmVar));
                                    u4.g1.a(viewGroup, transitionSet);
                                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) vmVar.f147579v.getLayoutParams();
                                    marginLayoutParams.width = i65.a.b(luckyMoneyPickEnvelopeUI.getContext(), 256);
                                    marginLayoutParams.height = i65.a.b(luckyMoneyPickEnvelopeUI.getContext(), com.tencent.wxmm.v2helper.EMethodSetSpkEnhance);
                                    marginLayoutParams.topMargin = i65.a.b(luckyMoneyPickEnvelopeUI.getContext(), 12);
                                    vmVar.f147579v.setLayoutParams(marginLayoutParams);
                                    android.view.View findViewById = vmVar.itemView.findViewById(com.tencent.mm.R.id.f485671ik4);
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    arrayList2.add(4);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                    yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    vmVar.f147581x.setVisibility(8);
                                    vmVar.f147582y.setVisibility(8);
                                    android.view.View findViewById2 = vmVar.itemView.findViewById(com.tencent.mm.R.id.ikc);
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    arrayList3.add(0);
                                    java.util.Collections.reverse(arrayList3);
                                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI", "doReceiveAnimation", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                } catch (java.lang.Throwable th6) {
                                    xml.close();
                                    throw th6;
                                }
                            } catch (java.io.IOException e18) {
                                throw new android.view.InflateException(xml.getPositionDescription() + ": " + e18.getMessage(), e18);
                            }
                        } catch (org.xmlpull.v1.XmlPullParserException e19) {
                            throw new android.view.InflateException(e19.getMessage(), e19);
                        }
                    }
                }
            } else if (fVar2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(((r45.kz) fVar2).f379042e)) {
                com.tencent.mm.wallet_core.ui.r1.M(luckyMoneyPickEnvelopeUI.getContext(), ((r45.kz) fVar.f70618d).f379042e);
            }
        } else {
            com.tencent.mm.wallet_core.ui.r1.K(luckyMoneyPickEnvelopeUI.getContext(), fVar.f70617c);
        }
        return null;
    }
}
