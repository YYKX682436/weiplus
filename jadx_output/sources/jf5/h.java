package jf5;

/* loaded from: classes14.dex */
public final class h implements jf5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f299457a;

    /* renamed from: b, reason: collision with root package name */
    public final jf5.m0 f299458b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f299459c;

    /* renamed from: d, reason: collision with root package name */
    public rl5.r f299460d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299461e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f299462f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f299463g;

    public h(android.content.Context context, jf5.m0 m0Var, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f299457a = context;
        this.f299458b = m0Var;
        this.f299459c = lVar;
    }

    public final void a() {
        rl5.r rVar = this.f299460d;
        if (rVar == null) {
            return;
        }
        this.f299460d = null;
        this.f299461e = null;
        this.f299462f = true;
        rVar.a();
    }

    public void b(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host, int i17, java.lang.String selectedText) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(selectedText, "selectedText");
        jf5.m0 m0Var = this.f299458b;
        if (i17 != 1) {
            if (i17 == 2) {
                host.q(cf5.f.f40968e);
                java.lang.Runnable runnable = host.V;
                if (this.f299459c == null) {
                    host.B = true;
                    host.G = false;
                    host.removeCallbacks(runnable);
                    host.k();
                    host.y();
                    host.post(new jf5.v(host));
                } else {
                    host.B = true;
                    host.G = false;
                    host.removeCallbacks(runnable);
                    host.k();
                    host.y();
                    host.post(new jf5.w(host));
                }
            } else if (i17 != 3) {
                if (i17 != 4) {
                    if (i17 == 5 && (!r26.n0.N(selectedText))) {
                        host.q(cf5.f.f40971h);
                        if (m0Var != null) {
                            m0Var.f(host, selectedText);
                        }
                    }
                } else if (!r26.n0.N(selectedText)) {
                    host.q(cf5.f.f40970g);
                    if (m0Var != null) {
                        m0Var.h(selectedText);
                    }
                }
            } else if (!r26.n0.N(selectedText)) {
                host.q(cf5.f.f40969f);
                if (m0Var != null) {
                    m0Var.g(selectedText);
                }
            }
        } else if (!r26.n0.N(selectedText)) {
            host.q(cf5.f.f40967d);
            if (m0Var != null) {
                m0Var.a(selectedText);
            }
        }
        if (i17 == 1 || i17 == 4 || i17 == 6) {
            host.d(jf5.o0.f299492g);
        }
    }
}
