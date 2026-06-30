package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class l extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f207540m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f207541n;

    public l(android.content.Context context, java.lang.String str, java.lang.String str2) {
        super(context);
        this.f207540m = null;
        this.f207541n = null;
        this.f207540m = str;
        this.f207541n = str2;
        f();
    }

    @Override // s35.b
    public void a() {
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.f488587xx;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bk9);
        view.setOnClickListener(new com.tencent.mm.ui.conversation.banner.k(this));
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        imageView.setImageBitmap(com.tencent.mm.modelavatar.g.b(this.f207540m, true, -1, null));
    }
}
