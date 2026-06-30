package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class kw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f118860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118863g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nw f118864h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(az2.f fVar, int i17, int i18, java.lang.String str, com.tencent.mm.plugin.finder.live.widget.nw nwVar) {
        super(0);
        this.f118860d = fVar;
        this.f118861e = i17;
        this.f118862f = i18;
        this.f118863g = str;
        this.f118864h = nwVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f118860d.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switch role failed. errType ");
        sb6.append(this.f118861e);
        sb6.append(", errCode ");
        sb6.append(this.f118862f);
        sb6.append(", errMsg ");
        java.lang.String str = this.f118863g;
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("FinderLiveSwitchRoleDialog", sb6.toString());
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eib);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (str == null || str.length() == 0) {
            str = string;
        }
        db5.t7.f(this.f118864h.f118381d, str, com.tencent.mm.plugin.finder.live.widget.jw.f118784a);
        return jz5.f0.f302826a;
    }
}
