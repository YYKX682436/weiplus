package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandFakeNativeMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingAppBrandFakeNativeMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.a> {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204609f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingAppBrandFakeNativeMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        this.f204609f = y17;
        return y17;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        java.lang.String str;
        java.lang.String B;
        java.lang.String str2;
        z01.a aVar = (z01.a) pVar2;
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f204609f;
        if (mvvmView == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (aVar != null) {
            c11.g gVar = new c11.g();
            android.content.Context context = mvvmView.getContext();
            s05.d dVar = aVar.f468928f;
            if (dVar == null || (str = dVar.y()) == null) {
                str = "";
            }
            java.lang.String str3 = aVar.f468927e;
            if (str3 == null) {
                str3 = "";
            }
            s05.a aVar2 = aVar.f468936q;
            if (aVar2 == null || (B = aVar2.j()) == null) {
                s05.d dVar2 = aVar.f468928f;
                B = dVar2 != null ? dVar2.B() : null;
                if (B == null) {
                    B = "";
                }
            }
            int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479672c9);
            gk0.k kVar = new gk0.k(h17, h17);
            kVar.f272433d = 0.5f;
            kVar.f272434e = com.tencent.mm.R.drawable.bhm;
            a11.b bVar = new a11.b();
            bVar.f503g = new af5.a(context, B, kVar, str3);
            gVar.f37855q = bVar;
            gVar.f37854p = aVar.f468931i;
            gVar.f37851m = null;
            s05.d dVar3 = aVar.f468928f;
            if (dVar3 == null || (str2 = dVar3.C()) == null) {
                str2 = "";
            }
            gVar.f37852n = str2;
            gVar.f37853o = aVar.f468929g;
            gVar.f37850i = l01.a.h();
            java.lang.String str4 = aVar.f468926d;
            if (str4 == null) {
                str4 = "";
            }
            gVar.f37845d = str4;
            java.lang.String str5 = aVar.f468930h;
            gVar.f37846e = str5 != null ? str5 : "";
            gVar.f37847f = aVar.f468932m;
            gVar.f37856r = new af5.b(aVar, str, context);
            mvvmView.setViewModel(gVar);
        }
    }

    public /* synthetic */ ChattingAppBrandFakeNativeMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingAppBrandFakeNativeMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
