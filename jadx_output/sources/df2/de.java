package df2;

/* loaded from: classes3.dex */
public class de extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f229970m;

    /* renamed from: n, reason: collision with root package name */
    public if2.d0 f229971n;

    /* renamed from: o, reason: collision with root package name */
    public df2.l9 f229972o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        Z6();
    }

    public final void Z6() {
        android.view.View findViewById;
        boolean z17 = ((mm2.o4) business(mm2.o4.class)).Z6().size() > 0;
        boolean z18 = ((mm2.c1) business(mm2.c1.class)).L9() && O6().getResources().getConfiguration().orientation == 1;
        com.tencent.mars.xlog.Log.i("LiveGuideBubbleController", "[needChangeBgColor] isOnMic:" + z17 + ", supportOrientation:" + z18);
        if (z18 || z17) {
            android.view.View view = this.f229970m;
            findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.rm8) : null;
            if (findViewById != null) {
                findViewById.setBackgroundDrawable(O6().getDrawable(com.tencent.mm.R.drawable.cs_));
                return;
            }
            return;
        }
        android.view.View view2 = this.f229970m;
        findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.rm8) : null;
        if (findViewById != null) {
            findViewById.setBackgroundDrawable(O6().getDrawable(com.tencent.mm.R.drawable.cs9));
        }
    }

    public final void a7(java.lang.String source, df2.l9 targetBubble) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(targetBubble, "targetBubble");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dismiss: source=");
        sb6.append(source);
        sb6.append(", targetBubble=");
        sb6.append(targetBubble.getTag());
        sb6.append(", currentBubble=");
        df2.l9 l9Var = this.f229972o;
        sb6.append(l9Var != null ? l9Var.getTag() : null);
        com.tencent.mars.xlog.Log.i("LiveGuideBubbleController", sb6.toString());
        df2.l9 l9Var2 = this.f229972o;
        if (l9Var2 != null && !kotlin.jvm.internal.o.b(targetBubble, l9Var2)) {
            com.tencent.mars.xlog.Log.w("LiveGuideBubbleController", "dismiss: error, dismiss wrong bubble");
            return;
        }
        android.view.View view = this.f229970m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveBottomRightGuideBubbleController", "dismiss", "(Ljava/lang/String;Lcom/tencent/mm/plugin/finder/live/controller/IGuideBubble;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveBottomRightGuideBubbleController", "dismiss", "(Ljava/lang/String;Lcom/tencent/mm/plugin/finder/live/controller/IGuideBubble;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((je2.h) business(je2.h.class)).f299234g = 0;
        ((je2.h) business(je2.h.class)).N6(false);
        if2.d0 d0Var = this.f229971n;
        if (d0Var != null) {
            d0Var.d(8);
        }
        this.f229972o = null;
        android.view.View d76 = d7();
        if (d76 != null) {
            d76.setOnClickListener(null);
        }
        android.view.View view2 = this.f229970m;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.rud) : null;
        if (findViewById != null) {
            findViewById.setOnClickListener(null);
        }
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView b7() {
        android.view.View view = this.f229970m;
        if (view != null) {
            return (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.rub);
        }
        return null;
    }

    public final android.widget.TextView c7() {
        android.view.View view = this.f229970m;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ruc);
        }
        return null;
    }

    public final android.view.View d7() {
        android.view.View view = this.f229970m;
        if (view != null) {
            return view.findViewById(com.tencent.mm.R.id.rua);
        }
        return null;
    }

    public final android.widget.TextView e7() {
        android.view.View view = this.f229970m;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.rue);
        }
        return null;
    }

    public final android.view.View f7(df2.l9 targetBubble) {
        kotlin.jvm.internal.o.g(targetBubble, "targetBubble");
        if (kotlin.jvm.internal.o.b(targetBubble, this.f229972o)) {
            return this.f229970m;
        }
        return null;
    }

    public final void g7(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.view.View d76 = d7();
        if (d76 != null) {
            d76.setOnClickListener(new df2.ae(callback));
        }
    }

    public final void h7(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.view.View view = this.f229970m;
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.rud) : null;
        if (findViewById != null) {
            findViewById.setOnClickListener(new df2.be(callback));
        }
    }

    public void i7(r45.tm1 info) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(info, "info");
        df2.l9 l9Var = this.f229972o;
        if (l9Var == null || (str = l9Var.getTag()) == null) {
            str = "LiveGuideBubbleController";
        }
        com.tencent.mars.xlog.Log.i(str, "onBubbleInfoMsg: infoType=" + info.getInteger(0));
    }

    public final void k7(df2.l9 targetBubble) {
        if2.d0 d0Var;
        df2.l9 l9Var;
        kotlin.jvm.internal.o.g(targetBubble, "targetBubble");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showBubble: targetBubble=");
        sb6.append(targetBubble.getTag());
        sb6.append(", currentBubble=");
        df2.l9 l9Var2 = this.f229972o;
        sb6.append(l9Var2 != null ? l9Var2.getTag() : null);
        com.tencent.mars.xlog.Log.i("LiveGuideBubbleController", sb6.toString());
        df2.l9 l9Var3 = this.f229972o;
        if (l9Var3 != null && !kotlin.jvm.internal.o.b(l9Var3, targetBubble) && (l9Var = this.f229972o) != null) {
            l9Var.b5();
        }
        this.f229972o = targetBubble;
        this.f229970m = T6(com.tencent.mm.R.id.rm9, com.tencent.mm.R.id.rm7);
        android.widget.TextView c76 = c7();
        if (c76 != null) {
            com.tencent.mm.ui.fk.a(c76);
        }
        android.view.View view = this.f229970m;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ruf) : null;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.widget.TextView e76 = e7();
        if (e76 != null) {
            e76.setVisibility(8);
        }
        pm0.v.V(100L, new df2.zd(this));
        android.view.View view2 = this.f229970m;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveBottomRightGuideBubbleController", "showBubble", "(Lcom/tencent/mm/plugin/finder/live/controller/IGuideBubble;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/LiveBottomRightGuideBubbleController", "showBubble", "(Lcom/tencent/mm/plugin/finder/live/controller/IGuideBubble;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        je2.h hVar = (je2.h) business(je2.h.class);
        android.view.View view3 = this.f229970m;
        android.view.View findViewById = view3 != null ? view3.findViewById(com.tencent.mm.R.id.rm8) : null;
        hVar.f299234g = findViewById != null ? findViewById.getWidth() : 0;
        android.view.View view4 = this.f229970m;
        if (view4 != null) {
            if2.d0 d0Var2 = new if2.d0(view4, this);
            this.f229971n = d0Var2;
            this.f291103i = new df2.ce(d0Var2);
        }
        if (((mm2.c1) business(mm2.c1.class)).N1 && (d0Var = this.f229971n) != null) {
            d0Var.c(8, 2);
        }
        if2.d0 d0Var3 = this.f229971n;
        if (d0Var3 != null) {
            d0Var3.d(0);
        }
        Z6();
        ((je2.h) business(je2.h.class)).N6(true);
    }

    public final void l7(df2.d9 info) {
        jz5.f0 f0Var;
        com.tencent.mm.ui.widget.imageview.WeImageView b76;
        android.widget.TextView e76;
        kotlin.jvm.internal.o.g(info, "info");
        android.view.View view = this.f229970m;
        jz5.f0 f0Var2 = null;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ruf) : null;
        if (textView != null) {
            textView.setText(info.f229955a);
        }
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        java.lang.String str = info.f229956b;
        if (str != null) {
            android.widget.TextView e77 = e7();
            if (e77 != null) {
                e77.setVisibility(0);
            }
            android.widget.TextView e78 = e7();
            if (e78 != null) {
                e78.setText(str);
            }
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null && (e76 = e7()) != null) {
            e76.setVisibility(8);
        }
        android.widget.TextView c76 = c7();
        if (c76 != null) {
            c76.setTextColor(O6().getColor(info.f229960f));
        }
        android.widget.TextView c77 = c7();
        if (c77 != null) {
            c77.setText(info.f229957c);
        }
        java.lang.Integer num = info.f229958d;
        if (num != null) {
            int intValue = num.intValue();
            com.tencent.mm.ui.widget.imageview.WeImageView b77 = b7();
            if (b77 != null) {
                b77.setVisibility(0);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView b78 = b7();
            if (b78 != null) {
                b78.setImageResource(intValue);
                f0Var2 = f0Var3;
            }
        }
        if (f0Var2 == null && (b76 = b7()) != null) {
            b76.setVisibility(8);
        }
        android.view.View d76 = d7();
        if (d76 != null) {
            d76.setBackgroundResource(info.f229959e);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        r45.tm1 tm1Var;
        super.onLiveMsg(r71Var);
        if (r71Var == null || (tm1Var = (r45.tm1) r71Var.getCustom(43)) == null) {
            return;
        }
        i7(tm1Var);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        android.view.View d76 = d7();
        if (d76 != null) {
            d76.setOnClickListener(null);
        }
        android.view.View view = this.f229970m;
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.rud) : null;
        if (findViewById != null) {
            findViewById.setOnClickListener(null);
        }
        this.f229970m = null;
        this.f229971n = null;
        this.f229972o = null;
    }
}
