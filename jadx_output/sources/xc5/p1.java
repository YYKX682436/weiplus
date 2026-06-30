package xc5;

/* loaded from: classes3.dex */
public final class p1 extends dg3.k {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f453549g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f453549g = jz5.h.b(xc5.o1.f453544d);
    }

    @Override // dg3.k
    public java.util.List W6(mf3.k info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new dg3.p(dg3.q.f232341e, com.tencent.mm.R.string.i29, com.tencent.mm.R.raw.icons_filled_share, java.lang.Integer.valueOf(com.tencent.mm.R.color.f478502m)));
        if (info.getType() == mf3.u.f326123e || info.getType() == mf3.u.f326125g) {
            arrayList.add(new dg3.p(dg3.q.f232343g, com.tencent.mm.R.string.hjg, com.tencent.mm.R.raw.bottomsheet_icon_fav, null));
        }
        return arrayList;
    }

    @Override // dg3.k
    public dg3.o X6(mf3.k info, mf3.p apiCenter) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        return new xc5.a2(info, apiCenter, new xc5.n1(this));
    }

    @Override // dg3.k
    public java.util.List Y6(mf3.k info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        dg3.q qVar = dg3.q.f232342f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.color.FG_0);
        arrayList.add(new dg3.p(qVar, com.tencent.mm.R.string.i8c, com.tencent.mm.R.raw.icons_outlined_download, valueOf));
        if (info.getType() == mf3.u.f326123e) {
            arrayList.add(new dg3.p(dg3.q.f232344h, com.tencent.mm.R.string.b2d, com.tencent.mm.R.raw.icons_outlined_pencil, valueOf));
            arrayList.add(new dg3.p(dg3.q.f232345i, com.tencent.mm.R.string.b2f, com.tencent.mm.R.raw.icons_outlined_translate, valueOf));
        }
        jz5.g gVar = this.f453549g;
        arrayList.add(new dg3.p(dg3.q.f232349p, com.tencent.mm.R.string.b2b, ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() ? com.tencent.mm.R.raw.icons_locate_to_chat_regular : com.tencent.mm.R.raw.icons_outlined_chats, valueOf));
        arrayList.add(new dg3.p(dg3.q.f232348o, ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() ? com.tencent.mm.R.string.o_2 : com.tencent.mm.R.string.n7s, ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() ? com.tencent.mm.R.raw.icons_gallery_regular : com.tencent.mm.R.raw.icons_filled_photowall, valueOf));
        return arrayList;
    }
}
