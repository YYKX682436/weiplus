package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingLiteAppMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/r;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingLiteAppMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.r> {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204627f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingLiteAppMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView y17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).y(context);
        this.f204627f = y17;
        return y17;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        z01.r rVar = (z01.r) pVar2;
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f204627f;
        if (mvvmView == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (rVar != null) {
            c11.g gVar = new c11.g();
            java.lang.String str = rVar.f469145d;
            if (str == null) {
                str = "";
            }
            gVar.f37845d = str;
            java.lang.String str2 = rVar.f469146e;
            gVar.f37846e = str2 != null ? str2 : "";
            gVar.f37847f = rVar.f469147f;
            gVar.f37848g = rVar.f469148g;
            a11.b bVar = new a11.b();
            bVar.f503g = rVar.f469153o;
            gVar.f37855q = bVar;
            gVar.f37854p = rVar.f469154p ? null : rVar.f469149h;
            android.view.View.OnClickListener onClickListener = rVar.f469155q;
            if (onClickListener != null) {
                setOnClickListener(onClickListener);
            }
            mvvmView.setViewModel(gVar);
        }
    }

    public /* synthetic */ ChattingLiteAppMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingLiteAppMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
