package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppMsgFinderNameCardMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingAppMsgFinderNameCardMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.d> {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204612f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingAppMsgFinderNameCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView r17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).r(context);
        this.f204612f = r17;
        return r17;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        android.view.View contentView;
        z01.d dVar = (z01.d) pVar2;
        c11.a aVar = new c11.a();
        if (dVar != null) {
            aVar.f37802f = dVar.f468980f;
            aVar.f37806m = dVar.f468981g;
            aVar.f37801e = new af5.g(this, dVar.f468979e);
            java.lang.String str = dVar.f468984m;
            if (str == null || str.length() == 0) {
                int i17 = dVar.f468982h;
                if (i17 != 0) {
                    aVar.f37804h = i17;
                    aVar.f37805i = dVar.f468983i;
                }
            } else {
                aVar.f37803g = new af5.h(str);
            }
            aVar.f37808o = getContext().getString(com.tencent.mm.R.string.eqw);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(dVar.f468978d);
            if (!(valueOf.intValue() != 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                com.tencent.mm.mvvm.MvvmView mvvmView = this.f204612f;
                if (mvvmView != null && (contentView = mvvmView.getContentView()) != null) {
                    contentView.setBackgroundResource(intValue);
                }
            }
            setOnClickListener(dVar.f468985n);
        }
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f204612f;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(aVar);
    }

    public /* synthetic */ ChattingAppMsgFinderNameCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingAppMsgFinderNameCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
