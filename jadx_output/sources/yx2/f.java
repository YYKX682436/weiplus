package yx2;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f467842a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f467843b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f467844c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f467845d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f467846e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f467847f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f467848g;

    public f(android.widget.ImageView avatarView, android.widget.TextView authorNameView, android.widget.TextView finderDesc, android.widget.LinearLayout avatarFl, android.widget.FrameLayout jumpFinderViewFl) {
        kotlin.jvm.internal.o.g(avatarView, "avatarView");
        kotlin.jvm.internal.o.g(authorNameView, "authorNameView");
        kotlin.jvm.internal.o.g(finderDesc, "finderDesc");
        kotlin.jvm.internal.o.g(avatarFl, "avatarFl");
        kotlin.jvm.internal.o.g(jumpFinderViewFl, "jumpFinderViewFl");
        this.f467842a = avatarView;
        this.f467843b = authorNameView;
        this.f467844c = finderDesc;
        this.f467845d = avatarFl;
        this.f467846e = jumpFinderViewFl;
        android.content.Context context = avatarView.getContext();
        this.f467847f = context;
        avatarFl.setOnClickListener(new yx2.a(this));
        jumpFinderViewFl.setOnClickListener(new yx2.b(this));
        jumpFinderViewFl.setContentDescription(i65.a.r(context, com.tencent.mm.R.string.j9w));
    }

    public final void a() {
        this.f467842a.setVisibility(4);
        this.f467843b.setVisibility(4);
        this.f467844c.setVisibility(4);
        this.f467845d.setVisibility(4);
    }

    public final void b() {
        android.content.Context context = this.f467847f;
        kotlin.jvm.internal.o.f(context, "context");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f467848g;
        intent.putExtra("feed_object_id", finderObject != null ? java.lang.Long.valueOf(finderObject.getId()) : null);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f467848g;
        intent.putExtra("feed_object_nonceId", finderObject2 != null ? finderObject2.getObjectNonceId() : null);
        intent.putExtra("key_need_related_list", false);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = this.f467848g;
        if (finderObject3 != null) {
            com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
            intent.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(n7Var.h(com.tencent.mm.plugin.finder.assist.n7.j(n7Var, com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject3, 0), false, null, 4, null)), null, null));
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 25, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(ya2.e1.f460472a, context, intent, false, 4, null);
        ((ee0.r4) ((fe0.m4) i95.n0.c(fe0.m4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReportSnsCoverActionStruct", "com.tencent.mm.feature.sns.SnsReportHelperService");
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.f(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportSnsCoverActionStruct", "com.tencent.mm.feature.sns.SnsReportHelperService");
    }

    public final void c(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.lang.String avatarUrl;
        this.f467848g = finderObject;
        if (finderObject != null) {
            this.f467846e.setVisibility(0);
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
            ya2.b2 h17 = contact != null ? ya2.d.h(contact, null, false, 3, null) : null;
            this.f467843b.post(new yx2.c(finderObject, h17, this));
            this.f467844c.post(new yx2.d(this, finderObject));
            r45.f1 b17 = hc2.g0.b(finderObject);
            if (b17 == null || (avatarUrl = b17.getString(1)) == null) {
                avatarUrl = h17 != null ? h17.getAvatarUrl() : "";
            }
            this.f467842a.post(new yx2.e(avatarUrl, this));
        }
    }
}
