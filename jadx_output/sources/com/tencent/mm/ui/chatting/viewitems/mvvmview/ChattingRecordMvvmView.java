package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingRecordMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/b0;", "Lc11/f;", "f", "Lcom/tencent/mm/mvvm/MvvmView;", "getHolder", "()Lcom/tencent/mm/mvvm/MvvmView;", "setHolder", "(Lcom/tencent/mm/mvvm/MvvmView;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingRecordMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.b0> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.mvvm.MvvmView holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingRecordMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView v17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).v(context);
        setHolder(v17);
        return v17;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        z01.b0 b0Var = (z01.b0) pVar2;
        if (b0Var == null) {
            return;
        }
        c11.f fVar = new c11.f();
        java.lang.String str = b0Var.f468952d;
        if (str != null) {
            if (!(!r26.n0.N(str))) {
                str = null;
            }
            if (str != null) {
                fVar.f37835d = b0Var.f468952d;
            }
        }
        java.lang.String str2 = b0Var.f468953e;
        if (str2 != null) {
            if (!(!r26.n0.N(str2))) {
                str2 = null;
            }
            if (str2 != null) {
                fVar.f37837f = b0Var.f468953e;
                fVar.f37840i = null;
            }
        }
        int i17 = b0Var.f468954f;
        if (i17 != 0) {
            fVar.f37839h = i17;
        }
        a11.b bVar = new a11.b();
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.n3r);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        bVar.f501e = string;
        fVar.f37844p = bVar;
        getHolder().setViewModel(fVar);
        android.view.View.OnClickListener onClickListener = b0Var.f468955g;
        if (onClickListener != null) {
            setOnClickListener(onClickListener);
        }
        android.view.View.OnLongClickListener onLongClickListener = b0Var.f468956h;
        if (onLongClickListener != null) {
            setOnLongClickListener(onLongClickListener);
        }
        android.view.View.OnTouchListener onTouchListener = b0Var.f468957i;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
    }

    public final com.tencent.mm.mvvm.MvvmView<c11.f> getHolder() {
        com.tencent.mm.mvvm.MvvmView<c11.f> mvvmView = this.holder;
        if (mvvmView != null) {
            return mvvmView;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public final void setHolder(com.tencent.mm.mvvm.MvvmView<c11.f> mvvmView) {
        kotlin.jvm.internal.o.g(mvvmView, "<set-?>");
        this.holder = mvvmView;
    }

    public /* synthetic */ ChattingRecordMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingRecordMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
