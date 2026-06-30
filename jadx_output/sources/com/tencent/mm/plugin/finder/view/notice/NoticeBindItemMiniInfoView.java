package com.tencent.mm.plugin.finder.view.notice;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/NoticeBindItemMiniInfoView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NoticeBindItemMiniInfoView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f132729d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f132730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeBindItemMiniInfoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488944aw3, this);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.ewc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f132729d = textView;
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.f484608ew4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f132730e = (android.widget.TextView) findViewById2;
        hc2.o.a(textView, true);
        com.tencent.mm.ui.bk.t0(textView.getPaint());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView r25, r45.h32 r26, boolean r27, boolean r28, boolean r29, int r30, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView.a(com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView, r45.h32, boolean, boolean, boolean, int, java.lang.Object):boolean");
    }
}
