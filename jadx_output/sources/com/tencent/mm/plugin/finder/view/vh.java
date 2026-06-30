package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class vh implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f133243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostTextModifyView f133244b;

    public vh(java.util.List list, com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView) {
        this.f133243a = list;
        this.f133244b = finderPostTextModifyView;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        java.util.Iterator it = this.f133243a.iterator();
        while (it.hasNext()) {
            this.f133244b.i((so2.n6) it.next());
        }
    }
}
