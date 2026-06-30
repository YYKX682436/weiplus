package my2;

/* loaded from: classes3.dex */
public final class y extends ie2.a implements my2.b {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f332774g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f332775h;

    /* renamed from: i, reason: collision with root package name */
    public final my2.a f332776i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f332777m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, android.view.View root, com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout, com.tencent.mm.ui.MMActivity activity, my2.a aVar) {
        super(root, frameBubbleContentLayout);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f332774g = z17;
        this.f332775h = activity;
        this.f332776i = aVar;
        u().setTag(java.lang.Float.valueOf(1.0f));
    }

    public final void A(android.os.Bundle bundle) {
        java.lang.String str;
        android.widget.TextView B = B();
        if (B != null) {
            if (bundle == null || (str = bundle.getString("currentCountDownText")) == null) {
                str = "";
            }
            B.setText(str);
        }
        android.view.View t17 = t(com.tencent.mm.R.id.fqf);
        if (t17 != null) {
            t17.setOnClickListener(new my2.v(this));
        }
    }

    public final android.widget.TextView B() {
        android.view.View t17 = t(com.tencent.mm.R.id.cjn);
        if (t17 instanceof android.widget.TextView) {
            return (android.widget.TextView) t17;
        }
        return null;
    }

    public void C(boolean z17) {
        if (z17 != this.f332777m) {
            com.tencent.mars.xlog.Log.i("FinderLiveVoteBubbleViewCallback", "needResize :" + z17);
        }
        this.f332777m = z17;
        android.view.View t17 = t(com.tencent.mm.R.id.p8g);
        android.widget.ImageView imageView = t17 instanceof android.widget.ImageView ? (android.widget.ImageView) t17 : null;
        boolean z18 = false;
        if (imageView != null && imageView.getVisibility() == 0) {
            z18 = true;
        }
        if (z18) {
            E();
        }
    }

    public final android.os.Bundle D() {
        android.os.Bundle bundle = new android.os.Bundle();
        android.widget.TextView B = B();
        bundle.putString("currentCountDownText", java.lang.String.valueOf(B != null ? B.getText() : null));
        return bundle;
    }

    public final void E() {
        float f17 = this.f332777m ? 0.8f : 1.0f;
        android.view.View u17 = u();
        if (kotlin.jvm.internal.o.b(u17.getTag(), java.lang.Float.valueOf(f17))) {
            com.tencent.mars.xlog.Log.i("FinderLiveVoteBubbleViewCallback", "updateRootViewSize fail, scale:" + f17 + ",width:" + u17.getLayoutParams().width);
            return;
        }
        u17.setTag(java.lang.Float.valueOf(f17));
        com.tencent.mars.xlog.Log.i("FinderLiveVoteBubbleViewCallback", "updateRootViewSize scale:" + f17);
        u17.post(new my2.x(u17, f17));
    }

    public void F(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("FinderLiveVoteBubbleViewCallback", "showBubbleFinish");
        android.widget.TextView B = B();
        if (B != null) {
            B.setText(u().getContext().getResources().getString(com.tencent.mm.R.string.f491882ej0));
        }
        callback.invoke();
    }

    public void G(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("FinderLiveVoteBubbleViewCallback", "showPrepareVote");
        com.tencent.mars.xlog.Log.i("FinderLiveVoteBubbleViewCallback", "reset");
        E();
        android.widget.TextView B = B();
        if (B != null) {
            B.setText(u().getContext().getResources().getString(com.tencent.mm.R.string.f491883ej1));
        }
        callback.invoke();
    }

    @Override // ie2.h
    public android.os.Bundle a() {
        return D();
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f332775h;
    }

    @Override // ie2.h
    public void j() {
    }

    @Override // ie2.h
    public void l(android.os.Bundle bundle) {
        A(bundle);
        android.widget.TextView B = B();
        if (B != null) {
            B.setBackgroundResource(com.tencent.mm.R.drawable.f481738a53);
        }
    }

    @Override // ie2.h
    public android.os.Bundle o() {
        return D();
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        A(bundle);
    }

    @Override // ie2.a
    public java.lang.String v() {
        return "FinderLiveVoteBubbleViewCallback";
    }
}
