package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsEcsShareTailView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SnsEcsShareTailView extends android.widget.LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f167147f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f167148d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f167149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsEcsShareTailView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489502ep0, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        android.view.View findViewById = linearLayout.findViewById(com.tencent.mm.R.id.vch);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f167148d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = linearLayout.findViewById(com.tencent.mm.R.id.vcg);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f167149e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView r16, java.lang.String r17, r45.lh0 r18, java.lang.String r19, long r20) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView.a(com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView, java.lang.String, r45.lh0, java.lang.String, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        if (r2 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(r45.lh0 r11, boolean r12, java.lang.String r13, long r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView.b(r45.lh0, boolean, java.lang.String, long):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnsEcsShareTailView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnsEcsShareTailView(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
