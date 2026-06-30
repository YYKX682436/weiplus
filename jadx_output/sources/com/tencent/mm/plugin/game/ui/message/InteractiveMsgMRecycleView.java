package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class InteractiveMsgMRecycleView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView {

    /* renamed from: f2, reason: collision with root package name */
    public android.content.Context f141493f2;

    /* renamed from: g2, reason: collision with root package name */
    public int f141494g2;

    /* renamed from: h2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.f0 f141495h2;

    /* renamed from: i2, reason: collision with root package name */
    public kk.j f141496i2;

    /* renamed from: j2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.j1 f141497j2;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f141498k2;

    /* renamed from: l2, reason: collision with root package name */
    public java.lang.String f141499l2;

    /* renamed from: m2, reason: collision with root package name */
    public java.lang.Runnable f141500m2;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f141501n2;

    /* renamed from: o2, reason: collision with root package name */
    public android.os.Handler f141502o2;

    /* renamed from: p2, reason: collision with root package name */
    public java.util.LinkedList f141503p2;

    /* renamed from: q2, reason: collision with root package name */
    public final java.util.Set f141504q2;

    /* renamed from: r2, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.IListenerMStorage f141505r2;

    public InteractiveMsgMRecycleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f141503p2 = new java.util.LinkedList();
        this.f141504q2 = new java.util.HashSet();
        this.f141505r2 = new com.tencent.mm.pluginsdk.event.IListenerMStorage() { // from class: com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.4
            @Override // com.tencent.mm.pluginsdk.event.IListenerMStorage
            public void c(com.tencent.mm.sdk.event.IEvent iEvent) {
                if (iEvent instanceof com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent) {
                    com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.this;
                    interactiveMsgMRecycleView.getClass();
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.ui.message.v(interactiveMsgMRecycleView));
                }
            }
        };
    }

    public static void l1(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView, java.lang.String str, boolean z17, int i17) {
        interactiveMsgMRecycleView.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.ui.message.z(interactiveMsgMRecycleView, str, z17, i17), "InteractiveMsg");
    }

    public static void m1(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView, android.widget.ImageView imageView, java.lang.String str, float f17) {
        if (!((lt0.f) interactiveMsgMRecycleView.f141496i2).k(str)) {
            interactiveMsgMRecycleView.s1(imageView, str, f17);
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) interactiveMsgMRecycleView.f141496i2).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            interactiveMsgMRecycleView.s1(imageView, str, f17);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static void n1(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView, android.widget.ImageView imageView, java.lang.String str) {
        if (!((lt0.f) interactiveMsgMRecycleView.f141496i2).k(str)) {
            interactiveMsgMRecycleView.s1(imageView, str, 0.0f);
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) interactiveMsgMRecycleView.f141496i2).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            interactiveMsgMRecycleView.s1(imageView, str, 0.0f);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static void q1(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView, java.lang.String str, int i17, java.lang.String str2, int i18, int i19) {
        interactiveMsgMRecycleView.getClass();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        p33.z zVar = new p33.z();
        p33.y yVar = new p33.y();
        yVar.f351668d = str;
        yVar.f351670f = str2;
        yVar.f351672h = i19;
        yVar.f351671g = i18;
        yVar.f351669e = i17;
        zVar.f351673d = yVar;
        lVar.f70664a = zVar;
        lVar.f70665b = new p33.b0();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/quickcontentinteract";
        lVar.f70667d = 1670;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.ui.message.b0(interactiveMsgMRecycleView, lVar));
    }

    public java.util.LinkedList<java.lang.String> getQuickReplyList() {
        return this.f141503p2;
    }

    public com.tencent.mm.plugin.game.ui.message.f0 getmAdapter() {
        return this.f141495h2;
    }

    public android.content.Context getmContext() {
        return this.f141493f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.pluginsdk.event.IListenerMStorage.d(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), this.f141505r2);
        com.tencent.mars.xlog.Log.i("MicroMsg.InteractiveMsgMRecycleView", "onAttachedToWindow");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.pluginsdk.event.IListenerMStorage.e(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), this.f141505r2);
        super.onDetachedFromWindow();
    }

    public final void s1(android.widget.ImageView imageView, java.lang.String str, float f17) {
        r53.v vVar = new r53.v();
        vVar.f392703a = false;
        vVar.f392709g = f17;
        r53.y.a().e(imageView, str, vVar.a(), new com.tencent.mm.plugin.game.ui.message.c0(this, str));
    }

    public void setFromMsgId(java.lang.String str) {
        this.f141499l2 = str;
    }

    public void setQuickReplyList(java.util.LinkedList<java.lang.String> linkedList) {
        this.f141503p2 = linkedList;
    }

    public void setmContext(android.content.Context context) {
        this.f141493f2 = context;
    }

    public void setmFromScene(int i17) {
        this.f141494g2 = i17;
        this.f141496i2 = new jt0.i(30, getClass());
        this.f141497j2 = new com.tencent.mm.plugin.game.ui.message.j1(i17, new com.tencent.mm.plugin.game.ui.message.t(this));
        android.content.Context context = getmContext();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.ui.message.y(this, context), "InteractiveMsg");
    }

    public void t1() {
        if (this.f141495h2 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.ui.message.w(this), "InteractiveMsg");
    }

    public InteractiveMsgMRecycleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f141503p2 = new java.util.LinkedList();
        this.f141504q2 = new java.util.HashSet();
        this.f141505r2 = new com.tencent.mm.pluginsdk.event.IListenerMStorage() { // from class: com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.4
            @Override // com.tencent.mm.pluginsdk.event.IListenerMStorage
            public void c(com.tencent.mm.sdk.event.IEvent iEvent) {
                if (iEvent instanceof com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent) {
                    com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.this;
                    interactiveMsgMRecycleView.getClass();
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.ui.message.v(interactiveMsgMRecycleView));
                }
            }
        };
    }
}
