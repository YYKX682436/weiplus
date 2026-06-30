package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAlbumUI f129756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zi2 f129757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wt3.h0 f129758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f129759h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.lang.String str, com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI, r45.zi2 zi2Var, wt3.h0 h0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(2);
        this.f129755d = str;
        this.f129756e = finderAlbumUI;
        this.f129757f = zi2Var;
        this.f129758g = h0Var;
        this.f129759h = u3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("Finder.AlbumUI", "success:" + booleanValue + " , filePath:" + ((java.lang.String) obj2) + ", fileExist:" + o35.a.b(this.f129755d));
        pm0.v.X(new com.tencent.mm.plugin.finder.ui.q0(booleanValue, this.f129755d, this.f129756e, this.f129757f, this.f129758g, this.f129759h));
        return jz5.f0.f302826a;
    }
}
