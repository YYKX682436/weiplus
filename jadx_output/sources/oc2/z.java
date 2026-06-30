package oc2;

/* loaded from: classes8.dex */
public final class z extends oc2.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView f344324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView, android.content.Context context) {
        super(renderView, context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f344324f = renderView;
    }

    public int i(oc2.l0 renderContext, oc2.y0 split) {
        float f17;
        r45.lp lpVar;
        r45.kn knVar;
        kotlin.jvm.internal.o.g(renderContext, "renderContext");
        kotlin.jvm.internal.o.g(split, "split");
        setSplit(split);
        oc2.y yVar = (oc2.y) kz5.n0.Z(split.f344322b);
        float f18 = 0.0f;
        if (yVar != null) {
            oc2.w wVar = renderContext.f344219a;
            r45.cp5 a17 = a(wVar);
            if (a17 != null) {
                int intValue = ((java.lang.Number) d(((java.lang.Number) oc2.v.f344282a.r(a17, wVar).f302833d).intValue()).f302833d).intValue();
                if (intValue == -2) {
                    intValue = this.f344324f.f105810e;
                }
                f17 = (intValue / 2) + 0.0f;
            } else {
                f17 = 0.0f;
            }
            oc2.v vVar = oc2.v.f344282a;
            r45.cp5 cp5Var = yVar.f344311a;
            kotlin.jvm.internal.o.f(getContext(), "getContext(...)");
            float width = f17 + oc2.v.d(vVar, cp5Var, r3, wVar, 0.0f, 4, null).getWidth();
            kotlin.jvm.internal.o.f(getContext(), "getContext(...)");
            r45.yo5 yo5Var = yVar.f344311a.f371770f;
            f18 = width + (vVar.m(r1, (yo5Var == null || (lpVar = yo5Var.f391262e) == null || (knVar = lpVar.f379688g) == null) ? 0 : knVar.f378841d, 0.0f) * 2);
        }
        return (int) f18;
    }

