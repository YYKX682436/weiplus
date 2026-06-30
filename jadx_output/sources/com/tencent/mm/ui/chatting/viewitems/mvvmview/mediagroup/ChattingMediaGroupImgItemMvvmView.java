package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupImgItemMvvmView;", "Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupBaseItemMvvmView;", "Lb11/b;", "Landroid/graphics/Bitmap;", "getBitmap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ChattingMediaGroupImgItemMvvmView extends com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView<b11.b> {

    /* renamed from: m, reason: collision with root package name */
    public em.s f204704m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f204705n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f204706o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingMediaGroupImgItemMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView
    public android.view.View g(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488583e24, (android.view.ViewGroup) this, false);
        this.f204704m = new em.s(inflate);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView
    public android.graphics.Bitmap getBitmap() {
        em.s sVar = this.f204704m;
        if (sVar == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.graphics.drawable.Drawable drawable = sVar.a().getDrawable();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 == true) goto L14;
     */
    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(b11.a r18, b11.a r19) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupImgItemMvvmView.j(b11.a, b11.a):void");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView
    public void k(boolean z17) {
        this.isTopView = z17;
        em.s sVar = this.f204704m;
        if (sVar != null) {
            sVar.a().setImportantForAccessibility(z17 ? 1 : 2);
        } else {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        if ((r7.f322633a > 0) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(b11.b r21) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupImgItemMvvmView.n(b11.b):void");
    }

    public /* synthetic */ ChattingMediaGroupImgItemMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingMediaGroupImgItemMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f204706o = "";
    }
}
