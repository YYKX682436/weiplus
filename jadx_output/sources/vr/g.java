package vr;

/* loaded from: classes5.dex */
public final class g implements sk.e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f439403a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f439404b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.ChatFooterPanel f439405c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.j6 f439406d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.k0 f439407e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f439408f;

    public g(android.content.Context context, com.tencent.mm.ui.widget.MMWebView mMWebView, com.tencent.mm.pluginsdk.ui.ChatFooterPanel emoticonPanel, com.tencent.mm.pluginsdk.ui.chat.j6 j6Var, com.tencent.mm.pluginsdk.ui.k0 k0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(emoticonPanel, "emoticonPanel");
        this.f439403a = context;
        this.f439404b = mMWebView;
        this.f439405c = emoticonPanel;
        this.f439406d = j6Var;
        this.f439407e = k0Var;
    }

    public static final float a(vr.g gVar) {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        android.content.Context context = gVar.f439403a;
        if ((context instanceof android.app.Activity ? (android.app.Activity) context : null) != null && (mMWebView = gVar.f439404b) != null) {
            return mMWebView.getMMDensity();
        }
        return j65.f.f();
    }
}
