package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class jj implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRedDotTextView f132444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f132445c;

    public jj(java.lang.String str, com.tencent.mm.plugin.finder.view.FinderRedDotTextView finderRedDotTextView, int i17) {
        this.f132443a = str;
        this.f132444b = finderRedDotTextView;
        this.f132445c = i17;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "setImageDownloadListener iconUrl:" + this.f132443a + " success：" + z17);
        pm0.v.X(new com.tencent.mm.plugin.finder.view.ij(z17, this.f132444b, this.f132445c));
    }
}
