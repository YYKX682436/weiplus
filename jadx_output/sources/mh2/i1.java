package mh2;

/* loaded from: classes10.dex */
public final class i1 extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final ah2.f f326372c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.content.Context context, android.view.ViewGroup root, ah2.f contentService) {
        super(context, root);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(contentService, "contentService");
        this.f326372c = contentService;
    }

    @Override // mh2.a
    public int a() {
        return com.tencent.mm.R.layout.e_v;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        kotlin.jvm.internal.o.g(singState, "singState");
        this.f326372c.b(new mh2.h1(this));
    }
}
