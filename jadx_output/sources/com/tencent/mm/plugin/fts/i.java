package com.tencent.mm.plugin.fts;

/* loaded from: classes8.dex */
public class i implements com.tencent.mm.plugin.fts.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f137416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f137417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.n f137418c;

    public i(com.tencent.mm.plugin.fts.n nVar, android.widget.ImageView imageView, android.content.Context context) {
        this.f137418c = nVar;
        this.f137416a = imageView;
        this.f137417b = context;
    }

    public void a(com.tencent.mm.plugin.fts.k kVar, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.fts.n nVar = this.f137418c;
        nVar.f137776j.remove(str);
        if (z17) {
            android.graphics.Bitmap e17 = nVar.e(str);
            if (str.equals(this.f137416a.getTag())) {
                nVar.f137771e.post(new com.tencent.mm.plugin.fts.h(this, str, e17));
            }
        }
    }
}
