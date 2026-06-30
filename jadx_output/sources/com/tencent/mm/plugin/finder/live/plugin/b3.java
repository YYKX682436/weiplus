package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class b3 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f111965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f111966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111967c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f111968d;

    public b3(android.widget.ImageView imageView, int i17, java.lang.String str, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        this.f111965a = imageView;
        this.f111966b = i17;
        this.f111967c = str;
        this.f111968d = v3Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.a3((android.graphics.Bitmap) obj, this.f111965a, this.f111966b, this.f111967c, this.f111968d));
    }
}