    public void j(oc2.l0 renderContext, oc2.y0 split) {
        wo0.c b17;
        r45.t60 t60Var;
        r45.lp lpVar;
        r45.lp lpVar2;
        r45.lp lpVar3;
        kotlin.jvm.internal.o.g(renderContext, "renderContext");
        kotlin.jvm.internal.o.g(split, "split");
        setSplit(split);
        oc2.y yVar = (oc2.y) kz5.n0.Z(split.f344322b);
        if (yVar != null) {
            oc2.w wVar = renderContext.f344219a;
            oc2.v vVar = oc2.v.f344282a;
            r45.cp5 cp5Var = yVar.f344311a;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.util.Size d17 = oc2.v.d(vVar, cp5Var, context, wVar, 0.0f, 4, null);
            r45.cp5 cp5Var2 = yVar.f344311a;
            java.lang.String o17 = vVar.o(cp5Var2, wVar);
            r45.yo5 yo5Var = cp5Var2.f371770f;
            com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView = this.f344324f;
            float floatValue = ((yo5Var == null || (lpVar3 = yo5Var.f391262e) == null) ? java.lang.Integer.valueOf(renderView.f105812g) : java.lang.Float.valueOf(lpVar3.f379687f)).floatValue();
            r45.yo5 yo5Var2 = cp5Var2.f371770f;
            boolean a17 = kotlin.jvm.internal.o.a((yo5Var2 == null || (lpVar2 = yo5Var2.f391262e) == null) ? null : java.lang.Float.valueOf(lpVar2.f379687f), 0.5f);
            r45.yo5 yo5Var3 = cp5Var2.f371770f;
            r45.kn knVar = (yo5Var3 == null || (lpVar = yo5Var3.f391262e) == null) ? null : lpVar.f379688g;
            int c17 = c(knVar != null ? knVar.f378842e : null, this.f344208e.f105809d);
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            int m17 = vVar.m(context2, knVar != null ? knVar.f378841d : 0, 0.0f);
            android.content.Context context3 = getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            android.widget.ImageView b0Var = new oc2.b0(context3, c17, m17, a17 ? d17.getWidth() : floatValue);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(d17.getWidth(), d17.getHeight());
            layoutParams.gravity = 17;
            b0Var.setLayoutParams(layoutParams);
            b0Var.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            b0Var.setId(com.tencent.mm.R.id.g19);
            java.lang.String g17 = vVar.g(cp5Var2, wVar);
            r45.yo5 yo5Var4 = cp5Var2.f371770f;
            int alpha = android.graphics.Color.alpha(c((yo5Var4 == null || (t60Var = yo5Var4.f391261d) == null) ? null : t60Var.f386167e, android.graphics.Color.parseColor("#FFFFFFFF")));
            b0Var.setVisibility(0);
            b0Var.setAlpha(alpha / 255.0f);
            com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
            com.tencent.mm.plugin.finder.storage.z70 z70Var = com.tencent.mm.plugin.finder.storage.z70.f128432a;
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (!((java.lang.Boolean) z70Var.d(t70Var, "视频号红点头像模拟弱网", bool, new com.tencent.mm.plugin.finder.storage.u70("FINDER_RED_DOT_IMAGE_VIEW_MOCK_POOR_NET"))).booleanValue() || ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(z70Var, t70Var, "视频号发现页红点头像预加载开关", e42.c0.clicfg_finder_red_dot_avatar_pre_load, bool, false, com.tencent.mm.plugin.finder.storage.xf0.f128308d, 8, null)).booleanValue()) {
                android.graphics.Bitmap q17 = vVar.q(g17, a17, floatValue);
                if (q17 != null) {
                    com.tencent.mars.xlog.Log.i("Finder.RenderView", "loadAvatar clientAvatarUsername=" + g17 + ",isRound=" + a17 + ",radius=" + floatValue);
                    b0Var.setImageBitmap(q17);
                } else {
                    if (o17.length() > 0) {
                        boolean z17 = floatValue == 0.0f;
                        mn2.g1 g1Var = mn2.g1.f329975a;
                        if (z17) {
                            b17 = g1Var.i().b(new mn2.n(o17, renderView.f105828z ? com.tencent.mm.plugin.finder.storage.y90.W : com.tencent.mm.plugin.finder.storage.y90.V), g1Var.h(mn2.f1.f329961o));
                        } else if (a17) {
                            b17 = g1Var.a().b(new mn2.n(o17, renderView.f105828z ? com.tencent.mm.plugin.finder.storage.y90.W : com.tencent.mm.plugin.finder.storage.y90.V), g1Var.h(mn2.f1.f329957h));
                        } else {
                            b17 = g1Var.l().b(new mn2.n(o17, renderView.f105828z ? com.tencent.mm.plugin.finder.storage.y90.W : com.tencent.mm.plugin.finder.storage.y90.V), g1Var.h(mn2.f1.f329961o));
                        }
                        vVar.u(b17, renderView.h(), renderView.getCtrlInfo(), renderView.getShowInfo(), o17);
                        b17.c(b0Var);
                    } else {
                        b0Var.setImageResource(com.tencent.mm.R.drawable.bhm);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("Finder.RenderView", "mock a poor network environment!");
            }
            addView(b0Var);
            r45.cp5 a18 = a(wVar);
            if (a18 != null) {
                int s17 = vVar.s(a18, wVar, 2);
                jz5.l r17 = vVar.r(a18, wVar);
                int intValue = ((java.lang.Number) r17.f302833d).intValue();
                java.lang.String str = (java.lang.String) r17.f302834e;
                jz5.l d18 = d(intValue);
                int intValue2 = ((java.lang.Number) d18.f302833d).intValue();
                int intValue3 = ((java.lang.Number) d18.f302834e).intValue();
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(intValue2, intValue3);
                if (intValue2 == -2) {
                    intValue2 = renderView.f105810e;
                }
                g(layoutParams2, s17, 0, (-intValue2) / 2);
                if (s17 == 6) {
                    layoutParams2.setMarginEnd(layoutParams2.getMarginEnd() - (renderView.f105812g + (intValue2 / 2)));
                }
                if (s17 == 7) {
                    layoutParams2.setMarginStart(layoutParams2.getMarginStart() - (renderView.f105812g + (intValue2 / 2)));
                }
                imageView.setLayoutParams(layoutParams2);
                e(imageView, str, intValue);
                f(this, imageView);
                addView(imageView);
            }
            com.tencent.mars.xlog.Log.i(renderView.h(), "avatar render size=" + d17);
        }
    }
}
