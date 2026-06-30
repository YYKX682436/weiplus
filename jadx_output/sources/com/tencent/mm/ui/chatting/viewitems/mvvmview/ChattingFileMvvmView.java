package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFileMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/m;", "Lem/l;", "f", "Lem/l;", "getHolder", "()Lem/l;", "setHolder", "(Lem/l;)V", "holder", "Lem/p;", "g", "Lem/p;", "getSourceHolder", "()Lem/p;", "setSourceHolder", "(Lem/p;)V", "sourceHolder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingFileMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.m> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public em.l holder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public em.p sourceHolder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingFileMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e0v, (android.view.ViewGroup) this, false);
        em.l lVar = new em.l(inflate);
        setHolder(lVar);
        setSourceHolder(new em.p(lVar.e()));
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ab, code lost:
    
        if (r14 != 2) goto L54;
     */
    @Override // com.tencent.mm.mvvm.MvvmView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(q31.p r14, q31.p r15) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFileMvvmView.e(q31.p, q31.p):void");
    }

    public final void g() {
        getHolder().d().setVisibility(8);
        getHolder().j().setHasPause(true);
        getHolder().j().setVisibility(0);
    }

    public final em.l getHolder() {
        em.l lVar = this.holder;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public final em.p getSourceHolder() {
        em.p pVar = this.sourceHolder;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.o.o("sourceHolder");
        throw null;
    }

    public final void setHolder(em.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.holder = lVar;
    }

    public final void setSourceHolder(em.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<set-?>");
        this.sourceHolder = pVar;
    }

    public /* synthetic */ ChattingFileMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingFileMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
