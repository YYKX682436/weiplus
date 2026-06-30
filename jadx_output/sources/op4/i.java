package op4;

/* loaded from: classes.dex */
public final class i implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347288d;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f347285a = str;
        this.f347286b = str2;
        this.f347287c = str3;
        this.f347288d = str4;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.c1.k(new jz5.l("behaviour_session_id", this.f347285a), new jz5.l("finder_context_id", this.f347286b), new jz5.l("finder_tab_context_id", this.f347287c), new jz5.l("comment_scene", this.f347288d));
    }
}
