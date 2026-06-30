package com.tencent.mm.plugin.finder.lottery.card;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardGiftWidget;", "Landroid/widget/FrameLayout;", "Ljava/util/LinkedList;", "Lr45/wd4;", "h", "Ljz5/g;", "getDataList", "()Ljava/util/LinkedList;", "dataList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attribute", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "qn2/o", "qn2/p", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveLotteryCardGiftWidget extends android.widget.FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f120827i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f120828d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f120829e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f120830f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f120831g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g dataList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLotteryCardGiftWidget(android.content.Context context, android.util.AttributeSet attribute) {
        super(context, attribute);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attribute, "attribute");
        this.f120828d = "FinderLiveLotteryCardGiftWidget";
        this.dataList = jz5.h.b(qn2.q.f365134d);
        a();
    }

    private final java.util.LinkedList<r45.wd4> getDataList() {
        return (java.util.LinkedList) this.dataList.getValue();
    }

    public final void a() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.den, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f120829e = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.q68);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f120830f = findViewById;
        android.view.View view = this.f120829e;
        if (view == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.q6x);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f120831g = findViewById2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(r45.gz1 r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 2166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.lottery.card.FinderLiveLotteryCardGiftWidget.b(r45.gz1, java.util.List):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLotteryCardGiftWidget(android.content.Context context, android.util.AttributeSet attribute, int i17) {
        super(context, attribute, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attribute, "attribute");
        this.f120828d = "FinderLiveLotteryCardGiftWidget";
        this.dataList = jz5.h.b(qn2.q.f365134d);
        a();
    }
}
