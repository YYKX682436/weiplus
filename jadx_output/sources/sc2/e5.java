package sc2;

/* loaded from: classes2.dex */
public class e5 extends ad2.h {

    /* renamed from: x, reason: collision with root package name */
    public boolean f405860x;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f405859w = "Finder.FeedJumperSubtitleBubbleObserver";

    /* renamed from: y, reason: collision with root package name */
    public final int f405861y = 10000;

    @Override // ad2.h
    public void C(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.C(holder);
        this.f405860x = false;
    }

    public final gs2.a G(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        boolean z17 = false;
        int i17 = nyVar != null ? nyVar.f135380n : 0;
        if (finderJumpInfo.getBusiness_type() == 66) {
            return gs2.a.f275049e;
        }
        if (finderJumpInfo.getBusiness_type() == 82) {
            return gs2.a.f275048d;
        }
        if ((context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI) && i17 == 172) {
            z17 = true;
        }
        return z17 ? gs2.a.f275050f : gs2.a.f275063v;
    }

    public final r45.ci6 H(xc2.p0 p0Var) {
        java.lang.Object obj;
        java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
        if (style == null) {
            return null;
        }
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).getInteger(2) == 18) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var != null) {
            return (r45.ci6) wf6Var.getCustom(25);
        }
        return null;
    }

    public final void I(android.view.View view, boolean z17, java.lang.String str) {
        int i17;
        boolean z18 = true;
        if (z17) {
            if (this.f405860x) {
                return;
            } else {
                this.f405860x = true;
            }
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.egg);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.egf);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f484512tf3);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484511tf2);
        if (z17) {
            textView.setText(str);
            textView3.setVisibility(0);
            linearLayout.setOrientation(1);
        } else {
            textView3.setVisibility(8);
            linearLayout.setOrientation(0);
        }
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
            z18 = false;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z18 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        float dimensionPixelOffset = (i18 * 0.6f) - view.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df);
        float dimensionPixelOffset2 = view.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        float measureText = textView2.getPaint().measureText(textView2.getText().toString());
        float measureText2 = textView.getPaint().measureText(str);
        float max = (z17 ? java.lang.Math.max(measureText, measureText2) : measureText2 + measureText) + dimensionPixelOffset2;
        if (!z17 || max <= dimensionPixelOffset) {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = -2;
            linearLayout.setLayoutParams(layoutParams);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            layoutParams2.width = (int) dimensionPixelOffset;
            linearLayout.setLayoutParams(layoutParams2);
        }
        if (z17 || max < dimensionPixelOffset) {
            return;
        }
        textView.setText(android.text.TextUtils.ellipsize(str, textView.getPaint(), (dimensionPixelOffset - measureText) - dimensionPixelOffset2, android.text.TextUtils.TruncateAt.END));
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f405859w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public boolean o(in5.s0 holder, com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(info, "info");
        gs2.c cVar = gs2.c.f275072a;
        int hashCode = holder.hashCode();
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return cVar.c(hashCode, G(context, info));
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        android.content.Context context;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        r45.vx0 vx0Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        r45.ci6 H = H(infoEx);
        if (H == null) {
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = infoEx.f453234a;
        if (!o(holder, finderJumpInfo2)) {
            D(8);
            com.tencent.mars.xlog.Log.i(this.f405859w, "[onBindView] priority not ok");
            return;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        if (baseFinderFeed == null) {
            return;
        }
        android.content.Context context2 = holder.f293121e;
        java.lang.String string = H.getString(1);
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = H.getString(2);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String string3 = H.getString(3);
        java.lang.String str2 = string3 == null ? "" : string3;
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.egg);
        android.widget.TextView textView2 = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.egf);
        android.widget.TextView textView3 = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.f484511tf2);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) jumpView.findViewById(com.tencent.mm.R.id.egc);
        java.lang.String icon_url = finderJumpInfo2.getIcon_url();
        boolean z17 = icon_url == null || icon_url.length() == 0;
        android.content.Context context3 = holder.f293121e;
        if (z17) {
            weImageView.setImageResource(com.tencent.mm.R.raw.finder_icon_video_playlist_fill);
            weImageView.setIconColor(context3.getColor(com.tencent.mm.R.color.f478526a7));
            context = context3;
            finderJumpInfo = finderJumpInfo2;
        } else {
            weImageView.clearColorFilter();
            weImageView.setLayerPaint(null);
            weImageView.setIconColor(0);
            mn2.g1 g1Var = mn2.g1.f329975a;
            context = context3;
            finderJumpInfo = finderJumpInfo2;
            g1Var.e().b(new mn2.q3(finderJumpInfo2.getIcon_url(), com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.B)).c(weImageView);
        }
        textView.setText(str);
        textView2.setText(string2);
        textView3.setText(str2);
        textView3.setOnClickListener(new sc2.d5(this, context2, infoEx, jumpView, str2));
        I(jumpView, this.f405860x, str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) textView.getText());
        sb6.append((java.lang.Object) textView2.getText());
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.d(context2);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.V6().getInteger(5) : 0;
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        java.lang.String str3 = integer + "-14-$172-" + java.lang.System.currentTimeMillis();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("sourceid", str3);
        jSONObject.put("traceid", str3);
        jz5.l[] lVarArr = new jz5.l[4];
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        lVarArr[0] = new jz5.l("collection_id", pm0.v.u((object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) ? 0L : vx0Var.getLong(0)));
        lVarArr[1] = new jz5.l("bubble_text", sb7);
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        lVarArr[3] = new jz5.l("jump_id", jSONObject.toString());
        android.content.Context context4 = context;
        com.tencent.mm.plugin.finder.report.d2.m(d2Var, jumpView, "feed_jumpicon", 0, 0, kz5.c1.k(lVarArr), null, 44, null);
        gs2.c cVar = gs2.c.f275072a;
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        cVar.e(holder, jumpView, G(context4, finderJumpInfo), false);
    }

    @Override // ad2.h
    public void z(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, int i17) {
        r45.ci6 H;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.z(holder, jumpView, infoEx, i17);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        int jumpinfo_type = finderJumpInfo.getJumpinfo_type();
        com.tencent.mm.protocal.protobuf.NativeInfo native_info = finderJumpInfo.getNative_info();
        java.lang.Integer valueOf = native_info != null ? java.lang.Integer.valueOf(native_info.getNative_type()) : null;
        if ((jumpinfo_type == 3 && ((valueOf != null && valueOf.intValue() == 55) || (valueOf != null && valueOf.intValue() == 31))) && (H = H(infoEx)) != null) {
            java.lang.String string = H.getString(3);
            if (string == null) {
                string = "";
            }
            if (jumpView.getContext() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI) {
                return;
            }
            if (string.length() > 0) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
                long b17 = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? 0L : bu2.z.b(feedObject2);
                int i18 = i17 * 1000;
                float f17 = (float) b17;
                float f18 = f17 > 0.0f ? i18 / f17 : 1.0f;
                if (b17 - i18 < this.f405861y || f18 > 0.9d) {
                    if (!this.f405860x) {
                        xc2.n nVar = xc2.n.f453212a;
                        android.content.Context context = jumpView.getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("phase", 1);
                        xc2.n.c(nVar, context, jumpView, infoEx, 0, null, null, jSONObject, null, 184, null);
                    }
                    java.lang.String string2 = H.getString(1);
                    I(jumpView, true, string2 != null ? string2 : "");
                }
            }
        }
    }
}
