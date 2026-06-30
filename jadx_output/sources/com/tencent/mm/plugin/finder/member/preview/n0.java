package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f121258a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121259b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121260c;

    /* renamed from: d, reason: collision with root package name */
    public gx2.q f121261d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListFragment f121262e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f121263f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f121264g;

    public n0(androidx.appcompat.app.AppCompatActivity context, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f121258a = context;
        this.f121259b = i17;
        this.f121260c = i18;
        if (this.f121261d == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(i17);
            frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            this.f121263f = frameLayout;
            float k17 = (i65.a.k(context) + com.tencent.mm.ui.bk.p(context)) * kx2.a.f313278a.a(context);
            gx2.a aVar = new gx2.a();
            aVar.f277337c = k17;
            aVar.f277338d = new hx2.g(context, 0, 0, 0, false, false, 62, null);
            android.widget.FrameLayout frameLayout2 = this.f121263f;
            kotlin.jvm.internal.o.d(frameLayout2);
            aVar.f277339e = new hx2.c(frameLayout2);
            aVar.a(new com.tencent.mm.plugin.finder.member.preview.k0(this));
            ((java.util.ArrayList) aVar.f277343i).add(new com.tencent.mm.plugin.finder.member.preview.l0(this));
            aVar.f277340f = new hx2.b(context, true);
            android.view.View findViewById = context.findViewById(android.R.id.content);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            gx2.q b17 = aVar.b((android.view.ViewGroup) findViewById);
            this.f121261d = b17;
            b17.setContentReachTop(new com.tencent.mm.plugin.finder.member.preview.m0(this));
        }
        this.f121264g = "";
    }

    public final void a() {
        gx2.q qVar = this.f121261d;
        if (qVar != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, null, false, null, 15, null);
        }
    }

    public final void b(int i17, java.lang.String authorFinderUsername, java.lang.String memberTicket, com.tencent.mm.protobuf.g gVar, long j17, java.lang.String collectionName) {
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        kotlin.jvm.internal.o.g(memberTicket, "memberTicket");
        kotlin.jvm.internal.o.g(collectionName, "collectionName");
        androidx.fragment.app.i2 beginTransaction = this.f121258a.getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        if (this.f121262e == null || !kotlin.jvm.internal.o.b(this.f121264g, authorFinderUsername) || 0 != j17) {
            android.widget.FrameLayout frameLayout = this.f121263f;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.f121262e = new com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_author_finder_name", authorFinderUsername);
            bundle.putString("key_finder_member_ticket", memberTicket);
            bundle.putInt("key_finder_feed_count", i17);
            bundle.putInt("key_finder_member_feed_type", this.f121260c);
            bundle.putLong("key_member_topic_id", j17);
            bundle.putString("key_member_collection_name", collectionName);
            bundle.putByteArray("key_member_last_buffer", gVar != null ? gVar.g() : null);
            com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListFragment finderPreviewFeedListFragment = this.f121262e;
            kotlin.jvm.internal.o.d(finderPreviewFeedListFragment);
            finderPreviewFeedListFragment.setArguments(bundle);
            com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListFragment finderPreviewFeedListFragment2 = this.f121262e;
            kotlin.jvm.internal.o.d(finderPreviewFeedListFragment2);
            beginTransaction.k(this.f121259b, finderPreviewFeedListFragment2, null);
            beginTransaction.f();
        }
        gx2.q qVar = this.f121261d;
        if (qVar != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(qVar, false, 1, null);
        }
    }
}
