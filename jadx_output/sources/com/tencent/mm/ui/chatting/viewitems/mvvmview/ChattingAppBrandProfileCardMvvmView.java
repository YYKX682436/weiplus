package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandProfileCardMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingAppBrandProfileCardMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.b> {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204611f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingAppBrandProfileCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        this.f204611f = r17;
        return r17;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        java.lang.String str;
        java.lang.String B;
        jz5.f0 f0Var;
        z01.b bVar = (z01.b) pVar2;
        if (bVar != null) {
            s05.d dVar = bVar.f468947g;
            if (dVar == null || (str = dVar.y()) == null) {
                str = "";
            }
            com.tencent.mm.mvvm.MvvmView mvvmView = this.f204611f;
            if (mvvmView == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            android.content.Context context = mvvmView.getContext();
            c11.a aVar = new c11.a();
            java.lang.String str2 = bVar.f468946f;
            java.lang.String str3 = str2 != null ? str2 : "";
            int i17 = bVar.f468949i;
            int i18 = 0;
            boolean z17 = i17 > 1;
            boolean z18 = i17 == 2;
            int i19 = bVar.f468948h;
            if (i19 != 0) {
                aVar.f37800d = i19;
            }
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str);
            java.lang.String str4 = Bi != null ? Bi.field_nickname : bVar.f468944d;
            if (Bi != null) {
                B = Bi.field_smallHeadURL;
            } else {
                s05.d dVar2 = bVar.f468947g;
                B = dVar2 != null ? dVar2.B() : null;
            }
            aVar.f37801e = new af5.e(str, B, bVar);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            aVar.f37802f = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str4);
            if (z18) {
                i18 = com.tencent.mm.R.drawable.c6t;
            } else if (z17) {
                i18 = com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.drawable.c6s : com.tencent.mm.R.drawable.c6r;
            }
            aVar.f37804h = i18;
            aVar.f37806m = str3;
            aVar.f37808o = context.getResources().getString(com.tencent.mm.R.string.n8d);
            android.view.View.OnClickListener onClickListener = bVar.f468950m;
            if (onClickListener != null) {
                setOnClickListener(onClickListener);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                setOnClickListener(new af5.f(bVar, str, context));
            }
            com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f204611f;
            if (mvvmView2 != null) {
                mvvmView2.setViewModel(aVar);
            } else {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
        }
    }

    public /* synthetic */ ChattingAppBrandProfileCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingAppBrandProfileCardMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
