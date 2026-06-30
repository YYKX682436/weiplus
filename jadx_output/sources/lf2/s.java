package lf2;

/* loaded from: classes10.dex */
public final class s extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final gk2.e H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f318303J;
    public int K;
    public final jz5.g L;
    public final jz5.g M;
    public android.view.View N;
    public android.view.View P;
    public android.view.View Q;
    public final int R;
    public final int S;
    public int T;
    public android.widget.TextView U;
    public com.tencent.mm.ui.widget.MMSwitchBtn V;
    public com.tencent.mm.ui.widget.MMSwitchBtn W;
    public android.widget.SeekBar X;
    public android.widget.SeekBar Y;
    public final android.view.View.OnClickListener Z;

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.View.OnClickListener f318304p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, gk2.e buContext, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController baseController) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(baseController, "baseController");
        this.H = buContext;
        this.I = 5;
        this.K = -1;
        this.L = jz5.h.b(lf2.n.f318298d);
        this.M = jz5.h.b(new lf2.m(context, this));
        this.R = -12;
        this.S = 12;
        this.Z = new lf2.o(this);
        this.f318304p0 = new lf2.p(this);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.drr;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getString(com.tencent.mm.R.string.mjh);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.rss);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.N = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.rsu);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.P = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.rt6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.Q = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.rsl);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.U = (android.widget.TextView) findViewById4;
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.view.View view = this.P;
        if (view == null) {
            kotlin.jvm.internal.o.o("plusKeyView");
            throw null;
        }
        zl2.r4.c3(r4Var, view, 0, 0, 6, null);
        android.view.View view2 = this.N;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("minusKeyView");
            throw null;
        }
        zl2.r4.c3(r4Var, view2, 0, 0, 6, null);
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.rsr);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.W = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.rso);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.V = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.tencent.mm.R.id.rsy);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.X = (android.widget.SeekBar) findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.tencent.mm.R.id.rsm);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.Y = (android.widget.SeekBar) findViewById8;
        android.widget.SeekBar seekBar = this.X;
        if (seekBar == null) {
            kotlin.jvm.internal.o.o("voiceVolume");
            throw null;
        }
        seekBar.setOnSeekBarChangeListener(new lf2.g(this));
        android.widget.SeekBar seekBar2 = this.Y;
        if (seekBar2 == null) {
            kotlin.jvm.internal.o.o("accompanyVolume");
            throw null;
        }
        seekBar2.setOnSeekBarChangeListener(new lf2.h(this));
        android.view.View findViewById9 = rootView.findViewById(com.tencent.mm.R.id.f485466rt5);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById9;
        this.f318303J = wxRecyclerView;
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(this.f118183e, this.I, 1, false));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f318303J;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("mReverberationRv");
            throw null;
        }
        wxRecyclerView2.setAdapter((lf2.l) ((jz5.n) this.M).getValue());
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f318303J;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("mReverberationRv");
            throw null;
        }
        wxRecyclerView3.setVerticalScrollBarEnabled(false);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f318303J;
        if (wxRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("mReverberationRv");
            throw null;
        }
        wxRecyclerView4.setHasFixedSize(true);
        d0();
        Y(com.tencent.mm.R.color.f478489a);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        gk2.e eVar = this.H;
        int P6 = ((om2.l) eVar.a(om2.l.class)).P6();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        jSONObject.put("sdk_type", P6);
        android.widget.SeekBar seekBar = this.X;
        if (seekBar == null) {
            kotlin.jvm.internal.o.o("voiceVolume");
            throw null;
        }
        jSONObject.put("human_voice", seekBar.getProgress());
        android.widget.SeekBar seekBar2 = this.Y;
        if (seekBar2 == null) {
            kotlin.jvm.internal.o.o("accompanyVolume");
            throw null;
        }
        jSONObject.put("accompany", seekBar2.getProgress());
        jSONObject.put("rise_fall_tones", this.T);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.V;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("earSwitch");
            throw null;
        }
        jSONObject.put("return_ear", mMSwitchBtn.f211363x ? 1 : 0);
        jSONObject.put("reverb_mode", ((om2.m) ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346297p).getValue()).f346357e);
        if (zl2.r4.f473950a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.Z1, jSONObject.toString(), null, 4, null);
        } else {
            int i17 = this.K;
            if (i17 != -1) {
                jSONObject.put(ya.b.SOURCE, i17);
            }
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.f327263r2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    public final java.util.LinkedList e0() {
        return (java.util.LinkedList) ((jz5.n) this.L).getValue();
    }

    public final void f0() {
        ((kotlinx.coroutines.flow.h3) ((om2.e) this.H.a(om2.e.class)).f346293i).k(java.lang.Integer.valueOf(this.T));
        int i17 = this.T;
        if (i17 > 0) {
            android.widget.TextView textView = this.U;
            if (textView == null) {
                kotlin.jvm.internal.o.o("keyText");
                throw null;
            }
            textView.setText("+" + this.T);
        } else if (i17 == 0) {
            android.widget.TextView textView2 = this.U;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("keyText");
                throw null;
            }
            textView2.setText(" " + this.T);
        } else {
            android.widget.TextView textView3 = this.U;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("keyText");
                throw null;
            }
            textView3.setText(java.lang.String.valueOf(i17));
        }
        if (this.T <= this.R) {
            android.view.View view = this.N;
            if (view == null) {
                kotlin.jvm.internal.o.o("minusKeyView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = this.N;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("minusKeyView");
                throw null;
            }
            view2.setOnClickListener(null);
        } else {
            android.view.View view3 = this.N;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("minusKeyView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view4 = this.N;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("minusKeyView");
                throw null;
            }
            view4.setOnClickListener(this.Z);
        }
        if (this.T >= this.S) {
            android.view.View view5 = this.P;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("plusKeyView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view6 = this.P;
            if (view6 != null) {
                view6.setOnClickListener(null);
                return;
            } else {
                kotlin.jvm.internal.o.o("plusKeyView");
                throw null;
            }
        }
        android.view.View view7 = this.P;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("plusKeyView");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view7.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view8 = this.P;
        if (view8 != null) {
            view8.setOnClickListener(this.f318304p0);
        } else {
            kotlin.jvm.internal.o.o("plusKeyView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean w() {
        return true;
    }
}
