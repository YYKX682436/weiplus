package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderLiveMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/o;", "Laf5/y;", "f", "Laf5/y;", "getHolder", "()Laf5/y;", "setHolder", "(Laf5/y;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingFinderLiveMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.o> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public af5.y holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingFinderLiveMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489457cn0, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        af5.y yVar = new af5.y(inflate);
        setHolder(yVar);
        return yVar.f4656a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0408  */
    @Override // com.tencent.mm.mvvm.MvvmView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(q31.p r26, q31.p r27) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFinderLiveMvvmView.e(q31.p, q31.p):void");
    }

    public final af5.y getHolder() {
        af5.y yVar = this.holder;
        if (yVar != null) {
            return yVar;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public final void setHolder(af5.y yVar) {
        kotlin.jvm.internal.o.g(yVar, "<set-?>");
        this.holder = yVar;
    }

    public /* synthetic */ ChattingFinderLiveMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingFinderLiveMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
