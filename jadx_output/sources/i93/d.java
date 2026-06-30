package i93;

/* loaded from: classes11.dex */
public final class d extends wm3.a implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f289724d;

    /* renamed from: e, reason: collision with root package name */
    public p13.c f289725e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f289726f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f289724d = jz5.h.b(i93.c.f289723d);
        this.f289726f = jz5.h.b(new i93.a(activity));
    }

    public final float T6() {
        return ((java.lang.Number) ((jz5.n) this.f289726f).getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.CharSequence] */
    @Override // o13.x
    public void X2(p13.v vVar) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        boolean z17;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (vVar != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (p13.y yVar : vVar.f351160e) {
                com.tencent.mm.storage.d4 n17 = b93.r.wi().n1(yVar.f351187e);
                if (n17 != null) {
                    java.util.List j17 = ((l80.a) ((m80.i) i95.n0.c(m80.i.class))).f316989d.j(yVar.f351187e);
                    if (j17 == null) {
                        j17 = kz5.p0.f313996d;
                    }
                    java.lang.CharSequence charSequence = n17.field_labelName;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    java.util.List<java.lang.String> list = null;
                    switch (yVar.f351185c) {
                        case 66:
                            p13.j e17 = o13.q.e(p13.i.e(charSequence, vVar.f351159d, false, false, T6(), com.tencent.mm.plugin.fts.ui.d.f138034c));
                            if (e17.f351106b == 0) {
                                charSequence = e17.f351105a;
                                break;
                            }
                            break;
                        case 67:
                            p13.j e18 = o13.q.e(p13.i.e(charSequence, vVar.f351159d, true, false, T6(), com.tencent.mm.plugin.fts.ui.d.f138034c));
                            if (e18.f351106b == 0) {
                                charSequence = e18.f351105a;
                                break;
                            }
                            break;
                        case 68:
                            p13.j e19 = o13.q.e(p13.i.e(charSequence, vVar.f351159d, true, true, T6(), com.tencent.mm.plugin.fts.ui.d.f138034c));
                            if (e19.f351106b == 0) {
                                charSequence = e19.f351105a;
                                break;
                            }
                            break;
                        case 69:
                            u50.u uVar = new u50.u();
                            uVar.f424774d = vVar.f351159d;
                            uVar.f424771a = getActivity();
                            uVar.f424772b = yVar.f351196n;
                            uVar.f424773c = (java.lang.String[]) j17.toArray(new java.lang.String[0]);
                            uVar.f424777g = (int) T6();
                            uVar.f424775e = com.tencent.mm.plugin.fts.ui.d.f138036e;
                            uVar.f424778h = 8;
                            ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).getClass();
                            spannableStringBuilder = com.tencent.mm.plugin.fts.ui.n3.e(uVar);
                            break;
                    }
                    spannableStringBuilder = null;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new android.text.SpannableStringBuilder();
                        if (j17.isEmpty()) {
                            z17 = false;
                        } else if (j17.size() >= 8) {
                            z17 = false;
                            list = j17.subList(0, 8);
                        } else {
                            z17 = false;
                            list = j17.subList(0, j17.size());
                        }
                        if (list != null) {
                            for (java.lang.String str : list) {
                                com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                                if (n18 != null) {
                                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                                    java.lang.String c17 = c01.a2.c(n18, str);
                                    if (spannableStringBuilder.length() > 0 ? true : z17) {
                                        spannableStringBuilder.append((java.lang.CharSequence) ", ");
                                    }
                                    spannableStringBuilder.append((java.lang.CharSequence) c17);
                                }
                            }
                        }
                    }
                    yVar.f351197o = new jz5.l(charSequence, spannableStringBuilder);
                    arrayList.add(n17);
                    arrayList2.add(yVar);
                }
            }
            if (activity instanceof com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI) {
                pm0.v.X(new i93.b(activity, arrayList, arrayList2, vVar));
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f289725e);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.profile.RepairerConfigLabelSearchByContact()) == 1) {
            com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent();
            updateSearchIndexAtOnceEvent.f54924g.f6419a = 0L;
            updateSearchIndexAtOnceEvent.e();
        }
    }
}
